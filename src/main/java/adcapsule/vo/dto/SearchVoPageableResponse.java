package adcapsule.vo.dto;

import adcapsule.vo.domain.VoList;
import lombok.Getter;

import java.util.List;

@Getter
public class SearchVoPageableResponse {

    private final int totalPageCount;
    private final List<SearchVoResponse> voLists;

    public SearchVoPageableResponse(int totalPageCount, List<SearchVoResponse> voLists) {
        this.totalPageCount = totalPageCount;
        this.voLists = voLists;
    }
}
