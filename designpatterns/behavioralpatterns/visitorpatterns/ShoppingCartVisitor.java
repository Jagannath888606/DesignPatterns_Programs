/**
 * @author 	:B.Jagannath
 * @version	:1.0
 * @since	:05-04-2019
 */

package com.bridgeit.designpatterns.behavioralpatterns.visitorpatterns;

public interface ShoppingCartVisitor 
{
	int visit(Book book);
	int visit(Fruit fruit);
}
