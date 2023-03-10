package adcapsule.vo.domain;

import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "vo_details")
@Setter
public class VoDetails {

    @Id
    @Column(name = "vo_column_id")
    private Long voColumnId;

    @Column(name = "vo_column_length")
    private Integer voColumnLength;

    @Column(name = "vo_column_data_type", length = 15)
    private String voColumnDataType;

    @Column(name = "vo_column_comment", length = 45)
    private String voColumnComment;

    @Column(name = "vo_column_name", length = 45)
    private String voColumnName;

    @Column(name = "is_essential")
    private Boolean isEssential;

    @Column(name = "is_encrypted")
    private Boolean isEncrypted;

    @Column(name = "vo_column_creation_date")
    private Date voColumnCreationDate;

    @Column(name = "vo_column_modification_date")
    private Date voColumnModificationDate;

    @Column(name = "vo_column_remark")
    private String voColumnRemark;

    @Column(name = "vo_column_is_input")
    private Boolean voColumnIsInput;

    @Column(name = "vo_column_order")
    private Integer voColumnOrder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vo_code")
    private VoList voList;
}
