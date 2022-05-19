package edu.ifes.ci.si.les.smp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"idExportacao"})
public class Exportacao implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idExportacao;

	private Date dataExportacao;

	@ManyToOne
	@JoinColumn(name = "assinatura_id")
	private Assinatura assinatura;

	@ManyToOne
	@JoinColumn(name = "grupoSenha_id")
	private GrupoSenha grupoSenha;

}
