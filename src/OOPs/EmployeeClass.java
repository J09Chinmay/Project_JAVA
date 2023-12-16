package OOPs;
class Employes{
    int salary ;
    String name;
    public int getSalary(){
        return salary;
    }
//    getName (method returning String)
    public String getName(){
        return name;
    }
//    setName (method changing name)
    public void setName(String n){
        name=n;
    }
}
public class EmployeeClass {
    public static void main(String[] args) {
    Employes chinmay=new Employes();
    chinmay.name="Chinmay jena";
    chinmay.salary=898989;
    chinmay.setName("Chiku");
        System.out.println(chinmay.getName());
        System.out.println(chinmay.getSalary());
    }
}
