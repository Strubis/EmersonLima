<?php
   
   // Ex3
   $aluno = new Aluno("Emerson", 200);
   $sbsc = new AtividadeComplementar("SBSC-2020", 8, AC::Seminarios);
   $pibic = new AtividadeComplementar("PIBIC-2020", 60, AC::ProjetoDePesquisa);
   $sbcas = new AtividadeComplementar("SBCAS-2021", 16, AC::Publicacao);
   
   $aluno->adicionar_ac($sbsc);
   $aluno->adicionar_ac($pibic);
   $aluno->adicionar_ac($sbcas);
   $aluno->adicionar_ac($sbcas);
   //$aluno->printAcs();
   
   $aluno->listar_acs_tipo(AC::Publicacao);
   
   echo "\nHoras faltantes: ".$aluno->calcular_horas_faltantes_ac();
   
   class Aluno {
       private $nome;
       private $qtdHorasAcs; // Qtd de horas complementares
       private $acs;
       
       function __construct($nome, $qtdHorasAcs){
           $this->nome = $nome;
           $this->qtdHorasAcs = $qtdHorasAcs;
           $this->acs = array();
       }
       
       function adicionar_ac($ac){
           $this->qtdHorasAcs -= $ac->getTotalHorasAc();
           
           array_push($this->acs, $ac);
       }
       
       function listar_acs_tipo($tipo){
           foreach($this->acs as $atv){
              echo $atv->getTipoAc() == $tipo ? $atv->getNome()." - ".$atv->getTotalHorasAc()."H\n" : "";
           }
       }
       
       function calcular_horas_faltantes_ac(){
           return $this->qtdHorasAcs;
       }
       
       function getNome(){
           return $this->nome;
       }
       
       function getQtdHorasAcs(){
           return $this->qtdHorasAcs;
       }
       
       function printAcs(){
           print_r($this->acs);
       }
   }
   
   class AtividadeComplementar {
       private $nomeAc;
       private $totalHorasAc;
       private $tipoAc;
       
       function __construct($nome, $totalHorasAc, $tipoAc){
            $this->nomeAc = $nome;
            $this->totalHorasAc = $totalHorasAc;
            $this->tipoAc = $tipoAc;
       }
       
       function getNome(){
           return $this->nomeAc;
       }
       
       function getTotalHorasAc(){
           return $this->totalHorasAc;
       }
       
       function getTipoAc(){
           return $this->tipoAc;
       }
   }
   
   abstract class AC {
       const Seminarios = "S";
       const ProjetoDePesquisa = "PP";
       const Publicacao = "PU";
   }
   
   
   // Ex2
   echo "Formatar CPF: ".substituiCPFs("Texto: 123.456.789/12");
   function substituiCPFs($string){
       // 123.456.789/12 ou 12345678912
       return preg_replace(
           '/[0-9]{3}\.?[0-9]{3}\.?[0-9]{3}\/?[0-9]{2}/',
           'xxx',
           $string
           );
   }
   
   
   // Ex1
   $ma =  
   [
        [0,1,1,1],
        [1,0,1,0],
        [1,1,0,1],
        [1,0,1,0]
    ];
    echo "Maior: ".calculaNumeroVizinhos($ma, count($ma))."\n";
   
   print_r( grafo_push($ma, [1, 1, 1, 1]) );
   function grafo_push($matriz, $vetorVizinhos){
       if(count($vetorVizinhos) == count($matriz)){
            for($i = 0; $i < count($vetorVizinhos); $i++){
                array_push($matriz[$i], $vetorVizinhos[$i]);
            }
            
            array_push($vetorVizinhos, 0);
            array_push($matriz, $vetorVizinhos);
            return $matriz;
       }
       
       return "Erro";
   }
   
   function callback($m){
       // Pega cada linha da matriz (matriz[i]) e soma os valores, retornando um array com esses valores
       return array_sum($m);
   }

   // Retornar no com mais vizinhos
   function calculaNumeroVizinhos($matriz, $numeroNos){
       $retorno = array_map('callback', $matriz);
       $noVizinhoMaior = array_keys($retorno, max($retorno));
       
       return $noVizinhoMaior[0];
   }
?>
