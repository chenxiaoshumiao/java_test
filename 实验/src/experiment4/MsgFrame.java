package experiment4;
import javax.swing.*;
import javax.xml.crypto.dom.DOMCryptoContext;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.text.*;
import java.io.*;
import java.awt.Color;
//留言窗口类
public class MsgFrame extends JFrame implements ActionListener,KeyListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5841921991399712088L;
	//2.定义控件
	JLabel lab1,lab2,lab3;//显示一行文字
	JTextArea taContent;//多行文字
	JComboBox cbExp;//下拉列表
	JTextField txtMsg;//单行文本
	JButton btnSubmit,btnClear,btnTop,btnBottom,btnShow;
	//提交，清屏，至顶，至尾，查看，
	
//1、编写构造方法
	public MsgFrame (String title) {
		super(title);//设置标题
		this.setSize(800,600);
		this.winINit();
	}
	//组件初始化
	public void winINit() {
		lab1=new JLabel("留言板",0);
	    lab2=new JLabel("你");
	    lab3=new JLabel("地说");
	    taContent=new JTextArea("留言内容：\n");
	    taContent.setBackground(new Color(200,200,250));
	    taContent.setEditable(false);//面板文本框内容是否能被编辑
	    cbExp=new JComboBox();
	    this.loadExp();
//	    cbExp.addItem("微笑");
//	    cbExp.addItem("大哭");
//	    cbExp.addItem("流泪");
	    txtMsg=new JTextField(35);
	    btnSubmit=new JButton("提交");
	    btnClear=new JButton("清屏");
	    btnTop=new JButton("至顶");
	    btnBottom=new JButton("至尾");
	    btnShow=new JButton("查看");
	    btnSubmit.addActionListener(this);
	    btnClear.addActionListener(this);
	    btnTop.addActionListener(this);
	    btnBottom.addActionListener(this);
	    btnShow.addActionListener(this);
	    
	    txtMsg.addKeyListener(this);
	    
	    JScrollPane scroll=new JScrollPane(taContent);//添加滚动条带有滚动条的文本区域
	    JPanel pSouth=new JPanel();//包含按钮和标签的南方面板
	    pSouth.add(lab2);
	    pSouth.add(cbExp);
	    pSouth.add(lab3);
	    pSouth.add(txtMsg);
	    pSouth.add(btnSubmit);
	    JPanel pEast=new JPanel();//包含按钮和标签的东方面板
	    pEast.setLayout(new GridLayout(8,1,0,30));
	    pEast.add(btnClear);
	    pEast.add(btnTop);
	    pEast.add(btnBottom);
	    pEast.add(btnShow);
	    //把这些面板加入窗口中
	    add(lab1,"North");
	    add(pSouth,"South");
	    add(pEast,"East");
	    add(scroll,"Center");
	   
	   this.addWindowListener(new WindowAdapter() {
		   public void windowClosing(WindowEvent e) {
			   System.exit(0);
		   }
	});
	}
	  //加载文件中的表情
	public void loadExp() {
		cbExp.removeAllItems();
		try {
		BufferedReader br=new BufferedReader(new FileReader("Expression.txt"));
		String exp="";
		while((exp=br.readLine())!=null) {
			cbExp.addItem(exp);			
		}	
	}catch(IOException e1) {
		System.out.println("文件打开失败"+e1);
		}
	}
	//加载文件中的留言内容
	public void loadMsg() {
		taContent.setText("留言内容：\n");
		try {
			BufferedReader br=new BufferedReader(new FileReader("Msg .txt"));
			String msg="";
			while((msg=br.readLine())!=null) {
				taContent.insert(msg+"\n",6);
			}
			br.close();
		}catch(IOException e1) {
			System.out.println("文件打开失败"+e1);
        }
	}
	  //提交留言的方法 
	public void msgSubmit(){
		if(txtMsg.getText().length()==0)return;
		
    	SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	String dateStr=df.format(new java.util.Date());
    	String msgInfo="["+dateStr+"]"+"你"+cbExp.getSelectedItem()
+"地说"+txtMsg.getText();
    	taContent.insert(msgInfo+"\n", 6);
     //写入文件Msg.txt
    	File f=new File("Msg.txt");
    	try {
    		FileWriter fw=new FileWriter(f,true);//追加一行
    		fw.write(msgInfo+"\r\n");
    		fw.close();
    	}catch(IOException e1) {
    		System.out.println("写入文件失败"+e1);
    	}
    	txtMsg.setText("");
    	
    	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("提交")) {
			msgSubmit();
		}else if(e.getActionCommand().equals("清屏")) {
			taContent.setText("留言内容：\n");
		}else if(e.getActionCommand().equals("至顶")) {
			taContent.setCaretPosition(0);
		}else if(e.getActionCommand().equals("至尾")) {
			taContent.setCaretPosition(taContent.getText().length()-1);
		}else if(e.getActionCommand().equals("查看")) {
			this.loadMsg();
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getKeyCode());
		if(e.getKeyCode()==10) {
			msgSubmit();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
