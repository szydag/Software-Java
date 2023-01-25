package paket;

import java.util.ArrayList;

public class DairyProducts4 extends Urunler {
	public String KategoriAdi;
	public String Detay;

	public static void DairyProductsListGoster(ArrayList<DairyProducts4> DairyProductsList) {

		for (DairyProducts4 dairyProducts : DairyProductsList) {
			System.out.println(dairyProducts.Adi + "\t" + dairyProducts.KategoriIndex + "\t"
					+ dairyProducts.BirimAgirligi + "\t" + dairyProducts.BirimFiyati + "\t" + dairyProducts.StokMiktari
					+ "\t" + dairyProducts.KategoriAdi + "\t" + dairyProducts.Detay);
		}
	}
	
	public static void SutUrunuSil(String urunAdi,ArrayList<DairyProducts4> DairyProductsList) {
		boolean kontrol = true;
		for (DairyProducts4 dairyProducts : DairyProductsList) {
			if(dairyProducts.Adi.compareTo(urunAdi)==0) {
				kontrol = false;
				DairyProductsList.remove(dairyProducts);
				break;
			}
		}
		if(kontrol) {
			System.out.println("\n\nGirdiginiz isimde sut urunu bulunamadi :((");
		}
	}
}
