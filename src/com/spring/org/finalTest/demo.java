package com.spring.org.finalTest;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
 * 用spring配置文件来配置如下代码
 */
public class demo {
	public static void test() {
		JFrame win = new JFrame("我的窗口");
		JTextArea jta = new JTextArea(7, 40);
		win.add(new JScrollPane(jta));
		JPanel jp = new JPanel();
		win.add(jp, BorderLayout.SOUTH);
		JButton jb1 = new JButton("确定");
		jp.add(jb1);
		JButton jb2 = new JButton("取消");
		jp.add(jb2);
		win.pack();
		win.setVisible(true);
	}

	public static void main(String[] args) {
		//		test();
		//		Date date = new Date();

		//		System.out.println(date.getTime());
		int i = 10;
		while (i > 0) {
			System.out.println(i);
			i--;
		}
	}
}
