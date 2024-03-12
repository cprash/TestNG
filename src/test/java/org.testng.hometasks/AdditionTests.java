package org.testng.hometasks;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.hometasks.listeners.CalculatorRetryAnanlyzer;

public class AdditionTests extends BaseTests {
    public AdditionTests() {
        super();
    }

    @Test(dataProvider = "addNumbers", dataProviderClass = NumberDataProvider.class, groups = {"arithmetic", "basicArithmetic"})
    public void addTest(int a, int b) {
        Assert.assertEquals(calculator.sum(a, b), a + b);
    }

    @Parameters("numbers")
    @Test(groups = {"arithmetic", "basicArithmetic", "parameterized"})
    public void paramAddTest(String numbers) {
        String[] nums = numbers.split("&");
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);
        Assert.assertEquals(calculator.sum(num1, num2), num1 + num2);
    }

}
