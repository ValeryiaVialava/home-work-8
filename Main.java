public class Main {
    public static void main(String[] args) {
        // singleton School
        School school = School.getInstance("School of Java");
        System.out.println("School created: " + school.getName());

        // immutable Pupil
        Pupil pupil1 = new Pupil("Kowalska", "Anna", "2002-05-10");
        Pupil pupil2 = new Pupil("Nowak", "Jan", "2001-12-15");
        school.addPupil(pupil1);
        school.addPupil(pupil2);
        System.out.println("School pupils: " + school.getPupilsList());

        // test class Coder
        String codedName = Coder.code(pupil1.getName());
        String codedSurname = Coder.code(pupil1.getSurname());
        System.out.println("Coded name: " + codedName);
        System.out.println("Coded surname: " + codedSurname);

        // using clone()
        Pupil clonedPupil = pupil1.clonePupil();
        System.out.println("Cloned pupil: " + clonedPupil);

        // using equals()
        System.out.println("Pupil1 equals clonedPupil? " + pupil1.equals(clonedPupil));
    }
}
