/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.servlet.bean;

/**
 *
 * @author wien
 */
public class Dog extends Mamal {

  private String name;
  private final int leg = 4;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Dog() {
    this.setName("no name");
  }

  public Dog(String name) {
    this.setName(name);
  }

  @Override
  public String toString() {
    return "Dog{" + "name=" + name + '}';
  }

  @Override
  public void feed() {
    System.out.println("Dog feed.");
  }

}
