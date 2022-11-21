import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

/**Person деген абстрактный класс тузунуз.
Анын полялары :
   private int id;
   private String fullName;
   private byte age;
   private char gender;
   private String email;
   private String phoneNumber;
   private double governmentsSalary;
2.Person классын мурастаган 3 класс тузунуз.
Алар:
"Programmer Driver жана Doctor"
ар бирине озунчо уникальный поле кошунуздар.
3.PersonAble деген интерфейс ачып анын ичине
    void favoriteSport();

    String favoriteLanguage();

    Month favoriteMouth();

    String getLastName();

    LocalDate getDateOfBrith();

    String getPhoneNumberAndEmail();

    long[] getPeopleOfAllAges(Person[] people);
деген методдорду тузунуз.Жана алардын реализацияларын кылуу учун
"Programmer Driver жана Doctor" класстары impiliment кылсын.
4.Main класста алардын ар бирине 3 тон обеъкт тузуп жазган логиканыз
туура иштедиби текшериниз.**/

      Person doctor1 = new Doctor(10,"Aiperi Ibraimova", (byte) 20,'F',"dftgzh@tfg","3456767",20000,10000);
      Doctor doctor2 = new Doctor(11,"Aizada Korchubekova", (byte) 35,'F',"dftgzh@tfg","3456767",15000,20000);
      Doctor doctor3 = new Doctor(12,"Asylbek Orozov", (byte) 40,'M',"dftgzh@tfg","3456767",30000,25000);

      Person programmer1 = new Programmer(13,"Adilet Akbarsov", (byte) 24,'M',"dftgzh@tfg","3456767",22000,20);
      Programmer programmer2 = new Programmer(14,"Aigerim Sulaimanova", (byte) 26,'F',"dftgzh@tfg","3456767",18000,36);
      Programmer programmer3 = new Programmer(15,"Ilim Shabdanov", (byte) 29,'M',"dftgzh@tfg","3456767",33000,40);

      Person driver1 = new Driver(16,"Alibek Altynbekov", (byte) 32,'M',"dftgzh@tfg","3456767",28000,4);
      Driver driver2 = new Driver(17,"Jumaida Mukasheva", (byte) 40,'F',"dftgzh@tfg","3456767",19000,6);
      Driver driver3 = new Driver(18,"Ainazik Askarova", (byte) 27,'F',"dftgzh@tfg","3456767",42000,15);

      Person [] people= {doctor1,doctor2,doctor3,driver1,driver2,driver3,programmer1,programmer2,programmer3};

        for (Person person : people) {
          System.out.println("________________________________________________");
          System.out.println(person);
          if (person instanceof Doctor){
            ((Doctor) person).favoriteSport();
            System.out.println(((Doctor) person).favoriteLanguage());
            System.out.println(((Doctor) person).favoriteMouth(5));
            System.out.println(((Doctor) person).getDateOfBrith());
            System.out.println(((Doctor) person).getPhoneNumberAndEmail());
            ((Doctor) person).differenceBetweenInsomeAndGovermentWages();

          }
          if (person instanceof Driver){
            ((Driver) person).favoriteSport();
            System.out.println(((Driver) person).favoriteLanguage());
            System.out.println(((Driver) person).favoriteMouth(8));
            System.out.println(((Driver) person).getDateOfBrith());
            System.out.println(((Driver) person).getPhoneNumberAndEmail());
            ((Driver) person).getExperinceOfYear();
          }
          if (person.getClass().equals(Programmer.class)){
            ((Programmer) person).favoriteSport();
            System.out.println(((Programmer) person).favoriteLanguage());
            System.out.println(((Programmer) person).favoriteMouth(1));
            System.out.println(((Programmer) person).getDateOfBrith());
            System.out.println(((Programmer) person).getPhoneNumberAndEmail());
            ((Programmer) person).getspeedOftyping();
          }
        }
      for (long peopleOfAllAge : Person.getPeopleOfAllAges(people)) {
        System.out.println(people);
      }

    }

}