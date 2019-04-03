/**
 * @author	:B.Jagannath
 * @version	:1.0
 * @since	:02-03-2019
 */

package com.bridgeit.designpatterns.structuralpatterns.Prototypedesignpattern;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor
{

	@Override
	public void runCommand(String cmd) throws IOException 
	{
        //some heavy implementation
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");
	}
}
