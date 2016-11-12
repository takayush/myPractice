
public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		MaxHeap(a);
		int i=0;
		System.out.println("");
  	}
	public static void MaxHeapify(int[] a,int i){
		
	}
	public static void MaxHeap(int[] a){
		int heapSize = 1;
		for(int i = 1;i<a.length;i++){
			buildMaxheap(a,a[i]);
		}
	}
	private static void buildMaxheap(int[] a, int ai) {
		// TODO Auto-generated method stub
		int heapSize = a.length;
		for(int i = a.length/2;i>0;i--){
			MaxHeapify(a, i);
		}
	}

}
