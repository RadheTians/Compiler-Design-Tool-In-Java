package doc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;



import java.awt.Color;

import doc.RecursiveDescent;
import doc.Laxical;
import doc.LeftFactoring;
import doc.LeftRecursion;
import doc.FirstAndFollow;
import doc.SLR;
import doc.SLRConanical;
import java.awt.Font;

import java.awt.TextArea;
import java.awt.Button;

public class window {

	private JFrame frame;
	private JTextPane input;
	private TextArea output;

	
	public static void main(String[] args) throws Exception {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window window = new window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public window() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("COMPILER ASSIGNMENT");
		frame.setBounds(100, 100, 900, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		input = new JTextPane();
		input.setBounds(32, 71, 215, 402);
		frame.getContentPane().add(input);
		
		output = new TextArea();
		output.setBounds(450, 71, 415, 402);
		frame.getContentPane().add(output);
		
		JLabel message = new JLabel("Non-Terminals should be in Alphabetical Order");
		message.setForeground(Color.RED);
		message.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		message.setBounds(213, 17, 415, 15);
		frame.getContentPane().add(message);
		
		
		
		JLabel grammar = new JLabel("GRAMMAR");
		grammar.setBounds(100, 44, 94, 15);
		grammar.setForeground(Color.RED);
		frame.getContentPane().add(grammar);
		
		JLabel result = new JLabel("OUTPUT");
		result.setBounds(622, 44, 66, 15);
		result.setForeground(Color.RED);
		frame.getContentPane().add(result);
		
		JButton faf = new JButton("First And Follow");
		faf.setBounds(442, 616, 166, 25);
		frame.getContentPane().add(faf);
		faf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String grs = input.getText();
				String[] res = grs.split("\n", 0);
				
				String result = FirstAndFollow.FirstAndFollow(res, res.length);
				output.setText(result);
			}
		});
	
		JButton rd = new JButton("Recursive Descent");
		rd.setBounds(442, 537, 166, 25);
		frame.getContentPane().add(rd);
		rd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String string = input.getText();
					String result = RecursiveDescent.Descent(string);
					output.setText(result);
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
		JButton lr = new JButton("LR");
		lr.setBounds(255, 537, 114, 25);
		frame.getContentPane().add(lr);
		lr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String grs = input.getText();
				String[] res = grs.split("\n", 0);
				Vector<String> pro = new Vector<String>();
				for(String a : res)
					pro.add(a);
				String out ="";
				for (String s : new LeftRecursion().Left_Recusrion(pro))
					out +=s+"\n";
				output.setText(out);
				
			}
		});
		
		
		JButton lf = new JButton("LF");
		lf.setBounds(671, 537, 114, 25);
		frame.getContentPane().add(lf);
		lf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String grs = input.getText();
				String[] res = grs.split("\n", 0);
				Vector<String> pro = new Vector<String>();
				for(String a : res)
					pro.add(a);
				String out = "";
				for (String s : new LeftFactoring().Left_Factoring(pro))
					out +=s+"\n";
				output.setText(out);
			}
		});
		
		JButton fst = new JButton("First");
		fst.setBounds(80, 616, 114, 25);
		frame.getContentPane().add(fst);
		fst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String grs = input.getText();
				String[] pro = grs.split("\n", 0);
				
				String result = FirstAndFollow.FirstMain(pro, pro.length);
				output.setText(result);
			}
		});
		
		JButton flw = new JButton("Follow");
		flw.setBounds(255, 616, 114, 25);
		frame.getContentPane().add(flw);
		flw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String grs = input.getText();
				String[] pro = grs.split("\n", 0);
				String result = FirstAndFollow.FollowMain(pro, pro.length);
				output.setText(result);	
			}
		});
		
		
		JButton lex = new JButton("Lexical");
		lex.setBounds(80, 537, 114, 25);
		frame.getContentPane().add(lex);
		lex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String inuputPath = input.getText();
				Vector<String>res = Laxical.Main(inuputPath);
				String outs="";
				for(String s:res)
					outs+=s;
				output.setText(outs);
			}
		});
		
		JButton slr = new JButton("SLR");
		slr.setBounds(671, 616, 114, 25);
		frame.getContentPane().add(slr);
		slr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				String grs = input.getText();
				String result= SLRConanical.ValidString(grs);
				output.setText(result);	
			}
		});
		
		JButton slrcl = new JButton("SLR Conanical");
		slrcl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String grs = input.getText();
				String[] pro = grs.split("\n", 0);
				SLR.slrMain(pro, pro.length);
				output.setText(SLR.result);
			}
		});
		slrcl.setBounds(328, 498, 149, 23);
		frame.getContentPane().add(slrcl);
		
		
	
		
		
		
		
		
	
		
		
	}
}
