package com.company.interfaceenhancement.predicates;

public class PredicateDemoMain {
    public static void main(String[] args) {
        Predicate predicate = new PredicateDemo();
        boolean result =predicate.testFunction(20);
        System.out.println(result);

    }
}
