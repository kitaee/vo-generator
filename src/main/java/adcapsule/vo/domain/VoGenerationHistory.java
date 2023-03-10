package adcapsule.vo.domain;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "vo_generation_history")
@NoArgsConstructor
public class VoGenerationHistory {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vo_generation_id")
    private Long voGenerationId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vo_code")
    private VoList voList;

    @Column(name = "vo_generation_date")
    private Date voGenerationDate;

    @Column(name = "vo_generation_user", length = 15)
    private String voGenerationUser;

    @Builder
    public VoGenerationHistory(VoList voList, Date voGenerationDate, String voGenerationUser){
        this.voList = voList;
        this.voGenerationDate = voGenerationDate;
        this.voGenerationUser = voGenerationUser;
    }
}
