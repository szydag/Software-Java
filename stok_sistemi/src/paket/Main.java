package paket;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Beverages1> Beverages1List = new ArrayList<>();
		ArrayList<Contiments2> Contiments2List = new ArrayList<>();
		ArrayList<Confections3> Confections3List = new ArrayList<>();
		ArrayList<DairyProducts4> DairyProducts4List = new ArrayList<>();
		ArrayList<Cereals5> Cereals5List = new ArrayList<>();
		String KategoriAdi1 = null;
		String Detay1 = null;
		String KategoriAdi2 = null;
		String Detay2 = null;
		String KategoriAdi3 = null;
		String Detay3 = null;
		String KategoriAdi4 = null;
		String Detay4 = null;
		String KategoriAdi5 = null;
		String Detay5 = null;
		FileReader okuyucu = new FileReader("UrunGrubu.txt");
		try (BufferedReader buffer = new BufferedReader(okuyucu)) {
			String satir = buffer.readLine();
			while (satir != null) {
				String[] dizi = satir.split(" ");

				if (Integer.valueOf(dizi[0]) == 1) {
					KategoriAdi1 = dizi[1];
					Detay1 = dizi[2];
				} else if (Integer.valueOf(dizi[0]) == 2) {
					KategoriAdi2 = dizi[1];
					Detay2 = dizi[2];
				} else if (Integer.valueOf(dizi[0]) == 3) {
					KategoriAdi3 = dizi[1];
					Detay3 = dizi[2];
				} else if (Integer.valueOf(dizi[0]) == 4) {
					KategoriAdi4 = dizi[1];
					Detay4 = dizi[2];
				} else if (Integer.valueOf(dizi[0]) == 5) {
					KategoriAdi5 = dizi[1];
					Detay5 = dizi[2];
				}
				satir = buffer.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		FileReader okuyucu1 = new FileReader("Urunler.txt");
		try (BufferedReader buffer = new BufferedReader(okuyucu1)) {
			String satir = buffer.readLine();
			while (satir != null) {
				String[] dizi = satir.split(" ");
				if (Integer.valueOf(dizi[1]) == 1) {
					Beverages1 beverages = new Beverages1();
					beverages.Adi = dizi[0];
					beverages.KategoriIndex = Integer.valueOf(dizi[1]);
					beverages.BirimAgirligi = dizi[2];
					beverages.BirimFiyati = Double.valueOf(dizi[3]);
					beverages.StokMiktari = Integer.valueOf(dizi[4]);
					beverages.KategoriAdi = KategoriAdi1;
					beverages.Detay = Detay1;
					Beverages1List.add(beverages);
				} else if (Integer.valueOf(dizi[1]) == 2) {
					Contiments2 contiments = new Contiments2();
					contiments.Adi = dizi[0];
					contiments.KategoriIndex = Integer.valueOf(dizi[1]);
					contiments.BirimAgirligi = dizi[2];
					contiments.BirimFiyati = Double.valueOf(dizi[3]);
					contiments.StokMiktari = Integer.valueOf(dizi[4]);
					contiments.KategoriAdi = KategoriAdi2;
					contiments.Detay = Detay2;
					Contiments2List.add(contiments);
				} else if (Integer.valueOf(dizi[1]) == 3) {
					Confections3 confections = new Confections3();
					confections.Adi = dizi[0];
					confections.KategoriIndex = Integer.valueOf(dizi[1]);
					confections.BirimAgirligi = dizi[2];
					confections.BirimFiyati = Double.valueOf(dizi[3]);
					confections.StokMiktari = Integer.valueOf(dizi[4]);
					confections.KategoriAdi = KategoriAdi3;
					confections.Detay = Detay3;
					Confections3List.add(confections);
				} else if (Integer.valueOf(dizi[1]) == 4) {
					DairyProducts4 dairyProducts = new DairyProducts4();
					dairyProducts.Adi = dizi[0];
					dairyProducts.KategoriIndex = Integer.valueOf(dizi[1]);
					dairyProducts.BirimAgirligi = dizi[2];
					dairyProducts.BirimFiyati = Double.valueOf(dizi[3]);
					dairyProducts.StokMiktari = Integer.valueOf(dizi[4]);
					dairyProducts.KategoriAdi = KategoriAdi4;
					dairyProducts.Detay = Detay4;
					DairyProducts4List.add(dairyProducts);
				} else if (Integer.valueOf(dizi[1]) == 5) {
					Cereals5 cereals = new Cereals5();
					cereals.Adi = dizi[0];
					cereals.KategoriIndex = Integer.valueOf(dizi[1]);
					cereals.BirimAgirligi = dizi[2];
					cereals.BirimFiyati = Double.valueOf(dizi[3]);
					cereals.StokMiktari = Integer.valueOf(dizi[4]);
					cereals.KategoriAdi = KategoriAdi5;
					cereals.Detay = Detay5;
					Cereals5List.add(cereals);
				}
				satir = buffer.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Scanner girdi = new Scanner(System.in);
		boolean kontrol = true;
		while (kontrol) {
			System.out.println(
					"\n\n***************************************************************************************************************************");
			System.out.println("\nYapmak istediginiz islemi seciniz");
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
				Urunler.UrunFiyatGuncelle(urunAdi, guncelFiyat, Beverages1List, Contiments2List, Confections3List,
						DairyProducts4List, Cereals5List);
				break;
			case 2:
				System.out.println(KategoriAdi1);
				System.out.println(KategoriAdi2);
				System.out.println(KategoriAdi3);
				System.out.println(KategoriAdi4);
				System.out.println(KategoriAdi5);
				System.out.println("Zam yapmak istediginiz kategorinin adini giriniz: ");
				String KategoriAdi = girdi.next();
				System.out.println("Ilgili kategoriye ne kadar zam yapicaksiniz: ");
				int x = girdi.nextInt();
				Urunler.UrunKategorikZamYap(KategoriAdi, x, Beverages1List, Contiments2List, Confections3List,
						DairyProducts4List, Cereals5List);
				break;
			case 3:
				System.out.println("\n\n Icecek Listesi\n");
				Beverages1.BeveragesListGoster(Beverages1List);
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
				Beverages1.IcecekStokGuncelle(index, SatisMi, miktar, Beverages1List);
				System.out.println("\n\n Guncellenmis Icecek Listesi\n");
				Beverages1.BeveragesListGoster(Beverages1List);
				break;
			case 4:
				System.out.println("\n\nCesni Listesi\n");
				Contiments2.ContimentsListGoster(Contiments2List);
				System.out.println("\nCesninin yeni agirligini giriniz: ");
				String yeniAgirlik = girdi.next();
				Contiments2.CesniBirimAgirlikGuncelle(yeniAgirlik, Contiments2List);
				System.out.println("\n\nGuncel Cesni Listesi\n");
				Contiments2.ContimentsListGoster(Contiments2List);
				break;
			case 5:
				System.out.println("\n\nSekerleme Listesi");
				Confections3.ConfectionsListGoster(Confections3List);
				System.out.println("Seker kategorisine eklemek istediginiz detayi giriniz: ");
				String yeniDetay = girdi.next();
				Confections3.SekerlemeDetayEkle(yeniDetay, Confections3List);
				System.out.println("\n\nGuncel Sekerleme Listesi");
				Confections3.ConfectionsListGoster(Confections3List);

				break;
			case 6:
				System.out.println("\n\nSut Listesi\n");
				DairyProducts4.DairyProductsListGoster(DairyProducts4List);
				System.out.println("\nSilmek istediginiz sut urunun adini giriniz");
				String urunAdi1 = girdi.next();
				DairyProducts4.SutUrunuSil(urunAdi1, DairyProducts4List);
				System.out.println("\n\nGuncel Sut Listesi\n");
				DairyProducts4.DairyProductsListGoster(DairyProducts4List);

				break;
			case 7:
				System.out.println("\n\nTahil Listesi");
				Cereals5.CerealsListGoster(Cereals5List);
				System.out.println("\nEklemek istediginiz tahilin adini giriniz: ");
				String Adi = girdi.next();
				System.out.println("Eklemek istediginiz tahilin birim agirligini giriniz:");
				String BirimAgirligi = girdi.next();
				System.out.println("Eklemek istediginiz tahilin birim fiyatini giriniz: ");
				Double BirimFiyati = girdi.nextDouble();
				System.out.println("Eklemek istediginiz tahilin stok miktarini giriniz: ");
				int StokMiktari = girdi.nextInt();
				Cereals5.TahilUrunEkle(Adi, BirimAgirligi, BirimFiyati, StokMiktari, Cereals5List);
				System.out.println("\n\nGuncel Tahil Listesi");
				Cereals5.CerealsListGoster(Cereals5List);
				break;
			default:
				System.out.println("CIKIS YAPILDI");
				kontrol = false;
				break;
			}

		}

	}

}
