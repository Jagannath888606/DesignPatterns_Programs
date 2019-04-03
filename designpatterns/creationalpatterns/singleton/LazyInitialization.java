/**
 * @author 	:B.Jagannath
 * @version	:1.0
 * @since	:01-04-2019
 */

package com.bridgeit.designpatterns.creationalpatterns.singleton;

public class LazyInitialization 
{
	private static LazyInitialization instance;
    
    private LazyInitialization(){}
    
    public static LazyInitialization getInstance()
    {
        if(instance == null)
        {
            instance = new LazyInitialization();
        }
        return instance;
    }
}
