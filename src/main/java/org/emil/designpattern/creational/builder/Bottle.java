package org.emil.designpattern.creational.builder;

/*
 * code taken from:
 * https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 */
public class Bottle implements Packing{

    @Override
    public String pack() {
        return "Bottle";
    }


}