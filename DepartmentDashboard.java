/**************************************************************
 * Student :Ramakrishnan N
 * Assignment : Graded Coding Assignment 1
 * Description :Driver class created to create objects using constructors
 * and desired output is printed * 
 * 
 * 
 ***************************************************************/
package department;

public class DepartmentDashboard 
{

	public static void main(String[] args)
	{
		//create  objects using constructors
		AdminDepartment obj_ad = new AdminDepartment();
		HrDepartment obj_hr = new HrDepartment();
		TechDepartment obj_tech= new TechDepartment();
		
		//print outputs		
		System.out.println("Welcome to "+ obj_ad.departmentName());
		System.out.println(obj_ad.getTodaysWork());
		System.out.println(obj_ad.getWorkDeadline());
		System.out.println(obj_ad.isTodayHoliday()); // this method is from superclass
		System.out.println("");
		System.out.println("Welcome to "+ obj_hr.departmentName());
		System.out.println(obj_hr.doActivity());
		System.out.println(obj_hr.getTodaysWork());
		System.out.println(obj_hr.getWorkDeadline());
		System.out.println(obj_hr.isTodayHoliday()); // this method is from superclass
		System.out.println("");
		System.out.println("");
		System.out.println("Welcome to " + obj_tech.departmentName());
		System.out.println(obj_tech.getTodaysWork());
		System.out.println(obj_tech.getWorkDeadline());
		System.out.println (obj_tech.getTechStackInformation());
		System.out.println(obj_hr.isTodayHoliday());// this method is from superclass

	}

}
