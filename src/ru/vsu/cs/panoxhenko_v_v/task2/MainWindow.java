package ru.vsu.cs.panoxhenko_v_v.task2;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final DrawPanel dp;

    public MainWindow() throws HeadlessException {
        dp = new DrawPanel();
        this.add(dp);
    }
}
