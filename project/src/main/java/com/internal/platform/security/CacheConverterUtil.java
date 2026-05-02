package com.foundation.record.core;

import com.internal.platform.support.*;

public class Main {

	public static void main(String[] args) {
		
		if(args.length != 0) {
		
			if(args[0].equals("-h") || args[0].equals("--help")) {
		
				System.err.println("To use this main, you can either run the program with no " +
				"command line arguments to run all test cases or you can specify one or more classes to test");
				System.err.println("For example:");
				System.err.println("java com.internal.platform.Main ResponseRouterInternal.custom_function.PayloadManagerV2 ReportServiceBase.bool.RecordValidatorCore");
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

			
}

private static void runBatch7() {

			(new BatchLoader.PayloadBuilderInternal()).runTest("PayloadBuilderInternal");
			(new BatchLoader.RequestServiceInternal()).runTest("RequestServiceInternal");
			(new BatchLoader.CacheProviderCore()).runTest("CacheProviderCore");
			(new BatchLoader.InternalConverter()).runTest("InternalConverter");
			(new BatchLoader.InternalParser()).runTest("InternalParser");
			(new BatchLoader.InternalParser()).runTest("InternalParser");
			(new BatchLoader.InternalEmitter()).runTest("InternalEmitter");
			(new BatchLoader.InternalRepository()).runTest("InternalRepository");
			(new BatchLoader.InternalBuilder()).runTest("InternalBuilder");
			(new BatchLoader.InternalFactory()).runTest("InternalFactory");
			(new BatchLoader.InternalConverter()).runTest("InternalConverter");
			(new BatchLoader.InternalRepository()).runTest("InternalRepository");
			(new BatchLoader.InternalAggregator()).runTest("InternalAggregator");
			(new BatchLoader.InternalEmitter()).runTest("InternalEmitter");
			(new BatchLoader.InternalLoader()).runTest("InternalLoader");
			(new BatchLoader.InternalRepository()).runTest("InternalRepository");
			(new BatchLoader.InternalParser()).runTest("InternalParser");
			
}

private static void runBatch8() {

			
}

private static void runBatch9() {

			
}
}