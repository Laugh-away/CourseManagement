package com.cm.pojo;

import javax.persistence.*;

/**
 * Created by YL on 2017/6/28.
 */
@Entity
@Table(name = "teacher", schema = "electivecoursedb", catalog = "")
public class TeacherEntity {
    private int tid;
    private String teachername;
    private String teacherpassword;

    @Id
    @Column(name = "tid")
    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "teachername")
    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    @Basic
    @Column(name = "teacherpassword")
    public String getTeacherpassword() {
        return teacherpassword;
    }

    public void setTeacherpassword(String teacherpassword) {
        this.teacherpassword = teacherpassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeacherEntity that = (TeacherEntity) o;

        if (tid != that.tid) return false;
        if (teachername != null ? !teachername.equals(that.teachername) : that.teachername != null) return false;
        if (teacherpassword != null ? !teacherpassword.equals(that.teacherpassword) : that.teacherpassword != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid;
        result = 31 * result + (teachername != null ? teachername.hashCode() : 0);
        result = 31 * result + (teacherpassword != null ? teacherpassword.hashCode() : 0);
        return result;
    }
}
