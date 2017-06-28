package com.cm.pojo;

import javax.persistence.*;

/**
 * Created by YL on 2017/6/28.
 */
@Entity
@Table(name = "manager", schema = "electivecoursedb", catalog = "")
public class ManagerEntity {
    private int mid;
    private String managername;
    private String managerpassword;

    @Id
    @Column(name = "mid")
    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    @Basic
    @Column(name = "managername")
    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }

    @Basic
    @Column(name = "managerpassword")
    public String getManagerpassword() {
        return managerpassword;
    }

    public void setManagerpassword(String managerpassword) {
        this.managerpassword = managerpassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ManagerEntity that = (ManagerEntity) o;

        if (mid != that.mid) return false;
        if (managername != null ? !managername.equals(that.managername) : that.managername != null) return false;
        if (managerpassword != null ? !managerpassword.equals(that.managerpassword) : that.managerpassword != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mid;
        result = 31 * result + (managername != null ? managername.hashCode() : 0);
        result = 31 * result + (managerpassword != null ? managerpassword.hashCode() : 0);
        return result;
    }
}
