//Calculator class

package calculater;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Calculater extends Application {

    @Override
    public void start(Stage primaryStage) {

        Table.table_draw();
        primaryStage.getIcons().add(new Image("file:p.png"));
        primaryStage.setResizable(false);
        primaryStage.setTitle("Calculater");
        primaryStage.setScene(Data.secne1);
        primaryStage.show();

        Data.secne1.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent e) {

                Act_keyboad.Equale(e);
                Act_keyboad.operators(e);
                Act_keyboad.numbers(e);
                Act_keyboad.Backspace(e);

            }
        });


    }


 public static void main(String[] args) {
      launch(args);
    }
}


//gui class

package calculater;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class gui {
    
    public static void Grid_gui(GridPane grid) {
        grid.setPadding(new Insets(10.0D, 10.0D, 10.0D, 10.0D));
    }

    public static void Clearb_gui(Button b, GridPane grid) {
        b.setFocusTraversable(false);
        b.setMinSize(150.0D, 40.0D);
        Data.grid1.add(b, 0, 5, 3, 1);
    }

    public static void operatorb_gui(Button b, GridPane grid, int c, int r) {
        b.setFocusTraversable(false);
        b.setMinSize(50.0D, 50.0D);
        grid.add(b, c, r);
    }

    public static void numberb_gui(Button b, GridPane grid, int c, int r) {
        b.setFocusTraversable(false);
        b.setMinSize(50.0D, 50.0D);
        grid.add(b, c, r);
    }

    public static void equaleb_gui(Button b, GridPane grid) {
        b.setFocusTraversable(false);
        b.setMinSize(50.0D, 90.0D);
        grid.add(b, 3, 4, 1, 2);
    }

    public static void Label_gui(Label l, GridPane grid) {
        l.setBackground(new Background(new BackgroundFill[]{new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)}));
        l.setFont(Font.font("comic sans ms", FontWeight.NORMAL, 14.0D));
        l.setMinSize(200.0D, 35.0D);
        l.setPadding(new Insets(0.0D, 0.0D, 0.0D, 7.0D));
        l.setBorder(new Border(new BorderStroke[]{new BorderStroke(Color.GRAY, BorderStrokeStyle.SOLID, (CornerRadii)null, new BorderWidths(3.0D))}));
        GridPane.setMargin(l, new Insets(0.0D, 0.0D, 10.0D, 0.0D));
        grid.add(l, 0, 0, 5, 1);
    }
}


//Table class
package calculater;


public class Table {
     public static void table_draw() {
        gui.Grid_gui(Data.grid1);
        gui.Label_gui(Data.L, Data.grid1);
        gui.numberb_gui(Data.bdot, Data.grid1, 0, 4);
        Act_Buttons.cal_bt_maker(Data.bdot);
        gui.numberb_gui(Data.b0, Data.grid1, 1, 4);
        Act_Buttons.cal_bt_maker(Data.b0);
        gui.numberb_gui(Data.b1, Data.grid1, 0, 1);
        Act_Buttons.cal_bt_maker(Data.b1);
        gui.numberb_gui(Data.b2, Data.grid1, 1, 1);
        Act_Buttons.cal_bt_maker(Data.b2);
        gui.numberb_gui(Data.b3, Data.grid1, 2, 1);
        Act_Buttons.cal_bt_maker(Data.b3);
        gui.numberb_gui(Data.b4, Data.grid1, 0, 2);
        Act_Buttons.cal_bt_maker(Data.b4);
        gui.numberb_gui(Data.b5, Data.grid1, 1, 2);
        Act_Buttons.cal_bt_maker(Data.b5);
        gui.numberb_gui(Data.b6, Data.grid1, 2, 2);
        Act_Buttons.cal_bt_maker(Data.b6);
        gui.numberb_gui(Data.b7, Data.grid1, 0, 3);
        Act_Buttons.cal_bt_maker(Data.b7);
        gui.numberb_gui(Data.b8, Data.grid1, 2, 3);
        Act_Buttons.cal_bt_maker(Data.b8);
        gui.numberb_gui(Data.b9, Data.grid1, 1, 3);
        Act_Buttons.cal_bt_maker(Data.b9);
        gui.operatorb_gui(Data.bplus, Data.grid1, 3, 1);
        Act_Buttons.cal_bt_op_maker(1, Data.bplus);
        gui.operatorb_gui(Data.bminus, Data.grid1, 3, 2);
        Act_Buttons.cal_bt_op_maker(2, Data.bminus);
        gui.operatorb_gui(Data.bmultply, Data.grid1, 3, 3);
        Act_Buttons.cal_bt_op_maker(3, Data.bmultply);
        gui.operatorb_gui(Data.bdivide, Data.grid1, 2, 4);
        Act_Buttons.cal_bt_op_maker(4, Data.bdivide);
        gui.equaleb_gui(Data.beqaul, Data.grid1);
        Act_Buttons.equal(Data.beqaul);
        gui.Clearb_gui(Data.bclear, Data.grid1);
        Act_Buttons.clear(Data.bclear);
    }
    
}


