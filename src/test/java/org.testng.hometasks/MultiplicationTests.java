package org.testng.hometasks;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiplicationTests extends BaseTests {

    public MultiplicationTests() {
        super();
    }

    @Test(dataProvider = "multiplyNumbers", dataProviderClass = NumberDataProvider.class, groups = {"arithmetic","basicArithmetic"})
    public void multiplyTest(int a, int b) {
        Assert.assertEquals(calculator.mult(a, b), a * b);
    }

    @Parameters("numbers")
    @Test(groups = {"arithmetic", "basicArithmetic", "parameterized"})
    public void paramMulitplyTest(String numbers) {
        String[] nums = numbers.split("&");
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);
        Assert.assertEquals(calculator.mult(num1, num2), num1 * num2);
    }
}
