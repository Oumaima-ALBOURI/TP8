package com.tp8;

import com.tp8.notification.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n" + "=".repeat(40) + "\n");
        System.out.println("TESTS NOTIFICATIONS\n");

        // Test 1 : Notification par Email
        NotificationSender emailSender =
                new EmailNotificationSender();

        NotificationService emailService =
                new NotificationService(emailSender);

        emailService.sendWelcomeMessage("user@example.com");

        System.out.println("\n");

        // Test 2 : Notification par SMS
        NotificationSender smsSender =
                new SmsNotificationSender();

        NotificationService smsService =
                new NotificationService(smsSender);

        smsService.sendWelcomeMessage("+33612345678");
    }
}