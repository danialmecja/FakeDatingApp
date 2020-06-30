/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakedatingsim;

/**
 *
 * @author Rais
 */
public class ListRepresentation {
    
    private String sentence;
    private FriendZoneUser a;
    
    public ListRepresentation(String sentence, FriendZoneUser a){
        this.sentence = sentence;
        this.a = a;
    }
    
    public FriendZoneUser getUser(){
        return a;
    }
    
    public String toString(){
        return sentence;
    }
    
}
