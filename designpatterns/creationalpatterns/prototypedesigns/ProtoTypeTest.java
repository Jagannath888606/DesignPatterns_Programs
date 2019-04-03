/**
 * @author	:B.Jagannath
 * @version	:1.0
 * @since	:02-04-2019
 */

package com.bridgeit.designpatterns.creationalpatterns.prototypedesigns;

import java.util.List;

public class ProtoTypeTest
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Employees emps = new Employees();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("jagan");
		
		System.out.println("Employees List: "+emps.getEmpList());
		System.out.println("Employees New List: "+list);
		System.out.println("Employees New List 1: "+list1);
	}
}
