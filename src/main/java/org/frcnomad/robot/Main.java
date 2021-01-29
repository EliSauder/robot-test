package org.frcnomad.robot;

import org.apache.commons.math3.complex.Complex;
import org.frcnomad.lib.*;

public final class Main {

    private Main() {}
    
    public static void main(String[] args) {

        Greeter greeter = new Greeter();

        Complex myComplex = new Complex(0.1, 1.0);

        System.out.println(greeter.getMessage());
        //nothing to implement
    }
}
