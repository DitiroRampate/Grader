/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grader;

import java.util.Scanner;

/**
 *
 * @author Ditiro
 */
public class AverageCalculator {
    public static void main(String[] args) {
        int numScores; //hold thr number of scores
        
        Scanner keyboard = new Scanner(System.in);
        //get number of testscores
        System.out.print("How many test scores do you have?");
        numScores = keyboard.nextInt();
        //array to hold test scores
        double[] scores = new double [numScores];
        //store the test scores in an array
        for (int i= 0; i <numScores; i++){
            System.out.print("Enter score #" + (i+1) + ": ");
            scores[i] = keyboard.nextDouble();
        }
        
        Grader rader = new Grader(scores);
        System.out.println("Your avarage is "+rader.getAverage());
}
}
