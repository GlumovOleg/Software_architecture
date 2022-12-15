package HomeWork.HomeWork2;

import java.util.Random;

public class CreatorWorkers {

    /**
     * Генерирует сотрудников со случайными ФИО, типом (в зависимости от оклада) и
     * з\п
     * 
     * @return
     */

    static Employee generateEmployee() {

        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий",
                "Рубен", "Герман" };
        String[] lastNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов",
                "Горбунов", "Лыткин", "Соколов" };
        Random randmom = new Random();
        int i = randmom.nextInt(0, names.length);
        int l = randmom.nextInt(0, lastNames.length);
        int s = randmom.nextInt(900, 1100);

        if (s < 1000) {
            return new FreeLance(names[i], lastNames[l], s);
        } else {
            return new Worker(names[i], lastNames[l], s);
        }
    }

}
