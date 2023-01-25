package paket2;

import java.util.ArrayList;
import paket1.Listeleme;

public class Urunler {
	protected static String Adi;
	protected static int KategoriIndex;
	protected static String BirimAgirligi;
	protected static Double BirimFiyati;
	protected static int StokMiktari;
	protected static String KategoriAdi;
	protected static String Detay;

	static ArrayList<Beverages1> Beverages1List = new ArrayList<>();
	static ArrayList<Contiments2> Contiments2List = new ArrayList<>();
	static ArrayList<Confections3> Confections3List = new ArrayList<>();
	static ArrayList<DairyProducts4> DairyProducts4List = new ArrayList<>();
	static ArrayList<Cereals5> Cereals5List = new ArrayList<>();

	public Urunler(String adi, int kategoriIndex, String birimAgirligi, Double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay) {
		super();
		Adi = adi;
		KategoriIndex = kategoriIndex;
		BirimAgirligi = birimAgirligi;
		BirimFiyati = birimFiyati;
		StokMiktari = stokMiktari;
		KategoriAdi = kategoriAdi;
		Detay = detay;
		ListeleriOlustur();
		System.out.println(Adi+"\t"+KategoriIndex+"\t"+BirimAgirligi+"\t"+BirimFiyati+"\t"+StokMiktari+"\t"+KategoriAdi+"\t"+Detay);
	}

	protected static void ListeleriOlustur() {
		if (KategoriIndex == 1) {
			Beverages1 yeniUrun = null;
			Beverages1List.add(yeniUrun);
		} else if (KategoriIndex == 2) {
			Contiments2 yeniUrun = null;
			Contiments2List.add(yeniUrun);
		} else if (KategoriIndex == 3) {
			Confections3 yeniUrun = null;
			Confections3List.add(yeniUrun);
		} else if (KategoriIndex == 4) {
			DairyProducts4 yeniUrun = null;
			DairyProducts4List.add(yeniUrun);
		} else if (KategoriIndex == 5) {
			Cereals5 yeniUrun = null;
			Cereals5List.add(yeniUrun);
		}
		
	}

	
	
	
	

	public static void GetUrunFiyatGuncelle(String urunAdi, Double guncelFiyat) {
		String UrunAdi = urunAdi;
		Double GuncelFiyat = guncelFiyat;
		UrunFiyatGuncelle(UrunAdi, GuncelFiyat);
	}

