package com.ejemplo;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class PrintOutRule implements TestRule {

    @Override public Statement apply(Statement base, Description description) {
        return new Statement() {
            @Override public void evaluate() throws Throwable {
                try {
                    base.evaluate();
                } finally {
                    System.out.println(description.getMethodName());
                }

            }
        };
    }
}
