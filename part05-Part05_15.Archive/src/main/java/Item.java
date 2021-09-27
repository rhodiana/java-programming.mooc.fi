/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author artemis
 */
public class Item {
    private String id;
    private String name;
    
    public Item(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean equals(Object compared) {
        if(this == compared)
            return true;
        if(!(compared instanceof Item))
            return false;
        Item comparedItem = (Item) compared;
        if(this.id.equals(comparedItem.id))
            return true;
        
        return false;
    }
}
