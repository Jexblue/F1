package f1.com.manage.models;

import javax.persistence.*;

@Entity
@Table(name = "ecurie")
public class EcurieModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idecurie")
    Integer idEcurie;

    @Column(name="budget")
    Float budget;

    @Column(name = "nameecurie")
    String nameEcurie;

    public EcurieModel() {
    }

    public EcurieModel(Integer idEcurie, Float budget, String nameEcurie) {
        this.idEcurie = idEcurie;
        this.budget = budget;
        this.nameEcurie = nameEcurie;
    }

    public Integer getIdEcurie() {
        return idEcurie;
    }

    public void setIdEcurie(Integer idEcurie) {
        this.idEcurie = idEcurie;
    }

    public Float getBudget() {
        return budget;
    }

    public void setBudget(Float budget) {
        this.budget = budget;
    }

    public String getNameEcurie() {
        return nameEcurie;
    }

    public void setNameEcurie(String nameEcurie) {
        this.nameEcurie = nameEcurie;
    }
}
