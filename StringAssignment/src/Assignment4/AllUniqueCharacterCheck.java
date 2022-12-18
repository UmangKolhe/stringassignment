package Assignment4;

public class AllUniqueCharacterCheck {

	public static void main(String[] args) {
	String s = "umang";
	int a =1;
	for(int i = 0 ; i<s.length(); i++) {
		char ch = s.charAt(i);
		if(s.indexOf(ch) != s.lastIndexOf(ch)) {
			a = 0 ;
			break;
			
		}
	}
	if(a==1) {
		System.out.println("string has all unique characters");
	}
	else {
		System.out.println("string has duplicate characters");
	}

	}

}
