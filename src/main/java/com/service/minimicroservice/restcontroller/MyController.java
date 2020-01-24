package com.service.minimicroservice.restcontroller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.minimicroservice.objects.FormRec;
import com.service.minimicroservice.objects.Mail;
import com.service.minimicroservice.stripe.ChargeRequest;
import com.service.minimicroservice.stripe.ChargeRequest.Currency;
import com.service.minimicroservice.stripe.StripeService;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;

import lombok.Value;

@Controller
public class MyController {

	@Autowired
	private Mail myMailObject;
	
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String getForm(Model model) {
		model.addAttribute("recForm", new FormRec());
		return "form";
	}

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String postSubmit(@ModelAttribute(name = "rec") FormRec rec) {
		boolean flag = false;
		if (rec.getRecruiter().isEmpty()) {
			flag = false;
		} else if (rec.getEmail().isEmpty()) {
			flag = false;

		} else if (rec.getCompany().isEmpty()) {
			flag = false;
		} else if (rec.getRegion().isEmpty()) {
			flag = false;
		} else if (rec.getSalary().equals("Choose")) {
			flag = false;
		} else if (rec.getPosition().isEmpty()) {
			flag = false;
		} else if (rec.getContract_years().equals("Choose")) {
			flag = false;
		} else if (rec.getAdvantages().isEmpty()) {
			flag = false;
		}else
		{
			
			flag=true;
		}
		if(flag)
		{
			myMailObject.sendEmailOKMail(rec.getEmail(), "Recruitment For "+rec.getCompany(),"Successfull Submission" , 
					"Thank you for contacting me!","I will consider your offer and i will reply as soon as possible", "If it takes more than 48 Hours for me to reply,"
							+ "I'm probably busy, i will reply as soon as possible");
			
			myMailObject.sendEmail("phillalexakis@gmail.com", "Recruitment For "+
			rec.getCompany(),rec.getRecruiter()+" send an application form",
					"Company: "+rec.getCompany()+"<br>"+
					"Recruiter email: "+rec.getEmail()+"<br>"+
					"Region: "+rec.getRegion()+"<br>"+
					"Salary: "+rec.getSalary()+"<br>"+
					"Position: "+rec.getPosition()+"<br>"+
					"Remote: "+rec.getRemote()+"<br>"+
					"Contract Period: "+rec.getContract_years()+"<br>"+
					"Benefits: "+rec.getAdvantages()+"<br>",
					"", "");
			return "result";
		}else
		{
			return "redirect:/form";
		}
		
	}
	
	
	  

	
	

}
