public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte a = 86;
        short b = -15544;
        int c = 239882379;
        long d = -3298783628680L;
        float e = 8.894364F;
        double f = -232.924566582;
        System.out.println("Значение переменной a с типом byte равно " + a + ".");
        System.out.println("Значение переменной b с типом short равно " + b + ".");
        System.out.println("Значение переменной c с типом int равно " + c + ".");
        System.out.println("Значение переменной d с типом long равно " + d + ".");
        System.out.println("Значение переменной e с типом float равно " + e + ".");
        System.out.println("Значение переменной f с типом double равно " + f + ".");
        //Задача 2
        float a1 = 27.12F;
        long b1 = 987678965549L;
        float c1 = 2.786F;
        short d1 = 569;
        short e1 = -159;
        short f1 = 27897;
        byte g1 = 67;
        //Задача 3
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        int allStudents = class1 + class2 + class3;
        short sheet = 480;
        int sheetsPerStudents = sheet / allStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudents + " листов бумаги");
        //Задача 4
        byte bottlesMinutes = 16;
        byte minutes = 2;
        int v = bottlesMinutes / minutes;
        int t1 = 20;
        int t2 = 24 * 60;
        int t3 = 3 * 24 * 60;
        int t4 = 30 * 24 * 60;
        int s1 = v * t1;
        int s2 = v * t2;
        int s3 = v * t3;
        int s4 = v * t4;
        System.out.println("За 20 минут машина произвела " + s1 + " штук бутылок");
        System.out.println("За сутки машина произвела " + s2 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + s3 + " штук бутылок");
        System.out.println("За 1 месяц (30 дней) машина произвела " + s4 + " штук бутылок");
        //Задача 5
        byte paint = 120;
        byte wh = 2;
        byte br = 4;
        int wb = wh + br;
        int room = paint / wb;
        int white = wh * room;
        int brown = br * room;
        System.out.println("В школе, где " + room + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски)");
        //Задача 6
        byte bananas = 5;
        short milk = 200;
        byte iceCream = 2;
        byte eggs = 4;
        byte wBanana = 80;
        float wMilk = 1.05F;
        byte wIceCream = 100;
        byte wEgg = 70;
        float massG = wBanana * bananas + wMilk * milk + wIceCream * iceCream + wEgg * eggs;
        float massKG = massG / 1000;
        System.out.println("Вес спортзавтрака равен " + massG + " грамм или " + massKG + " килограмм");
        //Задача 7
        byte wLossKG = 7;
        int wLossG = wLossKG * 1000;
        int wLoss1 = 250;
        int wLoss2 = 500;
        int days1 = wLossG / wLoss1;
        int days2 = wLossG / wLoss2;
        int avgDays = (days1 + days2) / 2;
        System.out.println("Если спортсмен будет терять по " + wLoss1 + " грамм в день, то ему потребуется " + days1 + " дней.");
        System.out.println("Если спортсмен будет терять по " + wLoss2 + " грамм в день, то ему потребуется " + days2 + " дней.");
        System.out.println("В среднем спортсмену для достижения цели потребуется " + avgDays + " дней.");
        //Задача 8
        int Masha = 67760;
        int Denis = 83610;
        int Kristina = 76230;
        float nMasha = (float) (Masha * 1.1);
        float nDenis = (float) (Denis * 1.1);
        float nKristina = (float) (Kristina * 1.1);
        float diffMasha = (nMasha - Masha) * 12;
        float diffDenis = (nDenis - Denis) * 12;
        float diffKristina = (nKristina - Kristina) * 12;
        System.out.println("Новая зарплата Маши равна " + nMasha + " рублей, а разница годового дохода составляет " + diffMasha + " рублей");
        System.out.println("Новая зарплата Дениса равна " + nDenis + " рублей, а разница годового дохода составляет " + diffDenis + " рублей");
        System.out.println("Новая зарплата Кристины равна " + nKristina + " рублей, а разница годового дохода составляет " + diffKristina + " рублей");

    }
}