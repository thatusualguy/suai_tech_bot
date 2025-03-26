package ru.thatusualguy.suai_tech_bot

import eu.vendeli.tgbot.TelegramBot

suspend fun main() {
//    val cfg = ConfigLoaderBuilder.default()
//        .addResourceSource("/config-dev.yaml", optional = true)
//        .addResourceSource("/config-prod.yaml", optional = true)
//        .build()
//        .loadConfigOrThrow<Config>()

    val apiToken = System.getenv("suai_bot_api_token") ?: throw Exception("suai_bot_api_token is not set")
    val bot = TelegramBot(apiToken)

    bot.handleUpdates()
}


