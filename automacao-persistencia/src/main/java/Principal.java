public class Principal {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("automacaocomercial");
		
		EntityManager em = emf.createEntityManager();
		
		
		String opcao = "", opcao2 = "", opcao3 = "";
		
		String menuProduto1;
		
		
		String menuPrincipal = "1 - Manutencao de Produtos \n" 
		+ " 2 - Manutencao de Clientes \n" 
				+ " 0 - Sair \n";
		
		
		while (!opcao.equals("0")) {
			
			opcao = JOptionPane.showInputDialog(menuPrincipal);
			
			
			switch (opcao) {
			
			case "1":
				
				String menuProduto = "1 - lista todos \n" 
				+ "2 - adicinar \n"
				+ "3 - editar \n"
				+ "4 - excluir\n"
				+ "0 - sair\n";
			
				
				
			
				
				while (!opcao2.equals("0")) {
					
					opcao2 = JOptionPane.showInputDialog(menuProduto);
					
					switch (opcao2) {
					
					case "1":
						em.getTransaction().begin();
						List<Produto> listaProduto = em.createQuery("from Produto").getResultList();
						
						for(Produto p: listaProduto){
							
							JOptionPane.showMessageDialog(null, "Produto " + p.toString());
							
							
						}
						//em.close();
						break;
						
					
						
					case "2":
						
						Produto p1 = new Produto();
						
						p1.setDescricao(JOptionPane.showInputDialog("Digite a Descricção do Produto"));
						
						p1.setCodigoBarra(JOptionPane.showInputDialog("Digite o Codigo de Barra do Produto"));
						
						p1.setValor(JOptionPane.showInputDialog("Digite o Valor do Produto"));
						
						em.getTransaction().begin();
						em.persist(p1);
						em.getTransaction().commit();
						
						//em.close();
						
						break;
						
						
					case "3":
						
						Produto p2 = new Produto();
						
						 p2.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID para ALTERAÇÃO")));
						
		                em.getTransaction().begin();
		                Produto produto = em.find(Produto.class,p2.getId());
		                if (produto.getId()!=null) {
		                	
		                	p2.setDescricao(JOptionPane.showInputDialog("Digite a ALTERAÇÃO do Descricção do Produto"));
							
							p2.setCodigoBarra(JOptionPane.showInputDialog("Digite a ALTERAÇÃO do Codigo de Barra do Produto"));
							
							p2.setValor(JOptionPane.showInputDialog("Digite a ALTERAÇÃO do Valor do Produto"));
		                	
		                	em.merge(p2);
			                em.getTransaction().commit();
			                //em.close();
			                
			                JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso.");
		                }
		                
		                
					case "4":
						
						Produto p3 = new Produto();
						
						p3.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID para EXCLUIR")));
						
		                em.getTransaction().begin();
		                Produto produto1 = em.find(Produto.class,p3.getId());
		                if (produto1.getId()!=null) {
		                	
		                	
		                	em.remove(produto1);
			                em.getTransaction().commit();
			                //em.close();
			                
			                JOptionPane.showMessageDialog(null, "Produto foi EXCLUIDO com sucesso.");
		                }
						
						break;
						
//------------------------------- // --------------	-------------------------- // ---------------------------------	
						
						// Parte do Cliente
						
						
					while (!opcao3.equals("0")) {
							
						opcao3 = JOptionPane.showInputDialog(menuPrincipal);
								
								
						switch (opcao3) {
								
						case "1":
									
							String menuProduto = "1 - lista todos \n"   //...
							+ "2 - adicinar \n"
							+ "3 - editar \n"
							+ "4 - excluir\n"
							+ "0 - sair\n";	
								
							while (!opcao3.equals("0")) {
									
								opcao2 = JOptionPane.showInputDialog(menuProduto);
									
								switch (opcao3) {
									
									
								case "1":
									em.getTransaction().begin();
									List<Cliente> listaCliente = em.createQuery("from Produto").getResultList();
										
									for(Cliente c: listaCliente){
											
										JOptionPane.showMessageDialog(null, " Cliente " + c.toString());
											
								case "2":
											
									Cliente c1 = new Cliente();
									
									Endereco end1 = new Endereco();
									
									Venda v1 = new Venda();
									
									ItensDaVenda venda = new ItensDaVenda();
									
									Cliente cliente = em.find(Cliente.class, 13);
									System.out.print("Total de Vendas" + cliente.getVendas().size() + "Endereço" + Endereco.getEndereco);
									
									c1.setNome(JOptionPane.showInputDialog("Digite o seu Nome: "));
											
									c1.setCpf(JOptionPane.showInputDialog("Digite o seu CPF: "));
											
									p1.setValor(JOptionPane.showInputDialog("Digite o Valor do Produto"));
									
									//-------
									end1.setBairro(JOptionPane.showInputDialog("Digite o seu Bairro: "));
									end1.setCidade(JOptionPane.showInputDialog("Digite o sua Cidade: "));
									
									//-------
									
									em.getTransaction().begin();
									em.persist(c1);
									em.getTransaction().commit();
									//--
									end1.setCliente(c1);
									//--
									v1.setCliente(c1);
									//----------
									em.persist(v1);
									//---------
									venda.setCliente(cliente);
									item1.se
									em.persist(venda);
									
									
									
									Cliente cliente = em.find(Cliente, class, 13);
									Produto prod1 = em.find(Produto, class, 1)
									Produto prod3 = em.find(Produto, class, 3)
									
									List<ItemDaVenda> itemDaVenda = new ArrayList<ItemDaVenda>();
									
									ItensDaVenda item1 = new ItensDaVenda();
									item1.setProduto(produto1);
									item1.setQuantidade(0);
									item1.setTotal(prod1.getValor()*item1.getQuantidade());
									item1.setVenda(v1);

									ItensDaVenda item2 = new ItensDaVenda();
									item2.setProduto(produto2);
									item2.setQuantidade(5);
									
									item2.setTotal(prod3.getValor()*item2.getQuantidade());
									item2.setVenda(v1);
									
									itensVenda.add(item1);
									itensVenda.add(item2);
									
									
									em.persist(v1);
									
								case "3":
									
									Cliente c2 = new Cliente();
									
									 c2.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID para ALTERAÇÃO")));
									
					                em.getTransaction().begin();
					                Cliente cliente = em.find(Cliente.class,c2.getId());
					                if (cliente.getId()!=null) {
					                	
					                	c2.setNome(JOptionPane.showInputDialog("Digite a ALTERAÇÃO do NOME"));
										
										c2.setCpf(JOptionPane.showInputDialog("Digite a ALTERAÇÃO do CPF"));
										
					                	em.merge(c2);
						                em.getTransaction().commit();
						                //em.close();
						                
						                JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso.");
					                }
					                
					                
								case "4":
									
									Cliente c3 = new Cliente();
									
									c3.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID para EXCLUIR")));
									
					                em.getTransaction().begin();
					                Cliente cliente1 = em.find(Cliente.class,c3.getId());
					                if (produto1.getId()!=null) {
					                	
					                	
					                	em.remove(cliente1);
						                em.getTransaction().commit();
						                //em.close();
						                
						                JOptionPane.showMessageDialog(null, "CLIENTE foi EXCLUIDO com sucesso.");
									
									
									
								
									
									}
										
									
								}
								
							}
							
							
						}
							
						
//------------------------------- // --------------	-------------------------- // ---------------------------------	
							
							
					}
		
						
	}

}
			
		}
		
	}
	
}
