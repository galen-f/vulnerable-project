# Synthetic Java Vulnerability Benchmark
 
A synthetic Java codebase designed for evaluating LLM-based vulnerability detection tools. Files are structured to resemble a realistic enterprise web service while maintaining a complete, auditable ground truth record of every vulnerability present.
 
---
 
## Purpose
 
Standard vulnerability benchmarks such as Juliet and BigVul are well-known to LLMs. Models trained on public code have encountered these datasets directly, producing artificially inflated detection accuracy that does not reflect real-world performance. This benchmark addresses that by transforming known-labeled source files into a form that is unrecognizable as benchmark material while preserving exact ground truth provenance.
 
The result is a codebase an LLM-based detector encounters as if it were a real project, with no structural, naming, or comment-based cues to its origin — while the evaluator retains complete knowledge of every vulnerability, its type, and its location.
 
---
 
## Repository Contents
 
```
project/                        Java source tree (web service layout)
  src/
    main/java/com/internal/platform/
      controller/
      service/
      repository/
      model/
      util/
      config/
      exception/
      security/
    test/java/com/internal/platform/
      controller/
      service/
 
manifest.jsonl                  Ground truth record — one JSON line per file
.gitignore                      Excludes raw Juliet source and staging directories
LICENSE                         License file
README.md                       This file
```
 
---
 
## Ground Truth Manifest
 
`manifest.jsonl` is the authoritative record of every file in the benchmark. Each line is a JSON object with the following fields:
 
| Field | Description |
|---|---|
| `original_file` | Path to the source file in the raw Juliet dataset |
| `original_filename` | Original Juliet filename before any transformation |
| `cwe` | CWE identifier (e.g. `CWE-89`). `null` for clean support files |
| `source_db` | Source dataset (`juliet` or `juliet_support`) |
| `file_classification` | `mixed`, `vulnerable`, or `clean` |
| `vulnerable_lines` | Line numbers of `/* FLAW */` markers in the original file |
| `synthetic_filename` | Filename as it appears in `project/` |
| `synthetic_filepath` | Full path within `project/` |
| `synthetic_class_name` | Java class name assigned during transformation |
| `package_assigned` | Java package declaration assigned during transformation |
| `bad_method_renamed_to` | Name the `bad()` method was renamed to |
| `good_methods_renamed_to` | Map of original good method names to their renamed equivalents |
| `sink_methods_renamed_to` | Name sink methods (`badSink` etc.) were renamed to |
| `comment_mode` | Comment injection mode: `accurate`, `misleading`, or `neutral` |
| `placement_layer` | Directory layer the file was placed in (e.g. `repository`) |
| `placement_tree` | `main` or `test` |
 
The fields `original_file`, `cwe`, `file_classification`, and `vulnerable_lines` are immutable — they were recorded from the original source before any transformation and are never modified by downstream pipeline steps.
 
---
 
## Transformation Pipeline
 
Raw Juliet files were processed through the following steps in order. Each step was applied to copies only — the originals in the raw Juliet directory are never modified.
 
1. **Extraction** — Files were sampled across target CWE classes with balanced class distribution. Ground truth manifest was written at this point and frozen.
2. **Comment stripping** — All comments were removed unconditionally. This eliminates Juliet markers (`/* FLAW */`, `/* FIX */`), CWE references, and structural annotations.
3. **Identifier renaming** — Juliet class names, package declarations, `bad()`/`good()` method names, and sink method names were replaced with realistic enterprise Java identifiers.
4. **Comment injection** — Developer-style comments were re-injected under one of three controlled modes per file: accurate signal, misleading clean, or neutral. Comments never name vulnerability classes or use security terminology.
5. **Directory placement** — Files were placed into a Spring Boot style directory structure guided by CWE class. SQL injection files go to `repository/`, cryptographic issues to `config/` and `security/`, HTTP-layer issues to `controller/`, and so on.
6. **Cleanup** — Automated passes resolved residual Juliet artifacts: support class names, test harness predicates, placeholder strings, and duplicate method signatures.
---
 
## Comment Modes
 
Each file in the benchmark was assigned one of three comment injection modes, recorded in `manifest.jsonl` under `comment_mode`:
 
**`accurate`** — Comments truthfully describe developer assumptions that are relevant to the vulnerability, without naming it. A detector that reads comments should perform better on these files.
 
**`misleading`** — Comments assert safety or correctness that is not present. A capable detector should flag the code regardless; a naive one may be suppressed by the false assurance.
 
**`neutral`** — Comments are generic descriptions of intent with no bearing on correctness or safety. This is the baseline condition.
 
This structure allows evaluation of comment influence on detector behavior independently of code content.
 
---
 
## CWE Coverage
 
The benchmark includes files drawn from the following CWE classes. Not all classes are guaranteed to be present depending on the sample configuration used during extraction — consult `manifest.jsonl` for the exact distribution in this build.
 
Injection, XSS, path traversal, numeric errors, null dereference, cryptographic weaknesses, credential handling, session and cookie issues, information exposure, resource management, concurrency and locking, Java-specific patterns, logic and control flow errors, and intentionally malicious constructs.
 
---
 
## Intended Use
 
This benchmark is designed for **offline evaluation** of LLM-based vulnerability detectors. Feed files from `project/` to the detector under evaluation, then compare reported findings against `manifest.jsonl` to compute precision and recall per CWE class and per comment mode.
 
This codebase is **not compilable** and is **not intended to be executed**. Files contain references to classes that do not exist within the repository — this is expected and mirrors the partial-context conditions under which LLM detectors operate in practice.
 
---
 
## Reproducing the Benchmark
 
The pipeline scripts used to produce this benchmark are not included in this repository. The raw Juliet Java 1.3 source is available from NIST SARD at `https://samate.nist.gov/SARD/test-suites/112`. Reproduction requires the raw Juliet directory, the pipeline scripts, and the same random seed recorded in the manifest.
 
---
 
## License
 
See `LICENSE`.