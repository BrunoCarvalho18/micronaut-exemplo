package exemplo.micronaut

import io.micronaut.scheduling.annotation.Scheduled
import org.slf4j.LoggerFactory
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Singleton


@Singleton
class HelloWorldJob {

    @Scheduled(fixedDelay = "10s")
    fun executeEveryTen() {
        LOG.info("Simples Job cada 10 segundos: {}", SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(Date()))
    }

    @Scheduled(fixedDelay = "45s", initialDelay = "5s")
    fun executeEveryFourtyFive() {
        LOG.info("Simples Job cada 45 segundos: {}", SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(Date()))
    }

    companion object {
        private val LOG = LoggerFactory.getLogger(HelloWorldJob::class.java)
    }
}