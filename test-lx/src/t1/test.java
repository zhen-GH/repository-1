package t1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		//		int a[] = {23, 52, 81, 69, 78, 32, 67, 70, 36, 73};
		////		bubbing(a);
		////			for (int i=0;i<a.length;i++) {
		////				System.out.println(a[i]);
		////			}
		//		int b[] = {5,2,1,4,7,1};
		//		findMissed(b);
		String s = "levvel";
		char[] a = s.toCharArray();
		int max = a.length/2;
		int count = max;
		for(int i=0;i<max;i++) {
			if(a[i]==a[a.length-1-i]) {
				count--;
			}
		}
		System.out.println((count==0)?true:false);
	}

	private static void findMissed(int[] b) {
		for(int j=1;j<=b.length+1;j++) {
			int s = 0;
			for(int i=0;i<b.length;i++) {
				if((b[i]^j)==0) {
					s=1;
					break;
				}
			}
			if(s==0) {
				System.out.println(j);
			}
		}
	}

	public static void bubbing(int a[]) {

		int temp; 
		for(int i = 0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]>a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}
