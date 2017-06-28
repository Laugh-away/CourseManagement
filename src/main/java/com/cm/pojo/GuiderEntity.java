package com.cm.pojo;

import javax.persistence.*;

/**
 * Created by YL on 2017/6/28.
 */
@Entity
@Table(name = "guider", schema = "electivecoursedb", catalog = "")
public class GuiderEntity {
    private int gid;
    private String guidename;
    private String guidepassword;

    @Id
    @Column(name = "gid")
    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    @Basic
    @Column(name = "guidename")
    public String getGuidename() {
        return guidename;
    }

    public void setGuidename(String guidename) {
        this.guidename = guidename;
    }

    @Basic
    @Column(name = "guidepassword")
    public String getGuidepassword() {
        return guidepassword;
    }

    public void setGuidepassword(String guidepassword) {
        this.guidepassword = guidepassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GuiderEntity that = (GuiderEntity) o;

        if (gid != that.gid) return false;
        if (guidename != null ? !guidename.equals(that.guidename) : that.guidename != null) return false;
        if (guidepassword != null ? !guidepassword.equals(that.guidepassword) : that.guidepassword != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gid;
        result = 31 * result + (guidename != null ? guidename.hashCode() : 0);
        result = 31 * result + (guidepassword != null ? guidepassword.hashCode() : 0);
        return result;
    }
}
