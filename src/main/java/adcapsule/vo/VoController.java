package adcapsule.vo;

import adcapsule.vo.dto.SearchVoPageableResponse;
import adcapsule.vo.service.VoService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vo")
@RequiredArgsConstructor
public class VoController {

    private final VoService voService;

    /**
     * vo 검색 API
     */
    @GetMapping("/search/{search-type}")
    public ResponseEntity<SearchVoPageableResponse> searchVo(@PathVariable("search-type") Integer searchType, @RequestParam String q, @PageableDefault(size = 2) Pageable pageable){
        return new ResponseEntity<>(voService.searchVo(searchType, q, pageable), HttpStatus.OK);
    }

    /**
     * vo 조회 API
     */
    @GetMapping("/{vo-code}")
    public ResponseEntity<?> getDetailVo(@PathVariable("vo-code") String voCode){
        return null;
    }

    /**
     * vo 파일 추출 API
     */
    @GetMapping("/extract/{vo-code}")
    public ResponseEntity<?> getVoFile(@PathVariable("vo-code") String voCode){
        return null;
    }
}
