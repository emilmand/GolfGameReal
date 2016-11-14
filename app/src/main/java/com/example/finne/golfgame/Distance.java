package com.example.finne.golfgame;

import java.util.Random;



public class Distance {
    Random rand = new Random();


    int[] mStandardDistance = {250, 200};
    int[] mVariableDistance = {51, 51};


    // set driver distance
    public int getDriverDistance() {
            int driverDistance;

            driverDistance = rand.nextInt(mVariableDistance[0]) + mStandardDistance[0];
            return driverDistance;
        }
    // set 3-wood distance
    public int get3woodDistance() {
            int wood3Distance;

            wood3Distance = rand.nextInt(mVariableDistance[1]) + mStandardDistance[1];
            return wood3Distance;
        }
    }




































/*
package com.example.finne.golfgame;

import android.util.Log;
import android.view.View;

import java.util.Random;



public class Distance {
    Random rand = new Random();


    int[] mStandardDistance = {250, 200};
    int[] mVariableDistance = {51, 51};



    }

    // set driver distance
    public int getDriverDistance() {
            int driverDistance;

            driverDistance = rand.nextInt(mVariableDistance[0]) + mStandardDistance[0];
            return driverDistance;
        }
    // set 3-wood distance
    public int get3woodDistance() {
            int wood3Distance;

            wood3Distance = rand.nextInt(mVariableDistance[1]) + mStandardDistance[1];
            return wood3Distance;
        }
    }
 */



/*

 public class Distance {



    public static int driverDistance;



    public static int getIronDist() {
            int[] standardDistance = {250, 200, 170, 150, 120, 30, 0};
            int[] variableDistance = {51, 51, 21, 21, 21, 71, 30};

            Random rand = new Random();
            driverDistance = rand.nextInt(variableDistance[0]) + standardDistance[0];
            return driverDistance;

        }
    }

 */