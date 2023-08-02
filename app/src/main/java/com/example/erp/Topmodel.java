package com.example.erp;

public class Topmodel {
    String studentname,adno,branch,belong,rank;
    int image;
    int su_image;

    public int getSu_image() {
        return su_image;
    }

    public void setSu_image(int su_image) {
        this.su_image = su_image;
    }

    public Topmodel(int su_image) {
        this.su_image = su_image;
    }

    public Topmodel(String studentname, String adno, String branch, String belong, String rank, int image) {
        this.studentname = studentname;
        this.adno = adno;
        this.branch = branch;
        this.belong = belong;
        this.rank = rank;
        this.image = image;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getAdno() {
        return adno;
    }

    public void setAdno(String adno) {
        this.adno = adno;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
