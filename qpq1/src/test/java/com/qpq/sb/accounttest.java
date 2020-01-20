package com.qpq.sb;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qpq.sb.domain.AccountVO;
import com.qpq.sb.persistence.AccountRepositoryI;

@RunWith(SpringRunner.class)
@SpringBootTest
public class accounttest {

		@Autowired
		private AccountRepositoryI accountRepo;
		
		@org.junit.Test
		public void testInsert() {
			AccountVO a1=new AccountVO();
			a1.setUser_idx("123");
			a1.setUsername("dd");
			a1.setPassword("dfs");
			a1.setRegdate(null);
			accountRepo.save(a1);
		}
}
