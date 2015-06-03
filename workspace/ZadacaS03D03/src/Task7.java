import java.util.Arrays;
import java.util.Scanner;

/*
 * Napisati program koji generise jedan niz od 100.000 elemenata tipa int sa random
 * vrijednostima od 0 − 99.999. Zatim, koristeci sort metodu iz Arrays klase, sortirati niz, tj.
 * poredati ga od najmanjeg do najveceg. Neka onda korisnik unese jedan broj N. Provjeriti da li
 * N postoji u nizu koristeci binarySearch metodu iz Arrays klase. Koristite svoj napisani kod
 * iz Task 5 i provjerite koliko vremena treba vasem algoritmu da pronadje broj u poredjenju sa
 * binarySearch metodom. Koristite currentTimeMillis metodu iz System klase da
 * zabiljezite potrebno vrijeme.

 */
public class Task7 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int [] arr = new int [100000];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*99999);
		}
		Arrays.sort(arr);
		System.out.println("Enter the number you want to look for");
		int N = input.nextInt();
		long time1 = System.currentTimeMillis();
		System.out.println("Number " + N + " is at index (binarySearch) " + Arrays.binarySearch(arr, N));
		long time2 = System.currentTimeMillis();
		long score1 = time2 - time1;
		System.out.println("Time in miliseconds (binarySearch): " + score1);
		long time3 = System.currentTimeMillis();
		int index = 0;
		boolean temp = false;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == N){
				temp = true;
				index = i;
			}
		}
		if(temp == true)
		System.out.println("Number "+ N +" is at index (FromTask6Code) "+index);
		else
			System.out.println("There is no number that you asked");
		long time4 = System.currentTimeMillis();
		long score2 =  time4 - time3;
		System.out.println("Time in miliseconds (FromTask6Code): " + score2);
        input.close();
	}
}
