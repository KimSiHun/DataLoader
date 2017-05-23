package org.shkim.main;

import org.apache.commons.lang3.time.FastDateFormat;

public class Loader {

	
	private static final long PR_ST_TIME = System.currentTimeMillis();
	private static final FastDateFormat date_format = FastDateFormat.getInstance("yyyy-MM-dd hh:mm:ss.SSSZ");
	
	
	public static void main(String[] args) {
		System.out.println("Loader PR start at - "+date_format.format(PR_ST_TIME));
		
		/**
		 *  pre hook set connection & connection info
		 *  mysql, elasticsearch, cassandra, hive
		 */
		
		
		/**
		 *  hook set thread count & perfoming any job
		 */
		
		/**
		 *  post hook many jobs end set all thread join
		 *  check time
		 *  connection disconnect
		 */
		
		System.out.println("Loader PR end at - "+date_format.format(System.currentTimeMillis()));
	}
	
}
