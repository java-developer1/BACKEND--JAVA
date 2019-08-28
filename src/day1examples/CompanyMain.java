package day1examples;

public class CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person Obj=new Person("ram","bhupal");
		Person array[]={Obj};
		Company companyObj=new Company(Obj);
	   companyObj.swapNames();
		System.out.println("the fistname is "+Obj.getFirstName());
		System.out.println("the lastname  is "+Obj.getLastName());
	}

}
