package paket2;

import java.util.ArrayList;

public class Cereals5 extends Urunler {

	public Cereals5(String adi, int kategoriIndex, String birimAgirligi, Double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari, kategoriAdi, detay);

	}


	public static void CerealsListGoster() {

		for (Cereals5 cereals : Cereals5List) {
			System.out.println(cereals.Adi + "\t" + cereals.KategoriIndex + "\t" + cereals.BirimAgirligi + "\t"
					+ cereals.BirimFiyati + "\t" + cereals.StokMiktari + "\t" + cereals.KategoriAdi + "\t"
					+ cereals.Detay);
		}
	}


//	protected static void TahilUrunEkle(String Adi, String BirimAgirligi, Double BirimFiyati, int StokMiktari,
//			ArrayList<Cereals5> CerealsList) {
//		Cereals5 yeniTahil = new Cereals5(BirimAgirligi, StokMiktari, BirimAgirligi, BirimFiyati, StokMiktari);
//		yeniTahil.Adi = Adi;
//		yeniTahil.KategoriIndex = 5;
//		yeniTahil.BirimAgirligi = BirimAgirligi;
//		yeniTahil.BirimFiyati = BirimFiyati;
//		yeniTahil.StokMiktari = StokMiktari;
//		yeniTahil.KategoriAdi = "Cere" + "als";
//		yeniTahil.Detay = " ";
//		CerealsList.add(yeniTahil);
//	}
}
