public class CompanyManagement {

    /*----------------Array va o'zgaruvchilar --------------------*/

    private Employee[] arrayEmployee =new Employee[20];
    private int index=0;


    /*----------------Code--------------------*/

    /* PermanentEmployee */
    public PermanentEmployee addPermanentEmployee(String name, String surname, String work, Double salary, int room){
        PermanentEmployee permanentEmployee=new PermanentEmployee(name,surname,work,salary,room);
        arrayEmployee[index++]=permanentEmployee;
        return permanentEmployee;
    }

    /* SeasonalEmployee */
    public SeasonalEmployee addSeasonalEmployee(String name, String surname, String work, Double salary,String season){
        SeasonalEmployee seasonalEmployee=new SeasonalEmployee(name,surname,work,salary,season);
        arrayEmployee[index++]=seasonalEmployee;
        return seasonalEmployee;
    }

    /* TemporaryEmployee */
    public TemporaryEmployee addTemporaryEmployee(String name, String surname, String work, Double salary,String workingHours){
        TemporaryEmployee temporaryEmployee=new TemporaryEmployee(name,surname,work,salary,workingHours);
        arrayEmployee[index++]=temporaryEmployee;
        return temporaryEmployee;
    }

    /* PartnerEmployee */
    public PartnerEmployee addPartnerEmployee(String name, String surname, String work, Double salary,String companyName){
        PartnerEmployee partnerEmployee=new PartnerEmployee(name, surname, work, salary, companyName);
        arrayEmployee[index++]=partnerEmployee;
        return partnerEmployee;
    }

    /* Hmma ishchilarni chiqarish */

    public void printAllEmployeeDetail(){
        for (Employee employee:arrayEmployee){
            if (employee!=null){
                System.out.println(employee);
            }
        }
    }

    /* Ishchlarni ism familyasi va qachon ishlashini chiqarish */

//    public void printEmployeeType(){
//        for (Employee employee:arrayEmployee){
//            if (employee!=null){
//                System.out.println(employee.getName()+" "+employee.getSurname()+" "+employee.getEmployeeType());
//            }
//        }
//    }

    /* Ishchilarni bonusni hisoblash */
//    public void showAllEmployeeBonus(){
//        for (Employee employee:arrayEmployee){
//            if (employee!=null){
//                System.out.println(employee.getName()+" "+employee.getSurname()+" "+employee.getOneTimeBonus());
//            }
//        }
//    }

    /* Barcha ishchilardan olib qolinadigan pensiya moqdori */
//    public void showAllPensionTax(){
//        for (Employee employee:arrayEmployee){
//            if (employee!=null){
//                System.out.println(employee.getName()+" "+employee.getSurname()+" "+employee.getPensiya());
//            }
//        }
//    }

//    /* Barcha ishchilar uchun sug'irta miqdori */
//    public void showAllInsuranceTax(){
//        for (Employee employee:arrayEmployee){
//            if (employee!=null){
//                System.out.println(employee.getName()+" "+employee.getSurname()+" "+employee.getInsurance());
//            }
//        }
//    }
//
    /* Soliqlardan keyin ishchilarni qoliga tegadigan summa */
    public void showAllSalaryAfterAllTaxes(){
        for (Employee employee:arrayEmployee){
            if (employee!=null){
                System.out.println(employee.getName()+" "+employee.getSurname()+" "+employee.getLastSalary());
            }
        }
    }
}
