package Assignment4;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String sb1 = "programing";
        StringBuilder sb2 =new StringBuilder();
        for(int i=0; i<sb1.length();i++) {
	    char ch = sb1.charAt(i);
	    int idx = sb1.indexOf(ch, i+1);
	    if(idx == -1) {
	    	sb2.append(ch);
	    }
}
        System.out.println(sb2);
       
	}
}
