package fileServerDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fileServerDemo.entity.DemoEntity;
import fileServerDemo.mapper.DemoMapper;

@Controller
public class DemoController {

	@Autowired
	DemoMapper demoMapper;

	@GetMapping
	public String index(Model model) {
		List<DemoEntity> list = demoMapper.selectAll();
		model.addAttribute("fruitsData", list);
		return "top";
	}


}
