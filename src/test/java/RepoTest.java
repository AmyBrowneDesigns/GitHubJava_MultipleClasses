import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepoTest {

    Repo repo;
    Commit commit1;
    Commit commit2;

    @Before
    public void before(){
        repo = new Repo("My TravelBucket", "A Travel Bucket List App", "Public");
        commit1 = new Commit("Added styling", 20091990);
        commit2 = new Commit("Added RestFul Routes", 20091995);
        repo.addCommit(commit1);
        repo.addCommit(commit2);
    }



    @Test
    public void hasName(){
        assertEquals("My TravelBucket", repo.getName());
    }

    @Test
    public void hasDescription(){
        assertEquals("A Travel Bucket List App", repo.getDescription());
    }

    @Test
    public void hasRepoType(){
        assertEquals("Public", repo.getRepoType());
    }

    @Test
    public void numberOfCommits(){
        assertEquals(2, repo.commitsStartAt0());
    }

    @Test
    public void canAddCommit(){
        repo.addCommit(commit1);
        repo.addCommit(commit2);
        assertEquals(4, repo.commitCount());
    }

    @Test
    public void getCommitByUniqueID(){
        repo.addCommit(commit1);
        repo.addCommit(commit2);
        assertEquals(commit2, repo.findCommitByUniqueID(20091995));

    }

}

