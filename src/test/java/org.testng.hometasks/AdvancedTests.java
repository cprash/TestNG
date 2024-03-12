package org.testng.hometasks;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdvancedTests extends BaseTests {
    public AdvancedTests() {
        super();
    }

    @Test(groups = {"arithmetic", "advanceArthimetic"})
    public void squareTest() {
        int i = 2;
        Assert.assertEquals(calculator.pow(i, 2), Math.pow(i, 2));
    }

    @Test(groups = {"arithmetic", "advanceArthimetic"})
    public void cubeTest() {
        int i = 2;
        Assert.assertEquals(calculator.pow(i, 3), Math.pow(i, 3));
    }

    @Parameters("singleNumber")
    @Test(groups = {"arithmetic", "advanceArthimetic", "parameterized"})
    public void paramSquareTest(String num) {
        int i = Integer.parseInt(num);
        Assert.assertEquals(calculator.pow(i, 2), Math.pow(i, 2));
    }

    @Parameters("singleNumber")
    @Test(groups = {"arithmetic", "advanceArthimetic", "parameterized"})
    public void paramCubeTest(String num) {
        int i = Integer.parseInt(num);
        Assert.assertEquals(calculator.pow(i, 3), Math.pow(i, 3));
    }

    @Test(groups = {"arithmetic", "advanceArthimetic"})
    public void squareRootTest() {
        int i = 2;
        Assert.assertEquals(calculator.sqrt(i), Math.sqrt(i));
    }


    @Parameters("singleNumber")
    @Test(groups = {"arithmetic", "advanceArthimetic", "parameterized"})
    public void paramSquareRootTest(String num) {
        int i = Integer.parseInt(num);
        Assert.assertEquals(calculator.sqrt(i), Math.sqrt(i));
    }


}
