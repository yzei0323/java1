package day21.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 


 public class ActionListenerEx extends JFrame   implements ActionListener  {
 
    private JLabel lblNum;
    private JButton btnPlus;
   
    
    public ActionListenerEx() {
        init();
        setDisplay();
        addListener();
        showFrame();
    }
    
    // 구성
    private void init() {
        
        lblNum = new JLabel("0", JLabel.CENTER);
        lblNum.setText("0");
        lblNum.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40)); 
        btnPlus = new JButton();
        btnPlus.setText("Plus");
      
        
    }
    // 배치
    private void setDisplay() {
       
 
        add(lblNum, BorderLayout.CENTER);
        add(btnPlus, BorderLayout.SOUTH);
 
    }
   
    private void addListener() { 
    	
    	//버튼에 이벤트리스너 추가하기       
        btnPlus.addActionListener(this);
              
    }
        
    // 프레임 설정
    private void showFrame() {
        setTitle("Counter");
        setSize(300,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    // 
   

	@Override
	public void actionPerformed(ActionEvent e) {
	 
               
				//현재 발생한 이벤트의 정보를 얻어옴 , 누가 이벤트를 발생시켰는지를 알 수 있음 		
               if(btnPlus.equals(e.getSource())){    //
                   
                   String strNum = lblNum.getText();                   
                   int num = Integer.parseInt(strNum);
                   num++;
                   
                   // JLabel에 들어가는 파라미터값은 String이기 때문에
                   // int 형태인 num을 String의 형태로 변환합니다.
                   strNum = String.valueOf(num);
                   lblNum.setText(strNum);
               }
               
	}
	 
	
	 public static void main(String[] args)  {
	        new ActionListenerEx();
	   }
}