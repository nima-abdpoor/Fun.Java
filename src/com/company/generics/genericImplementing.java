package com.company.generics;

public class genericImplementing<k> implements interfaceGeneric,intefacecomprable{

    @Override
    public Number getName() {
        return null;
    }

    @Override
    public Number name() {
        return null;
    }


    @Override
    public Comparable add(Comparable first, Comparable last) {
        return first.compareTo(last);
    }

    @Override
    public Comparable sub(Comparable first, Comparable last) {
        return null;
    }
}
