package adcapsule.vo.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "vo_list")
public class VoList {

    @Id
    @Column(name = "vo_code", length = 10)
    private String voCode;

    @Column(name = "vo_name", length = 45)
    private String voName;

    @OneToMany(mappedBy = "voList", targetEntity = VoGenerationHistory.class)
    private List<VoGenerationHistory> voGenerationHistories = new ArrayList<>();

    @OneToMany(mappedBy = "voList", targetEntity = VoDetails.class)
    private List<VoDetails> voDetails = new ArrayList<>();
}
