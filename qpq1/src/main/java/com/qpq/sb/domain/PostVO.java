package com.qpq.sb.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name="Post_qpq")
@ToString(exclude="accountpost")
public class PostVO {
	@Id
	private String post_idx;
//	private String user_idx;
	private String product_idx;
	private String dist_idx;
	private String title;
	private String content;
	private String filename;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable=false)
	private Date regdate=new Date();
	private int likes;
	private int cnt;
	
	@ManyToOne
	@JoinColumn(name="user_idx",nullable=false,updatable=false)
	private AccountVO accountpost;
	
	public void setAccountVO(AccountVO account) {
		this.accountpost=account;
		account.getPostList().add(this);
	}
}
