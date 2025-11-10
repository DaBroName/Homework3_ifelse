public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        int age = 18;
        System.out.println("Возраст человека = " + age);
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " лет, то он не достиг совершеннолетия, " +
                    "нужно немного подождать");
        }

        System.out.println("Задача 2:");
        int temp = 10;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

        System.out.println("Задача 3:");
        int speed = 85;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }

        System.out.println("Задача 4:");
        int age2 = 15;
        if (age2 > 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
        } else if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу.");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то его место в университете.");
        } else if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему пора ходить на работу.");
        }

        System.out.println("Задача 5:");
        int age3 = 13;
        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе");
        } else if (age3 > 5 && age3 <= 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься только в сопровождении" +
                    " взрослого. Если взрослого нет, то кататься нельзя");
        } else if (age3 > 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься без сопровождения " +
                    "взрослого");
        }

        System.out.println("Задание 6:");
        int capacityOfOneTrainCarriage = 102; // вместимость одного вагона поезда
        int numberOfSeats = 60; // сидячих мест в отдном вагоне
        int currentNumberOfPassengers = 60; // текущее количество пассажиров

        if (currentNumberOfPassengers < numberOfSeats) {
            System.out.println("Есть сидячие места");
        } else if (currentNumberOfPassengers >= currentNumberOfPassengers && currentNumberOfPassengers
                < capacityOfOneTrainCarriage) {
            System.out.println("Остались стоячие места");
        } else if (currentNumberOfPassengers == capacityOfOneTrainCarriage) {
            System.out.println("Вагон полон");
        }

        System.out.println("Задача 7:");
        int one = 7;
        int two = 9;
        int three = 5;
        if (one > two && two > three) {
            System.out.println("Число один большее - " + one);
        } else if (two > one && two > three) {
            System.out.println("Число два большее - " + two);
        } else if (three > one && three > two) {
            System.out.println("Число три большее - " + three);
        } else if (one == two && two == three) {
            System.out.println("Все три числа равны" + one + " " + two + " " + three);
        }
    }
}