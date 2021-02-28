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
public class City {
    
    private Community community1;
    private Community community2;

    public City(Community community1, Community community2) {
        this.community1 = community1;
        this.community2 = community2;
    }

    public Community getCommunity1() {
        return community1;
    }

    public void setCommunity1(Community community1) {
        this.community1 = community1;
    }

    public Community getCommunity2() {
        return community2;
    }

    public void setCommunity2(Community community2) {
        this.community2 = community2;
    }

    
}
