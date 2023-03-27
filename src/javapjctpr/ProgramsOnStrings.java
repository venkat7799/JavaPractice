package javapjctpr;

public class ProgramsOnStrings {

	public static void main(String[] args) {
		String s = "venkata ramana varaprasad";
		int vCount = 0 ,cCount=0;
		
		System.out.println(s);
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
			vCount++;
		}else if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
			cCount++;
		}
	}
		System.out.println("consonants:"+cCount);
		System.out.println("vowels:"+vCount);
	
	}

}
