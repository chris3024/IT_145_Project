public class PetTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog(1, 30, true);
        boolean groom = false;
        dog1.setGrooming(groom);
        System.out.println("Grooming for 1 " + dog1.getGrooming());

    }
}
