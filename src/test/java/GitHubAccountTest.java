import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {

    GitHubAccount gitHubAccount;


    @Before
    public void before(){
        gitHubAccount = new GitHubAccount("AB", "Amy Browne", "Pro", 2);

    }

    @Test
    public void hasUserName(){
        assertEquals("AB", gitHubAccount.getUsername());
    }

    @Test
    public void hasName(){
        assertEquals("Amy Browne", gitHubAccount.getName());
    }

    @Test
    public void hasAccountType(){
        assertEquals("Pro", gitHubAccount.getAccountType());
    }

    @Test
    public void hasRepo(){
        assertEquals(2, gitHubAccount.getRepos());
    }

    @Test
    public void reposStartAt0(){
        assertEquals( 0, gitHubAccount.getNumberOfRepos());
    }


    }



