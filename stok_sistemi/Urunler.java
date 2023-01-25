package stok_sistemi;

import java.util.ArrayList;

public class Urunler {
	public String Adi;
	public int KategoriIndex;
	public String BirimAgirligi;
	public Double BirimFiyati;
	public int StokMiktari;

	public static void UrunFiyatGuncelle(String UrunAdi, double guncelFiyat, ArrayList<Beverages1> Beverages1List,
			ArrayList<Contiments2> Contiments2List, ArrayList<Confections3> Confections3List,
			ArrayList<DairyProducts4> DairyProducts4List, ArrayList<Cereals5> Cereals5List) {
		boolean kontrol = true;
		for (Beverages1 beverages : Beverages1List) {
			if (beverages.Adi.compareTo(UrunAdi) == 0) {
				kontrol=false;
				System.out.println("\nBeverages Listesi :");
				Beverages1.BeveragesListGoster(Beverages1List);
				beverages.BirimFiyati = guncelFiyat;
				System.out.println("\n\nGuncel Beverages Listesi :");
				Beverages1.BeveragesListGoster(Beverages1List);
				break;
			}
		}
		for (Contiments2 condiments : Contiments2List) {
			if (condiments.Adi.compareTo(UrunAdi) == 0) {
				kontrol=false;
				System.out.println("\nCondiments Listesi :");
				Contiments2.ContimentsListGoster(Contiments2List);
				condiments.BirimFiyati = guncelFiyat;
				System.out.println("\n\nGuncel Condiments Listesi :");
				Contiments2.ContimentsListGoster(Contiments2List);
				break;
			}
		}
		for (Confections3 confections : Confections3List) {
			if (confections.Adi.compareTo(UrunAdi) == 0) {
				kontrol=false;
				System.out.println("\nConfections Listesi :");
				Confections3.ConfectionsListGoster(Confections3List);
				confections.BirimFiyati = guncelFiyat;
				System.out.println("\n\nGuncel Confections3 Listesi :");
				Confections3.ConfectionsListGoster(Confections3List);
			}
		}
		for (DairyProducts4 dairyProducts : DairyProducts4List) {
			if (dairyProducts.Adi.compareTo(UrunAdi) == 0) {
				kontrol=false;
				System.out.println("\nDairyProducts Listesi :");
				DairyProducts4.DairyProductsListGoster(DairyProducts4List);
				dairyProducts.BirimFiyati = guncelFiyat;
				System.out.println("\n\nGuncel DairyProducts Listesi :");
				DairyProducts4.DairyProductsListGoster(DairyProducts4List);
			}
		}
		for (Cereals5 cereals : Cereals5List) {
			if (cereals.Adi.compareTo(UrunAdi) == 0) {
				kontrol=false;
				System.out.println("\nCereals Listesi :");
				Cereals5.CerealsListGoster(Cereals5List);
				cereals.BirimFiyati = guncelFiyat;
				System.out.println("\n\nGuncel Cereals Listesi :");
				Cereals5.CerealsListGoster(Cereals5List);
			}
		}
		if(kontrol) {
			System.out.println("Girdiginiz isimde urun bulunamamaktadir :((");
		}
	}

	public static void UrunKategorikZamYap(String KategoriAdi, int x, ArrayList<Beverages1> Beverages1List,
			ArrayList<Contiments2> Contiments2List, ArrayList<Confections3> Confections3List,
			ArrayList<DairyProducts4> DairyProducts4List, ArrayList<Cereals5> Cereals5List) {
		if (KategoriAdi.compareTo("Beverages") == 0) {
			System.out.println("\nBeverages Listesi :");
			Beverages1.BeveragesListGoster(Beverages1List);
			for (Beverages1 beverages : Beverages1List) {
				beverages.BirimFiyati += beverages.BirimFiyati * x / 100;
			}
			System.out.println("\n\nGuncel Beverages Listesi :");
			Beverages1.BeveragesListGoster(Beverages1List);
		} else if (KategoriAdi.compareTo("Condiments") == 0) {
			System.out.println("\nCondiments Listesi :");
			Contiments2.ContimentsListGoster(Contiments2List);
			for (Contiments2 condiments : Contiments2List) {
				condiments.BirimFiyati += condiments.BirimFiyati * x / 100;
			}
			System.out.println("\n\nGuncel Condiments Listesi :");
			Contiments2.ContimentsListGoster(Contiments2List);
		} else if (KategoriAdi.compareTo("Confections") == 0) {
			System.out.println("\nConfections Listesi :");
			Confections3.ConfectionsListGoster(Confections3List);
			for (Confections3 confections : Confections3List) {
				confections.BirimFiyati += confections.BirimFiyati * x / 100;
			}
			System.out.println("\n\nGuncel Confections Listesi :");
			Confections3.ConfectionsListGoster(Confections3List);
		} else if (KategoriAdi.compareTo("DairyProducts") == 0) {
			System.out.println("\nDairyProducts Listesi :");
			DairyProducts4.DairyProductsListGoster(DairyProducts4List);
			for (DairyProducts4 dairyProducts : DairyProducts4List) {
				dairyProducts.BirimFiyati += dairyProducts.BirimFiyati * x / 100;
			}
			System.out.println("\n\nGuncel DairyProducts Listesi :");
			DairyProducts4.DairyProductsListGoster(DairyProducts4List);
		} else if (KategoriAdi.compareTo("Grains/Cereals") == 0) {
			System.out.println("\nCereals Listesi :");
			Cereals5.CerealsListGoster(Cereals5List);
			for (Cereals5 cereals : Cereals5List) {
				cereals.BirimFiyati += cereals.BirimFiyati * x / 100;
			}
			System.out.println("\n\nGuncel Cereals Listesi :");
			Cereals5.CerealsListGoster(Cereals5List);
		} else {
			System.out.println("Girdiginiz isimde bir kategori bulunmamaktadir :(");
		}

	}
}
