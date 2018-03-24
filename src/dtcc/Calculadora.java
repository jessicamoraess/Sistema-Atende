package dtcc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class Calculadora extends JFrame {

    private JMenuBar MenuBar = new JMenuBar();

    private JMenu Calculadora = new JMenu("Calculadora");
    private JMenuItem Sair = new JMenuItem("Sair");

    private JMenu Editar = new JMenu("Editar");
    private JMenuItem Copiar = new JMenuItem("Copiar");
    private JMenuItem Colar = new JMenuItem("Colar");
    private JMenuItem Recortar = new JMenuItem("Recortar");

    // Organizando o Layout da Calculadora    
    private GridLayout Layout = new GridLayout(6, 4, 4, 4);
    // Define a fonte do visor    
    private Font Fonte_Visor = new Font("Consolas", Font.PLAIN, 26);
    private JPanel Geral = new JPanel();
    private JPanel Panel_B = new JPanel();
    private JPanel Panel = new JPanel();

    private JLabel Visor = new JLabel("0");

    private JButton C = new JButton("C");
    private JButton B_B = new JButton("<=");
    private JButton B1 = new JButton("1");
    private JButton B2 = new JButton("2");
    private JButton B3 = new JButton("3");
    private JButton B4 = new JButton("4");
    private JButton B5 = new JButton("5");
    private JButton B6 = new JButton("6");
    private JButton B7 = new JButton("7");
    private JButton B8 = new JButton("8");
    private JButton B9 = new JButton("9");
    private JButton B0 = new JButton("0");
    private JButton B_I = new JButton("=");
    private JButton B_V = new JButton(".");
    private JButton B_Ad = new JButton("+");
    private JButton B_Sb = new JButton("-");
    private JButton B_Mt = new JButton("X");
    private JButton B_Dv = new JButton("/");
    private JButton B_Inverso = new JButton("1/x");
    private JButton B_Expon = new JButton("x²");
    private JButton B_Log = new JButton("Log");
    private JButton B_Raiz = new JButton("Rz");
    private JButton B_Seno = new JButton("Sin");
    private JButton B_Cosseno = new JButton("Cos");
    //private JButton B_Tangente = new JButton("T"); 

    public Calculadora() {
        super("Calculadora");

        // Exibi uma mensagem quando o usuário deixa o mouse sobre o botão         
        B_Log.setToolTipText("Logaritmo na base 10");
        B_Raiz.setToolTipText("Raiz");
        B_Seno.setToolTipText("Seno em Graus");
        B_Cosseno.setToolTipText("Cosseno em Graus");
        C.setToolTipText("Limpa o visor");
        B_B.setToolTipText("Apaga o último caractere digitado");
        B_Inverso.setToolTipText("Inverso");
        B_Expon.setToolTipText("Quadrado");

        // Adicionando eventos com o teclado        
        B1.setMnemonic(KeyEvent.VK_NUMPAD1);
        B2.setMnemonic(KeyEvent.VK_NUMPAD2);
        B3.setMnemonic(KeyEvent.VK_NUMPAD3);
        B4.setMnemonic(KeyEvent.VK_NUMPAD4);
        B5.setMnemonic(KeyEvent.VK_NUMPAD5);
        B6.setMnemonic(KeyEvent.VK_NUMPAD6);
        B7.setMnemonic(KeyEvent.VK_NUMPAD7);
        B8.setMnemonic(KeyEvent.VK_NUMPAD8);
        B9.setMnemonic(KeyEvent.VK_NUMPAD9);
        B0.setMnemonic(KeyEvent.VK_NUMPAD0);

        B_Ad.setMnemonic(KeyEvent.VK_ADD);
        B_Sb.setMnemonic(KeyEvent.VK_SUBTRACT);
        B_Mt.setMnemonic(KeyEvent.VK_MULTIPLY);
        B_Dv.setMnemonic(KeyEvent.VK_DIVIDE);
        B_I.setMnemonic(KeyEvent.VK_ENTER);
        B_B.setMnemonic(KeyEvent.VK_BACK_SPACE);
        C.setMnemonic(KeyEvent.VK_DELETE);
        //B_V.setMnemonic(KeyEvent.vK_P);        
        B_Log.setMnemonic(KeyEvent.VK_L);

        // Adiciona os elementos a janela        
        Calculadora.add(Sair);

        Editar.add(Copiar);
        Editar.add(Colar);
        Editar.add(Recortar);

        MenuBar.add(Calculadora);
        MenuBar.add(Editar);

        // Adicionando a barra de menu no JFrame        
        this.setJMenuBar(MenuBar);

        Panel.add(B_Log);
        Panel.add(B_Raiz);
        Panel.add(B_Seno);
        Panel.add(B_Cosseno);
        //Panel.add(B_Tangente);

        Panel.add(C);
        Panel.add(B_B);
        Panel.add(B_Inverso);
        Panel.add(B_Expon);

        Panel.add(B7);
        Panel.add(B8);
        Panel.add(B9);
        Panel.add(B_Dv);

        Panel.add(B4);
        Panel.add(B5);
        Panel.add(B6);
        Panel.add(B_Mt);

        Panel.add(B1);
        Panel.add(B2);
        Panel.add(B3);
        Panel.add(B_Sb);

        Panel.add(B0);
        Panel.add(B_V);
        Panel.add(B_I);
        Panel.add(B_Ad);

        Panel.setLayout(Layout);
        Visor.setFont(Fonte_Visor);
        // Faz com que o texto seja exibido a direita        
        Visor.setHorizontalAlignment(SwingConstants.RIGHT);
        // Colocando título em um JPanel        
        Visor.setBorder(BorderFactory.createTitledBorder(""));
        Panel_B.add(Panel);

        // Definindo o tamanho padrão do visor da calculadora       
        Visor.setPreferredSize(new Dimension(230, 80));

        Geral.add(Visor);
        Geral.add(Panel_B);
        add(Geral);

        ButtonHandler Handler = new ButtonHandler();
        B1.addActionListener(Handler);
        B2.addActionListener(Handler);
        B3.addActionListener(Handler);
        B4.addActionListener(Handler);
        B5.addActionListener(Handler);
        B6.addActionListener(Handler);
        B7.addActionListener(Handler);
        B8.addActionListener(Handler);
        B9.addActionListener(Handler);
        B0.addActionListener(Handler);

        C.addActionListener(Handler);
        B_B.addActionListener(Handler);
        B_Ad.addActionListener(Handler);
        B_Sb.addActionListener(Handler);
        B_Mt.addActionListener(Handler);
        B_Dv.addActionListener(Handler);
        B_I.addActionListener(Handler);
        B_Inverso.addActionListener(Handler);
        B_Expon.addActionListener(Handler);
        B_V.addActionListener(Handler);

        B_Log.addActionListener(Handler);
        B_Raiz.addActionListener(Handler);
        B_Seno.addActionListener(Handler);
        B_Cosseno.addActionListener(Handler);

        Sair.addActionListener(Handler);
        Copiar.addActionListener(Handler);
        Colar.addActionListener(Handler);
        Recortar.addActionListener(Handler);

    }

    private class ButtonHandler implements ActionListener {

        String cadeia = "0";
        String copiar = "";
        double Num1, Num2, resultado;
        char Operacao = 'n';
        int Achou, zerar;

        public void actionPerformed(ActionEvent event) {

            if (event.getSource() == Sair) // Fecha o programa quando chamado                 
            {
                System.exit(0);
            }

            if (event.getSource() == Copiar) {

                // Obtêm o valor atual na tela que está no formato String                 
                copiar = Visor.getText();

                Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
                ClipboardOwner Selecao = new StringSelection(cadeia);
                board.setContents((Transferable) Selecao, Selecao);
            }

            if (event.getSource() == Colar) {
                cadeia = copiar;
            }

            if (event.getSource() == Recortar) {

                copiar = Visor.getText();

                Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
                ClipboardOwner Selecao = new StringSelection(cadeia);
                board.setContents((Transferable) Selecao, Selecao);

                cadeia = "0";
            }

            if (event.getSource() == B_Log) {
                // Utilização de operações matemáticas                 
                cadeia = String.valueOf(Math.log10(Double.parseDouble(cadeia)));
                zerar = 1;
            }

            if (event.getSource() == B_Raiz) {
                cadeia = String.valueOf(Math.sqrt(Double.parseDouble(cadeia)));
                zerar = 1;
            }

            if (event.getSource() == B_Seno) {
                cadeia = String.valueOf(Math.sin(Math.toRadians(Double.parseDouble(cadeia))));
                zerar = 1;
            }

            if (event.getSource() == B_Cosseno) {
                cadeia = String.valueOf(Math.cos(Math.toRadians(Double.parseDouble(cadeia))));
                zerar = 1;
            }

            if (event.getSource() == B1) {
                // Efetua a ação de enviar o valor para o visor                 
                if (zerar == 1) {
                    cadeia = "";
                }
                if (cadeia.equals("0")) {
                    cadeia = "";
                }
                cadeia = cadeia + "1";
                zerar = 0;
            }

            if (event.getSource() == B2) {
                if (zerar == 1) {
                    cadeia = "";
                }
                if (cadeia.equals("0")) {
                    cadeia = "";
                }
                cadeia = cadeia + "2";
                zerar = 0;
            }

            if (event.getSource() == B3) {
                if (zerar == 1) {
                    cadeia = "";
                }
                if (cadeia.equals("0")) {
                    cadeia = "";
                }
                cadeia = cadeia + "3";
                zerar = 0;
            }

            if (event.getSource() == B4) {
                if (zerar == 1) {
                    cadeia = "";
                }
                if (cadeia.equals("0")) {
                    cadeia = "";
                }
                cadeia = cadeia + "4";
                zerar = 0;
            }

            if (event.getSource() == B5) {
                if (zerar == 1) {
                    cadeia = "";
                }
                if (cadeia.equals("0")) {
                    cadeia = "";
                }
                cadeia = cadeia + "5";
                zerar = 0;
            }

            if (event.getSource() == B6) {
                if (zerar == 1) {
                    cadeia = "";
                }
                if (cadeia.equals("0")) {
                    cadeia = "";
                }
                cadeia = cadeia + "6";
                zerar = 0;
            }

            if (event.getSource() == B7) {
                if (zerar == 1) {
                    cadeia = "";
                }
                if (cadeia.equals("0")) {
                    cadeia = "";
                }
                cadeia = cadeia + "7";
                zerar = 0;
            }

            if (event.getSource() == B8) {
                if (zerar == 1) {
                    cadeia = "";
                }
                if (cadeia.equals("0")) {
                    cadeia = "";
                }
                cadeia = cadeia + "8";
                zerar = 0;
            }

            if (event.getSource() == B9) {
                if (zerar == 1) {
                    cadeia = "";
                }
                if (cadeia.equals("0")) {
                    cadeia = "";
                }
                cadeia = cadeia + "9";
                zerar = 0;
            }

            if (event.getSource() == B_V) {
                Achou = 0;
                if (zerar == 1) {
                    cadeia = "";
                }

                for (int i = 0; i < cadeia.length(); ++i) {
                    if (cadeia.charAt(i) == '.') {
                        Achou = 1;
                    }
                }

                if (cadeia.equals("")) {
                    cadeia = cadeia + "0.";
                } else if (Achou == 0) {
                    cadeia = cadeia + ".";
                }

                zerar = 0;
            }

            if (event.getSource() == B0) {
                if (zerar == 1) {
                    cadeia = "";
                }

                if (!cadeia.equals("0")) {
                    cadeia = cadeia + "0";
                } else {
                    zerar = 1;
                }
                //Operacao = 'n';
                zerar = 0;
            }

            if (event.getSource() == C) {
                cadeia = "0";
                zerar = 1;
            }

            if (event.getSource() == B_B) {
                if (cadeia.length() > 1) {
                    cadeia = cadeia.substring(0, cadeia.length() - 1);
                } else {
                    cadeia = "0";
                    zerar = 1;
                }
            }

            if (event.getSource() == B_Inverso) {
                // Inverte o valor presente no visor                 
                cadeia = String.valueOf(1 / Double.parseDouble(cadeia));
                zerar = 1;
            }

            if (event.getSource() == B_Expon) {
                cadeia = String.valueOf(Math.pow(Double.parseDouble(cadeia), 2));
                zerar = 1;
            }

            if (event.getSource() == B_Ad) {
                Num1 = Double.parseDouble(Visor.getText());
                Operacao = '+';
                zerar = 1;
            }

            if (event.getSource() == B_Sb) {
                Num1 = Double.parseDouble(Visor.getText());
                Operacao = '-';
                zerar = 1;
            }

            if (event.getSource() == B_Mt) {
                Num1 = Double.parseDouble(Visor.getText());
                Operacao = '*';
                zerar = 1;
            }

            if (event.getSource() == B_Dv) {
                Num1 = Double.parseDouble(Visor.getText());
                Operacao = '/';
                zerar = 1;
            }

            if (event.getSource() == B_I) {
                // Converte uma String em Double                
                Num2 = Double.parseDouble(Visor.getText());

                switch (Operacao) {

                    case 'n':
                        resultado = Num2;
                        break;

                    case '+':
                        resultado = Num1 + Num2;
                        break;

                    case '-':
                        resultado = Num1 - Num2;
                        break;

                    case '*':
                        resultado = Num1 * Num2;
                        break;

                    case '/':
                        resultado = Num1 / Num2;
                        break;
                }

                cadeia = String.valueOf(resultado);
                zerar = 1;
            }

            Visor.setText("" + cadeia);

        }
    }

    public void run() {
        Calculadora Propriedades_Calculadora = new Calculadora();
        // Define o tamanho da tela    
        Propriedades_Calculadora.setSize(255, 330);
        // Fecha a janela    
        Propriedades_Calculadora.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Torna a janela visível    
        Propriedades_Calculadora.setVisible(true);
        // Desabilita o maximizar    
        Propriedades_Calculadora.setResizable(false);
        // Abre a janela no meio da tela    
        Propriedades_Calculadora.setLocationRelativeTo(null);

    }
;

}
