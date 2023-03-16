<?php
	function bitsRedundantes($bit1, $bit2, $bit3, $bit4){
	  $bits = "";
	  
	  // primeiro bit redundante
	  $bits = $bits.(getBitRedundante($bit1, $bit2, $bit4));
	  
	  // segundo bit redundante
	  $bits = $bits.(getBitRedundante($bit1, $bit3, $bit4));
	  
	  // terceiro bit redundante
	  $bits = $bits.(getBitRedundante($bit2, $bit3, $bit4));
	  
	  echo $bits;
	}
	
	function getBitRedundante($bit1, $bit2, $bit3){
	  if( ($bit1 == 1 && $bit2 == 1 && $bit3 == 1) || 
	      verificaQtdDe1($bit1, $bit2, $bit3) ){
	    return "1";
	  }else{
	    return "0";
	  }
	}
	
	function verificaQtdDe1($bit1, $bit2, $bit3){
	  $qtd = 0;
	  
	  if($bit1 == 1) $qtd++;
	  
	  if($bit2 == 1) $qtd++;
	  
	  if($bit3 == 1) $qtd++;
	  
	  return $qtd == 1;
	}
	bitsRedundantes(0, 1, 1, 1);
	echo "\n\n";
	
	// Exercicio 01b
	function cortaString($str){
	    $array = str_split($str, 4);
	    
	    foreach($array as $key => $arr){
	        bitsRedundantes($arr[0], $arr[1], $arr[2], $arr[3]);
	        echo "\n";
	    }
	}
	cortaString("00101100");
	echo "\n\n";
	
	// Exercicio 01c
	function verificaString($str){
	    $regex = '/[0-1]{4}/';
	    preg_match_all($regex, $str, $mat);
	    
	    foreach($mat[0] as $key => $st){
	        echo $st."\n";
	    }
	}
	verificaString("00011101");
	echo "\n\n";
	
	// Exercicio 02b
	function a($minutoDosGols){
	    $maxGols = 0;
	    $minDoMaximo = -1;
	    
	    // Pegando a qtd de gols
	    $maxGols = count($minutoDosGols);
	    
	    // Minuto do maximo
	    $minDoMaximo = max($minutoDosGols);
	    
	    echo "Minuto maximo: ".$minDoMaximo."\n";
	    echo "Quantidade de gols: ".$maxGols."\n";
	}
	$gols = array(10, 40, 78, 84);
	a($gols);
	echo "\n\n";
	
	// Exercicio 03a
	class Funcionario{
	    public $nome, $cpf, $dtNascimento, $salario;
	    
	    function set_nome($nome){
	        $this->nome = $nome;
	    }
	    function get_nome(){
	        return $this->nome;
	    }
	    
	    function set_cpf($cpf){
	        $this->cpf = $cpf;
	    }
	    function get_cpf(){
	        return $this->cpf;
	    }
	    
	    function set_dtNascimento($dtNascimento){
	        $this->dtNascimento = $dtNascimento;
	    }
	    function get_dtNascimento(){
	        return $this->dtNascimento;
	    }
	    
	    function set_salario($salario){
	        $this->salario = $salario;
	    }
	    function get_salario(){
	        return $this->salario;
	    }
	    
	    function imprimirFuncionario(){
	        echo "Nome: ".$this->get_nome()."\n";
	        echo "CPF: ".$this->get_cpf()."\n";
	        echo "Data de Nascimento: ".$this->get_dtNascimento()."\n";
	        echo "Salario: R$ ".$this->get_salario()."\n";
	    }
	}
	// Exercicio 03b
	$fun = new Funcionario();
	$fun->set_nome("José Silva");
	$fun->set_cpf("012.345.678-90");
	$fun->set_dtNascimento("20/07/1967");
	$fun->set_salario(2000.00);
	
	$fun->imprimirFuncionario();
?>