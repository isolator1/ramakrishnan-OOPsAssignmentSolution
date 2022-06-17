/**************************************************************
 * Student :Ramakrishnan N
 * Assignment : Graded Coding Assignment 1
 * Description : Sub class called AdminDepartment created extending Super class SuperDepartment
 * Constraints : Methods created with return type string and no parameters allowed
 * 
 * 
 * 
 ***************************************************************/
package department;

class AdminDepartment extends SuperDepartment
{
	
	public String departmentName() 
	{
		String departmentName = "Admin Department";
		return departmentName;
    }
	public String getTodaysWork()
	{
		String getTodaysWork = "Complete your documents Submission";
		return getTodaysWork;
  	}      
	public String getWorkDeadline()
	{
		String getWorkDeadline = "Complete by EOD";
		return getWorkDeadline;
	}   
}
