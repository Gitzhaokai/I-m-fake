package cal;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalWindow {
	protected long num1 = 0;
	protected long num2 = 0;
	protected long result = 0;
	protected JTextField textField1;
	protected JLabel label1;
	protected int flag = 0;
	protected boolean isPressEqual = false;

	public void init() {
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		frame.setLocation(450, 150);
		frame.setResizable(false);
		frame.setTitle("小菊花计算器");
		frame.setIconImage(new ImageIcon("C:\\Users\\Public\\Pictures\\" +
				"Sample Pictures\\Chrysanthemum.jpg").getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// panel1
		JPanel panel1 = (JPanel) frame.getContentPane();
		panel1.setLayout(new FlowLayout());

		textField1 = new JTextField();
		textField1.setPreferredSize(new Dimension(260, 90));
		textField1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField1.setEditable(false);
		panel1.add(textField1);

		// panel2
		JPanel panel2 = (JPanel) frame.getContentPane();
		panel2.setLayout(new FlowLayout());

		final JButton button1 = new JButton("1");
		button1.setPreferredSize(new Dimension(50, 30));
		panel2.add(button1);
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addNum("1");
			}
		});

		final JButton button2 = new JButton("2");
		button2.setPreferredSize(new Dimension(50, 30));
		panel2.add(button2);
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addNum("2");
			}
		});

		final JButton button3 = new JButton("3");
		button3.setPreferredSize(new Dimension(50, 30));
		panel2.add(button3);
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addNum("3");
			}
		});

		final JButton addButton = new JButton("+");
		addButton.setPreferredSize(new Dimension(50, 30));
		panel2.add(addButton);
		addButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (textField1.getText().length() != 0) {
					num1 = Integer.parseInt(textField1.getText());
					flag = 1;
					removeAll();
				} else {
					num1 = 0;
					flag = 1;
				}
			}
		});

		final JButton subButton = new JButton("-");
		subButton.setPreferredSize(new Dimension(50, 30));
		panel2.add(subButton);
		subButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (textField1.getText().length() != 0) {
					num1 = Integer.parseInt(textField1.getText());
					flag = 2;
					removeAll();
				} else {
					num1 = 0;
					flag = 2;
				}
			}
		});

		// panel3
		JPanel panel3 = (JPanel) frame.getContentPane();
		panel3.setLayout(new FlowLayout());

		final JButton button4 = new JButton("4");
		button4.setPreferredSize(new Dimension(50, 30));
		panel3.add(button4);
		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addNum("4");
			}
		});

		final JButton button5 = new JButton("5");
		button5.setPreferredSize(new Dimension(50, 30));
		panel3.add(button5);
		button5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addNum("5");
			}
		});

		final JButton button6 = new JButton("6");
		button6.setPreferredSize(new Dimension(50, 30));
		panel3.add(button6);
		button6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addNum("6");
			}
		});

		final JButton mulButton = new JButton("×");
		mulButton.setPreferredSize(new Dimension(50, 30));
		panel3.add(mulButton);
		mulButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (textField1.getText().length() != 0) {
					num1 = Integer.parseInt(textField1.getText());
					flag = 3;
					removeAll();
				} else {
					num1 = 0;
					flag = 3;
				}
			}
		});

		final JButton divButton = new JButton("÷");
		divButton.setPreferredSize(new Dimension(50, 30));
		panel3.add(divButton);
		divButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (textField1.getText().length() != 0) {
					num1 = Integer.parseInt(textField1.getText());
					flag = 4;
					removeAll();
				} else {
					num1 = 0;
					flag = 4;
				}
			}
		});

		// panel4
		JPanel panel4 = (JPanel) frame.getContentPane();
		panel4.setLayout(new FlowLayout());

		final JButton button7 = new JButton("7");
		button7.setPreferredSize(new Dimension(50, 30));
		panel4.add(button7);
		button7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addNum("7");
			}
		});

		final JButton button8 = new JButton("8");
		button8.setPreferredSize(new Dimension(50, 30));
		panel4.add(button8);
		button8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addNum("8");
			}
		});

		final JButton button9 = new JButton("9");
		button9.setPreferredSize(new Dimension(50, 30));
		panel4.add(button9);
		button9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addNum("9");
			}
		});

		final JButton deleteButton = new JButton("←");
		deleteButton.setPreferredSize(new Dimension(50, 30));
		panel4.add(deleteButton);
		deleteButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				remove();
			}
		});

		final JButton deleteAllButton = new JButton("CE");
		deleteAllButton.setPreferredSize(new Dimension(50, 30));
		panel4.add(deleteAllButton);
		deleteAllButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				removeAll();
			}
		});

		// panel5
		JPanel panel5 = (JPanel) frame.getContentPane();
		panel5.setLayout(new FlowLayout());

		final JButton button21 = new JButton("!");
		button21.setPreferredSize(new Dimension(50, 30));
		panel5.add(button21);
		button21.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (textField1.getText().length() != 0) {
					num1 = Integer.parseInt(textField1.getText());
				} else {
					num1 = 0;
				}
				if (num1 == 0) {
					textField1.setText("0");
				} else {
					long mul = 1;
					for (int i = 1;i <= num1;i++) {
						mul = mul * i;
					}
					textField1.setText(Long.toString(mul));
				}
				isPressEqual = true;
			}
		});

		final JButton button0 = new JButton("0");
		button0.setPreferredSize(new Dimension(50, 30));
		panel5.add(button0);
		button0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addNum("0");
			}
		});

		final JButton jcButton = new JButton("^");
		jcButton.setPreferredSize(new Dimension(50, 30));
		panel5.add(jcButton);
		jcButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (textField1.getText().length() != 0) {
					num1 = Integer.parseInt(textField1.getText());
					flag = 5;
					removeAll();
				} else {
					num1 = 0;
					flag = 5;
				}
			}
		});

		final JButton beEqualButton = new JButton("=");
		beEqualButton.setPreferredSize(new Dimension(105, 30));
		panel5.add(beEqualButton);
		beEqualButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (textField1.getText().length() == 0) {
					num2 = 0;
				} else {
					if (isPressEqual) {
						
					} else {
						num2 = Integer.parseInt(textField1.getText());
					}
				}
