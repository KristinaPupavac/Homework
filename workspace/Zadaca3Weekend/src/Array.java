import java.util.Scanner;

import java.util.Arrays;

/*
 * ARRAYS
 * Potrebno je unijeti dva niza preko Scanner-a. U main metodi napisati code koji dopusta korisniku da unese
 * dva broja, N i M, koji označavaju duzine dva niza. Zatim u sljedećih N i M linija unijeti ta dva niza.
 * 
 * Napisati metodu koja prima ta dva niza kao dva parametra i vraća true ukoliko su jednaki, tj. sadrze iste 
 * elemente na istim indeksima niza. Bio je ovakav zadatak prije. Sada samo uraditi preko metode.
 * 
 * Napisati metodu koja prima ta dva niza i vraca treci niz koji predstavlja zbir elemanata sa istih indeksa. 
 * Primjer: Niz1 = {1,5,2}, Niz2 = {5,1,0,2,3}, vaša metoda vraca Niz3 = {6,6,2,2,3}
 * 
 * Napisati metodu koja prima ta dva niza i vraca treci koji sadrzi i prvi i drugi niz u sebi.
 * Primjer: Niz1 = {1,5,2}, Niz2 = {5,1,0,2,3}, vaša metoda vraća Niz3 = {1,5,2,5,1,0,2,3}
 */
public class Array {
/**
 * Returns true if arrays are equal (same elements with same index)
 * @param arr1
 * @param arr2
 * @return
 */
	public static boolean isEqual(int arr1[], int arr2[]) {
		int counter = 0;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				counter++;
			} else {
				return false;
			}
		}
		if (counter == arr1.length) {
			return true;
		}
		return false;
	}
/**
 * Returns array (sum of array elements with same index)
 * @param arr1
 * @param arr2
 * @return
 */
	public static int[]  arraySum (int arr1[], int arr2[]) {
		int length;
		if (arr1.length > arr2.length) {
			length = arr1.length;
		} else {
			length = arr2.length;
		}
		int[] arr3 = new int [length];
		for (int i = 0; i < length; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}
		return arr3;
	}
/**
 * Returns array (consist two arrays)
 * @param arr1
 * @param arr2
 * @return
 */
	public static int [] arrayExtension(int arr1[], int arr2[]) {
		int[] arr3 = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[arr1.length + i] = arr2[i];
		}
		
		return arr3;
	}
/**
 * main
 * @param args
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		System.out.println("Enter m: ");
		int m = input.nextInt();

		System.out.println("Enter " + n + " elements of arr1: ");
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = input.nextInt();
		}
		System.out.println("Enter " + m + " elementsof arr2: ");
		int[] arr2 = new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = input.nextInt();
		}

		System.out.println(isEqual(arr1, arr2));

		System.out.println(Arrays.toString(arrayExtension(arr1, arr2)));
		
		System.out.println(Arrays.toString(arraySum (arr1, arr2)));

		input.close();

	}

}
