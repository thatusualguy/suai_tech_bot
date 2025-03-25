package ru.thatusualguy.suai_aisd_bot.controller

import eu.vendeli.tgbot.TelegramBot
import eu.vendeli.tgbot.annotations.CommandHandler
import eu.vendeli.tgbot.api.common.poll
import eu.vendeli.tgbot.api.message.message
import eu.vendeli.tgbot.types.User
import eu.vendeli.tgbot.types.component.ProcessedUpdate

class PollController {
    @CommandHandler(["/event_poll"])
    suspend fun publishPoll(update: ProcessedUpdate, bot: TelegramBot, user: User) {
        val pollAnswers = arrayOf("Я пойду", "Позовите меня", "Я не пойду")

        poll("Вы пойдете?"){
            pollAnswers.forEach {
                option { it }
            }
        }.options {
            isAnonymous = false
            allowsMultipleAnswers = false
        }.send(user, bot)
    }
}