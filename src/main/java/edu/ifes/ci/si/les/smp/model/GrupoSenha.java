package edu.ifes.ci.si.les.smp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"idGrupo"})
public class GrupoSenha implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idGrupo;

	private String nomeGrupo;

	private String descricaoGrupo;

	private Date dataCadastroGrupo;

	private Usuario usuario;

}
