
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Interfaces.Observer;
import Interfaces.ObservableInterface;

/**
 *
 * @author nipun
 */
public class Observable implements ObservableInterface{
    private Observer[] warArray = new Observer[0];

    boolean isChecked = false;
    int value;
    String message;
    
    private void extendWarArray(){
        Observer[] tempArray = new Observer[warArray.length+1];
        for (int i = 0; i < warArray.length; i++) {
            tempArray[i] = warArray[i];
        }
        warArray = tempArray;
    }
    public void addToWarArray(Observer ob){
        extendWarArray();
        warArray[warArray.length-1] = ob;
    }

    @Override
    public void areaClear(boolean isChecked) {
        if (this.isChecked!=isChecked) {
            this.isChecked=isChecked;
        }
        areaClearing();
    }
    
    public void areaClearing(){
        for (Observer observer : warArray) {
            observer.setAreaClear(isChecked);
        }
    }
    
    @Override
    public void activeButtons(int value){
        if (value!=0) {
            this.value = value;
        }
        activatingButtons();
    }
    
    public void activatingButtons(){
        for (Observer observer : warArray) {
            observer.setActivateButtons(value);
        }
    }
    
    @Override
    public void messageFromMainController(String message){
        if (message!=null) {
            this.message = message;
        }
        messageSending();
    }
    
    public void messageSending(){
        for (Observer observer : warArray) {
            observer.setMessageFromMainController(message);
        }
    }

    @Override
    public ObservableInterface getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
