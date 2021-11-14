package f1.com.manage.models;

import javax.persistence.*;

@Entity
@Table(name = "fan")
public class FanModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfan")
    Integer idFan;

    @Column(name = "namefan")
    String nameFan;

    @Column(name = "firstnamefan")
    String firstNameFan;

    @Column(name = "password")
    String password;

    public FanModel(){}

    public FanModel(Integer idFan, String nameFan, String firstNameFan, String password) {
        this.idFan = idFan;
        this.nameFan = nameFan;
        this.firstNameFan = firstNameFan;
        this.password = password;
    }

    public Integer getIdFan() {
        return idFan;
    }

    public void setIdFan(Integer idFan) {
        this.idFan = idFan;
    }

    public String getNameFan() {
        return nameFan;
    }

    public void setNameFan(String nameFan) {
        this.nameFan = nameFan;
    }

    public String getFirstNameFan() {
        return firstNameFan;
    }

    public void setFirstNameFan(String firstNameFan) {
        this.firstNameFan = firstNameFan;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
