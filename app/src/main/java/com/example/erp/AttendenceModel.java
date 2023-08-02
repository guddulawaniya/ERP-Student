package com.example.erp;

public class AttendenceModel {
    String coursecode,coursename,total,present,facultyname;


    int image;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public AttendenceModel(int image) {
        this.image = image;
    }

    public AttendenceModel(String coursecode, String coursename, String total, String present, String facultyname) {
        this.coursecode = coursecode;
        this.coursename = coursename;
        this.total = total;
        this.present = present;
        this.facultyname = facultyname;
    }

    public String getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }


    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPresent() {
        return present;
    }

    public void setPresent(String present) {
        this.present = present;
    }

    public String getFacultyname() {
        return facultyname;
    }

    public void setFacultyname(String facultyname) {
        this.facultyname = facultyname;
    }
}
