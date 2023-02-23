package array;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] main= {7,5,2,3,1,4,6};
		mergeSort(main);
	}
		public static void mergeSort(int[] a) {
			if(a.length<2) {
				return;
			}
		int mid= (a.length)/2;
		int sec=a.length-mid;
		
		int[] p1=new int[mid];
		int[] p2=new int[sec];
		for(int i=0;i<mid;i++) {
			p1[i]=a[i];
		}
		System.out.println("part1");
		for(int el:p1) {			
			System.out.println(el);
		}
		
		for(int i=mid;i<a.length;i++) {
			
			p2[i-mid]=a[i];
			
		}
		System.out.println("part2");
		for(int el:p2) {
			
			System.out.println(el);
		}
		
		mergeSort(p1);
		mergeSort(p2);
		System.out.println("array seperation done");
		
	}
		
	
}
