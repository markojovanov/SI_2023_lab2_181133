import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    // Every branch - Test scenarios

    // Test scenario 1
    @Test
    void testScenarioPasswordNullException(){
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(
                new User("test", null, "test"),
                new ArrayList<User>())
        );
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
    }

    // Test scenario 2
    @Test
    void testScenarioPasswordEqualsUsername(){
        User user = new User("test","test","test");
        ArrayList<User> emptyUserList = new ArrayList<User>();
        assertFalse(SILab2.function(user, emptyUserList));
    }

    // Test scenario 3
    @Test
    void testScenarioExistingUserWithPasswordWithEmptySpace(){
        User user = new User("test","new password","test@test.com");
        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("test","new password", "test@test.com"));
        userList.add(new User("test","test","test"));
        assertFalse(SILab2.function(user, userList));
    }

    // Test scenario 4
    @Test
    void testNonExistingUserWithoutUsernameWithNonValidPassword(){
        User user = new User(null,"newpassword", "test@test.com");
        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("test123","new password", "newtest@test.com"));
        userList.add(new User("test456","1234567#2", "test123@test.com"));
        assertFalse(SILab2.function(user, userList));
    }

    // Test scenario 5
    @Test
    void testNonExistingUserWithoutUsernameWithValidPassword(){
        User user = new User(null,"n#ewpassword", "test@test.com");
        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("test123","new password", "newtest@test.com"));
        userList.add(new User("test456","1234567#2", "test123@test.com"));
        assertTrue(SILab2.function(user, userList));
    }

    // Multiple condition - Test scenarios

    // TXX
    @Test
    void testScenarioWithNullUser() {
        ArrayList<User> userList = new ArrayList<User>();
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null, userList));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
    }

    // FTX
    @Test
    void testScenarioWithUserWithoutPassword() {
        User user = new User("true",null, "test@test.com");
        ArrayList<User> userList = new ArrayList<User>();
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user, userList));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
    }

    // FFT
    @Test
    void testScenarioWithUserWithoutEmail() {
        User user = new User("true","test", null);
        ArrayList<User> userList = new ArrayList<User>();
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user, userList));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
    }

    // FFF
    @Test
    void testScenarioWithValidUser() {
        User user = new User(null,"n#ewpassword", "test@test.com");
        ArrayList<User> userList = new ArrayList<User>();
        assertTrue(SILab2.function(user, userList));
    }
}