/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linesort;

import java.util.ArrayList;

/**
 *
 * @author Robbie
 */
public class LineSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> dataSet = new ArrayList<>();
        int[] sortedDataSet = new int[500000];
        for (int g = 0; g < 500000; g++) {
            dataSet.add((int) (Math.random() * 500));

        }
        for (int i = 0; i < dataSet.size(); i++) {
            sortedDataSet[dataSet.get(i)] = sortedDataSet[dataSet.get(i)] + 1;
        }

        for (int z = 0; z < sortedDataSet.length; z++) {
                if (sortedDataSet[z] != 0) {
                    System.out.println(z);
                    sortedDataSet[z] = sortedDataSet[z] - 1;
                    z--; 
                } else {
                             
            }
        }
    }

}
