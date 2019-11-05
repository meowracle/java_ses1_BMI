import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap vao chieu cao tinh theo met: ");
        double height = scanner.nextDouble();
        System.out.println("moi nhap vao can nang tinh theo kg: ");
        double weight = scanner.nextDouble();
        IBM ibm = new IBM(height, weight);
        ibm.displayResult();
    }
}
