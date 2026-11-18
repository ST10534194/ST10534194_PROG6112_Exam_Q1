import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {

    private final String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
    private final int[][] sampleSales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
    };

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        Product product = new Product(products, sampleSales);
        int expected = 153;
        int actual = product.GetTotalProductsSold();
        assertEquals(expected, actual);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        Product product = new Product(products, sampleSales);
        double expected = 17.0;
        double actual = product.GetAverageProductsSold();
        assertEquals(expected, actual, 0.01);
    }
}
