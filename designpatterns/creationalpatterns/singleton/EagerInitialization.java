/**
 * @author 	:B.Jagannath
 * @version	:1.0
 * @since	:01-04-2019
 */

package com.bridgeit.designpatterns.creationalpatterns.singleton;

public class EagerInitialization
{
    private static final EagerInitialization instance = new EagerInitialization();
    
    //private constructor to avoid client applications to use constructor
    private EagerInitialization(){}

    public static EagerInitialization getInstance()
    {
        return instance;
    }

}
