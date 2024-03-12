package org.testng.hometasks.Runner;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerTestNgRunner {
    public static void main(String[] args) throws Exception {

        List<XmlClass> classes = new ArrayList<XmlClass>();
        classes.add(new XmlClass("org.testng.hometasks.AdditionTests"));
        classes.add(new XmlClass("org.testng.hometasks.SubtractionTests"));
        classes.add(new XmlClass("org.testng.hometasks.MultiplicationTests"));
        classes.add(new XmlClass("org.testng.hometasks.DivisionTests"));
        classes.add(new XmlClass("org.testng.hometasks.AdvancedTests"));


        XmlSuite mainsuite = new XmlSuite();
        mainsuite.setName("CalculatorSuite");
        mainsuite.setFileName("CalculatorSuite.xml");
        mainsuite.setParallel(XmlSuite.ParallelMode.METHODS);
        mainsuite.setThreadCount(3);
        mainsuite.addListener("org.testng.hometasks.listeners.CalculatorAnnotaionTransformer");

        XmlTest mainTest;
        mainTest = new XmlTest(mainsuite);
        mainTest.setName("CalculatorTests");
        mainTest.setPreserveOrder(true);
        mainTest.addExcludedGroup("parameterized");
        mainTest.setXmlClasses(classes);


        mainsuite.setTests(Arrays.asList(mainTest));


        TestNG runner = new TestNG();
        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(mainsuite);
        runner.setXmlSuites(suites);
        runner.run();
    }
}
