
public class Main {
//1
	public static void main(String[] args) { 
		String mesaj="bug�n hava �ok g�zel";
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);
		int sayi=topla(5,7);
		System.out.println(sayi);
		int topla=topla2(7,5,4,3); //istenilen kadar say� yaz�labilir
		System.out.println(topla);
	}
	
	//void deger d�nd�r�lmedi�i zaman yaz�l�r
	public static void ekle() {//metot
		System.out.println("eklendi");
	}
	public static void sil() {
		System.out.println("silindi");
	}
	public static void g�ncelle() {
		System.out.println("g�ncellendi");
		return; //durdur
	}
	public static int topla(int sayi1,int sayi2) {
		//return 5;//5 d�nd�r demek
		return sayi1+sayi2;
	}
	public static String sehirVer() {
		return "ankara";
	}

	
	//2
	//variable arguments
	public static int topla2(int...sayilar) {  //arka planda ... diziye d�n��t�r�r
		int toplam=0;
		for(int sayi:sayilar) {  //sayilardaki sayi anlam�nda
			toplam+=sayi;
		}
		return toplam;
		
	}
	
	
	
	

	
}
