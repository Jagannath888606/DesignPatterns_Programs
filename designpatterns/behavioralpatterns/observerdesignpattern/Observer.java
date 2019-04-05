/**
 * @author	:B.Jagannath
 * @version	:1.0
 * @since	:04-04-2019
 */

package com.bridgeit.designpatterns.behavioralpatterns.observerdesignpattern;

public interface Observer 
{
	//method to update the observer, used by subject
	public void update();
	
	//attach with subject to observe
	public void setSubject(Subject sub);
}
