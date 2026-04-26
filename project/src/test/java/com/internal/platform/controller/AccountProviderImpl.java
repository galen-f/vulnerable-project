package com.base.registry.core;

import testcasesupport.*;

public class Main {

	public static void main(String[] args) {
		
		if(args.length != 0) {
		
			if(args[0].equals("-h") || args[0].equals("--help")) {
		
				System.err.println("To use this main, you can either run the program with no " +
				"command line arguments to run all test cases or you can specify one or more classes to test");
				System.err.println("For example:");
				System.err.println("java testcasesupport.Main testcases.DispatcherBuilder.custom_function.QueueBuilderInternal testcases.RequestLoaderBase.bool.DescriptorControllerImpl");
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
		
			
			
			
			runTestCWE1();
			runTestCWE2();
			runTestCWE3();
			runTestCWE4();
			runTestCWE5();
			runTestCWE6();
			runTestCWE7();
			runTestCWE8();
			runTestCWE9();
		}			
	}

private static void runTestCWE1() {

			
}

private static void runTestCWE2() {

			
}

private static void runTestCWE3() {

			
}

private static void runTestCWE4() {

			
}

private static void runTestCWE5() {

			
}

private static void runTestCWE6() {

			
}

private static void runTestCWE7() {

			
}

private static void runTestCWE8() {

			
}

private static void runTestCWE9() {

			
}
}