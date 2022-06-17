package com.example.firebasedemo;

public class StudentModel {
    private String course;
    private String imageURL;
    private String email;
    private String studentName;


    public StudentModel(String course, String imageURL, String email, String studentName) {
        this.course = course;
        this.imageURL = imageURL;
        this.email = email;
        this.studentName = studentName;
    }

    public StudentModel() {
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "course='" + course + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", email='" + email + '\'' +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
