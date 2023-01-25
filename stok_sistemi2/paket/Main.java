package paket;

import java.io.FileNotFoundException;
import java.util.Scanner;

import paket1.Listeleme;
import paket2.Beverages1;
import paket2.Urunler;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Listeleme.GetListele();
		Scanner girdi = new Scanner(System.in);
		boolean kontrol = true;
		while (kontrol) {
			System.out.println(
					"\n\n***************************************************************************************************************************");
			System.out.println("\nYapmak istediginiz islemi seciniz (FONKSİYONLAR CALISMAMAKTA SADECE LİSTE OLUSTURMA :((((((((");
			System.out.println("1: Urun Fiyat Guncelle");
			System.out.println("2: Urun Kategorik Zam Yap");
			System.out.println("3: Icecek Stok Guncelle");
			System.out.println("4: Cesni Birim Agirlik Guncelle");
			System.out.println("5: Sekerlem Detay Ekle");
			System.out.println("6: Sut Urunu Sil");
			System.out.println("7: Tahil Urun Ekle");
			System.out.println("8: Cikis");
			int secim = girdi.nextInt();

			switch (secim) {
			case 1:
				System.out.println("Fiyatini guncellemek istediginiz urunun adini giriniz: ");
				String urunAdi = girdi.next();
				System.out.println("Urunun yeni fiyatini giriniz");
				Double guncelFiyat = girdi.nextDouble();
				//Urunler.BeveragesListGoster();
				Urunler.GetUrunFiyatGuncelle(urunAdi, guncelFiyat);
				break;
			case 2:
//				System.out.println(KategoriAdi1);
//				System.out.println(KategoriAdi2);
//				System.out.println(KategoriAdi3);
//				System.out.println(KategoriAdi4);
//				System.out.println(KategoriAdi5);
				System.out.println("Zam yapmak istediginiz kategorinin adini giriniz: ");
				String KategoriAdi = girdi.next();
				System.out.println("Ilgili kategoriye ne kadar zam yapicaksiniz: ");
				int x = girdi.nextInt();
				// Urunler.UrunKategorikZamYap(KategoriAdi, x, Beverages1List, Contiments2List,
				// Confections3List,
				// DairyProducts4List, Cereals5List);
				break;
			case 3:
				System.out.println("\n\n Icecek Listesi\n");
				// Beverages1.BeveragesListGoster(Beverages1List);
				System.out.println("\nStok degisimi olan urunun indexini  giriniz: ");
				int index = girdi.nextInt();
				System.out.println("Alis islemi ise 0 satis islemi ise 1 giriniz:");
				int sonuc = girdi.nextInt();
				boolean SatisMi = true;
				if (sonuc == 1) {
					SatisMi = true;
				} else {
					SatisMi = false;
				}
				System.out.println("Degisim miktarini giriniz");
				int miktar = girdi.nextInt();
				// Beverages1.IcecekStokGuncelle(index, SatisMi, miktar, Beverages1List);
				System.out.println("\n\n Guncellenmis Icecek Listesi\n");
				// Beverages1.BeveragesListGoster(Beverages1List);
				break;
			case 4:
				System.out.println("\n\nCesni Listesi\n");
				// Contiments2.ContimentsListGoster(Contiments2List);
				System.out.println("\nCesninin yeni agirligini giriniz: ");
				String yeniAgirlik = girdi.next();
				// Contiments2.CesniBirimAgirlikGuncelle(yeniAgirlik, Contiments2List);
				System.out.println("\n\nGuncel Cesni Listesi\n");
				// Contiments2.ContimentsListGoster(Contiments2List);
				break;
			case 5:
				System.out.println("\n\nSekerleme Listesi");
				// Confections3.ConfectionsListGoster(Confections3List);
				System.out.println("Seker kategorisine eklemek istediginiz detayi giriniz: ");
				String yeniDetay = girdi.next();
				// Confections3.SekerlemeDetayEkle(yeniDetay, Confections3List);
				System.out.println("\n\nGuncel Sekerleme Listesi");
				// Confections3.ConfectionsListGoster(Confections3List);

				break;
			case 6:
				System.out.println("\n\nSut Listesi\n");
				// DairyProducts4.DairyProductsListGoster(DairyProducts4List);
				System.out.println("\nSilmek istediginiz sut urunun adini giriniz");
				String urunAdi1 = girdi.next();
				// DairyProducts4.SutUrunuSil(urunAdi1, DairyProducts4List);
				System.out.println("\n\nGuncel Sut Listesi\n");
				// DairyProducts4.DairyProductsListGoster(DairyProducts4List);

				break;
			case 7:
				System.out.println("\n\nTahil Listesi");
				// Cereals5.CerealsListGoster(Cereals5List);
				System.out.println("\nEklemek istediginiz tahilin adini giriniz: ");
				String Adi = girdi.next();
				System.out.println("Eklemek istediginiz tahilin birim agirligini giriniz:");
				String BirimAgirligi = girdi.next();
				System.out.println("Eklemek istediginiz tahilin birim fiyatini giriniz: ");
				Double BirimFiyati = girdi.nextDouble();
				System.out.println("Eklemek istediginiz tahilin stok miktarini giriniz: ");
				int StokMiktari = girdi.nextInt();
				// Cereals5.TahilUrunEkle(Adi, BirimAgirligi, BirimFiyati, StokMiktari,
				// Cereals5List);
				System.out.println("\n\nGuncel Tahil Listesi");
				// Cereals5.CerealsListGoster(Cereals5List);
				break;
			default:
				System.out.println("CIKIS YAPILDI");
				kontrol = false;
				break;
			}

		}

	}

	private static void GetListele() {
		// TODO Auto-generated method stub
		
	}

}
