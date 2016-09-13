/*
 
 Teacher: Mr.Anandarajan
 Date: Thursday Janurary 8th, 2014
 Description: A Storage Program for Mr. Masciello so he can keep track of all the supplies used during chemistry labs
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//Adding the event for the action listener
public class ChemistryStorageProgramV2 extends JFrame implements ActionListener
{
  //Creating Panels
  JPanel pan0= new JPanel();
  JPanel pan1= new JPanel();
  JPanel pan2= new JPanel();
  JPanel pan3= new JPanel();
  JPanel pan4= new JPanel();
  JPanel pan5= new JPanel();
  JPanel pan6= new JPanel();
  JPanel pan7= new JPanel();
  
  //Creating GUI Components 
  JLabel welcomeLabel=new JLabel("Lab Equipment Check-Out & Returns", JLabel.RIGHT);
  JLabel promptLabel=new JLabel("                             Please enter your information in the fields below                            ", JLabel.CENTER);
  JLabel prompt2Label=new JLabel();
  JLabel spaceLabel=new JLabel("                                                                                                                                         ", JLabel.RIGHT);
  JLabel space2Label=new JLabel("                                                                                                                                         ", JLabel.RIGHT);
  //Prompting user
  JLabel firstnameLabel=new JLabel("First Name: ", JLabel.RIGHT);
  JTextField firstnameField=new JTextField("Enter first name", 20);
  JLabel lastnameLabel=new JLabel("Last Name: ", JLabel.RIGHT);
  JTextField lastnameField=new JTextField("Enter last name", 20);
  JLabel studentNumberLabel= new JLabel ("Student Number: ", JLabel.RIGHT);
  JTextField studentNumberField=new JTextField("Enter student number", 20);
  JLabel borrowedLabel = new JLabel ("Date Borrowed: ", JLabel.RIGHT);
  JTextField borrowedField=new JTextField("Enter date borrowed", 20);
  JLabel returnedLabel = new JLabel ("Date Returned: ", JLabel.RIGHT);
  JTextField returnedField=new JTextField("Enter return date", 20);
  JLabel equipmentnameLabel= new JLabel ("Equipment Name: ", JLabel.RIGHT);
  JTextField equipmentnameField=new JTextField("Enter equipment name", 20);
  JLabel equipmentnumLabel= new JLabel ("Equipment Number: ", JLabel.RIGHT);
  JTextField equipmentnumField=new JTextField("Enter equipment number", 20);
  JLabel periodNumberLabel= new JLabel ("Period Number: ", JLabel.RIGHT);
  JTextField periodNumberField=new JTextField("Enter period number", 20);
  JLabel searchnameLabel= new JLabel ("Name:",JLabel.RIGHT);
  //Displayed to user
  JLabel searchstudentNumberLabel= new JLabel ("Student #:",JLabel.RIGHT);
  JLabel searchborrowedLabel= new JLabel ("Date Borrowed: ",JLabel.RIGHT);
  JLabel searchreturnedLabel= new JLabel ("Date Returned: ",JLabel.RIGHT);
  JLabel searchequipmentnameLabel= new JLabel ("Equipment Name:",JLabel.RIGHT);
  JLabel searchequipmentnumLabel= new JLabel ("Equipment #:",JLabel.RIGHT);
  JLabel searchperiodNumberLabel= new JLabel ("Period #:",JLabel.RIGHT);
  //Buttons
  JButton borrowButton=new JButton("Borrow");
  JButton returnButton=new JButton("Return");
  JButton updateButton=new JButton("Update");
  JButton searchButton=new JButton("Search");
  JButton previousButton=new JButton("<<");
  JButton nextButton=new JButton(">>");
  JButton clearButton=new JButton("Clear");
  //Combo Box
  JComboBox equipname = new JComboBox();
  JComboBox equipnum = new JComboBox();
  
  
  //Creating Arrays and Variable names
  int max = 150;
  int number = 0;
  int number2, value=-1;
  String equipmentName, equipmentNumber;
  String firstname[] = new String[max];
  String lastname[] = new String[max];
  String studentNumber[] = new String[max];
  String equipmentname[] = new String[max];
  String equipmentnum[] = new String[max];
  String periodNumber[] = new String[max];
  String borrowed[] = new String[max];
  String returned[] = new String[max];
  
  //Constructor
  public ChemistryStorageProgramV2()
  {
    setTitle("Lab Equipment Check-Out & Returns");//Setting the title of GUI
    setSize(500,610);//Setting the size of the window
    setResizable(true);//Making the window resizable
    
    //Enable the use of buttons as the user can press them and something happens (action listener)
    borrowButton.addActionListener(this);
    returnButton.addActionListener(this);
    updateButton.addActionListener(this);
    searchButton.addActionListener(this);
    previousButton.addActionListener(this);
    nextButton.addActionListener(this);
    clearButton.addActionListener(this);
    equipname.addActionListener(this);
    equipnum.addActionListener(this);
    
    //Creating Layouts
    FlowLayout layout1 = new FlowLayout();
    BoxLayout layout2=new BoxLayout(pan1,BoxLayout.Y_AXIS);
    BoxLayout layout3=new BoxLayout(pan2,BoxLayout.Y_AXIS);
    FlowLayout layout4 = new FlowLayout();
    BoxLayout layout5=new BoxLayout(pan5,BoxLayout.Y_AXIS);
    BoxLayout layout6=new BoxLayout(pan6,BoxLayout.Y_AXIS);
    BoxLayout layout7=new BoxLayout(pan7,BoxLayout.Y_AXIS);
    
    //Set frame and panel layouts
    setLayout(layout1);//Layout for whole frame
    pan0.setLayout(layout1);//Layout for panel 1
    pan1.setLayout(layout2);//Layout for panel 1
    pan2.setLayout(layout3);//Layout for panel 2
    pan3.setLayout(layout1);//Layout for panel 3
    pan4.setLayout(layout4);//Layout for panel 4
    pan5.setLayout(layout4);//Layout for panel 5
    pan6.setLayout(layout6);//Layout for panel 6
    pan7.setLayout(layout7);//Layout for panel 7
    
    //Adding the GUI components to the panels
    pan0.add(welcomeLabel);
    pan1.add(promptLabel);
    pan2.add(firstnameLabel);
    pan2.add(firstnameField);
    pan2.add(lastnameLabel);
    pan2.add(lastnameField);
    pan2.add(studentNumberLabel);
    pan2.add(studentNumberField);
    pan2.add(periodNumberLabel);
    pan2.add(periodNumberField);
    pan2.add(borrowedLabel);
    pan2.add(borrowedField);
    pan2.add(returnedLabel);
    pan2.add(returnedField);
    
    pan2.add(equipmentnameLabel);
    pan2.add(equipname);
    equipname.addItem("Beakers");
    equipname.addItem("Pipettes");
    equipname.addItem("Bunsen Burners");
    equipname.addItem("Erlenmeyer Flasks");
    equipname.addItem("Goggles");
    equipname.addItem("Tongs");
    equipname.addItem("Ring Stands");
    equipname.addItem("Graduated Cylinders");
    equipname.addItem("Test Tubes");
    equipname.addItem("Syringes");
    
    pan2.add(equipmentnumLabel);
    pan2.add (equipnum);
    equipnum.addItem("0");
    equipnum.addItem("1");
    equipnum.addItem("2");
    equipnum.addItem("3");
    equipnum.addItem("4");
    equipnum.addItem("5");
    equipnum.addItem("6");
    equipnum.addItem("7");
    equipnum.addItem("8");
    equipnum.addItem("9");
    equipnum.addItem("9");
    equipnum.addItem("10");
    
    pan4.add (borrowButton);
    pan4.add (returnButton);
    pan4.add (updateButton);
    pan4.add (searchButton);
    
    pan5.add (spaceLabel);
    pan5.add (previousButton);
    pan5.add (clearButton);
    pan5.add (nextButton);
    pan5.add (space2Label);
    
    pan7.add (searchnameLabel);
    pan7.add (searchstudentNumberLabel);
    pan7.add (searchequipmentnameLabel);
    pan7.add (searchequipmentnumLabel);
    pan7.add (searchperiodNumberLabel);
    pan7.add (searchborrowedLabel);
    pan7.add (searchreturnedLabel);
    
    
    
    //Adding panels to frame
    add(pan0);
    add(pan1);
    add(pan2);
    add(pan3);
    add(pan4);
    add(pan5);
    add(pan6);
    add(pan7);
    setVisible(true); //set panels to display in window
  }
  public void actionPerformed(ActionEvent event) 
  {
    String command = event.getActionCommand();
    if(command.equals("Borrow"))//If the save button was pressed
    {
      if(number<150)
      {
        System.out.println("Name:" + firstnameField.getText()+" "+ lastnameField.getText());
        promptLabel.setText(" " + firstnameField.getText()+" "+ lastnameField.getText()+"'s information was saved in the database");
        //Saving user's input to the arrays
        firstname[number]= firstnameField.getText();
        lastname[number]= lastnameField.getText();
        studentNumber[number]= studentNumberField.getText();
        
        equipmentName = (String)equipname.getSelectedItem();
        equipmentname[number]=equipmentName;
        equipmentNumber = (String)equipnum.getSelectedItem();
        equipmentnum[number]=equipmentNumber;
        
        periodNumber[number]= periodNumberField.getText();
        borrowed[number]=borrowedField.getText();
        returned[number]= returnedField.getText();
        //Display what the user entered back to the user
        searchnameLabel.setText("Name: "+firstname[number]+" "+lastname[number]);
        searchstudentNumberLabel.setText("Student#: "+studentNumber[number]);
        searchequipmentnumLabel.setText("Equipment#: "+equipmentnum[number]);
        searchequipmentnameLabel.setText("Equipment Name: "+equipmentname[number]);
        searchperiodNumberLabel.setText("Period#: "+periodNumber[number]);
        searchborrowedLabel.setText("Date Borrowed: "+borrowed[number]);
        searchreturnedLabel.setText("Date Returned: "+returned[number]);
        number++;
        value++;
      }
    }
    else if(command.equals("Return"))//If the return button was pressed
    {
      System.out.println("Return button pressed");
      System.out.println("Name:" + firstnameField.getText()+" "+ lastnameField.getText());
      for(int i = 0 ; i < number ; i++)
      {
        if(firstname[i].equals (firstnameField.getText()) && lastname[i].equals (lastnameField.getText()) && studentNumber[i].equals (studentNumberField.getText()) && equipmentnum[i].equals (equipmentNumber) && equipmentname[i].equals (equipmentName)&& periodNumber[i].equals (periodNumberField.getText()))
        {
          promptLabel.setText("                 " + firstnameField.getText() +" "+ lastnameField.getText());
          prompt2Label.setText("has returned their lab materials");
          for (int u = i ; u < number ; u++)
          {
            String tempfirstname = firstname [u];
            String templastname = lastname [u];
            String tempequipmentNumber = equipmentnum [u];
            String tempstudentNumber = studentNumber [u];
            firstname [u]=firstname [u+1];
            firstname [u+1]=tempfirstname;
            lastname [u]=lastname [u+1];
            lastname [u+1]=templastname;
            equipmentnum [u]=equipmentnum [u+1];
            equipmentnum [u+1]=tempequipmentNumber;
            studentNumber [u]=studentNumber [u+1];
            studentNumber [u+1]=tempstudentNumber;
          }
          value--;
          number--;
          break;
        }
        else
        {
          promptLabel.setText("The name was not found in the database");
          prompt2Label.setText("or you have not entered enough information");
        }
      }
    }
    else if(command.equals("Update"))//If the update button was pressed
    {
      System.out.println("Update button pressed");
      System.out.println("Name:" + firstnameField.getText()+" "+ lastnameField.getText());
      for (int i = 0 ; i < number ; i++)
      {
        if(firstname[i].equals (firstnameField.getText()) && lastname[i].equals (lastnameField.getText()))//Check to see if the name exists and overwrite the information stored
        {
          //Overwrite the existing information stored in each array
          studentNumber[i]= studentNumberField.getText();
          equipmentName = (String)equipname.getSelectedItem();
          equipmentname[i]=equipmentName;
          equipmentNumber = (String)equipnum.getSelectedItem();
          equipmentnum[i]=equipmentNumber;
          periodNumber[i]=periodNumberField.getText();
          borrowed[i]=borrowedField.getText();
          returned[i]=returnedField.getText();
          promptLabel.setText("    "+firstnameField.getText() +" "+ lastnameField.getText()+"'s information has been changed    ");
          //Display what the user entered back to the user
          
          searchnameLabel.setText("Name: "+firstname[i]+" "+lastname[i]);
          searchstudentNumberLabel.setText("Student#: "+studentNumber[i]);
          searchequipmentnumLabel.setText("Equipment#: "+equipmentnum[i]);
          searchequipmentnameLabel.setText("Equipment Name: "+equipmentname[i]);
          searchperiodNumberLabel.setText("Period#: "+periodNumber[i]);
          searchborrowedLabel.setText("Date Borrowed: "+borrowed[i]);
          searchreturnedLabel.setText("Date Returned: "+returned[i]);
          break;
        }
        else
        {
          promptLabel.setText("The name was not found in the database");
        }
      }
    }
    else if(command.equals("<<"))//If the left arrow buttton was pressed
    {
      System.out.println("Previous button pressed");
      System.out.println("Name:" + firstnameField.getText()+" "+ lastnameField.getText());
      if (value>0)
      {
        promptLabel.setText("               Moved to "+ firstname[value-1]+" "+lastname[value-1]);
        //Display the previous array values
        searchnameLabel.setText("Name: "+firstname[value-1]+" "+lastname[value-1]);
        searchstudentNumberLabel.setText("Student#: "+studentNumber[value-1]);
        searchequipmentnumLabel.setText("Equipment#: "+equipmentnum[value-1]);
        searchperiodNumberLabel.setText("Period#: "+periodNumber[value-1]);
        searchborrowedLabel.setText("Date Borrowed: "+borrowed[value-1]);
        searchreturnedLabel.setText("Returned: "+returned[value-1]);
        value--;
      }
      else
      {
        promptLabel.setText("               No other information was entered");
      }
    }
    else if(command.equals("Search"))//If the search button was pressed
    {
      System.out.println("Search button pressed");
      System.out.println("Name:" + firstnameField.getText()+" "+ lastnameField.getText());
      for (int i = 0 ; i < number ; i++)
      {
        if(firstname[i].equals(firstnameField.getText()) && lastname[i].equals(lastnameField.getText()) && studentNumber[i].equals (studentNumberField.getText()))//Check if the name exists in the address book
        {
          number2=i;
          promptLabel.setText("               "+firstnameField.getText()+" "+lastnameField.getText()+" was found in the database          ");
          searchnameLabel.setText("Name: "+firstname[i]+" "+lastname[i]);
          searchstudentNumberLabel.setText("Student#: "+studentNumber[i]);
          searchequipmentnumLabel.setText("Equipment#: "+equipmentnum[i]);
          searchequipmentnameLabel.setText("Equipment Name: "+equipmentname[i]);
          searchperiodNumberLabel.setText("Period#: "+periodNumber[i]);
          searchborrowedLabel.setText("Borrowed: "+borrowed[i]);
          searchreturnedLabel.setText("Returned: "+returned[i]);
          break;
        }
        else
        {
          promptLabel.setText("The name you are looking for was not found in the database");
        }
      }
      value=number2;
    }
    else if(command.equals(">>"))//If the right arrow button was pressed
    {
      System.out.println("Next button pressed");
      System.out.println("Name:" + firstnameField.getText()+" "+ lastnameField.getText());
      if (value<number-1)
      {
        promptLabel.setText("               Moved to "+firstname [value+1]+" "+lastname[value+1]);
        searchnameLabel.setText("Name: "+firstname[value+1]+" "+lastname[value+1]);
        searchstudentNumberLabel.setText("Student#: "+studentNumber[value+1]);
        searchequipmentnumLabel.setText("Equipment#: "+equipmentnum[value+1]);
        searchperiodNumberLabel.setText("Period#: "+periodNumber[value+1]);
        searchborrowedLabel.setText("Borrowed: "+borrowed[value+1]);
        searchreturnedLabel.setText("Returned: "+returned[value+1]);
        value++;
      }
      else
      {
        promptLabel.setText("                 No other information was entered");
      }
    }
    else if(command.equals("Clear"))//If the clear button was pressed
    {
      System.out.println("Clear button pressed");
      System.out.println("Name:" + firstnameField.getText()+" "+ lastnameField.getText());
      promptLabel.setText("All the fields have been cleared");
      firstnameField.setText("");
      lastnameField.setText("");
      studentNumberField.setText("");
      equipmentnumField.setText("");
      periodNumberField.setText("");
      borrowedField.setText("");
      returnedField.setText("");
    }
    
  } 
  
  //Main method
  public static void main(String[] args) 
  {
    //Start the GUI
    ChemistryStorageProgramV2 frame= new ChemistryStorageProgramV2();
  }
}