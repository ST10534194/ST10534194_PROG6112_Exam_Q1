public class Product implements IProduct {
    protected String[] products;
    protected int[][] sales;

    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductsSold() {
        int total = GetTotalProductsSold();
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            count += sales[i].length;
        }
        return (double) total / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int maxSales = -1;
        String mostPopular = "";

        for (int i = 0; i < products.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][j];
            }
            if (productTotal > maxSales) {
                maxSales = productTotal;
                mostPopular = products[i];
            }
        }
        return mostPopular;
    }

    public int getHighestSingleMonthSale(int productIndex) {
        int max = 0;
        for (int j = 0; j < sales[productIndex].length; j++) {
            if (sales[productIndex][j] > max) {
                max = sales[productIndex][j];
            }
        }
        return max;
    }
}