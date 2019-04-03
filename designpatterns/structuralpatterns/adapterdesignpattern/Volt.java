/**
 * @author	:B.Jagannath
 *@version	:1.0
 *@since	:02-04-2019
 */

package com.bridgeit.designpatterns.structuralpatterns.adapterdesignpattern;

public class Volt 
{
	private int volts;
	
	public Volt(int v)
	{
		this.volts=v;
	}

	public int getVolts()
	{
		return volts;
	}

	public void setVolts(int volts)
	{
		this.volts = volts;
	}
}
