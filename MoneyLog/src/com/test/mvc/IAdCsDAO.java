package com.test.mvc;

import java.util.ArrayList;

public interface IAdCsDAO
{
	// ▼ 관리자 공지사항 ▼
	
	// 공지사항 총 게시물 수
	//public int adNotiCount();
	
	// 공지사항 리스트 확인
 	public ArrayList<AdCsDTO> adNotiList();
 	
 	// 공지사항 글 보기
 	public AdCsDTO adNotiView(String noti_cd); 
 	
 	// 공지사항 수정하기
 	public int adNotiModify(AdCsDTO dto);
 	
 	// 공지사항 삭제하기
 	public int adNotiDelete(String noti_cd);
 	
 	// 공지사항 등록하기
 	public int adNotiInsert(AdCsDTO dto);
 	
 	// ▼ 관리자 문의글 ▼
 	
 	// 문의하기 리스트 확인
 	public ArrayList<AdCsDTO> adQnaList();
}
