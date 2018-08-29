
package Main;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.ParseException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * The code provides a way to calculate to calculate a money to be paid for a specific time taken by a user in  the shop. 
 * 
 * This class will facilitate functions defined in its self and also in two 
 * other classes namely CalculatMain and the other Calculator.
 * The code provide a way to select an entry time and an exit time. Then 
 * calculate the difference between the two times and tell the user how much to pay.
 * Provide a way for the user to enter any denomination (valid SA currency) and any 
 * amount of that denomination as payment, e.g.
·         R 0,50  Quantity [20]

·         R 1,00  Quantity [ 1]

·         R 2,00  Quantity [ 0]

·         etc.
 *The program then calculates the change the user must get. Display the change, as well
 * as the denominations that the change will be paid out in. The change should be optimized
 * e.g. 1 x R 2,00 instead of 4 x R 0,50. If 5 hours are calculated then the fee is R 11,00 
 * and the change for R 50,00 will be R 39,00 (1 x R20 + 1 x R10 + 1 x R5 + 2 x R2)
 * 
 * @Limmits  : The code have limits as it does not support coins less than 10cents , there was not enough time to complete the code so I assumes that the parking will only take place in one day.
 * 
 * @author Sinikiwe Nangoku Jumba
 * @version 0.00, 07 Dec 2017
 */
public class ParkCalculator extends javax.swing.JFrame {
    /*
    
     **/
    String EntryTime ; // 
    String EndTime ;
    Object ObjEntryTime ; //
    Object ObjEndTime ; //
    String Change ;  //
    double Payment ; //
    int Hour ; //
    double AmountTendered ;
    String FileName = "out.txt";
    private long [] Arr = new long[4];
    
    /*
     * Creates new form ParkCalculator and it was genrated by netbeans.
     *
     * @param there is no parameter
     * @see ParkClalculator
     * @deprecated
     * @since version 0.00
     
     */
    public ParkCalculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton14 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        Administration = new javax.swing.JButton();
        Price = new javax.swing.JButton();
        TenCent = new javax.swing.JButton();
        TwentyCent = new javax.swing.JButton();
        FiftyCent = new javax.swing.JButton();
        OneRand = new javax.swing.JButton();
        TwoRand = new javax.swing.JButton();
        FiveRand = new javax.swing.JButton();
        TenRand = new javax.swing.JButton();
        TwentyRand = new javax.swing.JButton();
        FifttyRand = new javax.swing.JButton();
        OneHundrand = new javax.swing.JButton();
        TwoHundrad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        OutPut = new javax.swing.JTextArea();
        Cancel = new javax.swing.JButton();
        Done = new javax.swing.JButton();
        ChangeRequest = new javax.swing.JButton();
        Entry = new javax.swing.JComboBox<>();
        End = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jButton14.setText("jButton14");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setText("Output Screen");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton15.setText("jButton15");

        jTextField2.setText("START TIME");

