package Assignment4;

public class AnagramCheck {

	public static void main(String[] args) {
	String str1 ="java";
	String str2 ="avaj";
	
	char [] c1 = str1.toCharArray();
	char [] c2 = str2.toCharArray();
	
	for(int i=0; i<c1.length-1;i++) {
		for(int j =0; j<c1.length-1-i;j++) {
			if(c1[j]>c1[j+1]) {
				char temp = c1[j];
				c1[j]=c1[j+1];
				c1[j+1]=temp;
			}
		}
	}
	
	for(int i=0; i<c2.length-1;i++) {
		for(int j =0; j<c2.length-1-i;j++) {
			if(c2[j]>c2[j+1]) {
				char temp = c2[j];
				c2[j]=c2[j+1];
				c2[j+1]=temp;
			}
		}
	}
	
	for(int i =0;i<c1.length;i++) {
		if(c1[i]!=c2[i]) {
			System.out.println("not anagram");
			return;
		}
	}
	
	System.out.println("it is anagram");

	}

}
