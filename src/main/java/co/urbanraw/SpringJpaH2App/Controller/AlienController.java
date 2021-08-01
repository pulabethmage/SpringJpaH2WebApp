package co.urbanraw.SpringJpaH2App.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import co.urbanraw.SpringJpaH2App.Alien;
import co.urbanraw.SpringJpaH2App.dao.AlienDao;

@Controller
public class AlienController {
	
	@Autowired
	AlienDao aliendao;
	

	@RequestMapping("/")
	public String home()
	{
		
		return "home";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		aliendao.save(alien);
		
		return "home";
		
	}
	
	
	
}
