package gymNexus.service;

import gymNexus.repository.PessoaRepository;
import gymNexus.utils.Service.AbstractBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService extends AbstractBaseService<PessoaRepository, Integer> {

    @Autowired
    private PessoaRepository pessoaRepository;
    
    @Override
    public PessoaRepository getRepository() {
        return pessoaRepository;
    }
}
