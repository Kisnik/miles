public class Main {
    public static void main(String[] args) {
         //стоимость билета в копейках
        int amount = 130059;
        //расчет бонусных миль считается как частное двух числовых значений в копейках
        int miles = amount/2000;
        System.out.println("Количество бонусных миль: " + miles + " миль");
    }
}
