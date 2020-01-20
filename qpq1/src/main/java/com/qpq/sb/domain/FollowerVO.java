package com.qpq.sb.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;
@Data
@Entity
@Table(name="Follower_qpq")
@ToString(exclude="accountfollower")
public class FollowerVO {
	@Id
	private String fol_idx;
	//private String user_idx;
	private String recipient_idx;
	
	@ManyToOne
	@JoinColumn(name="user_idx",nullable=false,updatable=false)
	private AccountVO accountfollower;
	
	public void setAccountVO(AccountVO account) {
		this.accountfollower=account;
		account.getFollowerList().add(this);
	}
}
