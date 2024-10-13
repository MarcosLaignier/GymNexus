package gymNexus.service;

import gymNexus.model.Pessoa;
import gymNexus.repository.PessoaRepository;
import gymNexus.utils.Service.AbstractBaseService;
import gymNexus.utils.ValidateMetodsUtils;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

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

        List<String> fieldsToValidate = Arrays.asList(
                "nome",
                "documento",
                "nascimento",
                "tipoPessoa",
                "situacao");
        ValidateMetodsUtils.validateFieldsNonNull(entity,fieldsToValidate);

        super.validate(entity);
    }
}
