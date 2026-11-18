public class PrintProduct extends Product {

    public PrintProduct(String[] products, int[][] sales) {
        super(products, sales);
    }

    public void printTotalSales() {
        System.out.println("TOTAL PRODUCT SALES: " + GetTotalProductsSold());
    }

    public void printAverageSales() {
        System.out.printf("AVERAGE PRODUCT SALES: %.0f%n", GetAverageProductsSold());
    }

    public void printMostPopularProduct() {
        String popular = GetMostPopularProduct();
        int index = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(popular)) {
                index = i;
                break;
            }
        }
        int peakMonth = getHighestSingleMonthSale(index);
        System.out.println("MOST POPULAR PRODUCT: " + popular + " (" + peakMonth + ")");
    }

    public void printReport() {
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("*********************************************");
        printTotalSales();
        printAverageSales();
        printMostPopularProduct();
    }
}
