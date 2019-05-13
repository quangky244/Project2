import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Person> employees = new ArrayList<>();
    private Person boss;
    boolean hasBoss = false;
    boolean hasEmployee=false;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addBoss(Person boss){
        if(!hasBoss) {
            this.boss = boss;
            hasBoss = true;
            boss.addEmployeePassive(this);
        }
        else{
            System.out.println("I already belong to master "+this.boss.getName());
        }
    }

    public void addBossPassive(Person boss){
        if(!hasBoss) {
            this.boss = boss;
            hasBoss = true;
        }
        else{
            System.out.println("I have boss");
        }
    }

    public void addEmployeePassive(Person employee){
        employees.add(employee);
    }

    public void addEmployee(Person employee){
        if(!employee.isHasBoss()) {
            employees.add(employee);
            employee.addBossPassive(this);
        } else {
            System.out.println("Employee already had boss");
        }
    }

    public boolean isHasBoss(){
        return hasBoss;
    }

    public void showEmployee(){
        for(int i=0;i<employees.size();i++){
            System.out.println("Employee:"+ employees.get(i).getName() );
        }
    }

    public void showBoss(){
        if (hasBoss){
            System.out.println("Boss name:" + this.boss.getName());
        } else {
            System.out.println("I am self employed");
        }
    }

}
