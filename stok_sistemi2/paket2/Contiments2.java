package paket2;

import java.util.ArrayList;

public class Contiments2 extends Urunler {


	
	public Contiments2(String adi, int kategoriIndex, String birimAgirligi, Double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari, kategoriAdi, detay);
	}

	public static void ContimentsListGoster() {

		for (Contiments2 contiments : Contiments2List) {
			System.out.println(contiments.Adi + "\t" + contiments.KategoriIndex + "\t" + contiments.BirimAgirligi + "\t"
					+ contiments.BirimFiyati + "\t" + contiments.StokMiktari + "\t" + contiments.KategoriAdi + "\t"
					+ contiments.Detay);
		}
	}

//	protected static void CesniBirimAgirlikGuncelle(String yeniAgirlik, ArrayList<Contiments2> ContimentsList) {
//		ContimentsList.get(ContimentsList.size() - 1).BirimAgirligi = yeniAgirlik;
//	}
}
