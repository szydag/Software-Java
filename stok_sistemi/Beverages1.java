package stok_sistemi;

import java.util.ArrayList;

public class Beverages1 extends Urunler {
	public String KategoriAdi;
	public String Detay;

	public static void BeveragesListGoster(ArrayList<Beverages1> BeveragesList) {

		for (Beverages1 beverages : BeveragesList) {
			System.out.println(beverages.Adi + "\t" + beverages.KategoriIndex + "\t" + beverages.BirimAgirligi + "\t"
					+ beverages.BirimFiyati + "\t" + beverages.StokMiktari + "\t" + beverages.KategoriAdi + "\t"
					+ beverages.Detay);
		}
	}

	public static void IcecekStokGuncelle(int index, boolean SatisMi, int miktar,
			ArrayList<Beverages1> BeveragesList) {
		boolean kontrol = true;
		int i=1;
		for (Beverages1 beverages : BeveragesList) {
			if (i == index) {
				kontrol = false;
                if(SatisMi) {
                	beverages.StokMiktari-=miktar;
                }else {
                	beverages.StokMiktari+=miktar;
                }
			}
			i++;
		}
		if(kontrol) {
			System.out.println("\n\nGirdiginiz indexte icecek bulunmadi :((");
		}
	}
}
