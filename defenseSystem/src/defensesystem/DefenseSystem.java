/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defensesystem;

import Controller.warObservable;
import GUI.Helicopter;
import GUI.MainController;
import GUI.Submarine;
import GUI.Tank;
import Interfaces.warObservableInterface;
import Interfaces.warObserver;

/**
 *
 * @author nipun
 */
public class DefenseSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        warObservable ob = new warObservable();
        MainController main = new MainController(ob);
        
        ob.addToWarArray(new Helicopter());
        ob.addToWarArray(new Tank());
        ob.addToWarArray(new Submarine());
        
     
    }
    
}
