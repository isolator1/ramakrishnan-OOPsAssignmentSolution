/**************************************************************
 * Student :Ramakrishnan N
 * Assignment : Graded Coding Assignment 1
 * Description : Sub class called TechDepartment created extending Super class SuperDepartment
 * Constraints : Methods created with return type string and no parameters allowed
 * 
 * 
 * 
 ***************************************************************/
package department;

public class TechDepartment extends SuperDepartment 
{
	public String departmentName()
	{
		String departmentName = "Tech Department";
		return departmentName;
	}
	public String getTodaysWork() 
	{
		String getTodaysWork = "Complete coding of Module 1";
		return getTodaysWork;
  	}      
	public String getWorkDeadline() 
	{
		String getWorkDeadline = "Complete by EOD";
		return getWorkDeadline;
  	}   
	public String getTechStackInformation() 
	{
		String getTechStackInformation = "Core Java";
		return getTechStackInformation;
	}
}