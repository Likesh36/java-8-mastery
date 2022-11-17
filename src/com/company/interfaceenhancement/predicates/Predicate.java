package com.company.interfaceenhancement.predicates;
@FunctionalInterface
public interface Predicate<T> {
    public boolean testFunction(T t);
}
