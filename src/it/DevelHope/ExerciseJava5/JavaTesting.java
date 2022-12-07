package it.DevelHope.ExerciseJava5;

public class JavaTesting {
    public static void main(String[] args) {
        Student student = new Student("Marco", "Lo Bello", 104, 2022);
        Professor professor = new Professor("Giuseppe", "Fiengo", 100, "Java");
        Assistant assistant = new Assistant("Pino", "Pigno", 110, true);

        student.goToCollege();
        professor.goToCollege();
        assistant.goToCollege();

        student.studyAtHome();
        professor.teachToOtherPeople();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();

    }
}
