package org.soomgo.lji;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.soomgo.lji.domain.FindUserVO;
import org.soomgo.lji.domain.UserVO;
import org.soomgo.lji.model.mapper.MemberMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FindUserController {

	@Resource
	private MemberMapper memberMapper;
	
	@RequestMapping(value = "/findmember.do", method = {RequestMethod.GET})
	public String findMember(String id,Model model) {
		FindUserVO vo = memberMapper.findUser(id);
		//해당 회원이 존재하는 경우
		if(vo!=null)
			model.addAttribute("mvo",vo);	//회원이 존재한다면 회원정보를 findmember.jsp로 전달한다.
		return "findmember";
	}
}
