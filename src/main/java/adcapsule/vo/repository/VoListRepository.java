package adcapsule.vo.repository;

import adcapsule.vo.domain.VoList;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoListRepository extends JpaRepository<VoList, String> {
    List<VoList> findAllByVoCodeContaining(String voCode, Pageable pageable);
    List<VoList> findAllByVoNameContaining(String voName, Pageable pageable);
    List<VoList> findAllByVoCodeContainingOrVoNameContaining(String voCode, String voName, Pageable pageable);
}
