/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;
import java.util.ArrayList;
/**
 *
 * @author ayushgupta
 */
public class EncounterHistory {
    private ArrayList<Encounter> encounterHistory;
    
    public EncounterHistory(){
        this.encounterHistory = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public Encounter addNewEncounter(){
    Encounter encounter = new Encounter();
    encounterHistory.add(encounter);
    return encounter;
    }
    
    public void deleteVitals(Encounter encounter){
        encounterHistory.remove(encounter);
    }
 
}
