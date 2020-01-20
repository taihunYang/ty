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
@Table(name="Comment_qpq")
@ToString(exclude="accountcomment")
public class CommentVO {
	@Id
	private String comment_idx;
	//private String user_idx;
	private String post_idx;
	private String content;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable=false)
	private Date regdate=new Date();
	
	@ManyToOne
	@JoinColumn(name="user_idx",nullable=false,updatable=false)
	private AccountVO accountcomment;
	
	
	public void setAccountVO(AccountVO account) {
		this.accountcomment=account;
		account.getCommentList().add(this);
	}
}
