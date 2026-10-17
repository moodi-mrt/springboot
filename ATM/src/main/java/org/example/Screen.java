package org.example;

public class Screen {
    public void Displaymessage(String message){
        System.out.printf("Display message", message);
    }

    public void Displaymessageline(String message){
        System.out.println(message);
    }

    public void DisplayDollarAmount(double Amount){
        System.out.println("$%.2f",Amount);
    }
}
