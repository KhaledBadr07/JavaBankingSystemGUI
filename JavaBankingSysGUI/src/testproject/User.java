/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testproject;
import java.io.*;
import java.text.SimpleDateFormat;  
import java.util.Date; 
/**
 *
 * @author khale
 */
public abstract class User implements Serializable {
    String name;
    String password;
    double balance;
    protected double maxLimit;
    boolean status;
    boolean creditCardFlag = false;
    protected int period;
    int daysAfterPurchase;
    Date dateOfPurchase;
    Date dateOfCheck;
    

    public User() {
    }

    public User(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password=password;
        //this.setCreditCard(creditCard);
        //this.status = status;
    }
    
    

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public Date getDateOfCheck() {
        return dateOfCheck;
    }

    public void setDateOfCheck(Date dateOfCheck) {
        this.dateOfCheck = dateOfCheck;
    }
    
    

    
    public void setMaxLimit(double l){
        this.maxLimit = l;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public void setDaysAfterPurchase(int daysAfterPurchase) {
        this.daysAfterPurchase = daysAfterPurchase;
    }
    
    
    
    

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    

    public boolean getStatus() {
        return status;
    }

    public double getMaxLimit() {
        return maxLimit;
    }

    public int getDaysAfterPurchase() {
        return daysAfterPurchase;
    }
    
    
    
    
    public boolean isDebited(){
        if(maxLimit<0 || daysAfterPurchase>period){
            return true;
            //return status;
        }else {
            return false;
            //return status;
        }
    }
    public void deposit(double added){
        this.balance = this.balance + added;
    }
    
    public void checkStatus(/*int daysAfterPurchase*/){
        if(creditCardFlag == true){
            System.out.println("Days left : " + (period-daysAfterPurchase));
        }
        
        System.out.println("Current balance is: "+this.balance);
        System.out.println("Current credit card balance is: "+maxLimit);
    }
    public void transferAmountFrom(User addfrom,double transferred){
        this.balance=this.balance+transferred;
        addfrom.balance= addfrom.balance -transferred;
    }
    public void creditCard(double amount){
        maxLimit = maxLimit - amount;
        this.creditCardFlag = true;
    }
    public long daysBetween(Date one,Date two) {
		long diff = (one.getTime()-two.getTime())/8640000;
		return Math.abs(diff);
	}
    
    
    
}
