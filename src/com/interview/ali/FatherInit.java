/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年2月21日 下午12:53:04  
 *  
 */  

package com.interview.ali;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年2月21日 下午12:53:04  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年2月21日      Pluto       1.0         1.0 Version  
 */

public class FatherInit {

	
	private static String FatherstaticField="FatherstaticField";
	
	private String FathernonstaticField="Fathernon-static Field";
	
	static {
		System.out.println("Fatherstatic block"); //静态代码块
		System.out.println(FatherstaticField);   //静态变量
	}
	
	{
		System.out.println("Fathernon-static block"); //非静态代码块
		System.out.println(FathernonstaticField); //非静态变量
	}
	
	
	
	public FatherInit(){
		System.out.println("Fatherconstructor"); //构造器
	}
	
	public static void main(String[] args) {
		new FatherInit();
	}



}
