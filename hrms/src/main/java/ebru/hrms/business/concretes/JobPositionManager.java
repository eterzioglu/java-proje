package ebru.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ebru.hrms.business.abstracts.JobPositionService;
import ebru.hrms.dataAccess.abstracts.JobPositionDao;
import ebru.hrms.entities.concretes.JobPosition;


@Service
public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}


	@Override
	public List<JobPosition> getAll() {
		return jobPositionDao.findAll();
	}

}
