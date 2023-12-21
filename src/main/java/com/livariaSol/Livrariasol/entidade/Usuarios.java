package com.livariaSol.Livrariasol.entidade;

import java.util.ArrayList;
import java.util.List;

import com.livariaSol.Livrariasol.entidade.enums.StatusUser;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="usuarios")
@Table(name="tb_usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String senha;
	private StatusUser status;
	@OneToMany(mappedBy="clientes")
	private List<Pedido> pedidos = new ArrayList<>();
	
}
