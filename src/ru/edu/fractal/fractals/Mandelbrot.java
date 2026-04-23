package ru.edu.fractal.fractals;

import ru.smak.math.Complex;

public class Mandelbrot implements Fractal {
    private final int maxIterations = 100;
    private final double R2 = 4;

    @Override
    public float inSetProbability(double x, double y) {
        var c = new Complex(x, y);
        var z = new Complex();

        int i = 0;
        while (z.getAbsoluteValue2() < R2 && ++i < maxIterations){
            z.timesAssign(z);
            z.plusAssign(c);
        }

        return (float)i / maxIterations;
    }
}
