package org.testng.hometasks.listeners;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class CalculatorAnnotaionTransformer implements IAnnotationTransformer {
    @Override
    public void transform(final ITestAnnotation annotation, final Class testClass, final Constructor testConstructor,
                          final Method testMethod) {
        annotation.setRetryAnalyzer(CalculatorRetryAnanlyzer.class);
    }
}
