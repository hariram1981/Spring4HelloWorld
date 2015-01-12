/**
 * 
 */
package com.hariram.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hariram
 *
 */
@Controller
public class MyController {
	
	@RequestMapping("/hello")
	public String get(@RequestParam String name, Model model) {
		model.addAttribute("name", name);
		return "helloworld";
	}
}
