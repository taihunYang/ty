package com.qpq.sb.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Prod_Dist_qpq")
public class Prod_DistVO {
	@Id
	private String prodis_idx;
	private String product_idx;
	private String dist_idx;
}
