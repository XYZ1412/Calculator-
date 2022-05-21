
package calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculator extends JFrame{
 
    JPanel pnlMain=new JPanel();
     JPanel pnlMain1=new JPanel();
       JPanel pnlMain2=new JPanel();
        JPanel pnlMain3=new JPanel();
          JPanel pnlMain3p1=new JPanel();
             JPanel pnlMain3p2=new JPanel();
               
       
private JTextArea txtResult=new JTextArea();
private JLabel txtResult1=new JLabel();
String []button1={"MC","MR","MS","M+","M-","~","CE","C","",""};
String []button2={"7","8","9","/","%","4","5","6","*","1/x"};
String []button3={ "1","2","3","-", "0",".","+"};
JButton be=new JButton("=");
JButton []p1=new JButton[10];
JButton []p2 =new JButton[10];
JButton[] p3=new JButton[7]; 

private String st;
 private String g;
 
 private static double no1 = 0.0;
private double no2 = 0.0;
private double total = 0.0;
private static double temp=0;
 private Double total1=1.0;               
 private   Double no11=1.0;
  private Double no22=0.0;
  private  Double no111=0.0;
  private Double no222=0.0;
  private Double total2=0.0;  
  private Double total3=1.0;               
 private  Double no1111=1.0;
  private Double no2222=1.0;
 private  static int i;
   private int j;  
   private int o;
    public Calculator()  {
      
//    خصائص الframe   
        
         setSize(496,540);
        
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("Calculator");
        setLocationRelativeTo(null);
  setVisible(true); 
  this.setResizable(false);
  
       this.setLayout(new GridLayout(4,0));
        //اضافة الpanels
        this.add(pnlMain);
//        pnlMain.setBackground(Color.blue);
          this.add(pnlMain1);
//        pnlMain1.setBackground(Color.red);
          this.add(pnlMain2);
//        pnlMain2.setBackground(Color.pink);
          this.add(pnlMain3);
//        pnlMain3.setBackground(Color.GREEN);



//      اضافة pnlMain&txtResult
        pnlMain.setLayout( new BorderLayout());
        pnlMain.add(txtResult,BorderLayout.SOUTH);
         txtResult.setPreferredSize(new Dimension(100,98));
          pnlMain.add(txtResult1,BorderLayout.NORTH);
              txtResult.setBackground(Color.pink);
         //      اضافة pnlMain1&[]p1   
        pnlMain1.setLayout( new FlowLayout(FlowLayout.LEFT));
         for(int i=0;i<10;  i++ ){
       p1[i]=new JButton(  button1[i]  );
       p1[i].setPreferredSize(new Dimension(91,50));
       pnlMain1.add(p1[i]);   
         }

    //      اضافة pnlMain2&[]p2  
     pnlMain2.setLayout( new FlowLayout(FlowLayout.LEFT));
         for(int i=0;i<10;  i++ ){
       p2[i]=new JButton(  button2[i]  );
       p2[i].setPreferredSize(new Dimension(91,50));
        pnlMain2.add(p2[i]); 
       }
       
        //      اضافة pnlMain3&pnlMain3p1& pnlMain3p2  
     pnlMain3.setLayout( new BorderLayout());
     pnlMain3.add(pnlMain3p1,BorderLayout.EAST);
      pnlMain3.add(pnlMain3p2,BorderLayout.CENTER);
         pnlMain3p1.setLayout( new FlowLayout(FlowLayout.RIGHT));
         be.setPreferredSize(new Dimension(91,107)); 
        pnlMain3p1.add(be);
       
//اضافة []p3 علىpnlMain3p2
        pnlMain3p2.setLayout( new FlowLayout(FlowLayout.LEFT)); 
    
        for(int i=0;i<7;  i++ ){
              p3[i]=new JButton(  button3[i]  ); 
          if( button3[i].equals("0")){ 
       p3[i].setPreferredSize(new Dimension(186,50));
            pnlMain3p2.add(p3[i]);    
              
          }
        
          else
               p3[i].setPreferredSize(new Dimension(91,50));
         pnlMain3p2.add(p3[i]);    
        }
        
     
//        Action listener  to p2

        
       p2[0].addActionListener(new ActionListener () {
           public void actionPerformed(ActionEvent e) {
               
            
                  txtResult.append("7");
               txtResult.setFont( new Font("7", Font.BOLD, 30));
               
         
               
                  }  } );
       
         p2[1].addActionListener(new ActionListener () {
           public void actionPerformed(ActionEvent e) {
               
                  txtResult.append("8");
               txtResult.setFont( new Font("8", Font.BOLD, 30));
               
         
               
                  }  } );
        p2[2].addActionListener(new ActionListener () {
           public void actionPerformed(ActionEvent e) {
                  txtResult.append("9");
               txtResult.setFont( new Font("9", Font.BOLD, 30));
               
         
               
                  }  } );
       
         p2[5].addActionListener(new ActionListener () {
           public void actionPerformed(ActionEvent e) {
                
                  txtResult.append("4");
               txtResult.setFont( new Font("4", Font.BOLD, 30));
               
         
               
                  }  } );
       
        p2[6].addActionListener(new ActionListener () {
           public void actionPerformed(ActionEvent e) {
                  txtResult.append("5");
               txtResult.setFont( new Font("5", Font.BOLD, 30));
               
         
               
                  }  } );
        
         p2[7].addActionListener(new ActionListener () {
           public void actionPerformed(ActionEvent e) {
               
                  txtResult.append("6");
               txtResult.setFont( new Font("6", Font.BOLD, 30));
               
         
               
                  }  } );
         
         
         //        Action listener  to p3
          p3[0].addActionListener(new ActionListener () {
           public void actionPerformed(ActionEvent e) {
                String s=txtResult1.getText();
               
                txtResult.append("1");
               txtResult.setFont( new Font("1", Font.BOLD, 30));
               
         
               
                  }  } );
         
          p3[1].addActionListener(new ActionListener () {
           public void actionPerformed(ActionEvent e) {
                String s=txtResult1.getText();
               
                  txtResult.append("2");
               txtResult.setFont( new Font("2", Font.BOLD, 30));
               
         
               
                  }  } );
         
          p3[2].addActionListener(new ActionListener () {
           public void actionPerformed(ActionEvent e) {
               String s=txtResult1.getText();
               
              
                  txtResult.append("3");
               txtResult.setFont( new Font("3", Font.BOLD, 30));
               
         
               
                  }  } );
         
          p3[4].addActionListener(new ActionListener () {
           public void actionPerformed(ActionEvent e) {
                String s=txtResult1.getText();
             
                   
                  txtResult.append("0");
               txtResult.setFont( new Font("0", Font.BOLD, 30));
               
         
                  }  } );
         

            
          
         
            p3[6].addActionListener(new ActionListener () {
           public void actionPerformed(ActionEvent e) {
            
                no1=Double.parseDouble( txtResult.getText( ));
                st=p3[6].getText();
               String g=txtResult.getText(); 
                 txtResult1.setText(  g+"+");
                txtResult1.setFont(new Font(g+"+", Font.BOLD,20));
             txtResult.setText("");
                                    }  } ); 
                
          
                p3[6].addActionListener(new ActionListener () {
           public void actionPerformed(ActionEvent e) {
          if(st=="+"){
            no2=Double.parseDouble( txtResult.getText( ));
            total=no1+no2;
         String numResult=Double.toString(total);
               System.out.println(numResult);
            txtResult.setText(numResult);
            else if(st=="*"){
                    
                    
                  
          
            
           } } }  } );  
              
                
                
                  p2[8].addActionListener(new ActionListener () {
           public void actionPerformed(ActionEvent e) {
               
                no11=Double.parseDouble( txtResult.getText( ));
                st=p2[8].getText();
              g=txtResult.getText(); 
                 txtResult1.setText(  g+"*");
                txtResult1.setFont(new Font(g+"*", Font.BOLD,20));
                txtResult.setText("");
                         }  } ); 
                p2[8].addActionListener(new ActionListener () {
           public void actionPerformed(ActionEvent e) { 
           
            no22=Double.parseDouble( txtResult.getText( ));
            total1=no11*no22;
         String numResult=Double.toString(total1);
               System.out.println(numResult);
            txtResult.setText(numResult);
 
           }  } );  
                
                
                       p3[3].addActionListener(new ActionListener () {
           public void actionPerformed(ActionEvent e) {
               
                no111=Double.parseDouble( txtResult.getText( ));
                st=p3[3].getText();
              g=txtResult.getText(); 
                 txtResult1.setText(  g+"-");
                txtResult1.setFont(new Font(g+"-", Font.BOLD,20));
                txtResult.setText("");
                         }  } ); 
                p3[3].addActionListener(new ActionListener () {
           public void actionPerformed(ActionEvent e) { 
           
            no222=Double.parseDouble( txtResult.getText( ));
            if(no222>0&&i==0||no111>=0&&i==0){
            total2=(no111-no222)*-1;
            i++;
                System.out.println("i"+i);
            }
            else 
                 total2=(no111-no222);
         String numResult=Double.toString(total2);
               System.out.println(numResult);
            txtResult.setText(numResult);
                      }  } );   
                
             
            
                
                  p2[3].addActionListener(new ActionListener () {
           public void actionPerformed(ActionEvent e) {
               
                no1111=Double.parseDouble( txtResult.getText( ));
                st=p2[3].getText();
              g=txtResult.getText(); 
                 txtResult1.setText(  g+"/");
                txtResult1.setFont(new Font(g+"/", Font.BOLD,20));
                txtResult.setText("");
                         }  } ); 
                p2[3].addActionListener(new ActionListener () {
           public void actionPerformed(ActionEvent e) { 
           
            no2222=Double.parseDouble( txtResult.getText( ));
              if(no2222>0&&j==0||no111>=0){
             total3=(no1111/no2222)*no2222*no2222; 
            j++;
                System.out.println("i"+j);
            }
            else 
                 total3=(no1111/no2222); 
          
               System.out.println("no1"+no1111);
                System.out.println("no2"+no2222);
         String numResult=Double.toString(total3);
               System.out.println(numResult);
            txtResult.setText(numResult);
                      }  } );  
                        
                
                
                
               
be.addActionListener(new ActionListener () {
           public void actionPerformed(ActionEvent e) {
//        no2=Double.parseDouble( txtResult.getText( ));
  char type=st.charAt(0);
 
switch(type){
    case '+':
       no2=Double.parseDouble( txtResult.getText( ));  
    total=no1+no2;
    txtResult.setText(Double.toString(total));
              txtResult1.setText("");
              no1=0;
               no2=0;       
 break;
 case '*':
      no22=Double.parseDouble( txtResult.getText( ));
    total1=no11*no22;
    txtResult.setText(Double.toString(total1));
     txtResult1.setText("");
              no11=1.0;
               no22=0.0;
break;
 case '-':
      no222=Double.parseDouble( txtResult.getText( ));
    total2=no111-no222;
    txtResult.setText(Double.toString(total2));
     txtResult1.setText("");
              no111=0.0;
               no222=0.0;
              i=0;
break;


 case '/':
      no2222=Double.parseDouble( txtResult.getText( ));
    total3=no1111/no2222;
    txtResult.setText(Double.toString(total3));
     txtResult1.setText("");
              no1111=1.0;
               no2222=1.0;
break;




 
}  }  } );        
          
         
            
            
                
               
              
    }

  
    public static void main(String[] args) {
       Calculator c=new  Calculator() ; 
     
    }
    
}
