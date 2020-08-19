/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grader;

/**
 *
 * @author Ditiro
 */
public class Grader {

   /**
    * The grader class calculate the average of an array of the test scores, with lowest dropped
    */
    private double [] testScores;
    
    public Grader( double[] scoreArray){
        testScores = scoreArray;
    }
    public double getLowestScore(){
        double lowest; //to hold lowest score
        //get the test score
        lowest = testScores[0];
        for (int i =1;i <testScores.length;i++){
            if(testScores[i] < lowest)
                lowest = testScores[i];
        }
        return lowest;
    }
    public double getAverage(){
        double total = 0;
        double lowest;
        double average;
        /**
         * if the array contains less than 2 tests scores,
         * display an error message and set the average to 0
         */
        if(testScores.length < 2){
            System.out.println("ERROR: You must have at" + "least have two test scores");
            average =  0;
        }
        else{//first caluculate the total of the score
            for(double score: testScores)
                total+=score;
            //then get the lowest score
            lowest = getLowestScore();
            total -=lowest;
            //average
            average = total / (testScores.length-1);
        }
        return average;
    }
}
