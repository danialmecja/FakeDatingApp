/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakedatingsim;

import java.util.ArrayList;


/**
 *
 * @author Rais
 */
public class SortInterest<T> {
    
    public static final int ASCENDING = 1;
    public static final int DESCENDING = 2;  
    private ArrayList<ArrayList<String>> value;
    private int orderType;
    
    public SortInterest(int a, ArrayList b) {                                           
        orderType = a;
        value = b;

    }
    
    public void swap(int index1, int index2) {
        ArrayList<String> temp = value.get(index1);
        value.set(index1, value.get(index2));
        value.set(index2, temp);
    }
    
    public ArrayList<ArrayList<String>> selectionSort() {
        for(int i=0; i<value.size() - 1; i++ )
            swap(i, getMinIndex(i));
        return value;
    }
    
    public int getMinIndex(int start) {
        ArrayList<String> temp = value.get(start);
        int index = start;
        for(int i=start + 1; i<value.size(); i++) {
            if ( (Integer.parseInt(temp.get(5)) > Integer.parseInt(value.get(i).get(5))) && orderType==ASCENDING ) {
                index = i;
                temp = value.get(i);
            }
            else if ( (Integer.parseInt(temp.get(5)) < Integer.parseInt(value.get(i).get(5))) && orderType==DESCENDING ) {
                index = i;
                temp = value.get(i);
            }    
        }
        return index;
    }
    
}
