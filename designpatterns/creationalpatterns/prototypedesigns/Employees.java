/**
 * @author	:B.Jagannath
 * @version	:1.0
 * @since	:02-04-2019
 */

package com.bridgeit.designpatterns.creationalpatterns.prototypedesigns;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable
{
	private List<String> empList;
	
	public Employees()
	{
		empList = new ArrayList<String>();
	}
	
	public Employees(List<String> list)
	{
		this.empList=list;
	}
	public void loadData()
	{
		//read all employees from database and put into the list
		empList.add("jagan");
		empList.add("Raj");
		empList.add("Dravid");
		empList.add("Lalli");
	}
	
	public List<String> getEmpList() 
	{
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getEmpList())
			{
				temp.add(s);
			}
			return new Employees(temp);
	}
}
