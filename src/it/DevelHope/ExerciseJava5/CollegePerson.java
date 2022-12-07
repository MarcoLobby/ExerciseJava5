package it.DevelHope.ExerciseJava5;

public abstract class CollegePerson{

    private String name;

    private String surname;

    private int collegeId;

    public void goToCollege(){
        System.out.println(getName() + " " + getSurname() + " " + getCollegeId());

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }
}
