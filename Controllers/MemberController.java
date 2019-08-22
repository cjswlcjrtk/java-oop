package com.bitcamp.Controllers;

import javax.swing.JOptionPane;

import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.MemberServcie;
/**
 * 요구사항(기능정의)
 * <사용자기능>
 * 1. 회원가입
 * 2. 마이페이지
 * 3. 비번 수정
 * 4. 회원탈퇴
 * ***************************
 * <관리자기능>
 * 5. 회원목록
 * 6. 아이디검색
 *
 */
public class MemberController {
	
	public static void main(String[] args) {
		MemberServcie service = new MemberServcie();
		MemberBean member = null;
		while(true) {			
			switch(JOptionPane.showInputDialog("0.종료 \n, 1.회원가입 \n, 2.마이페이지 \n, "
					+ "3.비번수정 \n, 4.회원탈퇴\n, 5.회원목록\n, 6.아이디검색")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				String spec = JOptionPane.showInputDialog("[아이디, 비밀번호, 이름,"
						+ " 키, 몸무게]");
				System.out.println("***********" + spec);
				String[] arr =spec.split(",");//,와 같은걸 구분자 라고 한다
				member = new MemberBean();
				member.setId(arr[0]);
				member.setPw(arr[1]);
				member.setName(arr[2]);
				member.setHeight(Double.parseDouble(arr[3]));
				member.setWeight(Double.parseDouble(arr[4]));
				
				JOptionPane.showMessageDialog(null, service.getJoin(member));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, service.getMyPage(member));
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				JOptionPane.showMessageDialog(null, service.list());
				break;
			case "6":
				String searchId = JOptionPane.showInputDialog("검색 ID");
//				member = service.findById(searchId);
				JOptionPane.showMessageDialog(null, service.findById(searchId));
				break;
			default :
				break;
			
			}
		}
	}

}
