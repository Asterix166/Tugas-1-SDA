import java.util.ArrayList;
public class soal6 {
    public static void main(String[] args) {
    //String[] nama = {"J","A","Y","A"};
    ArrayList<String> nama = new ArrayList<String>();
    nama.add("J");
    nama.add("A");
    nama.add("Y");
    nama.add("A");
    System.out.println("Array Sebelum ditambahkan = "+nama);

    nama.add(0,"e");
    System.out.println("Array setelah ditambahkan e =" + nama);

    nama.add(2,"f");
    System.out.println("Array setelah ditambahkan f =" + nama);

    nama.add(3,"g");
    System.out.println("Array setelah ditambahkan g =" + nama);

    nama.add(4,"h");
    System.out.println("Array setelah ditambahkan h =" + nama);

    nama.add(6,"h");
    System.out.println("Array setelah ditambahkan h =" + nama);

    nama.add(-3,"j");
    System.out.println("Array setelah menambahkan j =" + nama);
    }
}
