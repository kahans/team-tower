package com.team4.bigTower.member.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.beans.factory.annotation.Autowired;*/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.team4.bigTower.member.service.Member;
import com.team4.bigTower.member.service.MemberService;

@Controller
@SessionAttributes(value="memberLogin")
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/memberAdd", method=RequestMethod.GET)
	public String memberAdd(){
		logger.debug("debug get : ");
		return "/member/memberAdd";
	}
	@RequestMapping(value="/memberAdd", method=RequestMethod.POST)
	public String memberAdd(Member member){
		logger.debug("debug post : ");
		logger.info(member.toString());
		memberService.memberAdd(member);
		
		return "redirect:/memberLogin";
	}
	@RequestMapping(value="/memberLogin", method=RequestMethod.GET)
	public String memberLogin(){
		logger.debug("debug get : ");
		return "/member/memberLogin";
	}
	//로그인 세션넣기
	@RequestMapping(value="/memberLogin", method=RequestMethod.POST)
	public String memberLogin(HttpSession session, Member member){
		logger.debug("debug get : ");
		logger.info(member.toString());
		
		session.setAttribute("memberLogin", member);
		
		return "redirect:/boardList";
	}
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:/boardList";
	}
}
