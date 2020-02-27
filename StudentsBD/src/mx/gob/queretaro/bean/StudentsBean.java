package mx.gob.queretaro.bean;

import java.io.Serializable;

/**
 *
 * @author ijimeneza
 */
public class StudentsBean implements Serializable{

    private int id;
    private String name;
    private String sex;
    private int Age;
    private String Career;
    private int Semester;
    private float Avarage;
    
    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getCareer() {
        return Career;
    }

    public void setCareer(String Career) {
        this.Career = Career;
    }

    public int getSemester() {
        return Semester;
    }

    public void setSemester(int Semester) {
        this.Semester = Semester;
    }

    public float getAvarage() {
        return Avarage;
    }

    public void setAvarage(float Avarage) {
        this.Avarage = Avarage;
    }
    
    
}
