/**
 * @author	:B.Jagannath
 *@version	:1.0
 *@since	:02-04-2019
 */

package com.bridgeit.designpatterns.structuralpatterns.adapterdesignpattern;

public class Socket
{
	public Volt getVolt()
	{
		return new Volt(120);
	}
}
