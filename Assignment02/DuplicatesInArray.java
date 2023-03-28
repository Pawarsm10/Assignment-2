package Assignment02;

public class DuplicatesInArray {
	public static void main(String[] args) {
	       int [] ar= {5,10,15,25,35,45,55,65,10};
	       for (int i=0; i<ar.length; i++)
	       {for (int j=i+1; j<ar.length ; j++)
	        if (ar[i]==ar[j])
	        {
	        	System.out.println("Duplicate found of "+ar[i]);
	        	System.out.println("Indices of Duplicates are "+i+"="+j);
	        }
	       }
	               
		}

}
