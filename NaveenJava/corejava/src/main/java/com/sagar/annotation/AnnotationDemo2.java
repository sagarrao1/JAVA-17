package com.sagar.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Marker Annotation
//Single Value Annotation
//Multi Value Annotation
//Meta Annotation

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone1{
	String os() default "Symbian";
	int version() default 6;
}

@SmartPhone1(os="Andriod" ,version=7)
class NokiaASeries
{
	String model;
	int size;
	
	public NokiaASeries(String model, int size) {
		this.model = model;
		this.size = size;
	}	
}
public class AnnotationDemo2 {
	public static void main(String[] args) {
		NokiaASeries obj=new NokiaASeries("A30", 6);
		//System.out.println(obj.model+ "   "+obj.size);
		
		
		// I want fetch annotation values defined for class using nokia object
		// we need to use reflection API to fetch class of nokia object
		
		Class c= obj.getClass();
		Annotation an= c.getAnnotation(SmartPhone1.class);
		SmartPhone1 s=(SmartPhone1)an;
		System.out.println(s.os());		
		System.out.println(s.version());
		
	}
}
