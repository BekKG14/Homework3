//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = (int) (Math.random() * 100);
        if (age >= 18) {
            System.out.println("Человек совершеннолетний");
        } else {
            System.out.println("Нужно подождать");
        }
        // Задача 2
        int temperatureOutside = (int) (Math.random() * 100) - 50;
        if (temperatureOutside < 5) {
            System.out.printf("На улице %d градусов, нужно надеть шапку%n", temperatureOutside);
        } else {
            System.out.printf("На улице %d, можно ходить без шапки%n", temperatureOutside);
        }
        //Задача 3
        int speed = (int) (Math.random() * 200);
        if (speed > 60) {
            System.out.printf("Если скорость %d км/ч, придется заплатить штраф.%n", speed);
        } else {
            System.out.printf("Если скорость %d км/ч, можно ездить спокойно.%n", speed);
        }
        // Задача 4
        int studentsAge = (int) (Math.random() * 30) + 1;
        if (studentsAge >= 2 && studentsAge <= 6) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в детский сад%n", studentsAge);
        } else if (studentsAge >= 7 && studentsAge <= 17) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу%n", studentsAge);
        } else if (studentsAge >= 18 && studentsAge <= 24) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в университет%n", studentsAge);
        } else if (studentsAge > 24) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить на работу%n", studentsAge);
        }
        // Задание 5
        int kidAge = (int) (Math.random() * 17);
        if (kidAge <= 5) {
            System.out.printf("Если в возраст ребенка равен %d лет, то ему нельзя кататься на атракционе.%n", kidAge);
        } else if (kidAge >= 6 && kidAge <= 14) {
            System.out.printf("Если в возраст ребенка равен %d лет, то ему можно кататься на атракционе в сопровождении.%n", kidAge);
        } else {
            System.out.printf("Если в возраст ребенка равен %d лет, то ему можно кататься без сопровождения.%n", kidAge);
        }
        // Задание 6
        int carriageCapacity = 102;
        int sittingPlaces = 60;
        int people = (int) (Math.random() * 102);
        int standingRoom = carriageCapacity - sittingPlaces;
        int freeStandingRoom = standingRoom - (people - sittingPlaces);
        if (people <= sittingPlaces) {
            System.out.printf("Можно сесть, так как людей всего %d.%n", people);
        } else if (people >= sittingPlaces && people < carriageCapacity) {
            System.out.printf("Все сидячие места уже заняты, так как людей уже %d, но есть %d стоячих мест.%n", people, freeStandingRoom);
        } else {
            System.out.printf("Нет мест, так как людей уже %d.%n", people);
        }
        //Задание 7.
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.printf("%d is bigger then %d and %d.%n", one, two, three);
        } else if (two > one && two > three) {
            System.out.printf("%d is bigger then %d and %d.%n", two, one, three);
        } else if(three > two && three > one){
        System.out.printf("%d is bigger then %d and %d. %n", three, two, one);
        }
    }
}