/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.servlet;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import spring.servlet.bean.Animal;
import spring.servlet.bean.Bird;
import spring.servlet.bean.Cat;
import spring.servlet.bean.Circus;
import spring.servlet.bean.Dog;
import spring.servlet.bean.Duck;
import spring.servlet.bean.Mamal;

/**
 *
 * @author wien
 */
public class SpringServlet {

  /**
   * @param args the command line arguments
   * @throws java.io.FileNotFoundException
   */
  public static void main(String[] args) {
    // TODO code application logic here

//    Kyle k = new Kyle("Ji");
//    System.out.println(k.sayHello());
//
//    Kyle[] arr;
//    arr = new Kyle[2];
//    arr[0] = new Kyle("jUNG-DAi");
//    arr[1] = new Kyle("Me");
//    System.out.println(arr[0].sayHello());
//
//    System.out.println(Kyle.prefix);
//
//    String str = new String("ABCDEFG");
//
//    String strSub = str.substring(0, 3);
//    System.out.println(strSub.toLowerCase());
//    Animal animal = new Animal();
//    System.out.println(animal.say());
//
//    Animal cat = new Cat();
//    System.out.println(cat.say());
//    ((Cat) cat).walk();
//    ((Cat) cat).feed();
//
//    Mamal dog = new Dog();
//    dog.feed();
//    System.out.println(dog.say());
//
//    Duck duck = new Duck();
//    duck.say();
//    duck.fly();
//    duck.swim();
//
//    Bird bird = new Bird();
//    Circus circus = new Circus();
//
//    circus.showFlyAnimal(bird);
//    circus.showFlyAnimal(duck);
    List<Duck> ducks = new ArrayList();

    for (int i = 0; i < 10; i++) {
      ducks.add(new Duck());
    }

    System.out.println(ducks.size());
    ducks.get(9).fly();
//    ducks.add(9, new Duck());
//    ducks.remove(0);

    Map<String, Dog> dogs = new HashMap();
    String[] strName = new String[]{"A", "B", "C", "D", "E"};
    for (String strName1 : strName) {
//      System.out.println(strName1);
      dogs.put(strName1, new Dog(strName1));
    }
//    dogs.put("name1", new Dog());

    System.out.println(dogs.get("C"));

    try {
      InputStream inputStream = new FileInputStream("D:/Train/Spring/spring-servlet/.gitignore");

      InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

      BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

      do {
        System.out.println(bufferedReader.readLine());
      } while (bufferedReader.ready());

    } catch (FileNotFoundException exception) {
      exception.printStackTrace();
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }

  }

}
