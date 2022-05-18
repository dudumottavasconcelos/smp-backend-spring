package edu.ifes.ci.si.les.smp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"idPontoAcesso"})
public class PontoAcesso implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idPontoAcesso;

	private String novoDispositivoPontoAcesso;

	private Date dataCadastroPontoAcesso;

	private Usuario usuario;

}