//				label1.setText(flag + "");
				result = 0;
				switch (flag) {
				case 1:
					long result1 = num1 + num2;
					result = result1;
					inspect();
					textField1.setText(Long.toString(result1));
					break;
				case 2:
					long result2 = num1 - num2;
					result = result2;
					inspect();
					textField1.setText(Long.toString(result2));
					break;
				case 3:
					long result3 = num1 * num2;
					result = result3;
					inspect();
					textField1.setText(Long.toString(result3));
					break;
				case 4:
					if (num2 == 0) {
						label1.setText("除数不能为0.");
					} else {
						double result4 = (double)num1 / (double)num2;
						result = (int)result4;
						inspect();
						if ((result4 % 1) == 0) {
							textField1.setText(Integer.toString((int)result4));
						} else {
							textField1.setText(Double.toString(result4));
						}
					}
					break;
				case 5:
					long result5 = 1;
					int i = 1;
					do {
						result5 = result5 * num1;
						i++;
					} while (num2 >= i);
					textField1.setText(Long.toString(result5));
				default:
					break;
				}
				isPressEqual = true;
				change(result);
			}
		});

		// panel6
		JPanel panel6 = (JPanel) frame.getContentPane();
		panel6.setLayout(new FlowLayout());

		label1 = new JLabel();
		label1.setPreferredSize(new Dimension(110, 30));
		panel6.add(label1);

		frame.setVisible(true);
	}

	public void addNum(String num) {
		if (isPressEqual) {
			removeAll();
			isPressEqual = false;
		}
		String thisNum = textField1.getText();
		if (thisNum.length() < 9) {
			thisNum += num;
			this.label1.setText("");
			this.textField1.setText(thisNum);
		} else {
			this.label1.setText("超出界限.");
		}
	}
	
	public void remove() {
		String string = this.textField1.getText();
		if (string.length() > 0) {
			string = string.substring(0, string.length() - 1);
		} else {
			removeAll();
		}
		this.textField1.setText(string);
		if (this.textField1.getText().length() < 9) {
			this.label1.setText("");
		}
	}
	
	public void change(long result) {
		this.num1 = result;
	}
	
	public void removeAll() {
		this.textField1.setText("");
		this.label1.setText("");
	}
	
	public void inspect() {
		if (this.result > Long.MAX_VALUE) {
			label1.setText("超出long类型的最大值.计算结果不为准.");
		}
	}

	public static void main(String[] args) {
		CalWindow calWindow = new CalWindow();
		calWindow.init();
	}
}
