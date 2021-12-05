/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.City;

import java.util.ArrayList;

/**
 *
 * @author ayushgupta
 */
public class Community {
    private String communityName;
    private ArrayList<StreetNo> homeList;
    City city;

    public ArrayList<StreetNo> getHomeList() {
        return homeList;
    }

    public void setHomeList(ArrayList<StreetNo> homeList) {
        this.homeList = homeList;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    public Community(){
    this.homeList = new ArrayList<StreetNo>();
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public ArrayList<StreetNo> getHome() {
        return homeList;
    }
    
    public StreetNo addHome(){
        StreetNo home = new StreetNo();
        homeList.add(home);
        return home;
    }
}
