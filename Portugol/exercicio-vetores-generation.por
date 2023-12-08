programa 
{
 
  funcao inicio() {
  inteiro numero[10], x, soma = 0, media
  
  para(x = 0; x < 10; x++){
      escreva("\n Entre com os  números do vetor: ")
      leia (numero[x])
  }
  escreva("\n Números ímpares: ")
  para(x = 0; x < 10; x++){
      se( x % 2 !=0) {
        escreva(" " + numero[x])
      }
  } 
  escreva("\n Números Pares: ")
  para(x = 0; x < 10; x++){
      se( numero[x]% 2 ==0) {
        escreva(" " + numero[x])
      }
  }  
  
  para(x = 0; x <= 10; x++){
    soma = soma + x
    media = soma / 10
  }
  escreva("\n Soma dos elementos :" + soma)
    escreva("\n Média do elementos :" + media)


  }
  
}
