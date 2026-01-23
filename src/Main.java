import java.text.Format;

public class Main {
    public static void main(String[] args) {
        CompanyManagement companyManagement=new  CompanyManagement();

        PermanentEmployee permanentEmployee1= companyManagement.addPermanentEmployee("Zafarjon","Zufaraliyev","Dev",12500.0,23);
        PermanentEmployee permanentEmployee2=companyManagement.addPermanentEmployee("Azim","Gulomov","Desiner",14000.0,32);
        PermanentEmployee permanentEmployee3=companyManagement.addPermanentEmployee("Sirojiddin","Sayfiyev","Kotib",223456.0,56);

        SeasonalEmployee seasonalEmployee1=companyManagement.addSeasonalEmployee("Ali","Aliyev","Qish",12000.0,"Dev");
        SeasonalEmployee seasonalEmployee2=companyManagement.addSeasonalEmployee("Vali","Tursunob","Yoz",98000.0,"Menager");
        SeasonalEmployee seasonalEmployee3=companyManagement.addSeasonalEmployee("Ismat","Ismatov","Kuz",12700.0,"Drektor");

        TemporaryEmployee temporaryEmployee1=companyManagement.addTemporaryEmployee("Ali","Aliyev","23",12000.0,"Dev");
        TemporaryEmployee temporaryEmployee2=companyManagement.addTemporaryEmployee("Olim","Aliyev","23",12000.0,"Dev");
        TemporaryEmployee temporaryEmployee3=companyManagement.addTemporaryEmployee("Umarbek","Aliyev","23",12000.0,"Dev");


        PartnerEmployee partnerEmployee1=companyManagement.addPartnerEmployee("Qodirali","Yusifov","Raraktorchi",19000.0,"Boston");
        PartnerEmployee partnerEmployee2=companyManagement.addPartnerEmployee("Zohidjon","Zufaraov","Dasturchi",15590.0,"Quldrov");
        PartnerEmployee partnerEmployee3=companyManagement.addPartnerEmployee("Sardor","Dostonov","Makler",4500.0,"Tepa");

//        companyManagement.printAllEmployeeDetail();
//        companyManagement.printEmployeeType();
//        companyManagement.showAllEmployeeBonus();
//        companyManagement.showAllPensionTax();
//        companyManagement.showAllInsuranceTax();
        companyManagement.showAllSalaryAfterAllTaxes();
    }
}