package com.example.demo.designpattern.strategy.sortfile;

/**
 * @author robert
 */
public class SortingTool {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        sorter.sortFile(args[0]);
    }
}
