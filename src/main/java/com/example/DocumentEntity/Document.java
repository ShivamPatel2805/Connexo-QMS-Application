package com.example.DocumentEntity;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String Name;
	  
	  @OneToMany(targetEntity =DocumentInfo.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
	    private List<DocumentInfo> documentInfo;
	  
	  @OneToMany(targetEntity =ChemestrySop.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="ChemestrySop_fk",referencedColumnName = "id")
	    private List<ChemestrySop> chemestrySop;
	  
	  @OneToMany(targetEntity =InstrumentSop.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="InstrumentSop_fk",referencedColumnName = "id")
	    private List<InstrumentSop> instrumentSop;
	  
	  @OneToMany(targetEntity =InstruChemestrySop.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="InstruChemestrySop_fk",referencedColumnName = "id")
	    private List<InstruChemestrySop> instrChemestrySop;
	  
	  @OneToMany(targetEntity =MicrobiologySop.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="MicrobiologySop_fk",referencedColumnName = "id")
	    private List<MicrobiologySop> microbiologySop;
	  
	  @OneToMany(targetEntity =LaboratoryPractices.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
	    private List<LaboratoryPractices> laboratoryPractices;
	  
	  @OneToMany(targetEntity =EnviromentalLaboratory.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
	    private List<EnviromentalLaboratory> enviromentalLaboratory;

}
