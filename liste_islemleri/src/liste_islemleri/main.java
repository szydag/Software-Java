package liste_islemleri;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		ArrayList<Integer> SayiListesi = new ArrayList<Integer>();
		ArrayList<Integer> FrekansListesi = new ArrayList<Integer>();
		Scanner girdi = new Scanner(System.in);

		boolean kontrol = true;
		while (kontrol) {
			System.out.println("\n\nYapmak istediginiz islemi seciniz:");
			System.out.println("1- Sayi Listesi Olustur");
			System.out.println("2- Frekans Hesapla");
			System.out.println("3- Frekansa Gore Sil");
			System.out.println("4- Yeni Eleman Ekle");
			System.out.println("5- Cikis");
			int islem = girdi.nextInt();
			switch (islem) {
			case 1:
				SayiListesiOlustur(SayiListesi);
				ListeYazdir(SayiListesi);
				break;
			case 2:
				FrekansHesapla(SayiListesi, FrekansListesi);
				break;
			case 3:
				FrekansaGoreSil(SayiListesi, FrekansListesi);
				break;
			case 4:
				YeniElemanEkle(SayiListesi, FrekansListesi);
				ListeYazdir(SayiListesi);
				break;
			default:
				if (SayiListesi.size() > 0) {
					System.out.println("\n\n\nLISTENIN SON HALI");
					ListeYazdir(SayiListesi);
				}
				System.out.println("\n\nCIKIS YAPILMISTIR");
				kontrol = false;
				break;
			}
		}
	}

	static void ListeYazdir(ArrayList<Integer> SayiListesi) {

		System.out.println("\nSayi Listesi");
		for (Integer deger : SayiListesi) {
			System.out.print(deger + ", ");
		}
		int adet = SayiListesi.size();
		System.out.print("\nListedeki eleman sayisi: " + adet);
	}

	static void SayiListesiOlustur(ArrayList<Integer> SayiListesi) {
		if (SayiListesi.size() > 0) {
			SayiListesi.clear();
		}
		for (int i = 0; i < 30; i++) {
			SayiListesi.add((int) (Math.random() * 9) + 1);
		}
	}

	static void FrekansHesapla(ArrayList<Integer> SayiListesi, ArrayList<Integer> FrekansListesi) {
		if (SayiListesi.size() == 0) {
			System.out.println("Sayi Listesi olusturulmadi:((");
		}

		else {
			FrekansListesi.clear();
			int enbuyuk = SayiListesi.get(0);
			for (int i = 0; i < SayiListesi.size(); i++) { // frekans kontrolu icin en buyuk sayiyi bulmak icin
				if (SayiListesi.get(i) > enbuyuk) {
					enbuyuk = SayiListesi.get(i);
				}
			}
			for (int i = 1; i <= enbuyuk; i++) {
				int sayac = 0;
				for (int j = 0; j < SayiListesi.size(); j++) {
					if (SayiListesi.get(j) == i) {
						sayac++;
					}
				}
				FrekansListesi.add(sayac);
			}
			for (int i = SayiListesi.size(); i > 0; i--) {
				if (FrekansListesi.contains(i)) {
					System.out.println(FrekansListesi.indexOf(i) + 1 + " sayisi: " + i + " kez");
					FrekansListesi.set(FrekansListesi.indexOf(i), i + 1); // iki sayinin frekansı
																			// eşitse ikincisini de
																			// kontrol edebilmek için ilk degerin
																			// frekansını
																			// arttırıp ikincisi icin aynı degerde
																			// tekrar
																			// kontrol ediyorum
					i++;
				}
			}
			for (int i = 1; i < FrekansListesi.size(); i++) {
				FrekansListesi.set(i, FrekansListesi.get(i) - 1); // kontrolda bir sonraki sayi icin aynı frekansın
																	// bulunmasını sağlayan işlemi geri aliyorum
			}
			ListeYazdir(SayiListesi);
		}
	}

	static void FrekansaGoreSil(ArrayList<Integer> SayiListesi, ArrayList<Integer> FrekansListesi) {
		if (FrekansListesi.size() == 0) {
			System.out.println("Frekans Listesi Olusturulmadi:((");
		} else {
			Scanner girdi = new Scanner(System.in);
			System.out.print("Bir frekans giriniz: ");
			int frekans = girdi.nextInt();
			if (FrekansListesi.contains(frekans)) {
				for (int i = SayiListesi.size() - 1; i >= 0; i--) {
					if (SayiListesi.get(i) == FrekansListesi.indexOf(frekans) + 1) {
						SayiListesi.remove(i);
					}

				}
			} else {
				System.out.println("Girdiginiz frekans bulunamamaktadir");
			}
			ListeYazdir(SayiListesi);
		}
	}

	static void YeniElemanEkle(ArrayList<Integer> SayiListesi, ArrayList<Integer> FrekansListesi) {
		Scanner girdi = new Scanner(System.in);
		System.out.print("\n\n\nListeye eklemek istediginiz sayiyi giriniz: ");
		int eklenen_sayi = girdi.nextInt();
		if (SayiListesi.contains(eklenen_sayi)) {
			System.out.println("Eklemek istediginiz sayi mevcut listede bulunmaktadir");
		} else {
			System.out.print("Bu sayidan diziye kac tane eklemek istersiniz: ");
			int adet = girdi.nextInt();
			for (int i = 0; i < adet; i++) {
				SayiListesi.add(eklenen_sayi);
			}
		}
	}

}
