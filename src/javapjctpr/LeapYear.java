package javapjctpr;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2024;
		
		if(year%4==0||year%100==0||year%100==0) {
			
			System.out.println(year + ":is leap year");
		}else {
			System.out.println(year + ":is not leap year");

		}
	}

}
