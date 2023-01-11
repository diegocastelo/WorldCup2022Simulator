
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;



public class Tela extends JFrame{

    private ArrayList<Selecao> grupoa = new ArrayList<>();
    private ArrayList<Selecao> grupob = new ArrayList<>();
    private ArrayList<Selecao> grupoc = new ArrayList<>();
    private ArrayList<Selecao> grupod = new ArrayList<>();
    private ArrayList<Selecao> grupoe = new ArrayList<>();
    private ArrayList<Selecao> grupof = new ArrayList<>();
    private ArrayList<Selecao> grupog = new ArrayList<>();
    private ArrayList<Selecao> grupoh = new ArrayList<>();
    Selecao catar = new Selecao("Catar",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao equador = new Selecao("Equador",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao senegal = new Selecao("Senegal",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao holanda = new Selecao("Holanda",  0 , 0, 0, 0 ,0, 0, 0);

    Selecao inglaterra = new Selecao("Inglaterra",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao iran = new Selecao("Iran",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao eua = new Selecao("Estados Unidos",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao gales = new Selecao("País de Gales",  0 , 0, 0, 0 ,0, 0, 0);

    Selecao argentina = new Selecao("Argentina",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao arabia = new Selecao("Arábia Saudita",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao mexico = new Selecao("México",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao polonia = new Selecao("Polônia",  0 , 0, 0, 0 ,0, 0, 0);

    Selecao franca = new Selecao("França",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao australia = new Selecao("Austrália",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao dinamarca = new Selecao("Dinamarca",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao tunisia = new Selecao("Tunísia",  0 , 0, 0, 0 ,0, 0, 0);

    Selecao espanha = new Selecao("Espanha",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao costa = new Selecao("Costa Rica",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao alemanha = new Selecao("Alemanha",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao japao = new Selecao("Japão",  0 , 0, 0, 0 ,0, 0, 0);

    Selecao belgica = new Selecao("Bélgica",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao canada = new Selecao("Canadá",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao marrocos = new Selecao("Marrocos",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao croacia = new Selecao("Croácia",  0 , 0, 0, 0 ,0, 0, 0);

    Selecao brasil = new Selecao("Brasil",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao servia = new Selecao("Sérvia",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao suica = new Selecao("Suíça",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao camaroes = new Selecao("Camarões",  0 , 0, 0, 0 ,0, 0, 0);

    Selecao portugal = new Selecao("Portugal",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao gana = new Selecao("Gana",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao uruguai = new Selecao("Uruguai",  0 , 0, 0, 0 ,0, 0, 0);
    Selecao coreia = new Selecao("Coreia do Sul",  0 , 0, 0, 0 ,0, 0, 0);




    Ordenacao ordenacao = new Ordenacao();
    private JTabbedPane Grupos;
    private JPanel Copa;
    public JTextField GolsA1J1;
    public JTextField GolsA2J1;
    public JTextField GolsA3J2;
    public JTextField GolsA4J2;
    public JTextField GolsA1J3;
    public JTextField GolsA3J3;
    public JTextField GolsA2J4;
    public JTextField GolsA4J4;
    public JTextField GolsA1J5;
    public JTextField GolsA4J5;
    public JTextField GolsA3J6;
    public JTextField GolsA2J6;

    private JButton salvarButtonA;
    private JLabel T1A;
    private JLabel T2A;
    private JLabel T3A;
    private JLabel T4A;
    private JPanel GrupoA;
    private JLabel P1A;
    private JLabel S1A;
    private JLabel G1A;
    private JLabel P2A;
    private JLabel S2A;
    private JLabel G2A;
    private JLabel P3A;
    private JLabel S3A;
    private JLabel G3A;
    private JLabel P4A;
    private JLabel S4A;
    private JLabel G4A;
    private JPanel GrupoB;
    public JTextField GolsB1J1;
    public JTextField GolsB3J2;
    public JTextField GolsB4J2;
    public JTextField GolsB1J3;
    public JTextField GolsB3J3;
    public JTextField GolsB2J4;
    public JTextField GolsB4J4;
    public JTextField GolsB1J5;
    public JTextField GolsB4J5;
    public JTextField GolsB3J6;
    public JTextField GolsB2J6;
    public JTextField GolsB2J1;
    private JButton salvarButtonB;
    private JPanel GrupoC;
    public JTextField GolsC1J1;
    public JTextField GolsC3J2;
    public JTextField GolsC4J2;
    public JTextField GolsC1J3;
    public JTextField GolsC3J3;
    public JTextField GolsC2J4;
    public JTextField GolsC4J4;
    public JTextField GolsC1J5;
    public JTextField GolsC4J5;
    public JTextField GolsC3J6;
    public JTextField GolsC2J6;
    public JTextField GolsC2J1;
    private JButton salvarButtonC;
    private JPanel GrupoD;
    public JTextField GolsD1J1;
    public JTextField GolsD3J2;
    public JTextField GolsD4J2;
    public JTextField GolsD1J3;
    public JTextField GolsD3J3;
    public JTextField GolsD2J4;
    public JTextField GolsD4J4;
    public JTextField GolsD1J5;
    public JTextField GolsD4J5;
    public JTextField GolsD3J6;
    public JTextField GolsD2J6;
    public JTextField GolsD2J1;
    private JButton salvarButtonD;
    private JPanel GrupoE;
    public JTextField GolsE1J1;
    public JTextField GolsE3J2;
    public JTextField GolsE4J2;
    public JTextField GolsE1J3;
    public JTextField GolsE3J3;
    public JTextField GolsE2J4;
    public JTextField GolsE4J4;
    public JTextField GolsE1J5;
    public JTextField GolsE4J5;
    public JTextField GolsE3J6;
    public JTextField GolsE2J6;
    public JTextField GolsE2J1;
    private JButton salvarButtonE;
    private JPanel GrupoF;
    public JTextField GolsF1J1;
    public JTextField GolsF3J2;
    public JTextField GolsF4J2;
    public JTextField GolsF1J3;
    public JTextField GolsF3J3;
    public JTextField GolsF2J4;
    public JTextField GolsF4J4;
    public JTextField GolsF1J5;
    public JTextField GolsF4J5;
    public JTextField GolsF3J6;
    public JTextField GolsF2J6;
    public JTextField GolsF2J1;
    public JButton salvarButtonF;
    private JPanel GrupoG;
    public JTextField GolsG1J1;
    public JTextField GolsG3J2;
    public JTextField GolsG4J2;
    public JTextField GolsG1J3;
    public JTextField GolsG3J3;
    public JTextField GolsG2J4;
    public JTextField GolsG4J4;
    public JTextField GolsG1J5;
    public JTextField GolsG4J5;
    public JTextField GolsG3J6;
    public JTextField GolsG2J6;
    public JTextField GolsG2J1;
    private JButton salvarButtonG;
    private JPanel GrupoH;
    public JTextField GolsH1J1;
    public JTextField GolsH3J2;
    public JTextField GolsH4J2;
    public JTextField GolsH1J3;
    public JTextField GolsH3J3;
    public JTextField GolsH2J4;
    public JTextField GolsH4J4;
    public JTextField GolsH1J5;
    public JTextField GolsH4J5;
    public JTextField GolsH3J6;
    public JTextField GolsH2J6;
    public JTextField GolsH2J1;
    private JButton salvarButtonH;
    private JPanel Oitavas;
    public JTextField PfstF;
    public JTextField PsndE;
    public JTextField PsndG;
    public JTextField PfstH;
    private JPanel Quartas;
    private JPanel Semi;
    public JTextField Gvo2;
    public JTextField Gvo4;
    public JTextField Gvo6;
    public JTextField Gvo8;
    public JTextField Gvo1;
    public JTextField Gvo3;
    public JTextField Gvo5;
    public JTextField Gvo7;
    public JTextField Gvq2;
    public JTextField Gvq4;
    public JTextField Gvq1;
    public JTextField Gvs1;
    public JTextField Gps1;
    public JTextField Gvs2;
    public JTextField Gps2;
    public JTextField GsndB;
    public JTextField GsndD;
    public JTextField GsndF;
    public JTextField GsndH;
    public JTextField GsndA;
    public JTextField GsndC;
    public JTextField GsndE;
    public JTextField GsndG;
    public JTextField GfstA;
    public JTextField GfstC;
    public JTextField GfstE;
    public JTextField GfstG;
    public JTextField GfstB;
    public JTextField GfstD;
    public JTextField GfstF;
    public JTextField GfstH;
    private JPanel Finais;
    private JPanel Ranking;
    private JLabel fstA;
    private JLabel fstC;
    private JLabel fstE;
    private JLabel fstG;
    private JLabel fstD;
    private JLabel sndB;
    private JLabel sndD;
    private JLabel sndF;
    private JLabel sndH;
    private JLabel sndA;
    private JLabel sndC;
    private JLabel fstB;
    private JLabel fstF;
    private JLabel sndG;
    private JLabel sndE;
    public JTextField PfstA;
    public JTextField PfstC;
    public JTextField PsndD;
    public JTextField PfstE;
    public JTextField PfstG;
    public JTextField PfstB;
    public JTextField PfstD;
    private JLabel fstH;
    public JTextField PsndF;
    public JTextField PsndH;
    public JTextField PsndA;
    public JTextField PsndC;
    private JButton salvarButtonOitavas;
    private JLabel VO1;
    private JLabel VO2;
    private JLabel VO4;
    private JLabel VO6;
    private JLabel VO3;
    private JLabel VO5;
    private JLabel VO7;
    private JLabel VO8;
    public JTextField Pvo1;
    public JTextField Pvo4;
    public JTextField Pvo3;
    public JTextField Pvo6;
    public JTextField Pvo5;
    public JTextField Pvo2;
    public JTextField Pvo7;
    public JTextField Pvo8;
    private JButton salvarButtonQuartas;
    public JTextField Pvq2;
    public JTextField Pvq1;
    public JTextField Pvq3;
    public JTextField Pvq4;
    private JLabel VQ2;
    private JLabel VQ1;
    private JLabel VQ3;
    private JLabel VQ4;
    private JButton salvarButtonSemis;
    private JLabel VS2;
    private JLabel VS1;
    private JLabel PerdedorS1;
    private JLabel PerdedorS2;
    private JButton salvarButtonFinais;
    public JTextField PenVS2;
    public JTextField PenVS1;
    public JTextField PenPS1;
    public JTextField PenPS2;
    private JLabel TimeCampeao;
    private JLabel TimeVice;
    private JLabel TimeTerceiro;
    private JLabel T1B;
    private JLabel T2B;
    private JLabel T3B;
    private JLabel T4B;
    private JLabel P1B;
    private JLabel P2B;
    private JLabel P3B;
    private JLabel P4B;
    private JLabel S1B;
    private JLabel G1B;
    private JLabel G2B;
    private JLabel G3B;
    private JLabel G4B;
    private JLabel S2B;
    private JLabel S3B;
    private JLabel S4B;
    private JLabel T1C;
    private JLabel S2C;
    private JLabel S3C;
    private JLabel S4C;
    private JLabel T2C;
    private JLabel T3C;
    private JLabel T4C;
    private JLabel S1C;
    private JLabel P1C;
    private JLabel P2C;
    private JLabel P3C;
    private JLabel P4C;
    private JLabel G1C;
    private JLabel G2C;
    private JLabel G3C;
    private JLabel G4C;
    private JLabel T1D;
    private JLabel T2D;
    private JLabel T3D;
    private JLabel T4D;
    private JLabel P1D;
    private JLabel P2D;
    private JLabel P3D;
    private JLabel P4D;
    private JLabel S1D;
    private JLabel S2D;
    private JLabel S3D;
    private JLabel S4D;
    private JLabel G1D;
    private JLabel G2D;
    private JLabel G3D;
    private JLabel G4D;
    private JLabel G4E;
    private JLabel G1E;
    private JLabel G2E;
    private JLabel G3E;
    private JLabel T1E;
    private JLabel T2E;
    private JLabel T3E;
    private JLabel T4E;
    private JLabel P1E;
    private JLabel P2E;
    private JLabel P3E;
    private JLabel P4E;
    private JLabel S4E;
    private JLabel S1E;
    private JLabel S2E;
    private JLabel S3E;
    private JLabel T1F;
    private JLabel T2F;
    private JLabel T3F;
    private JLabel T4F;
    private JLabel P1F;
    private JLabel P2F;
    private JLabel P3F;
    private JLabel P4F;
    private JLabel S1F;
    private JLabel S2F;
    private JLabel S3F;
    private JLabel S4F;
    private JLabel G1F;
    private JLabel G2F;
    private JLabel G3F;
    private JLabel G4F;
    private JLabel G1G;
    private JLabel G2G;
    private JLabel G3G;
    private JLabel G4G;
    private JLabel T1G;
    private JLabel T2G;
    private JLabel T3G;
    private JLabel T4G;
    private JLabel P1G;
    private JLabel P2G;
    private JLabel P3G;
    private JLabel P4G;
    private JLabel S1G;
    private JLabel S2G;
    private JLabel S3G;
    private JLabel S4G;
    private JLabel S1H;
    private JLabel S2H;
    private JLabel S4H;
    private JLabel S3H;
    private JLabel T1H;
    private JLabel T2H;
    private JLabel T3H;
    private JLabel T4H;
    private JLabel P2H;
    private JLabel P1H;
    private JLabel P3H;
    private JLabel P4H;
    private JLabel G4H;
    private JLabel G3H;
    private JLabel G2H;
    private JLabel G1H;
    public JTextField PsndB;

    public JTextField Gvq3;

    public Tela() throws IOException {
    }


    public void Tabela(){
        montarTabela();
        add(BorderLayout.CENTER,Grupos);
        //GrupoA.setBackground(Color.BLUE);

    }
    private void montarTabela(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(800, 600);
        salvarButtonA.addActionListener(this::botaoA);
        salvarButtonB.addActionListener(this::botaoB);
        salvarButtonC.addActionListener(this::botaoC);
        salvarButtonD.addActionListener(this::botaoD);
        salvarButtonE.addActionListener(this::botaoE);
        salvarButtonF.addActionListener(this::botaoF);
        salvarButtonG.addActionListener(this::botaoG);
        salvarButtonH.addActionListener(this::botaoH);
        salvarButtonOitavas.addActionListener(this::botaoOitavas);
        salvarButtonQuartas.addActionListener(this::botaoQuartas);
        salvarButtonSemis.addActionListener(this::botaoSemis);
        salvarButtonFinais.addActionListener(this::botaoFinais);



    }

    private void botaoA(ActionEvent e) {
        JOptionPane.showMessageDialog(null,
                "Resultados Salvos", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        montaGrupoA();
        File arquivo = new File("C:/Users/diego/Desktop/WC/tabelaCopa.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(arquivo);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write(GolsA1J1.getText() + ";"+ GolsA2J1.getText());
            bw.newLine();
            bw.write(GolsA3J2.getText() + ";" + GolsA4J2.getText());
            bw.newLine();
            bw.write(GolsA1J3.getText() + ";" + GolsA3J3.getText());
            bw.newLine();
            bw.write(GolsA4J4.getText() + ";" + GolsA2J4.getText());
            bw.newLine();
            bw.write(GolsA4J5.getText() + ";" + GolsA1J5.getText());
            bw.newLine();
            bw.write(GolsA2J6.getText() + ";" + GolsA3J6.getText());
            bw.newLine();
            bw.write(GolsB1J1.getText() + ";"+ GolsB2J1.getText());
            bw.newLine();
            bw.write(GolsB3J2.getText() + ";" + GolsB4J2.getText());
            bw.newLine();
            bw.write(GolsB1J3.getText() + ";" + GolsB3J3.getText());
            bw.newLine();
            bw.write(GolsB4J4.getText() + ";" + GolsB2J4.getText() );
            bw.newLine();
            bw.write(GolsB4J5.getText() + ";" + GolsB1J5.getText());
            bw.newLine();
            bw.write(GolsB2J6.getText() + ";" + GolsB3J6.getText());
            bw.newLine();
            bw.write(GolsC1J1.getText() + ";"+ GolsC2J1.getText());
            bw.newLine();
            bw.write(GolsC3J2.getText() + ";" + GolsC4J2.getText() );
            bw.newLine();
            bw.write(GolsC1J3.getText() + ";" + GolsC3J3.getText());
            bw.newLine();
            bw.write(GolsC4J4.getText() + ";" + GolsC2J4.getText());
            bw.newLine();
            bw.write(GolsC4J5.getText() + ";" + GolsC1J5.getText() );
            bw.newLine();
            bw.write(GolsC2J6.getText() + ";" + GolsC3J6.getText() );
            bw.newLine();
            bw.write(GolsD1J1.getText() + ";"+ GolsD2J1.getText() );
            bw.newLine();
            bw.write(GolsD3J2.getText() + ";" + GolsD4J2.getText());
            bw.newLine();
            bw.write(GolsD1J3.getText() + ";" + GolsD3J3.getText());
            bw.newLine();
            bw.write(GolsD4J4.getText() + ";" + GolsD2J4.getText() );
            bw.newLine();
            bw.write(GolsD4J5.getText() + ";" + GolsD1J5.getText() );
            bw.newLine();
            bw.write(GolsD2J6.getText() + ";" + GolsD3J6.getText());
            bw.newLine();
            bw.write(GolsE1J1.getText() + ";"+ GolsE2J1.getText() );
            bw.newLine();
            bw.write(GolsE3J2.getText() + ";" + GolsE4J2.getText());
            bw.newLine();
            bw.write(GolsE1J3.getText() + ";" + GolsE3J3.getText() );
            bw.newLine();
            bw.write(GolsE4J4.getText() + ";" + GolsE2J4.getText() );
            bw.newLine();
            bw.write(GolsE4J5.getText() + ";" + GolsE1J5.getText());
            bw.newLine();
            bw.write(GolsE2J6.getText() + ";" + GolsE3J6.getText() );
            bw.newLine();
            bw.write(GolsF1J1.getText() + ";"+ GolsF2J1.getText() );
            bw.newLine();
            bw.write(GolsF3J2.getText() + ";" + GolsF4J2.getText() );
            bw.newLine();
            bw.write(GolsF1J3.getText() + ";" + GolsF3J3.getText() );
            bw.newLine();
            bw.write(GolsF4J4.getText() + ";" + GolsF2J4.getText() );
            bw.newLine();
            bw.write(GolsF4J5.getText() + ";" + GolsF1J5.getText() );
            bw.newLine();
            bw.write(GolsF2J6.getText() + ";" + GolsF3J6.getText() );
            bw.newLine();
            bw.write(GolsG1J1.getText() + ";"+ GolsG2J1.getText() );
            bw.newLine();
            bw.write(GolsG3J2.getText() + ";" + GolsG4J2.getText() );
            bw.newLine();
            bw.write(GolsG1J3.getText() + ";" + GolsG3J3.getText() );
            bw.newLine();
            bw.write(GolsG4J4.getText() + ";" + GolsG2J4.getText() );
            bw.newLine();
            bw.write(GolsG4J5.getText() + ";" + GolsG1J5.getText() );
            bw.newLine();
            bw.write(GolsG2J6.getText() + ";" + GolsG3J6.getText() );
            bw.newLine();
            bw.write(GolsH1J1.getText() + ";"+ GolsH2J1.getText());
            bw.newLine();
            bw.write(GolsH3J2.getText() + ";" + GolsH4J2.getText());
            bw.newLine();
            bw.write(GolsH1J3.getText() + ";" + GolsH3J3.getText());
            bw.newLine();
            bw.write(GolsH4J4.getText() + ";" + GolsH2J4.getText() );
            bw.newLine();
            bw.write(GolsH4J5.getText() + ";" + GolsH1J5.getText());
            bw.newLine();
            bw.write(GolsH2J6.getText() + ";" + GolsH3J6.getText() );
            bw.newLine();
            //Oitavas:
            bw.write(GfstA.getText() + ";" + GsndB.getText() + ";" + PfstA.getText() + ";" + PsndB.getText());
            bw.newLine();
            bw.write(GfstC.getText() + ";" + GsndD.getText() + ";" + PfstC.getText() + ";" + PsndD.getText());
            bw.newLine();
            bw.write(GfstE.getText() + ";" + GsndF.getText() + ";" + PfstE.getText() + ";" + PsndE.getText());
            bw.newLine();
            bw.write(GfstG.getText() + ";" + GsndH.getText() + ";" + PfstG.getText() + ";" + PsndH.getText() );
            bw.newLine();
            bw.write(GfstB.getText() + ";" + GsndA.getText() + ";" + PfstB.getText() + ";" + PsndA.getText() );
            bw.newLine();
            bw.write(GfstD.getText() + ";" + GsndC.getText() + ";" + PfstD.getText() + ";" + PsndC.getText() );
            bw.newLine();
            bw.write(GfstF.getText() + ";" + GsndE.getText() + ";" + PfstF.getText() + ";" + PsndF.getText());
            bw.newLine();
            bw.write(GfstH.getText() + ";" + GsndG.getText() + ";" + PfstH.getText() + ";" + PsndG.getText());
            bw.newLine();
            //Quartas
            bw.write(Gvo1.getText() + ";" + Gvo2.getText() + ";" + Pvo1.getText() + ";" + Pvo2.getText() );
            bw.newLine();
            bw.write(Gvo3.getText() + ";" + Gvo4.getText() + ";" + Pvo3.getText() + ";" + Pvo4.getText());
            bw.newLine();
            bw.write(Gvo5.getText() + ";" + Gvo6.getText() + ";" + Pvo5.getText() + ";" + Pvo6.getText() );
            bw.newLine();
            bw.write(Gvo7.getText() + ";" + Gvo8.getText() + ";" + Pvo7.getText() + ";" + Pvo8.getText() );
            bw.newLine();
            //Semis
            bw.write(Gvq1.getText() + ";" + Gvq2.getText() + ";" + Pvq1.getText() + ";" + Pvq2.getText() );
            bw.newLine();
            bw.write(Gvq3.getText() + ";" + Gvq4.getText() + ";" + Pvq3.getText() + ";" + Pvq4.getText());
            bw.newLine();
            //Finais
            bw.write(Gps1.getText() + ";" + Gps2.getText() + ";" + PenPS1.getText() + ";" + PenPS2.getText());
            bw.newLine();

            bw.write(Gvs1.getText() + ";" + Gvs2.getText() + ";" + PenVS1.getText() + ";" + PenVS2.getText());


        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            bw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }
    private void botaoB(ActionEvent e) {
        JOptionPane.showMessageDialog(null,
                "Resultados Salvos", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        montaGrupoB();
        File arquivo = new File("C:/Users/diego/Desktop/WC/tabelaCopa.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(arquivo);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write(GolsA1J1.getText() + ";"+ GolsA2J1.getText());
            bw.newLine();
            bw.write(GolsA3J2.getText() + ";" + GolsA4J2.getText());
            bw.newLine();
            bw.write(GolsA1J3.getText() + ";" + GolsA3J3.getText());
            bw.newLine();
            bw.write(GolsA4J4.getText() + ";" + GolsA2J4.getText());
            bw.newLine();
            bw.write(GolsA4J5.getText() + ";" + GolsA1J5.getText());
            bw.newLine();
            bw.write(GolsA2J6.getText() + ";" + GolsA3J6.getText());
            bw.newLine();
            bw.write(GolsB1J1.getText() + ";"+ GolsB2J1.getText());
            bw.newLine();
            bw.write(GolsB3J2.getText() + ";" + GolsB4J2.getText());
            bw.newLine();
            bw.write(GolsB1J3.getText() + ";" + GolsB3J3.getText());
            bw.newLine();
            bw.write(GolsB4J4.getText() + ";" + GolsB2J4.getText() );
            bw.newLine();
            bw.write(GolsB4J5.getText() + ";" + GolsB1J5.getText());
            bw.newLine();
            bw.write(GolsB2J6.getText() + ";" + GolsB3J6.getText());
            bw.newLine();
            bw.write(GolsC1J1.getText() + ";"+ GolsC2J1.getText());
            bw.newLine();
            bw.write(GolsC3J2.getText() + ";" + GolsC4J2.getText() );
            bw.newLine();
            bw.write(GolsC1J3.getText() + ";" + GolsC3J3.getText());
            bw.newLine();
            bw.write(GolsC4J4.getText() + ";" + GolsC2J4.getText());
            bw.newLine();
            bw.write(GolsC4J5.getText() + ";" + GolsC1J5.getText() );
            bw.newLine();
            bw.write(GolsC2J6.getText() + ";" + GolsC3J6.getText() );
            bw.newLine();
            bw.write(GolsD1J1.getText() + ";"+ GolsD2J1.getText() );
            bw.newLine();
            bw.write(GolsD3J2.getText() + ";" + GolsD4J2.getText());
            bw.newLine();
            bw.write(GolsD1J3.getText() + ";" + GolsD3J3.getText());
            bw.newLine();
            bw.write(GolsD4J4.getText() + ";" + GolsD2J4.getText() );
            bw.newLine();
            bw.write(GolsD4J5.getText() + ";" + GolsD1J5.getText() );
            bw.newLine();
            bw.write(GolsD2J6.getText() + ";" + GolsD3J6.getText());
            bw.newLine();
            bw.write(GolsE1J1.getText() + ";"+ GolsE2J1.getText() );
            bw.newLine();
            bw.write(GolsE3J2.getText() + ";" + GolsE4J2.getText());
            bw.newLine();
            bw.write(GolsE1J3.getText() + ";" + GolsE3J3.getText() );
            bw.newLine();
            bw.write(GolsE4J4.getText() + ";" + GolsE2J4.getText() );
            bw.newLine();
            bw.write(GolsE4J5.getText() + ";" + GolsE1J5.getText());
            bw.newLine();
            bw.write(GolsE2J6.getText() + ";" + GolsE3J6.getText() );
            bw.newLine();
            bw.write(GolsF1J1.getText() + ";"+ GolsF2J1.getText() );
            bw.newLine();
            bw.write(GolsF3J2.getText() + ";" + GolsF4J2.getText() );
            bw.newLine();
            bw.write(GolsF1J3.getText() + ";" + GolsF3J3.getText() );
            bw.newLine();
            bw.write(GolsF4J4.getText() + ";" + GolsF2J4.getText() );
            bw.newLine();
            bw.write(GolsF4J5.getText() + ";" + GolsF1J5.getText() );
            bw.newLine();
            bw.write(GolsF2J6.getText() + ";" + GolsF3J6.getText() );
            bw.newLine();
            bw.write(GolsG1J1.getText() + ";"+ GolsG2J1.getText() );
            bw.newLine();
            bw.write(GolsG3J2.getText() + ";" + GolsG4J2.getText() );
            bw.newLine();
            bw.write(GolsG1J3.getText() + ";" + GolsG3J3.getText() );
            bw.newLine();
            bw.write(GolsG4J4.getText() + ";" + GolsG2J4.getText() );
            bw.newLine();
            bw.write(GolsG4J5.getText() + ";" + GolsG1J5.getText() );
            bw.newLine();
            bw.write(GolsG2J6.getText() + ";" + GolsG3J6.getText() );
            bw.newLine();
            bw.write(GolsH1J1.getText() + ";"+ GolsH2J1.getText());
            bw.newLine();
            bw.write(GolsH3J2.getText() + ";" + GolsH4J2.getText());
            bw.newLine();
            bw.write(GolsH1J3.getText() + ";" + GolsH3J3.getText());
            bw.newLine();
            bw.write(GolsH4J4.getText() + ";" + GolsH2J4.getText() );
            bw.newLine();
            bw.write(GolsH4J5.getText() + ";" + GolsH1J5.getText());
            bw.newLine();
            bw.write(GolsH2J6.getText() + ";" + GolsH3J6.getText() );
            bw.newLine();
            //Oitavas:
            bw.write(GfstA.getText() + ";" + GsndB.getText() + ";" + PfstA.getText() + ";" + PsndB.getText());
            bw.newLine();
            bw.write(GfstC.getText() + ";" + GsndD.getText() + ";" + PfstC.getText() + ";" + PsndD.getText());
            bw.newLine();
            bw.write(GfstE.getText() + ";" + GsndF.getText() + ";" + PfstE.getText() + ";" + PsndE.getText());
            bw.newLine();
            bw.write(GfstG.getText() + ";" + GsndH.getText() + ";" + PfstG.getText() + ";" + PsndH.getText() );
            bw.newLine();
            bw.write(GfstB.getText() + ";" + GsndA.getText() + ";" + PfstB.getText() + ";" + PsndA.getText() );
            bw.newLine();
            bw.write(GfstD.getText() + ";" + GsndC.getText() + ";" + PfstD.getText() + ";" + PsndC.getText() );
            bw.newLine();
            bw.write(GfstF.getText() + ";" + GsndE.getText() + ";" + PfstF.getText() + ";" + PsndF.getText());
            bw.newLine();
            bw.write(GfstH.getText() + ";" + GsndG.getText() + ";" + PfstH.getText() + ";" + PsndG.getText());
            bw.newLine();
            //Quartas
            bw.write(Gvo1.getText() + ";" + Gvo2.getText() + ";" + Pvo1.getText() + ";" + Pvo2.getText() );
            bw.newLine();
            bw.write(Gvo3.getText() + ";" + Gvo4.getText() + ";" + Pvo3.getText() + ";" + Pvo4.getText());
            bw.newLine();
            bw.write(Gvo5.getText() + ";" + Gvo6.getText() + ";" + Pvo5.getText() + ";" + Pvo6.getText() );
            bw.newLine();
            bw.write(Gvo7.getText() + ";" + Gvo8.getText() + ";" + Pvo7.getText() + ";" + Pvo8.getText() );
            bw.newLine();
            //Semis
            bw.write(Gvq1.getText() + ";" + Gvq2.getText() + ";" + Pvq1.getText() + ";" + Pvq2.getText() );
            bw.newLine();
            bw.write(Gvq3.getText() + ";" + Gvq4.getText() + ";" + Pvq3.getText() + ";" + Pvq4.getText());
            bw.newLine();
            //Finais
            bw.write(Gps1.getText() + ";" + Gps2.getText() + ";" + PenPS1.getText() + ";" + PenPS2.getText());
            bw.newLine();

            bw.write(Gvs1.getText() + ";" + Gvs2.getText() + ";" + PenVS1.getText() + ";" + PenVS2.getText());


        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            bw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    private void botaoC(ActionEvent e) {
        JOptionPane.showMessageDialog(null,
                "Resultados Salvos", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        montaGrupoC();
        File arquivo = new File("C:/Users/diego/Desktop/WC/tabelaCopa.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(arquivo);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write(GolsA1J1.getText() + ";"+ GolsA2J1.getText());
            bw.newLine();
            bw.write(GolsA3J2.getText() + ";" + GolsA4J2.getText());
            bw.newLine();
            bw.write(GolsA1J3.getText() + ";" + GolsA3J3.getText());
            bw.newLine();
            bw.write(GolsA4J4.getText() + ";" + GolsA2J4.getText());
            bw.newLine();
            bw.write(GolsA4J5.getText() + ";" + GolsA1J5.getText());
            bw.newLine();
            bw.write(GolsA2J6.getText() + ";" + GolsA3J6.getText());
            bw.newLine();
            bw.write(GolsB1J1.getText() + ";"+ GolsB2J1.getText());
            bw.newLine();
            bw.write(GolsB3J2.getText() + ";" + GolsB4J2.getText());
            bw.newLine();
            bw.write(GolsB1J3.getText() + ";" + GolsB3J3.getText());
            bw.newLine();
            bw.write(GolsB4J4.getText() + ";" + GolsB2J4.getText() );
            bw.newLine();
            bw.write(GolsB4J5.getText() + ";" + GolsB1J5.getText());
            bw.newLine();
            bw.write(GolsB2J6.getText() + ";" + GolsB3J6.getText());
            bw.newLine();
            bw.write(GolsC1J1.getText() + ";"+ GolsC2J1.getText());
            bw.newLine();
            bw.write(GolsC3J2.getText() + ";" + GolsC4J2.getText() );
            bw.newLine();
            bw.write(GolsC1J3.getText() + ";" + GolsC3J3.getText());
            bw.newLine();
            bw.write(GolsC4J4.getText() + ";" + GolsC2J4.getText());
            bw.newLine();
            bw.write(GolsC4J5.getText() + ";" + GolsC1J5.getText() );
            bw.newLine();
            bw.write(GolsC2J6.getText() + ";" + GolsC3J6.getText() );
            bw.newLine();
            bw.write(GolsD1J1.getText() + ";"+ GolsD2J1.getText() );
            bw.newLine();
            bw.write(GolsD3J2.getText() + ";" + GolsD4J2.getText());
            bw.newLine();
            bw.write(GolsD1J3.getText() + ";" + GolsD3J3.getText());
            bw.newLine();
            bw.write(GolsD4J4.getText() + ";" + GolsD2J4.getText() );
            bw.newLine();
            bw.write(GolsD4J5.getText() + ";" + GolsD1J5.getText() );
            bw.newLine();
            bw.write(GolsD2J6.getText() + ";" + GolsD3J6.getText());
            bw.newLine();
            bw.write(GolsE1J1.getText() + ";"+ GolsE2J1.getText() );
            bw.newLine();
            bw.write(GolsE3J2.getText() + ";" + GolsE4J2.getText());
            bw.newLine();
            bw.write(GolsE1J3.getText() + ";" + GolsE3J3.getText() );
            bw.newLine();
            bw.write(GolsE4J4.getText() + ";" + GolsE2J4.getText() );
            bw.newLine();
            bw.write(GolsE4J5.getText() + ";" + GolsE1J5.getText());
            bw.newLine();
            bw.write(GolsE2J6.getText() + ";" + GolsE3J6.getText() );
            bw.newLine();
            bw.write(GolsF1J1.getText() + ";"+ GolsF2J1.getText() );
            bw.newLine();
            bw.write(GolsF3J2.getText() + ";" + GolsF4J2.getText() );
            bw.newLine();
            bw.write(GolsF1J3.getText() + ";" + GolsF3J3.getText() );
            bw.newLine();
            bw.write(GolsF4J4.getText() + ";" + GolsF2J4.getText() );
            bw.newLine();
            bw.write(GolsF4J5.getText() + ";" + GolsF1J5.getText() );
            bw.newLine();
            bw.write(GolsF2J6.getText() + ";" + GolsF3J6.getText() );
            bw.newLine();
            bw.write(GolsG1J1.getText() + ";"+ GolsG2J1.getText() );
            bw.newLine();
            bw.write(GolsG3J2.getText() + ";" + GolsG4J2.getText() );
            bw.newLine();
            bw.write(GolsG1J3.getText() + ";" + GolsG3J3.getText() );
            bw.newLine();
            bw.write(GolsG4J4.getText() + ";" + GolsG2J4.getText() );
            bw.newLine();
            bw.write(GolsG4J5.getText() + ";" + GolsG1J5.getText() );
            bw.newLine();
            bw.write(GolsG2J6.getText() + ";" + GolsG3J6.getText() );
            bw.newLine();
            bw.write(GolsH1J1.getText() + ";"+ GolsH2J1.getText());
            bw.newLine();
            bw.write(GolsH3J2.getText() + ";" + GolsH4J2.getText());
            bw.newLine();
            bw.write(GolsH1J3.getText() + ";" + GolsH3J3.getText());
            bw.newLine();
            bw.write(GolsH4J4.getText() + ";" + GolsH2J4.getText() );
            bw.newLine();
            bw.write(GolsH4J5.getText() + ";" + GolsH1J5.getText());
            bw.newLine();
            bw.write(GolsH2J6.getText() + ";" + GolsH3J6.getText() );
            bw.newLine();
            //Oitavas:
            bw.write(GfstA.getText() + ";" + GsndB.getText() + ";" + PfstA.getText() + ";" + PsndB.getText());
            bw.newLine();
            bw.write(GfstC.getText() + ";" + GsndD.getText() + ";" + PfstC.getText() + ";" + PsndD.getText());
            bw.newLine();
            bw.write(GfstE.getText() + ";" + GsndF.getText() + ";" + PfstE.getText() + ";" + PsndE.getText());
            bw.newLine();
            bw.write(GfstG.getText() + ";" + GsndH.getText() + ";" + PfstG.getText() + ";" + PsndH.getText() );
            bw.newLine();
            bw.write(GfstB.getText() + ";" + GsndA.getText() + ";" + PfstB.getText() + ";" + PsndA.getText() );
            bw.newLine();
            bw.write(GfstD.getText() + ";" + GsndC.getText() + ";" + PfstD.getText() + ";" + PsndC.getText() );
            bw.newLine();
            bw.write(GfstF.getText() + ";" + GsndE.getText() + ";" + PfstF.getText() + ";" + PsndF.getText());
            bw.newLine();
            bw.write(GfstH.getText() + ";" + GsndG.getText() + ";" + PfstH.getText() + ";" + PsndG.getText());
            bw.newLine();
            //Quartas
            bw.write(Gvo1.getText() + ";" + Gvo2.getText() + ";" + Pvo1.getText() + ";" + Pvo2.getText() );
            bw.newLine();
            bw.write(Gvo3.getText() + ";" + Gvo4.getText() + ";" + Pvo3.getText() + ";" + Pvo4.getText());
            bw.newLine();
            bw.write(Gvo5.getText() + ";" + Gvo6.getText() + ";" + Pvo5.getText() + ";" + Pvo6.getText() );
            bw.newLine();
            bw.write(Gvo7.getText() + ";" + Gvo8.getText() + ";" + Pvo7.getText() + ";" + Pvo8.getText() );
            bw.newLine();
            //Semis
            bw.write(Gvq1.getText() + ";" + Gvq2.getText() + ";" + Pvq1.getText() + ";" + Pvq2.getText() );
            bw.newLine();
            bw.write(Gvq3.getText() + ";" + Gvq4.getText() + ";" + Pvq3.getText() + ";" + Pvq4.getText());
            bw.newLine();
            //Finais
            bw.write(Gps1.getText() + ";" + Gps2.getText() + ";" + PenPS1.getText() + ";" + PenPS2.getText());
            bw.newLine();

            bw.write(Gvs1.getText() + ";" + Gvs2.getText() + ";" + PenVS1.getText() + ";" + PenVS2.getText());


        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            bw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    private void botaoD(ActionEvent e) {
        JOptionPane.showMessageDialog(null,
                "Resultados Salvos", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        montaGrupoD();
        File arquivo = new File("C:/Users/diego/Desktop/WC/tabelaCopa.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(arquivo);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write(GolsA1J1.getText() + ";"+ GolsA2J1.getText());
            bw.newLine();
            bw.write(GolsA3J2.getText() + ";" + GolsA4J2.getText());
            bw.newLine();
            bw.write(GolsA1J3.getText() + ";" + GolsA3J3.getText());
            bw.newLine();
            bw.write(GolsA4J4.getText() + ";" + GolsA2J4.getText());
            bw.newLine();
            bw.write(GolsA4J5.getText() + ";" + GolsA1J5.getText());
            bw.newLine();
            bw.write(GolsA2J6.getText() + ";" + GolsA3J6.getText());
            bw.newLine();
            bw.write(GolsB1J1.getText() + ";"+ GolsB2J1.getText());
            bw.newLine();
            bw.write(GolsB3J2.getText() + ";" + GolsB4J2.getText());
            bw.newLine();
            bw.write(GolsB1J3.getText() + ";" + GolsB3J3.getText());
            bw.newLine();
            bw.write(GolsB4J4.getText() + ";" + GolsB2J4.getText() );
            bw.newLine();
            bw.write(GolsB4J5.getText() + ";" + GolsB1J5.getText());
            bw.newLine();
            bw.write(GolsB2J6.getText() + ";" + GolsB3J6.getText());
            bw.newLine();
            bw.write(GolsC1J1.getText() + ";"+ GolsC2J1.getText());
            bw.newLine();
            bw.write(GolsC3J2.getText() + ";" + GolsC4J2.getText() );
            bw.newLine();
            bw.write(GolsC1J3.getText() + ";" + GolsC3J3.getText());
            bw.newLine();
            bw.write(GolsC4J4.getText() + ";" + GolsC2J4.getText());
            bw.newLine();
            bw.write(GolsC4J5.getText() + ";" + GolsC1J5.getText() );
            bw.newLine();
            bw.write(GolsC2J6.getText() + ";" + GolsC3J6.getText() );
            bw.newLine();
            bw.write(GolsD1J1.getText() + ";"+ GolsD2J1.getText() );
            bw.newLine();
            bw.write(GolsD3J2.getText() + ";" + GolsD4J2.getText());
            bw.newLine();
            bw.write(GolsD1J3.getText() + ";" + GolsD3J3.getText());
            bw.newLine();
            bw.write(GolsD4J4.getText() + ";" + GolsD2J4.getText() );
            bw.newLine();
            bw.write(GolsD4J5.getText() + ";" + GolsD1J5.getText() );
            bw.newLine();
            bw.write(GolsD2J6.getText() + ";" + GolsD3J6.getText());
            bw.newLine();
            bw.write(GolsE1J1.getText() + ";"+ GolsE2J1.getText() );
            bw.newLine();
            bw.write(GolsE3J2.getText() + ";" + GolsE4J2.getText());
            bw.newLine();
            bw.write(GolsE1J3.getText() + ";" + GolsE3J3.getText() );
            bw.newLine();
            bw.write(GolsE4J4.getText() + ";" + GolsE2J4.getText() );
            bw.newLine();
            bw.write(GolsE4J5.getText() + ";" + GolsE1J5.getText());
            bw.newLine();
            bw.write(GolsE2J6.getText() + ";" + GolsE3J6.getText() );
            bw.newLine();
            bw.write(GolsF1J1.getText() + ";"+ GolsF2J1.getText() );
            bw.newLine();
            bw.write(GolsF3J2.getText() + ";" + GolsF4J2.getText() );
            bw.newLine();
            bw.write(GolsF1J3.getText() + ";" + GolsF3J3.getText() );
            bw.newLine();
            bw.write(GolsF4J4.getText() + ";" + GolsF2J4.getText() );
            bw.newLine();
            bw.write(GolsF4J5.getText() + ";" + GolsF1J5.getText() );
            bw.newLine();
            bw.write(GolsF2J6.getText() + ";" + GolsF3J6.getText() );
            bw.newLine();
            bw.write(GolsG1J1.getText() + ";"+ GolsG2J1.getText() );
            bw.newLine();
            bw.write(GolsG3J2.getText() + ";" + GolsG4J2.getText() );
            bw.newLine();
            bw.write(GolsG1J3.getText() + ";" + GolsG3J3.getText() );
            bw.newLine();
            bw.write(GolsG4J4.getText() + ";" + GolsG2J4.getText() );
            bw.newLine();
            bw.write(GolsG4J5.getText() + ";" + GolsG1J5.getText() );
            bw.newLine();
            bw.write(GolsG2J6.getText() + ";" + GolsG3J6.getText() );
            bw.newLine();
            bw.write(GolsH1J1.getText() + ";"+ GolsH2J1.getText());
            bw.newLine();
            bw.write(GolsH3J2.getText() + ";" + GolsH4J2.getText());
            bw.newLine();
            bw.write(GolsH1J3.getText() + ";" + GolsH3J3.getText());
            bw.newLine();
            bw.write(GolsH4J4.getText() + ";" + GolsH2J4.getText() );
            bw.newLine();
            bw.write(GolsH4J5.getText() + ";" + GolsH1J5.getText());
            bw.newLine();
            bw.write(GolsH2J6.getText() + ";" + GolsH3J6.getText() );
            bw.newLine();
            //Oitavas:
            bw.write(GfstA.getText() + ";" + GsndB.getText() + ";" + PfstA.getText() + ";" + PsndB.getText());
            bw.newLine();
            bw.write(GfstC.getText() + ";" + GsndD.getText() + ";" + PfstC.getText() + ";" + PsndD.getText());
            bw.newLine();
            bw.write(GfstE.getText() + ";" + GsndF.getText() + ";" + PfstE.getText() + ";" + PsndE.getText());
            bw.newLine();
            bw.write(GfstG.getText() + ";" + GsndH.getText() + ";" + PfstG.getText() + ";" + PsndH.getText() );
            bw.newLine();
            bw.write(GfstB.getText() + ";" + GsndA.getText() + ";" + PfstB.getText() + ";" + PsndA.getText() );
            bw.newLine();
            bw.write(GfstD.getText() + ";" + GsndC.getText() + ";" + PfstD.getText() + ";" + PsndC.getText() );
            bw.newLine();
            bw.write(GfstF.getText() + ";" + GsndE.getText() + ";" + PfstF.getText() + ";" + PsndF.getText());
            bw.newLine();
            bw.write(GfstH.getText() + ";" + GsndG.getText() + ";" + PfstH.getText() + ";" + PsndG.getText());
            bw.newLine();
            //Quartas
            bw.write(Gvo1.getText() + ";" + Gvo2.getText() + ";" + Pvo1.getText() + ";" + Pvo2.getText() );
            bw.newLine();
            bw.write(Gvo3.getText() + ";" + Gvo4.getText() + ";" + Pvo3.getText() + ";" + Pvo4.getText());
            bw.newLine();
            bw.write(Gvo5.getText() + ";" + Gvo6.getText() + ";" + Pvo5.getText() + ";" + Pvo6.getText() );
            bw.newLine();
            bw.write(Gvo7.getText() + ";" + Gvo8.getText() + ";" + Pvo7.getText() + ";" + Pvo8.getText() );
            bw.newLine();
            //Semis
            bw.write(Gvq1.getText() + ";" + Gvq2.getText() + ";" + Pvq1.getText() + ";" + Pvq2.getText() );
            bw.newLine();
            bw.write(Gvq3.getText() + ";" + Gvq4.getText() + ";" + Pvq3.getText() + ";" + Pvq4.getText());
            bw.newLine();
            //Finais
            bw.write(Gps1.getText() + ";" + Gps2.getText() + ";" + PenPS1.getText() + ";" + PenPS2.getText());
            bw.newLine();

            bw.write(Gvs1.getText() + ";" + Gvs2.getText() + ";" + PenVS1.getText() + ";" + PenVS2.getText());


        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            bw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    private void botaoE(ActionEvent e) {
        JOptionPane.showMessageDialog(null,
                "Resultados Salvos", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        montaGrupoE();
        File arquivo = new File("C:/Users/diego/Desktop/WC/tabelaCopa.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(arquivo);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write(GolsA1J1.getText() + ";"+ GolsA2J1.getText());
            bw.newLine();
            bw.write(GolsA3J2.getText() + ";" + GolsA4J2.getText());
            bw.newLine();
            bw.write(GolsA1J3.getText() + ";" + GolsA3J3.getText());
            bw.newLine();
            bw.write(GolsA4J4.getText() + ";" + GolsA2J4.getText());
            bw.newLine();
            bw.write(GolsA4J5.getText() + ";" + GolsA1J5.getText());
            bw.newLine();
            bw.write(GolsA2J6.getText() + ";" + GolsA3J6.getText());
            bw.newLine();
            bw.write(GolsB1J1.getText() + ";"+ GolsB2J1.getText());
            bw.newLine();
            bw.write(GolsB3J2.getText() + ";" + GolsB4J2.getText());
            bw.newLine();
            bw.write(GolsB1J3.getText() + ";" + GolsB3J3.getText());
            bw.newLine();
            bw.write(GolsB4J4.getText() + ";" + GolsB2J4.getText() );
            bw.newLine();
            bw.write(GolsB4J5.getText() + ";" + GolsB1J5.getText());
            bw.newLine();
            bw.write(GolsB2J6.getText() + ";" + GolsB3J6.getText());
            bw.newLine();
            bw.write(GolsC1J1.getText() + ";"+ GolsC2J1.getText());
            bw.newLine();
            bw.write(GolsC3J2.getText() + ";" + GolsC4J2.getText() );
            bw.newLine();
            bw.write(GolsC1J3.getText() + ";" + GolsC3J3.getText());
            bw.newLine();
            bw.write(GolsC4J4.getText() + ";" + GolsC2J4.getText());
            bw.newLine();
            bw.write(GolsC4J5.getText() + ";" + GolsC1J5.getText() );
            bw.newLine();
            bw.write(GolsC2J6.getText() + ";" + GolsC3J6.getText() );
            bw.newLine();
            bw.write(GolsD1J1.getText() + ";"+ GolsD2J1.getText() );
            bw.newLine();
            bw.write(GolsD3J2.getText() + ";" + GolsD4J2.getText());
            bw.newLine();
            bw.write(GolsD1J3.getText() + ";" + GolsD3J3.getText());
            bw.newLine();
            bw.write(GolsD4J4.getText() + ";" + GolsD2J4.getText() );
            bw.newLine();
            bw.write(GolsD4J5.getText() + ";" + GolsD1J5.getText() );
            bw.newLine();
            bw.write(GolsD2J6.getText() + ";" + GolsD3J6.getText());
            bw.newLine();
            bw.write(GolsE1J1.getText() + ";"+ GolsE2J1.getText() );
            bw.newLine();
            bw.write(GolsE3J2.getText() + ";" + GolsE4J2.getText());
            bw.newLine();
            bw.write(GolsE1J3.getText() + ";" + GolsE3J3.getText() );
            bw.newLine();
            bw.write(GolsE4J4.getText() + ";" + GolsE2J4.getText() );
            bw.newLine();
            bw.write(GolsE4J5.getText() + ";" + GolsE1J5.getText());
            bw.newLine();
            bw.write(GolsE2J6.getText() + ";" + GolsE3J6.getText() );
            bw.newLine();
            bw.write(GolsF1J1.getText() + ";"+ GolsF2J1.getText() );
            bw.newLine();
            bw.write(GolsF3J2.getText() + ";" + GolsF4J2.getText() );
            bw.newLine();
            bw.write(GolsF1J3.getText() + ";" + GolsF3J3.getText() );
            bw.newLine();
            bw.write(GolsF4J4.getText() + ";" + GolsF2J4.getText() );
            bw.newLine();
            bw.write(GolsF4J5.getText() + ";" + GolsF1J5.getText() );
            bw.newLine();
            bw.write(GolsF2J6.getText() + ";" + GolsF3J6.getText() );
            bw.newLine();
            bw.write(GolsG1J1.getText() + ";"+ GolsG2J1.getText() );
            bw.newLine();
            bw.write(GolsG3J2.getText() + ";" + GolsG4J2.getText() );
            bw.newLine();
            bw.write(GolsG1J3.getText() + ";" + GolsG3J3.getText() );
            bw.newLine();
            bw.write(GolsG4J4.getText() + ";" + GolsG2J4.getText() );
            bw.newLine();
            bw.write(GolsG4J5.getText() + ";" + GolsG1J5.getText() );
            bw.newLine();
            bw.write(GolsG2J6.getText() + ";" + GolsG3J6.getText() );
            bw.newLine();
            bw.write(GolsH1J1.getText() + ";"+ GolsH2J1.getText());
            bw.newLine();
            bw.write(GolsH3J2.getText() + ";" + GolsH4J2.getText());
            bw.newLine();
            bw.write(GolsH1J3.getText() + ";" + GolsH3J3.getText());
            bw.newLine();
            bw.write(GolsH4J4.getText() + ";" + GolsH2J4.getText() );
            bw.newLine();
            bw.write(GolsH4J5.getText() + ";" + GolsH1J5.getText());
            bw.newLine();
            bw.write(GolsH2J6.getText() + ";" + GolsH3J6.getText() );
            bw.newLine();
            //Oitavas:
            bw.write(GfstA.getText() + ";" + GsndB.getText() + ";" + PfstA.getText() + ";" + PsndB.getText());
            bw.newLine();
            bw.write(GfstC.getText() + ";" + GsndD.getText() + ";" + PfstC.getText() + ";" + PsndD.getText());
            bw.newLine();
            bw.write(GfstE.getText() + ";" + GsndF.getText() + ";" + PfstE.getText() + ";" + PsndE.getText());
            bw.newLine();
            bw.write(GfstG.getText() + ";" + GsndH.getText() + ";" + PfstG.getText() + ";" + PsndH.getText() );
            bw.newLine();
            bw.write(GfstB.getText() + ";" + GsndA.getText() + ";" + PfstB.getText() + ";" + PsndA.getText() );
            bw.newLine();
            bw.write(GfstD.getText() + ";" + GsndC.getText() + ";" + PfstD.getText() + ";" + PsndC.getText() );
            bw.newLine();
            bw.write(GfstF.getText() + ";" + GsndE.getText() + ";" + PfstF.getText() + ";" + PsndF.getText());
            bw.newLine();
            bw.write(GfstH.getText() + ";" + GsndG.getText() + ";" + PfstH.getText() + ";" + PsndG.getText());
            bw.newLine();
            //Quartas
            bw.write(Gvo1.getText() + ";" + Gvo2.getText() + ";" + Pvo1.getText() + ";" + Pvo2.getText() );
            bw.newLine();
            bw.write(Gvo3.getText() + ";" + Gvo4.getText() + ";" + Pvo3.getText() + ";" + Pvo4.getText());
            bw.newLine();
            bw.write(Gvo5.getText() + ";" + Gvo6.getText() + ";" + Pvo5.getText() + ";" + Pvo6.getText() );
            bw.newLine();
            bw.write(Gvo7.getText() + ";" + Gvo8.getText() + ";" + Pvo7.getText() + ";" + Pvo8.getText() );
            bw.newLine();
            //Semis
            bw.write(Gvq1.getText() + ";" + Gvq2.getText() + ";" + Pvq1.getText() + ";" + Pvq2.getText() );
            bw.newLine();
            bw.write(Gvq3.getText() + ";" + Gvq4.getText() + ";" + Pvq3.getText() + ";" + Pvq4.getText());
            bw.newLine();
            //Finais
            bw.write(Gps1.getText() + ";" + Gps2.getText() + ";" + PenPS1.getText() + ";" + PenPS2.getText());
            bw.newLine();

            bw.write(Gvs1.getText() + ";" + Gvs2.getText() + ";" + PenVS1.getText() + ";" + PenVS2.getText());


        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            bw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    private void botaoF(ActionEvent e) {
        JOptionPane.showMessageDialog(null,
                "Resultados Salvos", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        montaGrupoF();
        File arquivo = new File("C:/Users/diego/Desktop/WC/tabelaCopa.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(arquivo);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write(GolsA1J1.getText() + ";"+ GolsA2J1.getText());
            bw.newLine();
            bw.write(GolsA3J2.getText() + ";" + GolsA4J2.getText());
            bw.newLine();
            bw.write(GolsA1J3.getText() + ";" + GolsA3J3.getText());
            bw.newLine();
            bw.write(GolsA4J4.getText() + ";" + GolsA2J4.getText());
            bw.newLine();
            bw.write(GolsA4J5.getText() + ";" + GolsA1J5.getText());
            bw.newLine();
            bw.write(GolsA2J6.getText() + ";" + GolsA3J6.getText());
            bw.newLine();
            bw.write(GolsB1J1.getText() + ";"+ GolsB2J1.getText());
            bw.newLine();
            bw.write(GolsB3J2.getText() + ";" + GolsB4J2.getText());
            bw.newLine();
            bw.write(GolsB1J3.getText() + ";" + GolsB3J3.getText());
            bw.newLine();
            bw.write(GolsB4J4.getText() + ";" + GolsB2J4.getText() );
            bw.newLine();
            bw.write(GolsB4J5.getText() + ";" + GolsB1J5.getText());
            bw.newLine();
            bw.write(GolsB2J6.getText() + ";" + GolsB3J6.getText());
            bw.newLine();
            bw.write(GolsC1J1.getText() + ";"+ GolsC2J1.getText());
            bw.newLine();
            bw.write(GolsC3J2.getText() + ";" + GolsC4J2.getText() );
            bw.newLine();
            bw.write(GolsC1J3.getText() + ";" + GolsC3J3.getText());
            bw.newLine();
            bw.write(GolsC4J4.getText() + ";" + GolsC2J4.getText());
            bw.newLine();
            bw.write(GolsC4J5.getText() + ";" + GolsC1J5.getText() );
            bw.newLine();
            bw.write(GolsC2J6.getText() + ";" + GolsC3J6.getText() );
            bw.newLine();
            bw.write(GolsD1J1.getText() + ";"+ GolsD2J1.getText() );
            bw.newLine();
            bw.write(GolsD3J2.getText() + ";" + GolsD4J2.getText());
            bw.newLine();
            bw.write(GolsD1J3.getText() + ";" + GolsD3J3.getText());
            bw.newLine();
            bw.write(GolsD4J4.getText() + ";" + GolsD2J4.getText() );
            bw.newLine();
            bw.write(GolsD4J5.getText() + ";" + GolsD1J5.getText() );
            bw.newLine();
            bw.write(GolsD2J6.getText() + ";" + GolsD3J6.getText());
            bw.newLine();
            bw.write(GolsE1J1.getText() + ";"+ GolsE2J1.getText() );
            bw.newLine();
            bw.write(GolsE3J2.getText() + ";" + GolsE4J2.getText());
            bw.newLine();
            bw.write(GolsE1J3.getText() + ";" + GolsE3J3.getText() );
            bw.newLine();
            bw.write(GolsE4J4.getText() + ";" + GolsE2J4.getText() );
            bw.newLine();
            bw.write(GolsE4J5.getText() + ";" + GolsE1J5.getText());
            bw.newLine();
            bw.write(GolsE2J6.getText() + ";" + GolsE3J6.getText() );
            bw.newLine();
            bw.write(GolsF1J1.getText() + ";"+ GolsF2J1.getText() );
            bw.newLine();
            bw.write(GolsF3J2.getText() + ";" + GolsF4J2.getText() );
            bw.newLine();
            bw.write(GolsF1J3.getText() + ";" + GolsF3J3.getText() );
            bw.newLine();
            bw.write(GolsF4J4.getText() + ";" + GolsF2J4.getText() );
            bw.newLine();
            bw.write(GolsF4J5.getText() + ";" + GolsF1J5.getText() );
            bw.newLine();
            bw.write(GolsF2J6.getText() + ";" + GolsF3J6.getText() );
            bw.newLine();
            bw.write(GolsG1J1.getText() + ";"+ GolsG2J1.getText() );
            bw.newLine();
            bw.write(GolsG3J2.getText() + ";" + GolsG4J2.getText() );
            bw.newLine();
            bw.write(GolsG1J3.getText() + ";" + GolsG3J3.getText() );
            bw.newLine();
            bw.write(GolsG4J4.getText() + ";" + GolsG2J4.getText() );
            bw.newLine();
            bw.write(GolsG4J5.getText() + ";" + GolsG1J5.getText() );
            bw.newLine();
            bw.write(GolsG2J6.getText() + ";" + GolsG3J6.getText() );
            bw.newLine();
            bw.write(GolsH1J1.getText() + ";"+ GolsH2J1.getText());
            bw.newLine();
            bw.write(GolsH3J2.getText() + ";" + GolsH4J2.getText());
            bw.newLine();
            bw.write(GolsH1J3.getText() + ";" + GolsH3J3.getText());
            bw.newLine();
            bw.write(GolsH4J4.getText() + ";" + GolsH2J4.getText() );
            bw.newLine();
            bw.write(GolsH4J5.getText() + ";" + GolsH1J5.getText());
            bw.newLine();
            bw.write(GolsH2J6.getText() + ";" + GolsH3J6.getText() );
            bw.newLine();
            //Oitavas:
            bw.write(GfstA.getText() + ";" + GsndB.getText() + ";" + PfstA.getText() + ";" + PsndB.getText());
            bw.newLine();
            bw.write(GfstC.getText() + ";" + GsndD.getText() + ";" + PfstC.getText() + ";" + PsndD.getText());
            bw.newLine();
            bw.write(GfstE.getText() + ";" + GsndF.getText() + ";" + PfstE.getText() + ";" + PsndE.getText());
            bw.newLine();
            bw.write(GfstG.getText() + ";" + GsndH.getText() + ";" + PfstG.getText() + ";" + PsndH.getText() );
            bw.newLine();
            bw.write(GfstB.getText() + ";" + GsndA.getText() + ";" + PfstB.getText() + ";" + PsndA.getText() );
            bw.newLine();
            bw.write(GfstD.getText() + ";" + GsndC.getText() + ";" + PfstD.getText() + ";" + PsndC.getText() );
            bw.newLine();
            bw.write(GfstF.getText() + ";" + GsndE.getText() + ";" + PfstF.getText() + ";" + PsndF.getText());
            bw.newLine();
            bw.write(GfstH.getText() + ";" + GsndG.getText() + ";" + PfstH.getText() + ";" + PsndG.getText());
            bw.newLine();
            //Quartas
            bw.write(Gvo1.getText() + ";" + Gvo2.getText() + ";" + Pvo1.getText() + ";" + Pvo2.getText() );
            bw.newLine();
            bw.write(Gvo3.getText() + ";" + Gvo4.getText() + ";" + Pvo3.getText() + ";" + Pvo4.getText());
            bw.newLine();
            bw.write(Gvo5.getText() + ";" + Gvo6.getText() + ";" + Pvo5.getText() + ";" + Pvo6.getText() );
            bw.newLine();
            bw.write(Gvo7.getText() + ";" + Gvo8.getText() + ";" + Pvo7.getText() + ";" + Pvo8.getText() );
            bw.newLine();
            //Semis
            bw.write(Gvq1.getText() + ";" + Gvq2.getText() + ";" + Pvq1.getText() + ";" + Pvq2.getText() );
            bw.newLine();
            bw.write(Gvq3.getText() + ";" + Gvq4.getText() + ";" + Pvq3.getText() + ";" + Pvq4.getText());
            bw.newLine();
            //Finais
            bw.write(Gps1.getText() + ";" + Gps2.getText() + ";" + PenPS1.getText() + ";" + PenPS2.getText());
            bw.newLine();

            bw.write(Gvs1.getText() + ";" + Gvs2.getText() + ";" + PenVS1.getText() + ";" + PenVS2.getText());


        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            bw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    private void botaoG(ActionEvent e) {
        JOptionPane.showMessageDialog(null,
                "Resultados Salvos", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        montaGrupoG();
        File arquivo = new File("C:/Users/diego/Desktop/WC/tabelaCopa.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(arquivo);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write(GolsA1J1.getText() + ";"+ GolsA2J1.getText());
            bw.newLine();
            bw.write(GolsA3J2.getText() + ";" + GolsA4J2.getText());
            bw.newLine();
            bw.write(GolsA1J3.getText() + ";" + GolsA3J3.getText());
            bw.newLine();
            bw.write(GolsA4J4.getText() + ";" + GolsA2J4.getText());
            bw.newLine();
            bw.write(GolsA4J5.getText() + ";" + GolsA1J5.getText());
            bw.newLine();
            bw.write(GolsA2J6.getText() + ";" + GolsA3J6.getText());
            bw.newLine();
            bw.write(GolsB1J1.getText() + ";"+ GolsB2J1.getText());
            bw.newLine();
            bw.write(GolsB3J2.getText() + ";" + GolsB4J2.getText());
            bw.newLine();
            bw.write(GolsB1J3.getText() + ";" + GolsB3J3.getText());
            bw.newLine();
            bw.write(GolsB4J4.getText() + ";" + GolsB2J4.getText() );
            bw.newLine();
            bw.write(GolsB4J5.getText() + ";" + GolsB1J5.getText());
            bw.newLine();
            bw.write(GolsB2J6.getText() + ";" + GolsB3J6.getText());
            bw.newLine();
            bw.write(GolsC1J1.getText() + ";"+ GolsC2J1.getText());
            bw.newLine();
            bw.write(GolsC3J2.getText() + ";" + GolsC4J2.getText() );
            bw.newLine();
            bw.write(GolsC1J3.getText() + ";" + GolsC3J3.getText());
            bw.newLine();
            bw.write(GolsC4J4.getText() + ";" + GolsC2J4.getText());
            bw.newLine();
            bw.write(GolsC4J5.getText() + ";" + GolsC1J5.getText() );
            bw.newLine();
            bw.write(GolsC2J6.getText() + ";" + GolsC3J6.getText() );
            bw.newLine();
            bw.write(GolsD1J1.getText() + ";"+ GolsD2J1.getText() );
            bw.newLine();
            bw.write(GolsD3J2.getText() + ";" + GolsD4J2.getText());
            bw.newLine();
            bw.write(GolsD1J3.getText() + ";" + GolsD3J3.getText());
            bw.newLine();
            bw.write(GolsD4J4.getText() + ";" + GolsD2J4.getText() );
            bw.newLine();
            bw.write(GolsD4J5.getText() + ";" + GolsD1J5.getText() );
            bw.newLine();
            bw.write(GolsD2J6.getText() + ";" + GolsD3J6.getText());
            bw.newLine();
            bw.write(GolsE1J1.getText() + ";"+ GolsE2J1.getText() );
            bw.newLine();
            bw.write(GolsE3J2.getText() + ";" + GolsE4J2.getText());
            bw.newLine();
            bw.write(GolsE1J3.getText() + ";" + GolsE3J3.getText() );
            bw.newLine();
            bw.write(GolsE4J4.getText() + ";" + GolsE2J4.getText() );
            bw.newLine();
            bw.write(GolsE4J5.getText() + ";" + GolsE1J5.getText());
            bw.newLine();
            bw.write(GolsE2J6.getText() + ";" + GolsE3J6.getText() );
            bw.newLine();
            bw.write(GolsF1J1.getText() + ";"+ GolsF2J1.getText() );
            bw.newLine();
            bw.write(GolsF3J2.getText() + ";" + GolsF4J2.getText() );
            bw.newLine();
            bw.write(GolsF1J3.getText() + ";" + GolsF3J3.getText() );
            bw.newLine();
            bw.write(GolsF4J4.getText() + ";" + GolsF2J4.getText() );
            bw.newLine();
            bw.write(GolsF4J5.getText() + ";" + GolsF1J5.getText() );
            bw.newLine();
            bw.write(GolsF2J6.getText() + ";" + GolsF3J6.getText() );
            bw.newLine();
            bw.write(GolsG1J1.getText() + ";"+ GolsG2J1.getText() );
            bw.newLine();
            bw.write(GolsG3J2.getText() + ";" + GolsG4J2.getText() );
            bw.newLine();
            bw.write(GolsG1J3.getText() + ";" + GolsG3J3.getText() );
            bw.newLine();
            bw.write(GolsG4J4.getText() + ";" + GolsG2J4.getText() );
            bw.newLine();
            bw.write(GolsG4J5.getText() + ";" + GolsG1J5.getText() );
            bw.newLine();
            bw.write(GolsG2J6.getText() + ";" + GolsG3J6.getText() );
            bw.newLine();
            bw.write(GolsH1J1.getText() + ";"+ GolsH2J1.getText());
            bw.newLine();
            bw.write(GolsH3J2.getText() + ";" + GolsH4J2.getText());
            bw.newLine();
            bw.write(GolsH1J3.getText() + ";" + GolsH3J3.getText());
            bw.newLine();
            bw.write(GolsH4J4.getText() + ";" + GolsH2J4.getText() );
            bw.newLine();
            bw.write(GolsH4J5.getText() + ";" + GolsH1J5.getText());
            bw.newLine();
            bw.write(GolsH2J6.getText() + ";" + GolsH3J6.getText() );
            bw.newLine();
            //Oitavas:
            bw.write(GfstA.getText() + ";" + GsndB.getText() + ";" + PfstA.getText() + ";" + PsndB.getText());
            bw.newLine();
            bw.write(GfstC.getText() + ";" + GsndD.getText() + ";" + PfstC.getText() + ";" + PsndD.getText());
            bw.newLine();
            bw.write(GfstE.getText() + ";" + GsndF.getText() + ";" + PfstE.getText() + ";" + PsndE.getText());
            bw.newLine();
            bw.write(GfstG.getText() + ";" + GsndH.getText() + ";" + PfstG.getText() + ";" + PsndH.getText() );
            bw.newLine();
            bw.write(GfstB.getText() + ";" + GsndA.getText() + ";" + PfstB.getText() + ";" + PsndA.getText() );
            bw.newLine();
            bw.write(GfstD.getText() + ";" + GsndC.getText() + ";" + PfstD.getText() + ";" + PsndC.getText() );
            bw.newLine();
            bw.write(GfstF.getText() + ";" + GsndE.getText() + ";" + PfstF.getText() + ";" + PsndF.getText());
            bw.newLine();
            bw.write(GfstH.getText() + ";" + GsndG.getText() + ";" + PfstH.getText() + ";" + PsndG.getText());
            bw.newLine();
            //Quartas
            bw.write(Gvo1.getText() + ";" + Gvo2.getText() + ";" + Pvo1.getText() + ";" + Pvo2.getText() );
            bw.newLine();
            bw.write(Gvo3.getText() + ";" + Gvo4.getText() + ";" + Pvo3.getText() + ";" + Pvo4.getText());
            bw.newLine();
            bw.write(Gvo5.getText() + ";" + Gvo6.getText() + ";" + Pvo5.getText() + ";" + Pvo6.getText() );
            bw.newLine();
            bw.write(Gvo7.getText() + ";" + Gvo8.getText() + ";" + Pvo7.getText() + ";" + Pvo8.getText() );
            bw.newLine();
            //Semis
            bw.write(Gvq1.getText() + ";" + Gvq2.getText() + ";" + Pvq1.getText() + ";" + Pvq2.getText() );
            bw.newLine();
            bw.write(Gvq3.getText() + ";" + Gvq4.getText() + ";" + Pvq3.getText() + ";" + Pvq4.getText());
            bw.newLine();
            //Finais
            bw.write(Gps1.getText() + ";" + Gps2.getText() + ";" + PenPS1.getText() + ";" + PenPS2.getText());
            bw.newLine();

            bw.write(Gvs1.getText() + ";" + Gvs2.getText() + ";" + PenVS1.getText() + ";" + PenVS2.getText());


        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            bw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    private void botaoH(ActionEvent e) {
        JOptionPane.showMessageDialog(null,
                "Resultados Salvos", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        montaGrupoH();
        File arquivo = new File("C:/Users/diego/Desktop/WC/tabelaCopa.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(arquivo);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write(GolsA1J1.getText() + ";"+ GolsA2J1.getText());
            bw.newLine();
            bw.write(GolsA3J2.getText() + ";" + GolsA4J2.getText());
            bw.newLine();
            bw.write(GolsA1J3.getText() + ";" + GolsA3J3.getText());
            bw.newLine();
            bw.write(GolsA4J4.getText() + ";" + GolsA2J4.getText());
            bw.newLine();
            bw.write(GolsA4J5.getText() + ";" + GolsA1J5.getText());
            bw.newLine();
            bw.write(GolsA2J6.getText() + ";" + GolsA3J6.getText());
            bw.newLine();
            bw.write(GolsB1J1.getText() + ";"+ GolsB2J1.getText());
            bw.newLine();
            bw.write(GolsB3J2.getText() + ";" + GolsB4J2.getText());
            bw.newLine();
            bw.write(GolsB1J3.getText() + ";" + GolsB3J3.getText());
            bw.newLine();
            bw.write(GolsB4J4.getText() + ";" + GolsB2J4.getText() );
            bw.newLine();
            bw.write(GolsB4J5.getText() + ";" + GolsB1J5.getText());
            bw.newLine();
            bw.write(GolsB2J6.getText() + ";" + GolsB3J6.getText());
            bw.newLine();
            bw.write(GolsC1J1.getText() + ";"+ GolsC2J1.getText());
            bw.newLine();
            bw.write(GolsC3J2.getText() + ";" + GolsC4J2.getText() );
            bw.newLine();
            bw.write(GolsC1J3.getText() + ";" + GolsC3J3.getText());
            bw.newLine();
            bw.write(GolsC4J4.getText() + ";" + GolsC2J4.getText());
            bw.newLine();
            bw.write(GolsC4J5.getText() + ";" + GolsC1J5.getText() );
            bw.newLine();
            bw.write(GolsC2J6.getText() + ";" + GolsC3J6.getText() );
            bw.newLine();
            bw.write(GolsD1J1.getText() + ";"+ GolsD2J1.getText() );
            bw.newLine();
            bw.write(GolsD3J2.getText() + ";" + GolsD4J2.getText());
            bw.newLine();
            bw.write(GolsD1J3.getText() + ";" + GolsD3J3.getText());
            bw.newLine();
            bw.write(GolsD4J4.getText() + ";" + GolsD2J4.getText() );
            bw.newLine();
            bw.write(GolsD4J5.getText() + ";" + GolsD1J5.getText() );
            bw.newLine();
            bw.write(GolsD2J6.getText() + ";" + GolsD3J6.getText());
            bw.newLine();
            bw.write(GolsE1J1.getText() + ";"+ GolsE2J1.getText() );
            bw.newLine();
            bw.write(GolsE3J2.getText() + ";" + GolsE4J2.getText());
            bw.newLine();
            bw.write(GolsE1J3.getText() + ";" + GolsE3J3.getText() );
            bw.newLine();
            bw.write(GolsE4J4.getText() + ";" + GolsE2J4.getText() );
            bw.newLine();
            bw.write(GolsE4J5.getText() + ";" + GolsE1J5.getText());
            bw.newLine();
            bw.write(GolsE2J6.getText() + ";" + GolsE3J6.getText() );
            bw.newLine();
            bw.write(GolsF1J1.getText() + ";"+ GolsF2J1.getText() );
            bw.newLine();
            bw.write(GolsF3J2.getText() + ";" + GolsF4J2.getText() );
            bw.newLine();
            bw.write(GolsF1J3.getText() + ";" + GolsF3J3.getText() );
            bw.newLine();
            bw.write(GolsF4J4.getText() + ";" + GolsF2J4.getText() );
            bw.newLine();
            bw.write(GolsF4J5.getText() + ";" + GolsF1J5.getText() );
            bw.newLine();
            bw.write(GolsF2J6.getText() + ";" + GolsF3J6.getText() );
            bw.newLine();
            bw.write(GolsG1J1.getText() + ";"+ GolsG2J1.getText() );
            bw.newLine();
            bw.write(GolsG3J2.getText() + ";" + GolsG4J2.getText() );
            bw.newLine();
            bw.write(GolsG1J3.getText() + ";" + GolsG3J3.getText() );
            bw.newLine();
            bw.write(GolsG4J4.getText() + ";" + GolsG2J4.getText() );
            bw.newLine();
            bw.write(GolsG4J5.getText() + ";" + GolsG1J5.getText() );
            bw.newLine();
            bw.write(GolsG2J6.getText() + ";" + GolsG3J6.getText() );
            bw.newLine();
            bw.write(GolsH1J1.getText() + ";"+ GolsH2J1.getText());
            bw.newLine();
            bw.write(GolsH3J2.getText() + ";" + GolsH4J2.getText());
            bw.newLine();
            bw.write(GolsH1J3.getText() + ";" + GolsH3J3.getText());
            bw.newLine();
            bw.write(GolsH4J4.getText() + ";" + GolsH2J4.getText() );
            bw.newLine();
            bw.write(GolsH4J5.getText() + ";" + GolsH1J5.getText());
            bw.newLine();
            bw.write(GolsH2J6.getText() + ";" + GolsH3J6.getText() );
            bw.newLine();
            //Oitavas:
            bw.write(GfstA.getText() + ";" + GsndB.getText() + ";" + PfstA.getText() + ";" + PsndB.getText());
            bw.newLine();
            bw.write(GfstC.getText() + ";" + GsndD.getText() + ";" + PfstC.getText() + ";" + PsndD.getText());
            bw.newLine();
            bw.write(GfstE.getText() + ";" + GsndF.getText() + ";" + PfstE.getText() + ";" + PsndE.getText());
            bw.newLine();
            bw.write(GfstG.getText() + ";" + GsndH.getText() + ";" + PfstG.getText() + ";" + PsndH.getText() );
            bw.newLine();
            bw.write(GfstB.getText() + ";" + GsndA.getText() + ";" + PfstB.getText() + ";" + PsndA.getText() );
            bw.newLine();
            bw.write(GfstD.getText() + ";" + GsndC.getText() + ";" + PfstD.getText() + ";" + PsndC.getText() );
            bw.newLine();
            bw.write(GfstF.getText() + ";" + GsndE.getText() + ";" + PfstF.getText() + ";" + PsndF.getText());
            bw.newLine();
            bw.write(GfstH.getText() + ";" + GsndG.getText() + ";" + PfstH.getText() + ";" + PsndG.getText());
            bw.newLine();
            //Quartas
            bw.write(Gvo1.getText() + ";" + Gvo2.getText() + ";" + Pvo1.getText() + ";" + Pvo2.getText() );
            bw.newLine();
            bw.write(Gvo3.getText() + ";" + Gvo4.getText() + ";" + Pvo3.getText() + ";" + Pvo4.getText());
            bw.newLine();
            bw.write(Gvo5.getText() + ";" + Gvo6.getText() + ";" + Pvo5.getText() + ";" + Pvo6.getText() );
            bw.newLine();
            bw.write(Gvo7.getText() + ";" + Gvo8.getText() + ";" + Pvo7.getText() + ";" + Pvo8.getText() );
            bw.newLine();
            //Semis
            bw.write(Gvq1.getText() + ";" + Gvq2.getText() + ";" + Pvq1.getText() + ";" + Pvq2.getText() );
            bw.newLine();
            bw.write(Gvq3.getText() + ";" + Gvq4.getText() + ";" + Pvq3.getText() + ";" + Pvq4.getText());
            bw.newLine();
            //Finais
            bw.write(Gps1.getText() + ";" + Gps2.getText() + ";" + PenPS1.getText() + ";" + PenPS2.getText());
            bw.newLine();

            bw.write(Gvs1.getText() + ";" + Gvs2.getText() + ";" + PenVS1.getText() + ";" + PenVS2.getText());


        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            bw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    private void botaoOitavas(ActionEvent e) {
        JOptionPane.showMessageDialog(null,
                "Resultados Salvos", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        montarQuartas();
        File arquivo = new File("C:/Users/diego/Desktop/WC/tabelaCopa.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(arquivo);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write(GolsA1J1.getText() + ";"+ GolsA2J1.getText());
            bw.newLine();
            bw.write(GolsA3J2.getText() + ";" + GolsA4J2.getText());
            bw.newLine();
            bw.write(GolsA1J3.getText() + ";" + GolsA3J3.getText());
            bw.newLine();
            bw.write(GolsA4J4.getText() + ";" + GolsA2J4.getText());
            bw.newLine();
            bw.write(GolsA4J5.getText() + ";" + GolsA1J5.getText());
            bw.newLine();
            bw.write(GolsA2J6.getText() + ";" + GolsA3J6.getText());
            bw.newLine();
            bw.write(GolsB1J1.getText() + ";"+ GolsB2J1.getText());
            bw.newLine();
            bw.write(GolsB3J2.getText() + ";" + GolsB4J2.getText());
            bw.newLine();
            bw.write(GolsB1J3.getText() + ";" + GolsB3J3.getText());
            bw.newLine();
            bw.write(GolsB4J4.getText() + ";" + GolsB2J4.getText() );
            bw.newLine();
            bw.write(GolsB4J5.getText() + ";" + GolsB1J5.getText());
            bw.newLine();
            bw.write(GolsB2J6.getText() + ";" + GolsB3J6.getText());
            bw.newLine();
            bw.write(GolsC1J1.getText() + ";"+ GolsC2J1.getText());
            bw.newLine();
            bw.write(GolsC3J2.getText() + ";" + GolsC4J2.getText() );
            bw.newLine();
            bw.write(GolsC1J3.getText() + ";" + GolsC3J3.getText());
            bw.newLine();
            bw.write(GolsC4J4.getText() + ";" + GolsC2J4.getText());
            bw.newLine();
            bw.write(GolsC4J5.getText() + ";" + GolsC1J5.getText() );
            bw.newLine();
            bw.write(GolsC2J6.getText() + ";" + GolsC3J6.getText() );
            bw.newLine();
            bw.write(GolsD1J1.getText() + ";"+ GolsD2J1.getText() );
            bw.newLine();
            bw.write(GolsD3J2.getText() + ";" + GolsD4J2.getText());
            bw.newLine();
            bw.write(GolsD1J3.getText() + ";" + GolsD3J3.getText());
            bw.newLine();
            bw.write(GolsD4J4.getText() + ";" + GolsD2J4.getText() );
            bw.newLine();
            bw.write(GolsD4J5.getText() + ";" + GolsD1J5.getText() );
            bw.newLine();
            bw.write(GolsD2J6.getText() + ";" + GolsD3J6.getText());
            bw.newLine();
            bw.write(GolsE1J1.getText() + ";"+ GolsE2J1.getText() );
            bw.newLine();
            bw.write(GolsE3J2.getText() + ";" + GolsE4J2.getText());
            bw.newLine();
            bw.write(GolsE1J3.getText() + ";" + GolsE3J3.getText() );
            bw.newLine();
            bw.write(GolsE4J4.getText() + ";" + GolsE2J4.getText() );
            bw.newLine();
            bw.write(GolsE4J5.getText() + ";" + GolsE1J5.getText());
            bw.newLine();
            bw.write(GolsE2J6.getText() + ";" + GolsE3J6.getText() );
            bw.newLine();
            bw.write(GolsF1J1.getText() + ";"+ GolsF2J1.getText() );
            bw.newLine();
            bw.write(GolsF3J2.getText() + ";" + GolsF4J2.getText() );
            bw.newLine();
            bw.write(GolsF1J3.getText() + ";" + GolsF3J3.getText() );
            bw.newLine();
            bw.write(GolsF4J4.getText() + ";" + GolsF2J4.getText() );
            bw.newLine();
            bw.write(GolsF4J5.getText() + ";" + GolsF1J5.getText() );
            bw.newLine();
            bw.write(GolsF2J6.getText() + ";" + GolsF3J6.getText() );
            bw.newLine();
            bw.write(GolsG1J1.getText() + ";"+ GolsG2J1.getText() );
            bw.newLine();
            bw.write(GolsG3J2.getText() + ";" + GolsG4J2.getText() );
            bw.newLine();
            bw.write(GolsG1J3.getText() + ";" + GolsG3J3.getText() );
            bw.newLine();
            bw.write(GolsG4J4.getText() + ";" + GolsG2J4.getText() );
            bw.newLine();
            bw.write(GolsG4J5.getText() + ";" + GolsG1J5.getText() );
            bw.newLine();
            bw.write(GolsG2J6.getText() + ";" + GolsG3J6.getText() );
            bw.newLine();
            bw.write(GolsH1J1.getText() + ";"+ GolsH2J1.getText());
            bw.newLine();
            bw.write(GolsH3J2.getText() + ";" + GolsH4J2.getText());
            bw.newLine();
            bw.write(GolsH1J3.getText() + ";" + GolsH3J3.getText());
            bw.newLine();
            bw.write(GolsH4J4.getText() + ";" + GolsH2J4.getText() );
            bw.newLine();
            bw.write(GolsH4J5.getText() + ";" + GolsH1J5.getText());
            bw.newLine();
            bw.write(GolsH2J6.getText() + ";" + GolsH3J6.getText() );
            bw.newLine();
            //Oitavas:
            bw.write(GfstA.getText() + ";" + GsndB.getText() + ";" + PfstA.getText() + ";" + PsndB.getText());
            bw.newLine();
            bw.write(GfstC.getText() + ";" + GsndD.getText() + ";" + PfstC.getText() + ";" + PsndD.getText());
            bw.newLine();
            bw.write(GfstE.getText() + ";" + GsndF.getText() + ";" + PfstE.getText() + ";" + PsndE.getText());
            bw.newLine();
            bw.write(GfstG.getText() + ";" + GsndH.getText() + ";" + PfstG.getText() + ";" + PsndH.getText() );
            bw.newLine();
            bw.write(GfstB.getText() + ";" + GsndA.getText() + ";" + PfstB.getText() + ";" + PsndA.getText() );
            bw.newLine();
            bw.write(GfstD.getText() + ";" + GsndC.getText() + ";" + PfstD.getText() + ";" + PsndC.getText() );
            bw.newLine();
            bw.write(GfstF.getText() + ";" + GsndE.getText() + ";" + PfstF.getText() + ";" + PsndF.getText());
            bw.newLine();
            bw.write(GfstH.getText() + ";" + GsndG.getText() + ";" + PfstH.getText() + ";" + PsndG.getText());
            bw.newLine();
            //Quartas
            bw.write(Gvo1.getText() + ";" + Gvo2.getText() + ";" + Pvo1.getText() + ";" + Pvo2.getText() );
            bw.newLine();
            bw.write(Gvo3.getText() + ";" + Gvo4.getText() + ";" + Pvo3.getText() + ";" + Pvo4.getText());
            bw.newLine();
            bw.write(Gvo5.getText() + ";" + Gvo6.getText() + ";" + Pvo5.getText() + ";" + Pvo6.getText() );
            bw.newLine();
            bw.write(Gvo7.getText() + ";" + Gvo8.getText() + ";" + Pvo7.getText() + ";" + Pvo8.getText() );
            bw.newLine();
            //Semis
            bw.write(Gvq1.getText() + ";" + Gvq2.getText() + ";" + Pvq1.getText() + ";" + Pvq2.getText() );
            bw.newLine();
            bw.write(Gvq3.getText() + ";" + Gvq4.getText() + ";" + Pvq3.getText() + ";" + Pvq4.getText());
            bw.newLine();
            //Finais
            bw.write(Gps1.getText() + ";" + Gps2.getText() + ";" + PenPS1.getText() + ";" + PenPS2.getText());
            bw.newLine();

            bw.write(Gvs1.getText() + ";" + Gvs2.getText() + ";" + PenVS1.getText() + ";" + PenVS2.getText());


        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            bw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    private void botaoQuartas(ActionEvent e) {
        JOptionPane.showMessageDialog(null,
                "Resultados Salvos", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        montarSemis();
        File arquivo = new File("C:/Users/diego/Desktop/WC/tabelaCopa.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(arquivo);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write(GolsA1J1.getText() + ";"+ GolsA2J1.getText());
            bw.newLine();
            bw.write(GolsA3J2.getText() + ";" + GolsA4J2.getText());
            bw.newLine();
            bw.write(GolsA1J3.getText() + ";" + GolsA3J3.getText());
            bw.newLine();
            bw.write(GolsA4J4.getText() + ";" + GolsA2J4.getText());
            bw.newLine();
            bw.write(GolsA4J5.getText() + ";" + GolsA1J5.getText());
            bw.newLine();
            bw.write(GolsA2J6.getText() + ";" + GolsA3J6.getText());
            bw.newLine();
            bw.write(GolsB1J1.getText() + ";"+ GolsB2J1.getText());
            bw.newLine();
            bw.write(GolsB3J2.getText() + ";" + GolsB4J2.getText());
            bw.newLine();
            bw.write(GolsB1J3.getText() + ";" + GolsB3J3.getText());
            bw.newLine();
            bw.write(GolsB4J4.getText() + ";" + GolsB2J4.getText() );
            bw.newLine();
            bw.write(GolsB4J5.getText() + ";" + GolsB1J5.getText());
            bw.newLine();
            bw.write(GolsB2J6.getText() + ";" + GolsB3J6.getText());
            bw.newLine();
            bw.write(GolsC1J1.getText() + ";"+ GolsC2J1.getText());
            bw.newLine();
            bw.write(GolsC3J2.getText() + ";" + GolsC4J2.getText() );
            bw.newLine();
            bw.write(GolsC1J3.getText() + ";" + GolsC3J3.getText());
            bw.newLine();
            bw.write(GolsC4J4.getText() + ";" + GolsC2J4.getText());
            bw.newLine();
            bw.write(GolsC4J5.getText() + ";" + GolsC1J5.getText() );
            bw.newLine();
            bw.write(GolsC2J6.getText() + ";" + GolsC3J6.getText() );
            bw.newLine();
            bw.write(GolsD1J1.getText() + ";"+ GolsD2J1.getText() );
            bw.newLine();
            bw.write(GolsD3J2.getText() + ";" + GolsD4J2.getText());
            bw.newLine();
            bw.write(GolsD1J3.getText() + ";" + GolsD3J3.getText());
            bw.newLine();
            bw.write(GolsD4J4.getText() + ";" + GolsD2J4.getText() );
            bw.newLine();
            bw.write(GolsD4J5.getText() + ";" + GolsD1J5.getText() );
            bw.newLine();
            bw.write(GolsD2J6.getText() + ";" + GolsD3J6.getText());
            bw.newLine();
            bw.write(GolsE1J1.getText() + ";"+ GolsE2J1.getText() );
            bw.newLine();
            bw.write(GolsE3J2.getText() + ";" + GolsE4J2.getText());
            bw.newLine();
            bw.write(GolsE1J3.getText() + ";" + GolsE3J3.getText() );
            bw.newLine();
            bw.write(GolsE4J4.getText() + ";" + GolsE2J4.getText() );
            bw.newLine();
            bw.write(GolsE4J5.getText() + ";" + GolsE1J5.getText());
            bw.newLine();
            bw.write(GolsE2J6.getText() + ";" + GolsE3J6.getText() );
            bw.newLine();
            bw.write(GolsF1J1.getText() + ";"+ GolsF2J1.getText() );
            bw.newLine();
            bw.write(GolsF3J2.getText() + ";" + GolsF4J2.getText() );
            bw.newLine();
            bw.write(GolsF1J3.getText() + ";" + GolsF3J3.getText() );
            bw.newLine();
            bw.write(GolsF4J4.getText() + ";" + GolsF2J4.getText() );
            bw.newLine();
            bw.write(GolsF4J5.getText() + ";" + GolsF1J5.getText() );
            bw.newLine();
            bw.write(GolsF2J6.getText() + ";" + GolsF3J6.getText() );
            bw.newLine();
            bw.write(GolsG1J1.getText() + ";"+ GolsG2J1.getText() );
            bw.newLine();
            bw.write(GolsG3J2.getText() + ";" + GolsG4J2.getText() );
            bw.newLine();
            bw.write(GolsG1J3.getText() + ";" + GolsG3J3.getText() );
            bw.newLine();
            bw.write(GolsG4J4.getText() + ";" + GolsG2J4.getText() );
            bw.newLine();
            bw.write(GolsG4J5.getText() + ";" + GolsG1J5.getText() );
            bw.newLine();
            bw.write(GolsG2J6.getText() + ";" + GolsG3J6.getText() );
            bw.newLine();
            bw.write(GolsH1J1.getText() + ";"+ GolsH2J1.getText());
            bw.newLine();
            bw.write(GolsH3J2.getText() + ";" + GolsH4J2.getText());
            bw.newLine();
            bw.write(GolsH1J3.getText() + ";" + GolsH3J3.getText());
            bw.newLine();
            bw.write(GolsH4J4.getText() + ";" + GolsH2J4.getText() );
            bw.newLine();
            bw.write(GolsH4J5.getText() + ";" + GolsH1J5.getText());
            bw.newLine();
            bw.write(GolsH2J6.getText() + ";" + GolsH3J6.getText() );
            bw.newLine();
            //Oitavas:
            bw.write(GfstA.getText() + ";" + GsndB.getText() + ";" + PfstA.getText() + ";" + PsndB.getText());
            bw.newLine();
            bw.write(GfstC.getText() + ";" + GsndD.getText() + ";" + PfstC.getText() + ";" + PsndD.getText());
            bw.newLine();
            bw.write(GfstE.getText() + ";" + GsndF.getText() + ";" + PfstE.getText() + ";" + PsndE.getText());
            bw.newLine();
            bw.write(GfstG.getText() + ";" + GsndH.getText() + ";" + PfstG.getText() + ";" + PsndH.getText() );
            bw.newLine();
            bw.write(GfstB.getText() + ";" + GsndA.getText() + ";" + PfstB.getText() + ";" + PsndA.getText() );
            bw.newLine();
            bw.write(GfstD.getText() + ";" + GsndC.getText() + ";" + PfstD.getText() + ";" + PsndC.getText() );
            bw.newLine();
            bw.write(GfstF.getText() + ";" + GsndE.getText() + ";" + PfstF.getText() + ";" + PsndF.getText());
            bw.newLine();
            bw.write(GfstH.getText() + ";" + GsndG.getText() + ";" + PfstH.getText() + ";" + PsndG.getText());
            bw.newLine();
            //Quartas
            bw.write(Gvo1.getText() + ";" + Gvo2.getText() + ";" + Pvo1.getText() + ";" + Pvo2.getText() );
            bw.newLine();
            bw.write(Gvo3.getText() + ";" + Gvo4.getText() + ";" + Pvo3.getText() + ";" + Pvo4.getText());
            bw.newLine();
            bw.write(Gvo5.getText() + ";" + Gvo6.getText() + ";" + Pvo5.getText() + ";" + Pvo6.getText() );
            bw.newLine();
            bw.write(Gvo7.getText() + ";" + Gvo8.getText() + ";" + Pvo7.getText() + ";" + Pvo8.getText() );
            bw.newLine();
            //Semis
            bw.write(Gvq1.getText() + ";" + Gvq2.getText() + ";" + Pvq1.getText() + ";" + Pvq2.getText() );
            bw.newLine();
            bw.write(Gvq3.getText() + ";" + Gvq4.getText() + ";" + Pvq3.getText() + ";" + Pvq4.getText());
            bw.newLine();
            //Finais
            bw.write(Gps1.getText() + ";" + Gps2.getText() + ";" + PenPS1.getText() + ";" + PenPS2.getText());
            bw.newLine();

            bw.write(Gvs1.getText() + ";" + Gvs2.getText() + ";" + PenVS1.getText() + ";" + PenVS2.getText());


        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            bw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    private void botaoSemis(ActionEvent e) {
        JOptionPane.showMessageDialog(null,
                "Resultados Salvos", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        montarFinais();
        File arquivo = new File("C:/Users/diego/Desktop/WC/tabelaCopa.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(arquivo);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write(GolsA1J1.getText() + ";"+ GolsA2J1.getText());
            bw.newLine();
            bw.write(GolsA3J2.getText() + ";" + GolsA4J2.getText());
            bw.newLine();
            bw.write(GolsA1J3.getText() + ";" + GolsA3J3.getText());
            bw.newLine();
            bw.write(GolsA4J4.getText() + ";" + GolsA2J4.getText());
            bw.newLine();
            bw.write(GolsA4J5.getText() + ";" + GolsA1J5.getText());
            bw.newLine();
            bw.write(GolsA2J6.getText() + ";" + GolsA3J6.getText());
            bw.newLine();
            bw.write(GolsB1J1.getText() + ";"+ GolsB2J1.getText());
            bw.newLine();
            bw.write(GolsB3J2.getText() + ";" + GolsB4J2.getText());
            bw.newLine();
            bw.write(GolsB1J3.getText() + ";" + GolsB3J3.getText());
            bw.newLine();
            bw.write(GolsB4J4.getText() + ";" + GolsB2J4.getText() );
            bw.newLine();
            bw.write(GolsB4J5.getText() + ";" + GolsB1J5.getText());
            bw.newLine();
            bw.write(GolsB2J6.getText() + ";" + GolsB3J6.getText());
            bw.newLine();
            bw.write(GolsC1J1.getText() + ";"+ GolsC2J1.getText());
            bw.newLine();
            bw.write(GolsC3J2.getText() + ";" + GolsC4J2.getText() );
            bw.newLine();
            bw.write(GolsC1J3.getText() + ";" + GolsC3J3.getText());
            bw.newLine();
            bw.write(GolsC4J4.getText() + ";" + GolsC2J4.getText());
            bw.newLine();
            bw.write(GolsC4J5.getText() + ";" + GolsC1J5.getText() );
            bw.newLine();
            bw.write(GolsC2J6.getText() + ";" + GolsC3J6.getText() );
            bw.newLine();
            bw.write(GolsD1J1.getText() + ";"+ GolsD2J1.getText() );
            bw.newLine();
            bw.write(GolsD3J2.getText() + ";" + GolsD4J2.getText());
            bw.newLine();
            bw.write(GolsD1J3.getText() + ";" + GolsD3J3.getText());
            bw.newLine();
            bw.write(GolsD4J4.getText() + ";" + GolsD2J4.getText() );
            bw.newLine();
            bw.write(GolsD4J5.getText() + ";" + GolsD1J5.getText() );
            bw.newLine();
            bw.write(GolsD2J6.getText() + ";" + GolsD3J6.getText());
            bw.newLine();
            bw.write(GolsE1J1.getText() + ";"+ GolsE2J1.getText() );
            bw.newLine();
            bw.write(GolsE3J2.getText() + ";" + GolsE4J2.getText());
            bw.newLine();
            bw.write(GolsE1J3.getText() + ";" + GolsE3J3.getText() );
            bw.newLine();
            bw.write(GolsE4J4.getText() + ";" + GolsE2J4.getText() );
            bw.newLine();
            bw.write(GolsE4J5.getText() + ";" + GolsE1J5.getText());
            bw.newLine();
            bw.write(GolsE2J6.getText() + ";" + GolsE3J6.getText() );
            bw.newLine();
            bw.write(GolsF1J1.getText() + ";"+ GolsF2J1.getText() );
            bw.newLine();
            bw.write(GolsF3J2.getText() + ";" + GolsF4J2.getText() );
            bw.newLine();
            bw.write(GolsF1J3.getText() + ";" + GolsF3J3.getText() );
            bw.newLine();
            bw.write(GolsF4J4.getText() + ";" + GolsF2J4.getText() );
            bw.newLine();
            bw.write(GolsF4J5.getText() + ";" + GolsF1J5.getText() );
            bw.newLine();
            bw.write(GolsF2J6.getText() + ";" + GolsF3J6.getText() );
            bw.newLine();
            bw.write(GolsG1J1.getText() + ";"+ GolsG2J1.getText() );
            bw.newLine();
            bw.write(GolsG3J2.getText() + ";" + GolsG4J2.getText() );
            bw.newLine();
            bw.write(GolsG1J3.getText() + ";" + GolsG3J3.getText() );
            bw.newLine();
            bw.write(GolsG4J4.getText() + ";" + GolsG2J4.getText() );
            bw.newLine();
            bw.write(GolsG4J5.getText() + ";" + GolsG1J5.getText() );
            bw.newLine();
            bw.write(GolsG2J6.getText() + ";" + GolsG3J6.getText() );
            bw.newLine();
            bw.write(GolsH1J1.getText() + ";"+ GolsH2J1.getText());
            bw.newLine();
            bw.write(GolsH3J2.getText() + ";" + GolsH4J2.getText());
            bw.newLine();
            bw.write(GolsH1J3.getText() + ";" + GolsH3J3.getText());
            bw.newLine();
            bw.write(GolsH4J4.getText() + ";" + GolsH2J4.getText() );
            bw.newLine();
            bw.write(GolsH4J5.getText() + ";" + GolsH1J5.getText());
            bw.newLine();
            bw.write(GolsH2J6.getText() + ";" + GolsH3J6.getText() );
            bw.newLine();
            //Oitavas:
            bw.write(GfstA.getText() + ";" + GsndB.getText() + ";" + PfstA.getText() + ";" + PsndB.getText());
            bw.newLine();
            bw.write(GfstC.getText() + ";" + GsndD.getText() + ";" + PfstC.getText() + ";" + PsndD.getText());
            bw.newLine();
            bw.write(GfstE.getText() + ";" + GsndF.getText() + ";" + PfstE.getText() + ";" + PsndE.getText());
            bw.newLine();
            bw.write(GfstG.getText() + ";" + GsndH.getText() + ";" + PfstG.getText() + ";" + PsndH.getText() );
            bw.newLine();
            bw.write(GfstB.getText() + ";" + GsndA.getText() + ";" + PfstB.getText() + ";" + PsndA.getText() );
            bw.newLine();
            bw.write(GfstD.getText() + ";" + GsndC.getText() + ";" + PfstD.getText() + ";" + PsndC.getText() );
            bw.newLine();
            bw.write(GfstF.getText() + ";" + GsndE.getText() + ";" + PfstF.getText() + ";" + PsndF.getText());
            bw.newLine();
            bw.write(GfstH.getText() + ";" + GsndG.getText() + ";" + PfstH.getText() + ";" + PsndG.getText());
            bw.newLine();
            //Quartas
            bw.write(Gvo1.getText() + ";" + Gvo2.getText() + ";" + Pvo1.getText() + ";" + Pvo2.getText() );
            bw.newLine();
            bw.write(Gvo3.getText() + ";" + Gvo4.getText() + ";" + Pvo3.getText() + ";" + Pvo4.getText());
            bw.newLine();
            bw.write(Gvo5.getText() + ";" + Gvo6.getText() + ";" + Pvo5.getText() + ";" + Pvo6.getText() );
            bw.newLine();
            bw.write(Gvo7.getText() + ";" + Gvo8.getText() + ";" + Pvo7.getText() + ";" + Pvo8.getText() );
            bw.newLine();
            //Semis
            bw.write(Gvq1.getText() + ";" + Gvq2.getText() + ";" + Pvq1.getText() + ";" + Pvq2.getText() );
            bw.newLine();
            bw.write(Gvq3.getText() + ";" + Gvq4.getText() + ";" + Pvq3.getText() + ";" + Pvq4.getText());
            bw.newLine();
            //Finais
            bw.write(Gps1.getText() + ";" + Gps2.getText() + ";" + PenPS1.getText() + ";" + PenPS2.getText());
            bw.newLine();

            bw.write(Gvs1.getText() + ";" + Gvs2.getText() + ";" + PenVS1.getText() + ";" + PenVS2.getText());


        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            bw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    private void botaoFinais(ActionEvent e){
        JOptionPane.showMessageDialog(null,
                "Resultados Salvos", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        montarRanking();
        File arquivo = new File("C:/Users/diego/Desktop/WC/tabelaCopa.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(arquivo);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write(GolsA1J1.getText() + ";"+ GolsA2J1.getText());
            bw.newLine();
            bw.write(GolsA3J2.getText() + ";" + GolsA4J2.getText());
            bw.newLine();
            bw.write(GolsA1J3.getText() + ";" + GolsA3J3.getText());
            bw.newLine();
            bw.write(GolsA4J4.getText() + ";" + GolsA2J4.getText());
            bw.newLine();
            bw.write(GolsA4J5.getText() + ";" + GolsA1J5.getText());
            bw.newLine();
            bw.write(GolsA2J6.getText() + ";" + GolsA3J6.getText());
            bw.newLine();
            bw.write(GolsB1J1.getText() + ";"+ GolsB2J1.getText());
            bw.newLine();
            bw.write(GolsB3J2.getText() + ";" + GolsB4J2.getText());
            bw.newLine();
            bw.write(GolsB1J3.getText() + ";" + GolsB3J3.getText());
            bw.newLine();
            bw.write(GolsB4J4.getText() + ";" + GolsB2J4.getText() );
            bw.newLine();
            bw.write(GolsB4J5.getText() + ";" + GolsB1J5.getText());
            bw.newLine();
            bw.write(GolsB2J6.getText() + ";" + GolsB3J6.getText());
            bw.newLine();
            bw.write(GolsC1J1.getText() + ";"+ GolsC2J1.getText());
            bw.newLine();
            bw.write(GolsC3J2.getText() + ";" + GolsC4J2.getText() );
            bw.newLine();
            bw.write(GolsC1J3.getText() + ";" + GolsC3J3.getText());
            bw.newLine();
            bw.write(GolsC4J4.getText() + ";" + GolsC2J4.getText());
            bw.newLine();
            bw.write(GolsC4J5.getText() + ";" + GolsC1J5.getText() );
            bw.newLine();
            bw.write(GolsC2J6.getText() + ";" + GolsC3J6.getText() );
            bw.newLine();
            bw.write(GolsD1J1.getText() + ";"+ GolsD2J1.getText() );
            bw.newLine();
            bw.write(GolsD3J2.getText() + ";" + GolsD4J2.getText());
            bw.newLine();
            bw.write(GolsD1J3.getText() + ";" + GolsD3J3.getText());
            bw.newLine();
            bw.write(GolsD4J4.getText() + ";" + GolsD2J4.getText() );
            bw.newLine();
            bw.write(GolsD4J5.getText() + ";" + GolsD1J5.getText() );
            bw.newLine();
            bw.write(GolsD2J6.getText() + ";" + GolsD3J6.getText());
            bw.newLine();
            bw.write(GolsE1J1.getText() + ";"+ GolsE2J1.getText() );
            bw.newLine();
            bw.write(GolsE3J2.getText() + ";" + GolsE4J2.getText());
            bw.newLine();
            bw.write(GolsE1J3.getText() + ";" + GolsE3J3.getText() );
            bw.newLine();
            bw.write(GolsE4J4.getText() + ";" + GolsE2J4.getText() );
            bw.newLine();
            bw.write(GolsE4J5.getText() + ";" + GolsE1J5.getText());
            bw.newLine();
            bw.write(GolsE2J6.getText() + ";" + GolsE3J6.getText() );
            bw.newLine();
            bw.write(GolsF1J1.getText() + ";"+ GolsF2J1.getText() );
            bw.newLine();
            bw.write(GolsF3J2.getText() + ";" + GolsF4J2.getText() );
            bw.newLine();
            bw.write(GolsF1J3.getText() + ";" + GolsF3J3.getText() );
            bw.newLine();
            bw.write(GolsF4J4.getText() + ";" + GolsF2J4.getText() );
            bw.newLine();
            bw.write(GolsF4J5.getText() + ";" + GolsF1J5.getText() );
            bw.newLine();
            bw.write(GolsF2J6.getText() + ";" + GolsF3J6.getText() );
            bw.newLine();
            bw.write(GolsG1J1.getText() + ";"+ GolsG2J1.getText() );
            bw.newLine();
            bw.write(GolsG3J2.getText() + ";" + GolsG4J2.getText() );
            bw.newLine();
            bw.write(GolsG1J3.getText() + ";" + GolsG3J3.getText() );
            bw.newLine();
            bw.write(GolsG4J4.getText() + ";" + GolsG2J4.getText() );
            bw.newLine();
            bw.write(GolsG4J5.getText() + ";" + GolsG1J5.getText() );
            bw.newLine();
            bw.write(GolsG2J6.getText() + ";" + GolsG3J6.getText() );
            bw.newLine();
            bw.write(GolsH1J1.getText() + ";"+ GolsH2J1.getText());
            bw.newLine();
            bw.write(GolsH3J2.getText() + ";" + GolsH4J2.getText());
            bw.newLine();
            bw.write(GolsH1J3.getText() + ";" + GolsH3J3.getText());
            bw.newLine();
            bw.write(GolsH4J4.getText() + ";" + GolsH2J4.getText() );
            bw.newLine();
            bw.write(GolsH4J5.getText() + ";" + GolsH1J5.getText());
            bw.newLine();
            bw.write(GolsH2J6.getText() + ";" + GolsH3J6.getText() );
            bw.newLine();
                            //Oitavas:
            bw.write(GfstA.getText() + ";" + GsndB.getText() + ";" + PfstA.getText() + ";" + PsndB.getText());
            bw.newLine();
            bw.write(GfstC.getText() + ";" + GsndD.getText() + ";" + PfstC.getText() + ";" + PsndD.getText());
            bw.newLine();
            bw.write(GfstE.getText() + ";" + GsndF.getText() + ";" + PfstE.getText() + ";" + PsndE.getText());
            bw.newLine();
            bw.write(GfstG.getText() + ";" + GsndH.getText() + ";" + PfstG.getText() + ";" + PsndH.getText() );
            bw.newLine();
            bw.write(GfstB.getText() + ";" + GsndA.getText() + ";" + PfstB.getText() + ";" + PsndA.getText() );
            bw.newLine();
            bw.write(GfstD.getText() + ";" + GsndC.getText() + ";" + PfstD.getText() + ";" + PsndC.getText() );
            bw.newLine();
            bw.write(GfstF.getText() + ";" + GsndE.getText() + ";" + PfstF.getText() + ";" + PsndF.getText());
            bw.newLine();
            bw.write(GfstH.getText() + ";" + GsndG.getText() + ";" + PfstH.getText() + ";" + PsndG.getText());
            bw.newLine();
                            //Quartas
            bw.write(Gvo1.getText() + ";" + Gvo2.getText() + ";" + Pvo1.getText() + ";" + Pvo2.getText() );
            bw.newLine();
            bw.write(Gvo3.getText() + ";" + Gvo4.getText() + ";" + Pvo3.getText() + ";" + Pvo4.getText());
            bw.newLine();
            bw.write(Gvo5.getText() + ";" + Gvo6.getText() + ";" + Pvo5.getText() + ";" + Pvo6.getText() );
            bw.newLine();
            bw.write(Gvo7.getText() + ";" + Gvo8.getText() + ";" + Pvo7.getText() + ";" + Pvo8.getText() );
            bw.newLine();
                            //Semis
            bw.write(Gvq1.getText() + ";" + Gvq2.getText() + ";" + Pvq1.getText() + ";" + Pvq2.getText() );
            bw.newLine();
            bw.write(Gvq3.getText() + ";" + Gvq4.getText() + ";" + Pvq3.getText() + ";" + Pvq4.getText());
            bw.newLine();
                            //Finais
            bw.write(Gps1.getText() + ";" + Gps2.getText() + ";" + PenPS1.getText() + ";" + PenPS2.getText());
            bw.newLine();

            bw.write(Gvs1.getText() + ";" + Gvs2.getText() + ";" + PenVS1.getText() + ";" + PenVS2.getText());


        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            bw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }

    private void montaGrupoA(){

        propriedadesCatar();
        propriedadesEquador();
        propriedadesSenegal();
        propriedadesHolanda();
        grupoa.add(0,catar);
        grupoa.add(1,equador);
        grupoa.add(2,senegal);
        grupoa.add(3,holanda);

        //Organiza as posições
        Collections.sort(grupoa, ordenacao);

        //Atualiza a Tabela
        T1A.setText(grupoa.get(0).getPais());
        T2A.setText(grupoa.get(1).getPais());
        T3A.setText(grupoa.get(2).getPais());
        T4A.setText(grupoa.get(3).getPais());

        P1A.setText(String.format("%d", grupoa.get(0).getPontos()));
        P2A.setText(String.format("%d", grupoa.get(1).getPontos()));
        P3A.setText(String.format("%d", grupoa.get(2).getPontos()));
        P4A.setText(String.format("%d", grupoa.get(3).getPontos()));

        S1A.setText(String.format("%d", grupoa.get(0).getSaldo()));
        S2A.setText(String.format("%d", grupoa.get(1).getSaldo()));
        S3A.setText(String.format("%d", grupoa.get(2).getSaldo()));
        S4A.setText(String.format("%d", grupoa.get(3).getSaldo()));

        G1A.setText(String.format("%d", grupoa.get(0).getGolsPro()));
        G2A.setText(String.format("%d", grupoa.get(1).getGolsPro()));
        G3A.setText(String.format("%d", grupoa.get(2).getGolsPro()));
        G4A.setText(String.format("%d", grupoa.get(3).getGolsPro()));

        fstA.setText(grupoa.get(0).getPais());
        sndA.setText(grupoa.get(1).getPais());
    }
    private void montaGrupoB(){
        propriedadesInglaterra();
        propriedadesIran();
        propriedadesEua();
        propriedadesGales();
        grupob.add(0,inglaterra);
        grupob.add(1,iran);
        grupob.add(2,eua);
        grupob.add(3,gales);

        //Organiza as posições
        Collections.sort(grupob, ordenacao);

        //Atualiza a Tabela
        T1B.setText(grupob.get(0).getPais());
        T2B.setText(grupob.get(1).getPais());
        T3B.setText(grupob.get(2).getPais());
        T4B.setText(grupob.get(3).getPais());

        P1B.setText(String.format("%d", grupob.get(0).getPontos()));
        P2B.setText(String.format("%d", grupob.get(1).getPontos()));
        P3B.setText(String.format("%d", grupob.get(2).getPontos()));
        P4B.setText(String.format("%d", grupob.get(3).getPontos()));

        S1B.setText(String.format("%d", grupob.get(0).getSaldo()));
        S2B.setText(String.format("%d", grupob.get(1).getSaldo()));
        S3B.setText(String.format("%d", grupob.get(2).getSaldo()));
        S4B.setText(String.format("%d", grupob.get(3).getSaldo()));

        G1B.setText(String.format("%d", grupob.get(0).getGolsPro()));
        G2B.setText(String.format("%d", grupob.get(1).getGolsPro()));
        G3B.setText(String.format("%d", grupob.get(2).getGolsPro()));
        G4B.setText(String.format("%d", grupob.get(3).getGolsPro()));

        fstB.setText(grupob.get(0).getPais());
        sndB.setText(grupob.get(1).getPais());

    }
    private void montaGrupoC(){
        propriedadesArgentina();
        propriedadesArabia();
        propriedadesMexico();
        propriedadesPolonia();
        grupoc.add(0,argentina);
        grupoc.add(1,arabia);
        grupoc.add(2,mexico);
        grupoc.add(3,polonia);

        //Organiza as posições
        Collections.sort(grupoc, ordenacao);

        //Atualiza a Tabela
        T1C.setText(grupoc.get(0).getPais());
        T2C.setText(grupoc.get(1).getPais());
        T3C.setText(grupoc.get(2).getPais());
        T4C.setText(grupoc.get(3).getPais());

        P1C.setText(String.format("%d", grupoc.get(0).getPontos()));
        P2C.setText(String.format("%d", grupoc.get(1).getPontos()));
        P3C.setText(String.format("%d", grupoc.get(2).getPontos()));
        P4C.setText(String.format("%d", grupoc.get(3).getPontos()));

        S1C.setText(String.format("%d", grupoc.get(0).getSaldo()));
        S2C.setText(String.format("%d", grupoc.get(1).getSaldo()));
        S3C.setText(String.format("%d", grupoc.get(2).getSaldo()));
        S4C.setText(String.format("%d", grupoc.get(3).getSaldo()));

        G1C.setText(String.format("%d", grupoc.get(0).getGolsPro()));
        G2C.setText(String.format("%d", grupoc.get(1).getGolsPro()));
        G3C.setText(String.format("%d", grupoc.get(2).getGolsPro()));
        G4C.setText(String.format("%d", grupoc.get(3).getGolsPro()));

        fstC.setText(grupoc.get(0).getPais());
        sndC.setText(grupoc.get(1).getPais());

    }
    private void montaGrupoD(){

        propriedadesFranca();
        propriedadesAustralia();
        propriedadesDinamarca();
        propriedadesTunisia();

        grupod.add(0,franca);
        grupod.add(1,australia);
        grupod.add(2,dinamarca);
        grupod.add(3,tunisia);

        //Organiza as posições
        Collections.sort(grupod, ordenacao);

        //Atualiza a Tabela
        T1D.setText(grupod.get(0).getPais());
        T2D.setText(grupod.get(1).getPais());
        T3D.setText(grupod.get(2).getPais());
        T4D.setText(grupod.get(3).getPais());

        P1D.setText(String.format("%d", grupod.get(0).getPontos()));
        P2D.setText(String.format("%d", grupod.get(1).getPontos()));
        P3D.setText(String.format("%d", grupod.get(2).getPontos()));
        P4D.setText(String.format("%d", grupod.get(3).getPontos()));

        S1D.setText(String.format("%d", grupod.get(0).getSaldo()));
        S2D.setText(String.format("%d", grupod.get(1).getSaldo()));
        S3D.setText(String.format("%d", grupod.get(2).getSaldo()));
        S4D.setText(String.format("%d", grupod.get(3).getSaldo()));

        G1D.setText(String.format("%d", grupod.get(0).getGolsPro()));
        G2D.setText(String.format("%d", grupod.get(1).getGolsPro()));
        G3D.setText(String.format("%d", grupod.get(2).getGolsPro()));
        G4D.setText(String.format("%d", grupod.get(3).getGolsPro()));

        fstD.setText(grupod.get(0).getPais());
        sndD.setText(grupod.get(1).getPais());
    }
    private void montaGrupoE(){

        propriedadesEspanha();
        propriedadesCostaR();
        propriedadesAlemanha();
        propriedadesJapao();

        grupoe.add(0,espanha);
        grupoe.add(1,costa);
        grupoe.add(2,alemanha);
        grupoe.add(3,japao);

        //Organiza as posições
        Collections.sort(grupoe, ordenacao);

        //Atualiza a Tabela
        T1E.setText(grupoe.get(0).getPais());
        T2E.setText(grupoe.get(1).getPais());
        T3E.setText(grupoe.get(2).getPais());
        T4E.setText(grupoe.get(3).getPais());

        P1E.setText(String.format("%d", grupoe.get(0).getPontos()));
        P2E.setText(String.format("%d", grupoe.get(1).getPontos()));
        P3E.setText(String.format("%d", grupoe.get(2).getPontos()));
        P4E.setText(String.format("%d", grupoe.get(3).getPontos()));

        S1E.setText(String.format("%d", grupoe.get(0).getSaldo()));
        S2E.setText(String.format("%d", grupoe.get(1).getSaldo()));
        S3E.setText(String.format("%d", grupoe.get(2).getSaldo()));
        S4E.setText(String.format("%d", grupoe.get(3).getSaldo()));

        G1E.setText(String.format("%d", grupoe.get(0).getGolsPro()));
        G2E.setText(String.format("%d", grupoe.get(1).getGolsPro()));
        G3E.setText(String.format("%d", grupoe.get(2).getGolsPro()));
        G4E.setText(String.format("%d", grupoe.get(3).getGolsPro()));

        fstE.setText(grupoe.get(0).getPais());
        sndE.setText(grupoe.get(1).getPais());
    }
    private void montaGrupoF(){

        propriedadesBelgica();
        propriedadesCanada();
        propriedadesMarrocos();
        propriedadesCroacia();

        grupof.add(0,belgica);
        grupof.add(1,canada);
        grupof.add(2,marrocos);
        grupof.add(3,croacia);

        //Organiza as posições
        Collections.sort(grupof, ordenacao);

        //Atualiza a Tabela
        T1F.setText(grupof.get(0).getPais());
        T2F.setText(grupof.get(1).getPais());
        T3F.setText(grupof.get(2).getPais());
        T4F.setText(grupof.get(3).getPais());

        P1F.setText(String.format("%d", grupof.get(0).getPontos()));
        P2F.setText(String.format("%d", grupof.get(1).getPontos()));
        P3F.setText(String.format("%d", grupof.get(2).getPontos()));
        P4F.setText(String.format("%d", grupof.get(3).getPontos()));

        S1F.setText(String.format("%d", grupof.get(0).getSaldo()));
        S2F.setText(String.format("%d", grupof.get(1).getSaldo()));
        S3F.setText(String.format("%d", grupof.get(2).getSaldo()));
        S4F.setText(String.format("%d", grupof.get(3).getSaldo()));

        G1F.setText(String.format("%d", grupof.get(0).getGolsPro()));
        G2F.setText(String.format("%d", grupof.get(1).getGolsPro()));
        G3F.setText(String.format("%d", grupof.get(2).getGolsPro()));
        G4F.setText(String.format("%d", grupof.get(3).getGolsPro()));

        fstF.setText(grupof.get(0).getPais());
        sndF.setText(grupof.get(1).getPais());
    }
    private void montaGrupoG(){

        propriedadesBrasil();
        propriedadesServia();
        propriedadesSuica();
        propriedadesCamaroes();

        grupog.add(0,brasil);
        grupog.add(1,servia);
        grupog.add(2,suica);
        grupog.add(3,camaroes);

        //Organiza as posições
        Collections.sort(grupog, ordenacao);

        //Atualiza a Tabela
        T1G.setText(grupog.get(0).getPais());
        T2G.setText(grupog.get(1).getPais());
        T3G.setText(grupog.get(2).getPais());
        T4G.setText(grupog.get(3).getPais());

        P1G.setText(String.format("%d", grupog.get(0).getPontos()));
        P2G.setText(String.format("%d", grupog.get(1).getPontos()));
        P3G.setText(String.format("%d", grupog.get(2).getPontos()));
        P4G.setText(String.format("%d", grupog.get(3).getPontos()));

        S1G.setText(String.format("%d", grupog.get(0).getSaldo()));
        S2G.setText(String.format("%d", grupog.get(1).getSaldo()));
        S3G.setText(String.format("%d", grupog.get(2).getSaldo()));
        S4G.setText(String.format("%d", grupog.get(3).getSaldo()));

        G1G.setText(String.format("%d", grupog.get(0).getGolsPro()));
        G2G.setText(String.format("%d", grupog.get(1).getGolsPro()));
        G3G.setText(String.format("%d", grupog.get(2).getGolsPro()));
        G4G.setText(String.format("%d", grupog.get(3).getGolsPro()));

        fstG.setText(grupog.get(0).getPais());
        sndG.setText(grupog.get(1).getPais());
    }
    private void montaGrupoH(){

        propriedadesPortugal();
        propriedadesGana();
        propriedadesUruguai();
        propriedadesCoreia();

        grupoh.add(0,portugal);
        grupoh.add(1,gana);
        grupoh.add(2,uruguai);
        grupoh.add(3,coreia);

        //Organiza as posições
        Collections.sort(grupoh, ordenacao);

        //Atualiza a Tabela
        T1H.setText(grupoh.get(0).getPais());
        T2H.setText(grupoh.get(1).getPais());
        T3H.setText(grupoh.get(2).getPais());
        T4H.setText(grupoh.get(3).getPais());

        P1H.setText(String.format("%d", grupoh.get(0).getPontos()));
        P2H.setText(String.format("%d", grupoh.get(1).getPontos()));
        P3H.setText(String.format("%d", grupoh.get(2).getPontos()));
        P4H.setText(String.format("%d", grupoh.get(3).getPontos()));

        S1H.setText(String.format("%d", grupoh.get(0).getSaldo()));
        S2H.setText(String.format("%d", grupoh.get(1).getSaldo()));
        S3H.setText(String.format("%d", grupoh.get(2).getSaldo()));
        S4H.setText(String.format("%d", grupoh.get(3).getSaldo()));

        G1H.setText(String.format("%d", grupoh.get(0).getGolsPro()));
        G2H.setText(String.format("%d", grupoh.get(1).getGolsPro()));
        G3H.setText(String.format("%d", grupoh.get(2).getGolsPro()));
        G4H.setText(String.format("%d", grupoh.get(3).getGolsPro()));

        fstH.setText(grupoh.get(0).getPais());
        sndH.setText(grupoh.get(1).getPais());
    }

    private void montarQuartas(){
        //Oitavas 1
        if(PfstA.getText().equals("0") && PsndB.getText().equals("0")){
            if(Integer.parseInt(GfstA.getText()) > Integer.parseInt(GsndB.getText())){
                VO1.setText(fstA.getText());
            }
            else if (Integer.parseInt(GfstA.getText()) < Integer.parseInt(GsndB.getText())){
                VO1.setText(sndB.getText());
            }
        }else{
            if(Integer.parseInt(PfstA.getText()) > Integer.parseInt(PsndB.getText())){
                VO1.setText(fstA.getText());
            } else if(Integer.parseInt(PfstA.getText()) < Integer.parseInt(PsndB.getText())){
                VO1.setText(sndB.getText());
            }
        }
        //Oitavas 2
        if(PfstC.getText().equals("0") && PsndD.getText().equals("0")){
            if(Integer.parseInt(GfstC.getText()) > Integer.parseInt(GsndD.getText())){
                VO2.setText(fstC.getText());
            }
            else if (Integer.parseInt(GfstC.getText()) < Integer.parseInt(GsndD.getText())){
                VO2.setText(sndD.getText());
            }
        }else{
            if(Integer.parseInt(PfstC.getText()) > Integer.parseInt(PsndD.getText())){
                VO2.setText(fstC.getText());
            } else if(Integer.parseInt(PfstC.getText()) < Integer.parseInt(PsndD.getText())){
                VO2.setText(sndD.getText());
            }
        }
        //Oitavas 3
        if(PfstE.getText().equals("0") && PsndF.getText().equals("0")){
            if(Integer.parseInt(GfstE.getText()) > Integer.parseInt(GsndF.getText())){
                VO3.setText(fstE.getText());
            }
            else if (Integer.parseInt(GfstE.getText()) < Integer.parseInt(GsndF.getText())){
                VO3.setText(sndF.getText());
            }
        }else{
            if(Integer.parseInt(PfstE.getText()) > Integer.parseInt(PsndF.getText())){
                VO3.setText(fstE.getText());
            } else if(Integer.parseInt(PfstE.getText()) < Integer.parseInt(PsndF.getText())){
                VO3.setText(sndF.getText());
            }
        }
        //Oitavas 4
        if(PfstG.getText().equals("0") && PsndH.getText().equals("0")){
            if(Integer.parseInt(GfstG.getText()) > Integer.parseInt(GsndH.getText())){
                VO4.setText(fstG.getText());
            }
            else if (Integer.parseInt(GfstG.getText()) < Integer.parseInt(GsndH.getText())){
                VO4.setText(sndH.getText());
            }
        }else{
            if(Integer.parseInt(PfstG.getText()) > Integer.parseInt(PsndH.getText())){
                VO4.setText(fstG.getText());
            } else if(Integer.parseInt(PfstG.getText()) < Integer.parseInt(PsndH.getText())){
                VO4.setText(sndH.getText());
            }
        }
        //Oitavas 5
        if(PfstB.getText().equals("0") && PsndA.getText().equals("0")){
            if(Integer.parseInt(GfstB.getText()) > Integer.parseInt(GsndA.getText())){
                VO5.setText(fstB.getText());
            }
            else if (Integer.parseInt(GfstB.getText()) < Integer.parseInt(GsndA.getText())){
                VO5.setText(sndA.getText());
            }
        }else{
            if(Integer.parseInt(PfstB.getText()) > Integer.parseInt(PsndA.getText())){
                VO5.setText(fstB.getText());
            } else if(Integer.parseInt(PfstB.getText()) < Integer.parseInt(PsndA.getText())){
                VO5.setText(sndA.getText());
            }
        }
        //Oitavas 6
        if(PfstD.getText().equals("0") && PsndC.getText().equals("0")){
            if(Integer.parseInt(GfstD.getText()) > Integer.parseInt(GsndC.getText())){
                VO6.setText(fstD.getText());
            }
            else if (Integer.parseInt(GfstD.getText()) < Integer.parseInt(GsndC.getText())){
                VO6.setText(sndC.getText());
            }
        }else{
            if(Integer.parseInt(PfstD.getText()) > Integer.parseInt(PsndC.getText())){
                VO6.setText(fstD.getText());
            } else if(Integer.parseInt(PfstD.getText()) < Integer.parseInt(PsndC.getText())){
                VO6.setText(sndC.getText());
            }
        }
        //Oitavas 7
        if(PfstF.getText().equals("0") && PsndE.getText().equals("0")){
            if(Integer.parseInt(GfstF.getText()) > Integer.parseInt(GsndE.getText())){
                VO7.setText(fstF.getText());
            }
            else if (Integer.parseInt(GfstF.getText()) < Integer.parseInt(GsndE.getText())){
                VO7.setText(sndE.getText());
            }
        }else{
            if(Integer.parseInt(PfstF.getText()) > Integer.parseInt(PsndE.getText())){
                VO7.setText(fstF.getText());
            } else if(Integer.parseInt(PfstF.getText()) < Integer.parseInt(PsndE.getText())){
                VO7.setText(sndE.getText());
            }
        }
        //Oitavas 8
        if(PfstH.getText().equals("0") && PsndG.getText().equals("0")){
            if(Integer.parseInt(GfstH.getText()) > Integer.parseInt(GsndG.getText())){
                VO8.setText(fstH.getText());
            }
            else if (Integer.parseInt(GfstH.getText()) < Integer.parseInt(GsndG.getText())){
                VO8.setText(sndG.getText());
            }
        }else{
            if(Integer.parseInt(PfstH.getText()) > Integer.parseInt(PsndG.getText())){
                VO8.setText(fstH.getText());
            } else if(Integer.parseInt(PfstH.getText()) < Integer.parseInt(PsndG.getText())){
                VO8.setText(sndG.getText());
            }
        }
    }
    private void montarSemis(){
        //Quartas 1
        if(Pvo1.getText().equals("0") && Pvo2.getText().equals("0")){
            if(Integer.parseInt(Gvo1.getText()) > Integer.parseInt(Gvo2.getText())){
                VQ1.setText(VO1.getText());
            }
            else if(Integer.parseInt(Gvo1.getText()) < Integer.parseInt(Gvo2.getText())){
                VQ1.setText(VO2.getText());
            }
        }else{
            if(Integer.parseInt(Pvo1.getText()) > Integer.parseInt(Pvo2.getText())){
                VQ1.setText(VO1.getText());
            }
            else if(Integer.parseInt(Pvo1.getText()) < Integer.parseInt(Pvo2.getText())){
                VQ1.setText(VO2.getText());
            }
        }
        //Quartas 2
        if(Pvo3.getText().equals("0") && Pvo4.getText().equals("0")){
            if(Integer.parseInt(Gvo3.getText()) > Integer.parseInt(Gvo4.getText())){
                VQ2.setText(VO3.getText());
            }
            else if(Integer.parseInt(Gvo3.getText()) < Integer.parseInt(Gvo4.getText())){
                VQ2.setText(VO4.getText());
            }
        }else{
            if(Integer.parseInt(Pvo3.getText()) > Integer.parseInt(Pvo4.getText())){
                VQ2.setText(VO3.getText());
            }
            else if(Integer.parseInt(Pvo3.getText()) < Integer.parseInt(Pvo4.getText())){
                VQ2.setText(VO4.getText());
            }
        }
        //Quartas 3
        if(Pvo5.getText().equals("0") && Pvo6.getText().equals("0")){
            if(Integer.parseInt(Gvo5.getText()) > Integer.parseInt(Gvo6.getText())){
                VQ3.setText(VO5.getText());
            }
            else if(Integer.parseInt(Gvo5.getText()) < Integer.parseInt(Gvo6.getText())){
                VQ3.setText(VO6.getText());
            }
        }else{
            if(Integer.parseInt(Pvo5.getText()) > Integer.parseInt(Pvo6.getText())){
                VQ3.setText(VO5.getText());
            }
            else if(Integer.parseInt(Pvo5.getText()) < Integer.parseInt(Pvo6.getText())){
                VQ3.setText(VO6.getText());
            }
        }
        //Quartas 4
        if(Pvo7.getText().equals("0") && Pvo8.getText().equals("0")){
            if(Integer.parseInt(Gvo7.getText()) > Integer.parseInt(Gvo8.getText())){
                VQ4.setText(VO7.getText());
            }
            else if(Integer.parseInt(Gvo7.getText()) < Integer.parseInt(Gvo8.getText())){
                VQ4.setText(VO8.getText());
            }
        }else{
            if(Integer.parseInt(Pvo7.getText()) > Integer.parseInt(Pvo8.getText())){
                VQ4.setText(VO7.getText());
            }
            else if(Integer.parseInt(Pvo7.getText()) < Integer.parseInt(Pvo8.getText())){
                VQ4.setText(VO8.getText());
            }
        }

    }
    private void montarFinais(){
        //Semi 1
        if(Pvq1.getText().equals("0") && Pvq2.getText().equals("0")){
            if(Integer.parseInt(Gvq1.getText()) >Integer.parseInt(Gvq2.getText())){
                VS1.setText(VQ1.getText());
                PerdedorS1.setText(VQ2.getText());
            }
            else if(Integer.parseInt(Gvq1.getText()) < Integer.parseInt(Gvq2.getText())){
                VS1.setText(VQ2.getText());
                PerdedorS1.setText(VQ1.getText());
            }
        }
        else{
            if(Integer.parseInt(Pvq1.getText()) >Integer.parseInt(Pvq2.getText())){
                VS1.setText(VQ1.getText());
                PerdedorS1.setText(VQ2.getText());
            }
            else if(Integer.parseInt(Pvq1.getText()) < Integer.parseInt(Pvq2.getText())){
                VS1.setText(VQ2.getText());
                PerdedorS1.setText(VQ1.getText());
            }
        }
        //Semi 2
        if(Pvq3.getText().equals("0") && Pvq4.getText().equals("0")){
            if(Integer.parseInt(Gvq3.getText()) >Integer.parseInt(Gvq4.getText())){
                VS2.setText(VQ3.getText());
                PerdedorS2.setText(VQ4.getText());
            }
            else if(Integer.parseInt(Gvq3.getText()) < Integer.parseInt(Gvq4.getText())){
                VS2.setText(VQ4.getText());
                PerdedorS2.setText(VQ3.getText());
            }
        }
        else{
            if(Integer.parseInt(Pvq3.getText()) >Integer.parseInt(Pvq4.getText())){
                VS2.setText(VQ3.getText());
                PerdedorS2.setText(VQ4.getText());
            }
            else if(Integer.parseInt(Pvq3.getText()) < Integer.parseInt(Pvq4.getText())){
                VS2.setText(VQ4.getText());
                PerdedorS2.setText(VQ3.getText());
            }
        }

    }
    private void montarRanking(){

        //Final
        if(PenVS1.getText().equals("0") && PenVS2.getText().equals("0")){
            if(Integer.parseInt(Gvs1.getText()) > (Integer.parseInt(Gvs2.getText()))){
                TimeCampeao.setText(VS1.getText());
                TimeVice.setText(VS2.getText());
            }
            else if(Integer.parseInt(Gvs1.getText()) < (Integer.parseInt(Gvs2.getText()))){
                TimeCampeao.setText(VS2.getText());
                TimeVice.setText(VS1.getText());
            }
            else{
                if (Integer.parseInt(PenVS1.getText()) > Integer.parseInt(PenVS2.getText())){
                    TimeCampeao.setText(VS1.getText());
                    TimeVice.setText(VS2.getText());
                }
                else if (Integer.parseInt(PenVS1.getText()) < Integer.parseInt(PenVS2.getText())){
                    TimeCampeao.setText(VS2.getText());
                    TimeVice.setText(VS1.getText());
                }
            }
        }

        //3° Lugar
        if(PenPS1.getText().equals("0") && PenPS2.getText().equals("0")){
            if(Integer.parseInt(Gps1.getText()) > Integer.parseInt(Gps2.getText())){
                TimeTerceiro.setText(PerdedorS1.getText());
            }
            else if(Integer.parseInt(Gps1.getText()) < Integer.parseInt(Gps2.getText())){
                TimeTerceiro.setText(PerdedorS2.getText());
            }
        }
        else{
            if(Integer.parseInt(PenPS1.getText()) > Integer.parseInt(PenPS2.getText())){
                TimeTerceiro.setText(PerdedorS1.getText());
            }
            else if(Integer.parseInt(PenPS1.getText()) < Integer.parseInt(PenPS2.getText())){
                TimeTerceiro.setText(PerdedorS2.getText());
            }
        }

    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }



    private void propriedadesCatar(){
        Integer golsProCatar = Integer.parseInt(GolsA1J1.getText()) + Integer.parseInt(GolsA1J3.getText()) + Integer.parseInt(GolsA1J5.getText());

        Integer golsContraCatar = Integer.parseInt(GolsA2J1.getText()) + Integer.parseInt(GolsA3J3.getText()) + Integer.parseInt(GolsA4J5.getText());

        int saldoCatar = golsProCatar - golsContraCatar;

        int pontosCatar = 0;
        int vitoriasCatar = 0;
        int derrotasCatar = 0;
        int empatesCatar = 0;

        if(Integer.parseInt(GolsA1J1.getText()) > Integer.parseInt(GolsA2J1.getText())){
            pontosCatar += 3;
            vitoriasCatar+=1;

        }else if(Integer.parseInt(GolsA1J1.getText()) == Integer.parseInt(GolsA2J1.getText())){
            pontosCatar +=1;
            empatesCatar +=1;
        }else{
            derrotasCatar+=1;
        }
        if(Integer.parseInt(GolsA1J3.getText()) > Integer.parseInt(GolsA3J3.getText())){
            pontosCatar += 3;
            vitoriasCatar+=1;

        }else if(Integer.parseInt(GolsA1J3.getText()) == Integer.parseInt(GolsA3J3.getText())){
            pontosCatar +=1;
            empatesCatar +=1;
        }else{
            derrotasCatar+=1;
        }
        if(Integer.parseInt(GolsA1J5.getText()) > Integer.parseInt(GolsA4J5.getText())){
            pontosCatar += 3;
            vitoriasCatar+=1;

        }else if(Integer.parseInt(GolsA1J5.getText()) == Integer.parseInt(GolsA4J5.getText())){
            pontosCatar +=1;
            empatesCatar +=1;
        }else{
            derrotasCatar+=1;
        }

        catar.setPontos(pontosCatar);
        catar.setSaldo(saldoCatar);
        catar.setGolsPro(golsProCatar);
        catar.setGolsContra(golsContraCatar);
        catar.setVitorias(vitoriasCatar);
        catar.setEmpates(empatesCatar);
        catar.setDerrotas(derrotasCatar);


    }
    private void propriedadesEquador(){
        Integer golsProEquador = Integer.parseInt(GolsA2J1.getText()) + Integer.parseInt(GolsA2J4.getText()) + Integer.parseInt(GolsA2J6.getText());

        Integer golsContraEquador = Integer.parseInt(GolsA1J1.getText()) + Integer.parseInt(GolsA3J6.getText()) + Integer.parseInt(GolsA4J4.getText());

        int saldoEquador = golsProEquador - golsContraEquador;


        int pontosEquador = 0;
        int vitoriasEquador = 0;
        int derrotasEquador = 0;
        int empatesEquador = 0;
        if(Integer.parseInt(GolsA2J1.getText()) > Integer.parseInt(GolsA1J1.getText())){
            pontosEquador +=3;
            vitoriasEquador+=1;

        }else if(Integer.parseInt(GolsA2J1.getText()) == Integer.parseInt(GolsA1J1.getText())){
            pontosEquador += 1;
            empatesEquador +=1;
        }else{
            derrotasEquador+=1;
        }
        if(Integer.parseInt(GolsA2J4.getText()) > Integer.parseInt(GolsA4J4.getText())){
            pontosEquador += 3;
            vitoriasEquador+=1;

        }else if(Integer.parseInt(GolsA2J4.getText()) == Integer.parseInt(GolsA4J4.getText())){
            pontosEquador += 1;
            empatesEquador +=1;
        }else{
            derrotasEquador+=1;
        }
        if(Integer.parseInt(GolsA2J6.getText()) > Integer.parseInt(GolsA3J6.getText())){
            pontosEquador += 3;
            vitoriasEquador+=1;

        }else if(Integer.parseInt(GolsA2J6.getText()) == Integer.parseInt(GolsA3J6.getText())){
            pontosEquador +=1;
            empatesEquador +=1;
        }else{
            derrotasEquador+=1;
        }


        equador.setPontos(pontosEquador);
        equador.setSaldo(saldoEquador);
        equador.setGolsPro(golsProEquador);
        equador.setGolsContra(golsContraEquador);
        equador.setVitorias(vitoriasEquador);
        equador.setEmpates(empatesEquador);
        equador.setDerrotas(derrotasEquador);


    }

    private void propriedadesSenegal(){
        Integer golsProSenegal = Integer.parseInt(GolsA3J2.getText()) + Integer.parseInt(GolsA3J3.getText()) + Integer.parseInt(GolsA3J6.getText());

        Integer golsContraSenegal = Integer.parseInt(GolsA4J2.getText()) + Integer.parseInt(GolsA1J3.getText()) + Integer.parseInt(GolsA2J6.getText());

        int saldoSenegal = golsProSenegal - golsContraSenegal;

        int pontosSenegal = 0;
        int vitoriasSenegal = 0;
        int derrotasSenegal = 0;
        int empatesSenegal = 0;
        if(Integer.parseInt(GolsA3J2.getText()) > Integer.parseInt(GolsA4J2.getText())){
            pontosSenegal += 3;
            vitoriasSenegal+=1;

        }else if(Integer.parseInt(GolsA3J2.getText()) == Integer.parseInt(GolsA4J2.getText())){
            pontosSenegal +=1;
            empatesSenegal +=1;
        }else{
            derrotasSenegal+=1;
        }
        if(Integer.parseInt(GolsA3J3.getText()) > Integer.parseInt(GolsA1J3.getText())){
            pontosSenegal += 3;
            vitoriasSenegal+=1;

        }else if(Integer.parseInt(GolsA3J3.getText()) == Integer.parseInt(GolsA1J3.getText())){
            pontosSenegal += 1;
            empatesSenegal +=1;
        }else{
            derrotasSenegal+=1;
        }
        if(Integer.parseInt(GolsA3J6.getText()) > Integer.parseInt(GolsA2J6.getText())){
            pontosSenegal += 3;
            vitoriasSenegal+=1;

        }else if(Integer.parseInt(GolsA3J6.getText()) == Integer.parseInt(GolsA2J6.getText())){
            pontosSenegal +=1;
            empatesSenegal +=1;
        }else{
            derrotasSenegal+=1;
        }


        senegal.setPontos(pontosSenegal);
        senegal.setSaldo(saldoSenegal);
        senegal.setGolsPro(golsProSenegal);
        senegal.setGolsContra(golsContraSenegal);
        senegal.setVitorias(vitoriasSenegal);
        senegal.setEmpates(empatesSenegal);
        senegal.setDerrotas(derrotasSenegal);

    }
    private void propriedadesHolanda(){
        Integer golsProHolanda = Integer.parseInt(GolsA4J2.getText()) + Integer.parseInt(GolsA4J4.getText()) + Integer.parseInt(GolsA4J5.getText());

        Integer golsContraHolanda = Integer.parseInt(GolsA3J2.getText()) + Integer.parseInt(GolsA2J4.getText()) + Integer.parseInt(GolsA1J5.getText());

        int saldoHolanda = golsProHolanda - golsContraHolanda;


        int pontosHolanda = 0;
        int vitoriasHolanda = 0;
        int derrotasHolanda= 0;
        int empatesHolanda = 0;

        if(Integer.parseInt(GolsA4J2.getText()) > Integer.parseInt(GolsA3J2.getText())){
            pontosHolanda += 3;
            vitoriasHolanda+=1;

        }else if(Integer.parseInt(GolsA4J2.getText()) == Integer.parseInt(GolsA3J2.getText())){
            pontosHolanda += 1;
            empatesHolanda +=1;
        }else{
            derrotasHolanda+=1;
        }
        if(Integer.parseInt(GolsA4J4.getText()) > Integer.parseInt(GolsA2J4.getText())){
            pontosHolanda += 3;
            vitoriasHolanda+=1;

        }else if(Integer.parseInt(GolsA4J4.getText()) == Integer.parseInt(GolsA2J4.getText())){
            pontosHolanda += 1;
            empatesHolanda +=1;
        }else{
            derrotasHolanda+=1;
        }
        if(Integer.parseInt(GolsA4J5.getText()) > Integer.parseInt(GolsA1J5.getText())){
            pontosHolanda += 3;
            vitoriasHolanda+=1;

        }else if(Integer.parseInt(GolsA4J5.getText()) == Integer.parseInt(GolsA1J5.getText())){
            pontosHolanda += 1;
            empatesHolanda +=1;
        }else{
            derrotasHolanda+=1;
        }


        holanda.setPontos(pontosHolanda);
        holanda.setSaldo(saldoHolanda);
        holanda.setGolsPro(golsProHolanda);
        holanda.setGolsContra(golsContraHolanda);
        holanda.setVitorias(vitoriasHolanda);
        holanda.setEmpates(empatesHolanda);
        holanda.setDerrotas(derrotasHolanda);
    }









    private void propriedadesInglaterra(){
        Integer golsProInglaterra = Integer.parseInt(GolsB1J1.getText()) + Integer.parseInt(GolsB1J3.getText()) + Integer.parseInt(GolsB1J5.getText());

        Integer golsContraInglaterra = Integer.parseInt(GolsB2J1.getText()) + Integer.parseInt(GolsB3J3.getText()) + Integer.parseInt(GolsB4J5.getText());

        int saldoInglaterra = golsProInglaterra - golsContraInglaterra;

        int pontosInglaterra = 0;
        int vitoriasInglaterra = 0;
        int derrotasInglaterra = 0;
        int empatesInglaterra = 0;
        if(Integer.parseInt(GolsB1J1.getText()) > Integer.parseInt(GolsB2J1.getText())){
            pontosInglaterra += 3;
            vitoriasInglaterra+=1;

        }else if(Integer.parseInt(GolsB1J1.getText()) == Integer.parseInt(GolsB2J1.getText())){
            pontosInglaterra +=1;
            empatesInglaterra +=1;
        }else{
            derrotasInglaterra+=1;
        }
        if(Integer.parseInt(GolsB1J3.getText()) > Integer.parseInt(GolsB3J3.getText())){
            pontosInglaterra += 3;
            vitoriasInglaterra+=1;

        }else if(Integer.parseInt(GolsB1J3.getText()) == Integer.parseInt(GolsB3J3.getText())){
            pontosInglaterra +=1;
            empatesInglaterra +=1;
        }else{
            derrotasInglaterra+=1;
        }
        if(Integer.parseInt(GolsB1J5.getText()) > Integer.parseInt(GolsB4J5.getText())){
            pontosInglaterra += 3;
            vitoriasInglaterra+=1;

        }else if(Integer.parseInt(GolsB1J5.getText()) == Integer.parseInt(GolsB4J5.getText())){
            pontosInglaterra +=1;
            empatesInglaterra +=1;
        }else{
            derrotasInglaterra+=1;
        }

        inglaterra.setPontos(pontosInglaterra);
        inglaterra.setSaldo(saldoInglaterra);
        inglaterra.setGolsPro(golsProInglaterra);
        inglaterra.setGolsContra(golsContraInglaterra);
        inglaterra.setVitorias(vitoriasInglaterra);
        inglaterra.setEmpates(empatesInglaterra);
        inglaterra.setDerrotas(derrotasInglaterra);


    }
    private void propriedadesIran(){
        Integer golsProIran = Integer.parseInt(GolsB2J1.getText()) + Integer.parseInt(GolsB2J4.getText()) + Integer.parseInt(GolsB2J6.getText());

        Integer golsContraIran = Integer.parseInt(GolsB1J1.getText()) + Integer.parseInt(GolsB3J6.getText()) + Integer.parseInt(GolsB4J4.getText());

        int saldoIran = golsProIran - golsContraIran;


        int pontosIran = 0;
        int vitoriasIran = 0;
        int derrotasIran = 0;
        int empatesIran = 0;
        if(Integer.parseInt(GolsB2J1.getText()) > Integer.parseInt(GolsB1J1.getText())){
            pontosIran +=3;
            vitoriasIran+=1;

        }else if(Integer.parseInt(GolsB2J1.getText()) == Integer.parseInt(GolsB1J1.getText())){
            pontosIran += 1;
            empatesIran +=1;
        }else{
            derrotasIran+=1;
        }
        if(Integer.parseInt(GolsB2J4.getText()) > Integer.parseInt(GolsB4J4.getText())){
            pontosIran += 3;
            vitoriasIran+=1;

        }else if(Integer.parseInt(GolsB2J4.getText()) == Integer.parseInt(GolsB4J4.getText())){
            pontosIran += 1;
            empatesIran +=1;
        }else{
            derrotasIran+=1;
        }
        if(Integer.parseInt(GolsB2J6.getText()) > Integer.parseInt(GolsB3J6.getText())){
            pontosIran += 3;
            vitoriasIran+=1;

        }else if(Integer.parseInt(GolsB2J6.getText()) == Integer.parseInt(GolsB3J6.getText())){
            pontosIran +=1;
            empatesIran +=1;
        }else{
            derrotasIran+=1;
        }


        iran.setPontos(pontosIran);
        iran.setSaldo(saldoIran);
        iran.setGolsPro(golsProIran);
        iran.setGolsContra(golsContraIran);
        iran.setVitorias(vitoriasIran);
        iran.setEmpates(empatesIran);
        iran.setDerrotas(derrotasIran);


    }

    private void propriedadesEua(){
        Integer golsProEua = Integer.parseInt(GolsB3J2.getText()) + Integer.parseInt(GolsB3J3.getText()) + Integer.parseInt(GolsB3J6.getText());

        Integer golsContraEua = Integer.parseInt(GolsB4J2.getText()) + Integer.parseInt(GolsB1J3.getText()) + Integer.parseInt(GolsB2J6.getText());

        int saldoEua = golsProEua - golsContraEua;

        int pontosEua = 0;
        int vitoriasEua = 0;
        int derrotasEua = 0;
        int empatesEua = 0;
        if(Integer.parseInt(GolsB3J2.getText()) > Integer.parseInt(GolsB4J2.getText())){
            pontosEua += 3;
            vitoriasEua+=1;

        }else if(Integer.parseInt(GolsB3J2.getText()) == Integer.parseInt(GolsB4J2.getText())){
            pontosEua +=1;
            empatesEua +=1;
        }else{
            derrotasEua+=1;
        }
        if(Integer.parseInt(GolsB3J3.getText()) > Integer.parseInt(GolsB1J3.getText())){
            pontosEua += 3;
            vitoriasEua+=1;

        }else if(Integer.parseInt(GolsB3J3.getText()) == Integer.parseInt(GolsB1J3.getText())){
            pontosEua += 1;
            empatesEua +=1;
        }else{
            derrotasEua+=1;
        }
        if(Integer.parseInt(GolsB3J6.getText()) > Integer.parseInt(GolsB2J6.getText())){
            pontosEua += 3;
            vitoriasEua+=1;

        }else if(Integer.parseInt(GolsB3J6.getText()) == Integer.parseInt(GolsB2J6.getText())){
            pontosEua +=1;
            empatesEua +=1;
        }else{
            derrotasEua+=1;
        }

        eua.setPontos(pontosEua);
        eua.setSaldo(saldoEua);
        eua.setGolsPro(golsProEua);
        eua.setGolsContra(golsContraEua);
        eua.setVitorias(vitoriasEua);
        eua.setEmpates(empatesEua);
        eua.setDerrotas(derrotasEua);

    }
    private void propriedadesGales(){
        Integer golsProGales = Integer.parseInt(GolsB4J2.getText()) + Integer.parseInt(GolsB4J4.getText()) + Integer.parseInt(GolsB4J5.getText());

        Integer golsContraGales = Integer.parseInt(GolsB3J2.getText()) + Integer.parseInt(GolsB2J4.getText()) + Integer.parseInt(GolsB1J5.getText());

        int saldoGales = golsProGales - golsContraGales;



        int pontosGales = 0;
        int vitoriasGales = 0;
        int derrotasGales= 0;
        int empatesGales = 0;

        if(Integer.parseInt(GolsB4J2.getText()) > Integer.parseInt(GolsB3J2.getText())){
            pontosGales += 3;
            vitoriasGales+=1;

        }else if(Integer.parseInt(GolsB4J2.getText()) == Integer.parseInt(GolsB3J2.getText())){
            pontosGales += 1;
            empatesGales +=1;
        }else{
            derrotasGales+=1;
        }
        if(Integer.parseInt(GolsB4J4.getText()) > Integer.parseInt(GolsB2J4.getText())){
            pontosGales += 3;
            vitoriasGales+=1;

        }else if(Integer.parseInt(GolsB4J4.getText()) == Integer.parseInt(GolsB2J4.getText())){
            pontosGales += 1;
            empatesGales +=1;
        }else{
            derrotasGales+=1;
        }
        if(Integer.parseInt(GolsB4J5.getText()) > Integer.parseInt(GolsB1J5.getText())){
            pontosGales += 3;
            vitoriasGales+=1;

        }else if(Integer.parseInt(GolsB4J5.getText()) == Integer.parseInt(GolsB1J5.getText())){
            pontosGales += 1;
            empatesGales +=1;
        }else{
            derrotasGales+=1;
        }


        gales.setPontos(pontosGales);
        gales.setSaldo(saldoGales);
        gales.setGolsPro(golsProGales);
        gales.setGolsContra(golsContraGales);
        gales.setVitorias(vitoriasGales);
        gales.setEmpates(empatesGales);
        gales.setDerrotas(derrotasGales);
    }


    private void propriedadesArgentina(){
        Integer golsProArgentina = Integer.parseInt(GolsC1J1.getText()) + Integer.parseInt(GolsC1J3.getText()) + Integer.parseInt(GolsC1J5.getText());

        Integer golsContraArgentina = Integer.parseInt(GolsC2J1.getText()) + Integer.parseInt(GolsC3J3.getText()) + Integer.parseInt(GolsC4J5.getText());

        int saldoArgentina = golsProArgentina - golsContraArgentina;


        int pontosArgentina = 0;
        int vitoriasArgentina = 0;
        int derrotasArgentina = 0;
        int empatesArgentina = 0;

        if(Integer.parseInt(GolsC1J1.getText()) > Integer.parseInt(GolsC2J1.getText())){
            pontosArgentina += 3;
            vitoriasArgentina+=1;

        }else if(Integer.parseInt(GolsC1J1.getText()) == Integer.parseInt(GolsC2J1.getText())){
            pontosArgentina +=1;
            empatesArgentina +=1;
        }else{
            derrotasArgentina+=1;
        }
        if(Integer.parseInt(GolsC1J3.getText()) > Integer.parseInt(GolsC3J3.getText())){
            pontosArgentina += 3;
            vitoriasArgentina+=1;

        }else if(Integer.parseInt(GolsC1J3.getText()) == Integer.parseInt(GolsC3J3.getText())){
            pontosArgentina +=1;
            empatesArgentina +=1;
        }else{
            derrotasArgentina+=1;
        }
        if(Integer.parseInt(GolsC1J5.getText()) > Integer.parseInt(GolsC4J5.getText())){
            pontosArgentina += 3;
            vitoriasArgentina+=1;

        }else if(Integer.parseInt(GolsC1J5.getText()) == Integer.parseInt(GolsC4J5.getText())){
            pontosArgentina +=1;
            empatesArgentina +=1;
        }else{
            derrotasArgentina+=1;
        }


        argentina.setPontos(pontosArgentina);
        argentina.setSaldo(saldoArgentina);
        argentina.setGolsPro(golsProArgentina);
        argentina.setGolsContra(golsContraArgentina);
        argentina.setVitorias(vitoriasArgentina);
        argentina.setEmpates(empatesArgentina);
        argentina.setDerrotas(derrotasArgentina);


    }
    private void propriedadesArabia(){
        Integer golsProArabia = Integer.parseInt(GolsC2J1.getText()) + Integer.parseInt(GolsC2J4.getText()) + Integer.parseInt(GolsC2J6.getText());

        Integer golsContraArabia = Integer.parseInt(GolsC1J1.getText()) + Integer.parseInt(GolsC3J6.getText()) + Integer.parseInt(GolsC4J4.getText());

        int saldoArabia = golsProArabia - golsContraArabia;


        int pontosArabia = 0;
        int vitoriasArabia = 0;
        int derrotasArabia = 0;
        int empatesArabia = 0;
        if(Integer.parseInt(GolsC2J1.getText()) > Integer.parseInt(GolsC1J1.getText())){
            pontosArabia +=3;
            vitoriasArabia+=1;

        }else if(Integer.parseInt(GolsC2J1.getText()) == Integer.parseInt(GolsC1J1.getText())){
            pontosArabia += 1;
            empatesArabia +=1;
        }else{
            derrotasArabia+=1;
        }
        if(Integer.parseInt(GolsC2J4.getText()) > Integer.parseInt(GolsC4J4.getText())){
            pontosArabia += 3;
            vitoriasArabia+=1;

        }else if(Integer.parseInt(GolsC2J4.getText()) == Integer.parseInt(GolsC4J4.getText())){
            pontosArabia += 1;
            empatesArabia +=1;
        }else{
            derrotasArabia+=1;
        }
        if(Integer.parseInt(GolsC2J6.getText()) > Integer.parseInt(GolsC3J6.getText())){
            pontosArabia += 3;
            vitoriasArabia+=1;

        }else if(Integer.parseInt(GolsC2J6.getText()) == Integer.parseInt(GolsC3J6.getText())){
            pontosArabia +=1;
            empatesArabia +=1;
        }else{
            derrotasArabia+=1;
        }


        arabia.setPontos(pontosArabia);
        arabia.setSaldo(saldoArabia);
        arabia.setGolsPro(golsProArabia);
        arabia.setGolsContra(golsContraArabia);
        arabia.setVitorias(vitoriasArabia);
        arabia.setEmpates(empatesArabia);
        arabia.setDerrotas(derrotasArabia);


    }

    private void propriedadesMexico(){
        Integer golsProMexico = Integer.parseInt(GolsC3J2.getText()) + Integer.parseInt(GolsC3J3.getText()) + Integer.parseInt(GolsC3J6.getText());

        Integer golsContraMexico = Integer.parseInt(GolsC4J2.getText()) + Integer.parseInt(GolsC1J3.getText()) + Integer.parseInt(GolsC2J6.getText());

        int saldoMexico = golsProMexico - golsContraMexico;

        int pontosMexico = 0;
        int vitoriasMexico = 0;
        int derrotasMexico = 0;
        int empatesMexico = 0;
        if(Integer.parseInt(GolsC3J2.getText()) > Integer.parseInt(GolsC4J2.getText())){
            pontosMexico += 3;
            vitoriasMexico+=1;

        }else if(Integer.parseInt(GolsC3J2.getText()) == Integer.parseInt(GolsC4J2.getText())){
            pontosMexico +=1;
            empatesMexico +=1;
        }else{
            derrotasMexico+=1;
        }
        if(Integer.parseInt(GolsC3J3.getText()) > Integer.parseInt(GolsC1J3.getText())){
            pontosMexico += 3;
            vitoriasMexico+=1;

        }else if(Integer.parseInt(GolsC3J3.getText()) == Integer.parseInt(GolsC1J3.getText())){
            pontosMexico += 1;
            empatesMexico +=1;
        }else{
            derrotasMexico+=1;
        }
        if(Integer.parseInt(GolsC3J6.getText()) > Integer.parseInt(GolsC2J6.getText())){
            pontosMexico += 3;
            vitoriasMexico+=1;

        }else if(Integer.parseInt(GolsC3J6.getText()) == Integer.parseInt(GolsC2J6.getText())){
            pontosMexico +=1;
            empatesMexico +=1;
        }else{
            derrotasMexico+=1;
        }

        mexico.setPontos(pontosMexico);
        mexico.setSaldo(saldoMexico);
        mexico.setGolsPro(golsProMexico);
        mexico.setGolsContra(golsContraMexico);
        mexico.setVitorias(vitoriasMexico);
        mexico.setEmpates(empatesMexico);
        mexico.setDerrotas(derrotasMexico);

    }
    private void propriedadesPolonia(){
        Integer golsProPolonia = Integer.parseInt(GolsC4J2.getText()) + Integer.parseInt(GolsC4J4.getText()) + Integer.parseInt(GolsC4J5.getText());

        Integer golsContraPolonia = Integer.parseInt(GolsC3J2.getText()) + Integer.parseInt(GolsC2J4.getText()) + Integer.parseInt(GolsC1J5.getText());

        int saldoPolonia = golsProPolonia - golsContraPolonia;


        int pontosPolonia = 0;
        int vitoriasPolonia = 0;
        int derrotasPolonia= 0;
        int empatesPolonia = 0;

        if(Integer.parseInt(GolsC4J2.getText()) > Integer.parseInt(GolsC3J2.getText())){
            pontosPolonia += 3;
            vitoriasPolonia+=1;

        }else if(Integer.parseInt(GolsC4J2.getText()) == Integer.parseInt(GolsC3J2.getText())){
            pontosPolonia += 1;
            empatesPolonia +=1;
        }else{
            derrotasPolonia+=1;
        }
        if(Integer.parseInt(GolsC4J4.getText()) > Integer.parseInt(GolsC2J4.getText())){
            pontosPolonia += 3;
            vitoriasPolonia+=1;

        }else if(Integer.parseInt(GolsC4J4.getText()) == Integer.parseInt(GolsC2J4.getText())){
            pontosPolonia += 1;
            empatesPolonia +=1;
        }else{
            derrotasPolonia+=1;
        }
        if(Integer.parseInt(GolsC4J5.getText()) > Integer.parseInt(GolsC1J5.getText())){
            pontosPolonia += 3;
            vitoriasPolonia+=1;

        }else if(Integer.parseInt(GolsC4J5.getText()) == Integer.parseInt(GolsC1J5.getText())){
            pontosPolonia += 1;
            empatesPolonia +=1;
        }else{
            derrotasPolonia+=1;
        }


        polonia.setPontos(pontosPolonia);
        polonia.setSaldo(saldoPolonia);
        polonia.setGolsPro(golsProPolonia);
        polonia.setGolsContra(golsContraPolonia);
        polonia.setVitorias(vitoriasPolonia);
        polonia.setEmpates(empatesPolonia);
        polonia.setDerrotas(derrotasPolonia);
    }

    private void propriedadesFranca(){
        Integer golsProFranca = Integer.parseInt(GolsD1J1.getText()) + Integer.parseInt(GolsD1J3.getText()) + Integer.parseInt(GolsD1J5.getText());

        Integer golsContraFranca = Integer.parseInt(GolsD2J1.getText()) + Integer.parseInt(GolsD3J3.getText()) + Integer.parseInt(GolsD4J5.getText());

        int saldoFranca = golsProFranca - golsContraFranca;


        int pontosFranca = 0;
        int vitoriasFranca = 0;
        int derrotasFranca = 0;
        int empatesFranca = 0;

        if(Integer.parseInt(GolsD1J1.getText()) > Integer.parseInt(GolsD2J1.getText())){
            pontosFranca += 3;
            vitoriasFranca+=1;

        }else if(Integer.parseInt(GolsD1J1.getText()) == Integer.parseInt(GolsD2J1.getText())){
            pontosFranca +=1;
            empatesFranca +=1;
        }else{
            derrotasFranca+=1;
        }
        if(Integer.parseInt(GolsD1J3.getText()) > Integer.parseInt(GolsD3J3.getText())){
            pontosFranca += 3;
            vitoriasFranca+=1;

        }else if(Integer.parseInt(GolsD1J3.getText()) == Integer.parseInt(GolsD3J3.getText())){
            pontosFranca +=1;
            empatesFranca +=1;
        }else{
            derrotasFranca+=1;
        }
        if(Integer.parseInt(GolsD1J5.getText()) > Integer.parseInt(GolsD4J5.getText())){
            pontosFranca += 3;
            vitoriasFranca+=1;

        }else if(Integer.parseInt(GolsD1J5.getText()) == Integer.parseInt(GolsD4J5.getText())){
            pontosFranca +=1;
            empatesFranca +=1;
        }else{
            derrotasFranca+=1;
        }


        franca.setPontos(pontosFranca);
        franca.setSaldo(saldoFranca);
        franca.setGolsPro(golsProFranca);
        franca.setGolsContra(golsContraFranca);
        franca.setVitorias(vitoriasFranca);
        franca.setEmpates(empatesFranca);
        franca.setDerrotas(derrotasFranca);


    }
    private void propriedadesAustralia(){
        Integer golsProAustralia = Integer.parseInt(GolsD2J1.getText()) + Integer.parseInt(GolsD2J4.getText()) + Integer.parseInt(GolsD2J6.getText());

        Integer golsContraAustralia = Integer.parseInt(GolsD1J1.getText()) + Integer.parseInt(GolsD3J6.getText()) + Integer.parseInt(GolsD4J4.getText());

        int saldoAustralia = golsProAustralia - golsContraAustralia;


        int pontosAustralia = 0;
        int vitoriasAustralia = 0;
        int derrotasAustralia = 0;
        int empatesAustralia = 0;
        if(Integer.parseInt(GolsD2J1.getText()) > Integer.parseInt(GolsD1J1.getText())){
            pontosAustralia +=3;
            vitoriasAustralia+=1;

        }else if(Integer.parseInt(GolsD2J1.getText()) == Integer.parseInt(GolsD1J1.getText())){
            pontosAustralia += 1;
            empatesAustralia +=1;
        }else{
            derrotasAustralia+=1;
        }
        if(Integer.parseInt(GolsD2J4.getText()) > Integer.parseInt(GolsD4J4.getText())){
            pontosAustralia += 3;
            vitoriasAustralia+=1;

        }else if(Integer.parseInt(GolsD2J4.getText()) == Integer.parseInt(GolsD4J4.getText())){
            pontosAustralia += 1;
            empatesAustralia +=1;
        }else{
            derrotasAustralia+=1;
        }
        if(Integer.parseInt(GolsD2J6.getText()) > Integer.parseInt(GolsD3J6.getText())){
            pontosAustralia += 3;
            vitoriasAustralia+=1;

        }else if(Integer.parseInt(GolsD2J6.getText()) == Integer.parseInt(GolsD3J6.getText())){
            pontosAustralia +=1;
            empatesAustralia +=1;
        }else{
            derrotasAustralia+=1;
        }


        australia.setPontos(pontosAustralia);
        australia.setSaldo(saldoAustralia);
        australia.setGolsPro(golsProAustralia);
        australia.setGolsContra(golsContraAustralia);
        australia.setVitorias(vitoriasAustralia);
        australia.setEmpates(empatesAustralia);
        australia.setDerrotas(derrotasAustralia);


    }

    private void propriedadesDinamarca(){
        Integer golsProDinamarca = Integer.parseInt(GolsD3J2.getText()) + Integer.parseInt(GolsD3J3.getText()) + Integer.parseInt(GolsD3J6.getText());

        Integer golsContraDinamarca = Integer.parseInt(GolsD4J2.getText()) + Integer.parseInt(GolsD1J3.getText()) + Integer.parseInt(GolsD2J6.getText());

        int saldoDinamarca = golsProDinamarca - golsContraDinamarca;

        int pontosDinamarca = 0;
        int vitoriasDinamarca = 0;
        int derrotasDinamarca = 0;
        int empatesDinamarca = 0;
        if(Integer.parseInt(GolsD3J2.getText()) > Integer.parseInt(GolsD4J2.getText())){
            pontosDinamarca += 3;
            vitoriasDinamarca+=1;

        }else if(Integer.parseInt(GolsD3J2.getText()) == Integer.parseInt(GolsD4J2.getText())){
            pontosDinamarca +=1;
            empatesDinamarca +=1;
        }else{
            derrotasDinamarca+=1;
        }
        if(Integer.parseInt(GolsD3J3.getText()) > Integer.parseInt(GolsD1J3.getText())){
            pontosDinamarca += 3;
            vitoriasDinamarca+=1;

        }else if(Integer.parseInt(GolsD3J3.getText()) == Integer.parseInt(GolsD1J3.getText())){
            pontosDinamarca += 1;
            empatesDinamarca +=1;
        }else{
            derrotasDinamarca+=1;
        }
        if(Integer.parseInt(GolsD3J6.getText()) > Integer.parseInt(GolsD2J6.getText())){
            pontosDinamarca += 3;
            vitoriasDinamarca+=1;

        }else if(Integer.parseInt(GolsD3J6.getText()) == Integer.parseInt(GolsD2J6.getText())){
            pontosDinamarca +=1;
            empatesDinamarca +=1;
        }else{
            derrotasDinamarca+=1;
        }

        dinamarca.setPontos(pontosDinamarca);
        dinamarca.setSaldo(saldoDinamarca);
        dinamarca.setGolsPro(golsProDinamarca);
        dinamarca.setGolsContra(golsContraDinamarca);
        dinamarca.setVitorias(vitoriasDinamarca);
        dinamarca.setEmpates(empatesDinamarca);
        dinamarca.setDerrotas(derrotasDinamarca);

    }
    private void propriedadesTunisia(){
        Integer golsProTunisia = Integer.parseInt(GolsD4J2.getText()) + Integer.parseInt(GolsD4J4.getText()) + Integer.parseInt(GolsD4J5.getText());

        Integer golsContraTunisia = Integer.parseInt(GolsD3J2.getText()) + Integer.parseInt(GolsD2J4.getText()) + Integer.parseInt(GolsD1J5.getText());

        int saldoTunisia = golsProTunisia - golsContraTunisia;


        int pontosTunisia = 0;
        int vitoriasTunisia = 0;
        int derrotasTunisia= 0;
        int empatesTunisia = 0;

        if(Integer.parseInt(GolsD4J2.getText()) > Integer.parseInt(GolsD3J2.getText())){
            pontosTunisia += 3;
            vitoriasTunisia+=1;

        }else if(Integer.parseInt(GolsD4J2.getText()) == Integer.parseInt(GolsD3J2.getText())){
            pontosTunisia += 1;
            empatesTunisia +=1;
        }else{
            derrotasTunisia+=1;
        }
        if(Integer.parseInt(GolsD4J4.getText()) > Integer.parseInt(GolsD2J4.getText())){
            pontosTunisia += 3;
            vitoriasTunisia+=1;

        }else if(Integer.parseInt(GolsD4J4.getText()) == Integer.parseInt(GolsD2J4.getText())){
            pontosTunisia += 1;
            empatesTunisia +=1;
        }else{
            derrotasTunisia+=1;
        }
        if(Integer.parseInt(GolsD4J5.getText()) > Integer.parseInt(GolsD1J5.getText())){
            pontosTunisia += 3;
            vitoriasTunisia+=1;

        }else if(Integer.parseInt(GolsD4J5.getText()) == Integer.parseInt(GolsD1J5.getText())){
            pontosTunisia += 1;
            empatesTunisia +=1;
        }else{
            derrotasTunisia+=1;
        }

        tunisia.setPontos(pontosTunisia);
        tunisia.setSaldo(saldoTunisia);
        tunisia.setGolsPro(golsProTunisia);
        tunisia.setGolsContra(golsContraTunisia);
        tunisia.setVitorias(vitoriasTunisia);
        tunisia.setEmpates(empatesTunisia);
        tunisia.setDerrotas(derrotasTunisia);
    }
    private void propriedadesEspanha(){
        Integer golsProEspanha = Integer.parseInt(GolsE1J1.getText()) + Integer.parseInt(GolsE1J3.getText()) + Integer.parseInt(GolsE1J5.getText());

        Integer golsContraEspanha = Integer.parseInt(GolsE2J1.getText()) + Integer.parseInt(GolsE3J3.getText()) + Integer.parseInt(GolsE4J5.getText());

        int saldoEspanha = golsProEspanha - golsContraEspanha;


        int pontosEspanha = 0;
        int vitoriasEspanha = 0;
        int derrotasEspanha = 0;
        int empatesEspanha = 0;

        if(Integer.parseInt(GolsE1J1.getText()) > Integer.parseInt(GolsE2J1.getText())){
            pontosEspanha += 3;
            vitoriasEspanha+=1;

        }else if(Integer.parseInt(GolsE1J1.getText()) == Integer.parseInt(GolsE2J1.getText())){
            pontosEspanha +=1;
            empatesEspanha +=1;
        }else{
            derrotasEspanha+=1;
        }
        if(Integer.parseInt(GolsE1J3.getText()) > Integer.parseInt(GolsE3J3.getText())){
            pontosEspanha += 3;
            vitoriasEspanha+=1;

        }else if(Integer.parseInt(GolsE1J3.getText()) == Integer.parseInt(GolsE3J3.getText())){
            pontosEspanha +=1;
            empatesEspanha +=1;
        }else{
            derrotasEspanha+=1;
        }
        if(Integer.parseInt(GolsE1J5.getText()) > Integer.parseInt(GolsE4J5.getText())){
            pontosEspanha += 3;
            vitoriasEspanha+=1;

        }else if(Integer.parseInt(GolsE1J5.getText()) == Integer.parseInt(GolsE4J5.getText())){
            pontosEspanha +=1;
            empatesEspanha +=1;
        }else{
            derrotasEspanha+=1;
        }


        espanha.setPontos(pontosEspanha);
        espanha.setSaldo(saldoEspanha);
        espanha.setGolsPro(golsProEspanha);
        espanha.setGolsContra(golsContraEspanha);
        espanha.setVitorias(vitoriasEspanha);
        espanha.setEmpates(empatesEspanha);
        espanha.setDerrotas(derrotasEspanha);


    }
    private void propriedadesCostaR(){
        Integer golsProCostaR = Integer.parseInt(GolsE2J1.getText()) + Integer.parseInt(GolsE2J4.getText()) + Integer.parseInt(GolsE2J6.getText());

        Integer golsContraCostaR = Integer.parseInt(GolsE1J1.getText()) + Integer.parseInt(GolsE3J6.getText()) + Integer.parseInt(GolsE4J4.getText());

        int saldoCostaR = golsProCostaR - golsContraCostaR;


        int pontosCostaR = 0;
        int vitoriasCostaR = 0;
        int derrotasCostaR = 0;
        int empatesCostaR = 0;
        if(Integer.parseInt(GolsE2J1.getText()) > Integer.parseInt(GolsE1J1.getText())){
            pontosCostaR +=3;
            vitoriasCostaR+=1;

        }else if(Integer.parseInt(GolsE2J1.getText()) == Integer.parseInt(GolsE1J1.getText())){
            pontosCostaR += 1;
            empatesCostaR +=1;
        }else{
            derrotasCostaR+=1;
        }
        if(Integer.parseInt(GolsE2J4.getText()) > Integer.parseInt(GolsE4J4.getText())){
            pontosCostaR += 3;
            vitoriasCostaR+=1;

        }else if(Integer.parseInt(GolsE2J4.getText()) == Integer.parseInt(GolsE4J4.getText())){
            pontosCostaR += 1;
            empatesCostaR +=1;
        }else{
            derrotasCostaR+=1;
        }
        if(Integer.parseInt(GolsE2J6.getText()) > Integer.parseInt(GolsE3J6.getText())){
            pontosCostaR += 3;
            vitoriasCostaR+=1;

        }else if(Integer.parseInt(GolsE2J6.getText()) == Integer.parseInt(GolsE3J6.getText())){
            pontosCostaR +=1;
            empatesCostaR +=1;
        }else{
            derrotasCostaR+=1;
        }


        costa.setPontos(pontosCostaR);
        costa.setSaldo(saldoCostaR);
        costa.setGolsPro(golsProCostaR);
        costa.setGolsContra(golsContraCostaR);
        costa.setVitorias(vitoriasCostaR);
        costa.setEmpates(empatesCostaR);
        costa.setDerrotas(derrotasCostaR);


    }

    private void propriedadesAlemanha(){
        Integer golsProAlemanha = Integer.parseInt(GolsE3J2.getText()) + Integer.parseInt(GolsE3J3.getText()) + Integer.parseInt(GolsE3J6.getText());

        Integer golsContraAlemanha = Integer.parseInt(GolsE4J2.getText()) + Integer.parseInt(GolsE1J3.getText()) + Integer.parseInt(GolsE2J6.getText());

        int saldoAlemanha = golsProAlemanha - golsContraAlemanha;

        int pontosAlemanha = 0;
        int vitoriasAlemanha = 0;
        int derrotasAlemanha = 0;
        int empatesAlemanha = 0;
        if(Integer.parseInt(GolsE3J2.getText()) > Integer.parseInt(GolsE4J2.getText())){
            pontosAlemanha += 3;
            vitoriasAlemanha+=1;

        }else if(Integer.parseInt(GolsE3J2.getText()) == Integer.parseInt(GolsE4J2.getText())){
            pontosAlemanha +=1;
            empatesAlemanha +=1;
        }else{
            derrotasAlemanha+=1;
        }
        if(Integer.parseInt(GolsE3J3.getText()) > Integer.parseInt(GolsE1J3.getText())){
            pontosAlemanha += 3;
            vitoriasAlemanha+=1;

        }else if(Integer.parseInt(GolsE3J3.getText()) == Integer.parseInt(GolsE1J3.getText())){
            pontosAlemanha += 1;
            empatesAlemanha +=1;
        }else{
            derrotasAlemanha+=1;
        }
        if(Integer.parseInt(GolsE3J6.getText()) > Integer.parseInt(GolsE2J6.getText())){
            pontosAlemanha += 3;
            vitoriasAlemanha+=1;

        }else if(Integer.parseInt(GolsE3J6.getText()) == Integer.parseInt(GolsE2J6.getText())){
            pontosAlemanha +=1;
            empatesAlemanha +=1;
        }else{
            derrotasAlemanha+=1;
        }

        alemanha.setPontos(pontosAlemanha);
        alemanha.setSaldo(saldoAlemanha);
        alemanha.setGolsPro(golsProAlemanha);
        alemanha.setGolsContra(golsContraAlemanha);
        alemanha.setVitorias(vitoriasAlemanha);
        alemanha.setEmpates(empatesAlemanha);
        alemanha.setDerrotas(derrotasAlemanha);

    }
    private void propriedadesJapao(){
        Integer golsProJapao = Integer.parseInt(GolsE4J2.getText()) + Integer.parseInt(GolsE4J4.getText()) + Integer.parseInt(GolsE4J5.getText());

        Integer golsContraJapao = Integer.parseInt(GolsE3J2.getText()) + Integer.parseInt(GolsE2J4.getText()) + Integer.parseInt(GolsE1J5.getText());

        int saldoJapao = golsProJapao - golsContraJapao;


        int pontosJapao = 0;
        int vitoriasJapao = 0;
        int derrotasJapao= 0;
        int empatesJapao = 0;

        if(Integer.parseInt(GolsE4J2.getText()) > Integer.parseInt(GolsE3J2.getText())){
            pontosJapao += 3;
            vitoriasJapao+=1;

        }else if(Integer.parseInt(GolsE4J2.getText()) == Integer.parseInt(GolsE3J2.getText())){
            pontosJapao += 1;
            empatesJapao +=1;
        }else{
            derrotasJapao+=1;
        }
        if(Integer.parseInt(GolsE4J4.getText()) > Integer.parseInt(GolsE2J4.getText())){
            pontosJapao += 3;
            vitoriasJapao+=1;

        }else if(Integer.parseInt(GolsE4J4.getText()) == Integer.parseInt(GolsE2J4.getText())){
            pontosJapao += 1;
            empatesJapao +=1;
        }else{
            derrotasJapao+=1;
        }
        if(Integer.parseInt(GolsE4J5.getText()) > Integer.parseInt(GolsE1J5.getText())){
            pontosJapao += 3;
            vitoriasJapao+=1;

        }else if(Integer.parseInt(GolsE4J5.getText()) == Integer.parseInt(GolsE1J5.getText())){
            pontosJapao += 1;
            empatesJapao +=1;
        }else{
            derrotasJapao+=1;
        }

        japao.setPontos(pontosJapao);
        japao.setSaldo(saldoJapao);
        japao.setGolsPro(golsProJapao);
        japao.setGolsContra(golsContraJapao);
        japao.setVitorias(vitoriasJapao);
        japao.setEmpates(empatesJapao);
        japao.setDerrotas(derrotasJapao);
    }
    private void propriedadesBelgica(){
        Integer golsProBelgica = Integer.parseInt(GolsF1J1.getText()) + Integer.parseInt(GolsF1J3.getText()) + Integer.parseInt(GolsF1J5.getText());

        Integer golsContraBelgica = Integer.parseInt(GolsF2J1.getText()) + Integer.parseInt(GolsF3J3.getText()) + Integer.parseInt(GolsF4J5.getText());

        int saldoBelgica = golsProBelgica - golsContraBelgica;

        int pontosBelgica = 0;
        int vitoriasBelgica = 0;
        int derrotasBelgica = 0;
        int empatesBelgica = 0;

        if(Integer.parseInt(GolsF1J1.getText()) > Integer.parseInt(GolsF2J1.getText())){
            pontosBelgica += 3;
            vitoriasBelgica+=1;

        }else if(Integer.parseInt(GolsF1J1.getText()) == Integer.parseInt(GolsF2J1.getText())){
            pontosBelgica +=1;
            empatesBelgica +=1;
        }else{
            derrotasBelgica+=1;
        }
        if(Integer.parseInt(GolsF1J3.getText()) > Integer.parseInt(GolsF3J3.getText())){
            pontosBelgica += 3;
            vitoriasBelgica+=1;

        }else if(Integer.parseInt(GolsF1J3.getText()) == Integer.parseInt(GolsF3J3.getText())){
            pontosBelgica +=1;
            empatesBelgica +=1;
        }else{
            derrotasBelgica+=1;
        }
        if(Integer.parseInt(GolsF1J5.getText()) > Integer.parseInt(GolsF4J5.getText())){
            pontosBelgica += 3;
            vitoriasBelgica+=1;

        }else if(Integer.parseInt(GolsF1J5.getText()) == Integer.parseInt(GolsF4J5.getText())){
            pontosBelgica +=1;
            empatesBelgica +=1;
        }else{
            derrotasBelgica+=1;
        }

        belgica.setPontos(pontosBelgica);
        belgica.setSaldo(saldoBelgica);
        belgica.setGolsPro(golsProBelgica);
        belgica.setGolsContra(golsContraBelgica);
        belgica.setVitorias(vitoriasBelgica);
        belgica.setEmpates(empatesBelgica);
        belgica.setDerrotas(derrotasBelgica);


    }
    private void propriedadesCanada(){
        Integer golsProCanada = Integer.parseInt(GolsF2J1.getText()) + Integer.parseInt(GolsF2J4.getText()) + Integer.parseInt(GolsF2J6.getText());

        Integer golsContraCanada = Integer.parseInt(GolsF1J1.getText()) + Integer.parseInt(GolsF3J6.getText()) + Integer.parseInt(GolsF4J4.getText());

        int saldoCanada = golsProCanada - golsContraCanada;


        int pontosCanada = 0;
        int vitoriasCanada = 0;
        int derrotasCanada = 0;
        int empatesCanada = 0;
        if(Integer.parseInt(GolsF2J1.getText()) > Integer.parseInt(GolsF1J1.getText())){
            pontosCanada +=3;
            vitoriasCanada+=1;

        }else if(Integer.parseInt(GolsF2J1.getText()) == Integer.parseInt(GolsF1J1.getText())){
            pontosCanada += 1;
            empatesCanada +=1;
        }else{
            derrotasCanada+=1;
        }
        if(Integer.parseInt(GolsF2J4.getText()) > Integer.parseInt(GolsF4J4.getText())){
            pontosCanada += 3;
            vitoriasCanada+=1;

        }else if(Integer.parseInt(GolsF2J4.getText()) == Integer.parseInt(GolsF4J4.getText())){
            pontosCanada += 1;
            empatesCanada +=1;
        }else{
            derrotasCanada+=1;
        }
        if(Integer.parseInt(GolsF2J6.getText()) > Integer.parseInt(GolsF3J6.getText())){
            pontosCanada += 3;
            vitoriasCanada+=1;

        }else if(Integer.parseInt(GolsF2J6.getText()) == Integer.parseInt(GolsF3J6.getText())){
            pontosCanada +=1;
            empatesCanada +=1;
        }else{
            derrotasCanada+=1;
        }


        canada.setPontos(pontosCanada);
        canada.setSaldo(saldoCanada);
        canada.setGolsPro(golsProCanada);
        canada.setGolsContra(golsContraCanada);
        canada.setVitorias(vitoriasCanada);
        canada.setEmpates(empatesCanada);
        canada.setDerrotas(derrotasCanada);


    }

    private void propriedadesMarrocos(){
        Integer golsProMarrocos = Integer.parseInt(GolsF3J2.getText()) + Integer.parseInt(GolsF3J3.getText()) + Integer.parseInt(GolsF3J6.getText());

        Integer golsContraMarrocos = Integer.parseInt(GolsF4J2.getText()) + Integer.parseInt(GolsF1J3.getText()) + Integer.parseInt(GolsF2J6.getText());

        int saldoMarrocos = golsProMarrocos - golsContraMarrocos;

        int pontosMarrocos = 0;
        int vitoriasMarrocos = 0;
        int derrotasMarrocos = 0;
        int empatesMarrocos = 0;
        if(Integer.parseInt(GolsF3J2.getText()) > Integer.parseInt(GolsF4J2.getText())){
            pontosMarrocos += 3;
            vitoriasMarrocos+=1;

        }else if(Integer.parseInt(GolsF3J2.getText()) == Integer.parseInt(GolsF4J2.getText())){
            pontosMarrocos +=1;
            empatesMarrocos +=1;
        }else{
            derrotasMarrocos+=1;
        }
        if(Integer.parseInt(GolsF3J3.getText()) > Integer.parseInt(GolsF1J3.getText())){
            pontosMarrocos += 3;
            vitoriasMarrocos+=1;

        }else if(Integer.parseInt(GolsF3J3.getText()) == Integer.parseInt(GolsF1J3.getText())){
            pontosMarrocos += 1;
            empatesMarrocos +=1;
        }else{
            derrotasMarrocos+=1;
        }
        if(Integer.parseInt(GolsF3J6.getText()) > Integer.parseInt(GolsF2J6.getText())){
            pontosMarrocos += 3;
            vitoriasMarrocos+=1;

        }else if(Integer.parseInt(GolsF3J6.getText()) == Integer.parseInt(GolsF2J6.getText())){
            pontosMarrocos +=1;
            empatesMarrocos +=1;
        }else{
            derrotasMarrocos+=1;
        }


        marrocos.setPontos(pontosMarrocos);
        marrocos.setSaldo(saldoMarrocos);
        marrocos.setGolsPro(golsProMarrocos);
        marrocos.setGolsContra(golsContraMarrocos);
        marrocos.setVitorias(vitoriasMarrocos);
        marrocos.setEmpates(empatesMarrocos);
        marrocos.setDerrotas(derrotasMarrocos);

    }
    private void propriedadesCroacia(){
        Integer golsProCroacia = Integer.parseInt(GolsF4J2.getText()) + Integer.parseInt(GolsF4J4.getText()) + Integer.parseInt(GolsF4J5.getText());

        Integer golsContraCroacia = Integer.parseInt(GolsF3J2.getText()) + Integer.parseInt(GolsF2J4.getText()) + Integer.parseInt(GolsF1J5.getText());

        int saldoCroacia = golsProCroacia - golsContraCroacia;


        int pontosCroacia = 0;
        int vitoriasCroacia = 0;
        int derrotasCroacia= 0;
        int empatesCroacia = 0;

        if(Integer.parseInt(GolsF4J2.getText()) > Integer.parseInt(GolsF3J2.getText())){
            pontosCroacia += 3;
            vitoriasCroacia+=1;

        }else if(Integer.parseInt(GolsF4J2.getText()) == Integer.parseInt(GolsF3J2.getText())){
            pontosCroacia += 1;
            empatesCroacia +=1;
        }else{
            derrotasCroacia+=1;
        }
        if(Integer.parseInt(GolsF4J4.getText()) > Integer.parseInt(GolsF2J4.getText())){
            pontosCroacia += 3;
            vitoriasCroacia+=1;

        }else if(Integer.parseInt(GolsF4J4.getText()) == Integer.parseInt(GolsF2J4.getText())){
            pontosCroacia += 1;
            empatesCroacia +=1;
        }else{
            derrotasCroacia+=1;
        }
        if(Integer.parseInt(GolsF4J5.getText()) > Integer.parseInt(GolsF1J5.getText())){
            pontosCroacia += 3;
            vitoriasCroacia+=1;

        }else if(Integer.parseInt(GolsF4J5.getText()) == Integer.parseInt(GolsF1J5.getText())){
            pontosCroacia += 1;
            empatesCroacia +=1;
        }else{
            derrotasCroacia+=1;
        }



        croacia.setPontos(pontosCroacia);
        croacia.setSaldo(saldoCroacia);
        croacia.setGolsPro(golsProCroacia);
        croacia.setGolsContra(golsContraCroacia);
        croacia.setVitorias(vitoriasCroacia);
        croacia.setEmpates(empatesCroacia);
        croacia.setDerrotas(derrotasCroacia);
    }

    private void propriedadesBrasil(){
        Integer golsProBrasil = Integer.parseInt(GolsG1J1.getText()) + Integer.parseInt(GolsG1J3.getText()) + Integer.parseInt(GolsG1J5.getText());

        Integer golsContraBrasil = Integer.parseInt(GolsG2J1.getText()) + Integer.parseInt(GolsG3J3.getText()) + Integer.parseInt(GolsG4J5.getText());

        int saldoBrasil = golsProBrasil - golsContraBrasil;

        int pontosBrasil = 0;
        int vitoriasBrasil = 0;
        int derrotasBrasil = 0;
        int empatesBrasil = 0;

        if(Integer.parseInt(GolsG1J1.getText()) > Integer.parseInt(GolsG2J1.getText())){
            pontosBrasil += 3;
            vitoriasBrasil+=1;

        }else if(Integer.parseInt(GolsG1J1.getText()) == Integer.parseInt(GolsG2J1.getText())){
            pontosBrasil +=1;
            empatesBrasil +=1;
        }else{
            derrotasBrasil+=1;
        }
        if(Integer.parseInt(GolsG1J3.getText()) > Integer.parseInt(GolsG3J3.getText())){
            pontosBrasil += 3;
            vitoriasBrasil+=1;

        }else if(Integer.parseInt(GolsG1J3.getText()) == Integer.parseInt(GolsG3J3.getText())){
            pontosBrasil +=1;
            empatesBrasil +=1;
        }else{
            derrotasBrasil+=1;
        }
        if(Integer.parseInt(GolsG1J5.getText()) > Integer.parseInt(GolsG4J5.getText())){
            pontosBrasil += 3;
            vitoriasBrasil+=1;

        }else if(Integer.parseInt(GolsG1J5.getText()) == Integer.parseInt(GolsG4J5.getText())){
            pontosBrasil +=1;
            empatesBrasil +=1;
        }else{
            derrotasBrasil+=1;
        }

        brasil.setPontos(pontosBrasil);
        brasil.setSaldo(saldoBrasil);
        brasil.setGolsPro(golsProBrasil);
        brasil.setGolsContra(golsContraBrasil);
        brasil.setVitorias(vitoriasBrasil);
        brasil.setEmpates(empatesBrasil);
        brasil.setDerrotas(derrotasBrasil);


    }
    private void propriedadesServia(){
        Integer golsProServia = Integer.parseInt(GolsG2J1.getText()) + Integer.parseInt(GolsG2J4.getText()) + Integer.parseInt(GolsG2J6.getText());

        Integer golsContraServia = Integer.parseInt(GolsG1J1.getText()) + Integer.parseInt(GolsG3J6.getText()) + Integer.parseInt(GolsG4J4.getText());

        int saldoServia = golsProServia - golsContraServia;


        int pontosServia = 0;
        int vitoriasServia = 0;
        int derrotasServia = 0;
        int empatesServia = 0;
        if(Integer.parseInt(GolsG2J1.getText()) > Integer.parseInt(GolsG1J1.getText())){
            pontosServia +=3;
            vitoriasServia+=1;

        }else if(Integer.parseInt(GolsG2J1.getText()) == Integer.parseInt(GolsG1J1.getText())){
            pontosServia += 1;
            empatesServia +=1;
        }else{
            derrotasServia+=1;
        }
        if(Integer.parseInt(GolsG2J4.getText()) > Integer.parseInt(GolsG4J4.getText())){
            pontosServia += 3;
            vitoriasServia+=1;

        }else if(Integer.parseInt(GolsG2J4.getText()) == Integer.parseInt(GolsG4J4.getText())){
            pontosServia += 1;
            empatesServia +=1;
        }else{
            derrotasServia+=1;
        }
        if(Integer.parseInt(GolsG2J6.getText()) > Integer.parseInt(GolsG3J6.getText())){
            pontosServia += 3;
            vitoriasServia+=1;

        }else if(Integer.parseInt(GolsG2J6.getText()) == Integer.parseInt(GolsG3J6.getText())){
            pontosServia +=1;
            empatesServia +=1;
        }else{
            derrotasServia+=1;
        }


        servia.setPontos(pontosServia);
        servia.setSaldo(saldoServia);
        servia.setGolsPro(golsProServia);
        servia.setGolsContra(golsContraServia);
        servia.setVitorias(vitoriasServia);
        servia.setEmpates(empatesServia);
        servia.setDerrotas(derrotasServia);


    }

    private void propriedadesSuica(){
        Integer golsProSuica = Integer.parseInt(GolsG3J2.getText()) + Integer.parseInt(GolsG3J3.getText()) + Integer.parseInt(GolsG3J6.getText());

        Integer golsContraSuica = Integer.parseInt(GolsG4J2.getText()) + Integer.parseInt(GolsG1J3.getText()) + Integer.parseInt(GolsG2J6.getText());

        int saldoSuica = golsProSuica - golsContraSuica;

        int pontosSuica = 0;
        int vitoriasSuica = 0;
        int derrotasSuica = 0;
        int empatesSuica = 0;
        if(Integer.parseInt(GolsG3J2.getText()) > Integer.parseInt(GolsG4J2.getText())){
            pontosSuica += 3;
            vitoriasSuica+=1;

        }else if(Integer.parseInt(GolsG3J2.getText()) == Integer.parseInt(GolsG4J2.getText())){
            pontosSuica +=1;
            empatesSuica +=1;
        }else{
            derrotasSuica+=1;
        }
        if(Integer.parseInt(GolsG3J3.getText()) > Integer.parseInt(GolsG1J3.getText())){
            pontosSuica += 3;
            vitoriasSuica+=1;

        }else if(Integer.parseInt(GolsG3J3.getText()) == Integer.parseInt(GolsG1J3.getText())){
            pontosSuica += 1;
            empatesSuica +=1;
        }else{
            derrotasSuica+=1;
        }
        if(Integer.parseInt(GolsG3J6.getText()) > Integer.parseInt(GolsG2J6.getText())){
            pontosSuica += 3;
            vitoriasSuica+=1;

        }else if(Integer.parseInt(GolsG3J6.getText()) == Integer.parseInt(GolsG2J6.getText())){
            pontosSuica +=1;
            empatesSuica +=1;
        }else{
            derrotasSuica+=1;
        }


        suica.setPontos(pontosSuica);
        suica.setSaldo(saldoSuica);
        suica.setGolsPro(golsProSuica);
        suica.setGolsContra(golsContraSuica);
        suica.setVitorias(vitoriasSuica);
        suica.setEmpates(empatesSuica);
        suica.setDerrotas(derrotasSuica);

    }
    private void propriedadesCamaroes(){
        Integer golsProCamaroes = Integer.parseInt(GolsG4J2.getText()) + Integer.parseInt(GolsG4J4.getText()) + Integer.parseInt(GolsG4J5.getText());

        Integer golsContraCamaroes = Integer.parseInt(GolsG3J2.getText()) + Integer.parseInt(GolsG2J4.getText()) + Integer.parseInt(GolsG1J5.getText());

        int saldoCamaroes = golsProCamaroes - golsContraCamaroes;


        int pontosCamaroes = 0;
        int vitoriasCamaroes = 0;
        int derrotasCamaroes= 0;
        int empatesCamaroes = 0;

        if(Integer.parseInt(GolsG4J2.getText()) > Integer.parseInt(GolsG3J2.getText())){
            pontosCamaroes += 3;
            vitoriasCamaroes+=1;

        }else if(Integer.parseInt(GolsG4J2.getText()) == Integer.parseInt(GolsG3J2.getText())){
            pontosCamaroes += 1;
            empatesCamaroes +=1;
        }else{
            derrotasCamaroes+=1;
        }
        if(Integer.parseInt(GolsG4J4.getText()) > Integer.parseInt(GolsG2J4.getText())){
            pontosCamaroes += 3;
            vitoriasCamaroes+=1;

        }else if(Integer.parseInt(GolsG4J4.getText()) == Integer.parseInt(GolsG2J4.getText())){
            pontosCamaroes += 1;
            empatesCamaroes +=1;
        }else{
            derrotasCamaroes+=1;
        }
        if(Integer.parseInt(GolsG4J5.getText()) > Integer.parseInt(GolsG1J5.getText())){
            pontosCamaroes += 3;
            vitoriasCamaroes+=1;

        }else if(Integer.parseInt(GolsG4J5.getText()) == Integer.parseInt(GolsG1J5.getText())){
            pontosCamaroes += 1;
            empatesCamaroes +=1;
        }else{
            derrotasCamaroes+=1;
        }


        camaroes.setPontos(pontosCamaroes);
        camaroes.setSaldo(saldoCamaroes);
        camaroes.setGolsPro(golsProCamaroes);
        camaroes.setGolsContra(golsContraCamaroes);
        camaroes.setVitorias(vitoriasCamaroes);
        camaroes.setEmpates(empatesCamaroes);
        camaroes.setDerrotas(derrotasCamaroes);
    }
    private void propriedadesPortugal(){
        Integer golsProPortugal = Integer.parseInt(GolsH1J1.getText()) + Integer.parseInt(GolsH1J3.getText()) + Integer.parseInt(GolsH1J5.getText());

        Integer golsContraPortugal = Integer.parseInt(GolsH2J1.getText()) + Integer.parseInt(GolsH3J3.getText()) + Integer.parseInt(GolsH4J5.getText());

        int saldoPortugal = golsProPortugal - golsContraPortugal;

        int pontosPortugal = 0;
        int vitoriasPortugal = 0;
        int derrotasPortugal = 0;
        int empatesPortugal = 0;

        if(Integer.parseInt(GolsH1J1.getText()) > Integer.parseInt(GolsH2J1.getText())){
            pontosPortugal += 3;
            vitoriasPortugal+=1;

        }else if(Integer.parseInt(GolsH1J1.getText()) == Integer.parseInt(GolsH2J1.getText())){
            pontosPortugal +=1;
            empatesPortugal +=1;
        }else{
            derrotasPortugal+=1;
        }
        if(Integer.parseInt(GolsH1J3.getText()) > Integer.parseInt(GolsH3J3.getText())){
            pontosPortugal += 3;
            vitoriasPortugal+=1;

        }else if(Integer.parseInt(GolsH1J3.getText()) == Integer.parseInt(GolsH3J3.getText())){
            pontosPortugal +=1;
            empatesPortugal +=1;
        }else{
            derrotasPortugal+=1;
        }
        if(Integer.parseInt(GolsH1J5.getText()) > Integer.parseInt(GolsH4J5.getText())){
            pontosPortugal += 3;
            vitoriasPortugal+=1;

        }else if(Integer.parseInt(GolsH1J5.getText()) == Integer.parseInt(GolsH4J5.getText())){
            pontosPortugal +=1;
            empatesPortugal +=1;
        }else{
            derrotasPortugal+=1;
        }

        portugal.setPontos(pontosPortugal);
        portugal.setSaldo(saldoPortugal);
        portugal.setGolsPro(golsProPortugal);
        portugal.setGolsContra(golsContraPortugal);
        portugal.setVitorias(vitoriasPortugal);
        portugal.setEmpates(empatesPortugal);
        portugal.setDerrotas(derrotasPortugal);


    }
    private void propriedadesGana(){
        Integer golsProGana = Integer.parseInt(GolsH2J1.getText()) + Integer.parseInt(GolsH2J4.getText()) + Integer.parseInt(GolsH2J6.getText());

        Integer golsContraGana = Integer.parseInt(GolsH1J1.getText()) + Integer.parseInt(GolsH3J6.getText()) + Integer.parseInt(GolsH4J4.getText());

        int saldoGana = golsProGana - golsContraGana;


        int pontosGana = 0;
        int vitoriasGana = 0;
        int derrotasGana = 0;
        int empatesGana = 0;
        if(Integer.parseInt(GolsH2J1.getText()) > Integer.parseInt(GolsH1J1.getText())){
            pontosGana +=3;
            vitoriasGana+=1;

        }else if(Integer.parseInt(GolsH2J1.getText()) == Integer.parseInt(GolsH1J1.getText())){
            pontosGana += 1;
            empatesGana +=1;
        }else{
            derrotasGana+=1;
        }
        if(Integer.parseInt(GolsH2J4.getText()) > Integer.parseInt(GolsH4J4.getText())){
            pontosGana += 3;
            vitoriasGana+=1;

        }else if(Integer.parseInt(GolsH2J4.getText()) == Integer.parseInt(GolsH4J4.getText())){
            pontosGana += 1;
            empatesGana +=1;
        }else{
            derrotasGana+=1;
        }
        if(Integer.parseInt(GolsH2J6.getText()) > Integer.parseInt(GolsH3J6.getText())){
            pontosGana += 3;
            vitoriasGana+=1;

        }else if(Integer.parseInt(GolsH2J6.getText()) == Integer.parseInt(GolsH3J6.getText())){
            pontosGana +=1;
            empatesGana +=1;
        }else{
            derrotasGana+=1;
        }


        gana.setPontos(pontosGana);
        gana.setSaldo(saldoGana);
        gana.setGolsPro(golsProGana);
        gana.setGolsContra(golsContraGana);
        gana.setVitorias(vitoriasGana);
        gana.setEmpates(empatesGana);
        gana.setDerrotas(derrotasGana);


    }

    private void propriedadesUruguai(){
        Integer golsProUruguai = Integer.parseInt(GolsH3J2.getText()) + Integer.parseInt(GolsH3J3.getText()) + Integer.parseInt(GolsH3J6.getText());

        Integer golsContraUruguai = Integer.parseInt(GolsH4J2.getText()) + Integer.parseInt(GolsH1J3.getText()) + Integer.parseInt(GolsH2J6.getText());

        int saldoUruguai = golsProUruguai - golsContraUruguai;

        int pontosUruguai = 0;
        int vitoriasUruguai = 0;
        int derrotasUruguai = 0;
        int empatesUruguai = 0;
        if(Integer.parseInt(GolsH3J2.getText()) > Integer.parseInt(GolsH4J2.getText())){
            pontosUruguai += 3;
            vitoriasUruguai+=1;

        }else if(Integer.parseInt(GolsH3J2.getText()) == Integer.parseInt(GolsH4J2.getText())){
            pontosUruguai +=1;
            empatesUruguai +=1;
        }else{
            derrotasUruguai+=1;
        }
        if(Integer.parseInt(GolsH3J3.getText()) > Integer.parseInt(GolsH1J3.getText())){
            pontosUruguai += 3;
            vitoriasUruguai+=1;

        }else if(Integer.parseInt(GolsH3J3.getText()) == Integer.parseInt(GolsH1J3.getText())){
            pontosUruguai += 1;
            empatesUruguai +=1;
        }else{
            derrotasUruguai+=1;
        }
        if(Integer.parseInt(GolsH3J6.getText()) > Integer.parseInt(GolsH2J6.getText())){
            pontosUruguai += 3;
            vitoriasUruguai+=1;

        }else if(Integer.parseInt(GolsH3J6.getText()) == Integer.parseInt(GolsH2J6.getText())){
            pontosUruguai +=1;
            empatesUruguai +=1;
        }else{
            derrotasUruguai+=1;
        }


        uruguai.setPontos(pontosUruguai);
        uruguai.setSaldo(saldoUruguai);
        uruguai.setGolsPro(golsProUruguai);
        uruguai.setGolsContra(golsContraUruguai);
        uruguai.setVitorias(vitoriasUruguai);
        uruguai.setEmpates(empatesUruguai);
        uruguai.setDerrotas(derrotasUruguai);

    }
    private void propriedadesCoreia(){
        Integer golsProCoreia = Integer.parseInt(GolsH4J2.getText()) + Integer.parseInt(GolsH4J4.getText()) + Integer.parseInt(GolsH4J5.getText());

        Integer golsContraCoreia = Integer.parseInt(GolsH3J2.getText()) + Integer.parseInt(GolsH2J4.getText()) + Integer.parseInt(GolsH1J5.getText());

        int saldoCoreia = golsProCoreia - golsContraCoreia;


        int pontosCoreia = 0;
        int vitoriasCoreia = 0;
        int derrotasCoreia= 0;
        int empatesCoreia = 0;

        if(Integer.parseInt(GolsH4J2.getText()) > Integer.parseInt(GolsH3J2.getText())){
            pontosCoreia += 3;
            vitoriasCoreia+=1;

        }else if(Integer.parseInt(GolsH4J2.getText()) == Integer.parseInt(GolsH3J2.getText())){
            pontosCoreia += 1;
            empatesCoreia +=1;
        }else{
            derrotasCoreia+=1;
        }
        if(Integer.parseInt(GolsH4J4.getText()) > Integer.parseInt(GolsH2J4.getText())){
            pontosCoreia += 3;
            vitoriasCoreia+=1;

        }else if(Integer.parseInt(GolsH4J4.getText()) == Integer.parseInt(GolsH2J4.getText())){
            pontosCoreia += 1;
            empatesCoreia +=1;
        }else{
            derrotasCoreia+=1;
        }
        if(Integer.parseInt(GolsH4J5.getText()) > Integer.parseInt(GolsH1J5.getText())){
            pontosCoreia += 3;
            vitoriasCoreia+=1;

        }else if(Integer.parseInt(GolsH4J5.getText()) == Integer.parseInt(GolsH1J5.getText())){
            pontosCoreia += 1;
            empatesCoreia +=1;
        }else{
            derrotasCoreia+=1;
        }


        coreia.setPontos(pontosCoreia);
        coreia.setSaldo(saldoCoreia);
        coreia.setGolsPro(golsProCoreia);
        coreia.setGolsContra(golsContraCoreia);
        coreia.setVitorias(vitoriasCoreia);
        coreia.setEmpates(empatesCoreia);
        coreia.setDerrotas(derrotasCoreia);
    }


    static class Ordenacao implements Comparator<Selecao>{

        @Override
        public int compare(Selecao selecao1, Selecao selecao2) {
            if(selecao1.getPontos() > selecao2.getPontos()){
                return -1;
            } else if (selecao1.getPontos() < selecao2.getPontos()) {
                return 1;
            }else{
                if (selecao1.getSaldo() > selecao2.getSaldo()){
                    return -1;
                } else if (selecao1.getSaldo() < selecao2.getSaldo()) {
                    return 1;
                }
                else{
                    if (selecao1.getGolsPro() > selecao2.getGolsPro()){
                        return -1;
                    } else if (selecao1.getGolsPro() < selecao2.getGolsPro()) {
                        return 1;
                    }
                    else{
                        return 0;
                    }
                }
            }
        }
    }


}
