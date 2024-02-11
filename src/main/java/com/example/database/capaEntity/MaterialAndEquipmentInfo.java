package com.example.database.capaEntity;

import com.google.gson.Gson;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialAndEquipmentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String details;
    private String capaQaComments;

    @OneToMany(targetEntity = Material.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "materialAndEquipmentInfoId", referencedColumnName = "id")
    private List<Material> capaMaterialInfoList;

    @OneToMany(targetEntity = Equipment.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "materialAndEquipmentInfoId", referencedColumnName = "id")
    private List<Equipment> capaEquipmentInfoList;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
