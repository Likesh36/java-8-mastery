package com.company.interfaceenhancement.predicates;

public class PredicateDemo implements Predicate<Integer>{
    @Override
    public boolean testFunction(Integer age) {
        if(age>18){
            return true;
        }else{
            return false;
        }
    }
}
