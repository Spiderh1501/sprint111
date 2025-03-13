import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class baitap1 {
    public static void main(String[] args) {
        // Tạo frame
        JFrame frame = new JFrame("Cộng Hai Số");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));

        // Tạo các thành phần giao diện
        JLabel label1 = new JLabel("Nhập số thứ nhất:");
        JTextField textField1 = new JTextField();
        JLabel label2 = new JLabel("Nhập số thứ hai:");
        JTextField textField2 = new JTextField();
        JButton addButton = new JButton("Cộng");
        JLabel resultLabel = new JLabel("Kết quả: ");

        // Xử lý sự kiện khi nhấn nút Cộng
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    double sum = num1 + num2;
                    resultLabel.setText("Kết quả: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Vui lòng nhập số hợp lệ!");
                }
            }
        });

        // Thêm các thành phần vào frame
        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(addButton);
        frame.add(resultLabel);

        // Hiển thị cửa sổ
        frame.setVisible(true);
    }
}
