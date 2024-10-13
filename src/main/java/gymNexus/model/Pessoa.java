package gymNexus.model;

import gymNexus.enums.AtivoInativoEnum;
import gymNexus.enums.TipoPessoaEnum;
import gymNexus.utils.Validate.ValidateField;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name ="pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ValidateField(message = "O Nome deve ser Informado!")
    private String nome;

    @ValidateField(message = "O Documento deve ser Informado!")
    private String documento;

    @ValidateField(message = "A Data de Nascimento deve ser Informada!")
    private Date nascimento;

    @ValidateField(message = "O Tipo deve ser Informado!")
    @Enumerated(EnumType.STRING)
    private TipoPessoaEnum tipoPessoa;

    @Enumerated(EnumType.STRING)
    private AtivoInativoEnum situacao;

    @Version
    private Integer versao = 0;


    // Getters and Setters

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public TipoPessoaEnum getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoaEnum tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public AtivoInativoEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(AtivoInativoEnum situacao) {
        this.situacao = situacao;
    }

    public Integer getVersao() {
        return versao;
    }

    public void setVersao(Integer versao) {
        this.versao = versao;
    }
}
