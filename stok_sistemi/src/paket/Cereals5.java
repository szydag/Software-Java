package paket;

import java.util.ArrayList;

public class Cereals5 extends Urunler {
	public String KategoriAdi;
	public String Detay;

	public static void CerealsListGoster(ArrayList<Cereals5> CerealsList) {

		for (Cereals5 cereals : CerealsList) {
			System.out.println(cereals.Adi + "\t" + cereals.KategoriIndex + "\t" + cereals.BirimAgirligi + "\t"
					+ cereals.BirimFiyati + "\t" + cereals.StokMiktari + "\t" + cereals.KategoriAdi + "\t"
					+ cereals.Detay);
		}
	}

	public static void TahilUrunEkle(String Adi, String BirimAgirligi, Double BirimFiyati, int StokMiktari,
			ArrayList<Cereals5> CerealsList) {
		Cereals5 yeniTahil = new Cereals5();
		yeniTahil.Adi = Adi;
		yeniTahil.KategoriIndex = 5;
		yeniTahil.BirimAgirligi = BirimAgirligi;
		yeniTahil.BirimFiyati = BirimFiyati;
		yeniTahil.StokMiktari = StokMiktari;
		yeniTahil.KategoriAdi = "Cere"
				+ "als";
		yeniTahil.Detay = " ";
		CerealsList.add(yeniTahil);
	}
}
