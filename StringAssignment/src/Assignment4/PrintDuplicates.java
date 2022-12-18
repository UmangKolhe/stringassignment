package Assignment4;

public class PrintDuplicates {

	public static void main(String[] args) {
	String str = "programing";
	for(int i =0; i<str.length(); i++) {
		char ch =str.charAt(i);
		int idx = str.indexOf(ch, i+1);
		if(idx != -1) {
			System.out.print(ch+" ");
		}
	}
	}

}
