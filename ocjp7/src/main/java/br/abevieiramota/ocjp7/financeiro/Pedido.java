package br.abevieiramota.ocjp7.financeiro;

import br.abevieiramota.ocjp7.modelo.Pessoa;
import java.util.Date;
//import java.sql.Date;
// não pode import de dois types com mesmo nome
// mas se importar tudo, ok
import java.sql.*;
// ocorre que Date passará a referenciar java.util.Date, o mais específico
// não pode import Produto! tem que vir package
// tipo em pacote default não pode ser acessado por tipo em um pacote específico
// java.util.* + java.sql.* > se Date, erro
// import a.b.c.* importa os tipos em a.b.c! e não subpacotes!!!
// import static a.b.c.Util.TAMANHO;
// import static a.b.c.Util.maior;

// import a;
// import a;
// repetir imports não dá erro, dá warning
// package pode começar maiúsculo

class Pedido {

	Pessoa pessoa;
}
