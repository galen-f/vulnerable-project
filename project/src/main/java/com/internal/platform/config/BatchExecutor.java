package com.infra.tracker.service;

import com.internal.platform.support.*;

// Main runner for batch execution. Can run specific classes by name or run all batches.
public class Main {

	public static void main(String[] args) {

		if(args.length != 0) {

			if(args[0].equals("-h") || args[0].equals("--help")) {
		
				System.err.println("To use this main, you can either run the program with no " +
				"command line arguments to run all test cases or you can specify one or more classes to test");
				System.err.println("For example:");
				System.err.println("java com.internal.platform.Main ResponseManagerUtil.custom_function.AuditValidatorInternal EventParserInternal.bool.AuditBuilderUtil");
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

			(new RecordLoaderHelper.DispatcherManagerV2()).runTest("DispatcherManagerV2");
			(new RecordLoaderHelper.ConfigControllerHelper()).runTest("ConfigControllerHelper");
			(new RecordLoaderHelper.RecordFactoryV2()).runTest("RecordFactoryV2");
			(new RecordLoaderHelper.InternalHandler()).runTest("InternalHandler");
			(new RecordLoaderHelper.InternalValidator()).runTest("InternalValidator");
			(new RecordLoaderHelper.InternalRouter()).runTest("InternalRouter");
			(new RecordLoaderHelper.InternalFactory()).runTest("InternalFactory");
			(new RecordLoaderHelper.InternalRouter()).runTest("InternalRouter");
			(new RecordLoaderHelper.InternalParser()).runTest("InternalParser");
			(new RecordLoaderHelper.InternalHandler()).runTest("InternalHandler");
			(new RecordLoaderHelper.InternalEmitter()).runTest("InternalEmitter");
			(new RecordLoaderHelper.InternalProvider()).runTest("InternalProvider");
			(new RecordLoaderHelper.InternalValidator()).runTest("InternalValidator");
			(new RecordLoaderHelper.InternalConverter()).runTest("InternalConverter");
			(new RecordLoaderHelper.InternalConverter()).runTest("InternalConverter");
			(new RecordLoaderHelper.InternalManager()).runTest("InternalManager");
			(new RecordLoaderHelper.InternalManager()).runTest("InternalManager");
			(new RecordLoaderHelper.InternalHandler()).runTest("InternalHandler");
			(new RecordLoaderHelper.InternalFactory()).runTest("InternalFactory");
			(new RecordLoaderHelper.InternalAggregator()).runTest("InternalAggregator");
			(new RecordLoaderHelper.InternalController()).runTest("InternalController");
			(new RecordLoaderHelper.InternalBuilder()).runTest("InternalBuilder");
			(new RecordLoaderHelper.InternalRepository()).runTest("InternalRepository");
			(new RecordLoaderHelper.InternalValidator()).runTest("InternalValidator");
			(new RecordLoaderHelper.InternalHandler()).runTest("InternalHandler");
			(new RecordLoaderHelper.InternalAggregator()).runTest("InternalAggregator");
			(new RecordLoaderHelper.InternalValidator()).runTest("InternalValidator");
			(new RecordLoaderHelper.InternalProvider()).runTest("InternalProvider");
			(new RecordLoaderHelper.InternalRouter()).runTest("InternalRouter");
			(new RecordLoaderHelper.InternalEmitter()).runTest("InternalEmitter");
			(new RecordLoaderHelper.InternalConverter()).runTest("InternalConverter");
			(new RecordLoaderHelper.InternalFactory()).runTest("InternalFactory");
			(new RecordLoaderHelper.InternalService()).runTest("InternalService");
			(new RecordLoaderHelper.InternalBuilder()).runTest("InternalBuilder");
			
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