package iposervice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import ipoentity.Ipo;
import repository.IpoRepo;

@Service
public class IpoService {
	
	@Autowired
	private IpoRepo ipoRepo;
	

	public List<Ipo> getAllIpos()
	{
		List<Ipo> allIpos=ipoRepo.findAll();
		return allIpos;
	}
	
	
	public Optional<Ipo> getIpo(long ipoID)
	{
		Optional<Ipo> Ipores=ipoRepo.findById(ipoID);
		return Ipores;
	}
	
	
	public Ipo saveIpo(Ipo ipo)
	{
		ipoRepo.save(ipo);
		return ipo;
	}
	
	
	
	public void deleteIpo(long ipoID)
	{
		ipoRepo.deleteById(ipoID);
		
	}
}
