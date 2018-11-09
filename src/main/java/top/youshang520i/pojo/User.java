package top.youshang520i.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service("user")
public class User {
    private Long id;

    private String uId;

    private String uName;

    private String uSex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uId='" + uId + '\'' +
                ", uName='" + uName + '\'' +
                ", uSex='" + uSex + '\'' +
                '}';
    }
}