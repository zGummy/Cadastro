package bd;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import model.Cliente;
import model.Funcionario;



public class BancoDados {   
    
    public static List<Cliente> listaClientes;
    
   public static List<Funcionario> listaFuncionario;
   //////////////////////////////////////////////////////////////////////////////////////////
    public static void initC() {       
        listaClientes = new ArrayList<>();
        listaClientes.add(new Cliente(1,
                                      "Carlos",
                                      new GregorianCalendar(1990, 0, 31),
                                      "01327868180",
                                      new GregorianCalendar(2019, 9, 6)));
        listaClientes.add(new Cliente(2,
                                      "Ricardo",
                                      new GregorianCalendar(2000, 12, 1),
                                      "01327868190",
                                      new GregorianCalendar(2018, 11, 8)));
        
    }   
   
    
    public static void deleteCliente(Integer id) {
        
        for (Cliente cliente : listaClientes) {
            if (cliente.getId().equals(id)) {
                listaClientes.remove(cliente);
                return;
            }
        }
        
        System.err.println("Erro removendo cliente com id " + id);
          
    }
    
     // Pesquisa de cliente por id
    public static Cliente buscaClientePorId(Integer id) {
        
        for (Cliente cliente : listaClientes) {
            if (cliente.getId().equals(id)) {
                return cliente;
            }
        }
        
        return null;
        
    }
    
    // Pesquisa cliente por nome
    public static List<Cliente> buscaClientePorNome(String nome) {
     
        List<Cliente> resultado = new ArrayList<>();
        
        for (Cliente cliente : listaClientes) {
            if (cliente.getNome().toUpperCase().contains(
                    nome.toUpperCase())) {
                resultado.add(cliente);
            }
        }
        
        return resultado;
          
    }
    
    public static void updateCliente(Integer id, 
            String novoNome, 
            GregorianCalendar novaDataNascimento,
            String novoCpf,
            GregorianCalendar novoDataCadastro) {
        
        for (Cliente cliente : listaClientes) {
            if (cliente.getId().equals(id)) {
                cliente.setNome(novoNome);
                cliente.setDataNascimento(novaDataNascimento);
                cliente.setCpf(novoCpf);
                cliente.setDataCadastro(novoDataCadastro);
                
                return;
            }
        }
        
        System.err.println("Erro atualizando cliente com id " + id);
    }
    //////////////////////////////////////////////////////////////////////////////////////////
    
    
    public static void initF() {       
        listaFuncionario = new ArrayList<>();
        
        listaFuncionario.add(new Funcionario(1,
                                      "Eduardo",
                                      new GregorianCalendar(1990, 0, 31),
                                      "01327865880",
                                      new GregorianCalendar(2019, 9, 6),
                                      "Finanças",
                                      "A"));
        
        listaFuncionario.add(new Funcionario(2,
                                      "Davi",
                                      new GregorianCalendar(2000, 12, 1),
                                      "01327896190",
                                      new GregorianCalendar(2018, 11, 8),
                                      "Administrador",
                                      "B"));
        
    }   
   
    
    public static void deleteFuncionario(Integer id) {
        
        for (Funcionario funcionario : listaFuncionario) {
            if (funcionario.getId().equals(id)) {
                listaFuncionario.remove(funcionario);
                return;
            }
        }
        
        System.err.println("Erro removendo funcionario com id " + id);
          
    }
    
     // Pesquisa de Funcionario por id
    public static Funcionario buscaFuncionarioPorId(Integer id) {
        
        for (Funcionario funcionario : listaFuncionario) {
            if (funcionario.getId().equals(id)) {
                return funcionario;
            }
        }
        
        return null;
        
    }
    
    // Pesquisa funcionario por nome
    public static List<Funcionario> buscaFuncionarioPorNome(String nome) {
     
        List<Funcionario> resultado = new ArrayList<>();
        
        for (Funcionario Funcionario : listaFuncionario) {
            if (Funcionario.getNome().toUpperCase().contains(
                    nome.toUpperCase())) {
                resultado.add(Funcionario);
            }
        }
        
        return resultado;
          
    }
    
    public static void updateFuncionario(Integer id, 
            String novoNome, 
            GregorianCalendar novaDataNascimento,
            String novoCpf,
            GregorianCalendar novoDataCadastro,
            String novoFuncao,
            String novoSetor) {
        
        for (Funcionario funcionario : listaFuncionario) {
            if (funcionario.getId().equals(id)) {
                funcionario.setNome(novoNome);
                funcionario.setDataNascimento(novaDataNascimento);
                funcionario.setCpf(novoCpf);
                funcionario.setDataCadastro(novoDataCadastro);
                funcionario.setFuncao(novoFuncao);
                funcionario.setSetor(novoSetor);
                
                return;
            }
        }
        
        System.err.println("Erro atualizando funcionario com id " + id);
    }

    
    
    
        
}
