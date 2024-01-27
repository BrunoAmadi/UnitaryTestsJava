package ProductTest;

import org.example.entity.Product;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class ProductTest {

    @Test
    @DisplayName("GIVEN valid params WHEN calls constructor method SHOULD create product")
    public void createProduct() {

        //arrange
        var expectedId = "1";
        var expectedName = "Iphone";
        var expectedPrice = 1000.00;

        //action
        var product = new Product(expectedId, expectedName, expectedPrice);

        // assert
        Assertions.assertNotNull(product);
        Assertions.assertEquals(product.getId(), expectedId);
        Assertions.assertEquals(product.getName(), expectedName);
        Assertions.assertEquals(product.getPrice(), expectedPrice);

    }

    @Test
    @DisplayName("GIVEN a invalid param id WHEN Calls constructor method SHOULD throw error")
    public void createProductWithoutId() {

        //arrange
        var expectedMessage = "Id nao pode ser nulo";
        var expectedId = "";
        var expectedName = "Iphone";
        var expectedPrice = 1000.00;

        //action
        var exception = Assertions.assertThrows(NullPointerException.class, ()->{
             new Product(expectedId, expectedName, expectedPrice);
        });


        //assert
        Assertions.assertEquals(exception.getMessage(), expectedMessage);

    }


    @Test
    @DisplayName("GIVEN a invalid param name WHEN Calls constructor method SHOULD throw error")
    public void createProductWithoutName() {

        //arrange
        var expectedMessage = "nome nao pode ser nulo ou vazio";
        var expectedId = "1";
        var expectedName = "";
        var expectedPrice = 1000.00;

        //action
        var exception = Assertions.assertThrows(NullPointerException.class, ()->{
            new Product(expectedId, expectedName, expectedPrice);
        });


        //assert
        Assertions.assertEquals(exception.getMessage(), expectedMessage);

    }

    @Test
    @DisplayName("GIVEN a invalid param name WHEN Calls constructor method SHOULD throw error")
    public void createProductWithoutPriceOrLessThanZero() {

        //arrange
        var expectedMessage = "O valor nao pode ser menor ou igual a zero";
        var expectedId = "1";
        var expectedName = "Iphone";
        var expectedPrice = 0.0;

        //action
        var exception = Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Product(expectedId, expectedName, expectedPrice);
        });


        //assert
        Assertions.assertEquals(exception.getMessage(), expectedMessage);

    }



}
