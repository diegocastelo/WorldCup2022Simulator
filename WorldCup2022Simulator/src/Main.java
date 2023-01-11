//Aluno 1: Diego Castelo Guimarães Lopes Albuquerque
//Aluno 2: Gustavo Gomes Holanda

import java.io.*;
import java.nio.CharBuffer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Tela t = new Tela();

        File arquivo = new File("C:/Users/diego/Desktop/WorldCup2022Simulator/tabelaCopa.txt");
        Scanner dado = new Scanner(arquivo);
        //new Screen();
        int contador = 0;
        try{
            if(arquivo.exists()){
                FileReader fr = new FileReader(arquivo);
                BufferedReader br = new BufferedReader(fr);

                for(int nLinha = 1 ; nLinha<=64;nLinha++){
                    String linha = dado.nextLine();
                    String linhaSplit [] = linha.split(";");

                    if(nLinha == 1){
                        t.GolsA1J1.setText(linhaSplit[0]);
                        t.GolsA2J1.setText(linhaSplit[1]);
                    }
                    if(nLinha == 2){
                        t.GolsA3J2.setText(linhaSplit[0]);
                        t.GolsA4J2.setText(linhaSplit[1]);
                    }
                    if(nLinha == 3){
                        t.GolsA1J3.setText(linhaSplit[0]);
                        t.GolsA3J3.setText(linhaSplit[1]);
                    }
                    if(nLinha == 4){
                        t.GolsA4J4.setText(linhaSplit[0]);
                        t.GolsA2J4.setText(linhaSplit[1]);
                    }
                    if(nLinha == 5){
                        t.GolsA4J5.setText(linhaSplit[0]);
                        t.GolsA1J5.setText(linhaSplit[1]);
                    }
                    if(nLinha == 6){
                        t.GolsA2J6.setText(linhaSplit[0]);
                        t.GolsA3J6.setText(linhaSplit[1]);
                    }
                    //Grupo B
                    if(nLinha == 7){
                        t.GolsB1J1.setText(linhaSplit[0]);
                        t.GolsB2J1.setText(linhaSplit[1]);
                    }
                    if(nLinha == 8){
                        t.GolsB3J2.setText(linhaSplit[0]);
                        t.GolsB4J2.setText(linhaSplit[1]);
                    }
                    if(nLinha == 9){
                        t.GolsB1J3.setText(linhaSplit[0]);
                        t.GolsB3J3.setText(linhaSplit[1]);
                    }
                    if(nLinha == 10){
                        t.GolsB4J4.setText(linhaSplit[0]);
                        t.GolsB2J4.setText(linhaSplit[1]);
                    }
                    if(nLinha ==11){
                        t.GolsB4J5.setText(linhaSplit[0]);
                        t.GolsB1J5.setText(linhaSplit[1]);
                    }
                    if(nLinha ==12){
                        t.GolsB2J6.setText(linhaSplit[0]);
                        t.GolsB3J6.setText(linhaSplit[1]);
                    }
                    //Grupo C
                    if(nLinha ==13){
                        t.GolsC1J1.setText(linhaSplit[0]);
                        t.GolsC2J1.setText(linhaSplit[1]);
                    }
                    if(nLinha ==14){
                        t.GolsC3J2.setText(linhaSplit[0]);
                        t.GolsC4J2.setText(linhaSplit[1]);
                    }
                    if(nLinha ==15){
                        t.GolsC1J3.setText(linhaSplit[0]);
                        t.GolsC3J3.setText(linhaSplit[1]);
                    }
                    if(nLinha ==16){
                        t.GolsC4J4.setText(linhaSplit[0]);
                        t.GolsC2J4.setText(linhaSplit[1]);
                    }
                    if(nLinha ==17){
                        t.GolsC4J5.setText(linhaSplit[0]);
                        t.GolsC1J5.setText(linhaSplit[1]);
                    }
                    if(nLinha ==18){
                        t.GolsC2J6.setText(linhaSplit[0]);
                        t.GolsC3J6.setText(linhaSplit[1]);
                    }
                    //Grupo D
                    if(nLinha ==19){
                        t.GolsD1J1.setText(linhaSplit[0]);
                        t.GolsD2J1.setText(linhaSplit[1]);
                    }
                    if(nLinha ==20){
                        t.GolsD3J2.setText(linhaSplit[0]);
                        t.GolsD4J2.setText(linhaSplit[1]);
                    }
                    if(nLinha ==21){
                        t.GolsD1J3.setText(linhaSplit[0]);
                        t.GolsD3J3.setText(linhaSplit[1]);
                    }
                    if(nLinha ==22){
                        t.GolsD4J4.setText(linhaSplit[0]);
                        t.GolsD2J4.setText(linhaSplit[1]);
                    }
                    if(nLinha ==23){
                        t.GolsD4J5.setText(linhaSplit[0]);
                        t.GolsD1J5.setText(linhaSplit[1]);
                    }
                    if(nLinha ==24){
                        t.GolsD2J6.setText(linhaSplit[0]);
                        t.GolsD3J6.setText(linhaSplit[1]);
                    }
                    //Grupo E
                    if(nLinha ==25){
                        t.GolsE1J1.setText(linhaSplit[0]);
                        t.GolsE2J1.setText(linhaSplit[1]);
                    }
                    if(nLinha ==26){
                        t.GolsE3J2.setText(linhaSplit[0]);
                        t.GolsE4J2.setText(linhaSplit[1]);
                    }
                    if(nLinha ==27){
                        t.GolsE1J3.setText(linhaSplit[0]);
                        t.GolsE3J3.setText(linhaSplit[1]);
                    }
                    if(nLinha ==28){
                        t.GolsE4J4.setText(linhaSplit[0]);
                        t.GolsE2J4.setText(linhaSplit[1]);
                    }
                    if(nLinha ==29){
                        t.GolsE4J5.setText(linhaSplit[0]);
                        t.GolsE1J5.setText(linhaSplit[1]);
                    }
                    if(nLinha ==30){
                        t.GolsE2J6.setText(linhaSplit[0]);
                        t.GolsE3J6.setText(linhaSplit[1]);
                    }
                    //Grupo F
                    if(nLinha ==31){
                        t.GolsF1J1.setText(linhaSplit[0]);
                        t.GolsF2J1.setText(linhaSplit[1]);
                    }
                    if(nLinha ==32){
                        t.GolsF3J2.setText(linhaSplit[0]);
                        t.GolsF4J2.setText(linhaSplit[1]);
                    }
                    if(nLinha ==33){
                        t.GolsF1J3.setText(linhaSplit[0]);
                        t.GolsF3J3.setText(linhaSplit[1]);
                    }
                    if(nLinha ==34){
                        t.GolsF4J4.setText(linhaSplit[0]);
                        t.GolsF2J4.setText(linhaSplit[1]);
                    }
                    if(nLinha ==35){
                        t.GolsF4J5.setText(linhaSplit[0]);
                        t.GolsF1J5.setText(linhaSplit[1]);
                    }
                    if(nLinha ==36){
                        t.GolsF2J6.setText(linhaSplit[0]);
                        t.GolsF3J6.setText(linhaSplit[1]);
                    }
                    //Grupo G
                    if(nLinha ==37){
                        t.GolsG1J1.setText(linhaSplit[0]);
                        t.GolsG2J1.setText(linhaSplit[1]);
                    }
                    if(nLinha ==38){
                        t.GolsG3J2.setText(linhaSplit[0]);
                        t.GolsG4J2.setText(linhaSplit[1]);
                    }
                    if(nLinha ==39){
                        t.GolsG1J3.setText(linhaSplit[0]);
                        t.GolsG3J3.setText(linhaSplit[1]);
                    }
                    if(nLinha ==40){
                        t.GolsG4J4.setText(linhaSplit[0]);
                        t.GolsG2J4.setText(linhaSplit[1]);
                    }
                    if(nLinha ==41){
                        t.GolsG4J5.setText(linhaSplit[0]);
                        t.GolsG1J5.setText(linhaSplit[1]);
                    }
                    if(nLinha ==42){
                        t.GolsG2J6.setText(linhaSplit[0]);
                        t.GolsG3J6.setText(linhaSplit[1]);
                    }
                    //Grupo H
                    if(nLinha ==43){
                        t.GolsH1J1.setText(linhaSplit[0]);
                        t.GolsH2J1.setText(linhaSplit[1]);
                    }
                    if(nLinha ==44){
                        t.GolsH3J2.setText(linhaSplit[0]);
                        t.GolsH4J2.setText(linhaSplit[1]);
                    }
                    if(nLinha ==45){
                        t.GolsH1J3.setText(linhaSplit[0]);
                        t.GolsH3J3.setText(linhaSplit[1]);
                    }
                    if(nLinha ==46){
                        t.GolsH4J4.setText(linhaSplit[0]);
                        t.GolsH2J4.setText(linhaSplit[1]);
                    }
                    if(nLinha ==47){
                        t.GolsH4J5.setText(linhaSplit[0]);
                        t.GolsH1J5.setText(linhaSplit[1]);
                    }
                    if(nLinha ==48){
                        t.GolsH2J6.setText(linhaSplit[0]);
                        t.GolsH3J6.setText(linhaSplit[1]);
                    }
                    //Oitavas
                    if(nLinha ==49){
                        t.GfstA.setText(linhaSplit[0]);
                        t.GsndB.setText(linhaSplit[1]);
                        t.PfstA.setText(linhaSplit[2]);
                        t.PsndB.setText(linhaSplit[3]);
                    }
                    if(nLinha ==50){
                        t.GfstC.setText(linhaSplit[0]);
                        t.GsndD.setText(linhaSplit[1]);
                        t.PfstC.setText(linhaSplit[2]);
                        t.PsndD.setText(linhaSplit[3]);

                    }
                    if(nLinha ==51){
                        t.GfstE.setText(linhaSplit[0]);
                        t.GsndF.setText(linhaSplit[1]);
                        t.PfstE.setText(linhaSplit[2]);
                        t.PsndF.setText(linhaSplit[3]);
                    }
                    if(nLinha ==52){
                        t.GfstG.setText(linhaSplit[0]);
                        t.GsndH.setText(linhaSplit[1]);
                        t.PfstG.setText(linhaSplit[2]);
                        t.PsndH.setText(linhaSplit[3]);
                    }
                    if(nLinha ==53){
                        t.GfstB.setText(linhaSplit[0]);
                        t.GsndA.setText(linhaSplit[1]);
                        t.PfstB.setText(linhaSplit[2]);
                        t.PsndA.setText(linhaSplit[3]);
                    }
                    if(nLinha ==54){
                        t.GfstD.setText(linhaSplit[0]);
                        t.GsndC.setText(linhaSplit[1]);
                        t.PfstD.setText(linhaSplit[2]);
                        t.PsndC.setText(linhaSplit[3]);

                    }
                    if(nLinha ==55){
                        t.GfstF.setText(linhaSplit[0]);
                        t.GsndE.setText(linhaSplit[1]);
                        t.PfstF.setText(linhaSplit[2]);
                        t.PsndE.setText(linhaSplit[3]);
                    }
                    if(nLinha ==56){
                        t.GfstH.setText(linhaSplit[0]);
                        t.GsndG.setText(linhaSplit[1]);
                        t.PfstH.setText(linhaSplit[2]);
                        t.PsndG.setText(linhaSplit[3]);
                    }
                    //Quartas
                    if(nLinha ==57){
                        t.Gvo1.setText(linhaSplit[0]);
                        t.Gvo2.setText(linhaSplit[1]);
                        t.Pvo1.setText(linhaSplit[2]);
                        t.Pvo2.setText(linhaSplit[3]);
                    }
                    if(nLinha ==58){
                        t.Gvo3.setText(linhaSplit[0]);
                        t.Gvo4.setText(linhaSplit[1]);
                        t.Pvo3.setText(linhaSplit[2]);
                        t.Pvo4.setText(linhaSplit[3]);
                    }
                    if(nLinha ==59){
                        t.Gvo5.setText(linhaSplit[0]);
                        t.Gvo6.setText(linhaSplit[1]);
                        t.Pvo5.setText(linhaSplit[2]);
                        t.Pvo6.setText(linhaSplit[3]);
                    }
                    if(nLinha ==60){
                        t.Gvo7.setText(linhaSplit[0]);
                        t.Gvo8.setText(linhaSplit[1]);
                        t.Pvo7.setText(linhaSplit[2]);
                        t.Pvo8.setText(linhaSplit[3]);
                    }
                    //Semis
                    if(nLinha ==61){
                        t.Gvq1.setText(linhaSplit[0]);
                        t.Gvq2.setText(linhaSplit[1]);
                        t.Pvq1.setText(linhaSplit[2]);
                        t.Pvq2.setText(linhaSplit[3]);
                    }
                    if(nLinha ==62){
                        t.Gvq3.setText(linhaSplit[0]);
                        t.Gvq4.setText(linhaSplit[1]);
                        t.Pvq3.setText(linhaSplit[2]);
                        t.Pvq4.setText(linhaSplit[3]);
                    }
                    if(nLinha ==63){
                        t.Gvs1.setText(linhaSplit[0]);
                        t.Gvs2.setText(linhaSplit[1]);
                        t.PenVS1.setText(linhaSplit[2]);
                        t.PenVS2.setText(linhaSplit[3]);
                    }
                    if(nLinha ==64){
                        t.Gps1.setText(linhaSplit[0]);
                        t.Gps2.setText(linhaSplit[1]);
                        t.PenPS1.setText(linhaSplit[2]);
                        t.PenPS2.setText(linhaSplit[3]);
                    }



                }
            }
        }catch (IOException ex){

        }
        t.Tabela();


    }
}
