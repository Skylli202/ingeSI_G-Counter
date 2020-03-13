import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AskUserInfo implements ActionListener{
    //private JFrame frame;
    private JDialog frame;

    //private Menu parent;
    private boolean isclient;

    private static JTextField user = new JTextField("Skylli");
    private static JTextField ipaddr = new JTextField("192.168.1.20");
    private static JTextField localPort = new JTextField("8088");

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    private String username;
    private String ipaddress;
    private String port;

    public AskUserInfo(boolean isClient, boolean modal) {
        //this.parent = parent;
        this.isclient = isClient;

        //frame = new JFrame();
        frame = new JDialog();
        frame.setLayout(new GridLayout(4,2));
        frame.setSize(new Dimension(300,300));


        user.setName("username");


        user.setName("ip_address");


        user.setName("port");

        JButton ok = new JButton("OK");
        ok.setActionCommand("ok");
        ok.addActionListener(this);

        JButton cancel = new JButton("Cancel");
        cancel.setActionCommand("cancel");
        cancel.addActionListener(this);

        frame.add(new JLabel("Username :"));
        frame.add(user);

        frame.add(new JLabel("IP Address :"));
        frame.add(ipaddr);

        frame.add(new JLabel("Port :"));
        frame.add(localPort);

        frame.add(ok);
        frame.add(cancel);

        frame.setModal(modal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocation((int)(screenSize.getWidth()/2)-(frame.getWidth()/2), ((int) (screenSize.getHeight()/2)-(frame.getHeight()/2)));
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if("ok".equals(e.getActionCommand())) {
            username = user.getText();
            ipaddress = ipaddr.getText();
            port = localPort.getText();
            if(isclient) {
                //new MainSolo(username, ipaddress, port);
                // start client

            } else {
                //new MainCoop(username, ipaddress, port);
                // start server
            }
            frame.dispose();
        }

        if("cancel".equals(e.getActionCommand())) {
            System.exit(0);
        }
    }

    public String getUsername() {
        return username;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public String getPort() {
        return port;
    }
}