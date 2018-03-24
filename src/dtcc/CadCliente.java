package dtcc;

import BancoDeDados.ClienteBean;
import BancoDeDados.ClienteDao;
import BancoDeDados.EnderecoBean;
import BancoDeDados.EnderecoDao;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jéssica
 */
public class CadCliente extends javax.swing.JFrame {

    private DefaultTableModel DefaultTableModel;
    ClienteDao cd = new ClienteDao();
    ClienteBean cb;

    public void pegaInformacoesDosCampos() {
        cb = new ClienteBean();

        cb.setPessoa(Pessoa.getSelectedIndex());
        cb.setSexo(Sexo.getSelectedIndex());
        cb.setSms(cmbSMS.getSelectedIndex());
        cb.setTipo(Tipo.getSelectedIndex());
        cb.setTxtCNPJ(txtCNPJ1.getText());
        cb.setTxtCPF(txtCPF.getText());
        cb.setTxtCelular(txtCelular.getText());
        cb.setTxtComercial(txtComercial.getText());
        cb.setData(txtData.getText());
        cb.setTxtEmail(txtEmail.getText());
        cb.setTxtFAX(txtFAX.getText());
        cb.setTxtFantasia(txtFantasia.getText());
        cb.setTxtHP(txtHP.getText());
        cb.setTxtNome(txtNome.getText());
        cb.setTxtObs(txtObs.getText());
        cb.setTxtProfissao(txtProfissao.getText());
        cb.setTxtRG(txtRG1.getText());
        cb.setTxtTelefone(txtTelefone.getText());
        if (caminhoDaImagem == null) {
            imagemPadrao();
        } else {
            cb.setImagem(caminhoDaImagem);
        }

        cb.setTxtCEP(txtCEP.getText());
        cb.setTxtEndereco(txtEndereco.getText());
        cb.setTxtNRO(txtNRO.getText());
        cb.setTxtComplemento(txtComplemento.getText());
        cb.setTxtBairro(txtBairro.getText());
        cb.setTxtCidade(txtCidade.getText());
        cb.setTipoEnd(Tipo_End.getSelectedIndex());
        cb.setUf(txtUF.getSelectedIndex());

    }

    public CadCliente() {
        initComponents();
        Codigo.setDocument(new Limite_Digitos(10));
        txtFantasia.setDocument(new Limite_Digitos(40));
        txtCPF.setDocument(new Limite_Digitos(20));
        txtNome.setDocument(new Limite_Digitos(40));
        txtTelefone.setDocument(new Limite_Digitos(18));
        txtComercial.setDocument(new Limite_Digitos(18));
        txtFAX.setDocument(new Limite_Digitos(18));
        txtHP.setDocument(new Limite_Digitos(20));
        txtEmail.setDocument(new Limite_Digitos(40));
        txtProfissao.setDocument(new Limite_Digitos(20));
        txtObs.setDocument(new Limite_Digitos(1000));
        int[] anIntArray = new int[10];
        txtObs.setLineWrap(true);
        setIcon();
        liberaCampos();

    }

    private void imagemPadrao() {

        String file = "./imagemPadrão/padrão.png";
        lblImagem.setIcon(new ImageIcon(file));
        ImageIcon icon = new ImageIcon(file);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(121, 123, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImg);
        lblImagem.setIcon(newIcon);
        lblImagem.setSize(104, 14);
        BancoDeDados.ClienteBean C = new BancoDeDados.ClienteBean();
        C.setImagem("./imagemPadrão/padrão.png");
    }

