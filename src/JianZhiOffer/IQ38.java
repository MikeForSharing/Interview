package JianZhiOffer;

public class IQ38 {

	public int GetNumberOfK(int[] array, int k) {
		int number = 0;
		if(array!=null) {
			int first = getFirstK(array,k,0,array.length-1);
			int last = getLastK(array,k,0,array.length-1);
			if(last>-1 && first>-1) 
				number = last - first + 1;
		}else {
			number = -1;
		}
		return number;
	}
	
	
	private int getFirstK(int[] arr, int k, int start, int end) {
		if(start>end) {
			return -1;
		}
		int mid = (start+end)/2;
		int midVal = arr[mid];
		if(midVal==k) {
			if(mid==0 || (mid>0 && arr[mid-1]!=k)) {
				return mid;
			}else {
				end = mid -1;
			}
		}else if(midVal>k) {
			end = mid -1;
		}else{
			start = mid + 1;
		}
		return getFirstK(arr,k,start,end);
	}
	
	private int getLastK(int[] arr, int k, int start, int end) {
		if(start>end) {
			return -1;
		}
		int mid = (start+end)/2;
		int midVal = arr[mid];
		if(midVal==k) {
			if(mid==end || (mid<end && arr[mid+1]!=k)) {
				return mid;
			}else {
				start = mid + 1;
			}
		}else if(midVal>k) {
			end = mid -1;
		}else{
			start = mid + 1;
		}
		return getLastK(arr,k,start,end);
	}
	
	public static void main(String[] args) throws Exception {
		int[] arr = {1,2,2,2,3};
		int result = new IQ38().GetNumberOfK(arr, 2);
		System.out.println(result);
	}
	
}
