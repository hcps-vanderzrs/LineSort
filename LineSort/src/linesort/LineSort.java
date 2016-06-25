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
        int[] sortedDataSet = new int[20000001];
        for (int g = 0; g < 20000000; g++) {
            dataSet.add((int) (Math.random() * 20000000));

        }
        double start = System.currentTimeMillis();
        for (int i = 0; i < dataSet.size(); i++) {
            sortedDataSet[dataSet.get(i)] = sortedDataSet[dataSet.get(i)] + 1;
        }

        for (int z = 0; z < sortedDataSet.length; z++) {
            if (sortedDataSet[z] != 0) {
                //System.out.print(z + " ");
                //System.out.println(z);
                sortedDataSet[z] = sortedDataSet[z] - 1;
                z--;
            } else {

            }
        }
        double end = System.currentTimeMillis();
        double finished = end - start;
        System.out.println(finished / 1000 + " seconds to complete sort");
    }
}
