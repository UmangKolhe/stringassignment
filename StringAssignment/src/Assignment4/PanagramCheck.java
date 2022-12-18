package Assignment4;

public class PanagramCheck {

	public static void main(String[] args) {
		String s ="the quick brown fox jumps over the lazy dog";
		if(s.length()<26) {
			System.out.println("not a panagram");
			return;
		}
		else {
			
			for(char ch = 'a'; ch<='z';ch++) {
				if(s.indexOf(ch)== -1) {
					System.out.println("not a panagram");
					return;
				}
				
			}
		}
		System.out.println("it is a panagram");

	}

}
