package library.bot.bgd;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MessageHandler {

    private final KeyboardMarkupFactory keyboardMarkupFactory;

    public MessageHandler(KeyboardMarkupFactory keyboardMarkupFactory) {
        this.keyboardMarkupFactory = keyboardMarkupFactory;
    }

    public void handleMessage(MyTelegramBot bot, Message message) {
        String messageText = message.getText();
        long chatId = message.getChatId();

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(String.valueOf(chatId));

        switch (messageText) {
            case "/start":
                sendMessage.setText("Оберіть спеціальність:");
                sendMessage.setReplyMarkup(keyboardMarkupFactory.getInlineKeyboard());
                break;
            case "Кібербезпека":
                sendMessage.setText("Список рекомендованих книг для спеціальності Комп'ютерні науки:\n1. Програмування на Java\n2. Алгоритми та структури даних\n3. Введення до машинного навчання\n4. Бази даних\n5. Розробка веб-додатків");
                break;
            case "Комп'ютерні науки":
                sendMessage.setText("Список рекомендованих книг для спеціальності Комп'ютерні науки:\n1. Програмування на Java\n2. Алгоритми та структури даних\n3. Введення до машинного навчання\n4. Бази даних\n5. Розробка веб-додатків");
                break;
            // Додайте інші кейси тут
            case "Назад":
                sendMessage.setText("Оберіть інститут:");
                sendMessage.setReplyMarkup(keyboardMarkupFactory.getInlineKeyboard());
                break;





            default:
                sendMessage.setText("Оберіть інститут:");
                sendMessage.setReplyMarkup(keyboardMarkupFactory.getInlineKeyboard());
                break;
        }

        try {
            bot.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }



    public void handleCallbackQuery(MyTelegramBot bot, CallbackQuery callbackQuery) {
        String callbackData = callbackQuery.getData();
        long chatId = callbackQuery.getMessage().getChatId();

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(String.valueOf(chatId));

        switch (callbackData) {
            case "civil_protection":
                sendMessage.setText("Оберіть спеціальність:");
                sendMessage.setReplyMarkup(keyboardMarkupFactory.getSpecialtiesKeyboard1());
                break;
            case "psychology_social_protection":
                sendMessage.setText("Ви обрали Інститут психології та соціального захисту");
                break;
            case "fire_technogenic_safety":
                sendMessage.setText("Ви обрали Інститут пожежної та техногенної безпеки");
                break;
            case "library_schedule":
                sendMessage.setText("Графік бібліотеки ЛДУ БЖД:\nПонеділок-П'ятниця: 9:00-18:00\nСубота: 9:00-14:00\nНеділя: вихідний");
                break;
        }

        try {
            bot.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

}
