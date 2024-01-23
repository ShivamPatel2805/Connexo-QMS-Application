package com.example.ChangeControlEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChangeControl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ChangeControlName;
    @OneToMany(targetEntity =GeneralInfo.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<GeneralInfo> generalInfo;
    
    @OneToMany(targetEntity =ChangeDetails.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<ChangeDetails> changedetails;
    
    @OneToMany(targetEntity =ChaConQAReview.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<ChaConQAReview> chaConQAReview;
    
    @OneToMany(targetEntity =Evalution.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<Evalution> evalution;
    
    @OneToMany(targetEntity =AdditionalInformation.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<AdditionalInformation> additionalInformation;
    
    @OneToMany(targetEntity =GroupComments.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<GroupComments> groupComments;
    
    @OneToMany(targetEntity =RiskAssessment.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<RiskAssessment> riskAssessment;
    
    @OneToMany(targetEntity =QaApprovalComments.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<QaApprovalComments> qaApprovalComments;
    
    @OneToMany(targetEntity =ChangeClouser.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<ChangeClouser> changeClouser;
}
