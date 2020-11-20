import java.util.ArrayList;

public class GitHubAccount {

    private String username;
    private String name;
    private String accountType;
    private int repo;
    private ArrayList<Repo> repos;

    public GitHubAccount(String username, String name, String accountType, int repo) {
        this.username = username;
        this.name = name;
        this.accountType = accountType;
        this.repo = repo;
        this.repos = new ArrayList<>();
    }

    public String getUsername() {
        return username;

    }

    public void setUsername(String username) {//test this
        this.username = username;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {//test this
        this.name = name;
    }

    public String getAccountType(){
        return accountType;
    }

    public int getRepos(){
        return repo;
    }
    public int getNumberOfRepos(){
        return this.repos.size();
    }
}
