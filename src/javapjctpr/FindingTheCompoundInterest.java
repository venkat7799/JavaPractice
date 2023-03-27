package javapjctpr;

public class FindingTheCompoundInterest {

	public static void main(String[] args) {
		double princ=60000 , Rate=2, Time=2;
		
	double	CI = princ*(Math.pow((1+Rate/100), Time));
	System.out.println("Compound interest:" +CI);
	}

}