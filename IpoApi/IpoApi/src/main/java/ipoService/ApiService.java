package ipoService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import Ipo.Ipo;
import repository.IpoRepo;

@Service
public class ApiService {
	
	@Autowired
	private IpoRepo ipoRepo;
	

	public List<Ipo> getAllIpos()
	{
		List<Ipo> allIpos=ipoRepo.findAll();
		return allIpos;
	}
	
	
	public Optional<Ipo> getIpo(String ipoID)
	{
		Optional<Ipo> Ipores=ipoRepo.findById(ipoID));
		return Ipores;
	}
	
	
	public Ipo saveIpo(Ipo ipo)
	{
		ipoRepo.save(ipo);
		return ipo;
	}
	
	
	
	public void deleteIpo(String ipoID)
	{
		ipoRepo.deleteById(ipoID);
		
	}
}
