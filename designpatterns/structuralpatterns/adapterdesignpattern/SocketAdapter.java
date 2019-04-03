/**
 * @author	:B.Jagannath
 *@version	:1.0
 *@since	:02-04-2019
 */

package com.bridgeit.designpatterns.structuralpatterns.adapterdesignpattern;

public interface SocketAdapter
{
	public Volt get120Volt();
	
	public Volt get12Volt();
	
	public Volt get3Volt();
}
