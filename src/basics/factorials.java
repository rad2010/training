package basics;

public class users {
	
	System.out.println("helo");
}




public class factorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = 5;
	
       /* if (n == 0) {
            return 1;
        }
        else if (n == 1) {
            return 1;
        }*/
        
        int i = n ;
        for (i=n;i>0;i--)
        {
        	int sum = i * (i-1); 
        	System.out.println(sum);	
        }
    }

}



