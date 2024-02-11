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
public class GroupComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cftComments;
    private String qaComments;
    private String warehouseComments;
    private String instrumentationComments;
    private String othersComments;
    private String qaHeadDesigneeComments;
    private String engineeringComments;
    private String validationComments;
    private String groupComments;

    @OneToMany(targetEntity = GroupAttach.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "groupCommentId", referencedColumnName = "id")
    private List<GroupAttach> groupAttach;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

