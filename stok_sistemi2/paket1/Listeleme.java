package paket1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import paket2.Beverages1;
import paket2.Cereals5;
import paket2.Confections3;
import paket2.Contiments2;
import paket2.DairyProducts4;
import paket2.Urunler;

public class Listeleme {
	public static void GetListele() throws FileNotFoundException {
		ListeleriOku();
	}

	protected static void ListeleriOku() throws FileNotFoundException {
		
		String KategoriAdi1 = null;
		String Detay1 = null;
		String KategoriAdi2 = null;
		String Detay2 = null;
		String KategoriAdi3 = null;
		String Detay3 = null;
		String KategoriAdi4 = null;
		String Detay4 = null;
		String KategoriAdi5 = null;
		String Detay5 = null;
		FileReader okuyucu1 = new FileReader("UrunGrubu.txt");
		try (BufferedReader buffer = new BufferedReader(okuyucu1)) {
			String satir = buffer.readLine();
			while (satir != null) {
				String[] dizi = satir.split(" ");
				if (Integer.valueOf(dizi[0]) == 1) {
					KategoriAdi1 = dizi[1];
					Detay1 = dizi[2];
				} else if (Integer.valueOf(dizi[0]) == 2) {
					KategoriAdi2 = dizi[1];
					Detay2 = dizi[2];
				} else if (Integer.valueOf(dizi[0]) == 3) {
					KategoriAdi3 = dizi[1];
					Detay3 = dizi[2];
				} else if (Integer.valueOf(dizi[0]) == 4) {
					KategoriAdi4 = dizi[1];
					Detay4 = dizi[2];
				} else if (Integer.valueOf(dizi[0]) == 5) {
					KategoriAdi5 = dizi[1];
					Detay5 = dizi[2];
				}
				satir = buffer.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		FileReader okuyucu = new FileReader("Urunler.txt");
		try (BufferedReader buffer = new BufferedReader(okuyucu)) {
			String satir = buffer.readLine();
			while (satir != null) {
				String[] dizi = satir.split(" ");

				if (Integer.valueOf(dizi[1]) == 1) {
					Urunler yeniUrun = new Urunler(dizi[0], 1, dizi[2], Double.valueOf(dizi[3]),
							Integer.valueOf(dizi[4]), KategoriAdi1, Detay1);
				} else if (Integer.valueOf(dizi[1]) == 2) {
					Urunler yeniUrun = new Urunler(dizi[0], 2, dizi[2], Double.valueOf(dizi[3]),
							Integer.valueOf(dizi[4]), KategoriAdi2, Detay2);
				} else if (Integer.valueOf(dizi[1]) == 3) {
					Urunler yeniUrun = new Urunler(dizi[0], 3, dizi[2], Double.valueOf(dizi[3]),
							Integer.valueOf(dizi[4]), KategoriAdi3, Detay3);
				} else if (Integer.valueOf(dizi[1]) == 4) {
					Urunler yeniUrun = new Urunler(dizi[0], 4, dizi[2], Double.valueOf(dizi[3]),
							Integer.valueOf(dizi[4]), KategoriAdi4, Detay4);
				} else if (Integer.valueOf(dizi[1]) == 5) {
					Urunler yeniUrun = new Urunler(dizi[0], 5, dizi[2], Double.valueOf(dizi[3]),
							Integer.valueOf(dizi[4]), KategoriAdi5, Detay5);
				}
				satir = buffer.readLine();
			}		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
