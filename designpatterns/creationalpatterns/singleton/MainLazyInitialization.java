
/**
 * @author 	:B.Jagannath
 * @version	:1.0
 * @since	:01-04-2019
 */

package com.bridgeit.designpatterns.creationalpatterns.singleton;

public class MainLazyInitialization 
{
	public static void main(String[] args) 
	{
		LazyInitialization  laz=LazyInitialization .getInstance();
		System.out.println(" "+laz.hashCode());
		LazyInitialization  laz1=LazyInitialization.getInstance();
		System.out.println(" "+laz1.hashCode());
	}
}
