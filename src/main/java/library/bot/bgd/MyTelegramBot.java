package library.bot.bgd;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;


@Component
public class MyTelegramBot extends TelegramLongPollingBot {
    private final MessageHandler messageHandler;

    public MyTelegramBot() {
        KeyboardMarkupFactory keyboardMarkupFactory = new KeyboardMarkupFactory();
        this.messageHandler = new MessageHandler(keyboardMarkupFactory);
    }

    @Override
    public String getBotUsername() {
        return "ldubgd_library_bot";
    }

    @Override
    public String getBotToken() {
        return "6681098235:AAFKIlgZ1gZZAh46kxP6vbTTK8Sb41Hrv1w";
    }


    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            System.out.println("Received message: " + update.getMessage().getText());
            messageHandler.handleMessage(this, update.getMessage());
        } else if (update.hasCallbackQuery()) {
            System.out.println("Received callback: " + update.getCallbackQuery().getData());
            messageHandler.handleCallbackQuery(this, update.getCallbackQuery());
        }
    }
}





