package com.qpq.sb.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Product_qpq")
public class ProductVO {
	@Id
	private String product_idx;
	private String product_name;
	private String brand;
	private String dist_idx;
	private String category;
}
