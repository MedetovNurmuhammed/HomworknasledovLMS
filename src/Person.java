public class Person {
    private  String name;
    private String designation;

    public Person(String name,String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public  String learn(){
        return "Учится на  " + this.designation;
    }
    public String walk(){
        return "Ходит на "+ designation;
    }
    public String eat(){
        return "Лагман";
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}'+super.toString();
    }
}

