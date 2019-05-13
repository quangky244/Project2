public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Person VanBa = new Person("Uncle Hoe");
        Person SingCung = new Person ("SingCung");
        Person SingSax = new Person("SingSax");
        Person ChiMinh = new Person("Hoe Chu Tich");
        VanBa.addBoss(SingSax);
        VanBa.addEmployee(SingCung);
        VanBa.showBoss();
        VanBa.addBoss(ChiMinh);
        VanBa.showBoss();
        System.out.println("Employee of SingSax: ");
        SingSax.showEmployee();
    }
}
