package domain.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFriend {

    @Test
    public void testInitialization() {
        Friend friend = new Friend("Frank", "Frankie");
        assertEquals(friend.getUserName(), "Frank");
        assertEquals(friend.getDisplayName(), "Frankie");
    }

}
