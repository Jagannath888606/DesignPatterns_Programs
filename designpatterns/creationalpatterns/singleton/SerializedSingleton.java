/**
 * @author 	:B.Jagannath
 * @version	:1.0
 * @since	:01-04-2019
 */

package com.bridgeit.designpatterns.creationalpatterns.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable
{
	private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}
    
    private static class SingletonHelper
    {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }
    
    public static SerializedSingleton getInstance()
    {
        return SingletonHelper.instance;
    }
    protected Object readResolve()
    {
        return getInstance();
    }    
}
