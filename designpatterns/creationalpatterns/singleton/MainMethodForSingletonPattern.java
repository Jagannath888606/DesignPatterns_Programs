/**
 * @author 	:B.Jagannath
 * @version	:1.0
 * @since	:01-04-2019
 */

package com.bridgeit.designpatterns.creationalpatterns.singleton;

public class MainMethodForSingletonPattern 
{
	public static void main(String[] args) 
	{
		System.out.println("*************************BillPughSingleton***********************");
		BillPughSingleton bps=BillPughSingleton.getInstance();
		System.out.println(" "+bps.hashCode());
		BillPughSingleton bps1=BillPughSingleton.getInstance();
		System.out.println(" "+bps1.hashCode());
		System.out.println("*************************EagerInitializationSingleton***********************");
		EagerInitialization es =  EagerInitialization.getInstance();
		EagerInitialization es1 =  EagerInitialization.getInstance();
		System.out.println(" "+es.hashCode());
		System.out.println(" "+es1.hashCode());
		System.out.println("*************************EnumSingleton***********************");
		EnumSingleton enu=EnumSingleton.INSTANCE;
		System.out.println(" "+enu.hashCode());
		EnumSingleton enu1=EnumSingleton.INSTANCE;
		System.out.println(" "+enu1.hashCode());
		System.out.println("*************************LazyInitializationSingleton***********************");
		LazyInitialization  laz=LazyInitialization .getInstance();
		System.out.println(" "+laz.hashCode());
		LazyInitialization  laz1=LazyInitialization.getInstance();
		System.out.println(" "+laz1.hashCode());
		System.out.println("**************************StaticBlockInitializationSingleton*******************");
		StaticBlockInitialization sb = StaticBlockInitialization.getInstance();
		System.out.println(" "+sb.hashCode());
		StaticBlockInitialization sb1 =StaticBlockInitialization.getInstance();
		System.out.println(" "+sb1.hashCode());
		System.out.println("****************************ThreadSafeSingleton**********************");
		ThreadSafeSingleton thread=ThreadSafeSingleton.getInstance();
		System.out.println(" "+thread.hashCode());
		ThreadSafeSingleton thread1=ThreadSafeSingleton.getInstance();
		System.out.println(" "+thread1.hashCode());
	}

}