        jTextField3.setText("END TIME");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 9, 240));

        Administration.setBackground(new java.awt.Color(51, 204, 255));
        Administration.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Administration.setText("ADMIN");
        Administration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministrationActionPerformed(evt);
            }
        });

        Price.setBackground(new java.awt.Color(255, 204, 255));
        Price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Price.setForeground(new java.awt.Color(0, 0, 255));
        Price.setText("PRICE");
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        TenCent.setText("10cents");
        TenCent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenCentActionPerformed(evt);
            }
        });

        TwentyCent.setText("20cents");
        TwentyCent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwentyCentActionPerformed(evt);
            }
        });

        FiftyCent.setText("50cents");
        FiftyCent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiftyCentActionPerformed(evt);
            }
        });

        OneRand.setText("R1");
        OneRand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneRandActionPerformed(evt);
            }
        });

        TwoRand.setText("R2");
        TwoRand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoRandActionPerformed(evt);
            }
        });

        FiveRand.setText("R5");
        FiveRand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiveRandActionPerformed(evt);
            }
        });

        TenRand.setText("R10");
        TenRand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenRandActionPerformed(evt);
            }
        });

        TwentyRand.setText("R20");
        TwentyRand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwentyRandActionPerformed(evt);
            }
        });

        FifttyRand.setText("R50");
        FifttyRand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FifttyRandActionPerformed(evt);
            }
        });

        OneHundrand.setText("R100");
        OneHundrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneHundrandActionPerformed(evt);
            }
        });

        TwoHundrad.setText("200");
        TwoHundrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoHundradActionPerformed(evt);
            }
        });

        OutPut.setColumns(20);
        OutPut.setRows(5);
        OutPut.setText("OUTPUT SCREEN");
        jScrollPane1.setViewportView(OutPut);

        Cancel.setBackground(new java.awt.Color(255, 51, 0));
        Cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cancel.setForeground(new java.awt.Color(51, 51, 51));
        Cancel.setText("CANCEL");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        Done.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Done.setForeground(new java.awt.Color(0, 153, 0));
        Done.setText("DONE");
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });

        ChangeRequest.setBackground(new java.awt.Color(0, 0, 0));
        ChangeRequest.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ChangeRequest.setText("Change");
        ChangeRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeRequestActionPerformed(evt);
            }
        });

        Entry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entry Time", "00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00" }));

        End.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "End Time", "00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00" }));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("       Parking Calculator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TwentyRand, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ChangeRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(OneHundrand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Cancel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(TenRand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Done, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(FifttyRand, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(Administration, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(18, 18, 18)
                                            .addComponent(TwoHundrad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(OneRand, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(FiveRand, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(TwoRand, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(TenCent, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(FiftyCent, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(TwentyCent, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(Entry, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(207, 207, 207)
                                        .addComponent(End, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(76, 76, 76)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(End, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Entry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Price)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TenCent)
                    .addComponent(FiftyCent)
                    .addComponent(TwentyCent))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TwoRand)
                    .addComponent(FiveRand)
                    .addComponent(OneRand))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TenRand)
                    .addComponent(FifttyRand)
                    .addComponent(TwoHundrad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OneHundrand)
                    .addComponent(ChangeRequest)
                    .addComponent(TwentyRand))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Administration)
                    .addComponent(Done)
                    .addComponent(Cancel))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     *
     * ActionPerformed method.
     * <br />
     * This method however is not being used in our program but it can be used in the future.
     *
     * @param evt is an action listner that takes what ever information that is 
     * being typed in the textArea being used in the GUI,
     * @see MyClass
     * @deprecated
     * @since version 0.00
     */
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
        
    }//GEN-LAST:event_jTextField1ActionPerformed
/**
     *
     * ActionPerformed method.
     * <br />
     * This method is controlled by the Done button in the GUI, it write all the
     * necessary information into a file. It designed in a way that it is pressed 
     * after the user have entered the denomination it is gonna use to pay for it 
     * parking.
     * 
     * @param evt is an actionEvent which means it takes the command being issued by the button.
     *
     * @since version 0.00
     */
    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
      
        Calculator Object = new Calculator();
        /*
         *The folllowing variable specifies the format the information have to written in a file for the Administration purposes 
         */
        String Heading = " [Start time]  [End time] – [Time spent in shop] – [Fee] – [Amount tendered] – [Change]" ;
        // PrintWriter will defines and initialises a variable that will used to open , write and close a File. 
        PrintWriter OutputStream = null ;
        String FileName = "out.txt";
        
        try{
           
            OutputStream = new PrintWriter(FileName);
            JOptionPane.showMessageDialog(null,"Amount Tendered : " + AmountTendered);
            int HeadingCounter = 0;
            if(HeadingCounter == 0){
                    OutputStream.println(Heading);
            }
            if(AmountTendered == 0){ /* if the AmountTendered is Zero means that the user have not yet entered the type of valid 
                coins or#and notes it gonna use to pay.*/
                        JOptionPane.showMessageDialog(null,"Enter money to pay first before you press DONE");
            }else{
                        //writting into the file
                         OutputStream.println(EntryTime + " \t " + EndTime + " \t " + Hour + " \t " + Payment + " \t " + AmountTendered + " \t) " + (AmountTendered-Payment));
                        JOptionPane.showMessageDialog(null,"Details have been written succesfully into a file :) ");
                    }
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error : Could not open the file "+ FileName);
        }
       
        OutputStream.close();
        
    }//GEN-LAST:event_DoneActionPerformed
/**
     *
     * AdministrationActionPerformed method.
     * <br />
     * The method this will be invoked when the ADMIN button is being pressed, 
     * Admin button allows a user to recalls all previous transactions and displays the data on the form in the following format:
       [Start time] – [End time] – [Time spent in shop] – [Fee] – [Amount tendered] – [Change] by reading a file and copy the information on the JtextTextArea.
     * @param evt is an actionEvent which means it takes the command being issued by the button.
     * @since version 000
     */
    private void AdministrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministrationActionPerformed
        Scanner inputStream = null;
        try{
            inputStream = new Scanner(new FileInputStream(FileName)); // openning a file
            while(inputStream.hasNextLine()){ // while there is still a content we the code must keep reading..
                String Line = inputStream.nextLine();
                OutPut.append( Line + "\n"); //OutPut is avariable name of the textArea in GUI, in this part we are appending information into the textArea.
            }
            inputStream.close();
            
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"Could not find the file " + FileName);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, " Error : The was a problem with the input inside the file " + FileName);
        }
        
        
    }//GEN-LAST:event_AdministrationActionPerformed
