package datn_quanlynhahang.model.base;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "UserAccount")
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "UserName", nullable = false, length = 100)
    private String userName;

    @Column(name = "PassWord", nullable = false, length = 100)
    private String passWord;

    @Column(name = "FullName", nullable = false, length = 500)
    private String fullName;

    @Column(name = "Phone", nullable = false, length = 11)
    private String phone;

    @Column(name = "Email", nullable = false, length = 100)
    private String email;

    @Column(name = "Addrress", nullable = false, length = 500)
    private String addrress;

    @Column(name = "CreateAt", nullable = false)
    private Instant createAt;

    @Column(name = "CreatBy", nullable = false)
    private Integer creatBy;

    @Column(name = "UpdateAt")
    private Instant updateAt;

    @Column(name = "UpdateBy")
    private Integer updateBy;

    @Column(name = "IsDelete")
    private byte[] isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Instant getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Instant updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public byte[] getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(byte[] isDelete) {
        this.isDelete = isDelete;
    }

}