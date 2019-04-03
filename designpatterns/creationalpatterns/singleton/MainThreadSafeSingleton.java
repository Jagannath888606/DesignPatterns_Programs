/**
 * @author 	:B.Jagannath
 * @version	:1.0
 * @since	:01-04-2019
 */

package com.bridgeit.designpatterns.creationalpatterns.singleton;

public class MainThreadSafeSingleton 
{
	public static void main(String[] args)
	{
		ThreadSafeSingleton thread=ThreadSafeSingleton.getInstance();
		System.out.println(" "+thread.hashCode());
		ThreadSafeSingleton thread1=ThreadSafeSingleton.getInstance();
		System.out.println(" "+thread1.hashCode());
	}
}
