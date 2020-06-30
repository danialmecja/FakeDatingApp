package fakedatingsim;

import java.util.Random;

import java.util.Random;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class SearchMate{

    private Double h;     // x coordinate of circle's center
    private Double k;     // y coordinate of circle's center
    //////////////////////////////////////////////////////////
    private Double max;   // maximum radius
    private Double maxX;  // maxX = max + h;
    private Double maxY;  // maxY = max + k;
    //////////////////////////////////////////////////////////
    private Double botX;
    private Double botY;
    private Integer maxBot = 9;  //for this time being, just randomize 9 bots
    //////////////////////////////////////////////////////////
    private Double min;    //= -max;
    private Double minX;
    private Double minY;
    //////////////////////////////////////////////////////////
    private Integer count = 0;
    private Double zero = 0.0;
    //////////////////////////////////////////////////////////
    private Double rad[];
    private Double x[];
    private Double y[];

    public SearchMate(Double h, Double k, Double max){
        this.h = h;
        this.k = k;
        this.max = max;

        min = -max;

        maxX = max + h;
        maxY = max + k;

        minX = min + h;
        minY = min + k;

        int maxBot = this.maxBot;

        rad = new Double[1000];
        x = new Double[1000];
        y = new Double[1000];

    }

    public void randomizeBot(){                      //this will be deleted when using real TinderMate
        Random random = new Random();

        double x = Math.random();
        double y = Math.random();

        botX = (Math.random() * ((maxX - zero) + 1)) + zero + x;
        botY = (Math.random() * ((maxY - zero) + 1)) + zero + y;

        ///////////////////////////////////////////////////////////////////////////////////////////////

        //random +ve or -ve float maker

        int signX, signY;

        signX = random.nextInt(2);
        if(signX == 0){
            signX = -1;
        }

        signY = random.nextInt(2);

        if(signY == 0){
            signY = -1;
        }

        System.out.println("sign x: " + signX);
        System.out.println("sign y: " + signY);

        ///////////////////////////////////////////////////////////////////////////////////////////////


        botX*=signX;
        botY*=signY;


        System.out.println("   TinderBotXY : " + botX + "," + botY);
        center();
        System.out.println("   V   V   V   V   V   V   V   V   V   V");
    }

    public void loopRandomizeBot(){

        for(int i=0; i<maxBot; i++){
            randomizeBot();
            loopEq();
        }
    }


    //General Eq of Circle : (x-h)^2 + (y-k)^2 = r^2

    public void loopEq(){
        //Double min = -max;
        Double rad = null;
        Double x = minX, y = minY;    //or -max

        while(y < maxY && y>=minY && y < botY && maxY >= botY){

            while(x < maxX && x>=minX && x < botX && maxX >= botX){
                //System.out.println("x:" + x);
                x+=0.01;
            }

            //System.out.println("y:" + y);
            y+=0.01;
        }

        printer(x,y,rad);

    }

    public void printer(Double x, Double y, Double rad){

        if(maxX < botX || minX > botX || maxY < botY || minY > botY){
            count++;
            System.out.print(count);
            invalid();
        }

        else{
            rad = radEq(x,h,y,k);
            this.rad[count] = rad;
            this.x[count] = x;
            this.y[count] = y;

            count++;

            if(rad > max){
                System.out.print(count);
                invalid();
            }

            else{
                System.out.print(count + ". ");
                coordinate(x, y);
                System.out.print("    ");
                distance(rad);
            }//
        }

    }

    public void increaseRad(){

        int countRangeBot = 0, lainRangeBot = 0, maxedRangeBot = 0;
        int counter=1, dounter=1, founter=1;
        int j=0, k=0, l=0;

        Double rad100[] = new Double[maxBot];
        Double rad200[] = new Double[maxBot];
        Double radMax[] = new Double[maxBot];

        System.out.println("Searching...\n");

        Double xA[] = new Double[maxBot];
        Double xB[] = new Double[maxBot];
        Double xC[] = new Double[maxBot];

        Double yA[] = new Double[maxBot];
        Double yB[] = new Double[maxBot];
        Double yC[] = new Double[maxBot];

        Double first = max/3.0;
        Double second = max*2.0/3.0;

        for(int i=0; i<maxBot; i++){
            if(this.rad[i] <= first){
                countRangeBot++;

                rad100[j] = this.rad[i];
                xA[j] = this.x[i];
                yA[j] = this.y[i];

                j++;
            }

            else if(this.rad[i] > first && this.rad[i] <= second){
                lainRangeBot++;

                rad200[k] = this.rad[i];
                xB[k] = this.x[i];
                yB[k] = this.y[i];

                k++;
            }

            else if(this.rad[i] > second && this.rad[i]<=max){
                maxedRangeBot++;

                radMax[l] = this.rad[i];
                xC[l] = this.x[i];
                yC[l] = this.y[i];

                l++;
            }

        }


        LocateBot locate = new LocateBot();

        //if rad starts at this range, then masuk dlm condition ni

        if (countRangeBot>0) {
            System.out.print("Found A: " + countRangeBot + " TinderMate!\n\n");

            for (int i = 0; i < countRangeBot; i++) {

                    System.out.println("Distance between you and TinderMate " + counter + " : " + rad100[i] + " meters");
                    locate.end(xA[i], yA[i]);
                    counter++;


            }

        }

        //if rad starts at this range, then masuk dlm condition ni

        else if (lainRangeBot>0) {

            System.out.println("Range from radius 0 meter to radius " + first + " meters can't be found.");
            System.out.println("Proceed with the next range.\n");
            System.out.println("Searching...\n");

            System.out.print("Found B: " + lainRangeBot + " TinderMate!\n\n");

            for (int i = 0; i < lainRangeBot; i++) {

                    System.out.println("Distance between you and TinderMate " + dounter + " : " + rad200[i] + " meters");
                    locate.end(xB[i], yB[i]);
                    dounter++;


            }

        }

        //if rad starts at this range, then masuk dlm condition ni

        else if (maxedRangeBot>0) {

            System.out.println("Range from radius 0 meter to radius " + first + " meters can't be found.");
            System.out.println("Proceed with the next range.\n");
            System.out.println("Searching...\n");

            System.out.println("Range from radius " + first + " meters to radius " + second + " meters can't be found.");
            System.out.println("Proceed with the next range.\n");
            System.out.println("Searching...\n");

            System.out.print("Found C: " + maxedRangeBot + " TinderMate!\n\n");

            for (int i = 0; i < maxedRangeBot; i++) {

                    System.out.println("Distance between you and TinderMate " + founter + " : " + radMax[i] + " meters");
                    locate.end(xC[i], yC[i]);
                    founter++;


            }

        }

        //if it exceeds range, then invalid

        else {
            System.out.println("- Invalid : TinderMate Not Found -");
            System.out.println("You have exceeded the maximum radius.");
        }


    }

    public Double radEq(Double x, Double h, Double y, Double k){

        Double rad;

        rad = sqrt((pow(x-h, 2) + pow(y-k, 2)));

        return rad;
    }

    public void center(){
        System.out.println("        center : " + h + "," + k);
    }

    public void coordinate(Double x, Double y){
        //System.out.println("Coordinate of TinderBot is : (" + x + ", " + y + ")");
        System.out.printf("Coordinate of TinderBot is : (%.2f, %.2f)\n", x, y);
    }

    public void distance(Double rad){
        System.out.printf("The distance between you and TinderBot is : %.4f meter\n\n", rad);
    }

    public void invalid(){
        System.out.println(". Invalid. The coordinate of TinderBot is out of range.\n");
    }

}
