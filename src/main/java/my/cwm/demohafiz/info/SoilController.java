package my.cwm.demohafiz.info;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/soil")
@RequiredArgsConstructor
public class SoilController{ 
        final private SoilService svc;

        @GetMapping("")
        public String message()
        {
            return "hello" ;
        }

        @GetMapping("/1")
        public soil getSoil()
        {
            soil soil = new soil();
            soil.setId(1l);
            soil.setName("Laterite");
            return soil ;
        }

        @GetMapping("/all")
        public List<soil> getAllSoil()
        {
            return this.svc.getAllSoil() ;
        }

        @PostMapping("")
        public soil save(@RequestBody soil soil)
        {
            return this.svc.save(soil) ;
        }

        @DeleteMapping("/{id}")
        public void delete(@PathVariable Long id)
        {
            this.svc.delete(id) ;
        }
 }

