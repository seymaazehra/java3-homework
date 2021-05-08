
public class Main {
//1
	public static void main(String[] args) { 
		String mesaj="bugün hava çok güzel";
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);
		int sayi=topla(5,7);
		System.out.println(sayi);
		int topla=topla2(7,5,4,3); //istenilen kadar sayý yazýlabilir
		System.out.println(topla);
	}
	
	//void deger döndürülmediði zaman yazýlýr
	public static void ekle() {//metot
		System.out.println("eklendi");
	}
	public static void sil() {
		System.out.println("silindi");
	}
	public static void güncelle() {
		System.out.println("güncellendi");
		return; //durdur
	}
	public static int topla(int sayi1,int sayi2) {
		//return 5;//5 döndür demek
		return sayi1+sayi2;
	}
	public static String sehirVer() {
		return "ankara";
	}

	
	//2
	//variable arguments
	public static int topla2(int...sayilar) {  //arka planda ... diziye dönüþtürür
		int toplam=0;
		for(int sayi:sayilar) {  //sayilardaki sayi anlamýnda
			toplam+=sayi;
		}
		return toplam;
		
	}
	
	
	
	

	
}