/**
     *
     * CancelActionPerformed method.
     * <br />
     * The method Cancels the information already  entered as the denomination just in the case 
     * a user makes an error it gives a user a chance to re-enter the denominations 
     *
     * @param evt is an actionEvent which means it takes the command being issued by the button.
     * @see MyClass
     * @deprecated
     * @since version 0.00
     */
    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        
         AmountTendered = 0;
         
         JOptionPane.showMessageDialog(null, "Amount tendered have been cancelled, Re-enter it from the start ! ");
    }//GEN-LAST:event_CancelActionPerformed
/**
     *
     * PriceActionPerformed method.
     * <br />
     * The method is suppose to be pressed after the Entry Time and End Time have been
     * provided by a user, then this button will calculate the money that is suppose to
     * be payed by a user for using organisationz's parking.
     *
     * @param evt is an actionEvent which means it takes the command being issued by the button.
     * @see MyClass
     * @deprecated
     * @since version 1.00
     */
    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
       
        AmountTendered = 0; /*Every time the user press Price it is assumed that its starting a 
        new proccess hence we delete the existing values. */
        
        Change = " ";/*Every time the user press Price it is assumed that its starting a 
        new proccess hence we delete the existing values. */
        
        CalculatorMain MainObject = new CalculatorMain(); ///Object to access methods in CalculationMain Class
        Calculator Object = new Calculator(); ///Object to access methods in Calculation Class
     
        try{
                    ObjEntryTime = Entry.getSelectedItem();  // geting data from the GUI (Entry Time)
                    EntryTime = ObjEntryTime.toString(); // prepare Object time to be used as a String later on
                    ObjEndTime = End.getSelectedItem(); // geting data from the GUI (Entry Time)
                    EndTime = ObjEndTime.toString();  // prepare Object time to be used as a String later on
                   
                    if(EntryTime.equals("Entry Time") | EndTime.equals("End Time")){ /*Handling an error where a user did not provide Time */
                        
                        JOptionPane.showMessageDialog(null, "replace the filds in your drop box first, chenck your Input and try again !!");
                    }else{
                        //JOptionPane.showMessageDialog(null, "Price button work");
                        Arr = Object.TimeDifference("01/14/2012 " + EntryTime, "01/14/2012 " + EndTime);
                        Hour = (int) Arr[2]; //Arr[2] is a Hour 
                        Payment = MainObject.DueBalance(Hour); //see class calculatorMain
                        
                        if(Payment >= 1 ){
                                JOptionPane.showMessageDialog(null,"If you Parked for " + Hour + " hours you will pay R" + Payment);
                        
                        }else{
                                JOptionPane.showMessageDialog(null,"If you stayed for " + Hour + " hours you will pay " +Payment + "Cents");
                        }
                       // OutPut.append("If you stayed for " + Hour + " you will pay " + Payment);
                        
                    }
                    
        }catch(ParseException e){
        
        
        }
    }//GEN-LAST:event_PriceActionPerformed
/**
     *
     * TenCentActionPerformed method.
     * <br />
     * The method keeps adding 10cents everytime a user presses the 10cents Button on the GUI. 
     *
     * @param evt is an actionEvent which means it takes the command being issued by the button.
     
     * @since version 0.00
     */
    private void TenCentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenCentActionPerformed
        
        AmountTendered += 0.10 ;
    }//GEN-LAST:event_TenCentActionPerformed
/**
     *
     * TwentyCentActionPerformed method.
     * <br />
     * The method keeps adding 50cents everytime a user presses the 10cents Button on the GUI. 
     *
     * @param message String variable to be printed
     * @see MyClass
     * @deprecated
     * @since version 1.00
     */
    private void FiftyCentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiftyCentActionPerformed
        
         AmountTendered += 0.5 ;
    }//GEN-LAST:event_FiftyCentActionPerformed
/**
     *
     * TwentyCentActionPerformed method.
     * <br />
     * The method keeps adding 20cents everytime a user presses the 10cents Button on the GUI. 
     *
     * @param message String variable to be printed
     * @see MyClass
     * @deprecated
     * @since version 1.00
     */
    private void TwentyCentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwentyCentActionPerformed
        
         AmountTendered += 0.2 ;
    }//GEN-LAST:event_TwentyCentActionPerformed
/**
     *
     * OneRandActionPerformed method.
     * <br />
     * The method keeps adding R1 everytime a user presses the 10cents Button on the GUI. 
     *
     * @param message String variable to be printed
     * @see MyClass
     * @deprecated
     * @since version 1.00
     */
    private void OneRandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneRandActionPerformed
        
         AmountTendered += 1 ;
    }//GEN-LAST:event_OneRandActionPerformed
