package com.bitcamp.services;

import com.bitcamp.domains.MemberBean;
/**
 * 요구사항(기능정의)
 * 1. 회원가입
 * 2. 마이페이지
 * 3. 비번 수정
 * 4. 회원탈퇴
 *
 */
public class MemberServcie {
	private MemberBean[] members;//객체배열
	private int count;
	
	public MemberServcie() {
		members = new MemberBean[2];//몇명받을건지
		count = 0;
	}
	
	
	/*
	 * 1.회원가입
	 */	
	public String getJoin(MemberBean param) {
		
		String msg = "회원가입 성공";	
		members[count] = param;
		count++;
		return msg;
				
	}
	/**
	 * 2.마이페이지
	 */
	public String getMyPage(MemberBean param) {
//		String msg = "마이페이지";
		
		return param.toString();
		
	}
	/**
	 * 3. 비번수정
	 */
	public String changePassword(MemberBean param) {
		String msg = "비밀번호가 변경되었습니다.";
		
		return msg;
		
	}
	/**
	 * 4. 회원탈퇴
	 */
	public String withdrawal(MemberBean param) {
		String msg = "회원 탈퇴";
		
		return msg;
		
	}
	/**
	 * 5. 회원목록
	 */
	public String list() {
		String msg = "";
		for(int i=0; i<count; i++) {
			msg += members[i].toString()+", \n";
		}
		
		return msg;
		
	}
	/**
	 * 6. 아이디검색
	 */
//	public String findById(String id) {
//		String msg = "";
//		
//		return msg;
//		
//	}
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		for(int i=0; i<count; i++) {
			if(id.equals(members[i].getId())) {
				member = members[i];
			}
		}
		return member;
		
	}
	
	

}
