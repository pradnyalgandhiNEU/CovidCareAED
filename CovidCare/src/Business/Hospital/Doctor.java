/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

/**
 *
 * @author ayushgupta
 */
public class Doctor {
    private String drName;
    private String drEmailId;
    private long drContactNo;
    private int age;
    private String drSpecialization;
    private int drId;
   

    public String getDrName() {
        return drName;
    }

    public void setDrName(String drName) {
        this.drName = drName;
    }

    public String getDrEmailId() {
        return drEmailId;
    }

    public void setDrEmailId(String drEmailId) {
        this.drEmailId = drEmailId;
    }

    public long getDrContactNo() {
        return drContactNo;
    }

    public void setDrContactNo(long drContactNo) {
        this.drContactNo = drContactNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDrSpecialization() {
        return drSpecialization;
    }

    public void setDrSpecialization(String drSpecialization) {
        this.drSpecialization = drSpecialization;
    }

    public int getDrId() {
        return drId;
    }

    public void setDrId(int drId) {
        this.drId = drId;
    }
    
    public boolean isMatch(int id){
        if(getDrId()==id) return true;
        return false;
    }
    
    
}
