/**
 * @author 	:B.Jagannath
 * @version	:1.0
 * @since	:01-04-2019
 */

package com.bridgeit.designpatterns.creationalpatterns.singleton;

public class MainEnumSingleton 
{
	public static void main(String[] args)
	{
		EnumSingleton enu=EnumSingleton.INSTANCE;
		System.out.println(" "+enu.hashCode());
		EnumSingleton enu1=EnumSingleton.INSTANCE;
		System.out.println(" "+enu1.hashCode());
		
	}
}
