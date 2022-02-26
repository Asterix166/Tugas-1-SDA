import java.util.ArrayList;
public class soal3 {
    public static void main(String[] args) {
    //String[] nama = {"J","A","Y","A"};
    ArrayList<String> nama = new ArrayList<String>();
    nama.add("J");
    nama.add("A");
    nama.add("Y");
    nama.add("A");

    System.out.println(nama.get(0));
    System.out.println(nama.get(2));
    System.out.println(nama.get(6));
    System.out.println(nama.get(-3));
    }
}