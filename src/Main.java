public class Main {
    public static void main(String[] args) {
        int price = 57860; // стоимость билета
        int bonus = 20; // количество рублей за 1 милю
        int mile = price / bonus; // количество начисленых миль
        System.out.println("Начислено бонусных миль:" + mile);
    }
}
