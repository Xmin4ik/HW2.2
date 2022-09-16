public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cogtevran chang = new Cogtevran("Чжоу Чанг", 45, 60, 80, 77, 45, 100);
        Cogtevran patil = new Cogtevran("Падма Патил", 60, 30, 40, 71, 21, 63);
        Cogtevran belby = new Cogtevran("Маркус Белби", 75, 65, 75, 54, 78, 54);


        Griffindor garry = new Griffindor("Гарри Поттер", 50, 60, 85, 70, 99);
        Griffindor germi = new Griffindor("Гермиона Грейнджер", 45, 50, 65, 70, 50);
        Griffindor ron = new Griffindor("Рон Уизли", 1, 2, 85, 88, 85);

        Puffendui zahar = new Puffendui("Захария Смит", 22, 89, 99, 2, 14);
        Puffendui sedrik = new Puffendui("Седрик Диггори", 75, 20, 77, 50, 88);
        Puffendui djastin = new Puffendui("Джастин Финч-Флетчли", 85, 23, 71, 73, 78);

        Slizorin drako = new Slizorin("Драко Малфой", 45, 55, 15, 90, 88, 70, 88);
        Slizorin grejham = new Slizorin("Грэхэм Монтегю", 60, 35, 44, 30, 43, 74, 40);
        Slizorin gregory = new Slizorin("Грегори Гойл", 75, 75, 30, 40, 54, 35, 43);

        chang.print();
        patil.print();
        belby.print();
        garry.print();
        germi.print();
        ron.print();
        zahar.print();
        sedrik.print();
        djastin.print();
        drako.print();
        grejham.print();
        gregory.print();
        garry.comperHogwart(zahar);
        ron.comperHogwart(zahar);
        gregory.comperHogwart(germi);
        grejham.comperSliz(drako);
        // Griffindor.howIsBestGriffinderz(Griffindor[]) видимо через массив это не сделать)
    }


}
