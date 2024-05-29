package com.dev.springbootcurd.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Student {
    @Id
    private String _id;
    private String studentname;
    private String studentadd;
    private String mobile;

    public Student(String _id, String studentname, String studentadd, String mobile) {
        this._id = _id;
        this.studentname = studentname;
        this.studentadd = studentadd;
        this.mobile = mobile;
    }

    public Student() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentadd() {
        return studentadd;
    }

    public void setStudentadd(String studentadd) {
        this.studentadd = studentadd;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "_id='" + _id + '\'' +
                ", studentname='" + studentname + '\'' +
                ", studentadd='" + studentadd + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
