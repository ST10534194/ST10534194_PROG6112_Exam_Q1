import java.util.Scanner;

public class ProductSalesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = {
                "Cozy Nights Monarch",
                "Restonic Barbados",
                "Sealy Phuket"
        };
        int[][] sales = new int[3][3];

        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + products[i] + " mattress: ");
                sales[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        PrintProduct report = new PrintProduct(products, sales);
        report.printReport();

        scanner.close();
    }
}
