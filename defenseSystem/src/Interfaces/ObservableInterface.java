/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author nipun
 */
public interface ObservableInterface {
    public void areaClear(boolean isChecked);
    public void activeButtons(int value);
    public void messageFromMainController(String message);

    public ObservableInterface getInstance();
}