    public void limparCampos() {

        String message = " Deseja realmente limpar tudo? ";
        String title = "Limpar Dados";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            apagarCampos();

        }
    }

    public void apagarCampos() {
        Codigo.setText("");
        txtFantasia.setText("");
        txtCPF.setText("");
        txtCNPJ1.setText("");
        txtNome.setText("");
        txtRG1.setText("");
        txtData.setText("");
        txtTelefone.setText("");
        txtComercial.setText("");
        txtCelular.setText("");
        txtFAX.setText("");
        txtHP.setText("");
        txtEmail.setText("");
        txtProfissao.setText("");
        txtObs.setText("");
        Pessoa.setSelectedIndex(0);
        Sexo.setSelectedIndex(0);
        Tipo.setSelectedIndex(0);
        cmbSMS.setSelectedIndex(0);
        lblImagem.setIcon(null);

    }

    public void apagarEndereco() {
        txtCEP.setText("");
        txtEndereco.setText("");
        txtNRO.setText("");
        txtComplemento.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        Tipo_End.setSelectedIndex(0);
        txtUF.setSelectedIndex(0);

    }

    public void preparaForm() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroCliente = new javax.swing.JDesktopPane();
        GerarEndereco = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        lblBairro = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        lblIcon2 = new javax.swing.JLabel();
        txtNRO = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        btnSalvar1 = new javax.swing.JButton();
        btnFechar1 = new javax.swing.JButton();
        btnLimpar2 = new javax.swing.JButton();
        lblTipo_End = new javax.swing.JLabel();
        lblNRO = new javax.swing.JLabel();
        Tipo_End = new javax.swing.JComboBox();
        lblEndereco = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtCEP = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("#####-###");  
            txtCEP = new javax.swing.JFormattedTextField(data);  
        }  
        catch (Exception e){  
        }
        lblCEP = new javax.swing.JLabel();
        txtUF = new javax.swing.JComboBox();
        txtEndereco = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblCNPJ = new javax.swing.JLabel();
        txtCNPJ1 = new javax.swing.JFormattedTextField();
        lblCNPJ2 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("(##) ####-####");  
            txtTelefone= new javax.swing.JFormattedTextField(data);  
        }  
        catch (Exception e){  
        }
        lblHP = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        txtHP = new javax.swing.JTextField();
        lblCel = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        Pessoa = new javax.swing.JComboBox();
        btnFechar = new javax.swing.JButton();
        txtCelular = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("(##) #####-####");  
            txtCelular = new javax.swing.JFormattedTextField(data);  
        }  
        catch (Exception e){  
        }
        txtFantasia = new javax.swing.JTextField();
        lblTitulo1 = new javax.swing.JLabel();
        btnLimpar1 = new javax.swing.JButton();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        lblCPF2 = new javax.swing.JLabel();
        btnInternet = new javax.swing.JButton();
        lblProfissao = new javax.swing.JLabel();
        btnRemover = new javax.swing.JButton();
        gerar = new javax.swing.JButton();
        lblRG = new javax.swing.JLabel();
        txtRG1 = new javax.swing.JTextField();
        lblCom = new javax.swing.JLabel();
        txtProfissao = new javax.swing.JTextField();
        lblCel1 = new javax.swing.JLabel();
        lblImagem = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        Sexo = new javax.swing.JComboBox();
        lblCodigo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblIcon1 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        Tipo = new javax.swing.JComboBox();
        lblObs = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblFantasia = new javax.swing.JLabel();
        lblPessoa = new javax.swing.JLabel();
        btnSelecionar = new javax.swing.JButton();
        lblTipo = new javax.swing.JLabel();
        btnTirar = new javax.swing.JButton();
        cmbSMS = new javax.swing.JComboBox();
        lblEmail = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        txtComercial = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("(##) ####-####");  
            txtComercial= new javax.swing.JFormattedTextField(data);  
        }  
        catch (Exception e){  
        }
        lblFAX = new javax.swing.JLabel();
        txtFAX = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("(##) ####-####");
            txtFAX= new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        lblFantasia1 = new javax.swing.JLabel();
        lblCor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CadastroCliente.setBackground(new java.awt.Color(255, 255, 255));
        CadastroCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GerarEndereco.setTitle("Cadastro de Endereço");
        GerarEndereco.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/dtcc/iconframe.png"))); // NOI18N
        GerarEndereco.setVisible(false);
        GerarEndereco.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBairro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBairro.setText("Bairro:");
        jPanel1.add(lblBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        lblCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCidade.setText("Cidade:");
        jPanel1.add(lblCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 190, -1, -1));

        lblTitulo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo2.setText("Controle de Endereço");
        jPanel1.add(lblTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 11, -1, 32));
        jPanel1.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 188, 154, -1));

        lblUF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUF.setText("UF:");
        jPanel1.add(lblUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 158, -1, -1));
        jPanel1.add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 156, 416, -1));

        lblIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Endereço.png"))); // NOI18N
        jPanel1.add(lblIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 36, -1));
        jPanel1.add(txtNRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 127, 60, -1));
        jPanel1.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 188, 142, -1));

        btnSalvar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inserir.png"))); // NOI18N
        btnSalvar1.setText("Inserir");
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 100, 30));

        btnFechar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFechar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair_1.png"))); // NOI18N
        btnFechar1.setText("Fechar");
        btnFechar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnFechar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, 30));

        btnLimpar2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Remove.png"))); // NOI18N
        btnLimpar2.setText("Limpar");
        btnLimpar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 100, 30));

        lblTipo_End.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTipo_End.setText("Tipo de Endereço:");
        jPanel1.add(lblTipo_End, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 99, 123, -1));

        lblNRO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNRO.setText("NRO:");
        jPanel1.add(lblNRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 129, -1, -1));

        Tipo_End.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0- Residencial", "1- Comercial"}));
        Tipo_End.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tipo_EndActionPerformed(evt);
            }
        });
        jPanel1.add(Tipo_End, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 97, 133, -1));

        lblEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEndereco.setText("Endereço:");
        jPanel1.add(lblEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 129, 66, -1));

        lblComplemento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblComplemento.setText("Complemento:");
        jPanel1.add(lblComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 158, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisar.png"))); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 96, -1, -1));

        txtCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEPActionPerformed(evt);
            }
        });
        jPanel1.add(txtCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 97, 129, -1));

        lblCEP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCEP.setText("CEP:");
        jPanel1.add(lblCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 99, -1, -1));

        txtUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jPanel1.add(txtUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 156, 60, -1));
        jPanel1.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 127, 439, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 49, 621, -1));

        GerarEndereco.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 654, 311));

        CadastroCliente.add(GerarEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        CadastroCliente.setLayer(GerarEndereco, javax.swing.JLayeredPane.POPUP_LAYER);

        lblCNPJ.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCNPJ.setText("CNPJ:");
        CadastroCliente.add(lblCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 92, -1, -1));

        try {
            txtCNPJ1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJ1.setText("");
        txtCNPJ1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCNPJ1MouseClicked(evt);
            }
        });
        txtCNPJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCNPJ1ActionPerformed(evt);
            }
        });
        txtCNPJ1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCNPJ1KeyReleased(evt);
            }
        });
        CadastroCliente.add(txtCNPJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 140, -1));

        lblCNPJ2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCNPJ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dtcc/invalido.png"))); // NOI18N
        CadastroCliente.add(lblCNPJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, 30));
        CadastroCliente.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 159, -1));

        lblHP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblHP.setText("HP:");
        CadastroCliente.add(lblHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 212, -1, -1));

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar peq.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        CadastroCliente.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 100, -1));
        CadastroCliente.add(txtHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 150, -1));

        lblCel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCel.setText("Cel:");
        CadastroCliente.add(lblCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 186, -1, -1));

        lblSexo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSexo.setText("Sexo:");
        CadastroCliente.add(lblSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 123, 48, -1));

        Pessoa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0- Fisica", "1- Juridica"}));
        Pessoa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                PessoaItemStateChanged(evt);
            }
        });
        Pessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PessoaMouseClicked(evt);
            }
        });
        Pessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PessoaActionPerformed(evt);
            }
        });
        CadastroCliente.add(Pessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 130, -1));

        btnFechar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair_1.png"))); // NOI18N
        btnFechar.setText("Sair");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        CadastroCliente.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 100, -1));
        CadastroCliente.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 184, 160, -1));
        CadastroCliente.add(txtFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 63, 375, -1));

        lblTitulo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo1.setText("Cadastro de Clientes");
        CadastroCliente.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 0, -1, 45));

        btnLimpar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Remove.png"))); // NOI18N
        btnLimpar1.setText("Limpar");
        btnLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar1ActionPerformed(evt);
            }
        });
        CadastroCliente.add(btnLimpar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 100, -1));

        lblCPF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCPF.setText("CPF:");
        CadastroCliente.add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });
        txtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCPFKeyReleased(evt);
            }
        });
        CadastroCliente.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 120, -1));

        lblCPF2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCPF2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dtcc/invalido.png"))); // NOI18N
        CadastroCliente.add(lblCPF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 30, 30));

        btnInternet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Internet.png"))); // NOI18N
        btnInternet.setText("Internet");
        btnInternet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInternetActionPerformed(evt);
            }
        });
        CadastroCliente.add(btnInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 121, -1));

        lblProfissao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblProfissao.setText("Profissão:");
        CadastroCliente.add(lblProfissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 243, -1, -1));

        btnRemover.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Remove.png"))); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        CadastroCliente.add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 121, -1));

        gerar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gerar Rota.png"))); // NOI18N
        gerar.setText("Inserir Endereço");
        gerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarActionPerformed(evt);
            }
        });
        CadastroCliente.add(gerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        lblRG.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRG.setText("RG:");
        CadastroCliente.add(lblRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 123, -1, -1));
        CadastroCliente.add(txtRG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 160, -1));

        lblCom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCom.setText("Com:");
        CadastroCliente.add(lblCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 185, -1, 20));
        CadastroCliente.add(txtProfissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 241, 140, -1));

        lblCel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCel1.setText("SMS: ");
        CadastroCliente.add(lblCel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 212, -1, -1));

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/padrão.png"))); // NOI18N
        lblImagem.setText("     ");
        lblImagem.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImagem.setMaximumSize(new java.awt.Dimension(0, 0));
        lblImagem.setMinimumSize(new java.awt.Dimension(0, 0));
        CadastroCliente.add(lblImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 121, 123));

        txtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomeMouseClicked(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        CadastroCliente.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 153, 365, -1));

        Sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0- Feminino", "1- Masculino"}));
        Sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexoActionPerformed(evt);
            }
        });
        CadastroCliente.add(Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 130, -1));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigo.setText("Código:");
        CadastroCliente.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 65, -1, -1));

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNome.setText("Nome:");
        CadastroCliente.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 155, -1, -1));

        lblIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cliente Grande.png"))); // NOI18N
        CadastroCliente.add(lblIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 34, 45));

        lblData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblData.setText("Data de Nasc:");
        CadastroCliente.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 155, -1, -1));

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CadastroCliente.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 110, 30));

        Tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0- Cliente Ativo", "1- Cliente Bloqueado", "2-Cliente Inativo"}));
        Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoActionPerformed(evt);
            }
        });
        CadastroCliente.add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 121, 150, -1));

        lblObs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblObs.setText("Obs:");
        CadastroCliente.add(lblObs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 272, 64, -1));

        Codigo.setEditable(false);
        Codigo.setBackground(new java.awt.Color(204, 204, 255));
        Codigo.setEnabled(false);
        CadastroCliente.add(Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 63, 130, -1));
        CadastroCliente.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 241, 360, -1));

        lblFantasia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFantasia.setText("Fantasia:");
        CadastroCliente.add(lblFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 65, -1, -1));

        lblPessoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPessoa.setText("Pessoa:");
        CadastroCliente.add(lblPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 52, 20));

        btnSelecionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pasta de foto.png"))); // NOI18N
        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });
        CadastroCliente.add(btnSelecionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 121, -1));

        lblTipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTipo.setText("Tipo:");
        CadastroCliente.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 123, -1, -1));

        btnTirar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Webcam.png"))); // NOI18N
        btnTirar.setText("Tirar Foto");
        btnTirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTirarActionPerformed(evt);
            }
        });
        CadastroCliente.add(btnTirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 121, -1));

        cmbSMS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0- Sim", "1- Não"}));
        cmbSMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSMSActionPerformed(evt);
            }
        });
        CadastroCliente.add(cmbSMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 210, 160, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmail.setText("E-mail:");
        CadastroCliente.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 243, -1, -1));

        lblTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTelefone.setText("Telefone:");
        CadastroCliente.add(lblTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 185, -1, -1));

        txtObs.setColumns(20);
        txtObs.setRows(5);
        jScrollPane3.setViewportView(txtObs);

        CadastroCliente.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 590, 70));
        CadastroCliente.add(txtComercial, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 184, 150, -1));

        lblFAX.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFAX.setText("FAX:");
        CadastroCliente.add(lblFAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 212, -1, -1));
        CadastroCliente.add(txtFAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 159, -1));

        lblFantasia1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFantasia1.setText("Fantasia:");
        CadastroCliente.add(lblFantasia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 65, -1, -1));

        lblCor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lblcor.png"))); // NOI18N
        CadastroCliente.add(lblCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 420));

        getContentPane().add(CadastroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 410));

        setSize(new java.awt.Dimension(906, 446));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SexoActionPerformed

    private void btnTirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTirarActionPerformed
        Form_webcam LG = new Form_webcam();
        LG.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTirarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        lblImagem.setIcon(null);

    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        CadCliente LG = new CadCliente();
        LG.setVisible(false);
        dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed

        BancoDeDados.ClienteBean c = new BancoDeDados.ClienteBean();
        c.setImagem(this.retornacaminho());

    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnInternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInternetActionPerformed
        Desktop desk = java.awt.Desktop.getDesktop();
        try {
            desk.browse(new java.net.URI("https://www.google.com.br/imghp?hl=pt-BR&tab=wi&ei=hFvtUqmWLIjskQePxoDADQ&ved=0CAQQqi4oAg//"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnInternetActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNomeMouseClicked

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimpar1ActionPerformed

    private void cmbSMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSMSActionPerformed

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoActionPerformed

    private void liberaCampos() {
        if (Pessoa.getSelectedIndex() == 0) {
            txtFantasia.setEnabled(false);
            txtCNPJ1.setEnabled(false);

            txtCPF.setEnabled(true);
            txtRG1.setEnabled(true);
            txtProfissao.setEnabled(true);
            Sexo.setEnabled(true);
            txtData.setEnabled(true);
        } else {
            txtFantasia.setEnabled(true);
            txtCNPJ1.setEnabled(true);

            txtCPF.setEnabled(false);
            txtRG1.setEnabled(false);
            txtProfissao.setEnabled(false);
            Sexo.setEnabled(false);
            txtData.setEnabled(false);

        }
    }

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if ((txtTelefone.getText().equals("(  )    -    "))) {
            /**
             * if ((txtNome.getText().isEmpty()) ||
             * (txtEmail.getText().isEmpty()) || (txtCPF.getText().isEmpty()) ||
             * (txtTelefone.getText().equals("( ) - "))) {
             * JOptionPane.showMessageDialog(null, "Alguns campos não podem
             * retornar vazios"); *
             */
        } else {
            pegaInformacoesDosCampos();
            cd.inserirCliente(cb);
            JOptionPane.showMessageDialog(null, "Cliente " + txtNome.getText() + " cadastrado com sucesso! ", "Aviso", 1);
            apagarCampos();
            apagarEndereco();

    }//GEN-LAST:event_btnSalvarActionPerformed
    }
    private void gerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarActionPerformed
        CadastroCliente.setVisible(true);
        GerarEndereco.setVisible(true);
    }//GEN-LAST:event_gerarActionPerformed

    private void PessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PessoaActionPerformed

    private void txtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        buscaCep();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Tipo_EndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tipo_EndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tipo_EndActionPerformed

    private void btnLimpar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar2ActionPerformed
        apagarEndereco();
    }//GEN-LAST:event_btnLimpar2ActionPerformed

    private void btnFechar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechar1ActionPerformed
        GerarEndereco.setVisible(false);
        CadastroCliente.setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_btnFechar1ActionPerformed

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed
        GerarEndereco.setVisible(false);
        CadastroCliente.setVisible(true);
        /**
         * pegaInformacoesDosCampos(); cd.inserirCliente(cb);
         * JOptionPane.showMessageDialog(null, "Endereço do cliente " +
         * txtNome.getText() + " cadastrado com sucesso! ", "Aviso", 1);
         * apagarEndereco();
         *
         */
    }//GEN-LAST:event_btnSalvar1ActionPerformed

    private void txtCNPJ1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCNPJ1MouseClicked

    }//GEN-LAST:event_txtCNPJ1MouseClicked

    private void txtCNPJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCNPJ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCNPJ1ActionPerformed

    private void txtCNPJ1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCNPJ1KeyReleased
        validandoCNPJ();
    }//GEN-LAST:event_txtCNPJ1KeyReleased

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtCPFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPFKeyReleased
        validandoCpf();
    }//GEN-LAST:event_txtCPFKeyReleased

    private void PessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PessoaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PessoaMouseClicked

    private void PessoaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_PessoaItemStateChanged
        liberaCampos();        // TODO add your handling code here:
    }//GEN-LAST:event_PessoaItemStateChanged

    public void run() {
        new CadCliente().setVisible(true);

    }
    ;
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane CadastroCliente;
    private javax.swing.JTextField Codigo;
    private javax.swing.JInternalFrame GerarEndereco;
    private javax.swing.JComboBox Pessoa;
    private javax.swing.JComboBox Sexo;
    private javax.swing.JComboBox Tipo;
    private javax.swing.JComboBox Tipo_End;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnFechar1;
    private javax.swing.JButton btnInternet;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnLimpar2;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JButton btnTirar;
    private javax.swing.JComboBox cmbSMS;
    private javax.swing.JButton gerar;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblCNPJ2;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCPF2;
    private javax.swing.JLabel lblCel;
    private javax.swing.JLabel lblCel1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCom;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblFAX;
    private javax.swing.JLabel lblFantasia;
    private javax.swing.JLabel lblFantasia1;
    private javax.swing.JLabel lblHP;
    private javax.swing.JLabel lblIcon1;
    private javax.swing.JLabel lblIcon2;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblNRO;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblPessoa;
    private javax.swing.JLabel lblProfissao;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipo_End;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblUF;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JFormattedTextField txtCNPJ1;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComercial;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFAX;
    private javax.swing.JTextField txtFantasia;
    private javax.swing.JTextField txtHP;
    private javax.swing.JTextField txtNRO;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTextField txtProfissao;
    private javax.swing.JTextField txtRG1;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JComboBox txtUF;
    // End of variables declaration//GEN-END:variables

    public void validandoCpf() {
        Icon icon = new ImageIcon(getClass().getResource("valido.png"));
        Icon icon2 = new ImageIcon(getClass().getResource("invalido.png"));
        // aqui vc coloca a rotina de validacao  
        Boolean validado;
        ValidaCpf cpf = new ValidaCpf();
        validado = cpf.validacpf(txtCPF.getText());
        //validacpf  
        if (validado) {
            lblCPF2.setIcon(icon);
        } else {
            lblCPF2.setIcon(icon2);
        }

    }

    public void validandoCNPJ() {
        Icon icon = new ImageIcon(getClass().getResource("valido.png"));
        Icon icon2 = new ImageIcon(getClass().getResource("invalido.png"));
        // aqui vc coloca a rotina de validacao  
        Boolean validado;
        validaCnpj vCnpj = new validaCnpj();
        validado = vCnpj.isCnpjValido(txtCNPJ1.getText());
        //validacnpj 
        if (validado) {
            lblCNPJ2.setIcon(icon);
        } else {
            lblCNPJ2.setIcon(icon2);
        }

    }

    public void buscaCep() {
        //Faz a busca para o cep 58043-280
        WebServiceCep webServiceCep = WebServiceCep.searchCep(txtCEP.getText());
        //A ferramenta de busca ignora qualquer caracter que n?o seja n?mero.

        //caso a busca ocorra bem, imprime os resultados.
        if (webServiceCep.wasSuccessful()) {
            txtEndereco.setText(webServiceCep.getLogradouroFull());
            txtCidade.setText(webServiceCep.getCidade());
            txtBairro.setText(webServiceCep.getBairro());
            txtUF.setSelectedItem(webServiceCep.getUf());
            System.out.println("Cep: " + webServiceCep.getCep());
            System.out.println("Logradouro: " + webServiceCep.getLogradouroFull());
            System.out.println("Bairro: " + webServiceCep.getBairro());
            System.out.println("Cidade: "
                    + webServiceCep.getCidade() + "/" + webServiceCep.getUf());

            //caso haja problemas imprime as exce??es.
        } else {
            JOptionPane.showMessageDialog(null, "CEP Inválido ! " + webServiceCep.getResulCode());

            JOptionPane.showMessageDialog(null, "Descrição do erro: " + webServiceCep.getResultText());
        }
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconframe.png"))); //To change body of generated methods, choose Tools | Templates.
    }

    String caminhoDaImagem;

    private String retornacaminho() throws java.lang.NullPointerException {
        String file = "";
        JFileChooser dlg = new JFileChooser();
        int opcion = dlg.showOpenDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            file += dlg.getSelectedFile().getPath();
            lblImagem.setIcon(new ImageIcon(file));
            ImageIcon icon = new ImageIcon(file);
            Image img = icon.getImage();
            Image newImg = img.getScaledInstance(121, 123, java.awt.Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(newImg);
            lblImagem.setIcon(newIcon);
            lblImagem.setSize(104, 14);
            caminhoDaImagem = file;
        }
        return file;
    }
}
