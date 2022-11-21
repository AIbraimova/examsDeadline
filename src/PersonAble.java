import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public interface PersonAble {
    void favoriteSport();

    String favoriteLanguage();

    Month favoriteMouth( int month );

    String getLastName();

    LocalDate getDateOfBrith();

    String getPhoneNumberAndEmail();

}
