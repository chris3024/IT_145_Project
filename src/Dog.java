
public class Dog{
    // private fields
    private int dogSpaceNumber;
    private int dogWeight;
    private boolean grooming;

    public Dog(int dogSpaceNumber, int dogWeight, boolean grooming) {
        this.dogSpaceNumber = dogSpaceNumber;
        this.dogWeight = dogWeight;
        this.grooming = grooming;
    }

    public int getDogSpaceNumber() {
        return dogSpaceNumber;
    }

    public void setDogSpaceNumber(int dogSpaceNumber) {
        this.dogSpaceNumber = dogSpaceNumber;
    }

    public int getDogWeight() {
        return dogWeight;
    }

    public void setDogWeight(int dogWeight) {
        this.dogWeight = dogWeight;
    }

    public boolean getGrooming() {
        return grooming;
    }

    public void setGrooming(boolean grooming) {
        this.grooming = grooming;
    }
}


