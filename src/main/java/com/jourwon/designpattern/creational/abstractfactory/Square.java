package com.jourwon.designpattern.creational.abstractfactory;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/13 22:52
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
