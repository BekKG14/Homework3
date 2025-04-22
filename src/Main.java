//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 18;
        if(age >= 18){
            System.out.println("Человек совершеннолетний");
        } else {
            System.out.println("Нужно подождать");
        }
        // Задача 2
        int temperatureOutside = 3;
        if (temperatureOutside < 5){
            System.out.printf("На улице %d градусов, нужно надеть шапку", temperatureOutside );
        } else {
            System.out.printf("На улице %d, можно ходить без шапки", temperatureOutside);
        }

    }
}