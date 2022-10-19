
package com.cognizant.tax;

class TaxCalculator{
	String empName;
	boolean isIndian;
	double empSal;
	 double taxAmount;
	 
	
	

	public TaxCalculator(String empName, boolean isIndian, double empSal) {
	
		this.empName = empName;
		this.isIndian = isIndian;
		this.empSal = empSal;
	}




	public void calculateTax() throws Exception {
		
		if(!isIndian) { try {
		
			  throw new Exception("not indian not valid");
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
		
		
		else if(empName.isEmpty()) { try {
			 throw new Exception("emp name not given");
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		}
		
		
		else if(empSal>100000 && isIndian) {
			
				taxAmount= (empSal*8)/100;
			System.out.println( "salary  of " +empName+ " isgreater than 1lac and tax is:  " +taxAmount);
		}
		
		else if((empSal>=50000 && empSal<=100000) && isIndian) {
			taxAmount= (empSal*6)/100;
			System.out.println( "salary of " +empName+ " between 1lac to 50k and tax is:  " +taxAmount);
		}
		
		else if((empSal>=30000 && empSal<=50000) && isIndian) {
			taxAmount= (empSal*5)/100;
			System.out.println( "salary of " +empName+ " between 30k to 50k and tax is:  " +taxAmount);
		}
		
		else {
			 System.out.println("employee no need to pay tax out of range");
		}
		
	}
}
public class CalculatorSimulator {

	public static void main(String[] args) throws Exception {
	TaxCalculator obj=new TaxCalculator("sarbo",true, 35000);
	TaxCalculator obj1=new TaxCalculator("tim", true, 100);
	TaxCalculator obj2 =new TaxCalculator("jack", false, 55000);
	TaxCalculator obj3 =new TaxCalculator("", true, 34567);
		obj.calculateTax();
	obj1.calculateTax();
	obj2.calculateTax();
	obj3.calculateTax();

	}

}
