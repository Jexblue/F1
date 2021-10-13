package f1.com.manage.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pilote")
public class PiloteModel {

    @Id
    @Column(name = "numero")
    Integer numero;

    @Column(name = "name")
    String name;

    @Column(name = "firstname")
    String firstName;

    @Column(name = "abrv")
    String abrv;

    @Column(name = "idManager")
    Integer idManager;

    @Column(name = "idecurie")
    Integer idEcurie;

    @Column(name = "skills")
    String skills;

    @Column(name = "salary")
    Float salary;

    @Column(name = "istitular")
    Boolean isTitular;

    public PiloteModel() {

    }

    public PiloteModel(Integer numero, String name, String firstName, String abrv, Integer idManager, Integer idEcurie, String skills, Float salary, Boolean isTitular) {
        this.numero = numero;
        this.name = name;
        this.firstName = firstName;
        this.abrv = abrv;
        this.idManager = idManager;
        this.idEcurie = idEcurie;
        this.skills = skills;
        this.salary = salary;
        this.isTitular = isTitular;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAbrv() {
        return abrv;
    }

    public Integer getIdManager() {
        return idManager;
    }

    public Integer getIdEcurie() {
        return idEcurie;
    }

    public String getSkills() {
        return skills;
    }

    public Float getSalary() {
        return salary;
    }

    public Boolean getTitular() {
        return isTitular;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAbrv(String abrv) {
        this.abrv = abrv;
    }

    public void setIdManager(Integer idManager) {
        this.idManager = idManager;
    }

    public void setIdEcurie(Integer idEcurie) {
        this.idEcurie = idEcurie;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public void setTitular(Boolean titular) {
        isTitular = titular;
    }

    @Override
    public String toString() {
        return "PiloteModel{" +
                "numero=" + numero +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", abrv='" + abrv + '\'' +
                ", idManager=" + idManager +
                ", idEcurie=" + idEcurie +
                ", skills='" + skills + '\'' +
                ", salary=" + salary +
                ", isTitular=" + isTitular +
                '}';
    }
}
