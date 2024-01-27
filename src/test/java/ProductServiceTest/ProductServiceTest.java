package ProductServiceTest;

import org.example.entity.Product;
import org.example.service.ProductService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceTest {


    @Test
    @DisplayName("GIVEN valid param WHEN call sumAllProduct SHOULD return sum all products")
        public void sumAllProducts(){

            //arrange
            var expectedValue = 500.00;

            var product = new Product("1", "Iphone", 250.00);
            var product2 = new Product("2", "Som", 250.00);
            var list = List.of(product,product2);

            //action

            var total = ProductService.sumAllProducts(list);


            //assert

            Assertions.assertEquals(total, expectedValue);


        }

    @Test
    @DisplayName("GIVEN empty list param WHEN call sumAllProduct SHOULD throw errors")
    public void sumAllProductsShouldThrowErrorWhenParamEmptyList(){

        //arrange
        var expectedValue = "A lista não pode ser vazia";


        List<Product> list = new ArrayList<>();

        //action

        var exception = Assertions.assertThrows(RuntimeException.class,()->{
            var total = ProductService.sumAllProducts(list);
        });



        //assert

        Assertions.assertEquals(exception.getMessage(), expectedValue);


    }
}
