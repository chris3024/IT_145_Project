public class Pet {
    // Attributes
    private String petType;
    private String petName;
    private int petAge;
    private int dogSpace;
    private int catSpace;
    private int daysStay;
    private double amountDue;

    public Pet(String petType, String petName, int petAge, int dogSpace, int catSpace, int daysStay, double amountDue)
    {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.dogSpace = dogSpace;
        this.catSpace = catSpace;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
    }


    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public int getDogSpace() {
        return dogSpace;
    }

    public void setDogSpace(int dogSpace) {
        this.dogSpace = dogSpace;
    }

    public int getCatSpace() {
        return catSpace;
    }

    public void setCatSpace(int catSpace) {
        this.catSpace = catSpace;
    }

    public int getDaysStay() {
        return daysStay;
    }

    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
}

