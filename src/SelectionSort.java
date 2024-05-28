
public class SelectionSort {
	
	public int[] selectionSort(int[]  arr ) {
		for(int i=0;i<arr.length-1;i++) {
			int smallest=i;
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
				
				int temp=arr[smallest];
				arr[smallest]=arr[i];
				arr[i]=temp;
			}
			
		}
		return arr;
	}
}
