package com.qpq.sb.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Distributer_qpq")

public class DistributerVO {
	@Id
	private String dist_idx;
	private String dist_name;
	private String type;
}
