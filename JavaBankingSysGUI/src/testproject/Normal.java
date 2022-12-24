/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testproject;
import java.io.*;
/**
 *
 * @author khale
 */
public class Normal extends User implements Serializable{

    public Normal(String name,double balance,String pass) {
        super(name,balance,pass);
        this.name=name;
        this.setMaxLimit(10000.0);
        this.setPeriod(60);
    }
    
    
    
    
    
    
    
}
