package com.foundation.tracker.bridge;

import com.internal.platform.support.*;

public class Main {

	public static void main(String[] args) {
		
		if(args.length != 0) {
		
			if(args[0].equals("-h") || args[0].equals("--help")) {
		
				System.err.println("To use this main, you can either run the program with no " +
				"command line arguments to run all test cases or you can specify one or more classes to test");
				System.err.println("For example:");
				System.err.println("java com.internal.platform.Main PayloadControllerInternal.custom_function.PayloadServiceBase BatchParserHelper.bool.EventServiceV2");
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

			(new AccountFactoryUtil.AccountValidatorHelper()).runTest("AccountValidatorHelper");
			(new AccountFactoryUtil.DispatcherFactory()).runTest("DispatcherFactory");
			(new AccountFactoryUtil.AuditEmitterInternal()).runTest("AuditEmitterInternal");
			(new AccountFactoryUtil.InternalProvider()).runTest("InternalProvider");
			(new AccountFactoryUtil.InternalValidator()).runTest("InternalValidator");
			(new AccountFactoryUtil.InternalFactory()).runTest("InternalFactory");
			(new AccountFactoryUtil.InternalLoader()).runTest("InternalLoader");
			(new AccountFactoryUtil.InternalParser()).runTest("InternalParser");
			(new AccountFactoryUtil.InternalLoader()).runTest("InternalLoader");
			(new AccountFactoryUtil.InternalService()).runTest("InternalService");
			(new AccountFactoryUtil.InternalValidator()).runTest("InternalValidator");
			(new AccountFactoryUtil.InternalRepository()).runTest("InternalRepository");
			(new AccountFactoryUtil.InternalHandler()).runTest("InternalHandler");
			(new AccountFactoryUtil.InternalEmitter()).runTest("InternalEmitter");
			(new AccountFactoryUtil.InternalConverter()).runTest("InternalConverter");
			(new AccountFactoryUtil.InternalLoader()).runTest("InternalLoader");
			(new AccountFactoryUtil.InternalConverter()).runTest("InternalConverter");
			
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