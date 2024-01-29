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
public class GroupComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String CftComments;
    private String QaComments;
    private String WarehouseComments;
    private String InstrumentationComments;
    private String OthersComments;
    private String QaHeadDesigneeComments;
    private String EngineeringComments;
    private String ValidationComments;
    private String GroupComments;

    @OneToMany(targetEntity = GroupCommentAttach.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "GroupCommentsAttach_fk", referencedColumnName = "id")
    private List<GroupCommentAttach> groupCommentsAttach;

    @OneToMany(targetEntity = GroupAttach.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "GroupCommentsAttach_fk", referencedColumnName = "id")
    private List<GroupAttach> groupAttach;
}
