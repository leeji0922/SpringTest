package org.soomgo.lji;

import javax.annotation.Resource;

import org.soomgo.lji.model.mapper.MemberMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	@Resource
	private MemberMapper memberMapper;
	
	@RequestMapping(value = "/member.do", method = RequestMethod.GET)
	public String member(Model model) {
		model.addAttribute("addUser",memberMapper.addUser());
		return "member";
	}
}
