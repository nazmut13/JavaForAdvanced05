package month;
public class Month {
//    Задача №3
//
//    Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
//    Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).
    private String nameOfMonth;
    private int amountOfDays;
    private int amountOfWorkDays;

    public Month(String nameOfMonth, int amountOfDays, int amountOfWorkDays) {
        this.nameOfMonth = nameOfMonth;
        this.amountOfDays = amountOfDays;
        this.amountOfWorkDays = amountOfWorkDays;
    }

    public String getNameOfMonth() {
        return nameOfMonth;
    }

    public void setNameOfMonth(String nameOfMonth) {
        this.nameOfMonth = nameOfMonth;
    }

    public int getAmountOfDays() {
        return amountOfDays;
    }

    public void setAmountOfDays(int amountOfDays) {
        this.amountOfDays = amountOfDays;
    }

    public int getAmountOfWorkDays() {
        return amountOfWorkDays;
    }

    public void setAmountOfWorkDays(int amountOfWorkDays) {
        this.amountOfWorkDays = amountOfWorkDays;
    }
}
