package lab8;

public class Student {
  public void calculateFeesStructure(Long studentId,Character studentGrade,Double monthyFees,Boolean ScholarshipEligible) {
	 if(studentId!=0 && studentGrade=='A'&& ScholarshipEligible==true) {
		Double Fees= (monthyFees)*(90/100);
		System.out.println("Student Id : "+studentId);
		System.out.println("Student Grade :"+studentGrade);
		System.out.println("Monthy Fees :"+monthyFees);
		System.out.println("Fees after 10% discount = "+monthyFees*(0.90));
	 }
	 else if(studentId!=0 && studentGrade=='B'&& ScholarshipEligible==true) {
			Double Fees= monthyFees*(92/100);
			System.out.println("Student Id : "+studentId);
			System.out.println("Student Grade :"+studentGrade);
			System.out.println("Monthy Fees :"+monthyFees);
			System.out.println("Fees after 8% discount = "+monthyFees*(0.92));
		 }
	 else if(studentId!=0 && studentGrade=='C'&& ScholarshipEligible==true) {
			Double Fees= monthyFees*(94/100);
			System.out.println("Student Id : "+studentId);
			System.out.println("Student Grade :"+studentGrade);
			System.out.println("Monthy Fees :"+monthyFees);
			System.out.println("Fees after 6% discount = "+monthyFees*(0.94));
		 }
	 else if(studentId!=0 && studentGrade=='D'&& ScholarshipEligible==true) {
			Double Fees= monthyFees*(96/100);
			System.out.println("Student Id : "+studentId);
			System.out.println("Student Grade :"+studentGrade);
			System.out.println("Monthy Fees :"+monthyFees);
			System.out.println("Fees after 4% discount = "+monthyFees*(0.96));
		 }
	 else {
		 System.out.println("Not Eligible For Scholarship");
	 } 
  }
  public void compareMarks(Long Math,Double English) {
		 if(English>Math) {
			 System.out.println("English marks is higher than Math");
		 }
		 else if(English<Math) {
			 System.out.println("Math marks is higher than English");
		 }
		 else {
			 System.out.println("English and Math marks are equal");
		 } 
	 }
  
  public void validateFees(Double Fees) {
	  if(Fees.isInfinite()==true) {
		  System.out.println("Fees is Infinite");
	  }
	  else if(Fees.isInfinite()==false) {
		  System.out.println("Fees is not Infinite");
	  }
	  else {
		  System.out.println(Fees.byteValue());
	  }  
  }
  public static void main(String[] args) {
	Student s= new Student();
	System.out.println("_____Test case 1_____");
	s.calculateFeesStructure((long)234, 'C', (double)600, true);
	System.out.println("\n_____Test case 2_____");
	s.calculateFeesStructure((long)115, 'B', (double)909.50, true);
	System.out.println("\n_____Test case 3______");
	s.calculateFeesStructure((long)980, 'G', (double)1810, false);
	
	System.out.println("\n\n __________Test For compareMarks method________");
	s.compareMarks((long)85,(double)65);
	s.compareMarks((long)56,(double)98);
	s.compareMarks((long)84,(double)84);
  }
}
