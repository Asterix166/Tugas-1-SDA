import java.util.ArrayList;
public class soal4 {
    public static void main(String[] args) {
    //String[] nama = {"j","a","y","a"};
    ArrayList<String> nama = new ArrayList<String>();
    nama.add("j");
    nama.add("a");
    nama.add("y");
    nama.add("a");
    
    System.out.println(nama.indexOf("a"));
    System.out.println(nama.indexOf("c"));
    System.out.println(nama.indexOf("q"));
    }
}
