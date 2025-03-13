package phepnhan2so;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplicationGUI extends JFrame {
    private JTextField txtNum1, txtNum2, txtResult;
    private JButton btnMultiply, btnClear, btnExit;

    public MultiplicationGUI() {
        setTitle("Phép Nhân Hai Số");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Tạo các thành phần giao diện
        JLabel lblNum1 = new JLabel("Số thứ nhất:");
        txtNum1 = new JTextField();
        JLabel lblNum2 = new JLabel("Số thứ hai:");
        txtNum2 = new JTextField();
        JLabel lblResult = new JLabel("Kết quả:");
        txtResult = new JTextField();
        txtResult.setEditable(false);

        btnMultiply = new JButton("Nhân");
        btnClear = new JButton("Xóa");
        btnExit = new JButton("Thoát");

        // Xử lý sự kiện nút Nhân
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(txtNum1.getText());
                    double num2 = Double.parseDouble(txtNum2.getText());
                    double result = num1 * num2;
                    txtResult.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Xử lý sự kiện nút Xóa
        btnClear.addActionListener(e -> {
            txtNum1.setText("");
            txtNum2.setText("");
            txtResult.setText("");
        });

        // Xử lý sự kiện nút Thoát
        btnExit.addActionListener(e -> System.exit(0));

        // Thêm các thành phần vào Frame
        add(lblNum1); add(txtNum1);
        add(lblNum2); add(txtNum2);
        add(lblResult); add(txtResult);
        add(btnMultiply); add(btnClear);
        add(btnExit);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MultiplicationGUI();
    }
}