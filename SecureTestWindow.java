
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class SecureTestWindow extends JFrame {
//
//    private JPasswordField passwordField;
//    private JButton loginButton;
//    private JFrame testWindow;
//
//    public SecureTestWindow() {
//        super("Login");
//        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//        setResizable(false);
//
//        JPanel loginPanel = new JPanel(new GridLayout(2, 1));
//        passwordField = new JPasswordField();
//        loginButton = new JButton("Login");
//
//        loginPanel.add(new JLabel("Password:"));
//        loginPanel.add(passwordField);
//        loginPanel.add(loginButton);
//
//        add(loginPanel);
//        pack();
//        setLocationRelativeTo(null);
//        setVisible(true);
//
//        loginButton.addActionListener(e -> {
//            String password = new String(passwordField.getPassword());
//            if (isValidPassword(password)) {
//                dispose();
//                openTestWindow();
//            } else {
//                JOptionPane.showMessageDialog(this, "Incorrect password.", "Error", JOptionPane.ERROR_MESSAGE);
//                passwordField.setText("");
//                passwordField.requestFocus();
//            }
//        });
//
//        addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                JOptionPane.showMessageDialog(null, "Please login to proceed or contact the administrator", "Alert", JOptionPane.WARNING_MESSAGE);
//            }
//        });
//    }
//
//    private boolean isValidPassword(String password) {
//        return password.equals("cdac"); // Replace with secure password check (e.g., hash comparison)
//    }
//
//    private void openTestWindow() {
//        testWindow = new JFrame("Test Window");
//        testWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//        testWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        testWindow.setUndecorated(true);
//        testWindow.setResizable(false);
//
//        // Make the window topmost
//        testWindow.setAlwaysOnTop(true);
//
//        JLabel testLabel = new JLabel("Test in progress...");
//        testLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        testLabel.setFont(new Font("Arial", Font.BOLD, 24));
//        testWindow.add(testLabel, BorderLayout.CENTER);
//
//        int testDurationInSeconds = 15;
//        Timer timer = new Timer(testDurationInSeconds * 1000, e -> {
//            JOptionPane.showMessageDialog(testWindow, "Test time is up. Closing window.");
//            System.exit(0);
//        });
//        timer.setRepeats(false);
//        timer.start();
//
//        JButton exitButton = new JButton("Exit Test");
//        exitButton.addActionListener(e -> {
//            int confirm = JOptionPane.showConfirmDialog(testWindow, "Are you sure you want to exit the test?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
//            if (confirm == JOptionPane.YES_OPTION) {
//                timer.stop();
//                System.exit(0);
//            }
//        });
//
//        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
//        buttonPanel.add(exitButton);
//        testWindow.add(buttonPanel, BorderLayout.SOUTH);
//
//        testWindow.setVisible(true);
//        testWindow.setFocusable(true);
//        testWindow.requestFocusInWindow();
//
//        testWindow.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                JOptionPane.showMessageDialog(null, "You cannot exit the test like that", "Warning", JOptionPane.WARNING_MESSAGE);
//            }
//        });
//
//        // Disable keyboard shortcuts like Alt+Tab (not fully preventable in Java)
//        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(event -> {
//            if (event.getID() == KeyEvent.KEY_PRESSED) {
//                int keyCode = event.getKeyCode();
//                if (keyCode == KeyEvent.VK_TAB || keyCode == KeyEvent.VK_ALT || keyCode == KeyEvent.VK_F4) {
//                    return true; // Consume these events
//                }
//            }
//            return false;
//        });
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> new SecureTestWindow());
//    }
//}



