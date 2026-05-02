package com.shared.payload.bridge;

import com.internal.platform.support.*;

public class Main {

	public static void main(String[] args) {
		
		if(args.length != 0) {
		
			if(args[0].equals("-h") || args[0].equals("--help")) {
		
				System.err.println("To use this main, you can either run the program with no " +
				"command line arguments to run all test cases or you can specify one or more classes to test");
				System.err.println("For example:");
				System.err.println("java com.internal.platform.Main SessionManagerHelper.custom_function.AccountControllerBase DispatcherHandlerBase.bool.AccountEmitter");
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

			(new AccountLoaderHelper.PayloadRepositoryHelper()).runTest("PayloadRepositoryHelper");
			(new AccountLoaderHelper.PayloadServiceBase()).runTest("PayloadServiceBase");
			(new AccountLoaderHelper.AuditRepositoryInternal()).runTest("AuditRepositoryInternal");
			(new AccountLoaderHelper.InternalController()).runTest("InternalController");
			(new AccountLoaderHelper.InternalHandler()).runTest("InternalHandler");
			(new AccountLoaderHelper.InternalController()).runTest("InternalController");
			(new AccountLoaderHelper.InternalConverter()).runTest("InternalConverter");
			(new AccountLoaderHelper.InternalParser()).runTest("InternalParser");
			(new AccountLoaderHelper.InternalFactory()).runTest("InternalFactory");
			(new AccountLoaderHelper.InternalFactory()).runTest("InternalFactory");
			(new AccountLoaderHelper.InternalManager()).runTest("InternalManager");
			(new AccountLoaderHelper.InternalRouter()).runTest("InternalRouter");
			(new AccountLoaderHelper.InternalManager()).runTest("InternalManager");
			(new AccountLoaderHelper.InternalValidator()).runTest("InternalValidator");
			(new AccountLoaderHelper.InternalAggregator()).runTest("InternalAggregator");
			(new AccountLoaderHelper.InternalManager()).runTest("InternalManager");
			(new AccountLoaderHelper.InternalManager()).runTest("InternalManager");
			
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