/**
 * @author 	:B.Jagannath
 * @version	:1.0
 * @since	:05-04-2019
 */

package com.bridgeit.designpatterns.behavioralpatterns.mediatorpatterns;

public abstract class User 
{
	protected ChatMediator mediator;
	protected String name;
	
	public User(ChatMediator med, String name)
	{
		this.mediator=med;
		this.name=name;
	}
	
	public abstract void send(String msg);
	
	public abstract void receive(String msg);
}
