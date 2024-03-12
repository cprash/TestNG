package org.testng.hometasks;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivisionTests extends BaseTests {
    public DivisionTests() {
        super();
    }

    @Test(dataProvider = "divisionNumbers", dataProviderClass = NumberDataProvider.class, groups = {"arithmetic","basicArithmetic"})
    public void divisionTest(int a, int b) {
        Assert.assertEquals(calculator.div(a, b), a / b);
    }

    @Test(expectedExceptions = NumberFormatException.class,expectedExceptionsMessageRegExp = "Attempt to divide by zero",groups = {"arithmetic","basicArithmetic"})
    public void divideByZeroTest() {
        Assert.assertEquals(calculator.div(10, 0), 10 / 0);
    }

    @Parameters("numbers")
    @Test(groups = {"arithmetic", "basicArithmetic", "parameterized"})
    public void paramDivisionTest(String numbers) {
        String[] nums = numbers.split("&");
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);
        Assert.assertEquals(calculator.div(num1, num2), num1 / num2);
    }

}
