package com.cg.trainee.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.trainee.model.Trainee;
import com.cg.trainee.service.ITraineeService;

@Controller
@RequestMapping("/trainee")
public class TraineeController {

	@Autowired
	ITraineeService service;
	
	@RequestMapping("/add")
	public String goToStart(Model model){

		model.addAttribute("trainee", new Trainee());
		return "traineeRegForm";
	}
	
	@RequestMapping("/reg")
	public String registration(@ModelAttribute("trainee") @Valid Trainee trainee,BindingResult result, Model model){
		
		if(result.hasErrors())
		{
			return "traineeRegForm";
		}
		else{
			service.addDetails(trainee);
			model.addAttribute("k", trainee);
			return "traineeSuccess";
		}
	}
	
	@RequestMapping("/goDelete")
	public ModelAndView goToDelete(Model model){
		
		List<Integer> idList= service.retrieveIds();
		return new ModelAndView("traineeIdDelete", "idList", idList);
	}
	
	@RequestMapping("/delete")
	public String deleteById(@RequestParam("traineeId") int traineeId, Model model){
		/*Customer cust = service.retrieveById(custId);
		service.deleteDetails(cust);*/
		
		service.deleteTrainee(traineeId);
		model.addAttribute("custId", traineeId);
		return "deleteTrainee";
	}
	
	
	@RequestMapping("/goFindAll")
	public ModelAndView findAll(){
		
		List<Trainee> custList = service.retrieveDetails();
		return new ModelAndView("TraineesListSuccess", "list", custList);
	}
	
	@RequestMapping("/logout")
	public String logoutAction(HttpServletRequest req,Model m){
		System.out.println("in logout ");
			HttpSession session = req.getSession(false);
			session.setAttribute("valid", false);
			session.setAttribute("loginDetails", null);
			session.invalidate();
			
		return "redirect:../index.obj";
	}

}
