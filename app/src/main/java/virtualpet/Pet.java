package virtualpet;

//main for virtual pet
public class Pet {
    public String puppyName;
    public int Hunger;
    public int Boredom;
    public int Thirst;
    public int Waste;
    public int Sickness;

public Pet(String name) {
    puppyName = name;
    Hunger = 1;
    Boredom = 1;
    Thirst = 1;
    Waste = 1;
    Sickness = 1;
}

    // methods to increase/decrease our puppy's needs
    public void changeHunger(int food) {
        Hunger += food;
    }

    public void changeThirst(int water) {
        Thirst += water;
    }

    public void changeWaste(int potty) {
        Hunger += potty;
    }

    public void changeSickness(int ill) {
        Sickness += ill;
    }

    public void changeBoredom(int bored) {
        Boredom += bored;
    }

    // tick method that will generate randomized game loop (+1 each time player does
    // something)
    public void tick() {
        Hunger += 1;
        Thirst += 1;
        Waste += 1;
        Sickness += 1;
        Boredom += 1;
    }

    // getters
    public String getPuppyName() {
        return puppyName;
    }

    public int getHunger() {
        return Hunger;
    }

    public int getThirst() {
        return Thirst;
    }

    public int getWaste() {
        return Waste;
    }

    public int getSickness() {
        return Sickness;
    }

    public int getBoredom() {
        return Boredom;
    }

    // setter methods
    public void setPuppyName(String puppyName) {
        this.puppyName = puppyName;
    }

    public void setHunger(int Hunger) {
        this.Hunger = Hunger;
    }

    public void setThirst(int Thirst) {
        this.Thirst = Thirst;
    }

    public void setWaste(int Waste) {
        this.Waste = Waste;
    }

    public void setSickness(int Sickness) {
        this.Sickness = Sickness;
    }

    public void setBoredom(int Boredom) {
        this.Boredom = Boredom;
    }
}
