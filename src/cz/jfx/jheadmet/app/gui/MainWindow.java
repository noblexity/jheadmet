package cz.jfx.jheadmet.app.gui;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import cz.jfx.jheadmet.app.external.Scripts;
import cz.jfx.jheadmet.Application;
import cz.jfx.jheadmet.app.Parser;
import cz.jfx.jheadmet.app.Settings;
import cz.jfx.jheadmet.app.external.Styles;

/**
 *
 * @author Felix
 */
public class MainWindow extends javax.swing.JFrame {

    public Application meta;

    /**
     * Creates new form Frame
     */
    public MainWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        html_vs_xhtml = new javax.swing.ButtonGroup();
        jQuery_group = new javax.swing.ButtonGroup();
        jQueryUI_group = new javax.swing.ButtonGroup();
        content = new javax.swing.JTabbedPane();
        panel_meta = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        meta_title = new javax.swing.JTextField();
        meta_keywords = new javax.swing.JTextField();
        meta_author = new javax.swing.JTextField();
        meta_copyright = new javax.swing.JTextField();
        meta_description_area = new javax.swing.JScrollPane();
        meta_description = new javax.swing.JTextArea();
        panel_facebook = new javax.swing.JTabbedPane();
        panel_facebook_main = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        og_id_type = new javax.swing.JComboBox();
        og_type = new javax.swing.JComboBox();
        og_title = new javax.swing.JTextField();
        og_url = new javax.swing.JTextField();
        og_site_name = new javax.swing.JTextField();
        og_image = new javax.swing.JTextField();
        og_description_area = new javax.swing.JScrollPane();
        og_description = new javax.swing.JTextArea();
        og_id = new javax.swing.JTextField();
        panel_facebook_contact = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        og_contact_email = new javax.swing.JTextField();
        og_contact_tel = new javax.swing.JTextField();
        og_contact_fax = new javax.swing.JTextField();
        panel_facebook_location = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        og_location_latitude = new javax.swing.JTextField();
        og_location_longitude = new javax.swing.JTextField();
        og_location_stree_address = new javax.swing.JTextField();
        og_location_city = new javax.swing.JTextField();
        og_location_region = new javax.swing.JTextField();
        og_location_postal_code = new javax.swing.JTextField();
        og_location_country_name = new javax.swing.JTextField();
        panel_facebook_video = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        og_video = new javax.swing.JTextField();
        og_video_height = new javax.swing.JTextField();
        og_video_width = new javax.swing.JTextField();
        og_video_type = new javax.swing.JComboBox();
        panel_facebook_audio = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        og_audio = new javax.swing.JTextField();
        og_audio_title = new javax.swing.JTextField();
        og_audio_artist = new javax.swing.JTextField();
        og_audio_album = new javax.swing.JTextField();
        og_audio_type = new javax.swing.JComboBox();
        panel_bots = new javax.swing.JPanel();
        panel_bots_google = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        bots_google_auth = new javax.swing.JTextField();
        bots_google_snippet = new javax.swing.JComboBox();
        bots_google_archive = new javax.swing.JComboBox();
        panel_bots_yahoo = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        bots_yahoo_auth = new javax.swing.JTextField();
        panel_styles = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        styles_style1 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        styles_style1_media = new javax.swing.JComboBox();
        styles_style2 = new javax.swing.JTextField();
        styles_style2_media = new javax.swing.JComboBox();
        panel_styles_external = new javax.swing.JPanel();
        chbxs_jquery_ui = new javax.swing.JCheckBox();
        panel_scripts = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        scripts_script1 = new javax.swing.JTextField();
        panel_scripts_external = new javax.swing.JPanel();
        chbx_jquery = new javax.swing.JCheckBox();
        chbx_jquery_ui = new javax.swing.JCheckBox();
        chbx_mootools = new javax.swing.JCheckBox();
        chbx_prototype = new javax.swing.JCheckBox();
        chbx_scriptaculous = new javax.swing.JCheckBox();
        chbx_ext_core = new javax.swing.JCheckBox();
        chbx_chrome_frame = new javax.swing.JCheckBox();
        chbx_swfobject = new javax.swing.JCheckBox();
        chbx_webfont = new javax.swing.JCheckBox();
        chbx_yui = new javax.swing.JCheckBox();
        chbx_facebook_api = new javax.swing.JCheckBox();
        chbx_google_api = new javax.swing.JCheckBox();
        chbx_jquery_validation = new javax.swing.JCheckBox();
        chbx_jquery_cdn = new javax.swing.JCheckBox();
        chbx_jquery_ui_cdn = new javax.swing.JCheckBox();
        chbx_dojo = new javax.swing.JCheckBox();
        chbx_mapy_api = new javax.swing.JCheckBox();
        chbx_google_maps_api = new javax.swing.JCheckBox();
        chbx_jquery_cycle = new javax.swing.JCheckBox();
        panel_rss = new javax.swing.JPanel();
        source1 = new javax.swing.JPanel();
        rss_source1_title = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        rss_source1_url = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        source2 = new javax.swing.JPanel();
        rss_source2_title = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        rss_source2_url = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        source3 = new javax.swing.JPanel();
        rss_source3_title = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        rss_source3_url = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        panel_settings = new javax.swing.JPanel();
        settings_html = new javax.swing.JRadioButton();
        settings_xhtml = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        settings_charset = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        settings_doctype = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        settings_favicon = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        settings_relative_path = new javax.swing.JCheckBox();
        settings_skeleton = new javax.swing.JCheckBox();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        settings_url = new javax.swing.JTextField();
        menu = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        info = new javax.swing.JButton();
        generate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("jHeadmet");
        setIconImage(this.getFavicon());
        setLocationByPlatform(true);
        setMinimumSize(null);
        setResizable(false);

        jLabel4.setText("Titulek");

        jLabel5.setText("Kličová slova");

        jLabel7.setText("Autor");

        jLabel8.setText("Copyright");

        jLabel15.setText("Popis");

        meta_description.setColumns(20);
        meta_description.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        meta_description.setRows(5);
        meta_description_area.setViewportView(meta_description);

