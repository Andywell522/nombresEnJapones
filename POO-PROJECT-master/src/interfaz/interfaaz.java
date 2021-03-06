
package interfaz;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import Dataa.Nombres;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class interfaaz extends javax.swing.JFrame {

    String pivote;
    String text;   
    businesss op = new businesss(); 
    
    public Clip clip;
    public String ruta="/Sonidos/";   
    
    
    public interfaaz() {
        initComponents();
        setLocationRelativeTo(null);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize()); 
    }
    
    
    public class Imagen extends javax.swing.JPanel {
    public Imagen() {
    this.setSize(KanaNombre.getSize());
    this.setSize(KanaApellido.getSize());//se selecciona el tamaño del panel
    }
    //Se crea un método cuyo parámetro debe ser un objeto Graphics
    @Override
    public void paint(Graphics grafico) {
    Dimension height = getSize(); 
    //Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
    ImageIcon Img = new ImageIcon(getClass().getResource(pivote)); 
    //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
    grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
    setOpaque(false);
    super.paintComponent(grafico);
    }
}
    
    public void Sonidos (String archivo)
    {
        try {
            clip= AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta+archivo+".mp3")));
            clip.start();
            
        }catch (IOException | LineUnavailableException | UnsupportedAudioFileException e){
        }
    }
    
    
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource ("Imagenes/iconoo.jpg" ));
        return retValue;
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Traducir = new javax.swing.JButton();
        KANA = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        KanaNombre = new javax.swing.JLabel();
        KanaEspacio = new javax.swing.JLabel();
        KanaApellido = new javax.swing.JLabel();
        Titulo = new javax.swing.JTextField();
        OP = new javax.swing.JLabel();
        Miku = new javax.swing.JLabel();
        Nge = new javax.swing.JLabel();
        jLabelDBZ = new javax.swing.JLabel();
        jLabelAGK = new javax.swing.JLabel();
        jLabelKNN = new javax.swing.JLabel();
        jLabelDN = new javax.swing.JLabel();
        jLabelIngresaNombre = new javax.swing.JLabel();
        NombreUsuario = new javax.swing.JTextField();
        Sound = new javax.swing.JButton();
        SuLiteralEs = new javax.swing.JLabel();
        Literal = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Traducir.setBackground(new java.awt.Color(102, 153, 255));
        Traducir.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        Traducir.setForeground(new java.awt.Color(0, 102, 0));
        Traducir.setText("TRADUCIR NOMBRE");
        Traducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TraducirActionPerformed(evt);
            }
        });
        getContentPane().add(Traducir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 400, 60));

        KANA.setBackground(new java.awt.Color(153, 204, 255));
        KANA.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        KANA.setForeground(new java.awt.Color(0, 153, 51));
        KANA.setText("TRADUCIR APELLIDO");
        KANA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KANAActionPerformed(evt);
            }
        });
        getContentPane().add(KANA, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 610, 440, 60));

        Salir.setBackground(new java.awt.Color(153, 102, 255));
        Salir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 190, 50));

        Limpiar.setBackground(new java.awt.Color(102, 102, 255));
        Limpiar.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        Limpiar.setText("LIMPIAR");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, 190, 70));
        getContentPane().add(KanaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 700, 400, 100));

        KanaEspacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/espacio.JPG"))); // NOI18N
        getContentPane().add(KanaEspacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 700, 100, 100));
        getContentPane().add(KanaApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 700, 400, 100));

        Titulo.setBackground(new java.awt.Color(51, 102, 255));
        Titulo.setFont(new java.awt.Font("Bell MT", 1, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Traduce tu nombre a Japonés con JAPONIZEITOR D.A.D");
        Titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituloActionPerformed(evt);
            }
        });
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 1270, 70));

        OP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/OP.png"))); // NOI18N
        getContentPane().add(OP, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, -1));

        Miku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/miku.jpeg"))); // NOI18N
        getContentPane().add(Miku, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 230, -1));

        Nge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NGE.jpg"))); // NOI18N
        Nge.setText("jLabel1");
        getContentPane().add(Nge, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 670, 230, -1));

        jLabelDBZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DBZ.jpg"))); // NOI18N
        getContentPane().add(jLabelDBZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 690, -1, -1));

        jLabelAGK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AGK.jpg"))); // NOI18N
        getContentPane().add(jLabelAGK, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        jLabelKNN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/KNN.png"))); // NOI18N
        getContentPane().add(jLabelKNN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 410, -1, -1));

        jLabelDN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DN.jpg"))); // NOI18N
        getContentPane().add(jLabelDN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 170, -1, -1));

        jLabelIngresaNombre.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabelIngresaNombre.setForeground(new java.awt.Color(255, 255, 51));
        jLabelIngresaNombre.setText("Ingresa Tu Nombre:");
        getContentPane().add(jLabelIngresaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 420, 70));

        NombreUsuario.setBackground(new java.awt.Color(153, 255, 255));
        NombreUsuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 500, 60));

        Sound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sonido.jpg"))); // NOI18N
        Sound.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SoundMouseClicked(evt);
            }
        });
        Sound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoundActionPerformed(evt);
            }
        });
        getContentPane().add(Sound, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 590, 100, 90));

        SuLiteralEs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SuLiteralEs.setForeground(new java.awt.Color(255, 255, 255));
        SuLiteralEs.setText("Traducción en Fonética española:");
        getContentPane().add(SuLiteralEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 430, 60));

        Literal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Literal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LiteralActionPerformed(evt);
            }
        });
        getContentPane().add(Literal, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, 500, 60));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue.jpg"))); // NOI18N
        Fondo.setMaximumSize(new java.awt.Dimension(1650, 900));
        Fondo.setMinimumSize(new java.awt.Dimension(1640, 900));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1600, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void TituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TituloActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
      
        NombreUsuario.setText("");
        NombreUsuario.setEnabled(true);
        Literal.setText("");
        KanaNombre.show(false);
        KanaApellido.show(false);



