public class Week6p00NamedArgs {

    public static class Person {
        String Name;
        int age;

        Person(String inName, int age) {
            Name = inName;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        System.out.println("HI");

        Person p1 = new Person("Max", 11);
        Person p2 = new Person("Inam", 13);

        //p2.Name = "Ali";
        //p2.age = 14;

        System.out.println(p1.Name);
        System.out.println(p1.age);
        System.out.println(p2.Name);
        System.out.println(p2.age);
    }
}
