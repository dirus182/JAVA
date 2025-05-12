package tuandat;

import java.util.Arrays;
import java.util.Scanner;

public class Bai07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the array element");

// For reading
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

// For print the array element
		System.out.println("The array is : " + Arrays.toString(a));
		sc.close();
		Arrays.sort(a);
		System.out.println("Array sap xep  + " + Arrays.toString(a));
		System.out.println("Max =  " + a[a.length - 1]);
		System.out.println("Max =  " + a[0]);
	}

}
