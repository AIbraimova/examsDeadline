import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Doctor extends Person {

    private double income;

    public Doctor(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary,double income) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.income=income;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
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

    public void differenceBetweenInsomeAndGovermentWages(){
        System.out.println(getIncome() - getGovernmentsSalary());
    }
    @Override
    public void favoriteSport() {
        System.out.println("Favorite Sport from "+getFullName()+"    is  Football.");
    }

    @Override
    public String favoriteLanguage() {
        return getFullName()+ "  favorite language is Kyrgyz  ";
    }

    @Override
    public Month favoriteMouth(int month) {
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
        return "Phone number:"+getPhoneNumber()+" Email: "+getEmail();
    }



    @Override
    public String toString() {
        return "Doctor{" +
                "income=" + income +
                '}'+super.toString();
    }
}
