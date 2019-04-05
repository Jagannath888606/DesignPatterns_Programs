/**
 * @author 	:B.Jagannath
 * @version	:1.0
 * @since	:05-04-2019
 */

package com.bridgeit.designpatterns.behavioralpatterns.mediatorpatterns;

public class ChatClient 
{
	public static void main(String[] args)
	{
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "jagan");
		User user2 = new UserImpl(mediator, "jagannath");
		User user3 = new UserImpl(mediator, "sanju");
		User user4 = new UserImpl(mediator, "ravi");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hi All How Are You");
	}
}
