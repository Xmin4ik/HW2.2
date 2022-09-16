public class Slizorin extends Hogwarts {
    private int cunning; //хитрость
    private int determination; //решительность
    private int ambition; //амбициозность
    private int resourcefulness; //находчивость
    private int lustForPower; //жажда власти

    @Override
    public String toString() {
        return "slizorin{" + " имя ученика - " + getFullName() + " , сила магии - " + getMagicPower() + " , растояние трансгресии - " + getTransgindingRange() +

                ", хитрость = " + cunning +
                ", решительность = " + determination +
                ", амбициозность = " + ambition +
                ", находчивость = " + resourcefulness +
                ", властлив = " + lustForPower +
                '}';
    }

    public Slizorin(String fullName, int magicPower, int transgindingRange, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, magicPower, transgindingRange);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public int personalSlizRating() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    public void comperSliz(Slizorin slizorin) {
        int personalRating1 = personalSlizRating();
        int personalRating2 = slizorin.personalSlizRating();
        if (personalRating1 > personalRating2) {
            System.out.printf("Студент %s лудче, чем студент %s : %d vs %d%n\n", getFullName(), slizorin.getFullName(), personalRating1, personalRating2);
        } else if (personalRating1 < personalRating2) {
            System.out.printf("Студент %s лудче, чем студент %s : %d vs %d%n\n", slizorin.getFullName(), getFullName(), personalRating2, personalRating1);
        } else {
            System.out.printf("Студенты имеют равные параметы , студент %s и студент %s : %d vs %d%n\n", getFullName(), slizorin.getFullName(), personalRating1, personalRating2);
        }
    }
}
