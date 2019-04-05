/**
 * @author 	:B.Jagannath
 * @version	:1.0
 * @since	:05-04-2019
 */

package com.bridgeit.designpatterns.behavioralpatterns.mediatorpatterns;

public class UserImpl extends User
{
	public UserImpl(ChatMediator med, String name) 
	{
		super(med, name);
	}

	@Override
	public void send(String msg)
	{
		System.out.println(this.name+": Sending Message="+msg);
		mediator.sendMessage(msg, this);
	}
	@Override
	public void receive(String msg) 
	{
		System.out.println(this.name+": Received Message:"+msg);
	}
}
