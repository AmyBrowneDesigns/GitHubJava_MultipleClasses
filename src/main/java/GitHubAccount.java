import java.util.ArrayList;

public class GitHubAccount {

    private String username;
    private String name;
    private AccountType accountType;
    private int repo;
    private ArrayList<Repo> repos;

    public GitHubAccount(String username, String name, AccountType accountType, int repo) {
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



    public AccountType getAccountType(){
        return accountType;
    }


    public AccountType setAccountType(AccountType AccountType){
        return this.accountType = AccountType;
    }

    public AccountType upgradeAccountType(AccountType AccountType){
        return this.accountType = AccountType.PRO;
    }


//    public String upgradeAccountType(){
//        switch(accountType){
//            case "Pro":
//                System.out.println("You're account is now upgraded");
//                break;
//        }
//        return this.accountType;
//    }

    public int getRepos(){
        return repo;
    }

    public int getNumberOfRepos(){
        return this.repos.size();
    }

    public int repoCount() {
        return this.repos.size();
    }
    public void addRepo(Repo repo){
        this.repos.add(repo);
    }

    public Repo findRepo(String repoName) {
        return repos.get(0);
    }
//    public Repo removeRepo(){
//        return this.repos.remove(repo);
//    }
}
