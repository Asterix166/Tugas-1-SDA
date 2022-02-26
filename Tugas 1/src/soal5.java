import java.util.ArrayList;
public class soal5 {
    public static void main(String[] args) {
    //String[] nama = {"J","A","Y","A"};
    ArrayList<String> nama = new ArrayList<String>();
    nama.add("J");
    nama.add("A");
    nama.add("Y");
    nama.add("A");
    System.out.println("Array Sebelum di Remove = "+nama);
    
    //nama.remove(0);
    nama.remove(3);
    //nama.remove(2);
    System.out.println("Array Sesudah di Remove = "+nama);
    }
}
