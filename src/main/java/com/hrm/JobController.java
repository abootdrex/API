package com.hrm;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@CrossOrigin
@Controller
@RequestMapping(path = "/job")
public class JobController {
	@Autowired
	JobRepository jobItemsRepo;
	
	@RequestMapping("/form")
    public String getForm(Model model) {
        
        return "form";
    }
	
	@RequestMapping("/apply")
    public String getData(Model model) {
        List<JobItems> items = jobItemsRepo.findAll();
        model.addAttribute("items", items);
        return "home";
    }

	@PostMapping("/add/new") // Map ONLY POST Requests
	public @ResponseBody String addNew(@RequestParam String id,@RequestParam String title,@RequestParam String company_name,
			@RequestParam String description,@RequestParam String location,@RequestParam String job_types,
			@RequestParam String age,@RequestParam String url,@RequestParam String imageUrl,@RequestParam String posted_on,
			@RequestParam String salary,@RequestParam String experience,@RequestParam String Requirements,
			@RequestParam String Shift_and_schedule,@RequestParam String degree,@RequestParam String benefits_perks,
			@RequestParam String posted_by,@RequestParam String task,@RequestParam String openings,
			@RequestParam String langauge,@RequestParam String skills,@RequestParam String key_responsibility,
			@RequestParam String Date,@RequestParam String email ,@RequestParam String phone) {
		JobItems n = new JobItems();
		n.setId(id);
		n.setTitle(title);
		n.setEmail(email);
		n.setCompany_name(company_name);
		n.setExperience(experience);
		n.setDescription(description);
		n.setJob_types(job_types);
		n.setBenefits_perks(benefits_perks);
		n.setAge(age);
		n.setPosted_on(posted_on);
		n.setImageUrl(imageUrl);
		n.setOpenings(openings);
		n.setLocation(location);
		n.setPosted_by(posted_by);
		n.setTask(task);
		n.setLangauge(langauge);
		n.setKey_responsibility(key_responsibility);
		n.setRequirements(Requirements);
		n.setSkills(skills);
		n.setUrl(url);
		n.setShift_and_schedule(Shift_and_schedule);
		n.setDegree(degree);
		n.setSalary(salary);
		n.setDate(Date);
		n.setPhone(phone);		
		jobItemsRepo.save(n);
		return "Job Posted Successfully Thank You";
	}
	
	@GetMapping(path = "/alljobs")
	public @ResponseBody List<JobItems> getAllJobs() {
		return jobItemsRepo.findAll();
	}
	

	@PostMapping(path = "/delete")
	public @ResponseBody String DeleteJob(@RequestParam String id) {
		JobItems n = new JobItems();
		n.setId(id);
		jobItemsRepo.delete(n);
		return "Job removed successfully";
	}

	@PostMapping(path = "/update")
	public @ResponseBody String UpdateJob(@RequestParam String id,@RequestParam String title,@RequestParam String company_name,
			@RequestParam String description,@RequestParam String location,@RequestParam String job_types,
			@RequestParam String age,@RequestParam String url,@RequestParam String imageUrl,@RequestParam String posted_on,
			@RequestParam String salary,@RequestParam String experience,@RequestParam String Requirements,
			@RequestParam String Shift_and_schedule,@RequestParam String degree,@RequestParam String benefits_perks,
			@RequestParam String posted_by,@RequestParam String task,@RequestParam String openings,
			@RequestParam String langauge,@RequestParam String skills,@RequestParam String key_responsibility,
			@RequestParam String Date,@RequestParam String email ,@RequestParam String phone) {
		@SuppressWarnings("unused")
		List<JobItems> A = jobItemsRepo.findAll();
		JobItems na = new JobItems();
		na.setId(id);
		na.setTitle(title);
		na.setEmail(email);
		na.setCompany_name(company_name);
		na.setExperience(experience);
		na.setDescription(description);
		na.setJob_types(job_types);
		na.setBenefits_perks(benefits_perks);
		na.setAge(age);
		na.setPosted_on(posted_on);
		na.setImageUrl(imageUrl);
		na.setOpenings(openings);
		na.setLocation(location);
		na.setPosted_by(posted_by);
		na.setTask(task);
		na.setLangauge(langauge);
		na.setKey_responsibility(key_responsibility);
		na.setRequirements(Requirements);
		na.setSkills(skills);
		na.setUrl(url);
		na.setShift_and_schedule(Shift_and_schedule);
		na.setDegree(degree);
		na.setSalary(salary);
		na.setDate(Date);
		na.setPhone(phone);		
		jobItemsRepo.save(na);
		return "Job updated successfully";
	}

}
