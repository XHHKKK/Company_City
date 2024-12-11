class InsCompany extends Company {
    int counts; // количество застрахованных лиц
    int summaplus; // сумма страховых взносов
    int summaminus; // сумма страховых выплат

    // конструктор
    public InsCompany(String name, int persons, int money, int counts, int summaplus, int summaminus) {
        //изменила : на }
            super(name, persons, money);//закрыла
        this.counts = counts;
        this.summaplus = summaplus;
        this.summaminus = summaminus;
    }

    // свойство
    public int getSummaplus() {
        return summaplus;
    }

    // печать информации о страховой компании
    public void show() {
        super.show();
        System.out.println("застрахованных лиц " + counts +
                " взносы  " + summaplus +
                " выплаты   " + summaminus);
    }

    //средний размер страховых взносов
    public int averageIns() {
        return summaplus / counts;
    }
}

// конец описания класса InsCompany
