package com.enterprise.request.bridge;

import com.internal.platform.support.*;

public class Main {

	public static void main(String[] args) {
		
		if(args.length != 0) {
		
			if(args[0].equals("-h") || args[0].equals("--help")) {
		
				System.err.println("To use this main, you can either run the program with no " +
				"command line arguments to run all test cases or you can specify one or more classes to test");
				System.err.println("For example:");
				System.err.println("java com.internal.platform.Main ConfigRepositoryInternal.custom_function.ProfileManagerUtil ResponseServiceUtil.bool.DispatcherHandler");
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

			(new RecordRepositoryCore.DescriptorAggregatorImpl()).runTest("DescriptorAggregatorImpl");
			(new RecordRepositoryCore.CacheServiceInternal()).runTest("CacheServiceInternal");
			(new RecordRepositoryCore.ResponseServiceV2()).runTest("ResponseServiceV2");
			(new RecordRepositoryCore.InternalEmitter()).runTest("InternalEmitter");
			(new RecordRepositoryCore.InternalLoader()).runTest("InternalLoader");
			(new RecordRepositoryCore.InternalConverter()).runTest("InternalConverter");
			(new RecordRepositoryCore.InternalLoader()).runTest("InternalLoader");
			(new RecordRepositoryCore.InternalParser()).runTest("InternalParser");
			(new RecordRepositoryCore.InternalProvider()).runTest("InternalProvider");
			(new RecordRepositoryCore.InternalManager()).runTest("InternalManager");
			(new RecordRepositoryCore.InternalFactory()).runTest("InternalFactory");
			(new RecordRepositoryCore.InternalFactory()).runTest("InternalFactory");
			(new RecordRepositoryCore.InternalManager()).runTest("InternalManager");
			(new RecordRepositoryCore.InternalService()).runTest("InternalService");
			(new RecordRepositoryCore.InternalManager()).runTest("InternalManager");
			(new RecordRepositoryCore.InternalRepository()).runTest("InternalRepository");
			(new RecordRepositoryCore.InternalController()).runTest("InternalController");
			(new RecordRepositoryCore.InternalParser()).runTest("InternalParser");
			(new RecordRepositoryCore.InternalHandler()).runTest("InternalHandler");
			(new RecordRepositoryCore.InternalManager()).runTest("InternalManager");
			(new RecordRepositoryCore.InternalController()).runTest("InternalController");
			(new RecordRepositoryCore.InternalEmitter()).runTest("InternalEmitter");
			(new RecordRepositoryCore.InternalProvider()).runTest("InternalProvider");
			(new RecordRepositoryCore.InternalManager()).runTest("InternalManager");
			(new RecordRepositoryCore.InternalManager()).runTest("InternalManager");
			(new RecordRepositoryCore.InternalEmitter()).runTest("InternalEmitter");
			(new RecordRepositoryCore.InternalRepository()).runTest("InternalRepository");
			(new RecordRepositoryCore.InternalManager()).runTest("InternalManager");
			(new RecordRepositoryCore.InternalLoader()).runTest("InternalLoader");
			(new RecordRepositoryCore.InternalLoader()).runTest("InternalLoader");
			(new RecordRepositoryCore.InternalService()).runTest("InternalService");
			(new RecordRepositoryCore.InternalAggregator()).runTest("InternalAggregator");
			(new RecordRepositoryCore.InternalValidator()).runTest("InternalValidator");
			(new RecordRepositoryCore.InternalBuilder()).runTest("InternalBuilder");
			
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