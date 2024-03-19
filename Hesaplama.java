public class Hesaplama {
    public int HarcHesapla(int dersSayisi) {
            int harc = dersSayisi * 200;
            return harc;
        }
        public int HarcHesapla(int dersSayisi, int uzatilanYil) {
            int harc = (dersSayisi * 200) + (uzatilanYil * 300);
            return harc;
        }
}


