/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtcc;

import BancoDeDados.conexao;
import java.awt.EventQueue;
import java.beans.Beans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.proteanit.sql.DbUtils;
import java.awt.Desktop;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class Consulta_Funcionario extends JPanel {

    ResultSet rs, rs2;

    public Consulta_Funcionario() {
        initComponents();
        listarCadastros();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
            java.util.Collection data = query.getResultList();
            for (Object entity : data) {
                entityManager.refresh(entity);
            }
            list.clear();
            list.addAll(data);
            listarCadastros();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("bd?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM CadFuncionario_1 c");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        ConsultaFun = new javax.swing.JDesktopPane();
        PainelFuncionario = new javax.swing.JPanel();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        btnTirar2 = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();
        btnInternet = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();
        codFunLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        sexoLabel = new javax.swing.JLabel();
        cpfLabel = new javax.swing.JLabel();
        dataNascLabel = new javax.swing.JLabel();
        rgLabel = new javax.swing.JLabel();
        observacaoLabel = new javax.swing.JLabel();
        codFunField = new javax.swing.JTextField();
        nomeField = new javax.swing.JTextField();
        sexoField = new javax.swing.JTextField();
        cpfField = new javax.swing.JTextField();
        dataNascField = new javax.swing.JTextField();
        rgField = new javax.swing.JTextField();
        observacaoField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        cmbPesquisar = new javax.swing.JComboBox();
        lblPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        refreshButton = new javax.swing.JButton();
        btnEnd = new javax.swing.JButton();
        btnTel = new javax.swing.JButton();
        ConsultaTelefone = new javax.swing.JInternalFrame();
        PainelTelefone = new javax.swing.JPanel();
        lblTitulo3 = new javax.swing.JLabel();
        lblIcon3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnFechar2 = new javax.swing.JButton();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("(##) ####-####");  
            txtTelefone= new javax.swing.JFormattedTextField(data);  
        }  
        catch (Exception e){  
        }
        lblCom = new javax.swing.JLabel();
        txtComercial = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("(##) ####-####");  
            txtComercial= new javax.swing.JFormattedTextField(data);  
        }  
        catch (Exception e){  
        }
        lblCel = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("(##) #####-####");  
            txtCelular = new javax.swing.JFormattedTextField(data);  
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
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtCod1 = new javax.swing.JTextField();
        lblTipo_End2 = new javax.swing.JLabel();
        btnLimpar3 = new javax.swing.JButton();
        txtEditar1 = new javax.swing.JButton();
        ConsultaEndereco = new javax.swing.JInternalFrame();
        PainelEndereco = new javax.swing.JPanel();
        lblBairro = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        lblIcon2 = new javax.swing.JLabel();
        txtNRO = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        lblTipo_End = new javax.swing.JLabel();
        lblNRO = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JLabel();
        lblCEP = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtCEP = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("#####-###");  
            txtCod = new javax.swing.JFormattedTextField(data);  
        }  
        catch (Exception e){  
        }
        txtUF = new javax.swing.JTextField();
        txtCod = new javax.swing.JTextField();
        lblTipo_End1 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        btnLimpar2 = new javax.swing.JButton();
        txtEditar = new javax.swing.JButton();
        btnFechar3 = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        setBackground(new java.awt.Color(255, 255, 255));

        ConsultaFun.setBackground(new java.awt.Color(255, 255, 255));
        ConsultaFun.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        PainelFuncionario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codFun}"));
        columnBinding.setColumnName("Cod Fun");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${sexo}"));
        columnBinding.setColumnName("Sexo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cpf}"));
        columnBinding.setColumnName("Cpf");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataNasc}"));
        columnBinding.setColumnName("Data Nasc");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rg}"));
        columnBinding.setColumnName("Rg");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${observacao}"));
        columnBinding.setColumnName("Observacao");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterTable.addMouseListener(formListener);
        masterScrollPane.setViewportView(masterTable);

        PainelFuncionario.add(masterScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 162, 701, 204));

        btnTirar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTirar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Webcam.png"))); // NOI18N
        btnTirar2.setEnabled(false);
        btnTirar2.addActionListener(formListener);
        PainelFuncionario.add(btnTirar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 11, -1, -1));

        btnSelecionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pasta de foto.png"))); // NOI18N
        btnSelecionar.setEnabled(false);
        btnSelecionar.addActionListener(formListener);
        PainelFuncionario.add(btnSelecionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 42, -1, -1));

        btnInternet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Internet.png"))); // NOI18N
        btnInternet.setEnabled(false);
        btnInternet.addActionListener(formListener);
        PainelFuncionario.add(btnInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 73, -1, -1));

        btnRemover.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Remove.png"))); // NOI18N
        btnRemover.setEnabled(false);
        btnRemover.addActionListener(formListener);
        PainelFuncionario.add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 104, -1, -1));

        lblImagem.setText("     ");
        lblImagem.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImagem.setMaximumSize(new java.awt.Dimension(0, 0));
        lblImagem.setMinimumSize(new java.awt.Dimension(0, 0));
        PainelFuncionario.add(lblImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 11, 121, 123));

        codFunLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codFunLabel.setText("Cod Fun:");
        PainelFuncionario.add(codFunLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 386, -1, -1));

        nomeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nomeLabel.setText("Nome:");
        PainelFuncionario.add(nomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 464, -1, -1));

        sexoLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sexoLabel.setText("Sexo:");
        PainelFuncionario.add(sexoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 412, -1, -1));

        cpfLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cpfLabel.setText("CPF:");
        PainelFuncionario.add(cpfLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 438, -1, -1));

        dataNascLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dataNascLabel.setText("Data Nasc:");
        PainelFuncionario.add(dataNascLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 386, -1, -1));

        rgLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rgLabel.setText("RG:");
        PainelFuncionario.add(rgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 412, -1, -1));

        observacaoLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        observacaoLabel.setText("Observação:");
        PainelFuncionario.add(observacaoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 452, -1, -1));

        codFunField.setEditable(false);
        codFunField.setBackground(new java.awt.Color(204, 204, 255));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.codFun}"), codFunField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), codFunField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        PainelFuncionario.add(codFunField, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 384, 269, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nome}"), nomeField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), nomeField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        PainelFuncionario.add(nomeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 462, 269, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.sexo}"), sexoField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), sexoField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        PainelFuncionario.add(sexoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 410, 269, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cpf}"), cpfField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), cpfField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        PainelFuncionario.add(cpfField, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 436, 269, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dataNasc}"), dataNascField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), dataNascField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        PainelFuncionario.add(dataNascField, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 384, 238, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.rg}"), rgField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), rgField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        PainelFuncionario.add(rgField, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 410, 238, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.observacao}"), observacaoField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), observacaoField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        PainelFuncionario.add(observacaoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 436, 237, 48));

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar peq.png"))); // NOI18N
        saveButton.setText("Salvar");
        saveButton.setEnabled(false);
        saveButton.addActionListener(formListener);
        PainelFuncionario.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 534, -1, -1));

        newButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Add.png"))); // NOI18N
        newButton.setText("Novo cadastro");
        newButton.addActionListener(formListener);
        PainelFuncionario.add(newButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 534, -1, -1));

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Remove.png"))); // NOI18N
        deleteButton.setText("Deletar");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteButton.addActionListener(formListener);
        PainelFuncionario.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 534, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Consulta de Funcionarios");
        PainelFuncionario.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 11, -1, 45));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Funcionarios Grande.png"))); // NOI18N
        PainelFuncionario.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 40));

        cmbPesquisar.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Nome"}));
        cmbPesquisar.addActionListener(formListener);
        PainelFuncionario.add(cmbPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 74, 128, -1));

        lblPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPesquisar.setText("Pesquisar por:");
        PainelFuncionario.add(lblPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, -1, -1));

        txtPesquisar.addKeyListener(formListener);
        PainelFuncionario.add(txtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 74, 244, -1));

        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/refresh-16.png"))); // NOI18N
        refreshButton.setText("Atualizar");
        refreshButton.addActionListener(formListener);
        PainelFuncionario.add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 534, -1, -1));

        btnEnd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gerar Rota.png"))); // NOI18N
        btnEnd.setText("Consultar Endereço");
        btnEnd.setEnabled(false);
        btnEnd.addActionListener(formListener);
        PainelFuncionario.add(btnEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 491, -1, -1));

        btnTel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/telefone peq.png"))); // NOI18N
        btnTel.setText("Consultar Telefone");
        btnTel.setEnabled(false);
        btnTel.addActionListener(formListener);
        PainelFuncionario.add(btnTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 491, -1, -1));

        ConsultaFun.add(PainelFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        ConsultaTelefone.setResizable(true);
        ConsultaTelefone.setTitle("Consulta de Telefone");
        ConsultaTelefone.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/dtcc/iconframe.png"))); // NOI18N
        ConsultaTelefone.setVisible(false);

        PainelTelefone.setBackground(new java.awt.Color(255, 255, 255));
        PainelTelefone.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo3.setText("Consulta de Telefone");
        PainelTelefone.add(lblTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 32));

        lblIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/telefone.png"))); // NOI18N
        PainelTelefone.add(lblIcon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        PainelTelefone.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 49, 621, -1));

        btnFechar2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFechar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair_1.png"))); // NOI18N
        btnFechar2.setText("Fechar");
        btnFechar2.addActionListener(formListener);
        PainelTelefone.add(btnFechar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, 30));

        lblTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTelefone.setText("Telefone Residencial:");
        PainelTelefone.add(lblTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        txtTelefone.setEnabled(false);
        PainelTelefone.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 159, -1));

        lblCom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCom.setText("Telefone Comercial:");
        PainelTelefone.add(lblCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, 20));

        txtComercial.setEnabled(false);
        PainelTelefone.add(txtComercial, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 160, -1));

        lblCel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCel.setText("Telefone Celular:");
        PainelTelefone.add(lblCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        txtCelular.setEnabled(false);
        PainelTelefone.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 160, -1));

        lblFAX.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFAX.setText("Número de FAX:");
        PainelTelefone.add(lblFAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        txtFAX.setEnabled(false);
        PainelTelefone.add(txtFAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 159, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmail.setText("Endereço de E-mail:");
        PainelTelefone.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        txtEmail.setEnabled(false);
        PainelTelefone.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 440, -1));

        txtCod1.setEditable(false);
        txtCod1.setBackground(new java.awt.Color(204, 204, 255));
        txtCod1.setEnabled(false);
        txtCod1.addKeyListener(formListener);
        PainelTelefone.add(txtCod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 160, -1));

        lblTipo_End2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTipo_End2.setText("Código do Cliente:");
        PainelTelefone.add(lblTipo_End2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, -1));

        btnLimpar3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Remove.png"))); // NOI18N
        btnLimpar3.setText("Limpar");
        btnLimpar3.addActionListener(formListener);
        PainelTelefone.add(btnLimpar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 100, 30));

        txtEditar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEditar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/refresh-16.png"))); // NOI18N
        txtEditar1.setText("Editar");
        txtEditar1.addActionListener(formListener);
        PainelTelefone.add(txtEditar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 100, 30));

        javax.swing.GroupLayout ConsultaTelefoneLayout = new javax.swing.GroupLayout(ConsultaTelefone.getContentPane());
        ConsultaTelefone.getContentPane().setLayout(ConsultaTelefoneLayout);
        ConsultaTelefoneLayout.setHorizontalGroup(
            ConsultaTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );
        ConsultaTelefoneLayout.setVerticalGroup(
            ConsultaTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaTelefoneLayout.createSequentialGroup()
                .addComponent(PainelTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        ConsultaFun.add(ConsultaTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ConsultaEndereco.setTitle("Consulta de Endereço");
        ConsultaEndereco.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/dtcc/iconframe.png"))); // NOI18N
        ConsultaEndereco.setVisible(false);

        PainelEndereco.setBackground(new java.awt.Color(255, 255, 255));
        PainelEndereco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBairro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBairro.setText("Bairro:");
        PainelEndereco.add(lblBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        lblCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCidade.setText("Cidade:");
        PainelEndereco.add(lblCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        lblTitulo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo2.setText("Consulta de Endereço");
        PainelEndereco.add(lblTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 11, -1, 32));

        txtCidade.setEnabled(false);
        PainelEndereco.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 150, -1));

        lblUF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUF.setText("UF:");
        PainelEndereco.add(lblUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, 20));

        txtComplemento.setEnabled(false);
        PainelEndereco.add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 420, -1));

        lblIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Endereço.png"))); // NOI18N
        PainelEndereco.add(lblIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 36, -1));

        txtNRO.setEnabled(false);
        PainelEndereco.add(txtNRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 60, -1));

        txtBairro.setEnabled(false);
        PainelEndereco.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 200, -1));

        lblTipo_End.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTipo_End.setText("Tipo de Endereço:");
        PainelEndereco.add(lblTipo_End, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 120, -1));

        lblNRO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNRO.setText("NRO:");
        PainelEndereco.add(lblNRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        lblEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEndereco.setText("Endereço:");
        PainelEndereco.add(lblEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 66, -1));

        lblComplemento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblComplemento.setText("Complemento:");
        PainelEndereco.add(lblComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        lblCEP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCEP.setText("CEP:");
        PainelEndereco.add(lblCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, 20));

        txtEndereco.setEnabled(false);
        PainelEndereco.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 420, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        PainelEndereco.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 49, 621, -1));

        txtCEP.setEnabled(false);
        txtCEP.addActionListener(formListener);
        PainelEndereco.add(txtCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 150, -1));

        txtUF.setEnabled(false);
        PainelEndereco.add(txtUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 60, -1));

        txtCod.setEditable(false);
        txtCod.setBackground(new java.awt.Color(204, 204, 255));
        txtCod.setEnabled(false);
        txtCod.addKeyListener(formListener);
        PainelEndereco.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 170, -1));

        lblTipo_End1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTipo_End1.setText("Código do Cliente:");
        PainelEndereco.add(lblTipo_End1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, -1));

        txtTipo.setEnabled(false);
        PainelEndereco.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 170, -1));

        btnLimpar2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Remove.png"))); // NOI18N
        btnLimpar2.setText("Limpar");
        btnLimpar2.addActionListener(formListener);
        PainelEndereco.add(btnLimpar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 100, 30));

        txtEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/refresh-16.png"))); // NOI18N
        txtEditar.setText("Editar");
        txtEditar.addActionListener(formListener);
        PainelEndereco.add(txtEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 100, 30));

        btnFechar3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFechar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair_1.png"))); // NOI18N
        btnFechar3.setText("Fechar");
        btnFechar3.addActionListener(formListener);
        PainelEndereco.add(btnFechar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, 30));

        javax.swing.GroupLayout ConsultaEnderecoLayout = new javax.swing.GroupLayout(ConsultaEndereco.getContentPane());
        ConsultaEndereco.getContentPane().setLayout(ConsultaEnderecoLayout);
        ConsultaEnderecoLayout.setHorizontalGroup(
            ConsultaEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaEnderecoLayout.createSequentialGroup()
                .addComponent(PainelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        ConsultaEnderecoLayout.setVerticalGroup(
            ConsultaEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
        );

        ConsultaFun.add(ConsultaEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(ConsultaFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ConsultaFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.KeyListener, java.awt.event.MouseListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == btnTirar2) {
                Consulta_Funcionario.this.btnTirar2ActionPerformed(evt);
            }
            else if (evt.getSource() == btnSelecionar) {
                Consulta_Funcionario.this.btnSelecionarActionPerformed(evt);
            }
            else if (evt.getSource() == btnInternet) {
                Consulta_Funcionario.this.btnInternetActionPerformed(evt);
            }
            else if (evt.getSource() == btnRemover) {
                Consulta_Funcionario.this.btnRemoverActionPerformed(evt);
            }
            else if (evt.getSource() == saveButton) {
                Consulta_Funcionario.this.saveButtonActionPerformed(evt);
            }
            else if (evt.getSource() == newButton) {
                Consulta_Funcionario.this.newButtonActionPerformed(evt);
            }
            else if (evt.getSource() == deleteButton) {
                Consulta_Funcionario.this.deleteButtonActionPerformed(evt);
            }
            else if (evt.getSource() == cmbPesquisar) {
                Consulta_Funcionario.this.cmbPesquisarActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton) {
                Consulta_Funcionario.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == btnEnd) {
                Consulta_Funcionario.this.btnEndActionPerformed(evt);
            }
            else if (evt.getSource() == btnTel) {
                Consulta_Funcionario.this.btnTelActionPerformed(evt);
            }
            else if (evt.getSource() == btnFechar2) {
                Consulta_Funcionario.this.btnFechar2ActionPerformed(evt);
            }
            else if (evt.getSource() == btnLimpar3) {
                Consulta_Funcionario.this.btnLimpar3ActionPerformed(evt);
            }
            else if (evt.getSource() == txtEditar1) {
                Consulta_Funcionario.this.txtEditar1ActionPerformed(evt);
            }
            else if (evt.getSource() == txtCEP) {
                Consulta_Funcionario.this.txtCEPActionPerformed(evt);
            }
            else if (evt.getSource() == btnLimpar2) {
                Consulta_Funcionario.this.btnLimpar2ActionPerformed(evt);
            }
            else if (evt.getSource() == txtEditar) {
                Consulta_Funcionario.this.txtEditarActionPerformed(evt);
            }
            else if (evt.getSource() == btnFechar3) {
                Consulta_Funcionario.this.btnFechar3ActionPerformed(evt);
            }
        }

        public void keyPressed(java.awt.event.KeyEvent evt) {
        }

        public void keyReleased(java.awt.event.KeyEvent evt) {
            if (evt.getSource() == txtPesquisar) {
                Consulta_Funcionario.this.txtPesquisarKeyReleased(evt);
            }
            else if (evt.getSource() == txtCod1) {
                Consulta_Funcionario.this.txtCod1KeyReleased(evt);
            }
            else if (evt.getSource() == txtCod) {
                Consulta_Funcionario.this.txtCodKeyReleased(evt);
            }
        }

        public void keyTyped(java.awt.event.KeyEvent evt) {
            if (evt.getSource() == txtPesquisar) {
                Consulta_Funcionario.this.txtPesquisarKeyTyped(evt);
            }
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == masterTable) {
                Consulta_Funcionario.this.masterTableMouseClicked(evt);
            }
        }

        public void mouseEntered(java.awt.event.MouseEvent evt) {
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
        }

        public void mousePressed(java.awt.event.MouseEvent evt) {
        }

        public void mouseReleased(java.awt.event.MouseEvent evt) {
        }
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String message = " Deseja realmente deletar este funcionario? ";
        String title = "Mensagem de confirmação:";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            int[] selected = masterTable.getSelectedRows();
            List<dtcc.CadFuncionario_1> toRemove = new ArrayList<dtcc.CadFuncionario_1>(selected.length);
            for (int idx = 0; idx < selected.length; idx++) {
                dtcc.CadFuncionario_1 c = list.get(masterTable.convertRowIndexToModel(selected[idx]));
                toRemove.add(c);
                entityManager.remove(c);
                deletaItensEndereco();
                deletaItensTelefone();
                salvar();
            }
            list.removeAll(toRemove);

    }//GEN-LAST:event_deleteButtonActionPerformed
    }
    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        CadFuncionario LG = new CadFuncionario();
        LG.setVisible(true);
    }//GEN-LAST:event_newButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        salvar();
        lblImagem.setIcon(null);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cmbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPesquisarActionPerformed

    //metodos usados no pesquisar!!!!!!!!!!!!!!
    public void mostraItens() {
        int seleciona = masterTable.getSelectedRow();
        codFunField.setText(masterTable.getModel().getValueAt(seleciona, 0).toString());
        nomeField.setText(masterTable.getModel().getValueAt(seleciona, 1).toString());
        sexoField.setText(masterTable.getModel().getValueAt(seleciona, 2).toString());
        cpfField.setText(masterTable.getModel().getValueAt(seleciona, 3).toString());
        dataNascField.setText(masterTable.getModel().getValueAt(seleciona, 4).toString());
        rgField.setText(masterTable.getModel().getValueAt(seleciona, 5).toString());
        observacaoField.setText(masterTable.getModel().getValueAt(seleciona, 6).toString());

        txtCod.setText(masterTable.getModel().getValueAt(seleciona, 0).toString());
        txtCod1.setText(masterTable.getModel().getValueAt(seleciona, 0).toString());
    }

    public void listarCadastros() {
        String sql = "Select Cod_Fun, Nome , Sexo , CPF , Data_Nasc, RG, Observacao from cad_funcionario order by Cod_Fun Asc ";
        try (Connection con = conexao.getConnection()) {
            PreparedStatement pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            masterTable.setModel(DbUtils.resultSetToTableModel(rs));
            txtPesquisar.setText("");
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, error);

        }
    }

    public void editarCadastros() {
        String sql = "Update cad_funcionario set  Nome  = ?, Sexo  = ?, CPF  = ?, Data_Nasc = ?, RG = ?, Observacao=?, Foto=?  where Cod_Fun = ?";

        try (Connection con = conexao.getConnection()) {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, nomeField.getText());
            pst.setString(2, sexoField.getText());
            pst.setString(3, cpfField.getText());
            pst.setString(4, dataNascField.getText());
            pst.setString(5, rgField.getText());
            pst.setString(6, observacaoField.getText());
            pst.setString(7, caminhoDaImagem);
            pst.setString(8, codFunField.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso.");
            listarCadastros();

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, error);

        }

    }

    public void PesquisarCadastros() {
        if (cmbPesquisar.getSelectedIndex() == 0) {
            String sql = "Select Cod_Fun, Nome , Sexo , CPF , Data_Nasc, RG, Observacao from cad_funcionario where Nome like ?";

            try (Connection con = conexao.getConnection()) {
                PreparedStatement pst = con.prepareStatement(sql);

                pst = con.prepareStatement(sql);
                pst.setString(1, txtPesquisar.getText() + "%");
                rs = pst.executeQuery();
                masterTable.setModel(DbUtils.resultSetToTableModel(rs));
                btnEnd.setEnabled(false);
                btnTel.setEnabled(false);
            } catch (SQLException error) {

            }
        }

    }

    private void deletaItensTelefone() {
        try (Connection con = conexao.getConnection()) {
            String sql = "Delete from telefones where Cod_Fun = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst = con.prepareStatement(sql);
            pst.setString(1, txtCod1.getText());
            pst.executeUpdate();

        } catch (SQLException error) {

        }
    }

    private void deletaItensEndereco() {
        try (Connection con = conexao.getConnection()) {
            String sql = "Delete from endereco where Cod_Fun = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst = con.prepareStatement(sql);
            pst.setString(1, txtCod.getText());
            pst.executeUpdate();
        } catch (SQLException error) {

        }
    }

    private void mostraItemTelefone() {
        try (Connection con = conexao.getConnection()) {
            String sql = "Select * from telefones where Cod_Fun = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst = con.prepareStatement(sql);
            pst.setString(1, txtCod1.getText() + "%");
            rs = pst.executeQuery();
            rs.first();
            txtTelefone.setText(rs.getString("Telefone_Res"));
            txtCelular.setText(rs.getString("Celular"));
            txtComercial.setText(rs.getString("Telefone_Com"));
            txtFAX.setText(rs.getString("Fax"));
            txtEmail.setText(rs.getString("Email"));

        } catch (SQLException error) {

        }
    }

    private void mostraItemEndereco() {
        try (Connection con = conexao.getConnection()) {
            String sql = "Select * from endereco where Cod_Fun = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst = con.prepareStatement(sql);
            pst.setString(1, txtCod.getText() + "%");
            rs = pst.executeQuery();
            rs.first();
            txtTipo.setText(rs.getString("Tipo_End"));
            txtCEP.setText(rs.getString("CEP"));
            txtEndereco.setText(rs.getString("Endereco"));
            txtNRO.setText(rs.getString("Numero"));
            txtComplemento.setText(rs.getString("Complemento"));
            txtUF.setText(rs.getString("UF"));
            txtBairro.setText(rs.getString("Bairro"));
            txtCidade.setText(rs.getString("Cidade"));

        } catch (SQLException error) {

        }
    }
    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased

        PesquisarCadastros();
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void txtPesquisarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarKeyTyped

    private void masterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableMouseClicked
        mostraItens();
        mostraItemTelefone();
        mostraItemEndereco();
        btnEnd.setEnabled(true);
        btnTel.setEnabled(true);
        btnTirar2.setEnabled(true);
        btnSelecionar.setEnabled(true);
        btnInternet.setEnabled(true);
        btnRemover.setEnabled(true);
        saveButton.setEnabled(true);
        consultaImagem();
    }//GEN-LAST:event_masterTableMouseClicked

    private void consultaImagem() {
        String sql = "select Foto from cad_funcionario where Cod_Fun = ?";
        try (Connection con = conexao.getConnection()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, codFunField.getText());
            rs = pst.executeQuery();
            rs.first();

            String file = rs.getString("Foto");
            lblImagem.setIcon(new ImageIcon(file));
            ImageIcon icon = new ImageIcon(file);
            Image img = icon.getImage();
            Image newImg = img.getScaledInstance(121, 123, java.awt.Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(newImg);
            lblImagem.setIcon(newIcon);
            lblImagem.setSize(104, 14);
            caminhoDaImagem = file;
        } catch (SQLException error) {

        }
    }

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        atualizar();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void btnFechar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechar2ActionPerformed
        ConsultaFun.setVisible(true);
        ConsultaTelefone.setVisible(false);
        desablaCamposTel();
    }//GEN-LAST:event_btnFechar2ActionPerformed

    private void txtCod1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCod1KeyReleased
        pegaTelefoneFun();
    }//GEN-LAST:event_txtCod1KeyReleased

    private void btnLimpar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar3ActionPerformed
        apagarTelefone();
    }//GEN-LAST:event_btnLimpar3ActionPerformed

    private void txtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPActionPerformed

    private void txtCodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyReleased
        pegaEnderecoFun();
    }//GEN-LAST:event_txtCodKeyReleased

    private void btnLimpar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar2ActionPerformed
        apagarEndereco();
    }//GEN-LAST:event_btnLimpar2ActionPerformed

    private void btnEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndActionPerformed
        ConsultaFun.setVisible(true);
        ConsultaEndereco.setVisible(true);
    }//GEN-LAST:event_btnEndActionPerformed

    private void btnTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelActionPerformed
        ConsultaFun.setVisible(true);
        ConsultaTelefone.setVisible(true);
    }//GEN-LAST:event_btnTelActionPerformed

    private void txtEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditar1ActionPerformed
        enablaCamposTel();        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditar1ActionPerformed

    private void txtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditarActionPerformed
        enablaCamposEnd();
    }//GEN-LAST:event_txtEditarActionPerformed

    private void btnFechar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechar3ActionPerformed
        ConsultaFun.setVisible(true);
        ConsultaEndereco.setVisible(false);
        desablaCamposEnd();
    }//GEN-LAST:event_btnFechar3ActionPerformed

    private void btnTirar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTirar2ActionPerformed
        Form_webcam LG = new Form_webcam();
        LG.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTirar2ActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed

        BancoDeDados.ClienteBean c = new BancoDeDados.ClienteBean();
        c.setImagem(this.retornacaminho());
    }//GEN-LAST:event_btnSelecionarActionPerformed

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
            ImageIcon newIcon = new ImageIcon(newImg);        // TODO add your handling code here:
            lblImagem.setIcon(newIcon);
            lblImagem.setSize(104, 14);
            caminhoDaImagem = file;

            //   System.out.println("Caminho do arquivo : "+file);
        }
        return file;
    }

    private void btnInternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInternetActionPerformed
        Desktop desk = java.awt.Desktop.getDesktop();
        try {
            desk.browse(new java.net.URI("https://www.google.com.br/imghp?hl=pt-BR&tab=wi&ei=hFvtUqmWLIjskQePxoDADQ&ved=0CAQQqi4oAg//"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnInternetActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        lblImagem.setIcon(null);
        caminhoDaImagem = "";
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void enablaCamposEnd() {
        txtCEP.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtNRO.setEnabled(true);
        txtComplemento.setEnabled(true);
        txtBairro.setEnabled(true);
        txtCidade.setEnabled(true);
        txtTipo.setEnabled(true);
        txtUF.setEnabled(true);
    }

    private void enablaCamposTel() {
        txtTelefone.setEnabled(true);
        txtComercial.setEnabled(true);
        txtCelular.setEnabled(true);
        txtFAX.setEnabled(true);
        txtEmail.setEnabled(true);
    }

    private void desablaCamposEnd() {
        txtCEP.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtNRO.setEnabled(false);
        txtComplemento.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCidade.setEnabled(false);
        txtTipo.setEnabled(false);
        txtUF.setEnabled(false);

    }

    private void desablaCamposTel() {
        txtTelefone.setEnabled(false);
        txtComercial.setEnabled(false);
        txtCelular.setEnabled(false);
        txtFAX.setEnabled(false);
        txtEmail.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame ConsultaEndereco;
    private javax.swing.JDesktopPane ConsultaFun;
    private javax.swing.JInternalFrame ConsultaTelefone;
    private javax.swing.JPanel PainelEndereco;
    private javax.swing.JPanel PainelFuncionario;
    private javax.swing.JPanel PainelTelefone;
    private javax.swing.JButton btnEnd;
    private javax.swing.JButton btnFechar2;
    private javax.swing.JButton btnFechar3;
    private javax.swing.JButton btnInternet;
    private javax.swing.JButton btnLimpar2;
    private javax.swing.JButton btnLimpar3;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JButton btnTel;
    private javax.swing.JButton btnTirar2;
    private javax.swing.JComboBox cmbPesquisar;
    private javax.swing.JTextField codFunField;
    private javax.swing.JLabel codFunLabel;
    private javax.swing.JTextField cpfField;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JTextField dataNascField;
    private javax.swing.JLabel dataNascLabel;
    private javax.swing.JButton deleteButton;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCel;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCom;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblFAX;
    private javax.swing.JLabel lblIcon2;
    private javax.swing.JLabel lblIcon3;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblNRO;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTipo_End;
    private javax.swing.JLabel lblTipo_End1;
    private javax.swing.JLabel lblTipo_End2;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblUF;
    private java.util.List<dtcc.CadFuncionario_1> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.swing.JButton newButton;
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField observacaoField;
    private javax.swing.JLabel observacaoLabel;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField rgField;
    private javax.swing.JLabel rgLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField sexoField;
    private javax.swing.JLabel sexoLabel;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtCod1;
    private javax.swing.JTextField txtComercial;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JButton txtEditar;
    private javax.swing.JButton txtEditar1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFAX;
    private javax.swing.JTextField txtNRO;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtUF;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public void run() {
        JFrame frame = new JFrame("Consulta de Funcionarios");
        frame.setContentPane(new Consulta_Funcionario());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false); //desabilita maximizar
        frame.setLocationRelativeTo(null);  //centraliza Jframe
        frame.setVisible(true);        // TODO add your handling code here:

    }

    ;
    

    private void salvar() {
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
            editarCadastros();
            editarEndereco();
            editarTelefone();
            btnEnd.setEnabled(false);
            btnTel.setEnabled(false);
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<dtcc.CadFuncionario_1> merged = new ArrayList<dtcc.CadFuncionario_1>(list.size());
            for (dtcc.CadFuncionario_1 c : list) {
                merged.add(entityManager.merge(c));
                atualizar();
            }
        }
    }

    private void atualizar() {
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
            btnEnd.setEnabled(false);
            btnTel.setEnabled(false);
            btnTirar2.setEnabled(false);
            btnSelecionar.setEnabled(false);
            btnInternet.setEnabled(false);
            btnRemover.setEnabled(false);
            saveButton.setEnabled(false);
            lblImagem.setIcon(null);

        }
        list.clear();
        list.addAll(data);
        listarCadastros();
    }

    private void pegaEnderecoFun() {
        String sql = "select Tipo_End, Endereco, UF, Complemento, Bairro, CEP, "
                + "Numero, Cidade from endereco where Cod_Fun = ?";
        try (Connection con = conexao.getConnection()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, txtCod.getText());
            rs = pst.executeQuery();
            rs.first();
            txtTipo.setText(rs.getString("Tipo_End"));
            txtEndereco.setText(rs.getString("Endereco"));
            txtUF.setText(rs.getString("UF"));
            txtComplemento.setText(rs.getString("Complemento"));
            txtBairro.setText(rs.getString("Bairro"));
            txtCEP.setText(rs.getString("CEP"));
            txtNRO.setText(rs.getString("Numero"));
            txtCidade.setText(rs.getString("Cidade"));
        } catch (SQLException error) {
            apagarEndereco();
        }
    }

    private void apagarEndereco() {
        txtCEP.setText("");
        txtEndereco.setText("");
        txtNRO.setText("");
        txtComplemento.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtTipo.setText("");
        txtUF.setText("");
    }

    private void pegaTelefoneFun() {
        String sql2 = "select Telefone_Res, Telefone_Com, Celular, Fax, Email from telefones where Cod_Fun = ?";
        try (Connection con = conexao.getConnection()) {
            PreparedStatement pst = con.prepareStatement(sql2);
            pst.setString(1, txtCod1.getText());
            rs2 = pst.executeQuery();
            rs2.first();
            txtTelefone.setText(rs2.getString("Telefone_Res"));
            txtComercial.setText(rs2.getString("Telefone_Com"));
            txtCelular.setText(rs2.getString("Celular"));
            txtFAX.setText(rs2.getString("Fax"));
            txtEmail.setText(rs2.getString("Email"));
        } catch (SQLException error) {
            apagarTelefone();
        }
    }

    private void apagarTelefone() {
        txtTelefone.setText("");
        txtComercial.setText("");
        txtCelular.setText("");
        txtFAX.setText("");
        txtEmail.setText("");
    }

    private void editarEndereco() {
        String sql = "Update endereco set Tipo_End = ?, Endereco = ?, UF = ?, Complemento = ?, Bairro =?, CEP = ?, Numero = ?, Cidade = ? where Cod_Fun = ?";

        try (Connection con = conexao.getConnection()) {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, txtTipo.getText());
            pst.setString(2, txtEndereco.getText());
            pst.setString(3, txtUF.getText());
            pst.setString(4, txtComplemento.getText());
            pst.setString(5, txtBairro.getText());
            pst.setString(6, txtCEP.getText());
            pst.setString(7, txtNRO.getText());
            pst.setString(8, txtCidade.getText());
            pst.setString(9, txtCod.getText());
            pst.executeUpdate();
            listarCadastros();

        } catch (SQLException error) {

        }
    }

    private void editarTelefone() {
        String sql = "Update telefones set Telefone_Res = ?, Telefone_Com = ?, Celular = ?, Fax = ?, Email = ? where Cod_Fun = ?";

        try (Connection con = conexao.getConnection()) {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, txtTelefone.getText());
            pst.setString(2, txtComercial.getText());
            pst.setString(3, txtCelular.getText());
            pst.setString(4, txtFAX.getText());
            pst.setString(5, txtEmail.getText());
            pst.setString(6, txtCod1.getText());
            pst.executeUpdate();
            listarCadastros();

        } catch (SQLException error) {

        }
    }

    private void alteraImagem() {
        String sql = "Update cad_cliente set Foto= ? where Cod_Cli = ?";

        try (Connection con = conexao.getConnection()) {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, caminhoDaImagem);
            pst.setString(2, codFunField.getText());
            pst.executeUpdate();
            listarCadastros();

        } catch (SQLException error) {

        }

    }

}
