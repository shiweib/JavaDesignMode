package com.gg.single;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class LazySingleton4Test {

	public static void main(String[] args) {
        try {
            LazySingleton4 instance1 = LazySingleton4.getInstance();
            ObjectOutput out = null;
            out = new ObjectOutputStream(new FileOutputStream("src/com/gg/single/filename.ser"));
            out.writeObject(instance1);
            out.close();
            //deserialize from file to object
            ObjectInput in = new ObjectInputStream(new FileInputStream("src/com/gg/single/filename.ser"));
            LazySingleton4 instance2 = (LazySingleton4) in.readObject();
            in.close();
            System.out.println("instance1 hashCode=" + instance1.hashCode());
            System.out.println("instance2 hashCode=" + instance2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
