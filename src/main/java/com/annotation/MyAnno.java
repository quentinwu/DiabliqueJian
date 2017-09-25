package com.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by quentin on 1/22/2017.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str() default "This is the default value of str in MyAnno";
    int val();
}
