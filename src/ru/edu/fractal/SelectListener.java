package ru.edu.fractal;

import java.awt.*;

@FunctionalInterface
public interface SelectListener {
    void onSelect(Rectangle rect);
}
