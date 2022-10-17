//    Задача №3
//
//    Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
//    Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).
package month;


public class MonthUtils extends Month {

    public MonthUtils(String nameOfMonth, int amountOfDays, int amountOfWorkDays) {
        super(nameOfMonth, amountOfDays, amountOfWorkDays);
    }


}
