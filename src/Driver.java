import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Driver extends Person {
    private int experience;

    public Driver(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary, int experience) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.experience=experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public void setFullName(String fullName) {
        super.setFullName(fullName);
    }

    @Override
    public byte getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(byte age) {
        super.setAge(age);
    }

    @Override
    public char getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(char gender) {
        super.setGender(gender);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public double getGovernmentsSalary() {
        return super.getGovernmentsSalary();
    }

    @Override
    public void setGovernmentsSalary(double governmentsSalary) {
        super.setGovernmentsSalary(governmentsSalary);
    }

    public void getExperinceOfYear(){
        LocalDate.now().minusYears(getExperience());

    }
    @Override
    public void favoriteSport() {

        System.out.println("Favorite Sport from "+getFullName()+"    is  Basketball.");

    }

    @Override
    public String favoriteLanguage() {
        return getFullName()+ "  favorite language is German  ";
    }

    @Override
    public Month favoriteMouth( int month ) {
        return Month.of(month);
    }

    @Override
    public String getLastName() {
        String [] name = getFullName().split(" ");
        for (String n: name) {
            return n;

        }
        return null;
    }

    @Override
    public LocalDate getDateOfBrith() {
        return LocalDate.now().minusYears(getAge());
    }

    @Override
    public String getPhoneNumberAndEmail() {
        return "Phone number:  "+getPhoneNumber()+"  Email:"+getEmail();
    }



    @Override
    public String toString() {
        return "Driver{" +
                "experience='" + experience + '\'' +
                '}'+super.toString();
    }
}
