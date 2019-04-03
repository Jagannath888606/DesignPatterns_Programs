/**
 * @purpose	:It contain config of pc and server
 * 
 * @author	:B.Jagannath
 * @version	:1.0
 * @since	:02-04-2019	
 */

package com.bridgeit.designpatterns.creationalpatterns.factorypatterns;

public class ComputerFactory 
{
	public static Computer getComputer(String type, String ram, String hdd, String cpu)
	{
		if("PC".equalsIgnoreCase(type)) 
		{
			return new PC(ram, hdd, cpu);
		} 
		else if	("Server".equalsIgnoreCase(type))
		{
			return new Server(ram, hdd, cpu);
		}
		
		return null;
	}
}
