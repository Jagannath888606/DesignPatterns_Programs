/**
 * @purpose	:To create super class as abstract class for sub classes to over ride the tostring method 
 * 
 * @author	:B.Jagannath
 * @version	:1.0
 * @since	:02-04-2019	
 */

package com.bridgeit.designpatterns.creationalpatterns.factorypatterns;

public abstract class Computer
{
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString()
	{
		return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
	}
}
