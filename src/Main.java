

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
    while (year <= tern) {
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

    int percentOf = 7;
    int summ = 15_000;
    int goal = 12_000_000;

    int monthFirst = 1;

    while (summ < goal) {
          summ += summ * percentOf / 100;
          if (monthFirst % 6 == 0) {
              System.out.println(String.format("Месяц %S , сумма накоплений составдяет %S", monthFirst, summ));
          }
          monthFirst++;
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
    for (int friday = 1; friday <= oursMonth; friday = friday + week) {
        System.out.println(" Сегодня пятница " + friday + "-е число. Необходимо подготовить еженедельный отчет.");
    }

    System.out.println("Задача 8");

    int cometFrequency = 79;
    int nextYear =  100;
    int lastYear =  200;

    int currentYear = 2023;

    for (int dat = currentYear - lastYear; dat < currentYear + nextYear; dat++) {
        if (dat % cometFrequency == 0) {
        System.out.println(dat);
        }
    }


    }
}