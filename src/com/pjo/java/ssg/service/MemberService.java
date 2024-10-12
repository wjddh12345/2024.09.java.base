package com.pjo.java.ssg.service;

import com.pjo.java.ssg.dao.MemberDao;
import com.pjo.java.ssg.dto.Member;

public class MemberService {
	public MemberDao memberDao;
	
	public MemberService() {
		memberDao = new MemberDao();
	}

	public Member getMemberByLoginId(String loginId) {
		return memberDao.getMemberByLoginId(loginId);
	}

	public boolean isJoinableLoginId(String loginId) {
		return memberDao.isJoinableLoginId(loginId);
	}

	public int getNewId() {
		return memberDao.getNewId();
	}
	
	public void add(Member member) {
		memberDao.add(member);
	}

}
