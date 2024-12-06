// immutable — its fields (data) cannot be changed after the object is created (final class)
import java.util.Objects;

public final class Pupil {
    private final String name; // final, so can not be changed
    private final String surname;
    private final String birthday;

    public Pupil(String name, String surname, String birthday) {
        this.name = name; // or this.name = Objects.requireNonNull(name, "Name cannot be null");
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    // create a new object with the same data (if you don’t want to modify the original)
    public Pupil clonePupil() {
        return new Pupil(this.name, this.surname, this.birthday);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pupil pupil = (Pupil) obj;
        return Objects.equals(name, pupil.name) &&
                Objects.equals(surname, pupil.surname) &&
                Objects.equals(birthday, pupil.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthday);
    }

    @Override
    public String toString() {
        return "Pupil{name='" + name + "', surname='" + surname + "', birthday='" + birthday + "'}";
    }
}

