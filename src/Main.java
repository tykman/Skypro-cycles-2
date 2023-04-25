

public class Main {
    public static void main(String[] args) {
    System.out.println("Задача 1");

    int end = 2_459_000;
    int monthlyDeposit = 15_000;
    int love = 0;

    int i = 0;

    while (love < end) {
        love += monthlyDeposit;
        i++;
        System.out.println(" Месяц " + i + ", сумма накоплений равна" + love + " рублей");
    }

    System.out.println("Задача 2");

    int start = 0;
    while (start < 10) {
        start = start + 1;
        System.out.print(" " + start);
    }
    System.out.println();
    for (int sta = 10; sta >= 1;sta--) {
        System.out.print(" " + sta);
    }
    System.out.println();

    System.out.println("Задача 3");

    int population = 12_000_000;
    int birthRate = 17;
    int deathRate = 8;
    int tern = 10;

    int year = 1;
    while (year < tern) {
        population = population + population * (birthRate - deathRate) / 1000;
        System.out.println(String.format("Год %S , численность населения составит %S " , year , population));
        year++;
    }

    System.out.println("Задача 4");

    int percent = 7;
    int firstCapital = 15_000;
    int capitalGoal = 12_000_000;

    int month = 0;

    while (firstCapital < capitalGoal) {
        firstCapital += firstCapital *percent / 100;
        System.out.println(String.format("Месяц %S ,сумма накоплений составляет %S  рублей ", month , firstCapital));
        month++;
    }

    System.out.println("Задача 5");

    int capitalFirst = 15_000;
    int percentOf = capitalFirst / 70;
    int capPercent = capitalFirst + percentOf;
    int withPennyTotal = 0;
    for (int sixMonth = 0; sixMonth < 177; sixMonth = sixMonth + 6) {
        withPennyTotal = withPennyTotal + withPennyTotal / 70;
        withPennyTotal = withPennyTotal + capPercent;
        System.out.println("Месяц " + sixMonth + " , сумма накоплений равна " + withPennyTotal + " рублей");
    }

    System.out.println("Задача 6");

    int percentA = 7;
    int summa = 15_000;
    int yearsCount =9;

    int months = 0;

    while (months < yearsCount * 12) {
        summa += summa * percentA / 100;
        if (months % 6 == 0) {
            System.out.println(String.format("Месяц %S , сумма накоплений составляет %S ", months, summa));
        }
        months++;
    }

    System.out.println("Задача 7");

    int week = 7;
    int oursMonth = 31;
    for (int friday = 1; friday < oursMonth; friday = friday + week) {
        System.out.println(" Сегодня пятница " + friday + "-е число. Необходимо подготовить еженедельный отчет.");
    }

    System.out.println("Задача 8");

    int cometFrequency = 79;
    int nextYear = 100;
    int lastYear = 200;

    int currentYear = 2023;

    for (int dat = currentYear - lastYear; dat < currentYear + nextYear; dat = dat + cometFrequency) {
        if (dat / currentYear == 0) {
            System.out.println(dat);
        }
    }

    System.out.println("Задача 8а");

    int ifYearNow = 2017;
    int yearLast = 200;
    int yearNext = 100;
    int arrivalFrequency = 79;
    int date = ifYearNow - yearLast;
    int endOf = ifYearNow + yearNext;
    for (int dat = date; dat < endOf; dat = dat + arrivalFrequency) {
        System.out.println(dat);
    }
    }
}