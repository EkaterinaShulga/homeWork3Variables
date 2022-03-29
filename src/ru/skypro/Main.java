package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //task1
        byte one = 127;
        short two = 1243;
        int num = -15473;
        long nun = 16495657L;

        float ar = 0.32f;
        double ara = 3.02545412;

        boolean bul = true;
        char ch = 'A';


        //task2
        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        float totalWeighBoxer = firstBoxer + secondBoxer;
        float differenceWeighBoxer = (secondBoxer%firstBoxer);
        System.out.println("Вес двух бойцов равен " + totalWeighBoxer + " кг.");
        System.out.println("Разница между весами бойцов равна " + differenceWeighBoxer + " кг.");


        //task3
        int bananas = 5*80;
        int milk = 2*105;
        int sundae= 2*100;
        int rawEggs = 4*70;
        float totalBreakfastWeight = (float) (bananas + milk +  sundae + rawEggs)/1000;

        System.out.println("Общий вес завтрака равен " + totalBreakfastWeight + " кг.");


        // task4
        int excessWeight = 7;
        int weightLoss1 = 250;
        int weightLoss2 = 500;
        int weightLossDays = (excessWeight*1000)/weightLoss1;
        int weightLossDays2 = (excessWeight*1000)/weightLoss2;
        int averageTime = weightLossDays2%weightLossDays;

        System.out.println("Если спортсмен будет терять каждый день по " + weightLoss1 + " грамм, то на "
                + excessWeight + " килограмм он похудеет за " + weightLossDays + " дней.");

        System.out.println("Если спортсмен будет терять каждый день по " + weightLoss2 + " грамм, то на " +
                excessWeight + " килограмм он похудеет за " + weightLossDays2 + " дней.");

        System.out.println("В среднем может понадобиться " + averageTime + " дней, чтобы похудеть на "+ excessWeight + " кг.");


        // task5
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int newSalaryMasha = (salaryMasha*10)/100+salaryMasha;
        int newSalaryDenis = (salaryDenis*10)/100+salaryDenis;
        int newSalaryKristina = (salaryKristina*10)/100+salaryKristina;

        int salaryYearMasha = salaryMasha*12;
        int newSalaryYearMasha = newSalaryMasha*12;
        int changeSalaryYearMasha =newSalaryYearMasha%salaryYearMasha;

        int salaryYearDenis = salaryDenis*12;
        int newSalaryYearDenis = newSalaryDenis*12;
        int changeSalaryYearDenis =newSalaryYearDenis%salaryYearDenis;

        int salaryYearKristina = salaryKristina*12;
        int newSalaryYearKristina = newSalaryKristina*12;
        int changeSalaryYearKristina =newSalaryYearKristina%salaryYearKristina;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + changeSalaryYearMasha +" рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + changeSalaryYearDenis +" рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + changeSalaryYearKristina +" рублей.");








    }
}
    
