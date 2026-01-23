import java.text.Format;

public class Main {
    public static void main(String[] args) {
        CompanyManagement companyManagement=new  CompanyManagement();

        PermanentEmployee permanentEmployee1= companyManagement.addPermanentEmployee("Zafarjon","Zufaraliyev",12,230000.0,"Dev");
        PermanentEmployee permanentEmployee2=companyManagement.addPermanentEmployee("Azim","Gulomov",32,14000.0,"Desiner");
        PermanentEmployee permanentEmployee3=companyManagement.addPermanentEmployee("Sirojiddin","Sayfiyev",2,56000.0,"Kotib");

        SeasonalEmployee seasonalEmployee1=companyManagement.addSeasonalEmployee("Ali","Aliyev","Qish",12000.0,"Dev");
        SeasonalEmployee seasonalEmployee2=companyManagement.addSeasonalEmployee("Vali","Tursunob","Yoz",98000.0,"Menager");
        SeasonalEmployee seasonalEmployee3=companyManagement.addSeasonalEmployee("Ismat","Ismatov","Kuz",12700.0,"Drektor");

        TemporaryEmployee temporaryEmployee1=companyManagement.addTemporaryEmployee("Ali","Aliyev","23",12000.0,"Dev");
        TemporaryEmployee temporaryEmployee2=companyManagement.addTemporaryEmployee("Olim","Aliyev","23",12000.0,"Dev");
        TemporaryEmployee temporaryEmployee3=companyManagement.addTemporaryEmployee("Umarbek","Aliyev","23",12000.0,"Dev");

//        companyManagement.printAllEmployeeDetail();
//        companyManagement.printEmployeeType();
//        companyManagement.showAllEmployeeBonus();
          companyManagement.showAllPensionTax();
    }
}