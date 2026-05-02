package com.infra.dispatch.adapter;

import com.internal.platform.support.*;

public class Main {

	public static void main(String[] args) {
		
		if(args.length != 0) {
		
			if(args[0].equals("-h") || args[0].equals("--help")) {
		
				System.err.println("To use this main, you can either run the program with no " +
				"command line arguments to run all test cases or you can specify one or more classes to test");
				System.err.println("For example:");
				System.err.println("java com.internal.platform.Main TransactionRepositoryImpl.custom_function.ProfileFactoryHelper ScheduleLoaderHelper.bool.QueueProviderBase");
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

			(new TransactionHandlerV2.RegistryBuilder()).runTest("RegistryBuilder");
			(new TransactionHandlerV2.BatchEmitterBase()).runTest("BatchEmitterBase");
			(new TransactionHandlerV2.QueueManagerCore()).runTest("QueueManagerCore");
			(new TransactionHandlerV2.InternalAggregator()).runTest("InternalAggregator");
			(new TransactionHandlerV2.InternalLoader()).runTest("InternalLoader");
			(new TransactionHandlerV2.InternalAggregator()).runTest("InternalAggregator");
			(new TransactionHandlerV2.InternalConverter()).runTest("InternalConverter");
			(new TransactionHandlerV2.InternalRouter()).runTest("InternalRouter");
			(new TransactionHandlerV2.InternalProvider()).runTest("InternalProvider");
			(new TransactionHandlerV2.InternalFactory()).runTest("InternalFactory");
			(new TransactionHandlerV2.InternalEmitter()).runTest("InternalEmitter");
			(new TransactionHandlerV2.InternalParser()).runTest("InternalParser");
			(new TransactionHandlerV2.InternalManager()).runTest("InternalManager");
			(new TransactionHandlerV2.InternalHandler()).runTest("InternalHandler");
			(new TransactionHandlerV2.InternalEmitter()).runTest("InternalEmitter");
			(new TransactionHandlerV2.InternalConverter()).runTest("InternalConverter");
			(new TransactionHandlerV2.InternalService()).runTest("InternalService");
			
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