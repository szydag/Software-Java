import java.util.ArrayList;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

public class main {
	private static final String FILE_NAME = "urunListesi.xlsx";

	public static void main(String[] args) {
		ArrayList<urun> urunList = new ArrayList<urun>();
		Scanner girdi = new Scanner(System.in);
		boolean kontrol = true;
		while (kontrol) {
			System.out.println("\n\nYapmak istediginiz islemi seciniz:");
			System.out.println("1- Liste Olustur");
			System.out.println("2- Yeni kategori liste Olustur");
			System.out.println("3- Birim fiyat guncelle");
			System.out.println("4- Stok guncelle");
			System.out.println("5- Urun sil");
			System.out.println("6- Cikis yap");
			int islem = girdi.nextInt();
			switch (islem) {
			case 1:
				ListeOlustur(urunList);
				Yazdir(urunList);
				break;
			case 2:
				if (urunList.size() == 0) {
					System.out.println("Henuz dosya okunup urun listesi olusturulmadi ");
				} else {
					System.out.println("Artan adet bilgisine gore kategorik liste: ");
					KategorikGoster(urunList);
				}
				break;
			case 3:
				if (urunList.size() == 0) {
					System.out.println("Henuz dosya okunup urun listesi olusturulmadi");
				} else {
					System.out.println(
							"Zam/indirim yapmak istedigiz kategorinin index bilgisini giriniz(1 ile 8 arasinda):");
					int index = girdi.nextInt();
					System.out.print("Ilgili urunlere ne kadar zam/indirim yapmak istersiniz:");
					int x = girdi.nextInt();
					BirimFiyatGuncelle(urunList, index, x);
					System.out.println("Birim Fiyata gore guncellenmis liste");
					Yazdir(urunList);
				}
				break;
			case 4:
				if (urunList.size() == 0) {
					System.out.println("Henuz dosya okunup urun listesi olusturulmadi");
				} else {
					girdi.nextLine();
					System.out.println("Stok miktari degisen urunun adini giriniz:");
					String urunAdi = girdi.nextLine();
					System.out.println("degisim mikarini giriniz");
					int adet = girdi.nextInt();
					System.out.println("Alis(0) mi Satis(1) Mi");
					int SatisMi= girdi.nextInt();
					if(SatisMi==1) {
                       StokGuncelle(urunList, urunAdi, adet, true);
					}else {
						StokGuncelle(urunList, urunAdi, adet, false);
					}
				}
				break;
			case 5:
				if (urunList.size() == 0) {
					System.out.println("Henuz dosya okunup urun listesi olusturulmadi");
				} else {
					System.out.println("Silmek istediginiz kategorinin index bilgisini giriniz:");
					int kategoriIndex = girdi.nextInt();
					UrunSil(urunList, kategoriIndex);
				}
				break;
			default:
				System.out.println("CIKIS YAPILDI");
				kontrol = false;
			}

		}
	}

	public static void Yazdir(ArrayList<urun> urunList) {
		int satir = 1;
		for (urun urun : urunList) {
			System.out.println(satir + "\t" + urun.Adi + "\t\t\t\t" + urun.KategoriIndex + "\t\t\t" + urun.BirimAgirligi
					+ "\t\t\t" + urun.BirimFiyati + "\t\t\t" + urun.StokMiktari);
			satir++;
		}
	}

