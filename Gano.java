public class Gano {
    public double HarcHesapla(int dersSayisi) {
        double harc = dersSayisi * 200;
        return harc;
    }
    public double HarcHesapla(int dersSayisi, int uzatilanYil) {
        double harc = (dersSayisi * 200) + (uzatilanYil * 300);
        return harc;
    }

    public static void main(String[] args) {
        Ogrenci[] ogrenciler = {
                new Ogrenci("Ece","PC MÜH.",2023,2023123015,3),
                new Ogrenci("Ruveyda","PC MÜH.",2023,2023123005,3)
        };

        System.out.println("\n Ogrencilerin bilgileri" );

        for (Ogrenci ogrenci : ogrenciler) {
            System.out.println("\nAd: " + ogrenci.getAd());
            System.out.print(" Bölüm: " + ogrenci.getBolum());
            System.out.print(" Başlangıç Yılı: " + ogrenci.getGirisYili());
            System.out.print(" Öğrenci No: " + ogrenci.getOgrenciNo());
            System.out.print(" Gano: " + ogrenci.getGano());
            System.out.println("");
        }

        int gano = 3;
        if(gano>4 || gano<0){
            throw new IllegalArgumentException("GANO GEÇERSİZ!");
        }

            Hesaplama hesapla = new Hesaplama();

            double harc1 = hesapla.HarcHesapla(7, 1);
            System.out.println("\n1.ogrencinin harc miktarı: " + harc1 + " TL");
            double harc2 = hesapla.HarcHesapla(5);
            System.out.println("2.ogrencinin harc miktarı : " + harc2 + " TL ");
    }
}

