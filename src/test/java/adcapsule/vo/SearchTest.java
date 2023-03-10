package adcapsule.vo;

import adcapsule.vo.domain.VoList;
import adcapsule.vo.repository.VoListRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SearchTest {

    @Autowired
    VoListRepository voListRepository;

    @Test
    void searchByCode(){
        List<VoList> voList = voListRepository.findAllByVoCodeContaining("q");
        Assertions.assertEquals(1, voList.size());
    }

    @Test
    void searchByName(){
        List<VoList> voList = voListRepository.findAllByVoNameContaining("회원");
        Assertions.assertEquals(2, voList.size());
    }

    @Test
    void searchByCodeAndName(){
        String q = "2";
        List<VoList> voList = voListRepository.findAllByVoCodeContainingOrVoNameContaining(q, q);
        Assertions.assertEquals(2, voList.size());
    }
}
