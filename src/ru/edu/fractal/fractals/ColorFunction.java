package ru.edu.fractal.fractals;

import java.awt.*;

@FunctionalInterface
public interface ColorFunction {
    Color getColor(float value);
}
