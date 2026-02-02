package org.example;

import CreationalDPs.SingletonDesignPattern;
import CreationalDPs.Thread1;

import java.io.*;
import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SingletonDesignPattern s1=SingletonDesignPattern.getSingletonObjct();
        SingletonDesignPattern s2=SingletonDesignPattern.getSingletonObjct();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //Serialization
        FileOutputStream f = new FileOutputStream("C:\\Users\\Dell\\Desktop\\Serialization.txt");
        ObjectOutputStream obj = new ObjectOutputStream(f);
        obj.writeObject(s1);

        //deserialization
        FileInputStream f1 =  new FileInputStream("C:\\Users\\Dell\\Desktop\\Serialization.txt");
        ObjectInputStream in = new ObjectInputStream(f1);
        SingletonDesignPattern s3 = (SingletonDesignPattern)in.readObject();
        System.out.println(s3.name);
        //Here it will get new memory reference beacuse readobject is using internally readResolve to overcome this need to override readresolve
        System.out.println(s3.hashCode());
    }
}