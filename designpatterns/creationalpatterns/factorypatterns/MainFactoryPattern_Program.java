/**
 * @purpose	:To write main method for run the program
 * 
 * @author	:B.Jagannath
 * @version	:1.0
 * @since	:02-04-2019	
 */

package com.bridgeit.designpatterns.creationalpatterns.factorypatterns;

public class MainFactoryPattern_Program 
{
	public static void main(String[] args) 
	{
		Computer pc=ComputerFactory.getComputer("PC"," 4GB", "1TB", "2.5GHz");
		System.out.println("Factory PC Config: "+pc);
		Computer server=ComputerFactory.getComputer("SERVER"," 8GB", "1.5TB", "2.8GHz");
		System.out.println("Factory SERVER Config: "+server);	
	}
}
