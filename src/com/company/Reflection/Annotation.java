package com.company.Reflection;

import javax.security.auth.login.AccountNotFoundException;

public class Annotation {
    public void getAnnotation() throws NoSuchMethodException {
        Annotation[] annotations = (Annotation[]) Circle.class.getAnnotations();
        for (Annotation annotation : annotations)
            System.out.println();
        Annotation[]  annotations1 = (Annotation[]) Circle.class.getMethod("area").getAnnotations();
        for (Annotation annotation : annotations1)
            System.out.println();
    }
}