// TODO add your handling code here:
    }//GEN-LAST:event_LimpiarActionPerformed

    private void NombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreUsuarioActionPerformed

    
    
    private void SoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoundActionPerformed
       
      
        
        
    }//GEN-LAST:event_SoundActionPerformed

    private void LiteralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LiteralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LiteralActionPerformed

    private void TraducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TraducirActionPerformed
                
        String resulname;
        
        resulname = NombreUsuario.getText ();
        
        
        
        switch (resulname) {
        
            
            case "Alexei Ochoa":            
                Literal.setText("Arekusuei Ochoa" );
                pivote="/Imagenes/alexei.jpg" ;
            break;                   
              
            
            case "Cristian Aguilera":            
                Literal.setText("Kurisutian Agirera" );
                pivote="/Imagenes/cristian.jpg" ;
            break;       
        
            
            case "Nicolás Álvarez":            
                Literal.setText("Nikorasu Arubaresu" );
                pivote="/Imagenes/nicolas.jpg" ;
            break;
            
            case "Alicia Arenaza":            
                Literal.setText("Arishia Arenasa" );
                pivote="/Imagenes/alicia.jpg" ;
            break;
            
            case "David Bernal":            
                Literal.setText("Dabiddo Berunaru" );
                pivote="/Imagenes/david.jpg" ;
            break;
            
            case "Diego Cortés":            
                Literal.setText("Diego Korutesu" );
                pivote="/Imagenes/diego.jpg" ;
            break;
            
            case "Diego Delgado":            
                Literal.setText("Diego Derugado" );
                pivote="/Imagenes/diego.jpg" ;
            break;
            
            case "Claudia Espejo":            
                Literal.setText("Kuraudia Esupeho" );
                pivote="/Imagenes/claudia.jpg" ;
            break;
            
            case "David Fonseca":            
                Literal.setText("Dabiddo Fonseka" );
                pivote="/Imagenes/david.jpg" ;
            break;
            
            case "Maicol Fontecha":            
                Literal.setText( "Maikoru Fontecha" );
                pivote="/Imagenes/maicol.jpg" ;
            break;
            
            case "Johan Gamba":            
                Literal.setText("Hoan Gamuba" );
                pivote="/Imagenes/johan.jpg" ;
            break;
            
            case "Joan Gómez":            
                Literal.setText( "Hoan Gomesu" );
                pivote="/Imagenes/joan.jpg" ;
            break;
            
            case "David Gutiérrez":            
                Literal.setText("Dabiddo Gutieresu" );
                pivote="/Imagenes/david.jpg" ;
            break;
            
            case "Jorge Hernández":            
                Literal.setText("Horuhe Erunandesu" );
                pivote="/Imagenes/jorge.jpg" ;
            break;
            
            case "Sebastián Linares":            
                Literal.setText( "Sebasutian Rinaresu" );
                pivote="/Imagenes/sebastian.jpg" ;
            break;
            
            case "Andrés Lizarazo":            
                Literal.setText( "Andoresu Risaraso" );
                pivote="/Imagenes/andres.jpg" ;
            break;
            
            case "Nicolás Manosalva":            
                Literal.setText("Nikorasu Manosaruba" );
                pivote="/Imagenes/nicolas.jpg" ;
            break;
            
            case "Santiago Martín":            
                Literal.setText("Santiago Marutin" );
                pivote="/Imagenes/santiago.jpg" ;
            break;
            
            case "Carlos Martínez":            
                Literal.setText("Karurosu Marutinesu" );
                pivote="/Imagenes/carlos.jpg" ;
            break;
       
             case "Manuel Medina":            
                Literal.setText("Manueru Medina" );
                pivote="/Imagenes/manuel.jpg" ;
            break;
            
             case "Daniel Mesa":            
                Literal.setText("Danieru Mesa" );
                pivote="/Imagenes/daniel.jpg" ;
            break;
            
             case "Mauricio Meza":            
                Literal.setText("Maurishio Mesa" );
                pivote="/Imagenes/mauricio.jpg" ;
            break;
            
             case "Sebastián Moreno":            
                Literal.setText( "Sebasutian Moreno" );
                pivote="/Imagenes/sebastian.jpg" ;
            break;            
            
            case "Sergio Quintero":            
                Literal.setText( "Seruhio Kintero" );
                pivote="/Imagenes/sergio.jpg" ;
            break;
            
            case "Daniela Quiroga":            
                Literal.setText( "Daniera Kiroga" );
                pivote="/Imagenes/daniela.jpg" ;
            break;
            
            case "Mariana Rodríguez":            
                Literal.setText( "Mariana Rodorigesu" );
                pivote="/Imagenes/mariana.jpg" ;
            break;
            
            case "Sebastián Sánchez":            
                Literal.setText( "Sebasutian Sanchesu" );
                pivote="/Imagenes/sebastian.jpg" ;
            break;
            
            case "María Sánchez":            
                Literal.setText( "Maria Sanchesu" );
                pivote="/Imagenes/maria.jpg" ;
            break;
            
            case "Oscar Segura":            
                Literal.setText( "Osukaru Segura" );
                pivote="/Imagenes/oscar.jpg" ;
            break;
            
            case "Andrés Sierra":            
                Literal.setText("Andoresu Shiera" );
                pivote="/Imagenes/andres.jpg" ;
            break;
            
            case "Sebastián Tovar":            
                Literal.setText("Sebasutian Tobaru" );
                pivote="/Imagenes/sebastian.jpg" ;
            break;
            
            case "Julie Triviño":            
                Literal.setText( "Furie Toribinyo" );
                pivote="/Imagenes/julie.jpg" ;
            break;
            
            case "Brayan Upegui":            
                Literal.setText("Burajan Upegi" );
                pivote="/Imagenes/brayan.jpg" ;
            break;
            
            
            case "Juan Valenzuela":            
                Literal.setText( "Fuan Barensuera" );
                pivote="/Imagenes/juan.jpg" ;
            break;
            
            
            default:
                Literal.setText("Ingrese su nombre correctamente escrito");
            break; 
        }
        
                Imagen Imagen = new Imagen();
                KanaNombre.add(Imagen);
                KanaNombre.repaint();
                KanaNombre.show(true); 
        
              
        
          
    }//GEN-LAST:event_TraducirActionPerformed

    private void SoundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SoundMouseClicked


        String resulname2;
        
        resulname2 = Literal.getText ();
    
        
        switch (resulname2) {
       
            case "Arekusuei Ochoa":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                } 
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    


            break;
       
              
            case "Kurisutian Agirera":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    
            break;
       
        
            case "Nikorasu Arubaresu":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    
            break;
            
            
            case "Arishia Arenasa":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    
            break;
            
            
            case "Dabiddo Berunaru":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    
            break;
            
            
            case "Diego Korutesu":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
            break;

            
            case "Diego Derugado":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    
            break;
            
            
            
            case "Kuraudia Esupeho":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    
            break;
            
            
            
            case "Dabiddo Fonseka":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    
            break;
            
            
            
            case "Maikoru Fontecha":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    
            break;
            
            
            
            case "Hoan Gamuba":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
            break;
            
            
            
            case "Hoan Gomesu":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
            break;
            
            
            
            case "Dabiddo Gutieresu":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    
            break;
            
            
            case "Horuhe Erunandesu":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
            break;
            
            
            case "Sebasutian Rinaresu":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
            break;
            
            
            
            case "Andoresu Risaraso":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\andres_lizarazo.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Nikorasu Manosaruba":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Santiago Marutin":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Karurosu Marutinesu":            
              try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
       
             case "Manueru Medina":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
             case "Danieru Mesa":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
             case "Maurishio Mesa":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
             case "Sebasutian Moreno":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            
            case "Seruhio Kintero":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Daniera Kiroga":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Mariana Rodorigesu":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Sebasutian Sanchesu":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Maria Sanchesu":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Osukaru Segura":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Andoresu Shiera":            
              try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Sebasutian Tobaru":            
              try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Furie Toribinyo":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Burajan Upegi":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            
            case "Fuan Barensuera":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            
            default:
                Literal.setText("Ingrese su nombre correctamente escrito");
            break;
             
        
           
        }
     
    }//GEN-LAST:event_SoundMouseClicked

    private void KANAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KANAActionPerformed

        
       String resulape ;
       resulape =  NombreUsuario.getText ();
              
           switch (resulape) {
        
            
           case "Alexei Ochoa":            
                Literal.setText("Arekusuei Ochoa" );
                pivote="/Imagenes/ochoa.jpg" ;
                
                
            break;                   
              
            case "Cristian Aguilera":            
                Literal.setText("Kurisutian Agirera" );
                pivote="/Imagenes/aguilera.jpg" ;
            break;       
        
            case "Nicolás Álvarez":            
                Literal.setText("Nikorasu Arubaresu" );
                pivote="/Imagenes/alvarez.jpg" ;
            break;
            
            case "Alicia Arenaza":            
                Literal.setText("Arishia Arenasa" );
                pivote="/Imagenes/arenaza.jpg" ;
            break;
            
            case "David Bernal":            
                Literal.setText("Dabiddo Berunaru" );
                pivote="/Imagenes/bernal.jpg" ;
            break;
            
            case "Diego Cortés":            
                Literal.setText("Diego Korutesu" );
                pivote="/Imagenes/cortes.jpg" ;
            break;
            
            case "Diego Delgado":            
                Literal.setText("Diego Derugado" );
                pivote="/Imagenes/delgado.jpg" ;
            break;
            
            case "Claudia Espejo":            
                Literal.setText("Kuraudia Esupeho" );
                pivote="/Imagenes/espejo.jpg" ;
            break;
            
            case "David Fonseca":            
                Literal.setText("Dabiddo Fonseka" );
                pivote="/Imagenes/fonseca.jpg" ;
            break;
            
            case "Maicol Fontecha":            
                Literal.setText( "Maikoru Fontecha" );
                pivote="/Imagenes/fontecha.jpg" ;
            break;
            
            case "Johan Gamba":            
                Literal.setText("Hoan Gamuba" );
                pivote="/Imagenes/gamba.jpg" ;
            break;
            
            case "Joan Gómez":            
                Literal.setText( "Hoan Gomesu" );
                pivote="/Imagenes/gomez.jpg" ;
            break;
            
            case "David Gutiérrez":            
                Literal.setText("Dabiddo Gutieresu" );
                pivote="/Imagenes/gutierrez.jpg" ;
            break;
            
            case "Jorge Hernández":            
                Literal.setText("Horuhe Erunandesu" );
                pivote="/Imagenes/hernandez.jpg" ;
            break;
            
            case "Sebastián Linares":            
                Literal.setText( "Sebasutian Rinaresu" );
                pivote="/Imagenes/linares.jpg" ;
            break;
            
            case "Andrés Lizarazo":            
                Literal.setText( "Andoresu Risaraso" );
                pivote="/Imagenes/lizarazo.jpg" ;
            break;
            
            case "Nicolás Manosalva":            
                Literal.setText("Nikorasu Manosaruba" );
                pivote="/Imagenes/manosalva.jpg" ;
            break;
            
            case "Santiago Martín":            
                Literal.setText("Santiago Marutin" );
                pivote="/Imagenes/martin.jpg" ;
            break;
            
            case "Carlos Martínez":            
                Literal.setText("Karurosu Marutinesu" );
                pivote="/Imagenes/martinez.jpg" ;
            break;
       
             case "Manuel Medina":            
                Literal.setText("Manueru Medina" );
                pivote="/Imagenes/medina.jpg" ;
            break;
            
             case "Daniel Mesa":            
                Literal.setText("Danieru Mesa" );
                pivote="/Imagenes/mesa.jpg" ;
            break;
            
             case "Mauricio Meza":            
                Literal.setText("Maurishio Mesa" );
                pivote="/Imagenes/mesa.jpg" ;
            break;
            
             case "Sebastián Moreno":            
                Literal.setText( "Sebasutian Moreno" );
                pivote="/Imagenes/moreno.jpg" ;
            break;            
            
            case "Sergio Quintero":            
                Literal.setText( "Seruhio Kintero" );
                pivote="/Imagenes/quintero.jpg" ;
            break;
            
            case "Daniela Quiroga":            
                Literal.setText( "Daniera Kiroga" );
                pivote="/Imagenes/quiroga.jpg" ;
            break;
            
            case "Mariana Rodríguez":            
                Literal.setText( "Mariana Rodorigesu" );
                pivote="/Imagenes/rodriguez.jpg" ;
            break;
            
            case "Sebastián Sánchez":            
                Literal.setText( "Sebasutian Sanchesu" );
                pivote="/Imagenes/sanchez.jpg" ;
            break;
            
            case "María Sánchez":            
                Literal.setText( "Maria Sanchesu" );
                pivote="/Imagenes/sanchez.jpg" ;
            break;
            
            case "Oscar Segura":            
                Literal.setText( "Osukaru Segura" );
                pivote="/Imagenes/segura.jpg" ;
            break;
            
            case "Andrés Sierra":            
                Literal.setText("Andoresu Shiera" );
                pivote="/Imagenes/sierra.jpg" ;
            break;
            
            case "Sebastián Tovar":            
                Literal.setText("Sebasutian Tobaru" );
                pivote="/Imagenes/tovar.jpg" ;
            break;
            
            case "Julie Triviño":            
                Literal.setText( "Furie Toribinyo" );
                pivote="/Imagenes/triviño.jpg" ;
            break;
            
            case "Brayan Upegui":            
                Literal.setText("Burajan Upegi" );
                pivote="/Imagenes/upegui.jpg" ;
            break;
            
            
            case "Juan Valenzuela":            
                Literal.setText( "Fuan Barensuera" );
                pivote="/Imagenes/valenzuela.jpg" ;
            break;
            
            
            default:
                Literal.setText("Ingrese su nombre correctamente escrito");
            break; 
        }
              
                Imagen Imagen = new Imagen();
                KanaApellido.add(Imagen);
                KanaApellido.repaint();
                KanaApellido.show(true); 



        
        
        
    }//GEN-LAST:event_KANAActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton KANA;
    private javax.swing.JLabel KanaApellido;
    private javax.swing.JLabel KanaEspacio;
    private javax.swing.JLabel KanaNombre;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField Literal;
    private javax.swing.JLabel Miku;
    private javax.swing.JLabel Nge;
    private javax.swing.JTextField NombreUsuario;
    private javax.swing.JLabel OP;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Sound;
    private javax.swing.JLabel SuLiteralEs;
    private javax.swing.JTextField Titulo;
    private javax.swing.JButton Traducir;
    private javax.swing.JLabel jLabelAGK;
    private javax.swing.JLabel jLabelDBZ;
    private javax.swing.JLabel jLabelDN;
    private javax.swing.JLabel jLabelIngresaNombre;
    private javax.swing.JLabel jLabelKNN;
    // End of variables declaration//GEN-END:variables
}
