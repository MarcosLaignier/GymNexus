package gymNexus.service;

import gymNexus.model.Pessoa;
import gymNexus.repository.PessoaRepository;
import gymNexus.utils.CollectionMetodsUtils;
import gymNexus.utils.Service.AbstractBaseService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService extends AbstractBaseService<Pessoa, Integer> {

    @Autowired
    private PessoaRepository pessoaRepository;
    
    @Override
    public PessoaRepository getRepository() {
        return pessoaRepository;
    }

    @Override
    protected void validate(Pessoa entity) throws ServiceException {

        if(CollectionMetodsUtils.isStringEmpty(entity.getNome())){
            throw new ServiceException("O nome é obrigatorio");
        }
        super.validate(entity);
    }
}
