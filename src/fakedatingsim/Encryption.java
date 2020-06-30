/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakedatingsim;

import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author Rais
 */
public class Encryption {
    private String message;
    private int key;
    private FriendZoneUser user1, user2;
    private HashMap<Character, Character> encryptor = new HashMap<Character, Character>();
    private HashMap<Character, Character> decryptor = new HashMap<Character, Character>();
    
    public Encryption(FriendZoneUser a, FriendZoneUser b){
        user1 = a;
        user2 = b;
        key = a.getFirstName().length() + b.getFirstName().length();
        setEncryption();
    }
    
    public void setEncryption(){
        Random ran = new Random(key);
        int value;
        for(int i = 0; i < 128; i++){
            do{
                value = ran.nextInt(128);
            }while(encryptor.containsValue((char)value));    
            encryptor.put((char)i, (char)value);
            decryptor.put((char)value, (char)i);
            //System.out.println(i + ". key: " + (char)i + " value: " + (char)value);
        }
    }
    
    public String getEncryption(String message){
        String encrypted = "";
        for(int i = 0; i < message.length(); i++){
            encrypted += encryptor.get(message.charAt(i));
        }
        return encrypted;
    }
    
    public String getMessage(String encrypted){
        String message = "";
        for(int i = 0; i < encrypted.length(); i++){
            message += decryptor.get(encrypted.charAt(i));
        }
        return message;
    }
    
}
