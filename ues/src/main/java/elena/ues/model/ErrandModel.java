package elena.ues.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="errand")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ErrandModel {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
	
	@Column(name="orderedAtDate", nullable=true)
	private Date orderedAtDate; 
	
	@Column(name="isDelivered", nullable=true)
	private boolean isDelivered; 
	
	@Column(name="grade", nullable=true)
	private int grade; 
	
	@Column(name="comment", nullable=true)
	private String comment; 
	
	@Column(name="anonymousComment", nullable=true)
	private boolean anonymousComment;
	
	@Column(name="archivedComment", nullable=true)
	private boolean archivedComment; 
	
	@ManyToOne
	private Buyer buyer;
}