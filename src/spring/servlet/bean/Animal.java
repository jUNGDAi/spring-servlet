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
public class Animal {

  public String say() {
    return "hi say in Animal";
  }

  public final void walk() {
    System.out.println("Animal can walk");
  }
}
