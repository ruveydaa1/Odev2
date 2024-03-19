public class Ogrenci {
    private String ad;
    private String bolum;
    private int girisYili;
    private long ogrNo;
    private int gano;
    private int bolumKodu;
    private static int geciciSira = 0;

    public Ogrenci(String ad, String bolum, int girisYili, int ogrNo, int gano, int bolumKodu) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.ogrNo = ogrNo;
        this.gano = gano;
        this.bolumKodu = bolumKodu;

        geciciSira++;
        this.ogrNo = Long.parseLong(girisYili + "" + getBolumKodu() + String.format("%03d", geciciSira));
    }
    private String getBolumKoduBulma() {
        String bolumKoduBulma = this.bolum.toUpperCase().substring(0, Math.min(this.bolum.length(), 3));
        return bolumKoduBulma;
    }
    public long getOgrenciNo() {
        return ogrNo;
    }
    public Ogrenci(String ad, String bolum, int girisYili, int ogrNo, int gano) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.ogrNo = ogrNo;
        this.gano = gano;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public long getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(int ogrNo) {
        this.ogrNo = ogrNo;
    }

    public int getGano() {
        return gano;
    }

    public void setGano(int gano) {
        this.gano = gano;
    }

    public int getBolumKodu() {
        return bolumKodu;
    }

    public void setBolumKodu(int bolumKodu) {
        this.bolumKodu = bolumKodu;
    }
}
