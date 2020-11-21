import java.util.ArrayList;

public class Repo {

    private String name;
    private String description;
    private String repoType;
    private ArrayList<Commit> commits;

    public Repo(String name, String description, String repoType) {
        this.name = name;
        this.description = description;
        this.repoType = repoType;
        this.commits = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {//test this
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {//test this
        this.description = description;
    }

    public String getRepoType(){
        return repoType;
    }

    public void setRepoType(String repoType) {//test this
        this.repoType = repoType;
    }

    public int commitsStartAt0(){
        return commits.size();
    }

    public int commitCount() {
        return this.commits.size();
    }

    public void addCommit(Commit commit) {
        this.commits.add(commit);
    }

    public Commit findCommitByUniqueID(int uniqueID){
        Commit foundCommitByUniqueID = null;
        for(Commit commit:this.commits){
            if(commit.getUniqueID() == uniqueID){
                foundCommitByUniqueID = commit;
            }
        }
        return foundCommitByUniqueID;
    }

}
