/**
 * @author 	:B.Jagannath
 * @version	:1.0
 * @since	:05-04-2019
 */

package com.bridgeit.designpatterns.behavioralpatterns.mediatorpatterns;

public interface ChatMediator 
{

	public void sendMessage(String msg, User user);

	void addUser(User user);
}
