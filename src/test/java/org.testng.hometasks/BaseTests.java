package org.testng.hometasks;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class BaseTests {

     Calculator calculator;

    public BaseTests() {
        calculator = new Calculator();
    }


    @BeforeClass
    public void beforeClass() {
        System.out.println("::::::Starting tests in Class " + this.getClass().getSimpleName());
    }

    @AfterClass
    public void afterClass() {
        System.out.println("::::::Executed all tests in Class " + this.getClass().getSimpleName());
    }

    @BeforeMethod
    public void beforeMethod(Method method) {
        System.out.println("Starting test " + method.getName()+"==>> Thread : "+Thread.currentThread().getName());

    }

    @AfterMethod
    public void afterMethod(Method method) {
        System.out.println("Executed test " + method.getName()+"==>> Thread : "+Thread.currentThread().getName());
    }

}
