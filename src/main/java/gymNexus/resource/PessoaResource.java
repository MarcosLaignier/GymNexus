package gymNexus.resource;

import gymNexus.model.Pessoa;
import gymNexus.service.PessoaService;
import gymNexus.utils.AbstractBaseService;
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
@RequestMapping(value = "/pessoa")
public class PessoaResource extends BaseResource<Pessoa, Integer> {

    @Autowired
    private PessoaService pessoaService;

    @Override
    public PessoaService getService() {
        return pessoaService;
    }

        @GetMapping
    public ResponseEntity<List<Pessoa>> findAll() {
        List<Pessoa> acrescimos = pessoaService.getRepository().findAll();
        return ResponseEntity.status(HttpStatus.OK).body(acrescimos);
    }
}
