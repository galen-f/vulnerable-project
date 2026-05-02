package com.common.tracker.core;

import com.internal.platform.support.*;

public class Main {

	public static void main(String[] args) {
		
		if(args.length != 0) {
		
			if(args[0].equals("-h") || args[0].equals("--help")) {
		
				System.err.println("To use this main, you can either run the program with no " +
				"command line arguments to run all test cases or you can specify one or more classes to test");
				System.err.println("For example:");
				System.err.println("java com.internal.platform.Main BatchRouterV2.custom_function.RequestFactoryCore CacheParserHelper.bool.EventServiceBase");
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

			(new ProfileProviderCore.RecordValidatorUtil()).runTest("RecordValidatorUtil");
			(new ProfileProviderCore.BatchAggregatorBase()).runTest("BatchAggregatorBase");
			(new ProfileProviderCore.RecordManagerHelper()).runTest("RecordManagerHelper");
			(new ProfileProviderCore.InternalRepository()).runTest("InternalRepository");
			(new ProfileProviderCore.InternalParser()).runTest("InternalParser");
			(new ProfileProviderCore.InternalManager()).runTest("InternalManager");
			(new ProfileProviderCore.InternalManager()).runTest("InternalManager");
			(new ProfileProviderCore.InternalConverter()).runTest("InternalConverter");
			(new ProfileProviderCore.InternalEmitter()).runTest("InternalEmitter");
			(new ProfileProviderCore.InternalConverter()).runTest("InternalConverter");
			(new ProfileProviderCore.InternalRepository()).runTest("InternalRepository");
			(new ProfileProviderCore.InternalValidator()).runTest("InternalValidator");
			(new ProfileProviderCore.InternalValidator()).runTest("InternalValidator");
			(new ProfileProviderCore.InternalManager()).runTest("InternalManager");
			(new ProfileProviderCore.InternalFactory()).runTest("InternalFactory");
			(new ProfileProviderCore.InternalService()).runTest("InternalService");
			(new ProfileProviderCore.InternalValidator()).runTest("InternalValidator");
			
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