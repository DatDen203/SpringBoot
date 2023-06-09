package com.example.demo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Model.TeacherDto;
import com.example.demo.Service.TeacherService;
import com.example.demo.Service.TeachingService;

@Controller
public class TeacherController {
	@Autowired
	TeacherService TeacherService;
	@Autowired
	TeachingService teachingService;

	@RequestMapping(value = "admin/allTeacher")
	public ModelAndView student() {
		ModelAndView mv = new ModelAndView("teacher/listTeacher");
		mv.addObject("listTeacher", TeacherService.selectAll());
		return mv;
	}

	@RequestMapping(value = "admin/addTeacher", method = RequestMethod.GET)
	public ModelAndView AddTeacherView(ModelAndView mv) {
		TeacherDto obj = new TeacherDto();
		mv.addObject("obj", obj);
		mv.addObject("title", "Add New Teacher");
		mv.setViewName("teacher/addTeacher");
		return mv;
	}

	@RequestMapping(value = "admin/saveAddTeacher", method = RequestMethod.POST)
	public ModelAndView insertTeacher(@ModelAttribute TeacherDto obj) {
		List<String> ls = TeacherService.selectID();
		System.out.println(ls.toString());

		ModelAndView mav = new ModelAndView();

		if (ls.contains(obj.getID_Teacher()) == false) {
			try {
				mav.setViewName("redirect:/admin/allTeacher");
				TeacherService.insertTeacher(obj);
			} catch (Exception e) {
				mav.addObject("title", "Add New Teacher");
				mav.addObject("obj", obj);
				mav.addObject("msg", "ID exited");
				mav.setViewName("teacher/addTeacher");
			}
		}
		return mav;
	}

	@RequestMapping(value = "admin/updateTeacher/{id}", method = RequestMethod.GET)
	public ModelAndView updateTeacher(@PathVariable("id") String id) {
		TeacherDto obj = TeacherService.findById(id);
		ModelAndView mv = new ModelAndView("teacher/updateTeacher");
		mv.addObject("obj", obj);
		mv.addObject("title", "Update Teacher");
		return mv;
	}

	@RequestMapping(value = "admin/saveUpdateTeacher", method = RequestMethod.POST)
	public ModelAndView updateTeacher(@ModelAttribute TeacherDto obj) {
		List<String> ls = TeacherService.selectID();
		System.out.println(ls.toString());

		ModelAndView mav = new ModelAndView();
		if (ls.contains(obj.getID_Teacher()) == false) {
			try {

				mav.setViewName("redirect:/admin/allTeacher");
				TeacherService.updateTeacher(obj);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return mav;
	}
	
	@RequestMapping(value = "admin/addClassTeacher/{id}", method = RequestMethod.POST)
	public ModelAndView addClassTeacher(@RequestParam("selectedClasses") String[] selectedClasses, @PathVariable("id") String idTeacher) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("idTeacher", idTeacher);
		mv.setViewName("redirect:/admin/list-teaching/" + idTeacher);
		List<String> addClasses = Arrays.asList(selectedClasses);
		for(String nameClass : addClasses) {
			teachingService.addClassTeacher(nameClass, idTeacher);
		}
		return mv;
	}
	
	

	/*
	 * @RequestMapping(value = "admin/detailClass/{id}", method = RequestMethod.GET)
	 * public ModelAndView detailClassView(@PathVariable("id") String id) {
	 * TeacherDto obj = TeacherService.findById(id); ModelAndView mv = new
	 * ModelAndView("addClass"); int totalStudent =
	 * TeacherService.totalStudentById(id); mv.addObject("obj", obj);
	 * mv.addObject("totalStudent", totalStudent); mv.addObject("title",
	 * "Detail Teacher"); return mv; }
	 */

	@RequestMapping(value = "admin/list-teaching/{id}", method = RequestMethod.GET)
	public ModelAndView detailClassView(@PathVariable("id") String id) {
		ModelAndView mv = new ModelAndView("teacher/listClassTeaching");
		mv.addObject("listClass",teachingService.getAllClass(id));
		mv.addObject("idTeacher", id);
		return mv;
	}

	@RequestMapping(value = "admin/add-teaching/{id}", method = RequestMethod.GET)
	public ModelAndView viewAddTeaching(@PathVariable("id") String id) {
		ModelAndView mv = new ModelAndView("teacher/addClassTeaching");
		mv.addObject("listClass", teachingService.getClassDontTeaching(id));
		mv.addObject("idTeacher", id);
		return mv;
	}
	
	@RequestMapping(value = "/admin/deleteTeacher", method = RequestMethod.GET)
	public ModelAndView deleteTeacher(@RequestParam("idTeacher") String id) {
		TeacherService.deleteTeacher(id);
		return new ModelAndView("redirect:/admin/allTeacher");
	}

}
