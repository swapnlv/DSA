
public class QuickSort {
	public int partition(int[] arr, int low, int high) {
		int pivot=arr[high];
		int i=low-1;
		
		
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp1=arr[i];
		arr[i]=pivot;
		arr[high]=temp1;
		return i;
	}
	
	public void quickSort(int[] arr, int low,int high) {
		if(low<high) {
			int piIndx=partition(arr, low, high);
			
			
			quickSort(arr, low, piIndx-1);
			quickSort(arr, piIndx+1, high);
		}
	}
}
