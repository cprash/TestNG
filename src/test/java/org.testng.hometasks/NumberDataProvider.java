package org.testng.hometasks;

import org.testng.annotations.DataProvider;

public class NumberDataProvider {
    @DataProvider(name = "addNumbers")
    public Object[][] sumDP() {
        return new Object[][]{{1, 2}, {-3, 4}};

    }

    @DataProvider(name = "subtractNumbers")
    public Object[][] subtractDP() {
        return new Object[][]{{5, 2}, {-3, -4}};

    }

    @DataProvider(name = "multiplyNumbers")
    public Object[][] multiplyDP() {
        return new Object[][]{{5, 2}, {-3, -4}};

    }

    @DataProvider(name = "divisionNumbers")
    public Object[][] divideDP() {
        return new Object[][]{{10, 2}, {-13, -4}};

    }
}
