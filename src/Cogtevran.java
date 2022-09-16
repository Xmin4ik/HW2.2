public class Cogtevran extends Hogwarts {
    private int smart; //умны
    private int wise; //мудры
    private int witty; //остроумны
    private int fullOfCreativity; //полны творчества

    @Override
    public String toString() {
        return "cogtevran{" + " имя ученика - " + getFullName() + " , сила магии - " + getMagicPower() + " , растояние трансгресии - " + getTransgindingRange() +
                ", умен = " + smart +
                ", мудр = " + wise +
                ", остроумен = " + witty +
                ", творческий = " + fullOfCreativity +
                '}';
    }

    public Cogtevran(String fullName, int magicPower, int transgindingRange, int smart, int wise, int witty, int fullOfCreativity) {
        super(fullName, magicPower, transgindingRange);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }

    public int personalCogRating() {
        return smart + wise + witty + fullOfCreativity;
    }

    public void comperCogtevran(Cogtevran cogtevran) {
        int personalRating1 = personalCogRating();
        int personalRating2 = cogtevran.personalCogRating();
        if (personalRating1 > personalRating2) {
            System.out.printf("Студент %s лудче, чем студент %s : %d vs %d%n\n", getFullName(), cogtevran.getFullName(), personalRating1, personalRating2);
        } else if (personalRating1 < personalRating2) {
            System.out.printf("Студент %s лудче, чем студент %s : %d vs %d%n\n", cogtevran.getFullName(), getFullName(), personalRating2, personalRating1);
        } else {
            System.out.printf("Студенты имеют равные параметы , студент %s и студент %s : %d vs %d%n\n", getFullName(), cogtevran.getFullName(), personalRating1, personalRating2);
        }
    }
}