	private static void UrunFiyatGuncelle(String UrunAdi, Double GuncelFiyat) {
		boolean kontrol = true;
		for (Beverages1 beverages : Beverages1List) {
			System.out.println(UrunAdi);
			System.out.println(beverages.Adi);
			if (beverages.Adi.compareTo(UrunAdi) == 0) {
				kontrol = false;
				System.out.println("\nBeverages Listesi :");
				// Beverages1.BeveragesListGoster(Beverages1List);
				beverages.BirimFiyati = GuncelFiyat;
				System.out.println("\n\nGuncel Beverages Listesi :");
				// Beverages1.BeveragesListGoster(Beverages1List);
				break;
			}
		}
		for (Contiments2 condiments : Contiments2List) {
			if (condiments.Adi.compareTo(UrunAdi) == 0) {
				kontrol = false;
				System.out.println("\nCondiments Listesi :");
				// Contiments2.ContimentsListGoster(Contiments2List);
				condiments.BirimFiyati = GuncelFiyat;
				System.out.println("\n\nGuncel Condiments Listesi :"); // Contiments2.ContimentsListGoster(Contiments2List);
				break;
			}
		}
		for (Confections3 confections : Confections3List) {
			if (confections.Adi.compareTo(UrunAdi) == 0) {
				kontrol = false;
				System.out.println("\nConfections Listesi :");
				// Confections3.ConfectionsListGoster(Confections3List);
				confections.BirimFiyati = GuncelFiyat;
				System.out.println("\n\nGuncel Confections3 Listesi :");
				// Confections3.ConfectionsListGoster(Confections3List);
			}
		}
		for (DairyProducts4 dairyProducts : DairyProducts4List) {
			if (dairyProducts.Adi.compareTo(UrunAdi) == 0) {
				kontrol = false;
				System.out.println("\nDairyProducts Listesi :");
				// DairyProducts4.DairyProductsListGoster(DairyProducts4List);
				dairyProducts.BirimFiyati = GuncelFiyat;
				System.out.println("\n\nGuncel DairyProducts Listesi :");
				// DairyProducts4.DairyProductsListGoster(DairyProducts4List);
			}
		}
		for (Cereals5 cereals : Cereals5List) {
			if (cereals.Adi.compareTo(UrunAdi) == 0) {
				kontrol = false;
				System.out.println("\nCereals Listesi :");
				// Cereals5.CerealsListGoster(Cereals5List);
				cereals.BirimFiyati = GuncelFiyat;
				System.out.println("\n\nGuncel Cereals Listesi :");
				// Cereals5.CerealsListGoster(Cereals5List);
			}
		}
		if (kontrol) {
			System.out.println("Girdiginiz isimde urun bulunamamaktadir :((");
		}
	}
//
//	private static void UrunKategorikZamYap(String KategoriAdi, int x) {
//		if (KategoriAdi.compareTo("Beverages") == 0) {
//			System.out.println("\nBeverages Listesi :");
//			// Beverages1.BeveragesListGoster(Beverages1List);
//			for (Beverages1 beverages : Beverages1List) {
//				beverages.BirimFiyati += beverages.BirimFiyati * x / 100;
//			}
//			System.out.println("\n\nGuncel Beverages Listesi :");
//			// Beverages1.BeveragesListGoster(Beverages1List);
//		} else if (KategoriAdi.compareTo("Condiments") == 0) {
//			System.out.println("\nCondiments Listesi :");
//			// Contiments2.ContimentsListGoster(Contiments2List);
//			for (Contiments2 condiments : Contiments2List) {
//				condiments.BirimFiyati += condiments.BirimFiyati * x / 100;
//			}
//			System.out.println("\n\nGuncel Condiments Listesi :");
//			// Contiments2.ContimentsListGoster(Contiments2List);
//		} else if (KategoriAdi.compareTo("Confections") == 0) {
//			System.out.println("\nConfections Listesi :");
//			// Confections3.ConfectionsListGoster(Confections3List);
//			for (Confections3 confections : Confections3List) {
//				confections.BirimFiyati += confections.BirimFiyati * x / 100;
//			}
//			System.out.println("\n\nGuncel Confections Listesi :");
//			// Confections3.ConfectionsListGoster(Confections3List);
//		} else if (KategoriAdi.compareTo("DairyProducts") == 0) {
//			System.out.println("\nDairyProducts Listesi :");
//			// DairyProducts4.DairyProductsListGoster(DairyProducts4List);
//			for (DairyProducts4 dairyProducts : DairyProducts4List) {
//				dairyProducts.BirimFiyati += dairyProducts.BirimFiyati * x / 100;
//			}
//			System.out.println("\n\nGuncel DairyProducts Listesi :");
//			// DairyProducts4.DairyProductsListGoster(DairyProducts4List);
//		} else if (KategoriAdi.compareTo("Grains/Cereals") == 0) {
//			System.out.println("\nCereals Listesi :");
//			// Cereals5.CerealsListGoster(Cereals5List);
//			for (Cereals5 cereals : Cereals5List) {
//				cereals.BirimFiyati += cereals.BirimFiyati * x / 100;
//			}
//			System.out.println("\n\nGuncel Cereals Listesi :");
//			// Cereals5.CerealsListGoster(Cereals5List);
//		} else {
//			System.out.println("Girdiginiz isimde bir kategori bulunmamaktadir :(");
//		}
//
//	}
}
