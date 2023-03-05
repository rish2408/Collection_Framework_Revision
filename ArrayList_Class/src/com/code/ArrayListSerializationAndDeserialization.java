package com.code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerializationAndDeserialization {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Rishabh");
		al.add("Mansi");
		al.add("Aavya");
		al.add("Krishna");
		
		try {
			// Serialization
			
			FileOutputStream fos = new FileOutputStream("abc.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(al);
			
			fos.close();
			oos.close();
			
			// Deserialization
			
			FileInputStream fis = new FileInputStream("abc.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ArrayList<String> list = (ArrayList<String>)ois.readObject();
			System.out.println(list);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
