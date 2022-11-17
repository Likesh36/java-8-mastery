package com.company.interfaceenhancement.predicates;

import java.util.function.Predicate;

public class PredicateExampleIsEqual {

    public static void main(String[] args) {
        String name=("Rama");
        Predicate<String> nameEqualityPredicate = Predicate.isEqual("Rama");
        System.out.println(nameEqualityPredicate.test(name));
    }
}
