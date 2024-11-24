/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuaca;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.json.JSONObject;
import org.json.JSONArray;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author ACER
 * 
 */
public class Cuaca extends javax.swing.JFrame {
    private final String API_KEY = "5f2e789bb9995298248f880da9cf06b3"; 
//    private final HashMap<String, double[]> cityCoordinates = new HashMap<>();
    private static final String WEATHER_API_URL = "https://api.openweathermap.org/data/2.5/weather";
    private static final String FORECAST_API_URL = "https://api.openweathermap.org/data/2.5/forecast";
public Cuaca() {
        System.setProperty("https.protocols", "TLSv1.2");
        
        initComponents();
        
        setIconColumnRenderer();
        forecastTable.getColumnModel().getColumn(0).setPreferredWidth(50);        
        forecastTable.getColumnModel().getColumn(1).setPreferredWidth(15);
        forecastTable.getColumnModel().getColumn(2).setPreferredWidth(15);
        forecastTable.getColumnModel().getColumn(3).setPreferredWidth(20);
        
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        b1 = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        forecastTable = new javax.swing.JTable();
        btnBukaData = new javax.swing.JButton();
        btnSimpanData = new javax.swing.JButton();
        l4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CUACA");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(650, 650));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 255, 153));
        jPanel1.setNextFocusableComponent(cb1);
        jPanel1.setPreferredSize(new java.awt.Dimension(644, 677));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RAMALAN CUACA");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 153, 153), null, null));

        l1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l1.setText("Pilih Kota:");

        cb1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banjarmasin", "Banjarbaru", "Martapura", "Pelaihari", "Kandangan", "Barabai", "Amuntai", "Tanjung", "Marabahan", "Rantau" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        b1.setText("Lihat Cuaca");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        l2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        l2.setText("Cuaca Sekarang:");

        l3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        l3.setText("Pilih Kota Terlebih Dahulu");

        forecastTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        forecastTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Waktu", "Temperatur", "Keterangan", "Ikon Cuaca"
            }
        ));
        forecastTable.setMinimumSize(new java.awt.Dimension(60, 20));
        forecastTable.setRowHeight(100);
        jScrollPane1.setViewportView(forecastTable);

        btnBukaData.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnBukaData.setText("Buka Data");
        btnBukaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBukaDataActionPerformed(evt);
            }
        });

        btnSimpanData.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnSimpanData.setText("Simpan Data");
        btnSimpanData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanDataActionPerformed(evt);
            }
        });

        l4.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        l4.setText("Ramalan Cuaca :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b1))
                            .addComponent(l1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(l2)
                                .addGap(18, 18, 18)
                                .addComponent(l3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(btnBukaData)
                        .addGap(18, 18, 18)
                        .addComponent(btnSimpanData))
                    .addComponent(l4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(l1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(cb1))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l2)
                    .addComponent(l3))
                .addGap(63, 63, 63)
                .addComponent(l4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBukaData, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpanData, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(185, 185, 185))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        String selectedCity = (String) cb1.getSelectedItem();
          
        fetchCurrentWeather(selectedCity);                
        fetchHourlyForecast(selectedCity);

    }//GEN-LAST:event_b1ActionPerformed

    private void btnBukaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBukaDataActionPerformed
        openForecastDataFromCSV();
    }//GEN-LAST:event_btnBukaDataActionPerformed

    private void btnSimpanDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanDataActionPerformed
        saveForecastDataToCSV();
    }//GEN-LAST:event_btnSimpanDataActionPerformed

    
    private void fetchCurrentWeather(String city) {
        try {
            String apiUrl = WEATHER_API_URL + "?q=" + city + "&appid=" + API_KEY + "&units=metric&lang=id";
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();
                conn.disconnect();

                JSONObject json = new JSONObject(content.toString());
                double temp = json.getJSONObject("main").getDouble("temp");
                String description = json.getJSONArray("weather").getJSONObject(0).getString("description");
                String iconCode = json.getJSONArray("weather").getJSONObject(0).getString("icon");

                l2.setText("Sekarang: " + temp + "°C, " + description);
                String iconCurrentURL = "https://lumnaphoto.com/irhash-api/weather/"+ iconCode +"@2x.png";
//                JLabel weatherIcon = new JLabel();
                l3.setText("");
                l3.setIcon(new ImageIcon(new URL(iconCurrentURL)));
//                JLabel iconLabel = new JLabel(icon);

            } else {
                JOptionPane.showMessageDialog(this, "Tidak dapat mengambil data cuaca", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void fetchHourlyForecast(String city) {
        try {
            // Gantikan dengan API key Anda
            String apiKey = "5f2e789bb9995298248f880da9cf06b3";
            String urlString = String.format(
                "https://api.openweathermap.org/data/2.5/forecast?q=%s&appid=%s&units=metric&lang=id",
                city, apiKey
            );

            StringBuilder sb;
            try (InputStream is = new URL(urlString).openStream()) {
                sb = new StringBuilder();
                int byteRead;
                while ((byteRead = is.read()) != -1) {
                    sb.append((char) byteRead);
                }
            }

            // Parse JSON respons
            JSONObject jsonResponse = new JSONObject(sb.toString());
            JSONArray hourlyForecast = jsonResponse.getJSONArray("list");

            // Ambil model tabel yang sudah ada
            DefaultTableModel model = (DefaultTableModel) forecastTable.getModel();
            model.setRowCount(0); // Hapus semua data lama di tabel
            
            // Iterasi data prakiraan cuaca (misalnya, untuk 8 interval ke depan)
            for (int i = 0; i < 12; i++) {
                JSONObject forecast = hourlyForecast.getJSONObject(i);

                // Ambil waktu, suhu, dan deskripsi cuaca
                String dateTime = forecast.getString("dt_txt");
                String[] parts = dateTime.split(" ");
                String datePart = parts[0]; // "2024-11-15"
                String timePart = parts[1]; // "19:00:00"
                
                SimpleDateFormat inputDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat outputDateFormat = new SimpleDateFormat("dd MMM yyyy");
                Date date = inputDateFormat.parse(datePart);
                String formattedDate = outputDateFormat.format(date); // "15 Nov 2024"

                // Ubah format waktu
                SimpleDateFormat inputTimeFormat = new SimpleDateFormat("HH:mm:ss");
                SimpleDateFormat outputTimeFormat = new SimpleDateFormat("HH:mm");
                Date time = inputTimeFormat.parse(timePart);
                String formattedTime = outputTimeFormat.format(time); // "19:00"

                // Gabungkan hasilnya
                String formattedDateTime = formattedDate + " - " + formattedTime; // "15 Nov 2024 - 19:00"

                // Debug atau tambahkan ke GUI
                System.out.println(formattedDateTime);
                
                double temperature = forecast.getJSONObject("main").getDouble("temp");
                String description = forecast.getJSONArray("weather").getJSONObject(0).getString("description");
                String iconCode = forecast.getJSONArray("weather").getJSONObject(0).getString("icon");
                String iconUrl = "https://lumnaphoto.com/irhash-api/weather/" + iconCode + "@2x.png";

                // Tambahkan baris ke tabel
                model.addRow(new Object[]{formattedDateTime, temperature + "°C", description, new ImageIcon(new URL(iconUrl))});
                
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal mendapatkan data cuaca.");
        }
    }

    private void setIconColumnRenderer() {
        TableColumn iconColumn = forecastTable.getColumnModel().getColumn(3); // Kolom untuk ikon
        iconColumn.setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                // Jika nilai adalah ImageIcon, tampilkan ikon
                if (value instanceof ImageIcon) {
                    JLabel label = new JLabel((ImageIcon) value);
                    label.setHorizontalAlignment(JLabel.CENTER); // Pusatkan ikon
                    return label;
                }
                // Jika tidak, tampilkan teks default
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }
        });
        
    }

    private void saveForecastDataToCSV() {
        try {
            // Pilih file untuk menyimpan
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showSaveDialog(this);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                if (!file.getName().endsWith(".csv")) {
                    file = new File(file.getAbsolutePath() + ".csv");
                }

                // FileWriter untuk menulis CSV
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                // Menulis header
                bufferedWriter.write("Tanggal dan Waktu,Temperature,Deskripsi\n");

                // Ambil data dari tabel
                DefaultTableModel model = (DefaultTableModel) forecastTable.getModel();
                for (int row = 0; row < model.getRowCount(); row++) {
                    String dateTime = (String) model.getValueAt(row, 0);
                    String temperature = (String) model.getValueAt(row, 1);
                    String description = (String) model.getValueAt(row, 2);
                    bufferedWriter.write(dateTime + "," + temperature + "," + description + "\n");
                }

                bufferedWriter.close();
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke CSV!");
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan data.");
        }
    }
    
    private void openForecastDataFromCSV() {
        try {
            // Pilih file untuk dibuka
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(this);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();

                // FileReader untuk membaca CSV
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                DefaultTableModel model = (DefaultTableModel) forecastTable.getModel();

                // Kosongkan tabel sebelum mengisi data baru
                model.setRowCount(0);

                // Lewati header CSV
                bufferedReader.readLine();

                // Membaca baris per baris
                while ((line = bufferedReader.readLine()) != null) {
                    String[] data = line.split(",");
                    String dateTime = data[0];
                    String temperature = data[1];
                    String description = data[2];

                    // Menambahkan data ke dalam tabel
                    model.addRow(new Object[]{dateTime, temperature, description});
                }

                bufferedReader.close();
                JOptionPane.showMessageDialog(this, "Data berhasil dimuat dari CSV!");
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat membuka file.");
        }
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
            java.util.logging.Logger.getLogger(Cuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuaca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton btnBukaData;
    private javax.swing.JButton btnSimpanData;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JTable forecastTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    // End of variables declaration//GEN-END:variables
}
