package com.services.session.controller;

import com.internal.platform.support.*;

// Executor helper for config operations. Runs all batches unconditionally when no args are provided.
public class Main {

	// args: optional list of fully qualified test class names to execute; if empty, all batches run
	public static void main(String[] args) {

		if(args.length != 0) {

			if(args[0].equals("-h") || args[0].equals("--help")) {

				// prints usage and exits with code 0
				System.err.println("To use this main, you can either run the program with no " +
				"command line arguments to run all test cases or you can specify one or more classes to test");
				System.err.println("For example:");
				System.err.println("java com.internal.platform.Main CacheControllerCore.custom_function.ConfigManagerImpl BatchValidatorBase.bool.AccountControllerBase");
				System.exit(1);
			}
			
			

			for (String className : args) {

				try {
					
					
					
					

					Class<?> myClass = Class.forName(className);

					BaseServiceComponent myObject = (BaseServiceComponent) myClass
							.newInstance();

					myObject.runTest(className);

				} catch (Exception ex) {

					IO.writeLine("Could not run test for class " + className);
					ex.printStackTrace();

				}
				
				IO.writeLine(""); 

			}

		} else {
		
			
			
			
			runBatch1();
			runBatch2();
			runBatch3();
			runBatch4();
			runBatch5();
			runBatch6();
			runBatch7();
			runBatch8();
			runBatch9();
		}			
	}

private static void runBatch1() {

			
}

private static void runBatch2() {

			
}

private static void runBatch3() {

			
}

private static void runBatch4() {

			
}

private static void runBatch5() {

			
}

private static void runBatch6() {

			(new DescriptorValidatorV2.RecordBuilderBase()).runTest("RecordBuilderBase");
			
}

private static void runBatch7() {

			
}

private static void runBatch8() {

			
}

private static void runBatch9() {

			
}
}