package com.annotation;

import java.lang.reflect.Method;

/**
 * Created by quentin on 1/22/2017.
 */
@Deprecated
public class Meta {

    @MyAnno(str="Hello Example", val=100)
    public static void myMeth() {
        Meta ob = new Meta();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            Method[] methods = c.getMethods();
            for(Method met : methods) {
                System.out.println("Method: " + met.getName() + " " + met.getDefaultValue() + " " + met.getReturnType());
            }

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
            Deprecated dep = c.getAnnotation(Deprecated.class);
            System.out.println(dep.annotationType());
        }
        catch(NoSuchMethodException exc) {
            System.out.println("Method not found");
        }
    }

    public String apple(){
        return "aaaa";
    }
    public void pear(String a){
    }

    public static void main(String[] args) {
        myMeth();
    }
}
