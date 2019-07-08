public class Ogrenci extends Personel {
    private  int ogrenciNo ;

public Ogrenci(String ad, String  soyad, int yas, int ogrenciNo){
    super(ad, soyad, yas);
    this.ogrenciNo = ogrenciNo;
}

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }
    public String getGetirKimlikBilgisi(){
        return super.getGetirKimlikBilgisi() + "\t\tOgrenci no : " +ogrenciNo ;
    }
}