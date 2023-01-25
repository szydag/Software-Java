package stok_sistemi;

import java.util.ArrayList;

public class Contiments2 extends Urunler {
	public String KategoriAdi;
	public String Detay;

	public static void ContimentsListGoster(ArrayList<Contiments2> ContimentsList) {

		for (Contiments2 contiments : ContimentsList) {
			System.out.println(contiments.Adi + "\t" + contiments.KategoriIndex + "\t" + contiments.BirimAgirligi + "\t"
					+ contiments.BirimFiyati + "\t" + contiments.StokMiktari + "\t" + contiments.KategoriAdi + "\t"
					+ contiments.Detay);
		}
	}
	
	public static void CesniBirimAgirlikGuncelle(String yeniAgirlik, ArrayList<Contiments2> ContimentsList) {
		ContimentsList.get(ContimentsList.size()-1).BirimAgirligi=yeniAgirlik;
	}
}
