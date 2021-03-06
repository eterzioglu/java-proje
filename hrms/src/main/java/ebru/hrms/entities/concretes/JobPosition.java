package ebru.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "job_positions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobPosition {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "title")
	private String title;
}
