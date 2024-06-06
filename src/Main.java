
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
		
		int[] arr2= {5,34,3,1,8,4,0,73,23,98,7};
		
		QuickSort qs=new QuickSort();
		
		System.out.println();
		
		qs.quickSort(arr2, 0, arr2.length-1);
		
		System.out.print("Using Quick Sort: ");
		for(int i: arr2) {
			System.out.print(i+ " ");
		}
		
		int[] arr3= {5,34,3,1,8,4,0,73,23,98,7};
		
		CountSort cs=new CountSort();
		int[] resultArr4=cs.countinSortArray(arr3);
		
		
		System.out.println();
		
		System.out.print("Using Count Sort: ");
		for(int i: resultArr4) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
		int[] arr4={6,4,1,5,3,2};
		System.out.println("Using Cyclic Sort: Before Sorting: ");
		for(int el: arr4){

		    System.out.print(+ el+ " ");
		}
		int[] resultArr5=CyclicicSort.cycleSort(arr4);
		        System.out.println();
		System.out.println("After Sorting: ");
		for(int el: resultArr5){
		    System.out.print( el+ " ");
		}
		
	}

}
