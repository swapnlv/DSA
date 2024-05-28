
public class MergedSort {
	
	public static void divide(int[] arr, int si, int ei) {
		
		if(si>=ei) {
			return ;
		}
		
		int mi=si+(ei-si)/2 ;
		
		divide(arr, si, mi);
		divide(arr, mi+1, ei);
		conquer(arr,si,mi,ei);
	}

	public static int[] conquer(int[] arr, int si, int mi, int ei) {
		// TODO Auto-generated method stub
		
		
		int[] mergedArr=new int[ei-si+1];
		int i1=si;
		int i2=mi+1;
		
		int x=0;
		while(i1<=mi && i2<=ei) {
			if(arr[i1]<=arr[i2]) {
				mergedArr[x]=arr[i1];
				x++;
				i1++;
			}else {
				mergedArr[x]=arr[i2];
				x++;
				i2++;
			}
		}
		while(i1<=mi) {
			mergedArr[x]=arr[i1];
			x++;
			i1++;
		}
		while(i2<=ei) {
			mergedArr[x]=arr[i2];
			x++;
			i2++;
		}
		
		
		for(int i=0, j=si ;i<mergedArr.length;i++, j++) {
			arr[j]=mergedArr[i];
		}
		
		return arr;
		
	}
	
	
	

}
