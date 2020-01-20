package com.qpq.sb.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name="Account_qpq")
@ToString(exclude={"postList","commentList","followerList","messageList"})


public class AccountVO {
	@Id
	private String user_idx;
	private String username;
	private String password;
	private String nickname;
	private String gender;
	private int age;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable=false)
	private Date regdate=new Date();
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@OneToMany(mappedBy="accountpost", fetch=FetchType.LAZY)
	private List<PostVO> postList = new ArrayList<PostVO>();
	@OneToMany(mappedBy="accountcomment", fetch=FetchType.LAZY)
	private List<CommentVO> commentList = new ArrayList<CommentVO>();
	@OneToMany(mappedBy="accountfollower", fetch=FetchType.LAZY)
	private List<FollowerVO> followerList = new ArrayList<FollowerVO>();
	@OneToMany(mappedBy="accountmessage", fetch=FetchType.LAZY)
	private List<MessageVO> messageList = new ArrayList<MessageVO>();
	
}
