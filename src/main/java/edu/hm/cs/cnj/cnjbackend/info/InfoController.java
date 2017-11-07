package edu.hm.cs.cnj.cnjbackend.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class InfoController {

	@Autowired
	InfoProperties properties;
	
	@RequestMapping("/info")
	public Info greeting() {
		
		Info result = new Info();
		result.setMessage(properties.getMessage());
		return result;
	}
}
