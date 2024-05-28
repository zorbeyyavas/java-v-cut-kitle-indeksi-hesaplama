import java.text.DecimalFormat;
import java.util.Scanner;

public class vucutkitleindeksi {
    public static void main(String[] args) {
        //Vücut kitle endeksi (BKI) hesaplama
         Scanner al=new Scanner(System.in);
        double bki=0;
        System.out.println("kilonuzu giriniz(KG):");
        double kilo=al.nextDouble();
        System.out.println("boyunuzu giriniz(M):");
        double boy=al.nextDouble();
        
        bki=kilo/(boy*boy);
        System.out.println("BKI:");
        DecimalFormat format=new DecimalFormat("##,#00.0");
        System.out.println("BKI sonucunuz:"+bki);
    }
    
}
