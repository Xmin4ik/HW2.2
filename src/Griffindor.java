public class Griffindor extends Hogwarts {
    // Беда с англ. ((
    private int honor; //честь
    private int nobility; //благородство
    private int courage; //храбрость

    @Override
    public String toString() {
        return String.format("%s  , честь = %s , благородство = %s , храбрость = %s ", super.toString(), honor, nobility, courage);
    }

    public Griffindor(String fullName, int magicPower, int transgindingRange, int honor, int nobility, int courage) {
        super(fullName, magicPower, transgindingRange);
        this.honor = honor;
        this.nobility = nobility;
        this.courage = courage;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public int personalGriffRating() {
        return honor + nobility + courage;
    }

    public void comperGriffins(Griffindor griffindor) {
        int personalRating1 = personalGriffRating();
        int personalRating2 = griffindor.personalGriffRating();
        if (personalRating1 > personalRating2) {
            System.out.printf("Студент %s лудче, чем студент %s : %d vs %d%n\n", getFullName(), griffindor.getFullName(), personalRating1, personalRating2);
        } else if (personalRating1 < personalRating2) {
            System.out.printf("Студент %s лудче, чем студент %s : %d vs %d%n\n", griffindor.getFullName(), getFullName(), personalRating2, personalRating1);
        } else {
            System.out.printf("Студенты имеют равные параметы , студент %s и студент %s : %d vs %d%n\n", getFullName(), griffindor.getFullName(), personalRating1, personalRating2);
        }
    }
}