//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class SecureTestWindow extends JFrame {
//
//    private JPasswordField passwordField;
//    private JButton loginButton;
//    private JFrame testWindow;
//
//    public SecureTestWindow() {
//        super("Login");
//        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//        setResizable(false);
//
//        JPanel loginPanel = new JPanel(new GridLayout(2, 1));
//        passwordField = new JPasswordField();
//        loginButton = new JButton("Login");
//
//        loginPanel.add(new JLabel("Password:"));
//        loginPanel.add(passwordField);
//        loginPanel.add(loginButton);
//
//        add(loginPanel);
//        pack();
//        setLocationRelativeTo(null);
//        setVisible(true);
//
//        loginButton.addActionListener(e -> {
//            String password = new String(passwordField.getPassword());
//            if (isValidPassword(password)) {
//                dispose();
//                openTestWindow();
//            } else {
//                JOptionPane.showMessageDialog(this, "Incorrect password.", "Error", JOptionPane.ERROR_MESSAGE);
//                passwordField.setText("");
//                passwordField.requestFocus();
//            }
//        });
//
//        addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                JOptionPane.showMessageDialog(null, "Please login to proceed or contact the administrator", "Alert", JOptionPane.WARNING_MESSAGE);
//            }
//        });
//    }
//
//    private boolean isValidPassword(String password) {
//        return password.equals("cdac"); // Replace with secure password check (e.g., hash comparison)
//    }
//
//    private void openTestWindow() {
//        testWindow = new JFrame("Test Window");
//        testWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//        testWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        testWindow.setUndecorated(true);
//        testWindow.setResizable(false);
//
//        JLabel testLabel = new JLabel("Test in progress...");
//        testLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        testWindow.add(testLabel);
//
//        int testDurationInSeconds = 15;
//        Timer timer = new Timer(testDurationInSeconds * 1000, e -> {
//            JOptionPane.showMessageDialog(testWindow, "Test time is up. Closing window.");
//            System.exit(0); // Or testWindow.dispose();
//        });
//        timer.setRepeats(false);
//        timer.start();
//
//        JButton exitButton = new JButton("Exit Test");
//        exitButton.addActionListener(e -> {
//            int confirm = JOptionPane.showConfirmDialog(testWindow, "Are you sure you want to exit the test?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
//            if (confirm == JOptionPane.YES_OPTION) {
//                timer.stop();
//                System.exit(0); // Or testWindow.dispose();
//            }
//        });
//
//        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
//        buttonPanel.add(exitButton);
//        testWindow.add(buttonPanel, BorderLayout.SOUTH);
//
//        testWindow.setVisible(true);
//        testWindow.setFocusable(true);
//        testWindow.requestFocusInWindow();
//
//        testWindow.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                JOptionPane.showMessageDialog(null, "You cannot exit the test like that", "Warning", JOptionPane.WARNING_MESSAGE);
//            }
//        });
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> new SecureTestWindow());
//    }
//}

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class SecureTestWindow extends JFrame {
//
//    private JPasswordField passwordField;
//    private JButton loginButton;
//    private JFrame testWindow; // The main test window
//
//    public SecureTestWindow() {
//        super("Login");
//        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Prevent closing directly
//        setResizable(false); // Prevent resizing
//
//        // Login Panel
//        JPanel loginPanel = new JPanel(new GridLayout(2, 1));
//        passwordField = new JPasswordField();
//        loginButton = new JButton("Login");
//
//        loginPanel.add(new JLabel("Password:"));
//        loginPanel.add(passwordField);
//        loginPanel.add(loginButton);
//
//        add(loginPanel);
//        pack();
//        setLocationRelativeTo(null); // Center the window
//        setVisible(true);
//
//        loginButton.addActionListener(e -> {
//            String password = new String(passwordField.getPassword());
//            if (isValidPassword(password)) {
//                dispose(); // Close the login window
//                openTestWindow();
//            } else {
//                JOptionPane.showMessageDialog(this, "Incorrect password.", "Error", JOptionPane.ERROR_MESSAGE);
//                passwordField.setText(""); // Clear the password field
//                passwordField.requestFocus(); // Set focus back to the password field
//            }
//        });
//
//        addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                // Do nothing on close attempt
//                JOptionPane.showMessageDialog(null, "Please login to proceed or contact the administrator", "Alert", JOptionPane.WARNING_MESSAGE);
//            }
//        });
//    }
//
//    private boolean isValidPassword(String password) {
//        // Replace with your actual password validation logic (e.g., compare with a stored hash)
//        return password.equals("correctPassword"); // Example: hardcoded password
//    }
//
//    private void openTestWindow() {
//        testWindow = new JFrame("Test Window");
//        testWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Prevent closing
//        testWindow.setExtendedState(JFrame.MAXIMIZED_BOTH); // Fullscreen
//        testWindow.setUndecorated(true); // Remove title bar and borders for maximum lockdown
//        testWindow.setResizable(false);
//        // Add your test content here (questions, timer, etc.)
//        JLabel testLabel = new JLabel("Test in progress...");
//        testLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        testWindow.add(testLabel);
//        testWindow.setVisible(true);
//
//        testWindow.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                JOptionPane.showMessageDialog(null, "You cannot exit the test like that", "Warning", JOptionPane.WARNING_MESSAGE);
//            }
//        });
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> new SecureTestWindow());
//    }
//}