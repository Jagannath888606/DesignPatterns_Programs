/**
 * @author	:B.Jagannath
 *@version	:1.0
 *@since	:02-04-2019
 */

package com.bridgeit.designpatterns.structuralpatterns.adapterdesignpattern;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter
{
	@Override
	public Volt get120Volt() 
	{
		return getVolt();
	}
	@Override
	public Volt get12Volt()
	{
		Volt v= getVolt();
		return convertVolt(v,10);
	}

	@Override
	public Volt get3Volt() 
	{
		Volt v= getVolt();
		return convertVolt(v,40);
	}
	
	private Volt convertVolt(Volt v, int i) 
	{
		return new Volt(v.getVolts()/i);
	}
}
