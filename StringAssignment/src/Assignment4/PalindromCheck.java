package Assignment4;

public class PalindromCheck {

	public static void main(String[] args) {
		int no = 2552;
		int temp =no;
		int rev = 0;
		int rem;
		while(temp !=0) {
			rem = temp%10;
			rev =rev*10+rem;
			temp = temp/10;
			
		}
		if(no==rev) {
			System.out.println("palandrome");
		}
		else {
			System.out.println("not a palandrome");
		}
	}

}
