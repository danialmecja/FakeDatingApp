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
public class AdapterClass {
    
    public AdapterClass(){
        
    }
    
    public FriendZoneUser fromTantan(TantanUser t){
        return new FriendZoneUser(t.getUsername(),t.getPassword(),t.getFirstName(),t.getLastName(),t.getAge(),t.getGender(),t.getInterest(),t.getCity());
    }
    
    public FriendZoneUser fromTinder(TinderUser t){
        return new FriendZoneUser(t.getUsername(),t.getPassword(),t.getFirstName(),t.getLastName(),t.getAge(),t.getGender(),t.getInterest(),t.getCity());
    }
    
}
