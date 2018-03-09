/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUISetupDemo;

/**
 *
 * @author noahkiefer
 */
public class GUISetupDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // instantiate the model
        Model model = new Model();
        // instantiate the viewcontroller
        ViewController viewController = new ViewController(model);
        viewController.setVisible(true);
        
    }
    
}
