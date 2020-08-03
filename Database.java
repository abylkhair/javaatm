package bitlab.abylkhair.project;

public class Database {
    public static BankAccount allAccounts[] = new BankAccount[10];
    static{
        allAccounts[0] = new CityBankAccount("Ilyas","Zhuanyshev",456122,"KZ010322313", "2152");
        allAccounts[1] = new CityBankAccount("Erbol","Assanbek",12121,"KZ010322313", "1000");
        allAccounts[2] = new NationalBankAccount("Ilyas Zhuanyshev",2000,"KZ054550102", "2000");
        // Таким образом на ваше усмотрение мы должны заполнить список всех счетов
    }
}
