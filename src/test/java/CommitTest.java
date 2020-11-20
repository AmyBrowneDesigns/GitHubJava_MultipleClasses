import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    Commit commit;

    @Before
    public void before(){
        commit = new Commit ("Added Components", 20091987);
    }

    @Test
    public void hasDescription(){
        assertEquals("Added Components", commit.getDescription());
    }

    @Test
    public void hasUniqueId(){
        assertEquals(0, commit.getUniqueID());
    }
}
