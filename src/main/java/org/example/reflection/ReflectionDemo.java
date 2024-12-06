package org.example.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        Class<?> personClass = person.getClass();

        Method[] methods = personClass.getDeclaredMethods();
        Field[] fields = personClass.getDeclaredFields();
        System.out.println("Methods:\n");
        for(Method method: methods){
            System.out.println(method +"\n");
        }
        System.out.println("Fields:\n");
        for(Field field: fields){
            System.out.println(field+"\n");
        }

        try {
            Field nameField = personClass.getDeclaredField("name");
            nameField.setAccessible(true);
            try {
                nameField.set(person, "Bob");
                System.out.println("Modified name:" + person.getName());
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
