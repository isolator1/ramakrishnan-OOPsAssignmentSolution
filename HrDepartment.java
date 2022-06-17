/**************************************************************
 * Student :Ramakrishnan N
 * Assignment : Graded Coding Assignment 1
 * Description : Sub class called HrDepartment created extending Super class SuperDepartment
 * Constraints : Methods created with return type string and no parameters allowed
 * 
 *  ***************************************************************/
package department;

public class HrDepartment extends SuperDepartment
{

	public String departmentName() 
	{
		String departmentName = "HR Department";
		return departmentName;
	}
	public String doActivity()
	{
		String doActivity = "team Lunch";
		return doActivity;
	}
	public String getTodaysWork() 
	{
		String getTodaysWork = "Fill today's timesheet and mark your attendance";
		return getTodaysWork;
  	}      
	public String getWorkDeadline() 
	{
		String getWorkDeadline = "Complete by EOD";
		return getWorkDeadline;
	}   
}
