package methods2;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj);
		
		String yeniMesaj = sehirVer();
		
		System.out.println(yeniMesaj);
		
		int sayi = topla(34, 9);
		System.out.println(sayi);
		
		int toplam = topla2(2,3,5,7,9,13,15);
		System.out.println(toplam);

	}

	public static void ekle() {
		System.out.println("Eklendi");

	}

	public static void sil() {
		System.out.println("Silindi");

	}

	public static void güncelle() {
		System.out.println("Güncellendi");

	}

	public static int topla(int sayı1, int sayı2) {
		return sayı1 + sayı2;
	}
	
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	
	

	public static String sehirVer() {
		return "Tokat";
	}

}
