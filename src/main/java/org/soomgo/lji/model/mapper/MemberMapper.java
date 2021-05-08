package org.soomgo.lji.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.soomgo.lji.domain.User;

/***
 * 
 * @author jaeikey
 *	매핑파일에 기재된 SQL을 호출하기 위한 인터페이스
 *	반드시 인터페이스로 선언을 해야함
 *
 */

@Mapper
public interface MemberMapper {
	
	public int getTotalMember();
	User addUser();
}
