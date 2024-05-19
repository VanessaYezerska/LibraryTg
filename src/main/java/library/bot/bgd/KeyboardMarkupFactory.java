package library.bot.bgd;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import java.util.ArrayList;
import java.util.List;


public class KeyboardMarkupFactory {
    public InlineKeyboardMarkup getInlineKeyboard() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Інститут цивільного захисту");
        button1.setCallbackData("civil_protection");

        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Інститут психології та соціального захисту");
        button2.setCallbackData("psychology_social_protection");

        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Інститут пожежної та техногенної безпеки");
        button3.setCallbackData("fire_technogenic_safety");

        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Графік бібліотеки ЛДУ БЖД");
        button4.setCallbackData("library_schedule");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        keyboardButtonsRow1.add(button1);

        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        keyboardButtonsRow2.add(button2);

        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        keyboardButtonsRow3.add(button3);

        List<InlineKeyboardButton> keyboardButtonsRow4 = new ArrayList<>();
        keyboardButtonsRow4.add(button4);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow2);
        rowList.add(keyboardButtonsRow3);
        rowList.add(keyboardButtonsRow4);

        inlineKeyboardMarkup.setKeyboard(rowList);

        return inlineKeyboardMarkup;
    }


    public ReplyKeyboardMarkup getSpecialtiesKeyboard1() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("Кібербезпека"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("Комп'ютерні науки"));
        keyboard.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("Екологія"));
        keyboard.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("Цивільна безпека"));
        keyboard.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        row5.add(new KeyboardButton("Назад"));
        keyboard.add(row5);

        replyKeyboardMarkup.setKeyboard(keyboard);
        return replyKeyboardMarkup;
    }
    public ReplyKeyboardMarkup getSpecialtiesKeyboard2() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("Кібербезпека"));
        keyboard.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("Комп'ютерні науки"));
        keyboard.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("Екологія"));
        keyboard.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("Цивільна безпека"));
        keyboard.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        row5.add(new KeyboardButton("Назад"));
        keyboard.add(row5);

        replyKeyboardMarkup.setKeyboard(keyboard);
        return replyKeyboardMarkup;
    }

}


