/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.servlet;

/**
 *
 * @author wien
 */
public class Kyle {

  String name;

  public Kyle(String name) {
    this.name = name;
    this.hello();
  }

  public String sayHello() {
    return "hi\t" + this.name;
  }

  public void hello() {
    System.out.println("Local say hello " + this.name);
  }

}
