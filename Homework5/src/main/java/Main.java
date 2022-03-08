public class Main {
    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Ivanov Ivan", "CEO", "ceo@mail.ru",892777777,150000, 56);
        emplArray[1] = new Employee("Petrovkin Petr", "manager", "manager@mail.ru", 891475674, 99000, 37);
        emplArray[2] = new Employee("Lenina Elena", "CEO barman", "ceo.barman@mail.ru", 891395881, 70000, 40);
        emplArray[3] = new Employee("Vasiliev Vasiliy", "barman", "vasilii@mail.ru", 890134320, 50000, 41);
        emplArray[4] = new Employee("Sergeev Sergey", "waiter", "serga@mail.ru", 897756143, 20000,25);

        for (int i = 0; i < emplArray.length; i++) {
            if (emplArray[i].age >= 40){
                emplArray[i].info();
            }
        }
    }
}