	public static void ListeOlustur(ArrayList<urun> urunList) {
		if(urunList.size()>0) {
			urunList.clear();
		}
		urun yeniUrun = new urun();
		try {
			String[] dizi = new String[5];
			int[] diziint = new int[5];
			FileInputStream excelDosyasi = new FileInputStream(new File(FILE_NAME));
			Workbook workbook = new XSSFWorkbook(excelDosyasi);
			Sheet sayfa = workbook.getSheetAt(0);
			Iterator<Row> satir = sayfa.iterator();

			while (satir.hasNext()) {
				yeniUrun = new urun();
				Row mevcutSatir = satir.next();
				Iterator<Cell> sutun = mevcutSatir.iterator();
				int i = 0;
				while (sutun.hasNext()) {
					Cell hucre = sutun.next();
					if (hucre.getCellType() == CellType.STRING) {
						dizi[i] = hucre.getStringCellValue();
					} else if (hucre.getCellType() == CellType.NUMERIC) {
						diziint[i] =  (int) hucre.getNumericCellValue();
					} 
					i++;
				}
				yeniUrun.Adi = dizi[0];
				yeniUrun.KategoriIndex = diziint[1];
				yeniUrun.BirimAgirligi = dizi[2];
				yeniUrun.BirimFiyati = diziint[3];
				yeniUrun.StokMiktari = diziint[4];
				urunList.add(yeniUrun);
				yeniUrun = null;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void KategorikGoster(ArrayList<urun> urunList) {
		ArrayList<kategori> kategoriList = new ArrayList<kategori>();
		kategori yeniKategori = new kategori();
		for (int i = 1; i < 9; i++) {
			int sayac = 0;
			yeniKategori = new kategori();
			for (urun urun : urunList) {
				if (urun.KategoriIndex == i) {
					sayac++;
				}
			}
			yeniKategori.Adet = sayac;
			yeniKategori.index = i;
			kategoriList.add(yeniKategori);
			yeniKategori = null;
		}
		for (int i = 0; i < kategoriList.size(); i++) {
			for (int j = 0; j < kategoriList.size(); j++) {
				if (kategoriList.get(i).Adet < kategoriList.get(j).Adet) {
					kategori temp = kategoriList.get(i);
					kategoriList.set(i, kategoriList.get(j));
					kategoriList.set(j, temp);
				}
			}
		}
		System.out.println("Index\tAdet");
		for (kategori kategori : kategoriList) {
			System.out.println(kategori.index + "\t" + kategori.Adet);
		}
	}

	public static void BirimFiyatGuncelle(ArrayList<urun> urunList, int index, int x) {
		double enDusuk = urunList.get(0).BirimFiyati;
		double enYuksek = urunList.get(0).BirimFiyati;
		for (int i = 0; i < urunList.size(); i++) {
			if (urunList.get(i).KategoriIndex == index) {
				if (urunList.get(i).BirimFiyati < enDusuk) {
					enDusuk = urunList.get(i).BirimFiyati;
				} else if (urunList.get(i).BirimFiyati > enYuksek) {
					enYuksek = urunList.get(i).BirimFiyati;
				}
			}
		}
		for (urun urun : urunList) {
			if (urun.BirimFiyati == enDusuk) {
				urun.BirimFiyati += urun.BirimFiyati * x / 100;
			} else if (urun.BirimFiyati == enYuksek) {
				urun.BirimFiyati -= urun.BirimFiyati * x / 100;
			}
		}
	}

	public static void StokGuncelle(ArrayList<urun> urunList, String urunAdi, int adet, boolean SatisMi) {
		boolean isimKontrol = false;
		for (urun urun : urunList) {
			if (urun.Adi.compareTo(urunAdi)==0) {
				isimKontrol = true;
				if (SatisMi) {
					urun.StokMiktari -= adet;
				} else {
					urun.StokMiktari += adet;
				}
			}
		}
		if (isimKontrol) {
			Yazdir(urunList);
		} else {
			System.out.println("isim bulunamadi");
		}
	}

	public static void UrunSil(ArrayList<urun> urunList, int kategoriIndex) {
		int azStok = urunList.get(0).StokMiktari;
		int indexbilgisi = 0;
		for (urun urun : urunList) {
			if (urun.KategoriIndex == kategoriIndex) {
				if (urun.StokMiktari < azStok) {
					azStok = urun.StokMiktari;
					indexbilgisi = urunList.indexOf(urun);
				}
			}
		}
		urunList.remove(indexbilgisi);
		Yazdir(urunList);
	}
}
