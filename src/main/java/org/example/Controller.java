package org.example;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    private Button checkButton;

    @FXML
    private Text symbolsNumText;

    @FXML
    private Text palindromeText;

    @FXML
    private TextField stringInput;

    @FXML
    void btnChecking(ActionEvent event)
    {
        String introdusedStr = new String(stringInput.getText());
        symbolsNumText.setText(Integer.toString(introdusedStr.length()));
        // Проверка на ввод строки
        if(introdusedStr == "")
            return;
        else
        {
            PalindromCheck pCheck = new PalindromCheck();
            if(pCheck.chekStr(introdusedStr))
                palindromeText.setText("Да");
            else
                palindromeText.setText("Нет");
        }
    }
}
