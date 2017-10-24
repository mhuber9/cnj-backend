package edu.hm.cs.cnj.cnjbackend.info;

import org.springframework.web.bind.annotation.*;

@RestController
public class InfoController {
	
	@RequestMapping("/info")
	public Info greeting() {
		
		Info result = new Info();
		result.setMessage("OK");
		return result;
	}
}
