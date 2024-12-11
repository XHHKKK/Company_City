class Program {
    public static void main(String[] args) {
        int i, // параметр цикла
                min, // наименьшая сумма страховых взносов
                temp, j; //вспомогательные переменные

        //создание массива ссылок
        //на объекты класса InsCompany
        InsCompany[] CityCompany = new InsCompany[4];

        //создание и инициализация объектов
        CityCompany[0] = new InsCompany("ABC", 100, 100000, 111, 111111, 1111);
        CityCompany[1] = new InsCompany("BCD", 200, 200000, 222, 222222, 2222);
        CityCompany[2] = new InsCompany("CDE", 300, 300000, 333, 333333, 3333);
        CityCompany[3] = new InsCompany("DEF", 400, 400000, 444, 444444, 4444);

        // печать информации о страховых компаниях
        for (i = 0; i < 4; i++)
            CityCompany[i].show();

        //выяснить, какая страховая компания имеет
        //наименьшую сумму страховых взносов
        min = CityCompany[0].getSummaplus();
        j = 0;
        for (i = 1; i < 4; i++) {
            temp = CityCompany[i].getSummaplus();
            if (temp < min) {
                min = temp;
                j = i;
            }
        }

        System.out.println("\n наименьшая сумма взносов в компании " + CityCompany[j].getName());
    }
}