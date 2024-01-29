package com.example.CapaEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntityMain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;

    @OneToMany(targetEntity = CapaClosure.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<CapaClosure> CapaClosure;

    @OneToMany(targetEntity = CapaDetails.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<CapaDetails> capaCapaDetailsInfo;

    @OneToMany(targetEntity = CapaGenInfo.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<CapaGenInfo> capaGenInfo;


    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<Product> capaProductInfo;

    @OneToMany(targetEntity = Material.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<Material> capaMaterialInfo;

    @OneToMany(targetEntity = Equipment.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<Equipment> capaEquipmentInfo;

    @OneToMany(targetEntity = ExtensionJustification.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<ExtensionJustification> capaExtensionJustificationInfo;

    @OneToMany(targetEntity = EffectivenessCheck.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<EffectivenessCheck> capaEffectivenessCheckInfo;

    @OneToMany(targetEntity = Additional.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<Additional> capaAdditionalInfo;

    @OneToMany(targetEntity = GroupComment.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<GroupComment> capaGroupCommentInfo;


}

