public class Test {
    public static void main(String[] args){
        Personel personel =new Personel("Ali","Yılmaz",20);
        System.out.println(personel.getGetirKimlikBilgisi());
        Ogrenci ogrenci=new Ogrenci("Ahmet","Koç",19,245);
        System.out.println(ogrenci.getGetirKimlikBilgisi());

    }
}
