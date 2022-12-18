package Assignment4;

public class ConsonentVowelSpecialCharCount {

	public static void main(String[] args) {
		String str = "we are learning java *";
		int vcount = 0;
		int ccount = 0;
		int scount = 0;
		for(int i=0;i<str.length(); i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vcount++;
			}
			else if(str.charAt(i)>'a'&&str.charAt(i)<'z') {
				ccount++;
			}
			else if (str.charAt(i)==' ') {
				continue;
			}
			else {
				scount++;
			}
		}
		System.out.println("vowels count = "+vcount);
		System.out.println("consonent count = "+ccount);
		System.out.println("specialcharacter count = "+scount);
		

	}

}
