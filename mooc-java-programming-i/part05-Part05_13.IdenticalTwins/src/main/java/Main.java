
public class Main {

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(25, 7, 2017);
        SimpleDate date2 = new SimpleDate(24, 7, 2017);

        Person leo = new Person("Lily", date, 65, 8);
        Person lily = new Person("Lily", date2, 65, 8);

        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        }

        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);

        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");
        }

    }
}
