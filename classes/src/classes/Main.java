package classes;

import javax.sound.midi.ShortMessage;

public class Main {
	public static void main(String[] args) {
		System.out.println();

		CustomerManeger customerManeger = new CustomerManeger();
		CustomerManeger customerManeger2 = new CustomerManeger();
		customerManeger = customerManeger2;
		customerManeger.Add();
		customerManeger.Remove();
		customerManeger.Update();

		// value

		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);

		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 4, 5, 6 };
		sayilar2 = sayilar1;
		sayilar1[0] = 35;
		System.out.println(sayilar2[0]);

	}

}
