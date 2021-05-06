package my.cwm.demohafiz.info;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SoilService 
{
    final SoilRepository repo;
    
    public List<soil> getAllSoil()
    {  
        return this.repo.findAll(); 
    }

    public soil save(soil soil)
    {
        return this.repo.save(soil) ;
    }

    public void delete(Long id)
    {
        this.repo.deleteById(id) ;
    }
}
