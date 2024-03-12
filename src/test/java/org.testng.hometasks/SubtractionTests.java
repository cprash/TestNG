package org.testng.hometasks;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubtractionTests extends BaseTests {
    public SubtractionTests() {
        super();
    }

    @Test(dataProvider = "subtractNumbers", dataProviderClass = NumberDataProvider.class, groups = {"arithmetic","basicArithmetic"})
    public void subtractTest(int a, int b) {
        Assert.assertEquals(calculator.sub(a, b), a - b);
    }

    @Parameters("numbers")
    @Test(groups = {"arithmetic", "basicArithmetic", "parameterized"})
    public void paramSubtractTest(String numbers) {
        String[] nums = numbers.split("&");
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);
        Assert.assertEquals(calculator.sub(num1, num2), num1 - num2);
    }

}
