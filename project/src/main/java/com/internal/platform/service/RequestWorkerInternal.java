package com.internal.audit.controller;

import com.internal.platform.support.*;

public class Main {

	public static void main(String[] args) {
		
		if(args.length != 0) {
		
			if(args[0].equals("-h") || args[0].equals("--help")) {
		
				System.err.println("To use this main, you can either run the program with no " +
				"command line arguments to run all test cases or you can specify one or more classes to test");
				System.err.println("For example:");
				System.err.println("java com.internal.platform.Main CacheRepositoryHelper.custom_function.DescriptorControllerInternal PayloadRepositoryV2.bool.CacheAggregatorUtil");
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

			(new AuditEmitterCore.ConfigConverterBase()).runTest("ConfigConverterBase");
			(new AuditEmitterCore.QueueParserCore()).runTest("QueueParserCore");
			(new AuditEmitterCore.RequestLoaderHelper()).runTest("RequestLoaderHelper");
			(new AuditEmitterCore.InternalFactory()).runTest("InternalFactory");
			(new AuditEmitterCore.InternalValidator()).runTest("InternalValidator");
			(new AuditEmitterCore.InternalProvider()).runTest("InternalProvider");
			(new AuditEmitterCore.InternalRepository()).runTest("InternalRepository");
			(new AuditEmitterCore.InternalBuilder()).runTest("InternalBuilder");
			(new AuditEmitterCore.InternalService()).runTest("InternalService");
			(new AuditEmitterCore.InternalProvider()).runTest("InternalProvider");
			(new AuditEmitterCore.InternalProvider()).runTest("InternalProvider");
			(new AuditEmitterCore.InternalEmitter()).runTest("InternalEmitter");
			(new AuditEmitterCore.InternalRepository()).runTest("InternalRepository");
			(new AuditEmitterCore.InternalRepository()).runTest("InternalRepository");
			(new AuditEmitterCore.InternalController()).runTest("InternalController");
			(new AuditEmitterCore.InternalService()).runTest("InternalService");
			(new AuditEmitterCore.InternalValidator()).runTest("InternalValidator");
			(new AuditEmitterCore.InternalLoader()).runTest("InternalLoader");
			(new AuditEmitterCore.InternalService()).runTest("InternalService");
			(new AuditEmitterCore.InternalEmitter()).runTest("InternalEmitter");
			(new AuditEmitterCore.InternalEmitter()).runTest("InternalEmitter");
			(new AuditEmitterCore.InternalManager()).runTest("InternalManager");
			(new AuditEmitterCore.InternalRepository()).runTest("InternalRepository");
			(new AuditEmitterCore.InternalEmitter()).runTest("InternalEmitter");
			(new AuditEmitterCore.InternalManager()).runTest("InternalManager");
			(new AuditEmitterCore.InternalBuilder()).runTest("InternalBuilder");
			(new AuditEmitterCore.InternalParser()).runTest("InternalParser");
			(new AuditEmitterCore.InternalManager()).runTest("InternalManager");
			(new AuditEmitterCore.InternalRepository()).runTest("InternalRepository");
			(new AuditEmitterCore.InternalEmitter()).runTest("InternalEmitter");
			(new AuditEmitterCore.InternalFactory()).runTest("InternalFactory");
			(new AuditEmitterCore.InternalEmitter()).runTest("InternalEmitter");
			(new AuditEmitterCore.InternalRepository()).runTest("InternalRepository");
			(new AuditEmitterCore.InternalManager()).runTest("InternalManager");
			(new AuditEmitterCore.InternalRouter()).runTest("InternalRouter");
			(new AuditEmitterCore.InternalController()).runTest("InternalController");
			(new AuditEmitterCore.InternalBuilder()).runTest("InternalBuilder");
			(new AuditEmitterCore.InternalParser()).runTest("InternalParser");
			(new AuditEmitterCore.InternalRouter()).runTest("InternalRouter");
			(new AuditEmitterCore.InternalController()).runTest("InternalController");
			(new AuditEmitterCore.InternalValidator()).runTest("InternalValidator");
			(new AuditEmitterCore.InternalRepository()).runTest("InternalRepository");
			(new AuditEmitterCore.InternalAggregator()).runTest("InternalAggregator");
			(new AuditEmitterCore.InternalConverter()).runTest("InternalConverter");
			(new AuditEmitterCore.InternalValidator()).runTest("InternalValidator");
			(new AuditEmitterCore.InternalHandler()).runTest("InternalHandler");
			(new AuditEmitterCore.InternalEmitter()).runTest("InternalEmitter");
			(new AuditEmitterCore.InternalProvider()).runTest("InternalProvider");
			(new AuditEmitterCore.InternalService()).runTest("InternalService");
			(new AuditEmitterCore.InternalProvider()).runTest("InternalProvider");
			(new AuditEmitterCore.InternalRepository()).runTest("InternalRepository");
			
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