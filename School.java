import java.util.ArrayList;
import java.util.List;

//singleton — there is only one instance of the School class in the entire program
class School {
    private static School instance; // singleton instance
    private final String name;
    private final List<Pupil> pupilsList;

    private School(String name) {
        this.name = name;
        this.pupilsList = new ArrayList<>();
    }

    public static School getInstance(String name) {
        if (instance == null) {
            instance = new School(name);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

// get the list of pupils (read-only copy)
    public List<Pupil> getPupilsList() {
        return new ArrayList<>(pupilsList);
    }

    public void addPupil(Pupil pupil) {
        pupilsList.add(pupil);
    }

    @Override
    public String toString() {
        return "School{name='" + name + "', pupilsList=" + pupilsList + '}';
    }
}

