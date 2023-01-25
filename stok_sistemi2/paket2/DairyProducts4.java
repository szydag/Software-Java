package paket2;

import java.util.ArrayList;

public class DairyProducts4 extends Urunler {

	public DairyProducts4(String adi, int kategoriIndex, String birimAgirligi, Double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari, kategoriAdi, detay);
		
	}

	public static void DairyProductsListGoster() {

		for (DairyProducts4 dairyProducts : DairyProducts4List) {
			System.out.println(dairyProducts.Adi + "\t" + dairyProducts.KategoriIndex + "\t"
					+ dairyProducts.BirimAgirligi + "\t" + dairyProducts.BirimFiyati + "\t" + dairyProducts.StokMiktari
					+ "\t" + dairyProducts.KategoriAdi + "\t" + dairyProducts.Detay);
		}
	}

	protected static void SutUrunuSil(String urunAdi, ArrayList<DairyProducts4> DairyProductsList) {
		boolean kontrol = true;
		for (DairyProducts4 dairyProducts : DairyProductsList) {
			if (dairyProducts.Adi.compareTo(urunAdi) == 0) {
				kontrol = false;
				DairyProductsList.remove(dairyProducts);
				break;
			}
		}
		if (kontrol) {
			System.out.println("\n\nGirdiginiz isimde sut urunu bulunamadi :((");
		}
	}
}
