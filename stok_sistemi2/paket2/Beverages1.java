package paket2;

import java.util.ArrayList;

public class Beverages1 extends Urunler {

	public Beverages1(String adi, int kategoriIndex, String birimAgirligi, Double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari, kategoriAdi, detay);
		
	}

	public static void BeveragesListGoster() {

		for (Beverages1 beverages : Beverages1List) {
			System.out.println(beverages.Adi + "\t" + beverages.KategoriIndex + "\t" + beverages.BirimAgirligi + "\t"
					+ beverages.BirimFiyati + "\t" + beverages.StokMiktari + "\t" + beverages.KategoriAdi + "\t"
					+ beverages.Detay);
		}
	}

	protected static void IcecekStokGuncelle(int index, boolean SatisMi, int miktar,
			ArrayList<Beverages1> BeveragesList) {
		boolean kontrol = true;
		int i = 1;
		for (Beverages1 beverages : BeveragesList) {
			if (i == index) {
				kontrol = false;
				if (SatisMi) {
					beverages.StokMiktari -= miktar;
				} else {
					beverages.StokMiktari += miktar;
				}
			}
			i++;
		}
		if (kontrol) {
			System.out.println("\n\nGirdiginiz indexte icecek bulunmadi :((");
		}
	}

}