//Data class

package calculater;
import java.math.BigDecimal;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
 class Data {
     public static GridPane grid1 = new GridPane();
    public static Label L = new Label();
    public static Button bdot = new Button(".");
    public static Button b0 = new Button("0");
    public static Button b1 = new Button("1");
    public static Button b2 = new Button("2");
    public static Button b3 = new Button("3");
    public static Button b4 = new Button("4");
    public static Button b5 = new Button("5");
    public static Button b6 = new Button("6");
    public static Button b7 = new Button("7");
    public static Button b8 = new Button("8");
    public static Button b9 = new Button("9");
    public static Button bclear = new Button("CLEAR");
    public static Button bplus = new Button("+");
    public static Button bminus = new Button("-");
    public static Button bmultply = new Button("X");
    public static Button bdivide = new Button("/");
    public static Button beqaul = new Button("=");
    public static Scene secne1;
    public static String number;
    public static String Enumber;
    public static BigDecimal num1;
    public static BigDecimal num2;
    public static int nums;
    public static int operator;
    public static int start;
     
    static {
        secne1 = new Scene(grid1, 220.0D, 300.0D);
        num1 = new BigDecimal(1);
        num2 = new BigDecimal(2);
        operator = 0;
        start = 0;
    }
}


//Act_keyboard class

