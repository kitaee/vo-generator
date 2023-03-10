package adcapsule.vo;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/vo")
@RequiredArgsConstructor
public class VoController {

    /**
     * vo 검색 API
     */
    @GetMapping("/search/{search-type}")
    public ResponseEntity<?> searchVo(@RequestParam String q, @PathVariable("search-type") String searchType, @PageableDefault(size = 2) Pageable pageable){
        return null;
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
