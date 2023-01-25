package stok_sistemi;

import java.util.ArrayList;

public class Confections3 extends Urunler {
	public String KategoriAdi;
	public String Detay;

	public static void ConfectionsListGoster(ArrayList<Confections3> ConfectionsList) {

		for (Confections3 confections : ConfectionsList) {
			System.out.println(confections.Adi + "\t" + confections.KategoriIndex + "\t" + confections.BirimAgirligi
					+ "\t" + confections.BirimFiyati + "\t" + confections.StokMiktari + "\t" + confections.KategoriAdi
					+ "\t" + confections.Detay);
		}
	}

	public static void SekerlemeDetayEkle(String yeniDetay, ArrayList<Confections3> ConfectionsList) {
		for (Confections3 confections : ConfectionsList) {
			confections.Detay += ",";
			confections.Detay += yeniDetay;
		}
	}
}
