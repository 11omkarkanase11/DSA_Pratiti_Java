import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Array size:");
    	int n = sc.nextInt();
		int[] a= new int[n];
		for(int i=0; i<n; i++) {
			a[i]= sc.nextInt();
		}
		for(int i: a) {
			System.out.println(i);
		}
		sort(a, 0, n-1);
		
		for(int i: a) {
			System.out.println(i);
		}
	}

	private static void sort(int[] a, int low ,int  high) {
		
		if(low<high) {
			int pivot = partition(a, low, high);
			System.out.println(pivot);
			
			sort(a, low, pivot-1);
            sort(a, pivot+1, high);
		}
		
		
		
	}

	private static int partition(int[] a, int low, int high) {
		
		int pivot = a[high];
		int i = low-1;
		
		for(int j= low; j<high; j++) {
			if(a[j]<= pivot) {
				i++;
				swap(a[i], a[j]);
			}
		}
		swap(a[i+1], a[high]);
		
		return i+1;
	}

	private static void swap(int i, int j) {
		
		int temp =i;
		i=j;
		j= temp;
		
	}
}
