package Assignment02;

public class SelectionSort {

	public static void main(String[] args) {
		
          int []ar = {3,5,2,6,4,1,9,7,8};
		
		for(int i=0;i<ar.length-1;i++)
		
		{	
			int smallest= i;
		    for(int j=i+1;j<ar.length;j++)
			
		{
			if(ar[smallest]>ar[j])
			{
				smallest=j;
				
			}
		}
		    int tempvar=ar[smallest];
			ar[smallest]=ar[i];
			ar[i]=tempvar;
		}
		System.out.println("Given array :{3,5,2,6,4,1,9,7,8} ");

		System.out.print("Sorted array: ");

		for (int e:ar)
		{
			System.out.print(e+" ");
		}


	}


}
