//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = (int) (Math.random() * 100);
        if(age >= 18){
            System.out.println("Человек совершеннолетний");
        } else {
            System.out.println("Нужно подождать");
        }
        // Задача 2
        int temperatureOutside = (int) (Math.random() * 100) - 50;
        if (temperatureOutside < 5){
            System.out.printf("На улице %d градусов, нужно надеть шапку%n", temperatureOutside );
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
        if (studentsAge >= 2 && studentsAge <= 6){
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в детский сад%n", studentsAge);
        } else if (studentsAge >= 7 && studentsAge <= 17){
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу%n", studentsAge);
        }else if (studentsAge >= 18 && studentsAge <= 24){
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в университет%n", studentsAge);
        } else if (studentsAge > 24){
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить на работу%n", studentsAge);
        }

    }
}