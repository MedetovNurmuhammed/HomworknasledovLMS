public class Programmer extends Person {
    private String companyname;

    public Programmer(String name, String designation, String companyname) {
        super(name, designation);
        this.companyname = companyname;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }
    public String coding(){
        return "Работает в компании:"+companyname;

    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companyname='" + companyname + '\'' +
                '}'+super.toString();
    }
}
