public class Main {
    public static void main(String[] args) {
        Person person01 = new Person("James", 21, 170, 70);
        Person person02 = new Person("Billy", 25, 190, 80);

        System.out.println("Name: " + person01.getName()+ " Age: " + person01.getAge() + " Height " + person01.getHeight() + " Weight " + person01.getWeight());
        person01.growOlder();
        System.out.println("Name: " + person01.getName()+ " Age: " + person01.getAge() + " Height " + person01.getHeight() + " Weight " + person01.getWeight());


    }
}