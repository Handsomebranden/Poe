/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package poepart1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class UserLogInClassTest {
    
    public UserLogInClassTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getUsername method, of class UserLogInClass.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        UserLogInClass instance = null;
        String expResult = "Kyl_1";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Kyle!!!!!");
    }

    /**
     * Test of getPassword method, of class UserLogInClass.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        UserLogInClass instance = null;
        String expResult = "Ch&&sec@ke99!";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("password");
    }

    /**
     * Test of getFirstName method, of class UserLogInClass.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        UserLogInClass instance = null;
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class UserLogInClass.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        UserLogInClass instance = null;
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
