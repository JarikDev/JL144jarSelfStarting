public class Hello {

    public static void main(String[] args) {
        javax.swing.JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());
    }

    static javax.swing.JFrame getFrame() {
        javax.swing.JFrame jFrame = new javax.swing.JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
        java.awt.Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 500);
        return jFrame;

    }

    static class MyComponent extends javax.swing.JComponent {


        @Override
        public void paint(java.awt.Graphics g) {
            g.setFont(new java.awt.Font("TimesRoman", java.awt.Font.PLAIN, 48));
            g.drawString("Hello Wolrd !!!", 50, 250);
        }
    }
}
