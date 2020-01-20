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
@Table(name="Message_qpq")
@ToString(exclude="accountmessage")
public class MessageVO {
	@Id
	private String mess_idx;
//	private String user_idx;
	private String recipient_idx;
	private String product_idx;
	private String post_idx;
	private String content;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable=false)
	private Date regdate=new Date();
	@ManyToOne
	@JoinColumn(name="user_idx",nullable=false,updatable=false)
	private AccountVO accountmessage;
	
	public void setAccountVO(AccountVO account) {
		this.accountmessage=account;
		account.getMessageList().add(this);
	}
}
