package org.soomgo.lji;

import javax.annotation.Resource;

import org.soomgo.lji.domain.FindUserVO;
import org.soomgo.lji.model.mapper.MemberMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EditUserController {

	@Resource
	private MemberMapper memberMapper;
	
	@RequestMapping(value="/editmember.do", method = {RequestMethod.POST})
	public String editUser(FindUserVO findVo) {
		if(memberMapper.findUser(findVo.getId()) != null)
			memberMapper.editUser(findVo);
		return "editmember";
	}
}
