/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakedatingsim;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rais
 */
public class TrollMessage {
    
    private String[] message;
    private HashMap<String, String> words = new <String, String>HashMap();
    
    private int changedWords = 0;
    private FriendZoneUser user, bot;
    
    public TrollMessage(){
        setFiles();
    }
    
    public String changeMessage(String a){
        changedWords = 0;
        message = a.split(" ");
        for(int i=0;i < message.length;i++){
            if(words.containsKey(message[i])){
                message[i] = words.get(message[i]);
                changedWords++;
            }
        }
        String sentence = "";
        for(String b : message)
            sentence += b + " ";
        return sentence;
    }
    
    public void setFiles(){
        String line;
        String[] fileWords = new String[2];
        try{
            BufferedReader br = new BufferedReader(new FileReader("antonym.txt"));
            while ((line = br.readLine()) != null) {
                fileWords = line.split(",");
                words.put(fileWords[0], fileWords[1]);
            }
        }catch(FileNotFoundException ex){
            System.out.println("File not found");
        } catch (IOException ex) {
            Logger.getLogger(TrollMessage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public int getChangedWords(){
        return changedWords;
    }
    
//    public void startConvo(){
//        Scanner scan = new Scanner(System.in);
//        Random ran = new Random();
//        int count = 0;
//        System.out.println("Starting convo with: " + bot.getFirstName() + " " + bot.getLastName());
//        while(true){
//            System.out.println(bot.getFirstName() + ": " + botConvo[count][0]);
//            System.out.println(changeMessage(scan.nextLine()));
//            if(encryptedWords == 0)
//                count++;
//            else
//                count += encryptedWords;
//            if(count > 14){
//                System.out.println("Sorry but i dont think we are compatible");
//                break;
//            }
//        }
//    }
    
}
