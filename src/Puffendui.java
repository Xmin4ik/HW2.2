public class Puffendui extends Hogwarts {
    private int hardworking; //трудолюбивы
    private int loyal; //верны
    private int honest; //честны

    @Override
    public String toString() {
        return "puffendui{" + " имя ученика - " + getFullName() + " , сила магии - " + getMagicPower() + " , растояние трансгресии - " + getTransgindingRange() +
                " , трудолюбив = " + hardworking +
                " , верен = " + loyal +
                " , честен = " + honest +
                '}';
    }

    public Puffendui(String fullName, int magicPower, int transgindingRange, int hardworking, int loyal, int honest) {
        super(fullName, magicPower, transgindingRange);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public int personalPuffRating() {
        return hardworking + loyal + honest;
    }

    public void comperPuffendui(Puffendui puffendui) {
        int personalRating1 = personalPuffRating();
        int personalRating2 = puffendui.personalPuffRating();
        if (personalRating1 > personalRating2) {
            System.out.printf("Студент %s лудче, чем студент %s : %d vs %d%n\n", getFullName(), puffendui.getFullName(), personalRating1, personalRating2);
        } else if (personalRating1 < personalRating2) {
            System.out.printf("Студент %s лудче, чем студент %s : %d vs %d%n\n", puffendui.getFullName(), getFullName(), personalRating2, personalRating1);
        } else {
            System.out.printf("Студенты имеют равные параметы , студент %s и студент %s : %d vs %d%n\n", getFullName(), puffendui.getFullName(), personalRating1, personalRating2);
        }
    }
}
