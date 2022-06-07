package st.soft.instr.projecta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectARestController {
	@GetMapping("/")
	public String getProjectName() {
		return "Spring Maven Project A";
	}
}
