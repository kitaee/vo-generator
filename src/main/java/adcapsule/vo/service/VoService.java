package adcapsule.vo.service;

import adcapsule.vo.domain.VoList;
import adcapsule.vo.dto.SearchVoPageableResponse;
import adcapsule.vo.dto.SearchVoResponse;
import adcapsule.vo.repository.VoListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class VoService {

    private final VoListRepository voListRepository;

    public SearchVoPageableResponse searchVo(Integer searchType, String q, Pageable pageable){
        Page<VoList> voLists;
        if(searchType == 1){
            voLists = voListRepository.findAllByVoCodeContaining(q, pageable);// searchType 1이면 voCode로 검색
        }
        else if(searchType == 2){
            voLists = voListRepository.findAllByVoNameContaining(q, pageable);     // searchType 2이면 voName으로 검색
        }
        else{
            voLists = voListRepository.findAllByVoCodeContainingOrVoNameContaining(q, q, pageable);     // 나머지는 전체 검색
        }
        return new SearchVoPageableResponse(voLists.getTotalPages(), voEntityToDto(voLists.getContent()));
    }

    private List<SearchVoResponse> voEntityToDto(List<VoList> voLists){
        return voLists
                .stream()
                .map(SearchVoResponse::fromEntity)
                .collect(Collectors.toList());
    }
}
