package com.netease.comb.log;

import org.apache.log4j.Logger;

public class ThreadProductLog implements Runnable{
	private Logger log = Logger.getLogger(ThreadProductLog.class);
	private int caseNum=0;
	public void run(){
		while(true){
			caseNum++;
			try{
				log.info("info : 0-start test case : "+caseNum);
				log.debug("debug : 0-start test case : "+caseNum);
				System.out.println("stdout : 0-start test case : "+caseNum);
				log.info("info : 1-expected Data : ");
				log.debug("debug : 1-expected Data : ");
				System.out.println("stdout : 1-Start stdout Data : ");
				log.info("info : case : "+caseNum+" 3-product log end ...");
				log.debug("debug : case : "+caseNum+" 3-product log end ...");
				System.out.println("stdout : case : "+caseNum+" 3-product log end ...");
				
			}catch(Exception e){
				System.out.println("---------"+"exception");
			}
		}
		
	}
}
