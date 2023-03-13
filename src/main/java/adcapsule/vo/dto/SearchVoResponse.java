package adcapsule.vo.dto;

import adcapsule.vo.domain.VoList;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SearchVoResponse {
    private String voCode;
    private String voName;

    public static SearchVoResponse fromEntity(VoList voList){
        return SearchVoResponse.builder()
                .voCode(voList.getVoCode())
                .voName(voList.getVoName())
                .build();
    }
}