package ebru.hrms.business.abstracts;

import java.util.List;

import ebru.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	
	List<JobPosition> getAll();
}
