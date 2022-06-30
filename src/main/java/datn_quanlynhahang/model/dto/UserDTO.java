package datn_quanlynhahang.model.dto;

import javax.persistence.Column;
import java.time.Instant;

public class UserDTO {

    private String userName;

    private String passWord;

    private String fullName;

    private String phone;

    private String email;

    private String addrress;

    private Instant createAt;

    private int creatBy;

    public UserDTO(String userName, String passWord, String fullName, String phone, String email, String addrress, Instant createAt, int creatBy) {
        this.userName = userName;
        this.passWord = passWord;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.addrress = addrress;
        this.createAt = createAt;
        this.creatBy = creatBy;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddrress() {
        return addrress;
    }

    public void setAddrress(String addrress) {
        this.addrress = addrress;
    }

    public Instant getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Instant createAt) {
        this.createAt = createAt;
    }

    public Integer getCreatBy() {
        return creatBy;
    }

    public void setCreatBy(Integer creatBy) {
        this.creatBy = creatBy;
    }
}