/**
     *
     * FiveRandActionPerformed method.
     * <br />
     * The method keeps adding R5 everytime a user presses the 10cents Button on the GUI. 
     *
     * @param message String variable to be printed
     * @see MyClass
     * @deprecated
     * @since version 1.00
     */
    private void FiveRandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiveRandActionPerformed
        
         AmountTendered += 50 ;
    }//GEN-LAST:event_FiveRandActionPerformed
/**
     *
    * TwoRandActionPerformed method.
     * <br />
     * The method keeps adding R2 everytime a user presses the 10cents Button on the GUI. 
     *
     * @param message String variable to be printed
     * @see MyClass
     * @deprecated
     * @since version 1.00
     */
    private void TwoRandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoRandActionPerformed
        
         AmountTendered += 2 ;
    }//GEN-LAST:event_TwoRandActionPerformed
/**
     *
     * TenRandActionPerformed method.
     * <br />
     * The method keeps adding R10 everytime a user presses the 10cents Button on the GUI. 
     *
     * @param message String variable to be printed
     * @see MyClass
     * @deprecated
     * @since version 1.00
     */
    private void TenRandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenRandActionPerformed
        
         AmountTendered += 10 ;
    }//GEN-LAST:event_TenRandActionPerformed
/**
     *
     * FifttyRandActionPerformed method.
     * <br />
     * The method keeps adding R50 everytime a user presses the 10cents Button on the GUI. 
     *
     * @param message String variable to be printed
     * @see MyClass
     * @deprecated
     * @since version 1.00
     */
    private void FifttyRandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FifttyRandActionPerformed
        
         AmountTendered += 50 ;
    }//GEN-LAST:event_FifttyRandActionPerformed
/**
     *
     TwoHundradActionPerformed
     * <br />
     * The method keeps adding R200 everytime a user presses the 10cents Button on the GUI. 
     *
     * @param message String variable to be printed
     * @see MyClass
     * @deprecated
     * @since version 1.00
     */
    private void TwoHundradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoHundradActionPerformed
       
         AmountTendered += 200 ;
    }//GEN-LAST:event_TwoHundradActionPerformed
/**
     *
     * TwentyRandActionPerformed method.
     * <br />
     * The method keeps adding R20 everytime a user presses the 10cents Button on the GUI. 
     *
     * @param message String variable to be printed
     * @see MyClass
     * @deprecated
     * @since version 1.00
     */
    private void TwentyRandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwentyRandActionPerformed
        
         AmountTendered += 20 ;
    }//GEN-LAST:event_TwentyRandActionPerformed
/**
     *
     * OneHundrandActionPerformed method.
     * <br />
     * The method keeps adding R100 everytime a user presses the 10cents Button on the GUI. 
     *
     * @param message String variable to be printed
     * @see MyClass
     * @deprecated
     * @since version 1.00
     */
    private void OneHundrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneHundrandActionPerformed
       
         AmountTendered += 100 ;
    }//GEN-LAST:event_OneHundrandActionPerformed
/**
     *
     * SChangeRequestActionPerformed method.
     * <br />
     * The method keeps adding R200 everytime a user presses the 10cents Button on the GUI. 
     *
     * @param message String variable to be printed
     * @see MyClass
     * @deprecated
     * @since version 1.00
     */
    private void ChangeRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeRequestActionPerformed
        
         Calculator Object = new Calculator();
         Change = Object.CalculateChange(AmountTendered-Payment);
         JOptionPane.showMessageDialog(null, Change);
        
    }//GEN-LAST:event_ChangeRequestActionPerformed

    /**
     *
     * Simple method.
     * <br />
     * The method is called main it is responsible of giving the overall of the program 
     * including methods assciated with it in various classes 
     * @param args is a command line argument that help us to communicate with the terminal
     * @since version 1.00
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        double [] SouthAfricanCoins = {0.1 , 0.2 ,0.5 , 1.0, 2.0 ,5.0,10.0 ,20.0, 50.0, 100.0 , 200.0};
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ParkCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParkCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParkCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParkCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParkCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Administration;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton ChangeRequest;
    private javax.swing.JButton Done;
    private javax.swing.JComboBox<String> End;
    private javax.swing.JComboBox<String> Entry;
    private javax.swing.JButton FifttyRand;
    private javax.swing.JButton FiftyCent;
    private javax.swing.JButton FiveRand;
    private javax.swing.JButton OneHundrand;
    private javax.swing.JButton OneRand;
    private javax.swing.JTextArea OutPut;
    private javax.swing.JButton Price;
    private javax.swing.JButton TenCent;
    private javax.swing.JButton TenRand;
    private javax.swing.JButton TwentyCent;
    private javax.swing.JButton TwentyRand;
    private javax.swing.JButton TwoHundrad;
    private javax.swing.JButton TwoRand;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
