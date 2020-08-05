package com.company.Reflection;

import java.lang.reflect.Field;

public class UseCircleWithField {
    public void use() throws Exception {
        Circle circle=new Circle();
        circle.setRadius(2.5);
        Class circleClass = Class.forName("com.company.Reflection.Circle");
        Field[] field = circleClass.getFields();
        for (Field f : field){
            if (f.getName().equals("radius")){
                Object value  = f.get(circle);
                Double d = (double)value;
                System.out.println(d);
                f.set(circle,d*2);
                System.out.println(circle.getRadius());
            }
        }
    }
    public void field() throws NoSuchFieldException, IllegalAccessException {
        Field[]  fields = Circle.class.getFields();
        Field field = fields[0];
        field = Circle.class.getField("radius");
        Circle circle =new Circle();
        field.set(circle,2.0);
    }
}
