package com.example.database.entity;

import com.example.database.capaEntity.*;
import com.google.gson.Gson;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntityMain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long createDate;
    private Long updateDate;
    private String planProposedBy;
    private String planApprovedBy;
    private String qaMoreInfoRequiredBy;
    private String cancelledBy;
    private String completedBy;
    private String approvedBy;
    private String rejectedBy;

    private Date planProposedOn;
    private Date planApprovedOn;
    private Date qaMoreInfoRequiredOn;
    private Date cancelledOn;
    private Date completedOn;
    private Date approvedOn;
    private Date rejectedOn;
    @Column
    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany(targetEntity = CapaClosure.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "entityMainId", referencedColumnName = "id")
    private List<CapaClosure> capaClosureData;
    @OneToMany(targetEntity = CapaDetails.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "entityMainId", referencedColumnName = "id")
    private List<CapaDetails> capaDetails;

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Long updateDate) {
        this.updateDate = updateDate;
    }

    public Long getUserId() {
        return userId;
    }

    @OneToMany(targetEntity = MaterialAndEquipmentInfo.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="entityMainId",referencedColumnName = "id")
    private List<MaterialAndEquipmentInfo> materialAndEquipmentInfo;

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @OneToMany(targetEntity = CapaGenInfo.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="entityMainId",referencedColumnName = "id")
    private List<CapaGenInfo> capaGenInfo;

    @OneToMany(targetEntity = Additional.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="entityMainId",referencedColumnName = "id")
    private List<Additional> capaAdditionalInfo;

    @OneToMany(targetEntity = GroupComment.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="entityMainId",referencedColumnName = "id")
    private List<GroupComment> capaGroupCommentInfo;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
