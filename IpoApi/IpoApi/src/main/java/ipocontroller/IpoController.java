package ipocontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import iposervice.IpoService;
import ipoentity.Ipo;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class IpoController {
	
	@Autowired
	private IpoService ipoService;
	
	@RequestMapping("/")
	public String home()
	{
		return "Hello";
		
	}
	
	@GetMapping("/ipo/all")
	public List<Ipo> getAllIpo()
	{
		List<Ipo> getIpos=ipoService.getAllIpos();
		return getIpos;
	}
	
	
	@GetMapping("/ipo/{ipoID}")
	public Optional<Ipo> getOneipo(@PathVariable long ipoID)
	
	{
		Optional<Ipo> getIpo=ipoService.getIpo(ipoID);
		return getIpo;
	}
	
	
	@PostMapping("/ipo")
		public Ipo saveipo(@RequestBody Ipo ipo)
																			
		{
			Ipo ipores=ipoService.saveIpo(ipo);
			return ipores;
		}
		
			
	@DeleteMapping("/ipo/{ipoID}")
		public String deleteipo(@PathVariable long ipoID)
		{
		Optional<Ipo> ipo=ipoService.getIpo(ipoID);
		if(ipo!=null)
		{
			ipoService.deleteIpo(ipoID);
			return "ipo deleted";
		}
		else
			return "ipo doesnt exist";
			
		}
}
