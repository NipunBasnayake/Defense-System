/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author nipun
 */
public class Controller implements CotrollerInterface{
    private vehicleInterface[] vehicles;
    private Helecopter heli;
    private Tank tank;
    private Submarine sub;

    public Controller(Helecopter heli, Tank tank, Submarine sub) {
        this.heli = heli;
        this.tank = tank;
        this.sub = sub;
    }

    @Override
    public void setLevel(int level) {
       
    }
    

    
    /**
     * @return the heli
     */
    public Helecopter getHeli() {
        return heli;
    }

    /**
     * @param heli the heli to set
     */
    public void setHeli(Helecopter heli) {
        this.heli = heli;
    }

    /**
     * @return the tank
     */
    public Tank getTank() {
        return tank;
    }

    /**
     * @param tank the tank to set
     */
    public void setTank(Tank tank) {
        this.tank = tank;
    }

    /**
     * @return the sub
     */
    public Submarine getSub() {
        return sub;
    }

    /**
     * @param sub the sub to set
     */
    public void setSub(Submarine sub) {
        this.sub = sub;
    }
    
}

