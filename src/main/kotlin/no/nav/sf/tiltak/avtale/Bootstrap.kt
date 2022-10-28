package no.nav.sf.tiltak.avtale

import no.nav.sf.library.KafkaPosterApplication
import no.nav.sf.library.KafkaToSFPoster

fun main() = application.start()

val application = KafkaPosterApplication<String, String>(listOf(
    KafkaToSFPoster.Settings.RUN_ONCE,
    KafkaToSFPoster.Settings.FROM_BEGINNING,
    KafkaToSFPoster.Settings.NO_POST,
    KafkaToSFPoster.Settings.SAMPLE))
