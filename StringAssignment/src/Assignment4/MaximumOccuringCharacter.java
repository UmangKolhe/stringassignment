package Assignment4;

public class MaximumOccuringCharacter {

	public static void main(String[] args) {
		String str = "ineuron";
		char [] chararray = new char [str.length()];
		int [] frequency = new int [str.length()];
		chararray = str.toCharArray();
		int i,j;
		int min,max;
		char minchar=str.charAt(0),maxchar=str.charAt(0);
		for( i =0; i<str.length();i++) {
			frequency[i]=1;
			for(j=i+1;j<str.length();j++ ) {
				if(chararray[i]==chararray[j]&&chararray[i]!=' '&&chararray[i]!='0') {
					frequency[i]++;
					chararray[j]='0';
				}
			}
		}
       min=max=frequency[0];
       for(i=0;i<frequency.length;i++) {
    	   if(min>frequency[i]&&frequency[i]!='0') {
    		   min=frequency[i];
    		   minchar=chararray[i];
    	   }
    
    	   
    	   if(max<frequency[i]) {
    		   max=frequency[i];
    		   maxchar=chararray[i];
    	   }
       }
       System.out.println("minimum char = "+minchar);
       System.out.println("maximum char = "+maxchar);
	}

}
