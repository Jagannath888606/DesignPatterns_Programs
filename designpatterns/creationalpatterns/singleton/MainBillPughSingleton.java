/**
 * @author 	:B.Jagannath
 * @version	:1.0
 * @since	:01-04-2019
 */

package com.bridgeit.designpatterns.creationalpatterns.singleton;

public class MainBillPughSingleton 
{
	public static void main(String[] args) 
	{
		BillPughSingleton bps=BillPughSingleton.getInstance();
		System.out.println(" "+bps.hashCode());
		BillPughSingleton bps1=BillPughSingleton.getInstance();
		System.out.println(" "+bps1.hashCode());
	}
}
