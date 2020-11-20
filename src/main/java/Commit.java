public class Commit {

    private String description;
    private int uniqueID;

    public Commit ( String description, int UniqueID){
        this.description =description;
        this.uniqueID = uniqueID;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {//test this
        this.description = description;
    }

    public int getUniqueID(){
        return this.uniqueID;
    }
}
