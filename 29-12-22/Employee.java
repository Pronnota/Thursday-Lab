package ThursdayLab;

class Employee
{
	//Instance variables
	int empid;
	String empName;
	long basicSalary;
	String designation;
	int Year;

	//Method to set Employee Data
	public void setData(int id,String name,long salary,String desig,int year)
	{
		empid=id;
		empName=name;
		basicSalary=salary;
		designation=desig;
		Year=year;
	}
	
	// To calculate Appraisal
	
	public void getAppraisal() {
		
		int servyear=2022-Year;
		if(servyear>=1) {
			basicSalary+=basicSalary*0.1;
		}
		else
			basicSalary=basicSalary;
		
		System.out.println("Salary :"+basicSalary+"/-");
}
	//To calculate TA
	public void calculateTA() {
		
		int ta=0;
		
		if (designation.equals("Manager")) {
			ta=3000;
			System.out.println("Travel allowance: "+ta+"/-");
			System.out.println();
		}
		else
		{
			ta=1000;
			System.out.println("Travel allowance: "+ta+"/-");
			System.out.println();
		}
	}
	// Display method to get data
	public void display() {
		System.out.println("Id:"+empid+"\nName: "+empName+"\nDesignation: "+designation);
	}
}


public class Employee {

	public static void main(String[] args) {
		
		//Employee Object Creation and Data Assignment
		Employee e1=new Employee();
		e1.setData(100,"Pronnota",10000,"Employee",2021);
		e1.display();
		e1.getAppraisal();
		e1.calculateTA();
		
		Employee e2=new Employee();
		e2.setData(101,"XYZ",50000,"Manager",2019);
		e2.display();
		e2.getAppraisal();
		e2.calculateTA();

	}

}
