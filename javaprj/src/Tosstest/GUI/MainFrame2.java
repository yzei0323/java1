package Tosstest.GUI;

import Tosstest.Main;

import javax.swing.*;

public class MainFrame2 extends JFrame {

	public MainFrame2() {
		if (Main.AccountIn == null) {
			JOptionPane.showMessageDialog(null, "계좌를 먼저 연동하세요.");
			return;
		}

		Main.closeCurrentFrame();
		Main.currentFrame = this;

		setTitle("메인 메뉴");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(null);

		JButton transactionButton = new JButton("송금 및 인출");
		transactionButton.setBounds(100, 50, 200, 30);
		add(transactionButton);

		JButton historyButton = new JButton("내역 조회");
		historyButton.setBounds(100, 90, 200, 30);
		add(historyButton);

		JButton eventButton = new JButton("이벤트");
		eventButton.setBounds(100, 130, 200, 30);
		add(eventButton);

		JButton backButton = new JButton("뒤로가기");
		backButton.setBounds(100, 170, 200, 30);
		add(backButton);

		backButton.addActionListener(e -> {
			new AccountFrame();
			dispose();
		});

		setLocationRelativeTo(null);
		setVisible(true);
	}
}
