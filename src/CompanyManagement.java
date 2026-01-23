public class CompanyManagement {

    /*----------------Array va o'zgaruvchilar --------------------*/

    private Employee[] arrayEmployee =new Employee[10];
    private int index=0;


    /*----------------Code--------------------*/

    /* PermanentEmployee */
    public PermanentEmployee addPermanentEmployee(String name,String surname,int room,Double salary,String work){
        PermanentEmployee permanentEmployee=new PermanentEmployee(name,surname,work,salary,room);
        arrayEmployee[index++]=permanentEmployee;
        return permanentEmployee;
    }

    /* SeasonalEmployee */
    public SeasonalEmployee addSeasonalEmployee(String name,String surname,String season,Double salary,String work){
        SeasonalEmployee seasonalEmployee=new SeasonalEmployee(name,surname,work,salary,season);
        arrayEmployee[index++]=seasonalEmployee;
        return seasonalEmployee;
    }

    /* TemporaryEmployee */
    public TemporaryEmployee addTemporaryEmployee(String name,String surname,String workingHours,Double salary,String work){
        TemporaryEmployee temporaryEmployee=new TemporaryEmployee(name,surname,work,salary,workingHours);
        arrayEmployee[index++]=temporaryEmployee;
        return temporaryEmployee;
    }


    /* Hmma ishchilarni chiqarish */

//    public void printAllEmployeeDetail(){
//        for (Employee employee:arrayEmployee){
//            if (employee!=null){
//                System.out.println(employee);
//            }
//        }
//    }

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

    /* Barcha ishchilar uchun sug'irta miqdori */
    public void showAllInsuranceTax(){
        for (Employee employee:arrayEmployee){
            if (employee!=null){
                System.out.println(employee.getName()+" "+employee.getSurname()+" "+employee.getInsurance());
            }
        }
    }
}
