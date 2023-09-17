/* Criar uma conta bancária para os users Jubileu e Creusa
 * Com os seguintes requesitos:
 * a) Toda conta poupança aberta, recebe um bônus de 150, e a corrente de 50
 * b) As contas pagam mensalidade de acordo com o tipo de conta Correnta paga x, Poupança paga y
 * c) As contas só podem ser encerradas se não houver saldo devedor
 * 
 * Assistir os vídeos do: https://www.youtube.com/watch?v=hOC461osYgk&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&index=11
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        Account jub = new Account();

       jub.abrirConta("CP");

       jub.pagarMensal();
    
    }
}
