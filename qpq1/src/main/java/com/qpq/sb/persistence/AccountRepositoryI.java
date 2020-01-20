package com.qpq.sb.persistence;

import org.springframework.data.repository.CrudRepository;

import com.qpq.sb.domain.AccountVO;

public interface AccountRepositoryI extends CrudRepository<AccountVO, String>{
}
