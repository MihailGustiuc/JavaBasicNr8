package task1;

public class Main  {

    public static void main(String[] args) {
        Person somePerson = new Person("Mihai Gustiuc","Nicolae Dimo");
        System.out.println(somePerson);
        Student someStudent = new Student("Vlad","Vlaicu Pircalab","some program",2022,35.7);
        System.out.println(someStudent);
        Staff someStaff = new Staff("Leonid Bucovel","Petru Rases 32", "Scoala Alexandru Iona Cuza",3523.42);
        System.out.println(someStaff);

    }

}