        javax.swing.GroupLayout panel_metaLayout = new javax.swing.GroupLayout(panel_meta);
        panel_meta.setLayout(panel_metaLayout);
        panel_metaLayout.setHorizontalGroup(
            panel_metaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_metaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_metaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_metaLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(meta_keywords, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                    .addGroup(panel_metaLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(meta_title, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                    .addGroup(panel_metaLayout.createSequentialGroup()
                        .addGroup(panel_metaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_metaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meta_author, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                            .addComponent(meta_description_area, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)))
                    .addGroup(panel_metaLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(meta_copyright, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_metaLayout.setVerticalGroup(
            panel_metaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_metaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_metaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(meta_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_metaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meta_keywords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_metaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(meta_description_area, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panel_metaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meta_author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_metaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(meta_copyright, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        content.addTab("meta", new javax.swing.ImageIcon(getClass().getResource("/cz/jfx/jheadmet/resources/meta.png")), panel_meta); // NOI18N

        panel_facebook.setOpaque(true);

        panel_facebook_main.setForeground(new java.awt.Color(255, 255, 153));

        jLabel9.setText("Url:");

        jLabel10.setText("Typ:");

        jLabel12.setText("Název stránek:");

        jLabel13.setText("ID:");

        jLabel11.setText("Titulek:");

        jLabel18.setText("Popis:");

        jLabel19.setText("Obrázek:");

        og_id_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "admins", "app_id", "page_id" }));

        og_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----------", "activity", "actor", "album", "article", "athlete", "author", "band", "bar", "blog", "book", "cafe", "cause", "city", "company", "country", "director", "drink", "food", "game", "government", "hotel", "landmark", "movie", "musician", "non_profit", "politician", "product", "public_figure", "restaurant", "school", "song", "sport", "sports_league", "sports_team", "state_province", "tv_show", "university", "website" }));

        og_description.setColumns(20);
        og_description.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        og_description.setRows(5);
        og_description_area.setViewportView(og_description);

        javax.swing.GroupLayout panel_facebook_mainLayout = new javax.swing.GroupLayout(panel_facebook_main);
        panel_facebook_main.setLayout(panel_facebook_mainLayout);
        panel_facebook_mainLayout.setHorizontalGroup(
            panel_facebook_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_facebook_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_facebook_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_facebook_mainLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(og_id_type, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(og_id, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                    .addGroup(panel_facebook_mainLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(og_image, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                    .addGroup(panel_facebook_mainLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(og_site_name, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                    .addGroup(panel_facebook_mainLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(og_title, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                    .addGroup(panel_facebook_mainLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(og_url, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                    .addGroup(panel_facebook_mainLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(og_type, 0, 348, Short.MAX_VALUE))
                    .addGroup(panel_facebook_mainLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(og_description_area, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panel_facebook_mainLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel13, jLabel18, jLabel19, jLabel9});

        panel_facebook_mainLayout.setVerticalGroup(
            panel_facebook_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_facebook_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_facebook_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(og_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_facebook_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(og_url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_facebook_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(og_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_facebook_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(og_site_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_facebook_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(og_image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_facebook_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(og_description_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panel_facebook_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(og_id_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(og_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_facebook.addTab("základní", new javax.swing.ImageIcon(getClass().getResource("/cz/jfx/jheadmet/resources/spellcheck.png")), panel_facebook_main); // NOI18N

        jLabel14.setText("Email:");

        jLabel6.setText("Telefon:");

        jLabel16.setText("Fax:");

        javax.swing.GroupLayout panel_facebook_contactLayout = new javax.swing.GroupLayout(panel_facebook_contact);
        panel_facebook_contact.setLayout(panel_facebook_contactLayout);
        panel_facebook_contactLayout.setHorizontalGroup(
            panel_facebook_contactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_facebook_contactLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_facebook_contactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_facebook_contactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(og_contact_tel, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addComponent(og_contact_email, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addComponent(og_contact_fax, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
                .addContainerGap())
        );

        panel_facebook_contactLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel14, jLabel16, jLabel6});

        panel_facebook_contactLayout.setVerticalGroup(
            panel_facebook_contactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_facebook_contactLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_facebook_contactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(og_contact_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_facebook_contactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(og_contact_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_facebook_contactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel16)
                    .addComponent(og_contact_fax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(238, Short.MAX_VALUE))
        );

        panel_facebook.addTab("kontakt", new javax.swing.ImageIcon(getClass().getResource("/cz/jfx/jheadmet/resources/email.png")), panel_facebook_contact); // NOI18N

        jLabel17.setText("GPS šířka:");

        jLabel20.setText("GPS délka:");

        jLabel21.setText("Ulice:");

        jLabel22.setText("Město");

        jLabel23.setText("Region");

        jLabel24.setText("PSČ:");

        jLabel25.setText("Země:");

        javax.swing.GroupLayout panel_facebook_locationLayout = new javax.swing.GroupLayout(panel_facebook_location);
        panel_facebook_location.setLayout(panel_facebook_locationLayout);
        panel_facebook_locationLayout.setHorizontalGroup(
            panel_facebook_locationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_facebook_locationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_facebook_locationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_facebook_locationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(og_location_latitude, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                    .addComponent(og_location_longitude, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                    .addComponent(og_location_stree_address, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                    .addComponent(og_location_city, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                    .addComponent(og_location_region, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                    .addComponent(og_location_postal_code, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                    .addComponent(og_location_country_name, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
                .addContainerGap())
        );

        panel_facebook_locationLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel17, jLabel20, jLabel21, jLabel22, jLabel23, jLabel24, jLabel25});

        panel_facebook_locationLayout.setVerticalGroup(
            panel_facebook_locationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_facebook_locationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_facebook_locationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel17)
                    .addComponent(og_location_latitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_facebook_locationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel20)
                    .addComponent(og_location_longitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_facebook_locationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(og_location_stree_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_facebook_locationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(og_location_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_facebook_locationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(og_location_region, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_facebook_locationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(og_location_postal_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_facebook_locationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(og_location_country_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        panel_facebook.addTab("pozice", new javax.swing.ImageIcon(getClass().getResource("/cz/jfx/jheadmet/resources/map.png")), panel_facebook_location); // NOI18N

        jLabel26.setText("Adresa videa:");

        jLabel27.setText("Výška:");

        jLabel28.setText("Šířka:");

        jLabel29.setText("Typ:");

        og_video_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "application/x-shockwave-flash", "audio/mpeg" }));

        javax.swing.GroupLayout panel_facebook_videoLayout = new javax.swing.GroupLayout(panel_facebook_video);
        panel_facebook_video.setLayout(panel_facebook_videoLayout);
        panel_facebook_videoLayout.setHorizontalGroup(
            panel_facebook_videoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_facebook_videoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_facebook_videoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_facebook_videoLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(og_video, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
                    .addGroup(panel_facebook_videoLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(og_video_height, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
                    .addGroup(panel_facebook_videoLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(og_video_width, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
                    .addGroup(panel_facebook_videoLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(og_video_type, 0, 354, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panel_facebook_videoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel26, jLabel27, jLabel28, jLabel29});

        panel_facebook_videoLayout.setVerticalGroup(
            panel_facebook_videoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_facebook_videoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_facebook_videoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(og_video, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_facebook_videoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(og_video_height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_facebook_videoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel28)
                    .addComponent(og_video_width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_facebook_videoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(og_video_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(207, Short.MAX_VALUE))
        );

        panel_facebook.addTab("video", new javax.swing.ImageIcon(getClass().getResource("/cz/jfx/jheadmet/resources/film.png")), panel_facebook_video); // NOI18N

        jLabel30.setText("Adresa zvuku:");

        jLabel31.setText("Název:");

        jLabel32.setText("Umělec:");

        jLabel33.setText("Album:");

        jLabel34.setText("Typ:");

        og_audio_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "application/mp3" }));

        javax.swing.GroupLayout panel_facebook_audioLayout = new javax.swing.GroupLayout(panel_facebook_audio);
        panel_facebook_audio.setLayout(panel_facebook_audioLayout);
        panel_facebook_audioLayout.setHorizontalGroup(
            panel_facebook_audioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_facebook_audioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_facebook_audioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_facebook_audioLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(og_audio, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                    .addGroup(panel_facebook_audioLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(og_audio_title, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                    .addGroup(panel_facebook_audioLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(og_audio_artist, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                    .addGroup(panel_facebook_audioLayout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(og_audio_album, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                    .addGroup(panel_facebook_audioLayout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(og_audio_type, 0, 352, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panel_facebook_audioLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel30, jLabel31, jLabel32, jLabel33, jLabel34});

        panel_facebook_audioLayout.setVerticalGroup(
            panel_facebook_audioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_facebook_audioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_facebook_audioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(og_audio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_facebook_audioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(og_audio_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_facebook_audioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(og_audio_artist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_facebook_audioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(og_audio_album, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_facebook_audioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(og_audio_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        panel_facebook.addTab("zvuk", new javax.swing.ImageIcon(getClass().getResource("/cz/jfx/jheadmet/resources/music.png")), panel_facebook_audio); // NOI18N

        content.addTab("facebook", new javax.swing.ImageIcon(getClass().getResource("/cz/jfx/jheadmet/resources/fb.png")), panel_facebook); // NOI18N

        panel_bots_google.setBorder(javax.swing.BorderFactory.createTitledBorder(" Google"));

        jLabel35.setText("Ověření:");

        jLabel36.setText("GoogleBOT");

        bots_google_snippet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----------", "snippet", "nosnippet" }));

        bots_google_archive.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----------", "archive", "noarchive" }));

        javax.swing.GroupLayout panel_bots_googleLayout = new javax.swing.GroupLayout(panel_bots_google);
        panel_bots_google.setLayout(panel_bots_googleLayout);
        panel_bots_googleLayout.setHorizontalGroup(
            panel_bots_googleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bots_googleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_bots_googleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_bots_googleLayout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(10, 10, 10)
                        .addComponent(bots_google_auth, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bots_googleLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bots_google_snippet, 0, 165, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bots_google_archive, 0, 164, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panel_bots_googleLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel35, jLabel36});

        panel_bots_googleLayout.setVerticalGroup(
            panel_bots_googleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bots_googleLayout.createSequentialGroup()
                .addGroup(panel_bots_googleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bots_google_auth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_bots_googleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bots_google_archive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bots_google_snippet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_bots_yahoo.setBorder(javax.swing.BorderFactory.createTitledBorder(" Yahoo"));

        jLabel38.setText("Ověření:");

        javax.swing.GroupLayout panel_bots_yahooLayout = new javax.swing.GroupLayout(panel_bots_yahoo);
        panel_bots_yahoo.setLayout(panel_bots_yahooLayout);
        panel_bots_yahooLayout.setHorizontalGroup(
            panel_bots_yahooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bots_yahooLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bots_yahoo_auth, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_bots_yahooLayout.setVerticalGroup(
            panel_bots_yahooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bots_yahooLayout.createSequentialGroup()
                .addGroup(panel_bots_yahooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bots_yahoo_auth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_botsLayout = new javax.swing.GroupLayout(panel_bots);
        panel_bots.setLayout(panel_botsLayout);
        panel_botsLayout.setHorizontalGroup(
            panel_botsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_botsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_botsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_bots_yahoo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_bots_google, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_botsLayout.setVerticalGroup(
            panel_botsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_bots_google, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_bots_yahoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        content.addTab("boti", new javax.swing.ImageIcon(getClass().getResource("/cz/jfx/jheadmet/resources/magnifier.png")), panel_bots); // NOI18N

        jLabel39.setText("Styl1:");

        jLabel40.setText("Styl2:");

        styles_style1_media.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "media", "all", "screen", "projection", "tv", "print", "screen, print", "screen, projection, tv" }));

        styles_style2_media.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "media", "all", "screen", "projection", "tv", "print", "screen, print", "screen, projection, tv" }));

        panel_styles_external.setBorder(javax.swing.BorderFactory.createTitledBorder("Externí styly"));

        chbxs_jquery_ui.setText("jQuery UI");

        javax.swing.GroupLayout panel_styles_externalLayout = new javax.swing.GroupLayout(panel_styles_external);
        panel_styles_external.setLayout(panel_styles_externalLayout);
        panel_styles_externalLayout.setHorizontalGroup(
            panel_styles_externalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_styles_externalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chbxs_jquery_ui, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );
        panel_styles_externalLayout.setVerticalGroup(
            panel_styles_externalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_styles_externalLayout.createSequentialGroup()
                .addComponent(chbxs_jquery_ui)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_stylesLayout = new javax.swing.GroupLayout(panel_styles);
        panel_styles.setLayout(panel_stylesLayout);
        panel_stylesLayout.setHorizontalGroup(
            panel_stylesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_stylesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_stylesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_styles_external, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_stylesLayout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(styles_style1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(styles_style1_media, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_stylesLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(styles_style2, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(styles_style2_media, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        panel_stylesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel39, jLabel40});

        panel_stylesLayout.setVerticalGroup(
            panel_stylesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_stylesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_stylesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(styles_style1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(styles_style1_media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_stylesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(styles_style2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(styles_style2_media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panel_styles_external, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        content.addTab("styly", new javax.swing.ImageIcon(getClass().getResource("/cz/jfx/jheadmet/resources/css.png")), panel_styles); // NOI18N

        jLabel41.setText("Script");

        panel_scripts_external.setBorder(javax.swing.BorderFactory.createTitledBorder("Externí scripty"));

        chbx_jquery.setText("jQuery");

        chbx_jquery_ui.setText("jQuery UI");

        chbx_mootools.setText("MooTools");

        chbx_prototype.setText("Prototype");

        chbx_scriptaculous.setText("Scriptaculous");

        chbx_ext_core.setText("Ext Core");

        chbx_chrome_frame.setText("Chrome Frame");

        chbx_swfobject.setText("SWFObject");

        chbx_webfont.setText("WebFont Loader");

        chbx_yui.setText("YUI");

        chbx_facebook_api.setText("Facebook API");

        chbx_google_api.setText("Google API");

        chbx_jquery_validation.setText("jQuery Validation");

        chbx_jquery_cdn.setText("jQuery(CDN)");

        chbx_jquery_ui_cdn.setText("jQuery UI(CDN)");

        chbx_dojo.setText("Dojo");

        chbx_mapy_api.setText("Mapy.cz API");

        chbx_google_maps_api.setText("Google Maps API");

        chbx_jquery_cycle.setText("jQuery Cycle");

        javax.swing.GroupLayout panel_scripts_externalLayout = new javax.swing.GroupLayout(panel_scripts_external);
        panel_scripts_external.setLayout(panel_scripts_externalLayout);
        panel_scripts_externalLayout.setHorizontalGroup(
            panel_scripts_externalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_scripts_externalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_scripts_externalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_scripts_externalLayout.createSequentialGroup()
                        .addGroup(panel_scripts_externalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbx_jquery_cdn)
                            .addComponent(chbx_jquery_ui)
                            .addComponent(chbx_jquery_ui_cdn)
                            .addComponent(chbx_jquery_cycle))
                        .addGap(18, 18, 18)
                        .addGroup(panel_scripts_externalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_scripts_externalLayout.createSequentialGroup()
                                .addComponent(chbx_webfont)
                                .addGap(18, 18, 18)
                                .addComponent(chbx_google_api))
                            .addGroup(panel_scripts_externalLayout.createSequentialGroup()
                                .addGroup(panel_scripts_externalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chbx_chrome_frame)
                                    .addComponent(chbx_scriptaculous)
                                    .addComponent(chbx_mootools)
                                    .addComponent(chbx_dojo)
                                    .addComponent(chbx_prototype))
                                .addGap(18, 18, 18)
                                .addGroup(panel_scripts_externalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chbx_mapy_api)
                                    .addComponent(chbx_google_maps_api)
                                    .addComponent(chbx_yui)
                                    .addComponent(chbx_ext_core)))))
                    .addComponent(chbx_jquery_validation)
                    .addGroup(panel_scripts_externalLayout.createSequentialGroup()
                        .addComponent(chbx_jquery)
                        .addGap(18, 18, 18)
                        .addComponent(chbx_swfobject)
                        .addGap(18, 18, 18)
                        .addComponent(chbx_facebook_api)))
                .addGap(55, 55, 55))
        );

        panel_scripts_externalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {chbx_chrome_frame, chbx_dojo, chbx_ext_core, chbx_facebook_api, chbx_google_api, chbx_google_maps_api, chbx_jquery, chbx_jquery_cdn, chbx_jquery_cycle, chbx_jquery_ui, chbx_jquery_ui_cdn, chbx_jquery_validation, chbx_mapy_api, chbx_mootools, chbx_prototype, chbx_scriptaculous, chbx_swfobject, chbx_webfont, chbx_yui});

        panel_scripts_externalLayout.setVerticalGroup(
            panel_scripts_externalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_scripts_externalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel_scripts_externalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbx_jquery)
                    .addComponent(chbx_swfobject)
                    .addComponent(chbx_facebook_api))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_scripts_externalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbx_jquery_cdn)
                    .addComponent(chbx_webfont)
                    .addComponent(chbx_google_api))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_scripts_externalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbx_jquery_ui)
                    .addComponent(chbx_chrome_frame)
                    .addComponent(chbx_google_maps_api))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_scripts_externalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbx_jquery_ui_cdn)
                    .addComponent(chbx_mapy_api)
                    .addComponent(chbx_scriptaculous))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_scripts_externalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbx_jquery_cycle)
                    .addComponent(chbx_yui)
                    .addComponent(chbx_mootools))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_scripts_externalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbx_jquery_validation)
                    .addComponent(chbx_ext_core)
                    .addComponent(chbx_dojo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbx_prototype))
        );

        javax.swing.GroupLayout panel_scriptsLayout = new javax.swing.GroupLayout(panel_scripts);
        panel_scripts.setLayout(panel_scriptsLayout);
        panel_scriptsLayout.setHorizontalGroup(
            panel_scriptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_scriptsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_scriptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_scripts_external, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .addGroup(panel_scriptsLayout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(18, 18, 18)
                        .addComponent(scripts_script1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_scriptsLayout.setVerticalGroup(
            panel_scriptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_scriptsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_scriptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(scripts_script1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_scripts_external, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        content.addTab("scripty", new javax.swing.ImageIcon(getClass().getResource("/cz/jfx/jheadmet/resources/js.png")), panel_scripts); // NOI18N

        source1.setBorder(javax.swing.BorderFactory.createTitledBorder(" Zdroj "));

        jLabel43.setText("Popis:");

        jLabel44.setText("Url:");

        javax.swing.GroupLayout source1Layout = new javax.swing.GroupLayout(source1);
        source1.setLayout(source1Layout);
        source1Layout.setHorizontalGroup(
            source1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, source1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(source1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(source1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rss_source1_url, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(rss_source1_title, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
                .addContainerGap())
        );
        source1Layout.setVerticalGroup(
            source1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(source1Layout.createSequentialGroup()
                .addGroup(source1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(rss_source1_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(source1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(rss_source1_url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        source2.setBorder(javax.swing.BorderFactory.createTitledBorder(" Zdroj "));

        jLabel45.setText("Popis:");

        jLabel48.setText("Url:");

        javax.swing.GroupLayout source2Layout = new javax.swing.GroupLayout(source2);
        source2.setLayout(source2Layout);
        source2Layout.setHorizontalGroup(
            source2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, source2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(source2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(source2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rss_source2_url, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(rss_source2_title, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
                .addContainerGap())
        );
        source2Layout.setVerticalGroup(
            source2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(source2Layout.createSequentialGroup()
                .addGroup(source2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(rss_source2_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(source2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(rss_source2_url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        source3.setBorder(javax.swing.BorderFactory.createTitledBorder(" Zdroj "));

        jLabel49.setText("Popis:");

        jLabel50.setText("Url:");

        javax.swing.GroupLayout source3Layout = new javax.swing.GroupLayout(source3);
        source3.setLayout(source3Layout);
        source3Layout.setHorizontalGroup(
            source3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, source3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(source3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(source3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rss_source3_url, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(rss_source3_title, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
                .addContainerGap())
        );
        source3Layout.setVerticalGroup(
            source3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(source3Layout.createSequentialGroup()
                .addGroup(source3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(rss_source3_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(source3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(rss_source3_url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_rssLayout = new javax.swing.GroupLayout(panel_rss);
        panel_rss.setLayout(panel_rssLayout);
        panel_rssLayout.setHorizontalGroup(
            panel_rssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_rssLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_rssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(source1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(source3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(source2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_rssLayout.setVerticalGroup(
            panel_rssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_rssLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(source1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(source3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(source2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        content.addTab("rss", new javax.swing.ImageIcon(getClass().getResource("/cz/jfx/jheadmet/resources/rss.png")), panel_rss); // NOI18N

        html_vs_xhtml.add(settings_html);
        settings_html.setSelected(true);
        settings_html.setText("HTML");

        html_vs_xhtml.add(settings_xhtml);
        settings_xhtml.setText("XHTML");

        jLabel1.setText("Typ: ");

        jLabel2.setText("Doctype:");

        settings_charset.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----------", "UTF-8", "windows-1250", "iso-8859-2" }));

        jLabel3.setText("Kódování:");

        settings_doctype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----------", "HTML 5", "XHTML 1 STRICT", "XHTML 1 TRANSITIONAL", "XHTML 1 FRAMESET", "HTML 4 STRICT", "HTML 4 TRANSITIONAL", "HTML 4 FRAMESET" }));

        jLabel37.setText("Favicon");

        jLabel42.setText("Relativní cesta:");

        settings_relative_path.setSelected(true);
        settings_relative_path.setText("začíná s /");

        settings_skeleton.setSelected(true);
        settings_skeleton.setText("html, head, body");

        jLabel46.setText("Skeleton");

        jLabel47.setText("Url stránek:");

        javax.swing.GroupLayout panel_settingsLayout = new javax.swing.GroupLayout(panel_settings);
        panel_settings.setLayout(panel_settingsLayout);
        panel_settingsLayout.setHorizontalGroup(
            panel_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_settingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_settingsLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(settings_favicon, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                    .addGroup(panel_settingsLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(settings_html)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(settings_xhtml))
                    .addGroup(panel_settingsLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(settings_charset, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_settingsLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(settings_doctype, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_settingsLayout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(settings_relative_path))
                    .addGroup(panel_settingsLayout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(33, 33, 33)
                        .addComponent(settings_skeleton))
                    .addGroup(panel_settingsLayout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addGap(22, 22, 22)
                        .addComponent(settings_url, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panel_settingsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel37, jLabel42});

        panel_settingsLayout.setVerticalGroup(
            panel_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_settingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(settings_html)
                    .addComponent(settings_xhtml))
                .addGap(7, 7, 7)
                .addGroup(panel_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(settings_doctype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addGroup(panel_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(settings_charset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(settings_favicon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(settings_relative_path))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(settings_skeleton))
                .addGap(7, 7, 7)
                .addGroup(panel_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(settings_url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        content.addTab("nastavení", new javax.swing.ImageIcon(getClass().getResource("/cz/jfx/jheadmet/resources/settings.png")), panel_settings); // NOI18N

        menu.setAlignmentX(0.0F);
        menu.setAlignmentY(0.0F);
        menu.setRequestFocusEnabled(false);
        menu.setVerifyInputWhenFocusTarget(false);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cz/jfx/jheadmet/resources/close.png"))); // NOI18N
        exit.setToolTipText("Zavřít");
        exit.setBorder(null);
        exit.setContentAreaFilled(false);
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cz/jfx/jheadmet/resources/info.png"))); // NOI18N
        info.setToolTipText("Info");
        info.setContentAreaFilled(false);
        info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        info.setDefaultCapable(false);
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });

        generate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cz/jfx/jheadmet/resources/generate.png"))); // NOI18N
        generate.setToolTipText("Generovat kód");
        generate.setBorder(null);
        generate.setBorderPainted(false);
        generate.setContentAreaFilled(false);
        generate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(generate)
                    .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        menuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {exit, generate, info});

        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(generate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(exit))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(529, 429));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Made by Milan 'Felix' Šulc (http://jfx.cz)\nVersion: " + Settings.VERSION + " (c)\nLast update: " + Settings.UPDATE, "Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_infoActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        // nastaveni
        this.checkSettings();
        // facebook
        this.checkOg();
        // facebook kontakt
        this.checkOgContact();
        // facebook pozice
        this.checkOgLocation();
        // facebook video
        this.checkOgVideo();
        // facebook audio
        this.checkOgAudio();
        // boti a overeni
        this.checkBots();
        // meta
        this.checkMeta();
        // rss
        this.checkRss();
        // styly
        this.checkStyles();
        // scripty
        this.checkScripts();
        // otevre output
        this.meta.openOutput();
        // pusti program
        this.meta.processAll();
        // zobrazi data
        this.meta.printAll();
    }//GEN-LAST:event_generateActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    // zjisti zda-li je vypleno nastaveni
    public void checkSettings() {
        // html vs xhtml
        if (this.settings_xhtml.isSelected()) {
            Parser.setXhtml(true);
        } else {
            Parser.setXhtml(false);
        }

        // relativni cesta
        if (this.settings_relative_path.isSelected()) {
            Parser.setRelativePath(true);
        } else {
            Parser.setRelativePath(false);
        }

        // doctype
        if (!"----------".equals(this.settings_doctype.getSelectedItem().toString())) {
            this.meta.addTo("settings", new String[]{"doctype", this.settings_doctype.getSelectedItem().toString()});
        }

        // charset
        if (!"----------".equals(this.settings_charset.getSelectedItem().toString())) {
            this.meta.addTo("settings", new String[]{"charset", this.settings_charset.getSelectedItem().toString()});
        }

        // favicon
        if (!"".equals(this.settings_favicon.getText())) {
            // kontrola koncovky
            if (this.settings_favicon.getText().indexOf(".") == -1) {
                this.meta.addTo("settings", new String[]{"favicon", this.settings_favicon.getText() + ".ico"});
            } else {
                this.meta.addTo("settings", new String[]{"favicon", this.settings_favicon.getText()});
            }
        }

        // nazev webu
        if (!"".equals(this.settings_url.getText())) {
            Parser.setUrl(this.settings_url.getText());
        }

        // charset
        if (this.settings_skeleton.isSelected()) {
            this.meta.skeleton = true;
        } else {
            this.meta.skeleton = false;
        }

    }

    // zjisti zda-li jsou vyplneny meta znacky
    public void checkMeta() {

        // klicova slova
        if (!"".equals(this.meta_keywords.getText())) {
            this.meta.addTo("meta", new String[]{"keywords", this.meta_keywords.getText()});
        }

        // popisek
        if (!"".equals(this.meta_description.getText())) {
            this.meta.addTo("meta", new String[]{"description", this.meta_description.getText()});
        }

        // autor
        if (!"".equals(this.meta_author.getText())) {
            this.meta.addTo("meta", new String[]{"author", this.meta_author.getText()});
        }

        // copyright
        if (!"".equals(this.meta_copyright.getText())) {
            this.meta.addTo("meta", new String[]{"copyright", this.meta_copyright.getText()});
        }

        // titulek
        if (!"".equals(this.meta_title.getText())) {
            this.meta.addTo("meta", new String[]{"title", this.meta_title.getText()});
        }
    }

    // zjisti zda-li jsou facebook klasicke znacky
    public void checkOg() {
        // titulek
        if (!"".equals(this.og_title.getText())) {
            this.meta.addTo("og", new String[]{"title", this.og_title.getText()});
        }

        // url
        if (!"".equals(this.og_url.getText())) {
            this.meta.addTo("og", new String[]{"url", this.og_url.getText()});
        }

        // kategorie
        if (!"----------".equals(this.og_type.getSelectedItem().toString())) {
            this.meta.addTo("og", new String[]{"type", this.og_type.getSelectedItem().toString()});
        }

        // nazev stranek
        if (!"".equals(this.og_site_name.getText())) {
            this.meta.addTo("og", new String[]{"site_name", this.og_site_name.getText()});
        }

        // obrazek
        if (!"".equals(this.og_image.getText())) {
            this.meta.addTo("og", new String[]{"image", this.og_image.getText()});
        }

        // popisek
        if (!"".equals(this.og_description.getText())) {
            this.meta.addTo("og", new String[]{"description", this.og_description.getText()});
        }

        // ID
        if (!"".equals(this.og_id.getText())) {
            String type;
            if (this.og_id_type.getSelectedIndex() == 0) {
                type = "admins";
            } else if (this.og_id_type.getSelectedIndex() == 1) {
                type = "app_id";
            } else {
                type = "page_id";
            }
            this.meta.addTo("og", new String[]{type, this.og_id.getText()});
        }
    }

    // zjisti zda-li jsou facebook kontakt znacky
    public void checkOgContact() {
        // email
        if (!"".equals(this.og_contact_email.getText())) {
            this.meta.addTo("og_contact", new String[]{"email", this.og_contact_email.getText()});
        }

        // tel
        if (!"".equals(this.og_contact_tel.getText())) {
            this.meta.addTo("og_contact", new String[]{"tel", this.og_contact_tel.getText()});
        }

        // fax
        if (!"".equals(this.og_contact_fax.getText())) {
            this.meta.addTo("og_contact", new String[]{"fax", this.og_contact_fax.getText()});
        }

    }

    // zjisti zda-li jsou facebook kontakt znacky
    public void checkOgLocation() {
        // GPS sirka
        if (!"".equals(this.og_location_latitude.getText())) {
            this.meta.addTo("og_location", new String[]{"latitude", this.og_location_latitude.getText()});
        }

        // GPS vyska
        if (!"".equals(this.og_location_longitude.getText())) {
            this.meta.addTo("og_location", new String[]{"longitude", this.og_location_longitude.getText()});
        }

        // ulice
        if (!"".equals(this.og_location_stree_address.getText())) {
            this.meta.addTo("og_location", new String[]{"street-address", this.og_location_stree_address.getText()});
        }

        // mesto
        if (!"".equals(this.og_location_city.getText())) {
            this.meta.addTo("og_location", new String[]{"locality", this.og_location_city.getText()});
        }

        // region
        if (!"".equals(this.og_location_region.getText())) {
            this.meta.addTo("og_location", new String[]{"region", this.og_location_region.getText()});
        }

        // PSC
        if (!"".equals(this.og_location_postal_code.getText())) {
            this.meta.addTo("og_location", new String[]{"postal-code", this.og_location_postal_code.getText()});
        }

        // zeme
        if (!"".equals(this.og_location_country_name.getText())) {
            this.meta.addTo("og_location", new String[]{"country-name", this.og_location_country_name.getText()});
        }
    }

    // zjisti zda-li jsou facebook video znacky
    public void checkOgVideo() {
        // video
        if (!"".equals(this.og_video.getText())) {
            this.meta.addTo("og_video", new String[]{"video", this.og_video.getText()});
            // typ
            this.meta.addTo("og_video", new String[]{"type", this.og_video_type.getSelectedItem().toString()});
            System.out.println("tes");

        }

        // sirka
        if (!"".equals(this.og_video_width.getText())) {
            this.meta.addTo("og_video", new String[]{"width", this.og_video_width.getText()});
        }

        // vyska
        if (!"".equals(this.og_video_height.getText())) {
            this.meta.addTo("og_video", new String[]{"height", this.og_video_height.getText()});
        }

    }

    // zjisti zda-li jsou facebook audio znacky
    public void checkOgAudio() {
        // audio
        if (!"".equals(this.og_audio.getText())) {
            this.meta.addTo("og_audio", new String[]{"audio", this.og_audio.getText()});
            // typ
            this.meta.addTo("og_audio", new String[]{"type", this.og_audio_type.getSelectedItem().toString()});
        }

        // umelec
        if (!"".equals(this.og_audio_artist.getText())) {
            this.meta.addTo("og_audio", new String[]{"artist", this.og_audio_artist.getText()});
        }

        // nazev
        if (!"".equals(this.og_audio_title.getText())) {
            this.meta.addTo("og_audio", new String[]{"title", this.og_audio_title.getText()});
        }

        // album
        if (!"".equals(this.og_audio_album.getText())) {
            this.meta.addTo("og_audio", new String[]{"height", this.og_audio_album.getText()});
        }

    }

    // zjisti zda-li jsou nastaveni boti + overeni
    public void checkBots() {
        // google overeni
        if (!"".equals(this.bots_google_auth.getText())) {
            this.meta.addTo("bots", new String[]{"google-site-verification", this.bots_google_auth.getText()});
        }

        // google both
        if (this.bots_google_snippet.getSelectedIndex() > 0 & this.bots_google_archive.getSelectedIndex() > 0) {
            this.meta.addTo("bots", new String[]{"googlebot", this.bots_google_snippet.getSelectedItem().toString() + "," + this.bots_google_archive.getSelectedItem().toString()});
        } else if (this.bots_google_snippet.getSelectedIndex() > 0) {
            this.meta.addTo("bots", new String[]{"googlebot", this.bots_google_snippet.getSelectedItem().toString()});
        } else if (this.bots_google_archive.getSelectedIndex() > 0) {
            this.meta.addTo("bots", new String[]{"googlebot", this.bots_google_archive.getSelectedItem().toString()});
        }

        // yahoo overeni
        if (!"".equals(this.bots_yahoo_auth.getText())) {
            this.meta.addTo("bots", new String[]{"y_key", this.bots_yahoo_auth.getText()});
        }
    }

    // zjisti zda-li jsou nastavene styly
    public void checkStyles() {
        // style 1
        if (!"".equals(this.styles_style1.getText())) {
            this.meta.addTo("styles", new String[]{this.styles_style1.getText(), this.styles_style1_media.getSelectedItem().toString()});
        }

        // style 2
        if (!"".equals(this.styles_style2.getText())) {
            this.meta.addTo("styles", new String[]{this.styles_style2.getText(), this.styles_style2_media.getSelectedItem().toString()});
        }

        // jQuery UI
        if (this.chbxs_jquery_ui.isSelected()) {
            this.meta.addTo("styles", new String[]{Styles.CDN_JQUERY_UI_REDMOND, "screen,tv,projection"});
        }
    }

    // zjisti zda-li jsou nastavene rss zdroje
    public void checkRss() {
        // zdroj 1
        if (!"".equals(this.rss_source1_url.getText())) {
            this.meta.addTo("rss", new String[]{this.rss_source1_title.getText(), this.rss_source1_url.getText()});
        }

        // zdroj 2
        if (!"".equals(this.rss_source2_url.getText())) {
            this.meta.addTo("rss", new String[]{this.rss_source2_title.getText(), this.rss_source2_url.getText()});
        }

        // zdroj 3
        if (!"".equals(this.rss_source3_url.getText())) {
            this.meta.addTo("rss", new String[]{this.rss_source3_title.getText(), this.rss_source3_url.getText()});
        }
    }

    // zjisti zda-li jsou nastavene scripty
    public void checkScripts() {
        // script 1
        if (!"".equals(this.scripts_script1.getText())) {

            this.meta.addTo("scripts", new String[]{"script", this.scripts_script1.getText()});
        }

        // jQuery GOOGLE
        if (this.chbx_jquery.isSelected()) {
            this.meta.addTo("scripts", new String[]{"script", Scripts.GOOGLE_JQUERY});
        }

        // jQuery CDN
        if (this.chbx_jquery_cdn.isSelected()) {
            this.meta.addTo("scripts", new String[]{"script", Scripts.CDN_JQUERY});
        }

        // jQueryUI GOOGLE
        if (this.chbx_jquery_ui.isSelected()) {
            this.meta.addTo("scripts", new String[]{"script", Scripts.GOOGLE_JQUERY_UI});
        }

        // jQueryUI CDN
        if (this.chbx_jquery_ui_cdn.isSelected()) {
            this.meta.addTo("scripts", new String[]{"script", Scripts.CDN_JQUERY_UI});
        }

        // Jquery Cycle
        if (this.chbx_jquery_cycle.isSelected()) {
            this.meta.addTo("scripts", new String[]{"script", Scripts.CDN_JQUERY_CYCLE});
        }

        // Jquery Validation
        if (this.chbx_jquery_validation.isSelected()) {
            this.meta.addTo("scripts", new String[]{"script", Scripts.CDN_JQUERY_VALIDATION});
        }

        // SWFObject
        if (this.chbx_swfobject.isSelected()) {
            this.meta.addTo("scripts", new String[]{"script", Scripts.GOOGLE_SWFOBJECT});
        }

        // MooTools
        if (this.chbx_mootools.isSelected()) {
            this.meta.addTo("scripts", new String[]{"script", Scripts.GOOGLE_MOOTOOLS});
        }

        // Prototype
        if (this.chbx_prototype.isSelected()) {
            this.meta.addTo("scripts", new String[]{"script", Scripts.GOOGLE_PROTOTYPE});
        }

        // Scriptaculous
        if (this.chbx_scriptaculous.isSelected()) {
            this.meta.addTo("scripts", new String[]{"script", Scripts.GOOGLE_SCRIPTACULOUS});
        }

        // YUI
        if (this.chbx_yui.isSelected()) {
            this.meta.addTo("scripts", new String[]{"script", Scripts.GOOGLE_YUI});
        }

        // WebFont Loader
        if (this.chbx_webfont.isSelected()) {
            this.meta.addTo("scripts", new String[]{"script", Scripts.GOOGLE_WEBFONT});
        }

        // Ext Core
        if (this.chbx_ext_core.isSelected()) {
            this.meta.addTo("scripts", new String[]{"script", Scripts.GOOGLE_EXT_CORE});
        }

        // Chrome Frame
        if (this.chbx_chrome_frame.isSelected()) {
            this.meta.addTo("scripts", new String[]{"script", Scripts.GOOGLE_CHROME_FRAME});
        }

        // Dojo
        if (this.chbx_dojo.isSelected()) {
            this.meta.addTo("scripts", new String[]{"script", Scripts.GOOGLE_DOJO});
        }

        // Google API
        if (this.chbx_google_api.isSelected()) {
            this.meta.addTo("scripts", new String[]{"script", Scripts.GOOGLE_JSAPI});
        }

        // Mapy.cz API
        if (this.chbx_mapy_api.isSelected()) {
            this.meta.addTo("scripts", new String[]{"script", Scripts.MAPY_CZ_API});
        }

        // Facebook API
        if (this.chbx_facebook_api.isSelected()) {
            this.meta.addTo("scripts", new String[]{"script", Scripts.FACEBOOK_API});
        }

        // Google Maps API
        if (this.chbx_google_maps_api.isSelected()) {
            this.meta.addTo("scripts", new String[]{"script", Scripts.GOOGLE_MAPS_API});
        }
    }

    // vraci favicon
    public Image getFavicon() {
        //Set the frame icon to an image loaded from a file.
        return new ImageIcon(getClass().getResource("/cz/jfx/jheadmet/resources/icon16x16.png")).getImage();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox bots_google_archive;
    private javax.swing.JTextField bots_google_auth;
    private javax.swing.JComboBox bots_google_snippet;
    private javax.swing.JTextField bots_yahoo_auth;
    private javax.swing.JCheckBox chbx_chrome_frame;
    private javax.swing.JCheckBox chbx_dojo;
    private javax.swing.JCheckBox chbx_ext_core;
    private javax.swing.JCheckBox chbx_facebook_api;
    private javax.swing.JCheckBox chbx_google_api;
    private javax.swing.JCheckBox chbx_google_maps_api;
    private javax.swing.JCheckBox chbx_jquery;
    private javax.swing.JCheckBox chbx_jquery_cdn;
    private javax.swing.JCheckBox chbx_jquery_cycle;
    private javax.swing.JCheckBox chbx_jquery_ui;
    private javax.swing.JCheckBox chbx_jquery_ui_cdn;
    private javax.swing.JCheckBox chbx_jquery_validation;
    private javax.swing.JCheckBox chbx_mapy_api;
    private javax.swing.JCheckBox chbx_mootools;
    private javax.swing.JCheckBox chbx_prototype;
    private javax.swing.JCheckBox chbx_scriptaculous;
    private javax.swing.JCheckBox chbx_swfobject;
    private javax.swing.JCheckBox chbx_webfont;
    private javax.swing.JCheckBox chbx_yui;
    private javax.swing.JCheckBox chbxs_jquery_ui;
    private javax.swing.JTabbedPane content;
    private javax.swing.JButton exit;
    private javax.swing.JButton generate;
    private javax.swing.ButtonGroup html_vs_xhtml;
    private javax.swing.JButton info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.ButtonGroup jQueryUI_group;
    private javax.swing.ButtonGroup jQuery_group;
    private javax.swing.JPanel menu;
    private javax.swing.JTextField meta_author;
    private javax.swing.JTextField meta_copyright;
    private javax.swing.JTextArea meta_description;
    private javax.swing.JScrollPane meta_description_area;
    private javax.swing.JTextField meta_keywords;
    private javax.swing.JTextField meta_title;
    private javax.swing.JTextField og_audio;
    private javax.swing.JTextField og_audio_album;
    private javax.swing.JTextField og_audio_artist;
    private javax.swing.JTextField og_audio_title;
    private javax.swing.JComboBox og_audio_type;
    private javax.swing.JTextField og_contact_email;
    private javax.swing.JTextField og_contact_fax;
    private javax.swing.JTextField og_contact_tel;
    private javax.swing.JTextArea og_description;
    private javax.swing.JScrollPane og_description_area;
    private javax.swing.JTextField og_id;
    private javax.swing.JComboBox og_id_type;
    private javax.swing.JTextField og_image;
    private javax.swing.JTextField og_location_city;
    private javax.swing.JTextField og_location_country_name;
    private javax.swing.JTextField og_location_latitude;
    private javax.swing.JTextField og_location_longitude;
    private javax.swing.JTextField og_location_postal_code;
    private javax.swing.JTextField og_location_region;
    private javax.swing.JTextField og_location_stree_address;
    private javax.swing.JTextField og_site_name;
    private javax.swing.JTextField og_title;
    private javax.swing.JComboBox og_type;
    private javax.swing.JTextField og_url;
    private javax.swing.JTextField og_video;
    private javax.swing.JTextField og_video_height;
    private javax.swing.JComboBox og_video_type;
    private javax.swing.JTextField og_video_width;
    private javax.swing.JPanel panel_bots;
    private javax.swing.JPanel panel_bots_google;
    private javax.swing.JPanel panel_bots_yahoo;
    private javax.swing.JTabbedPane panel_facebook;
    private javax.swing.JPanel panel_facebook_audio;
    private javax.swing.JPanel panel_facebook_contact;
    private javax.swing.JPanel panel_facebook_location;
    private javax.swing.JPanel panel_facebook_main;
    private javax.swing.JPanel panel_facebook_video;
    private javax.swing.JPanel panel_meta;
    private javax.swing.JPanel panel_rss;
    private javax.swing.JPanel panel_scripts;
    private javax.swing.JPanel panel_scripts_external;
    private javax.swing.JPanel panel_settings;
    private javax.swing.JPanel panel_styles;
    private javax.swing.JPanel panel_styles_external;
    private javax.swing.JTextField rss_source1_title;
    private javax.swing.JTextField rss_source1_url;
    private javax.swing.JTextField rss_source2_title;
    private javax.swing.JTextField rss_source2_url;
    private javax.swing.JTextField rss_source3_title;
    private javax.swing.JTextField rss_source3_url;
    private javax.swing.JTextField scripts_script1;
    private javax.swing.JComboBox settings_charset;
    private javax.swing.JComboBox settings_doctype;
    private javax.swing.JTextField settings_favicon;
    private javax.swing.JRadioButton settings_html;
    private javax.swing.JCheckBox settings_relative_path;
    private javax.swing.JCheckBox settings_skeleton;
    private javax.swing.JTextField settings_url;
    private javax.swing.JRadioButton settings_xhtml;
    private javax.swing.JPanel source1;
    private javax.swing.JPanel source2;
    private javax.swing.JPanel source3;
    private javax.swing.JTextField styles_style1;
    private javax.swing.JComboBox styles_style1_media;
    private javax.swing.JTextField styles_style2;
    private javax.swing.JComboBox styles_style2_media;
    // End of variables declaration//GEN-END:variables
}
