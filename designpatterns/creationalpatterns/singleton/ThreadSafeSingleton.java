/**
 * @author 	:B.Jagannath
 * @version	:1.0
 * @since	:01-04-2019
 */

package com.bridgeit.designpatterns.creationalpatterns.singleton;

public class ThreadSafeSingleton 
{
    private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton(){}
    
    public static synchronized ThreadSafeSingleton getInstance()
    {
        if(instance == null)
        {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
