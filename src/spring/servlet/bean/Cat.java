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
public class Cat extends Mamal {

  @Override
  public String say() {
    return "Cat say.";
  }

  @Override
  public void feed() {
    System.out.println("Cat feed.");
  }

}
