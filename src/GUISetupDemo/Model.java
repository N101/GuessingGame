/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package GUISetupDemo;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author noahkiefer
 */
public class Model {
  
    Random rand = new Random();
    int target;
    private String status;
    
    
    void Answer() {
       target = rand.nextInt(100) + 1;
    }
    
    void checking(int i) {
       // int i = Integer.parseInt(s);
        status = "You guessed " + i + ". ";
        if (i < target) {
            status = status + "Your guess was too low";
        }
        if (i > target) {
            status = status + "Your guess was too high";
        }
        if (i == target) {
            status = status + "You are correct. You have won";
//            TimeUnit.SECONDS.sleep(5);
            System.exit(0);
        }
    }
    
    String getStatus(){
        // Return string wtih current status
        return status;
    }
    
    
    
    void test() {
        System.out.println("SOmbody touchese my spageth!");   
    }
    void test(String s) {       // Method overloading. Two or more methods can be created with the same name but depending on 
                                // what you put in the parenthesis, it will choose the correct one. 
        System.out.println("SOmbody touchese my " + s);   
    }
}

