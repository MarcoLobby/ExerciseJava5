package it.DevelHope.ExerciseJava5;

public class Assistant extends CollegePerson implements ILearningPerson, ITeachingPerson{

    private boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int collegeId, boolean isGoingToBeAPhD){
        this.setName(name);
        this.setSurname(surname);
        this.setCollegeId(collegeId);
        this.isGoingToBeAPhD=isGoingToBeAPhD;
    }


    @Override
    public void studyAtHome() {
        System.out.println(" The Assistant is studying ");

    }

    @Override
    public void teachToOtherPeople() {
        System.out.println(" The Assistant is teaching ");

    }
}
