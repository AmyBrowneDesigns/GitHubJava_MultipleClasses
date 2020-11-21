import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {

    GitHubAccount gitHubAccount;
    Repo repo1;
    Repo repo2;

    @Before
    public void before(){
        gitHubAccount = new GitHubAccount("AB", "Amy Browne", AccountType.FREE, 2);
        repo1 = new Repo("PythonProject", "App for kids", "Public");
        repo2 = new Repo("JavascriptProject", "App for adults", "Private");
        gitHubAccount.addRepo(repo1);
        gitHubAccount.addRepo(repo2);

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
        assertEquals(AccountType.FREE, gitHubAccount.getAccountType());
    }

    @Test
    public void setGitHubAccount(){
        assertEquals(AccountType.FREE, gitHubAccount.setAccountType(AccountType.FREE));
    }

    @Test
    public void upgradeAccountType() {
        assertEquals(AccountType.PRO, gitHubAccount.setAccountType(AccountType.PRO));
    }

    @Test
    public void hasRepo(){
        assertEquals(2, gitHubAccount.getRepos());
    }

    @Test
    public void reposStartAt0(){
        assertEquals( 2, gitHubAccount.getNumberOfRepos());
    }

    @Test
    public void addRepo(){
        gitHubAccount.addRepo(repo1);
        gitHubAccount.addRepo(repo1);
        assertEquals(4, gitHubAccount.repoCount());
    }

    @Test
    public void canFindRepo() {
        Repo foundRepo = gitHubAccount.findRepo("PythonProject");
        assertEquals(repo1, foundRepo);
    }



//    @Test
//    public void removeRepo(){
//        assertEquals(2, gitHubAccount.removeRepo());
//    }




    }



