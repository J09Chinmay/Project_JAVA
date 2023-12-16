package OOPs;
class Staff{
    private String name;
    private String addr;
    private String phoneNum;
    Staff(String name,String addr,String phoneNum){
        this.name=name;
        this.addr=addr;
        this.phoneNum=phoneNum;
    }
    void display(){
        System.out.println("Name         "+this.name);
        System.out.println("Address      "+this.addr);
        System.out.println("Phone Number "+this.phoneNum);
    }
}
class Teacher extends Staff{
    private String subj;
    private String classTech;
    Teacher(String name, String addr, String phoneNum,String subj,String classTech) {
        super(name, addr, phoneNum);
        this.subj=subj;
        this.classTech=classTech;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Subject Taught "+this.subj);
        System.out.println("Class Room     "+this.classTech);
    }
}
class Principal extends Staff{
    private String qualification;
    Principal(String name, String addr, String phoneNum,String qualification) {
        super(name, addr, phoneNum);
        this.qualification=qualification;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Qualification "+this.qualification);
    }
}
public class School_Staffs {
    public static void main(String[] args) {
        System.out.println("\tESTEEM PUBLIC SCHOOL\t");
        System.out.println("\t*******************\t");
        Teacher t=new Teacher("Ankita Rout","Balasore","9075004043","Chemistry","10");
        t.display();
        Principal  p =new Principal("Gopi","Randi_Khana","908080809","Master's-Watchman");
        p.display();

    }
}
