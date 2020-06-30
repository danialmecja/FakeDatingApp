package fakedatingsim;

import java.io.*;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class TinderUser implements Serializable {

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

    public TinderUser () {

    }

    public static TinderUser currentFriendZoneUser = new TinderUser();

    public TinderUser(String username, String password, String firstName, String lastName, int age, String gender, ArrayList<String> interest, String city) {
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

    public TinderUser (String currentUser, String currentPass) {
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
    public void createProfile () {
        Scanner input = new Scanner(System.in);

        System.out.println("Please complete the following details to create a new 'Fake' Profile: ");

        System.out.println("Preferred Username: ");
        setUsername(input.nextLine());

        System.out.println("Enter a valid password: ");
//        System.out.println("Your password must be made up of at least 5 characters, at least 1 uppercase letter, " +
//                "and a number.");
//        validatePassword(input.nextLine()); Still needs work. Method is located below saveProfile()
        setPassword(input.nextLine());

        System.out.println("Your First Name: ");
        setFirstName(input.nextLine());

        System.out.println("Your Last Name: ");
        setLastName(input.nextLine());

        System.out.println("The gender you identify with (M/F/Other): ");
        setGender(input.next());
        input.nextLine();

        System.out.println("Your age: ");
        setAge(Integer.parseInt(input.nextLine()));

        System.out.println("City: ");
        setCity(input.nextLine());

        //1. PJ - 5 locations
        //2, KL - 5 locations


           }


    public void choiceToSave (TinderUser signUp) throws IOException {

        String choice = "";
        Scanner input = new Scanner(System.in);

        while(!choice.equals("0")) {
            System.out.println("Are you satisfied with your new account details?");
            System.out.println("1: Yes. I would like to save my account.");
            System.out.println("0. No, I want to re-do my whole sign up.\n");
            choice = input.nextLine();
            System.out.println();

            if (choice.equals("1")) {
                saveProfile(signUp);
                signUp.loginOptions();
            } else if (choice.equals("0")) {
                createProfile();

            }


        }


    }


    //Main Menu after choosing the login option (Option 2)
    public void loginOptions() {
        String choices = "";
        Scanner input = new Scanner (System.in);

        while (!choices.equals("0")) {
            System.out.println("********** Welcome to the Fake Dating App Login Screen! ********** \n");
            System.out.println("Please select a login option to proceed with: ");
            System.out.println("1. Login with a FriendZone Account");
            System.out.println("2. Login with a Tinder Account");
            System.out.println("3. Login with a Tantan Account");
            System.out.println();
            System.out.println("0. Exit the App \n");


            choices = input.nextLine();

            if (choices.equals("1")) {
                //Login screen
                loginFriendZone();
            }else if (choices.equals("2")) {
                loginTinder();
            } else if (choices.equals("3")) {
                loginTantan();
            } else if (choices.equals("0")) {
                System.out.println("Hate to see you leave :(");
                System.exit(1);
            }
        }
    }

    /* Read file
    Count lines
    Logic
     */

    //Login Screen
    public void loginFriendZone() {
        String filePath = "FriendZoneUserData.txt";

        Scanner input = new Scanner (System.in);
        String username = "";
        String password = "";
        int isLogin = 1;

        boolean usernameFound = false;
        System.out.println("Please enter your FriendZone username: ");
        username = input.nextLine();
        System.out.println("Please enter your FriendZone password: ");
        password = input.nextLine();

        verifyLoginFriendZone(username, password, filePath);

    }

    public void loginTinder () {
        Scanner input = new Scanner(System.in);
        String filepath = "/Users/danialmecja/Programming/FakeDatingApp/src/TinderUserData.txt";
        String username = "";
        String password = "";

        System.out.println("Please enter your Tinder username: ");
        username = input.nextLine();
        System.out.println("Please enter your Tinder password: ");
        password = input.nextLine();

        verifyLoginTinder(username, password, filepath);

    }

    public void loginTantan () {
        Scanner input = new Scanner(System.in);
        String filepath = "/Users/danialmecja/Programming/FakeDatingApp/src/TantanUserData.txt";
        String username = "";
        String password = "";

        System.out.println("Please enter your Tantan username: ");
        username = input.nextLine();
        System.out.println("Please enter your Tantan password: ");
        password = input.nextLine();

        verifyLoginTantan(username, password, filepath);


    }

    public void verifyLoginFriendZone(String username, String password, String filePath) {

        String tempUsername, tempPassword, lineNumber;

        try
        {
            FileReader fileRead = new FileReader(new File(filePath));
            BufferedReader br = new BufferedReader(fileRead);

            while ((lineNumber = br.readLine()) != null)
            {
                tempUsername = lineNumber; //1st Line
                tempPassword = br.readLine(); //2nd Line

                if (username.equals(tempUsername) && password.equals(tempPassword))
                {
                    System.out.println("Verifying");
                    System.out.println("Verifying.");
                    System.out.println("Verifying..");
                    System.out.println("Verifying...");
                    System.out.println("Verifying....");

                    System.out.println("Your login is successful!\n");

                    //Setting it to the current FZ User
                    currentFriendZoneUser = new TinderUser(username, password);
                    //LoggedInSim loggedInUser = new LoggedInSim();
                    //loggedInUser.options();

                }
                else
                {
                    System.out.println("Invalid Login Credentials! Please try again.\n");
                    for (int i = 0; i < 6; i++)
                        lineNumber = br.readLine();
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("The data file is not found.");
            System.out.println(e.getMessage());
        }

    }

    public void verifyLoginTinder (String username, String password, String filepath) {

        String tempUsername, tempPassword, lineNumber;
        try
        {
            FileReader fileRead = new FileReader(new File(filepath));
            BufferedReader br = new BufferedReader(fileRead);

            while ((lineNumber = br.readLine()) != null)
            {
                tempUsername = lineNumber;
                tempPassword = br.readLine();

                if (tempUsername.equals(username) && tempPassword.equals(password))
                {
                    System.out.println("Verifying");
                    System.out.println("Verifying.");
                    System.out.println("Verifying..");
                    System.out.println("Verifying...");
                    System.out.println("Verifying....");

                    System.out.println("Your login is successful!\n");

                    //Setting it to the current FZ User
                    currentFriendZoneUser = new TinderUser(username, password);
                    //LoggedInSim loggedInUser = new LoggedInSim();
                    //loggedInUser.options();
                }
                else
                {
                    System.out.println("Invalid Login Credentials! Please try again.\n");
                    for (int i = 0; i < 6; i++)
                        lineNumber = br.readLine();
                }

            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());

        }

    }

    public void verifyLoginTantan (String username, String password, String filepath) {

        String tempUsername, tempPassword, lineNumber;

        try
        {
            FileReader fileRead = new FileReader(new File(filepath));
            BufferedReader br = new BufferedReader(fileRead);

            while ((lineNumber = br.readLine()) != null)
            {
                tempUsername = lineNumber;
                tempPassword = br.readLine();

                if (tempUsername.equals(username) && tempPassword.equals(password))
                {
                    System.out.println("Verifying");
                    System.out.println("Verifying.");
                    System.out.println("Verifying..");
                    System.out.println("Verifying...");
                    System.out.println("Verifying....");

                    System.out.println("Your login is successful!\n");

                    //Setting it to the current FZ User
                    currentFriendZoneUser = new TinderUser(username, password);
                    //LoggedInSim loggedInUser = new LoggedInSim();
                    //loggedInUser.options();
                }
                else
                {
                    System.out.println("Invalid Login Credentials! Please try again.\n");
                    for (int i = 0; i < 6; i++)
                        lineNumber = br.readLine();
                }

            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());

        }

    }



    public void saveProfile(TinderUser signUp) throws IOException {

        File userDataFile = new File("FriendZoneUserData.txt");

        if (userDataFile.exists()) {
            System.out.println("File exists!");

        } else {
            userDataFile.createNewFile();
            System.out.println("Your file has been created\n");
        }

        try {
            FileWriter fWrite = new FileWriter(userDataFile.getAbsoluteFile(), true);
            BufferedWriter bWrite = new BufferedWriter(fWrite);
            bWrite.write(signUp.toString());
            bWrite.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Your profile has been saved!\n");
    }



    public void validatePassword (String password) {
        Scanner input = new Scanner (System.in);

       while (password.length() > 7)
        {
            while (checkPassword(password))
            {
                System.out.println("Password Accepted.");
                setPassword(password);

                if (!checkPassword(password))
                {
                    System.out.println("Password does not meet requirements. Please try again.");
                }
            }
        }
       while (password.length() < 7) {
           System.out.println("Your password is too short. Please try again: ");
           password = input.nextLine();
       }
    }

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



