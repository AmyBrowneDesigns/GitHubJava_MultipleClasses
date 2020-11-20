import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepoTest {

    Repo Repo;

    @Before
    public void before(){
        Repo = new Repo("My TravelBucket", "A Travel Bucket List App", "Public");
    }

    @Test
    public void hasName(){
        assertEquals("My TravelBucket", Repo.getName());
    }

    @Test
    public void hasDescription(){
        assertEquals("A Travel Bucket List App", Repo.getDescription());
    }

    @Test
    public void hasRepoType(){
        assertEquals("Public", Repo.getRepoType());
    }

    @Test
    public void numberOfCommits(){
        assertEquals(0, Repo.commitsStartAt0());
    }
}
