package ru.vsu.cs.panoxhenko_v_v.task2;

import java.awt.*;

public class ellipsRasterization {
    private int x0;
    private int y0;
    private int width;
    private int height;
    private Color color;


    public ellipsRasterization(int x0, int y0, int width, int height) {
        this.x0 = x0;
        this.y0 = y0;
        this.width = width;
        this.height = height;
    }

    public void rasterization() {
        int xc = (x0 + width)/2;
        int yc = (y0 + height)/2;
        int x_left, x_right;
        for (int y = y0; y < y0 + height; y++) {
            x_left =  xc  + width / 2 * (int) Math.sqrt(height/2 * height/2 - (y - yc) * (y - yc));
            x_right = xc  - width / 2 * (int) Math.sqrt(height/2 * height/2 - (y - yc) * (y - yc));
            for (int x = x0; x < x0 + width; x++) {

            }
        }
    }

}
