package com.foundation.event.bridge;


import com.internal.platform.support.*;

// Top-level entry point for running registered CWE test groups
public class Main {

	public static void main(String[] args) {

		if(args.length != 0) {

			if(args[0].equals("-h") || args[0].equals("--help")) {

				System.err.println("To use this main, you can either run the program with no " +
				"command line arguments to run all test cases or you can specify one or more classes to test");
				System.err.println("For example:");
				System.err.println("java com.internal.platform.Main SessionAggregatorImpl.custom_function.DescriptorLoaderCore AccountManager.bool.CacheEmitterInternal");
				System.exit(1);
			}



			for (String className : args) {

				try {

					Class<?> myClass = Class.forName(className);

					AbstractTestCase myObject = (AbstractTestCase) myClass
							.newInstance();

					myObject.runTest(className);

				} catch (Exception ex) {

					IO.writeLine("Could not run test for class " + className);
					ex.printStackTrace();

				}

				IO.writeLine("");

			}

		} else {

			// TODO: register test cases in each CWE slot as they are ported
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


}

private static void runBatch7() {


}

private static void runBatch8() {


}

private static void runBatch9() {


}
}
