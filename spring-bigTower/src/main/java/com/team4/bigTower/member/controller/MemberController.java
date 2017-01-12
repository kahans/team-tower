package com.team4.bigTower.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.beans.factory.annotation.Autowired;*/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.bigTower.member.service.Member;
import com.team4.bigTower.member.service.MemberService;

@Controller
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
	@RequestMapping(value="/memberLogin", method=RequestMethod.POST)
	public String memberLogin(Member member){
		logger.debug("debug get : ");
		logger.info(member.toString());
		
		return "redirect:/boardList";
	}
}
