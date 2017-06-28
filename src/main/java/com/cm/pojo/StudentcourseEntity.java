package com.cm.pojo;

import javax.persistence.*;

/**
 * Created by YL on 2017/6/28.
 */
@Entity
@Table(name = "studentcourse", schema = "electivecoursedb", catalog = "")
public class StudentcourseEntity {
    private int scid;
    private CourseEntity courseByCid;
    private StudentEntity studentBySid;

    @Id
    @Column(name = "scid")
    public int getScid() {
        return scid;
    }

    public void setScid(int scid) {
        this.scid = scid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentcourseEntity that = (StudentcourseEntity) o;

        if (scid != that.scid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return scid;
    }

    @ManyToOne
    @JoinColumn(name = "cid", referencedColumnName = "cid", nullable = false)
    public CourseEntity getCourseByCid() {
        return courseByCid;
    }

    public void setCourseByCid(CourseEntity courseByCid) {
        this.courseByCid = courseByCid;
    }

    @ManyToOne
    @JoinColumn(name = "sid", referencedColumnName = "sid", nullable = false)
    public StudentEntity getStudentBySid() {
        return studentBySid;
    }

    public void setStudentBySid(StudentEntity studentBySid) {
        this.studentBySid = studentBySid;
    }
}
