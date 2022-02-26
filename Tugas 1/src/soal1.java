public class soal1 {
    public static void main(String[] args) {
        //SOAL  1 ISEMPTY()
        String nama [] ;
        nama = new String [5];
        nama[0] = "J";
        nama[1] = "A";
        nama[2] = "Y";
        nama[3] = "A";
        //PERUMPAMAAN JIKA ADA ARRAY KOSONG
        nama[4] = "";
        System.out.println("nama [0] = "+nama[0].isEmpty());
        System.out.println("nama [1] = "+nama[1].isEmpty());
        System.out.println("nama [2] = "+nama[2].isEmpty());
        System.out.println("nama [3] = "+nama[3].isEmpty());
        System.out.println("nama [4] = "+nama[4].isEmpty());
        System.out.println("nama [5] = "+nama[5].isEmpty());
    }
}