/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.City.City;
import Business.Role.Role;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;

/**
 *
 * @author shreya.ghate
 */
public class EcoSystem {
    private static EcoSystem business;
    private ArrayList<City> cityList;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    private EcoSystem(){
//        super(null, null, null, null, null, parseInt(null), null, null);
        cityList=new ArrayList<City>();
    }
    
    public City createAndAddCity(){
        City city=new City();
        cityList.add(city);
        return city;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }
    
    public void removeCity(City n){
        cityList.remove(n);
    }
    
    public City getCity(String name){
        for (City n: cityList){
            if(n.getCityName().equalsIgnoreCase(name)){
                return n;
            }
        }
        return null;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(City city:cityList){
            
        }
        return true;
    }
}
