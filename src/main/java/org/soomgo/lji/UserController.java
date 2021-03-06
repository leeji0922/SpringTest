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
public class UserController {

	@Resource
	private MemberMapper memberMapper;
	
	@RequestMapping(value = "/member.do", method = {RequestMethod.POST})
	public String member(UserVO vo) {
		System.out.println(vo);
		memberMapper.addUser(vo);
		return "member";
		
	}
	@RequestMapping(value = "/login.do", method = {RequestMethod.POST})
	public String login(FindUserVO vo,HttpSession session) {
		//아이디 패스워드가 일치한 경우
		FindUserVO mvo = memberMapper.login(vo);
		if(mvo != null) {
			//일치해서 해당 유저정보를 session에 저장
			session.setAttribute("mvo",mvo );
			//session.invalidate(); 세션 초기화
		}
		
		return "redirect:home.do";
	}
}
