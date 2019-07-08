public class Personel {

    private String ad;
    private String soyad;
    private int yas;


public Personel(String ad, String soyad, int yas){
    this.ad = ad;
    this.soyad = soyad;
    this.yas = yas;
}
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
    public String getGetirKimlikBilgisi(){
    return "Ad: " + ad + "\t\tSoyad: " + soyad + "\t\tYas: " + yas ;
    }
}