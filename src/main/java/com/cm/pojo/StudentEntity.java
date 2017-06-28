package com.cm.pojo;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by YL on 2017/6/28.
 */
@Entity
@Table(name = "student", schema = "electivecoursedb", catalog = "")
public class StudentEntity {
    private int sid;
    private String studentname;
    private String studentpassword;
    private String studentnumber;
    private String studentsex;
    private String studentclass;
    private Collection<StudentcourseEntity> studentcoursesBySid;

    @Id
    @Column(name = "sid")
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "studentname")
    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    @Basic
    @Column(name = "studentpassword")
    public String getStudentpassword() {
        return studentpassword;
    }

    public void setStudentpassword(String studentpassword) {
        this.studentpassword = studentpassword;
    }

    @Basic
    @Column(name = "studentnumber")
    public String getStudentnumber() {
        return studentnumber;
    }

    public void setStudentnumber(String studentnumber) {
        this.studentnumber = studentnumber;
    }

    @Basic
    @Column(name = "studentsex")
    public String getStudentsex() {
        return studentsex;
    }

    public void setStudentsex(String studentsex) {
        this.studentsex = studentsex;
    }

    @Basic
    @Column(name = "studentclass")
    public String getStudentclass() {
        return studentclass;
    }

    public void setStudentclass(String studentclass) {
        this.studentclass = studentclass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (sid != that.sid) return false;
        if (studentname != null ? !studentname.equals(that.studentname) : that.studentname != null) return false;
        if (studentpassword != null ? !studentpassword.equals(that.studentpassword) : that.studentpassword != null)
            return false;
        if (studentnumber != null ? !studentnumber.equals(that.studentnumber) : that.studentnumber != null)
            return false;
        if (studentsex != null ? !studentsex.equals(that.studentsex) : that.studentsex != null) return false;
        if (studentclass != null ? !studentclass.equals(that.studentclass) : that.studentclass != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + (studentname != null ? studentname.hashCode() : 0);
        result = 31 * result + (studentpassword != null ? studentpassword.hashCode() : 0);
        result = 31 * result + (studentnumber != null ? studentnumber.hashCode() : 0);
        result = 31 * result + (studentsex != null ? studentsex.hashCode() : 0);
        result = 31 * result + (studentclass != null ? studentclass.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "studentBySid")
    public Collection<StudentcourseEntity> getStudentcoursesBySid() {
        return studentcoursesBySid;
    }

    public void setStudentcoursesBySid(Collection<StudentcourseEntity> studentcoursesBySid) {
        this.studentcoursesBySid = studentcoursesBySid;
    }
}
