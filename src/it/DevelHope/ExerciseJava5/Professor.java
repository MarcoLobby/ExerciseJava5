package it.DevelHope.ExerciseJava5;

public class Professor extends CollegePerson implements ITeachingPerson{

    private String teachingSubject;

    public Professor(String name, String surname, int collegeId, String teachingSubject){
        this.setName(name);
        this.setSurname(surname);
        this.setCollegeId(collegeId);
        this.teachingSubject=teachingSubject;
    }


    @Override
    public void teachToOtherPeople(){
        System.out.println("The Professor is teaching ");

    }
}
