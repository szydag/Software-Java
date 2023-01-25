package paket2;

import java.util.ArrayList;

public class Confections3 extends Urunler {

	public Confections3(String adi, int kategoriIndex, String birimAgirligi, Double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari, kategoriAdi, detay);
	}

	public static void ConfectionsListGoster() {

		for (Confections3 confections : Confections3List) {
			System.out.println(confections.Adi + "\t" + confections.KategoriIndex + "\t" + confections.BirimAgirligi
					+ "\t" + confections.BirimFiyati + "\t" + confections.StokMiktari + "\t" + confections.KategoriAdi
					+ "\t" + confections.Detay);
		}
	}

	protected static void SekerlemeDetayEkle(String yeniDetay, ArrayList<Confections3> ConfectionsList) {
		for (Confections3 confections : ConfectionsList) {
			confections.Detay += ",";
			confections.Detay += yeniDetay;
		}
	}
}
