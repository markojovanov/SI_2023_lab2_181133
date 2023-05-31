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
    void testScenarioPasswordEqualsUsername3(){
        User user = new User("test","new password","test@test.com");
        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("test","new password", "test@test.com"));
        userList.add(new User("test","test","test"));
        assertFalse(SILab2.function(user, userList));
    }

    // Test scenario 4
    @Test
    void testScenarioPasswordEqualsUsername4(){
        User user = new User(null,"newpassword", "test@test.com");
        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("test123","new password", "newtest@test.com"));
        userList.add(new User("test456","1234567#2", "test123@test.com"));
        assertFalse(SILab2.function(user, userList));
    }

    // Test scenario 5
    @Test
    void testScenarioPasswordEqualsUsername5(){
        User user = new User(null,"n#ewpassword", "test@test.com");
        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("test123","new password", "newtest@test.com"));
        userList.add(new User("test456","1234567#2", "test123@test.com"));
        assertTrue(SILab2.function(user, userList));
    }
    // Multiple condition - Test scenarios

    @Test
    void testMultipleConditionScenarios(){
        ArrayList<User> userList = new ArrayList<User>();

        // TXX
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null, userList));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        // FTX
        User user1 = new User("true",null, "test@test.com");
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user1, userList));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        // FFT
        User user2 = new User("true","test", null);
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user2, userList));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        // FFF
        User user3 = new User(null,"n#ewpassword", "test@test.com");
        assertTrue(SILab2.function(user3, userList));
    }
}