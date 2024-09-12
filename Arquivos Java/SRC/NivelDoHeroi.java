package SRC;
import java.util.Scanner;

public class NivelDoHeroi {
    String heroi;
    int xp = 0;
    String elo;
    String resposta;

    Scanner sn = new Scanner(System.in);

    public void interacao(){
        System.out.println("Olá heroi, insira abaixo seu nome de campeão:");
        heroi = sn.nextLine();
    }

    public void validandoNivel(){
        if (xp < 500)
        {
            System.out.println("Está faltando feijão aí HAHAHA... Vamos direto para o farm!!");
            for (xp = 0; xp < 1500;xp = xp + 100)
            {
                if (xp == 1000)
                {
                    System.out.println("Deseja continuar farmando?");
                    resposta = sn.nextLine();
                    if (resposta.equals("sim"))
                    {
                        continue;
                    }
                    else
                    {
                        break;
                    }
                }
                System.out.println("Você eliminou um goblin");
            }
        }
        else
        {
            System.out.println("Parabéns campeão, você é um guerreiro de verdade!");
        }

        if (xp <= 1000)
        {
            elo = "Ferro";
            System.out.println(heroi + " você está no " + elo);
        }
        else if (xp >= 1001 || xp <= 2000)
        {
            elo = "Bronze";
            System.out.println(heroi + " você está no " + elo);
        }
        else if (xp >= 2001 || xp <= 5000)
        {
            elo = "Prata";
            System.out.println(heroi + " você está no " + elo);
        }
        else if (xp >= 5001 || xp <= 7000)
        {
            elo = "Ouro";
            System.out.println(heroi + " você está no " + elo);
        }
        else if (xp >= 7001 || xp <= 8000)
        {
            elo = "Platina";
            System.out.println(heroi + " você está no " + elo);
        }
        else if (xp >= 8001 || xp <= 9000)
        {
            elo = "Ascendente";
            System.out.println(heroi + " você está no " + elo);
        }
        else if (xp >= 9001 || xp <= 1000)
        {
            elo = "Imortal";
            System.out.println(heroi + " você está no " + elo);
        }
        else
        {
            elo = "Radiante";
            System.out.println("Parabéns, você alcançou o top, onde somente os fortes sobrevivem, agora você é um "+elo);
        }

        System.out.println("Olá "+heroi+" você tem: "+xp+" de XP e está no "+elo);

        if (heroi != "Radiante")
        {
            System.out.println("Continue tentando, o sol nasce para todos, mas somente os mais fortes estão dispostos a se queimar!!");
        }
    }
}
