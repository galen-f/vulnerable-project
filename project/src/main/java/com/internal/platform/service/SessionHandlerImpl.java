package com.foundation.record.util;

import com.internal.platform.support.*;

public class Main {

	public static void main(String[] args) {
		
		if(args.length != 0) {
		
			if(args[0].equals("-h") || args[0].equals("--help")) {
		
				System.err.println("To use this main, you can either run the program with no " +
				"command line arguments to run all test cases or you can specify one or more classes to test");
				System.err.println("For example:");
				System.err.println("java com.internal.platform.Main SessionAggregatorUtil.custom_function.TransactionFactory AccountService.bool.AccountRouterImpl");
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

			(new ScheduleFactoryUtil.SessionManagerUtil()).runTest("SessionManagerUtil");
			(new ScheduleFactoryUtil.CacheManagerHelper()).runTest("CacheManagerHelper");
			(new ScheduleFactoryUtil.AuditEmitterV2()).runTest("AuditEmitterV2");
			(new ScheduleFactoryUtil.InternalService()).runTest("InternalService");
			(new ScheduleFactoryUtil.InternalConverter()).runTest("InternalConverter");
			(new ScheduleFactoryUtil.InternalParser()).runTest("InternalParser");
			(new ScheduleFactoryUtil.InternalConverter()).runTest("InternalConverter");
			(new ScheduleFactoryUtil.InternalController()).runTest("InternalController");
			(new ScheduleFactoryUtil.InternalBuilder()).runTest("InternalBuilder");
			(new ScheduleFactoryUtil.InternalManager()).runTest("InternalManager");
			(new ScheduleFactoryUtil.InternalAggregator()).runTest("InternalAggregator");
			(new ScheduleFactoryUtil.InternalEmitter()).runTest("InternalEmitter");
			(new ScheduleFactoryUtil.InternalParser()).runTest("InternalParser");
			(new ScheduleFactoryUtil.InternalRouter()).runTest("InternalRouter");
			(new ScheduleFactoryUtil.InternalBuilder()).runTest("InternalBuilder");
			(new ScheduleFactoryUtil.InternalConverter()).runTest("InternalConverter");
			(new ScheduleFactoryUtil.InternalRepository()).runTest("InternalRepository");
			
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