package ebru.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ebru.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

}
