package edu.ifes.ci.si.les.smp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"idRecuperacaoSenha"})
public class RecuperacaoSenha implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idRecuperacaoSenha;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date dataRecuperacaoSenha;

	private boolean retornoRecuperacao;

	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

}
