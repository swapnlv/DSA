
public class Main {
	
	
	public static void main(String[] a) {
		
		int[] arr= {5,34,3,1,8,9,0,43,23,46,7};
		BubbleSort bs=new BubbleSort();
		
		SelectionSort ss=new SelectionSort();
		
		InsertionSort is=new InsertionSort();
		
		MergedSort ms=new MergedSort();
		int [] resultArr= bs.bubbleSort(arr);
		
		int[] resultArr2=ss.selectionSort(arr);
		
		int[] resultArr3=is.insertionSort(arr);
		
//		
//		
		
		System.out.print("Using Bubble Sort: ");
		for(int i: resultArr) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		System.out.print("Using Selection Sort: ");
		for(int i: resultArr2) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		System.out.print("Using Insertion Sort: ");
		for(int i: resultArr3) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		ms.divide(arr, 0, arr.length-1);
		
		System.out.print("Using Merged Sort: ");
		for(int i: arr) {
			System.out.print(i+ " ");
		}
		
	}

}