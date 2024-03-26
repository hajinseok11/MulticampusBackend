package Ex02_GUI;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
// 로그인 창 클래스
class MyLoginView extends JFrame{ // is a 관계
    JTextField text;
    JButton btn;
    JTextArea content;

    MyLoginView(String title){
        super(title);
        // 화면디자인
        display();
        // 이벤트연결
        eventStart();
        this.setSize(400,300);// JFrame의 사이즈결정
        this.setVisible(true);// JFrame창을 화면에 출력
        // x버튼 누르면 프로그램이 종료되도록 작업하기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void display(){
        Container c = this.getContentPane();
		content = new JTextArea(5,30);
		JScrollPane scroll = new JScrollPane(content);
		c.add(scroll,BorderLayout.CENTER);
		JPanel p1 = new JPanel();
		JLabel label = new JLabel("텍스트입력");
		text = new JTextField(20);
		btn = new JButton("전송");
		p1.add(label);
		p1.add(text);
		p1.add(btn);
		c.add(p1,BorderLayout.SOUTH);

    }
    public void eventStart(){
        // 이벤트 연결
        btn.addActionListener(new ActionEventListener());
    }
}
public class Ex01_GUITest {
    public static void main (String[] args){
        MyLoginView loginView = new MyLoginView("로그인");
    }
    
}
