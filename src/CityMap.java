import javax.swing.event.MouseInputListener;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.VirtualEarthTileFactoryInfo;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;





public class CityMap extends javax.swing.JFrame {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CityMap() {
        initComponents();
        init();
      
        
    }
    private void init(){
        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        jXMapViewer.setTileFactory(tileFactory);
        GeoPosition geo = new GeoPosition (33.6988727,73.0344865);
        jXMapViewer.setAddressLocation(geo);
        jXMapViewer.setZoom(12);
        
        //create event mouse move
        
        MouseInputListener m = new PanMouseInputListener(jXMapViewer);
        jXMapViewer.addMouseListener(m);
        jXMapViewer.addMouseMotionListener(m);
        jXMapViewer.addMouseWheelListener(new ZoomMouseWheelListenerCenter (jXMapViewer));
    }

    
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jXMapViewer = new org.jxmapviewer.JXMapViewer();
        combomap = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        combomap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Open Stree", "Virtual  Earth", "Hybrid", "Satellite" }));
        combomap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomapActionPerformed(evt);
            }
        });
        
        JButton btnNewButton = new JButton("Back");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        	}
        });

        javax.swing.GroupLayout jXMapViewerLayout = new javax.swing.GroupLayout(jXMapViewer);
        jXMapViewerLayout.setHorizontalGroup(
        	jXMapViewerLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jXMapViewerLayout.createSequentialGroup()
        			.addGap(53)
        			.addComponent(btnNewButton)
        			.addPreferredGap(ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
        			.addComponent(combomap, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
        );
        jXMapViewerLayout.setVerticalGroup(
        	jXMapViewerLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jXMapViewerLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jXMapViewerLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnNewButton)
        				.addComponent(combomap, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(634, Short.MAX_VALUE))
        );
        jXMapViewer.setLayout(jXMapViewerLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXMapViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXMapViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void combomapActionPerformed(java.awt.event.ActionEvent evt) {                                         
                TileFactoryInfo info;
        int index = combomap.getSelectedIndex();
        if (index==0){
            info = new OSMTileFactoryInfo();
        }
        else if (index == 1){
            info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.MAP);
        }
        else if (index == 2){
            info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.HYBRID);
        }
        else{
            info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.SATELLITE);
        }
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        jXMapViewer.setTileFactory(tileFactory);
    
    }                                        

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
            java.util.logging.Logger.getLogger(CityMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CityMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CityMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CityMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CityMap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> combomap;
    private org.jxmapviewer.JXMapViewer jXMapViewer;
    // End of variables declaration                   

    private void initWaypoint() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
