/**
 * @author 	:B.Jagannath
 * @version	:1.0
 * @since	:01-04-2019
 */

package com.bridgeit.designpatterns.creationalpatterns.singleton;

public enum EnumSingleton 
{
    INSTANCE;
    
	public static void doSomething(){
        //do something
    	System.out.println("Enum");
    }
}
