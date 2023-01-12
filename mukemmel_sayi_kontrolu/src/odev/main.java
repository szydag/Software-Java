package odev;

public class main {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.print("P=" + i + "  =>  ");
			boolean asal = SayiAsalMi(i);
			if (asal) {
				int mukemmel = MukemmelSayiHesapla(i);
				System.out.println("\t     " + mukemmel + " Sayisinin bolenleri");
				BolenleriGoster(mukemmel);
			}
		}

	}

	static boolean SayiAsalMi(int P) {
		int us_degeri = UsHesapla(P);
		int kontrol_sayi = us_degeri - 1;
		if (kontrol_sayi == 1) {
			System.out.println(us_degeri + "-1" + "   Asal degildir\n\n");
			return false;
		}
		for (int i = 2; i < kontrol_sayi; i++) {
			if (kontrol_sayi % i == 0) {
				System.out.println("" + us_degeri + "-1" + "   Asal degildir\n\n");
				return false;
			}
		}
		System.out.println(us_degeri + "-1" + "   Asaldir");
		return true;
	}

	static int MukemmelSayiHesapla(int P) {
		int sonuc1 = UsHesapla(P - 1);
		System.out.println("\t   2^(" + P + "-1) = " + sonuc1);
		int sonuc2 = UsHesapla(P) - 1;
		System.out.println("\t   2^" + P + "-1 = " + sonuc2);
		int carpim = sonuc1 * sonuc2;
		System.out.println("\t   " + carpim + " Sayisi bir mukemmel sayidir:))");
		return carpim;
	}

	static int UsHesapla(int sayi) {
		int us_degeri = 1;
		for (int i = 0; i < sayi; i++) {
			us_degeri *= 2;
		}
		return us_degeri;
	}

	static void BolenleriGoster(int sayi) {
		System.out.print("\t   ");
		int toplam = 0;
		for (int i = 2; i <= sayi; i++) {
			if (sayi % i == 0) {
				int sonuc = sayi / i;
				toplam += sonuc;
				System.out.print("  " + "+" + sonuc);
			}
		}
		System.out.println("  =  " + toplam + "\n\n");
	}
}
