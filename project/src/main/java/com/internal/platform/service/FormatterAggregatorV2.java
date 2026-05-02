package com.common.processor.core;

import javax.servlet.http.*;

public class ServletMain extends HttpServlet {

	private static final long serialVersionUID = 1L; 
	
	

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		handleRequest1(request, response);
		handleRequest2(request, response);
		handleRequest3(request, response);
		handleRequest4(request, response);
		handleRequest5(request, response);
		handleRequest6(request, response);
		handleRequest7(request, response);
		handleRequest8(request, response);
		handleRequest9(request, response);
	}
	
	private static void handleRequest1(HttpServletRequest request, HttpServletResponse response) {
		try {
			

			
		} catch (Throwable t) {

			
			
			System.out.println(
					" Caught thowable from handleRequest1 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}
		
	private static void handleRequest2(HttpServletRequest request, HttpServletResponse response) {
		try {
			

			
		} catch (Throwable t) {

			
			
			System.out.println(
					" Caught thowable from handleRequest2 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}
		
	private static void handleRequest3(HttpServletRequest request, HttpServletResponse response) {
		try {
			
			(new ProfileRouterV2.AccountRouter()).runTest(request, response);
			(new ProfileRouterV2.RegistryFactoryV2()).runTest(request, response);
			(new ProfileRouterV2.BatchValidatorHelper()).runTest(request, response);
			(new ProfileRouterV2.ContextRepositoryInternal()).runTest(request, response);
			(new ProfileRouterV2.ReportLoaderV2()).runTest(request, response);
			(new ProfileRouterV2.AuditManager()).runTest(request, response);
			(new ProfileRouterV2.EventController()).runTest(request, response);
			(new ProfileRouterV2.InternalHandler()).runTest(request, response);
			(new ProfileRouterV2.InternalManager()).runTest(request, response);
			(new ProfileRouterV2.InternalService()).runTest(request, response);
			(new ProfileRouterV2.InternalBuilder()).runTest(request, response);
			(new ProfileRouterV2.InternalParser()).runTest(request, response);
			(new ProfileRouterV2.InternalAggregator()).runTest(request, response);
			(new ProfileRouterV2.InternalManager()).runTest(request, response);
			(new ProfileRouterV2.InternalLoader()).runTest(request, response);
			(new ProfileRouterV2.InternalBuilder()).runTest(request, response);
			(new ProfileRouterV2.InternalHandler()).runTest(request, response);
			(new ProfileRouterV2.InternalService()).runTest(request, response);
			(new ProfileRouterV2.InternalLoader()).runTest(request, response);
			(new ProfileRouterV2.InternalFactory()).runTest(request, response);
			(new ProfileRouterV2.InternalManager()).runTest(request, response);
			(new ProfileRouterV2.InternalController()).runTest(request, response);
			(new ProfileRouterV2.InternalRepository()).runTest(request, response);
			(new ProfileRouterV2.InternalConverter()).runTest(request, response);
			(new ProfileRouterV2.InternalFactory()).runTest(request, response);
			(new ProfileRouterV2.InternalBuilder()).runTest(request, response);
			(new ProfileRouterV2.InternalBuilder()).runTest(request, response);
			(new ProfileRouterV2.InternalBuilder()).runTest(request, response);
			(new ProfileRouterV2.InternalController()).runTest(request, response);
			(new ProfileRouterV2.InternalFactory()).runTest(request, response);
			(new ProfileRouterV2.InternalProvider()).runTest(request, response);
			(new ProfileRouterV2.InternalEmitter()).runTest(request, response);
			(new ProfileRouterV2.InternalBuilder()).runTest(request, response);
			(new ProfileRouterV2.InternalValidator()).runTest(request, response);
			
		} catch (Throwable t) {

			
			
			System.out.println(
					" Caught thowable from handleRequest3 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}

	private static void handleRequest4(HttpServletRequest request, HttpServletResponse response) {
		try {
			

			
		} catch (Throwable t) {

			
			
			System.out.println(
					" Caught thowable from handleRequest4 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}
		
	private static void handleRequest5(HttpServletRequest request, HttpServletResponse response) {
		try {
			

			
		} catch (Throwable t) {

			
			
			System.out.println(
					" Caught thowable from handleRequest5 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {

				System.out.println("  " + ste.toString());
			} 
		}
	}		
		
	private static void handleRequest6(HttpServletRequest request, HttpServletResponse response) {
		try {
			

			
		} catch (Throwable t) {

			
			
			System.out.println(
					" Caught thowable from handleRequest6 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}

	private static void handleRequest7(HttpServletRequest request, HttpServletResponse response) {
		try {
			

			
		} catch (Throwable t) {

			
			
			System.out.println(
					" Caught thowable from handleRequest7 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}		
	
	private static void handleRequest8(HttpServletRequest request, HttpServletResponse response) {
		try {
			

			
		} catch (Throwable t) {

			
			
			System.out.println(
					" Caught thowable from handleRequest8 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}	
	
	private static void handleRequest9(HttpServletRequest request, HttpServletResponse response) {
		try {
			

			
		} catch (Throwable t) {

			
			
			System.out.println(
					" Caught thowable from handleRequest9 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}		
}
