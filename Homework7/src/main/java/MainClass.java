public class MainClass {
    public static void main(String[] args) {

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsic", 3, 9);
        cats[1] = new Cat("Vanya", 5, 15);
        cats[2] = new Cat("Tanya", 2, 6);
        cats[3] = new Cat("Vova", 4, 12);
        cats[4] = new Cat("Kot", 7, 21);

        Plate plate = new Plate(100);

        System.out.println("First info");
        plate.info();
        for (Cat cat : cats){
            System.out.println();
            cat.catInfo();
        }
        System.out.println();
        System.out.println("Feed the cats");
        for (int i = 0; i < cats.length ; i++) {
            if ( plate.getFood() != 0 && !cats[i].getFullAppetite(cats[i].getHungry())){
                for (Cat cat : cats) {
                    System.out.println();
                    cat.eat(plate);
                    cat.catInfo();
                    plate.info();
                }
            System.out.println("feed: " + (i+1));
            }
        }
        System.out.println();

        // добавляем еды
        plate.increaseFood(100);
        plate.info();

        // вывод на экран:
                            // изначально голодные котики и полная тарелка еды
//        First info
//        Food in plate: 100
//
//        Cat Barsic hungry 0
//        Cat Barsic is full? false
//
//        Cat Vanya hungry 0
//        Cat Vanya is full? false
//
//        Cat Tanya hungry 0
//        Cat Tanya is full? false
//
//        Cat Vova hungry 0
//        Cat Vova is full? false
//
//        Cat Kot hungry 0
//        Cat Kot is full? false
//
//        Feed the cats
                                        // первый этап кормежки
//        Cat Barsic hungry 3           Барсик поел 3 единицы из 9(полный желудок)
//        Cat Barsic is full? false     Барсик сыт? (true- да, false - нет) (3 из 9)
//        Food in plate: 97             Остаток еды в тарелки после первого кота.
//
//        Cat Vanya hungry 5
//        Cat Vanya is full? false
//        Food in plate: 92
//
//        Cat Tanya hungry 2
//        Cat Tanya is full? false
//        Food in plate: 90
//
//        Cat Vova hungry 4
//        Cat Vova is full? false
//        Food in plate: 86
//
//        Cat Kot hungry 7
//        Cat Kot is full? false
//        Food in plate: 79
//        feed: 1                         конец первой кормежки и начало второго этапа
//
//        Cat Barsic hungry 6           6 из 9 (аппетит 3)
//        Cat Barsic is full? false     сыт? - нет
//        Food in plate: 76             в тарелке после всех котов после первого этапа кормления
//
//        Cat Vanya hungry 10
//        Cat Vanya is full? false
//        Food in plate: 71
//
//        Cat Tanya hungry 4
//        Cat Tanya is full? false
//        Food in plate: 69
//
//        Cat Vova hungry 8
//        Cat Vova is full? false
//        Food in plate: 65
//
//        Cat Kot hungry 14
//        Cat Kot is full? false
//        Food in plate: 58
//        feed: 2                           конец второго этапа кормления и начало третьего
//
//        Cat Barsic hungry 9               сытость (9 из 9)
//        Cat Barsic is full? true          сыт? да (9 из 9)
//        Food in plate: 55                 остаток после всех котов после первого и второго этапа
//
//        Cat Vanya hungry 15
//        Cat Vanya is full? true
//        Food in plate: 50
//
//        Cat Tanya hungry 6
//        Cat Tanya is full? true
//        Food in plate: 48
//
//        Cat Vova hungry 12
//        Cat Vova is full? true
//        Food in plate: 44
//
//        Cat Kot hungry 21
//        Cat Kot is full? true
//        Food in plate: 37                остаток еды после полного кормления 37 едениц
//        feed: 3                       номер этапа кормления
//
//        Food in plate: 137            добавили еды в тарелку (100 едениц)


    }
}