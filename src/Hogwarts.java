public abstract class Hogwarts {
    protected String fullName;
    protected int magicPower;
    protected int transgindingRange;


    public Hogwarts(String fullName, int magicPower, int transgindingRange) {
        this.fullName = fullName;
        this.magicPower = magicPower;
        this.transgindingRange = transgindingRange;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgindingRange() {
        return transgindingRange;
    }

    public void setTransgindingRange(int transgindingRange) {
        this.transgindingRange = transgindingRange;
    }

    public int personalRating() {
        return magicPower + transgindingRange;
    }


    public void comperHogwart(Hogwarts hogwarts) { //можешь мне объяснить тут как работает?)  тут comperHogwart(Hogwarts hogwarts) и garry.comperHogwart(zahar), а дальше понятно)
        int personalRating1 = personalRating();
        int personalRating2 = hogwarts.personalRating();
        if (personalRating1 > personalRating2) {
            System.out.printf("Студент %s лудче, чем студент %s : %d vs %d%n\n", getFullName(), hogwarts.getFullName(), personalRating1, personalRating2); // а чем отличаеться %s от %d && %n??
        } else if (personalRating1 < personalRating2) {
            System.out.printf("Студент %s лудче, чем студент %s : %d vs %d%n\n", hogwarts.getFullName(), getFullName(), personalRating2, personalRating1);
        } else {
            System.out.printf("Студенты имеют равные параметы , студент %s и студент %s : %d vs %d%n\n", getFullName(), hogwarts.getFullName(), personalRating1, personalRating2);
        }
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Hogwarts -  имя ученика = %s , сила магии = %s ,растояние трансгресии = %s ", fullName, magicPower, transgindingRange);
    }


}
