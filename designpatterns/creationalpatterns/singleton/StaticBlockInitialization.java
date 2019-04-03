/**
 * @author 	:B.Jagannath
 * @version	:1.0
 * @since	:01-04-2019
 */

package com.bridgeit.designpatterns.creationalpatterns.singleton;

public class StaticBlockInitialization 
{
	private static StaticBlockInitialization  instance;
    
    private StaticBlockInitialization(){}
    
    //static block initialization for exception handling
    static
    {
        try
        {
            instance = new StaticBlockInitialization ();
        }
        catch(Exception e)
        {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlockInitialization  getInstance()
    {
        return instance;
    }

}
