/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Interfaces.warObservableInterface;
import Interfaces.warObserver;

/**
 *
 * @author nipun
 */
public class warObservable implements warObservableInterface{
    private warObserver[] warArray = new warObserver[0];

    boolean isChecked = false;
    int value;
    String message;
    
    private void extendWarArray(){
        warObserver[] tempArray = new warObserver[warArray.length+1];
        for (int i = 0; i < warArray.length; i++) {
            tempArray[i] = warArray[i];
        }
        warArray = tempArray;
    }
    public void addToWarArray(warObserver ob){
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
        for (warObserver observer : warArray) {
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
        for (warObserver observer : warArray) {
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
        for (warObserver observer : warArray) {
            observer.setMessageFromMainController(message);
        }
    }
}
