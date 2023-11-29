package experiment4;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
public class MsgManage  extends JFrame  implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel lab11,lab12;//显示一行文字
	JTextArea Msg;//多行文字
	JComboBox cbExp;//下拉列表
	JTextField txtMsgSE;//单行文本
	JButton btnDeletAll,btnDeletSet,btnSave,btnFind;
	int count=0;

public MsgManage (String title) {
	super(title);//设置标题
	this.setSize(800,600);
	this.Manage();
}
public void Manage() {//组件初始化
	Msg=new JTextArea();
	JScrollPane scrol2=new JScrollPane(Msg);
	Msg.setEditable(false);
	Msg.setFont(new Font("楷体",Font.BOLD,23));
	cbExp= new JComboBox();;
	lab11=new JLabel("请输入");
	lab12=new JLabel("共"+count+"条留言");
	txtMsgSE=new JTextField(25);
	btnDeletAll=new JButton("删除所有");
	btnDeletSet=new JButton("删除选择");
	btnSave=new JButton("保存");
	btnFind=new JButton("查询");
	btnFind.addActionListener(this);
	btnDeletAll.addActionListener(this);
	btnDeletSet.addActionListener(this);
	btnSave.addActionListener(this);
	//包含按钮和标签的东方面板
	JPanel pEast=new JPanel();
	pEast.setLayout(new GridLayout(8,1,0,30));
	pEast.add(btnDeletSet);
	pEast.add(btnDeletAll);
	pEast.add(btnSave);
	//包含按钮和标签的北方面板
	JPanel pNorth=new JPanel();
	pNorth.add(lab11);
	pNorth.add(txtMsgSE);
	pNorth.add(btnFind);
	pNorth.add(lab12);
	add(cbExp,"South");
	add(pNorth,"North");
    add(pEast,"East");
    add(scrol2,"Center");
	
}
public void load() {//实现查询按钮
	Msg.setText(null);
	cbExp.removeAllItems();
	try {
		BufferedReader bR=new BufferedReader(new FileReader("Msg.txt"));
		String msgLine="";
		int i=0;
		while((msgLine=bR.readLine())!=null) {
			if(msgLine.substring(msgLine.indexOf("]") + 1).contains(txtMsgSE.getText())){
				Msg.append(msgLine + "\n");//将有关键词加入多行文本框中
				cbExp.addItem(msgLine);//加入下拉列表
				i++;
			}else if(txtMsgSE.getText().isEmpty()) {
				Msg.append(msgLine + "\n");
				cbExp.addItem(msgLine);//加入下拉列表
				i++;
			}
		}	
		count=i;
		  lab12.setText("共" + count + "条留言");
		bR.close();
	}catch(IOException e1) {
		System.out.println("文件打开失败"+e1);
    }
}

public void deleteSlt() {//删除选择
	Msg.setText(null);
	cbExp.removeAllItems();
	try {
		BufferedReader bR=new BufferedReader(new FileReader("Msg.txt"));
		String msgLine="";
		int i=0;
		while((msgLine=bR.readLine())!=null) {
			//获取下拉列表的内容与文本内容比较
			if(!msgLine.equals((String) cbExp.getSelectedItem())){
				Msg.append(msgLine + "\n");
				i++;
			}
		}
		count=i;
		lab12.setText("共" + count + "条留言");
		bR.close();
	}catch(IOException e1) {
		System.out.println("文件打开失败"+e1);
    }

}
public void deleteAll() {//删除所有  与查询效果相反
	Msg.setText(null);
	cbExp.removeAllItems();
	try {
		BufferedReader bR=new BufferedReader(new FileReader("Msg.txt"));
		String msgLine="";
		int i=0;
		while((msgLine=bR.readLine())!=null) {
			if(txtMsgSE.getText().isEmpty()) {
				Msg.setText("请输入关键词");
				break;
			}else if(!msgLine.substring(19).contains(txtMsgSE.getText())){
				Msg.append(msgLine + "\n");
				i++;
			}else {
				cbExp.addItem(msgLine);
			}
		}
			count=i;
			lab12.setText("共" + count + "条留言");
		
		bR.close();
		return;
	}catch(IOException e1) {
		System.out.println("文件打开失败"+e1);
    }

}
public void save() {//将文本内容覆盖原文件内容
	try {
	    FileWriter writer = new FileWriter("Msg.txt", false);
	    String[] lines = Msg.getText().split("\n");
	    for (String line : lines) {
	        writer.write(line + System.lineSeparator());   
	    }
	    System.out.println("保存成功");
	    writer.close();
	} catch (IOException e) {
		System.out.println("文件打开失败"+e);
	}
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getActionCommand().equals("查询")) {
		//Msg.setText(null);
		this.load();
		}else if(e.getActionCommand().equals("删除选择")){
			this.deleteSlt();
		}else if(e.getActionCommand().equals("删除所有")){
			this.deleteAll();
		}else if(e.getActionCommand().equals("保存")){
			this.save();
		}
}
}