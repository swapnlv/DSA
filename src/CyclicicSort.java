
public class CyclicicSort {
	
	public static int[] cycleSort(int[] arr){


	    int i=0;

	    while(i<arr.length){
	        int correct=arr[i]-1;
	        if(arr[i]!=arr[correct]){
	            int temp=arr[i];
	            arr[i]=arr[correct];
	            arr[correct]=temp;
	        }else{
	            i++;
	        }
	    }

	    return arr;
	}
	

}
