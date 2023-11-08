public class Dancer extends Person{
    private  String groupname;

    public Dancer(String name, String designation, String groupname) {
        super(name, designation);
        this.groupname = groupname;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }
    public String dancing(){
        return "Танцует в группе:"+this.groupname;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupname='" + groupname + '\'' +
                '}'+super.toString();
    }
}

