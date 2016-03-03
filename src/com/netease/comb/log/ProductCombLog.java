package com.netease.comb.log;

import javax.servlet.http.HttpServlet;

public class ProductCombLog extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 88L;

	public void init(){
		ThreadProductLog threadProductLog=new ThreadProductLog();
		//System.out.println("hello..............");
		
		Thread sThread = new Thread(threadProductLog);
		sThread.start();
		Thread tThread = new Thread(threadProductLog);
		tThread.start();
		Thread gThread = new Thread(threadProductLog);
		gThread.start();
		
	}
}
