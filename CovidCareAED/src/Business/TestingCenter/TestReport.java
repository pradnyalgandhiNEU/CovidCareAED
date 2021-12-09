/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TestingCenter;

import Business.Enterprise.TestingLab;
import Business.Hospital.Patient;

/**
 *
 * @author ayushgupta
 */
public class TestReport {
    TestingLab testingLab;
    private Boolean positive;

    public TestingLab getTestingLab() {
        return testingLab;
    }

    public void setTestingLab(TestingLab testingLab) {
        this.testingLab = testingLab;
    }
    

    public Boolean getPositive() {
        return positive;
    }

    public void setPositive(Boolean positive) {
        this.positive = positive;
    }
    
}
