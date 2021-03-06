package com.platform.swagger.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiResponse
{
  int code();
  
  String message();
  
  Class<?> response() default Void.class;
}

