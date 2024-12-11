class Company {
    protected String name; // название //Здесь показывает ошибки, но всё работает. Не понимаю почему выдает ошибку
    protected int persons; // количество сотрудников //Здесь показывает ошибки, но всё работает. Не понимаю почему выдает ошибку
    protected int money; // месячный фонд зарплаты //Здесь показывает ошибки, но всё работает. Не понимаю почему выдает ошибку

    // конструктор
    public Company(String name, int persons, int money) {
        this.name = name;
        this.persons = persons;
        this.money = money;
    }

    // свойство
    public String getName() {
        return name;
    }

    public void show() {
        System.out.println("В компании " + name + " трудятся " + persons + " сотрудников " + " фонд зарплаты " + money);
    }

    public int averageSalary() {
        return money / persons;
    }

    public int maxPersons(int salary /* средняя зарплата */) {
        return money / persons;
    }

    public int minus(int minus1 /* налог в % */, int minus2 /* отчисление в ПФ в % */) {
        return money * (minus1 + minus2) / 100;
    }
}

// конец описания класса Company


