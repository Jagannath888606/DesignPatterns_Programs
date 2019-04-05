/**
 * @author	:B.Jagannath
 * @version	:1.0
 * @since	:04-04-2019
 */

package com.bridgeit.designpatterns.behavioralpatterns.observerdesignpattern;

public interface Subject
{
	//methods to register and unregister observers
	public void register(Observer obj);
	public void unregister(Observer obj);
	
	//method to notify observers of change
	public void notifyObservers();
	
	//method to get updates from subject
	public Object getUpdate(Observer obj);
}
