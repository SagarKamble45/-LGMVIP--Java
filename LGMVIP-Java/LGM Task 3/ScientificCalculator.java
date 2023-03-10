
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class ScientificCalculator extends javax.swing.JFrame {

    double number1;
    double number2;
    String oparator;
    double result;

    public ScientificCalculator() {
        initComponents(); 
    }
    @SuppressWarnings("unchecked")
                           
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jTextDisplay = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        sqrt = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        backSpace = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        aSin = new javax.swing.JButton();
        log = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        acos = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        round = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        factorial = new javax.swing.JButton();
        floor = new javax.swing.JButton();
        ceil = new javax.swing.JButton();
        plusMinus = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
         jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jTextDisplay.setEditable(false);
        jTextDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDisplayActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        Clear.setText("C");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        sqrt.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        sqrt.setText("√");
        sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtActionPerformed(evt);
            }
        });

        plus.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        backSpace.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        backSpace.setText(" ");
        backSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backSpaceActionPerformed(evt);
            }
        });

        jbtn7.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn8.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn9.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        minus.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        jbtn4.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn5.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn6.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        multiply.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        multiply.setText("×");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        jbtn1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });
        jbtn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jbtn1KeyTyped(evt);
            }
        });

        jbtn2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn3.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        divide.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        divide.setText("÷");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        jbtn0.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtnDot.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jbtnDot.setText(".");
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });

        equal.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        sin.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        sin.setText("Sin");
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        aSin.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        aSin.setText("asin");
        aSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aSinActionPerformed(evt);
            }
        });

        log.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        log.setText("Log");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        cos.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        cos.setText("Cos");
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        acos.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        acos.setText("aCos");
        acos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acosActionPerformed(evt);
            }
        });

        pi.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        pi.setText("π");
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jButton14.setText("Tan");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jButton16.setText("aTan");
        jButton16.setToolTipText("");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jButton17.setText("2^n");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        round.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        round.setText("RND");
        round.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundActionPerformed(evt);
            }
        });

        mod.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        mod.setText("Mod");
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jButton28.setText("x^3");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        factorial.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        factorial.setText("n!");
        factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialActionPerformed(evt);
            }
        });

        floor.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        floor.setText("Floor");
        floor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floorActionPerformed(evt);
            }
        });

        ceil.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        ceil.setText("Ceil");
        ceil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceilActionPerformed(evt);
            }
        });

        plusMinus.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        plusMinus.setText("±");
        plusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusMinusActionPerformed(evt);
            }
        });

        jRadioButton2.setText("ON");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("OFF");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Scientific Mode");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jRadioButton2)
                .addGap(2, 2, 2)
                .addComponent(jRadioButton3))
            .addComponent(jTextDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(log)
                .addGap(6, 6, 6)
                .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(aSin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(cos)
                .addGap(6, 6, 6)
                .addComponent(acos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton17)
                .addGap(6, 6, 6)
                .addComponent(jButton14)
                .addGap(6, 6, 6)
                .addComponent(jButton16))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton28)
                .addGap(6, 6, 6)
                .addComponent(round, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jbtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(plusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(floor)
                .addGap(6, 6, 6)
                .addComponent(ceil, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {aSin, acos, ceil, cos, factorial, floor, jButton14, jButton16, jButton17, jButton28, log, mod, pi, round, sin});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(2, 2, 2)
                .addComponent(jTextDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aSin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(round, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(floor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceil, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {aSin, acos, ceil, cos, factorial, floor, jButton14, jButton16, jButton17, jButton28, log, mod, pi, round, sin});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           

        this.setResizable(true);
        this.setSize(250, 436);
    }                                          

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           

        this.setResizable(true);
        this.setSize(450, 436);
    }                                          

    private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     

        this.setResizable(true);
        this.setSize(450, 436);
        setLocationRelativeTo(null);//For Window Center
    }                                    

    private void jTextDisplayActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        this.setResizable(true);
        this.setSize(450, 436);

    }                                            

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {                                      

        String num = jTextDisplay.getText() + jbtn9.getText();
        jTextDisplay.setText(num);
    }                                     

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {                                      

        String num = jTextDisplay.getText() + jbtn7.getText();
        jTextDisplay.setText(num);

    }                                     

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {                                      

        String num = jTextDisplay.getText() + jbtn1.getText();
        jTextDisplay.setText(num);
    }                                     

    private void sqrtActionPerformed(java.awt.event.ActionEvent evt) {                                     
        try {
            double number = Double.parseDouble(String.valueOf(jTextDisplay.getText()));
            number = Math.sqrt(number);
            jTextDisplay.setText(String.valueOf(number));
        } catch (Exception ex) {
            jTextDisplay.setText(ex.getMessage());
        }
    }                                    

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {                                      

        String num = jTextDisplay.getText() + jbtn8.getText();
        jTextDisplay.setText(num);
    }                                     

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {                                      

        String num = jTextDisplay.getText() + jbtn4.getText();
        jTextDisplay.setText(num);
    }                                     

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {                                      

        String num = jTextDisplay.getText() + jbtn5.getText();
        jTextDisplay.setText(num);
    }                                     

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {                                      

        String num = jTextDisplay.getText() + jbtn6.getText();
        jTextDisplay.setText(num);
    }                                     

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {                                      

        String num = jTextDisplay.getText() + jbtn2.getText();
        jTextDisplay.setText(num);
    }                                     

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {                                      

        String num = jTextDisplay.getText() + jbtn3.getText();
        jTextDisplay.setText(num);
    }                                     

    private void jbtn1KeyTyped(java.awt.event.KeyEvent evt) {                               
        // TODO add your handling code here:
    }                              

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        //Display Clear
        jTextDisplay.setText("");
    }                                     

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        try {
            number1 = Double.parseDouble(jTextDisplay.getText());
            jTextDisplay.setText(null);
            oparator = "/";

        } catch (Exception ex) {
            jTextDisplay.setText(ex.getMessage());
        }
    }                                      

    private void backSpaceActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        try {
            String back = null;
            if (jTextDisplay.getText().length() > 0) {
                int ln = jTextDisplay.getText().length();
                StringBuilder sb = new StringBuilder(jTextDisplay.getText());
                sb.deleteCharAt(ln - 1);
                back = sb.toString();
                jTextDisplay.setText(back);
            }
        } catch (Exception ex) {
            jTextDisplay.setText(ex.getMessage());
        }
    }                                         

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:

        //Checking if not contain Dot(.)
        if (!jTextDisplay.getText().contains(".")) {
            jTextDisplay.setText(jTextDisplay.getText() + jbtnDot.getText());
        }
    }                                       

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        try {
            number1 = Double.parseDouble(jTextDisplay.getText());
            jTextDisplay.setText(null);
            oparator = "+";
        } catch (Exception ex) {
            jTextDisplay.setText(ex.getMessage());
        }

    }                                    

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        String num = jTextDisplay.getText() + jbtn0.getText();
        jTextDisplay.setText(num);
    }                                     

    private void ceilActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        try {
            double number = Double.parseDouble(String.valueOf(jTextDisplay.getText()));
            number = Math.ceil(number);
            jTextDisplay.setText(String.valueOf(number));
        } catch (Exception ex) {
            jTextDisplay.setText(ex.getMessage());
        }

    }                                    

    private void floorActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        try {
            double number = Double.parseDouble(String.valueOf(jTextDisplay.getText()));
            number = Math.floor(number);
            jTextDisplay.setText(String.valueOf(number));
        } catch (Exception ex) {
            jTextDisplay.setText(ex.getMessage());
        }

    }                                     

    private void factorialActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        try {
            double number = Double.parseDouble(String.valueOf(jTextDisplay.getText()));
            double sum = 1;
            while (number != 0) {
                sum = sum * number;
                number--;
            }
            jTextDisplay.setText(String.valueOf(sum));
        } catch (Exception ex) {
            jTextDisplay.setText(ex.getMessage());
        }

    }                                         

    private void modActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        try {
            number1 = Double.parseDouble(jTextDisplay.getText());
            jTextDisplay.setText(null);
            oparator = "%";
        } catch (Exception ex) {
            jTextDisplay.setText(ex.getMessage());
        }

    }                                   

    private void roundActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        try {
            double number = Double.parseDouble(jTextDisplay.getText());
            number = Math.round(number);
            jTextDisplay.setText(String.valueOf(number));
        } catch (Exception ex) {
            jTextDisplay.setText(ex.getMessage());
        }
    }                                     

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        try {
            double number = Double.parseDouble(String.valueOf(jTextDisplay.getText()));
            number = Math.pow(number, 3);
            jTextDisplay.setText(String.valueOf(number));
        } catch (Exception ex) {
            jTextDisplay.setText(ex.getMessage());
        }
    }                                         

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        try {
            double number = Double.parseDouble(String.valueOf(jTextDisplay.getText()));
            number = Math.atan(number);
            jTextDisplay.setText(String.valueOf(number));
        } catch (Exception ex) {
            jTextDisplay.setText(ex.getMessage());
        }
    }                                         

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        try {
            double number = Double.parseDouble(jTextDisplay.getText());
            number = Math.tan(number);
            jTextDisplay.setText(String.valueOf(number));
        } catch (Exception ex) {
            jTextDisplay.setText(ex.getMessage());
        }
    }                                         

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        try {
            double number = Double.parseDouble(jTextDisplay.getText());
            number = Math.pow(2, number);
            jTextDisplay.setText(String.valueOf(number));
        } catch (Exception ex) {
            jTextDisplay.setText(ex.getMessage());
        }

    }                                         

    private void acosActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        try {
            double number = Double.parseDouble(String.valueOf(jTextDisplay.getText()));
            number = Math.acos(number);
            jTextDisplay.setText(String.valueOf(number));
        } catch (Exception ex) {
            jTextDisplay.setText(ex.getMessage());
        }

    }                                    

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:\
        try {
            double number = Double.parseDouble(String.valueOf(jTextDisplay.getText()));
            number = Math.cos(number);
            jTextDisplay.setText(String.valueOf(number));
        } catch (Exception ex) {
            jTextDisplay.setText(ex.getMessage());
        }

    }                                   

    private void piActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        double number = Math.PI;
        jTextDisplay.setText(String.valueOf(number));

    }                                  

    private void aSinActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        try {
            double number = Double.parseDouble(String.valueOf(jTextDisplay.getText()));
            number = Math.asin(number);
            jTextDisplay.setText(String.valueOf(number));
        } catch (Exception ex) {
            jTextDisplay.setText(ex.getMessage());
        }

    }                                    

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        try {
            double number = Double.parseDouble(String.valueOf(jTextDisplay.getText()));
            number = Math.sin(number);
            jTextDisplay.setText(String.valueOf(number));
        } catch (Exception ex) {
            jTextDisplay.setText(ex.getMessage());
        }

    }                                   

    private void logActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        try {
            double number = Double.parseDouble(String.valueOf(jTextDisplay.getText()));
            number = Math.log(number);
            jTextDisplay.setText(String.valueOf(number));
        } catch (Exception ex) {
            jTextDisplay.setText(ex.getMessage());
        }

    }                                   

    private void plusMinusActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:ৎ
        try {
            double number = Double.parseDouble(String.valueOf(jTextDisplay.getText()));
            number = number * (-1);
            jTextDisplay.setText(String.valueOf(number));
        } catch (Exception ex) {
            jTextDisplay.setText(ex.getMessage());
        }
    }                                         

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        try {
            String ans;
            number2 = Double.parseDouble(jTextDisplay.getText());

            if (oparator == "+") {
                result = number1 + number2;
                ans = String.format("%.0f", result);
                jTextDisplay.setText(ans);
            } else if (oparator == "-") {
                result = number1 - number2;
                ans = String.format("%.0f", result);
                jTextDisplay.setText(ans);
            } else if (oparator == "*") {
                result = number1 * number2;
                ans = String.format("%.1f", result);
                jTextDisplay.setText(ans);

            } else if (oparator == "/") {
                result = number1 / number2;
                ans = String.format("%.2f", result);
                jTextDisplay.setText(ans);
            } else if (oparator == "%") {
                result = number1 % number2;
                ans = String.format("%.0f", result);
                jTextDisplay.setText(ans);
            }
        } catch (Exception ex) {
            jTextDisplay.setText(ex.getLocalizedMessage());
        }

    }                                     

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        try {
            number1 = Double.parseDouble(jTextDisplay.getText());
            jTextDisplay.setText(null);
            oparator = "-";
        } catch (Exception ex) {
            jTextDisplay.setText(ex.getMessage());
        }
    }                                     

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        try {
            number1 = Double.parseDouble(jTextDisplay.getText());
            jTextDisplay.setText(null);
            oparator = "*";
        } catch (Exception ex) {
            jTextDisplay.setText(ex.getMessage());
        }
    }                                        

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        jbtn0.setEnabled(true);
        jbtn1.setEnabled(true);
        jbtn2.setEnabled(true);
        jbtn3.setEnabled(true);
        jbtn4.setEnabled(true);
        jbtn5.setEnabled(true);
        jbtn6.setEnabled(true);
        jbtn7.setEnabled(true);
        jbtn8.setEnabled(true);
        jbtn9.setEnabled(true);
        backSpace.setEnabled(true);
        Clear.setEnabled(true);
        sqrt.setEnabled(true);
        plus.setEnabled(true);
        minus.setEnabled(true);
        divide.setEnabled(true);
        multiply.setEnabled(true);
        equal.setEnabled(true);
        plusMinus.setEnabled(true);
        jbtnDot.setEnabled(true);

        log.setEnabled(true);
        sin.setEnabled(true);
        aSin.setEnabled(true);
        pi.setEnabled(true);
        cos.setEnabled(true);
        acos.setEnabled(true);
        jButton17.setEnabled(true);
        jButton16.setEnabled(true);
        jButton14.setEnabled(true);
        jbtn1.setEnabled(true);
        jButton28.setEnabled(true);
        mod.setEnabled(true);
        round.setEnabled(true);
        factorial.setEnabled(true);
        floor.setEnabled(true);
        ceil.setEnabled(true);


    }                                             

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:

        jTextDisplay.setText(null);
        jbtn0.setEnabled(false);
        jbtn1.setEnabled(false);
        jbtn2.setEnabled(false);
        jbtn3.setEnabled(false);
        jbtn4.setEnabled(false);
        jbtn5.setEnabled(false);
        jbtn6.setEnabled(false);
        jbtn7.setEnabled(false);
        jbtn8.setEnabled(false);
        jbtn9.setEnabled(false);
        backSpace.setEnabled(false);
        Clear.setEnabled(false);
        sqrt.setEnabled(false);
        plus.setEnabled(false);
        minus.setEnabled(false);
        divide.setEnabled(false);
        multiply.setEnabled(false);
        equal.setEnabled(false);
        plusMinus.setEnabled(false);
        jbtnDot.setEnabled(false);

        log.setEnabled(false);
        sin.setEnabled(false);
        aSin.setEnabled(false);
        pi.setEnabled(false);
        cos.setEnabled(false);
        acos.setEnabled(false);
        jButton17.setEnabled(false);
        jButton16.setEnabled(false);
        jButton14.setEnabled(false);
        jbtn1.setEnabled(false);
        jButton28.setEnabled(false);
        mod.setEnabled(false);
        round.setEnabled(false);
        factorial.setEnabled(false);
        floor.setEnabled(false);
        ceil.setEnabled(false);


    }                                                                                      

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        System.exit(0);

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
            java.util.logging.Logger.getLogger(ScientificCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScientificCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScientificCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScientificCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScientificCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Clear;
    private javax.swing.JButton aSin;
    private javax.swing.JButton acos;
    private javax.swing.JButton backSpace;
    private javax.swing.JButton ceil;
    private javax.swing.JButton cos;
    private javax.swing.JButton divide;
    private javax.swing.JButton equal;
    private javax.swing.JButton factorial;
    private javax.swing.JButton floor;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton28;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextDisplay;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton log;
    private javax.swing.JButton minus;
    private javax.swing.JButton mod;
    private javax.swing.JButton multiply;
    private javax.swing.JButton pi;
    private javax.swing.JButton plus;
    private javax.swing.JButton plusMinus;
    private javax.swing.JButton round;
    private javax.swing.JButton sin;
    private javax.swing.JButton sqrt;
    // End of variables declaration                   
}