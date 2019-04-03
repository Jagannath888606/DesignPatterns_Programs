/**
 * @author 	:B.Jagannath
 * @version	:1.0
 * @since	:01-04-2019
 */

package com.bridgeit.designpatterns.creationalpatterns.singleton;

public class BillPughSingleton 
{
	private BillPughSingleton(){}
    
    private static class SingletonHelper
    {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance()
    {
        return SingletonHelper.INSTANCE;
    }
}
