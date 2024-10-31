
package scannerbaitap2;
import java.util.Scanner;
public class ScannerbaiTap2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhap vao mot chuoi: ");
        if (scanner.hasNext()){
            String chuoi = scanner.next();
            System.out.println("Chuoi da nhap : " + chuoi);
        }else{
            system.out.println(" Du lieu da nhap khong hop le. ");
        }
        scanner.close();
    }
    
}
