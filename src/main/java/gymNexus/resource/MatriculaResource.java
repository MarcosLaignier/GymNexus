package gymNexus.resource;

import gymNexus.model.Matricula;
import gymNexus.model.Matricula;
import gymNexus.service.MatriculaService;
import gymNexus.utils.BaseResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "/matricula")
public class MatriculaResource extends BaseResource<Matricula, Integer> {

    @Autowired
    private MatriculaService service;

    @Override
    public MatriculaService getService() {
        return service;
    }

    @GetMapping
    public ResponseEntity<List<Matricula>> findAll() {
        List<Matricula> acrescimos = service.getRepository().findAll();
        return ResponseEntity.status(HttpStatus.OK).body(acrescimos);
    }

}