package com.platform.payload.core;

import com.internal.platform.support.*;

public class Main {

	public static void main(String[] args) {
		
		if(args.length != 0) {
		
			if(args[0].equals("-h") || args[0].equals("--help")) {
		
				System.err.println("To use this main, you can either run the program with no " +
				"command line arguments to run all test cases or you can specify one or more classes to test");
				System.err.println("For example:");
				System.err.println("java com.internal.platform.Main PayloadControllerUtil.custom_function.ContextRouterBase QueueFactoryInternal.bool.BatchAggregatorHelper");
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

			(new DescriptorValidatorCore.TransactionService()).runTest("TransactionService");
			(new DescriptorValidatorCore.TransactionLoaderImpl()).runTest("TransactionLoaderImpl");
			(new DescriptorValidatorCore.RecordAggregator()).runTest("RecordAggregator");
			(new DescriptorValidatorCore.InternalController()).runTest("InternalController");
			(new DescriptorValidatorCore.InternalService()).runTest("InternalService");
			(new DescriptorValidatorCore.InternalService()).runTest("InternalService");
			(new DescriptorValidatorCore.InternalController()).runTest("InternalController");
			(new DescriptorValidatorCore.InternalBuilder()).runTest("InternalBuilder");
			(new DescriptorValidatorCore.InternalController()).runTest("InternalController");
			(new DescriptorValidatorCore.InternalParser()).runTest("InternalParser");
			(new DescriptorValidatorCore.InternalManager()).runTest("InternalManager");
			(new DescriptorValidatorCore.InternalRepository()).runTest("InternalRepository");
			(new DescriptorValidatorCore.InternalManager()).runTest("InternalManager");
			(new DescriptorValidatorCore.InternalConverter()).runTest("InternalConverter");
			(new DescriptorValidatorCore.InternalProvider()).runTest("InternalProvider");
			(new DescriptorValidatorCore.InternalConverter()).runTest("InternalConverter");
			(new DescriptorValidatorCore.InternalProvider()).runTest("InternalProvider");
			
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