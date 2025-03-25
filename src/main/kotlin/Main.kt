package ru.thatusualguy.suai_aisd_bot

import com.sksamuel.hoplite.ConfigLoaderBuilder
import com.sksamuel.hoplite.addResourceSource
import eu.vendeli.tgbot.TelegramBot
import eu.vendeli.tgbot.utils.common.onPollAnswer

suspend fun main() {

    val cfg = ConfigLoaderBuilder.default()
        .addResourceSource("/config-dev.yaml", optional = true)
//        .addResourceSource("/config-prod.yaml", optional = true)
        .build()
        .loadConfigOrThrow<Config>()

    val bot = TelegramBot(cfg.tg_api_key)

    bot.handleUpdates()
}


