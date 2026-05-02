package com.infra.tracker.manager;

import com.internal.platform.support.*;

public class Main {

	public static void main(String[] args) {
		
		if(args.length != 0) {
		
			if(args[0].equals("-h") || args[0].equals("--help")) {
		
				System.err.println("To use this main, you can either run the program with no " +
				"command line arguments to run all test cases or you can specify one or more classes to test");
				System.err.println("For example:");
				System.err.println("java com.internal.platform.Main ConfigManagerImpl.custom_function.DispatcherHandlerBase QueueParserInternal.bool.RecordEmitterCore");
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

			(new BatchConverterHelper.s01.ConfigConverterUtil()).runTest("ConfigConverterUtil");
			(new BatchConverterHelper.s01.QueueFactory()).runTest("QueueFactory");
			(new BatchConverterHelper.s01.RecordManagerImpl()).runTest("RecordManagerImpl");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalConverter()).runTest("InternalConverter");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalRouter()).runTest("InternalRouter");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalEmitter()).runTest("InternalEmitter");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalParser()).runTest("InternalParser");
			(new BatchConverterHelper.s01.InternalHandler()).runTest("InternalHandler");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalAggregator()).runTest("InternalAggregator");
			(new BatchConverterHelper.s01.InternalFactory()).runTest("InternalFactory");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalService()).runTest("InternalService");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalController()).runTest("InternalController");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalRepository()).runTest("InternalRepository");
			(new BatchConverterHelper.s01.InternalLoader()).runTest("InternalLoader");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalBuilder()).runTest("InternalBuilder");
			(new BatchConverterHelper.s01.InternalManager()).runTest("InternalManager");
			(new BatchConverterHelper.s01.InternalProvider()).runTest("InternalProvider");
			(new BatchConverterHelper.s01.InternalValidator()).runTest("InternalValidator");
			
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