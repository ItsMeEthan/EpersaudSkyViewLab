package com.company;

public class SkyView {


    private double view[][];



    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];
        int i=0;
        for(int row = 0;row < numRows; row++){
            if(row % 2==0){
                for(int cols = 0; cols<numCols; cols++){
                    if(cols % 2==0){
                        view[row][cols]=scanned[i];
                        i++;

                    }
                }
            }
        }

    }



    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double sum = 0.0;
        int count = 0;
        for (int row = startRow; row <= endRow; row++) {
            for (int cols = startCol; cols <= endCol; cols++) {
                sum += view[row][cols];
                count++;
            }
        }
        return sum/count;
    }



}

