package gymNexus.model;

import gymNexus.enums.AtivoInativoEnum;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name ="matricula")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToOne
    @JoinColumn(name="pessoa")
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name="plano")
    private Plano plano;

    @Temporal(TemporalType.DATE)
    private Date inicio;

    @Temporal(TemporalType.DATE)
    private Date fim;

    private AtivoInativoEnum situacao;

    @Version
    private Integer versao = 0;

    // Getters e Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
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
