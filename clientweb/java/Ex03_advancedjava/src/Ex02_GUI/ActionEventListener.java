package Ex02_GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 버튼을 클릭하는 이벤트가 발생하면 호출될 메소드를 갖고있는 클래스
public class ActionEventListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("이벤트 반응");
    }
    
}
