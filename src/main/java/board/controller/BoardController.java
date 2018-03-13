package board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import board.command.BoardCommand;
import board.command.ContentCommand;
import board.command.DeleteCommand;
import board.command.WriteCommand;

@Controller
public class BoardController {
	
	BoardCommand command=null;
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list");
		command = new ContentCommand();
		command.execute(model);
		
		return "list";
	}
	
	@RequestMapping("/writeForm")
	public String write_view(Model model) {
		System.out.println("writeForm");
		return "writeForm";		
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request,Model model) {
		System.out.println("write");
		model.addAttribute("request",request);
		command = new WriteCommand();
		command.execute(model);
		return "redirect:list";
	}
	
	@RequestMapping("/content")
	public String Content(HttpServletRequest request, Model model) {
		System.out.println("content");
		model.addAttribute("request",request);
		command = new ContentCommand();
		command.execute(model);
		return "content";
	}
	
	@RequestMapping("/modifyForm")
	public String modifyForm(Model model) {
		System.out.println("modifyForm");
		return "modifyForm";
	}
	
	@RequestMapping(method=RequestMethod.POST,value = "/modify")
	public String modify(HttpServletRequest request,Model model) {
		System.out.println("modify");
		model.addAttribute("request",request);
		command = new WriteCommand();
		command.execute(model);
		return "redirect:list";
	}
	
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("delete");
		model.addAttribute("request", request);
		command = new DeleteCommand();
		command.execute(model);
		return "redirect:list";
	}

}
