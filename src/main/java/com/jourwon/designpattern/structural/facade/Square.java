package com.jourwon.designpattern.structural.facade;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/16 10:04
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }

}
