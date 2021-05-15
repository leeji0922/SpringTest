package org.soomgo.lji.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.soomgo.lji.domain.FindUserVO;
import org.soomgo.lji.domain.UserVO;

/***
 * 
 * @author jaeikey
 *	매핑파일에 기재된 SQL을 호출하기 위한 인터페이스
 *	반드시 인터페이스로 선언을 해야함
 *
 */

@Mapper
public interface MemberMapper {
	
	public void addUser(UserVO vo);
	public FindUserVO findUser(String id);
	public FindUserVO login(FindUserVO findvo);
	public void editUser(FindUserVO findvo);
}
