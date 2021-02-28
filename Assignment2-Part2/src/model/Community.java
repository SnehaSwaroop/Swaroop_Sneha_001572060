/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author snehaswaroop
 */
public class Community {
    
    private House house;
    private String communityname;
    
    public Community( House house, String communityName) {
        this.house=house;
        this.communityname= communityName;
    }
    public Community(String communityName) {
        this.communityname= communityName;
    }
    
       public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getCommunityname() {
        return communityname;
    }

    public void setCommunityname(String communityname) {
        this.communityname = communityname;
    }
 
    
    
}
