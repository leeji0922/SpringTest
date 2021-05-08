package org.soomgo.lji;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soomgo.lji.model.mapper.MemberMapper;
import org.soomgo.lji.model.mapper.ProductMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller //객체를 생성
public class HomeController {
	
	@Resource
	private ProductMapper productMapper;
	
	//요청에 대한 mapping
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Model model) { //home 메소드를 생성
		model.addAttribute("totalProductNum",productMapper.totalProductNum()); //View로 넘기기
		model.addAttribute("showProduct",productMapper.showProduct()); //View로 넘기기
		model.addAttribute("showAllStock",productMapper.showAllStock()); //View로 넘기기
		return "home"; //home 메소드의 값을 리턴
	}
	
}

//객체를 만들때
//@controller
//@service
//@respository
//@component
