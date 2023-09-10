package com.academy.techcenture.end2end;


import com.academy.techcenture.base.BaseTest;
import com.academy.techcenture.pages.ListOfAllOrders;
import com.academy.techcenture.pages.LoginPage;
import com.academy.techcenture.pages.ViewAllProducts;
import org.testng.annotations.Test;

public class ListOfProductsTest extends BaseTest {

    @Test
    public void validateListOfProducts(){
       extentTest= reports.startTest("Validation Of List Of Products");
        LoginPage loginPage = new LoginPage(driver);
        ListOfAllOrders listOfAllOrders = new ListOfAllOrders(driver);
        ViewAllProducts viewAllProducts = new ViewAllProducts(driver);
        loginPage.correctLoginCredentials();
       listOfAllOrders.goToViewAllProducts();
       viewAllProducts.validateMainHeader();
       viewAllProducts.validateListOfProducts();
       viewAllProducts.getTableData();
       viewAllProducts.validateContentOfTable();
        viewAllProducts.goToOrderPage();
    }
}
