/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poepart1;

import javax.swing.JOptionPane;
import static poepart1.UserLogInClass.VerificationOfUser.ifPasswordIsValid;
import static poepart1.UserLogInClass.VerificationOfUser.ifUsernameIsValid;


/**
 *
 * @author RC_Student_lab
 */
public class PoePart1 {

    
   public static void main(String[] args) {
        // Setting the method registering of the user
        String userName = JOptionPane.showInputDialog("Enter username:");
        String Password = JOptionPane.showInputDialog("Enter password:");
        String firstName = JOptionPane.showInputDialog("Enter first name:");
        String Surname = JOptionPane.showInputDialog("Enter last name:");

        if (ifUsernameIsValid(userName)) {
            JOptionPane.showMessageDialog(null, "Username successfully captured");
        } else {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
            return;
        }

        if (ifPasswordIsValid(Password)) {
            JOptionPane.showMessageDialog(null, "Password successfully captured");
        } else {
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
            return;
        }
        //Setting the login methods
        String enteredUsername = JOptionPane.showInputDialog("Enter your username:");
        String enteredPassword = JOptionPane.showInputDialog("Enter your password:");
   }
}