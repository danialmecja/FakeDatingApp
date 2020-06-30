package fakedatingsim;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import java.util.Random;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.HashMap;

public class Search{

    private Double h;     // x coordinate of circle's center
    private Double k;     // y coordinate of circle's center
    //////////////////////////////////////////////////////////
    private Double max;   // maximum radius
    private Double maxX;  // maxX = max + h;
    private Double maxY;  // maxY = max + k;
    //////////////////////////////////////////////////////////
    private Double botX;  // = 111.0;
    private Double botY;  // = 111.0;
    private Integer maxBot = 9;
    //////////////////////////////////////////////////////////
    private Double min;    //= -max;      //-10.0   xleh do   //so, reason ada constructor, is to initialize things yg x dpt initialize kat sini sbb nnti dpt error
    private Double minX;
    private Double minY;
    //////////////////////////////////////////////////////////
    private Integer count = 0;
    private Double zero = 0.0;
    //////////////////////////////////////////////////////////
    private Double rad[];
    private Double x[];
    private Double y[];
    
    private HashMap<String,double[]> coord = new <String,double[]>HashMap();
    private ArrayList<FriendZoneUser> database = new <FriendZoneUser>ArrayList(); 
    private ArrayList<FriendZoneUser> initialList = new <FriendZoneUser>ArrayList();
    private FriendZoneUser user;
    private boolean male, female;
    private String opSentence;


    public Search(ArrayList<FriendZoneUser> database, FriendZoneUser user, double max, boolean male, boolean female){
        setHash();
        double loc[] = coord.get(user.getCity());
        this.user = user;
        this.male = male;
        this.female = female;
        this.database = database;
        
        this.h = loc[0];
        this.k = loc[1];
        this.max = max;

        min = -max;

        maxX = max + h;
        maxY = max + k;

        minX = min + h;
        minY = min + k;

        int maxBot = this.maxBot;      //kalau xde ni, nnti at one time, dia jadi .java.NullPointerException

//        rad = new Double[1000];
//        x = new Double[1000];
//        y = new Double[1000];
        
        increaseRad();

    }

    
   

    //General Eq of Circle : (x-h)^2 + (y-k)^2 = r^2


    
    

    public ArrayList<FriendZoneUser> increaseRad(){

        //if found, stop and tulis found bot within range 100 meters
        //tulis berapa byk found bot and list coordinate
        //if not found
        //tulis not found then continue searching withing range 200 meters

        //i think, instead of using x and y utk increment and jadi range, baik buat radius itself
        //sbb dia dah siap ngan calculation semua, siap calculate
        //tapi kalau guna x and y, takut if x is 9.8 and y is 9.9 then ofkos the radius would greater than 10.0

        //you dont need to increment, just tengok the value of rad and then determine dia adalah dekat category range mana

        //if store [0][] jumpa bot, then stop
        //if not, then proceed with store [1][]
        //if store [1][] jumpa bot, then stop
        //if not, then proceed with store [2][]
        //this process is recurring

        /*
        for(int i=0;;){
            for(int j=0;;){

                if(rad){
                    store[i][j] = rad;
                }

            }
        }

         */

        /*
        int i=0;

        store[i+0][j] = rad;

        store[i+1][j] = rad;

        store[i+2][j] = rad;

        j++

         */

        int countRangeBot = 0, lainRangeBot = 0, maxedRangeBot = 0;
        int counter=1, dounter=1, founter=1;
        int j=0, k=0, l=0;

        ArrayList<FriendZoneUser> A = new <FriendZoneUser>ArrayList();//0 to first
        ArrayList<FriendZoneUser> B = new <FriendZoneUser>ArrayList();//first to second
        ArrayList<FriendZoneUser> C = new <FriendZoneUser>ArrayList();// second to max
        ArrayList<FriendZoneUser> D = new <FriendZoneUser>ArrayList();


        //since dia pakai radius je, we just pakai max, unles iff x and y, then pakai maxX and maxY

        Double first = max/3.0;
        Double second = max*2.0/3.0;
        Double rad;

        for(int i=0; i<database.size(); i++){
            if((female && database.get(i).getGender().equals("Female"))||(male &&  database.get(i).getGender().equals("Male"))&&(!user.getUsername().equals(database.get(i).getUsername()))){
                rad = radEq(user,database.get(i));
                if(rad <= first){
                    countRangeBot++;

                    A.add(database.get(i));
                    
                    j++;
                }

                else if(rad > first && rad <= second){
                    lainRangeBot++;

                     B.add(database.get(i));

                    k++;
                }

                else if(rad > second && rad<=max){
                    maxedRangeBot++;

                     C.add(database.get(i));

                    l++;
                }

            }
        }    
           
            if (countRangeBot>0) {
                 opSentence = "Range from 0 meter to " + first + " meters is found.";
                 
                 return A;
                

            }

            //if rad starts at this range, then masuk dlm condition ni

            else if (lainRangeBot>0) {
                opSentence = "Range from 0 meter to " + first + " meters can't be found.\n" + "Proceed with the next range.\n" + "Range from " + first + " meters to " + second + " meters is found.";


                return B;

                

            }

            //if rad starts at this range, then masuk dlm condition ni

            else if (maxedRangeBot>0) {
                opSentence = "Range from 0 meter to " + first + " meters can't be found.\n" + "Proceed with the next range.\n" + "Range from " + first + " meter to " + second + " meters can't be found.\n"+ "Proceed with the next range.\n" + "Range from " + second + " meters to " + max + " meters is found.";

    

                return C;

            }

            //if it exceeds range, then invalid

            else {
                return D;
            }
        

    }
    
    public String getOpSent(){
        return opSentence;
    }
    
     public void setHash(){
        String line;
        try{
            BufferedReader br = new BufferedReader(new FileReader("locations.txt"));
            while((line = br.readLine()) != null){
                String[] a = line.split(",");
                String[] b = a[1].split("!");
                double x = Double.parseDouble(b[0]), y = Double.parseDouble(b[1]);
                double[] loc = {x,y};
                coord.put(a[0], loc);
            }
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    public Double radEq(FriendZoneUser user, FriendZoneUser bot){

        Double rad;
        
        double[] u = coord.get(user.getCity());//User x and y
        double[] b = coord.get(bot.getCity());//Bot x and y

        rad = sqrt((pow(b[0]-u[0], 2) + pow(b[1]-u[1], 2)));

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

    /*
    public Double placeList(String place){

        //originally at UM (0,0)
        Double x = 0.0;   //can be h
        Double y = 0.0;   //can be k

        if(place.equalsIgnoreCase("Putrajaya")){

        }
    }

     */


    /*
    public String toString(){

        return ;
    }

     */

    //task
    //-ve x and y                                     setel
    //quadrant 1 - 4, verify                          toh
    //eq when entering the specific quadrant          xtaula setel kot, sbb suddenly everything was positive
    //so kene tag every tempat such as, putrajaya : (4,3)

}
