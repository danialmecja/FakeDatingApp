package fakedatingsim;

import java.io.*;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class FriendZoneUser implements Serializable {

    private String username;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private ArrayList<String> interest;
    private String city;
    private int viewsCounter;

    private int lines;

    private Formatter file;

    public FriendZoneUser () {

    }

    public static FriendZoneUser currentFriendZoneUser = new FriendZoneUser();

    public FriendZoneUser(String username, String password, String firstName, String lastName, int age, String gender, ArrayList<String> interest, String city) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.interest = interest;
        this.city = city;
    }
    
    public FriendZoneUser(String username, String password, String firstName, String lastName, int age, String gender,String city) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.interest = interest;
        this.city = city;
    }

    //For the Current User

    public FriendZoneUser (String currentUser, String currentPass) {
        this.username = currentUser;
        this.password = currentPass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<String> getInterest(){
        return interest;
    }
    
    public void setInterest(ArrayList<String> interest){
        this.interest = interest;
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getViewsCounter() {
        return viewsCounter;
    }

    public void setViewsCounter(int viewsCounter) {
        this.viewsCounter = viewsCounter;
    }

    //Creating a new User
   


    


    

    /* Read file
    Count lines
    Logic
     */

    //Login Screen
    

    

    public boolean checkPassword(String password) {
        boolean hasNum = false;
        boolean hasCap = false;
        boolean hasLow = false;
        char ch;

        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                hasNum = true;
            } else if (Character.isUpperCase(ch)) {
                hasCap = true;
            } else if (Character.isLowerCase(ch)) {
                hasLow = true;

            }
            if (hasNum && hasCap && hasLow) {
                return true;
            }
        }
        return false;
    }




    @Override
    public String toString () {
        return username +
                "\n" + password +
                "\n" + firstName +
                "\n" + lastName +
                "\n" + age +
                "\n" + gender +
                "\n" + interest.get(0) + "," + interest.get(1) + "," + interest.get(2)
                + "," + interest.get(3) + "," + interest.get(4) +
                "\n" + city +
                "\n";
    }




    }



