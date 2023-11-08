public class Singer extends Person {
    private  String brandname;

    public Singer(String name, String designation, String brandname) {
        super(name, designation);
        this.brandname = brandname;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }
    public String singing(){
        return brandname+"ырдайт";
    }
    public  String playgitar(){
        return getName()+"Не умееть играть на гитаре";
    }
}
