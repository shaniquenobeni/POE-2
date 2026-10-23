package loginsystem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class loginTest {

    private Login login;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() {
        login = new Login();
    }

    @After
    public void tearDown() throws Exception {
    }

    
    @Test
    public void testValidUsername() {
        assertTrue(login.checkUserName("ab_cd"),
                "Valid username must contain _ and be <= 5 chars");
    }

    @Test
    public void testUsernameMissingUnderscore() {
        assertFalse(login.checkUserName("abcde"));
    }

    @Test
    public void testUsernameTooLong() {
        assertFalse(login.checkUserName("abc_de"));
    }

    @Test
    public void testUsernameEmpty() {
        assertFalse(login.checkUserName(""));
    }

    
    @Test
    public void testValidPassword() {
        assertTrue(login.checkPasswordComplexity("Password1!"),
                "Password needs 8+ chars, capital, digit, special");
    }

    @Test
    public void testPasswordTooShort() {
        assertFalse(login.checkPasswordComplexity("Pa1!"));
    }

    @Test
    public void testPasswordMissingCapital() {
        assertFalse(login.checkPasswordComplexity("password1!"));
    }

    @Test
    public void testPasswordMissingDigit() {
        assertFalse(login.checkPasswordComplexity("Password!"));
    }

    @Test
    public void testPasswordMissingSpecialChar() {
        assertFalse(login.checkPasswordComplexity("Password1"));
    }

    
    @Test
    public void testValidCellNumber() {
        assertTrue(login.checkCellPhoneNumber("+27831234567"));
    }

    @Test
    public void testCellWithoutInternationalCode() {
        assertFalse(login.checkCellPhoneNumber("0831234567"));
    }

    @Test
    public void testCellEmpty() {
        assertFalse(login.checkCellPhoneNumber(""));
    }

    
    @Test
    public void testSuccessfulLogin() {
        login.setUsername("ab_cd");
        login.setPassword("Password1!");
        login.setFirstName("John");
        login.setLastName("Doe");

        assertTrue(login.loginUser("ab_cd", "Password1!"));
    }

    @Test
    public void testLoginWrongPassword() {
        login.setUsername("ab_cd");
        login.setPassword("Password1!");

        assertFalse(login.loginUser("ab_cd", "WrongPass1!"));
    }

    @Test
    public void testLoginWrongUsername() {
        login.setUsername("ab_cd");
        login.setPassword("Password1!");

        assertFalse(login.loginUser("xx_yy", "Password1!"));
    }

    @Test
    public void testReturnLoginStatusSuccessContainsWelcome() {
        login.setFirstName("John");
        login.setLastName("Doe");
        String status = login.returnLoginStatus(true);
        assertTrue(status.contains("Welcome") || status.contains("John"),
                "Success status should welcome the user");
    }

    @Test
    public void testReturnLoginStatusFailureMentionsFailure() {
        String status = login.returnLoginStatus(false);
        assertTrue(status.toLowerCase().contains("fail")
                        || status.toLowerCase().contains("incorrect"),
                "Failure status should indicate failed login");
    }

    /**
     * Test of setFirstName method, of class Login.
     */
    @org.junit.Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Login instance = new Login();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Login.
     */
    @org.junit.Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Login instance = new Login();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class Login.
     */
    @org.junit.Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        Login instance = new Login();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Login.
     */
    @org.junit.Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Login instance = new Login();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCellPhoneNumber method, of class Login.
     */
    @org.junit.Test
    public void testSetCellPhoneNumber() {
        System.out.println("setCellPhoneNumber");
        String cellPhoneNumber = "";
        Login instance = new Login();
        instance.setCellPhoneNumber(cellPhoneNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class Login.
     */
    @org.junit.Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Login.
     */
    @org.junit.Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class Login.
     */
    @org.junit.Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Login.
     */
    @org.junit.Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCellPhoneNumber method, of class Login.
     */
    @org.junit.Test
    public void testGetCellPhoneNumber() {
        System.out.println("getCellPhoneNumber");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getCellPhoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @org.junit.Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @org.junit.Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkCellPhoneNumber method, of class Login.
     */
    @org.junit.Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String cellPhoneNumber = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber(cellPhoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @org.junit.Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        Login instance = new Login();
        String expResult = "";
        String result = instance.registerUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @org.junit.Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String enteredUsername = "";
        String enteredPassword = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser(enteredUsername, enteredPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @org.junit.Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean isLoggedIn = false;
        Login instance = new Login();
        String expResult = "";
        String result = instance.returnLoginStatus(isLoggedIn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}