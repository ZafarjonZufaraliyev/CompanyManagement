public class CompanyManagement {

    /*----------------Array and varebls--------------------*/

    //PermanentEmployee
    private PermanentEmployee[] permanentEmployeeArray=new PermanentEmployee[10];
    private int permanentIndex=0;

    //SeasonalEmployee
    private SeasonalEmployee[] seasonalEmployeeArray=new SeasonalEmployee[10];
    private int seasonalIndex=0;

    //TemporaryEmployee
    private TemporaryEmployee[] temporaryEmployeeArray=new TemporaryEmployee[10];
    private int temporaryIndex=0;

    private String[] AllEmployeeDetail =new String[permanentIndex+seasonalIndex+temporaryIndex];

    /*----------------Code--------------------*/

    /* PermanentEmployee */
    public PermanentEmployee addPermanentEmployee(String name,String surname,int room,Double salary,String work){
        PermanentEmployee permanentEmployee=new PermanentEmployee(name,surname,work,salary,room);


        if (permanentEmployeeArray.length==permanentIndex){
            PermanentEmployee[]  newpermanentArray=new PermanentEmployee[permanentEmployeeArray.length*2];
            for (int i=0;i<permanentEmployeeArray.length;i++){
                newpermanentArray[i]=permanentEmployeeArray[i];
            }
            permanentEmployeeArray=newpermanentArray;
        }
        permanentEmployeeArray[permanentIndex++]=permanentEmployee;
        return permanentEmployee;
    }

    /* SeasonalEmployee */
    public SeasonalEmployee addSeasonalEmployee(String name,String surname,String season,Double salary,String work){
        SeasonalEmployee seasonalEmployee=new SeasonalEmployee(name,surname,work,salary,season);


        if (seasonalEmployeeArray.length==permanentIndex){
            SeasonalEmployee[]  newseasonalArray=new SeasonalEmployee[seasonalEmployeeArray.length*2];
            for (int i=0;i<seasonalEmployeeArray.length;i++){
                newseasonalArray[i]=seasonalEmployeeArray[i];
            }
            seasonalEmployeeArray=newseasonalArray;
        }
        seasonalEmployeeArray[permanentIndex++]=seasonalEmployee;
        return seasonalEmployee;
    }

    /* TemporaryEmployee */
    public TemporaryEmployee addTemporaryEmployee(String name,String surname,String workingHours,Double salary,String work){
        TemporaryEmployee temporaryEmployee=new TemporaryEmployee(name,surname,work,salary,workingHours);

        if (temporaryEmployeeArray.length==temporaryIndex){
            TemporaryEmployee[]  newtemporaryArray=new TemporaryEmployee[temporaryEmployeeArray.length*2];
            for (int i=0;i<temporaryEmployeeArray.length;i++){
                newtemporaryArray[i]=temporaryEmployeeArray[i];
            }
            temporaryEmployeeArray=newtemporaryArray;
        }
        temporaryEmployeeArray[temporaryIndex++]=temporaryEmployee;
        return temporaryEmployee;
    }

    public void printAllEmployeeDetail(){

        for (PermanentEmployee permanentEmployee:permanentEmployeeArray){
            if (permanentEmployee!=null){
                System.out.println(permanentEmployee.getDeteil());
            }
        }
        for (SeasonalEmployee seasonalEmployeeArray:seasonalEmployeeArray){
            if (seasonalEmployeeArray!=null){
                System.out.println(seasonalEmployeeArray.getDeteil());
            }
        }
       for (TemporaryEmployee temporaryEmployee:temporaryEmployeeArray){
           if (temporaryEmployee!=null){
               System.out.println(temporaryEmployee.getDeteil());
           }
       }



    }
}
