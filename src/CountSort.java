
public class CountSort {
	
	public int[] countinSortArray(int[] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		int[] frequencyArr=new int[max+1];
		
		for(int el: arr) {
			frequencyArr[el]++;
		}
		int index=0;
		for(int i=0;i<frequencyArr.length;i++) {
			
			while(frequencyArr[i]>0) {
				arr[index]=i;
				index++;
				frequencyArr[i]--;
			}
			
		}
		
		return arr;
	}

}
