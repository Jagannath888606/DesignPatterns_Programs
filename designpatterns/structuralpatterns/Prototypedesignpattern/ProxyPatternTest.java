/**
 * @author	:B.Jagannath
 * @version	:1.0
 * @since	:02-03-2019
 */

package com.bridgeit.designpatterns.structuralpatterns.Prototypedesignpattern;

public class ProxyPatternTest 
{
	public static void main(String[] args)
	{
		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
		try
		{
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		}
		catch (Exception e)
		{
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}
}
