/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.servlet.bean;

import spring.servlet.interfaces.CanFly;

/**
 *
 * @author wien
 */
public class Circus {

  public void showFlyAnimal(CanFly flyAnimal) {
    flyAnimal.fly();
  }
}
