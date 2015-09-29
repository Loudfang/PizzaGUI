import java.awt.*;
import java.awt.event.*;


public class PizzaApp extends Frame 
{
    Frame f1 = new Frame();
    Panel p1 = new Panel();
    Panel p2 = new Panel();
    Panel p3 = new Panel();
    Panel p4 = new Panel();
    Panel p5 = new Panel();
    Panel p6 = new Panel();
    Panel p7 = new Panel();
    Label cashierName = new Label("Cashier Name:");
    Label customerName = new Label("Customer Name:");
    Label Style = new Label("Style");
    Label Option = new Label("Options");
    Label Extras = new Label("Extras");
    Label Size = new Label("Size");
    Label Dine = new Label("Dine");
    Label Total = new Label("Total");
    Label Change = new Label("Change");
    Label CashTendered = new Label("Cash Tendered");
    TextArea tArea1 = new TextArea();
   
    Choice choice = new Choice();
    Checkbox Cheese = new Checkbox("Cheese");
    Checkbox Pepperoni = new Checkbox("Pepperoni");
    Checkbox Mushroom = new Checkbox("Mushroom");
    Checkbox Pineapple = new Checkbox("Pineapple");
    Checkbox GreenPepper = new Checkbox("Green Pepper");
    TextField tf1CashierName = new TextField("");
    TextField tf1CustomerName = new TextField("");
    TextField tfTotal = new TextField("");
    TextField tfChange = new TextField("");
    TextField tfTendered = new TextField("");
    Button b1 = new Button("Compute");
    Button b2 = new Button("Change");
    Button b3 = new Button("Print Receipt");
    
    
    public PizzaApp()
    {
        p1.setLayout(new GridLayout(3,2));
        p2.setLayout(new GridLayout(7,1));
        p3.setLayout(new GridLayout(7,1));
        p4.setLayout(new GridLayout(7,1));
        p5.setLayout(new GridLayout(1,1));
        p6.setLayout(new GridLayout(2,5));
        p7.setLayout(new GridLayout(1,4));
        
        
        p1.add(cashierName);
        p1.add(tf1CashierName);
        p1.add(customerName);
        p1.add(tf1CustomerName);
        p1.add(Style);
        p1.add(choice);
        
        choice.add("-Select Pizza-");
        choice.add("Garden Fresh");
        choice.add("Super Supreme");
        choice.add("Hawaiian");
        choice.add("Meat Lovers");
        
        
        p2.add(Option); 
        p3.add(Extras); 
        p3.add(Cheese); 
        p3.add(Pepperoni); 
        p3.add(Mushroom); 
        p3.add(Pineapple); 
        p3.add(GreenPepper);
        p4.add(Size); 
        
        
        CheckboxGroup cbg = new CheckboxGroup();
        p4.add(new Checkbox("Single",cbg,true));
        p4.add(new Checkbox("Double",cbg,false));
        p4.add(new Checkbox("Family",cbg,false));
        p4.add(Dine);
        
        
        CheckboxGroup cbg2 = new CheckboxGroup();
        p4.add(new Checkbox("Dine-in",cbg,false));
        p4.add(new Checkbox("Take-out",cbg,false));
        p5.add(tArea1);
        p6.add(b1);
        p6.add(Total);
        p6.add(tfTotal);
        p6.add(CashTendered);
        p6.add(tfTendered);
        p6.add(b2);
        p6.add(Change);
        p6.add(tfChange);
        p6.add(b3);
        p7.add(p2);
        p7.add(p3);
        p7.add(p4);
        p7.add(p5);
       this.add(p1,"North");
       this.add(p7,"Center");
       this.setSize(300,300);
       this.setLocation(300,300);
       this.setTitle("Pizza App");
       this.setVisible(true);
       this.add(p6,"South");
    }
    
    public static void main(String args[])
    {
        PizzaApp Layout = new PizzaApp();
    }
}