package calculater;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Act_keyboad {
    public static void operators(KeyEvent e) {
        if ("+-/*".contains(e.getText()) && e.getCode() != KeyCode.BACK_SPACE) {
            Data.start = 1;
            String var1 = e.getText();
            byte var2 = -1;
            switch(var1.hashCode()) {
            case 42:
                if (var1.equals("*")) {
                    var2 = 2;
                }
                break;
            case 43:
                if (var1.equals("+")) {
                    var2 = 0;
                }
            case 44:
            case 46:
            default:
                break;
            case 45:
                if (var1.equals("-")) {
                    var2 = 1;
                }
                break;
            case 47:
                if (var1.equals("/")) {
                    var2 = 3;
                }
            }

            switch(var2) {
            case 0:
                Data.operator = 1;
                break;
            case 1:
                Data.operator = 2;
                break;
            case 2:
                Data.operator = 3;
                break;
            case 3:
                Data.operator = 4;
            }

            ++Data.nums;
            if (!Data.L.getText().equals("") && !Data.L.getText().equals("please write a number")) {
                if (Data.nums == 1) {
                    if (!Data.L.getText().equals("please choose an operator")) {
                        Data.num1 = new BigDecimal(Data.L.getText());
                    }

                    if (e.getCode() != KeyCode.BACK_SPACE) {
                        Data.L.setText("");
                    }
                }
            } else {
                --Data.nums;
                Data.start = 0;
                Data.L.setText("please write a number");
            }

            if (Data.nums == 2 && e.getCode() != KeyCode.BACK_SPACE) {
                Data.num2 = new BigDecimal(Data.L.getText());
                switch(Data.operator) {
                case 1:
                    Data.L.setText(Data.num1.add(Data.num2).stripTrailingZeros().toPlainString());
                    break;
                case 2:
                    Data.L.setText(Data.num1.subtract(Data.num2).stripTrailingZeros().toPlainString());
                    break;
                case 3:
                    Data.L.setText(Data.num1.multiply(Data.num2).stripTrailingZeros().toPlainString());
                    break;
                case 4:
                    Data.L.setText(Data.num1.divide(Data.num2, 4, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString());
                }

                Data.nums = 0;
            }
        }

    }

    public static void numbers(KeyEvent e) {
        if (".0123456789".contains(e.getText()) && e.getCode() != KeyCode.BACK_SPACE) {
            if (Data.L.getText().contains("p")) {
                Data.L.setText("");
            }

            if (Data.nums == 0 && Data.start == 1) {
                Data.num1 = new BigDecimal(Data.L.getText());
                Data.L.setText("");
                Data.nums = 1;
            }

            Data.number = Data.L.getText();
            if (!Data.L.getText().contains(".") || !e.getText().equals(".")) {
                if (e.getText().equals(".") && Data.L.getText().equals("")) {
                    Data.L.setText("0.");
                } else {
                    Data.L.setText(Data.number + e.getText());
                }
            }
        }

    }

    public static void Backspace(KeyEvent e) {
        if (Data.nums == 0 && Data.operator == 0) {
            Data.start = 0;
        }

        if (e.getCode() == KeyCode.BACK_SPACE && !Data.L.getText().equals("") && !Data.L.getText().equals("please write a number") && !Data.L.getText().equals("please choose an operator")) {
            if (Data.L.getText().equals("0.")) {
                Data.L.setText("");
            } else {
                Data.L.setText(Data.L.getText().substring(0, Data.L.getText().length() - 1));
            }
        }

    }

    public static void Equale(KeyEvent e) {
        if (e.getCode() == KeyCode.ENTER) {
            if (!Data.L.getText().equals("") && !Data.L.getText().equals("please write a number")) {
                if (Data.operator == 0) {
                    Data.num1 = new BigDecimal(Data.L.getText());
                    Data.L.setText("please choose an operator");
                } else if (Data.nums != 0) {
                    Data.number = Data.L.getText();
                    BigDecimal number_Bigdecimal = new BigDecimal(Data.number);
                    switch(Data.operator) {
                    case 1:
                        Data.num1 = Data.num1.add(number_Bigdecimal);
                        break;
                    case 2:
                        Data.num1 = Data.num1.subtract(number_Bigdecimal);
                        break;
                    case 3:
                        Data.num1 = Data.num1.multiply(number_Bigdecimal);
                        break;
                    case 4:
                        Data.num1 = Data.num1.divide(number_Bigdecimal, 4, RoundingMode.HALF_UP);
                    }

                    Data.Enumber = Data.num1.stripTrailingZeros().toPlainString();
                    Data.L.setText(Data.num1.stripTrailingZeros().toPlainString());
                    Data.nums = 0;
                    Data.operator = 0;
                }
            } else {
                Data.L.setText("please write a number");
            }
        }

    }
    
}


//Act_Button class

package calculater;
import javafx.scene.control.Button;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Act_Buttons {
    public static void cal_bt_maker(Button b) {

        b.setOnAction(event -> {
            Data.Enumber=Data.L.getText();
            if (Data.L.getText().contains("p"))
                Data.L.setText("");
            if (Data.nums == 0 && Data.start == 1) {
                Data.num1 = new BigDecimal(Data.L.getText());
                Data.L.setText("");
                Data.nums = 1;
            }

            Data.number = Data.L.getText();
            if (Data.L.getText().contains(".") && b.getText().equals(".")) {

            } else if (b.getText().equals(".") && Data.L.getText().equals("")) {
                Data.L.setText("0.");
            } else {
                Data.L.setText(Data.number + b.getText());
            }

        });
    }

    public static void clear(Button clearB) {

        clearB.setOnAction(event -> {
            Data.L.setText("");
            Data.start = 0;
            Data.operator = 0;
            Data.num1 = new BigDecimal(0);
            Data.num2 = new BigDecimal(0);
            Data.nums = 0;
            Data.number = "";


        });
    }

    public static void equal(Button equalB) {

        equalB.setOnAction(event -> {

            if (Data.L.getText().equals("") || Data.L.getText().equals("please write a number")) {
                Data.L.setText("please write a number");
            } else if (Data.operator == 0) {
                Data.num1 = new BigDecimal(Data.L.getText());
                Data.L.setText("please choose an operator");
            } else if (Data.nums == 0)
            {

            }
            else {

                Data.number = Data.L.getText();
                BigDecimal number_Bigdecimal = new BigDecimal(Data.number);

                switch (Data.operator) {
                    case 1:
                        Data.num1 = Data.num1.add(number_Bigdecimal);
                        break;
                    case 2:
                        Data.num1 = Data.num1.subtract(number_Bigdecimal);
                        break;
                    case 3:
                        Data.num1 = Data.num1.multiply(number_Bigdecimal);
                        break;
                    case 4:
                        Data.num1 = Data.num1.divide(number_Bigdecimal, 4, RoundingMode.HALF_UP);
                        break;

                }

                Data.L.setText(Data.num1.stripTrailingZeros().toPlainString());
                System.out.println("this instrucths");
                Data.nums = 0;
                System.out.println(Data.nums==0);
                Data.operator = 0;

            }
        });

    }

    public static void cal_bt_op_maker(int Operator, Button Boperator) {

        Boperator.setOnAction(event -> {
           System.out.println("href"+Data.nums);
            Data.start = 1;
            Data.operator = Operator;
            Data.nums++;
            System.out.println("how "+Data.nums);
            if (Data.L.getText().equals("") || Data.L.getText().equals("please write a number")) {
                Data.nums--;
                Data.start = 0;
                Data.L.setText("please write a number");
            } else if (Data.nums == 1) {
                if (Data.L.getText().equals("please choose an operator")) {

                } else {

                    Data.num1 = new BigDecimal(Data.L.getText());
                }
                Data.L.setText("");
            }
            if (Data.nums == 2) {
                Data.num2 = new BigDecimal(Data.L.getText());
                switch (Data.operator) {
                    case 1:
                        Data.L.setText((Data.num1.add(Data.num2)).stripTrailingZeros().toPlainString());
                        break;
                    case 2:
                        Data.L.setText(Data.num1.subtract(Data.num2).stripTrailingZeros().toPlainString());
                        break;
                    case 3:

                        Data.L.setText(Data.num1.multiply(Data.num2).stripTrailingZeros().toPlainString());
                        break;
                    case 4:
                        Data.L.setText(Data.num1.divide(Data.num2, 4, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString());
                        break;
                }
                Data.nums = 0;
            }
            
        });

    }
}
