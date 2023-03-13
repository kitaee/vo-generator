package adcapsule.vo.repository;

import adcapsule.vo.domain.VoList;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoListRepository extends JpaRepository<VoList, String> {
    Page<VoList> findAllByVoCodeContaining(String voCode, Pageable pageable);
    Page<VoList> findAllByVoNameContaining(String voName, Pageable pageable);
    Page<VoList> findAllByVoCodeContainingOrVoNameContaining(String voCode, String voName, Pageable pageable);
}
