package ch.keepclam.aot.basics

import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.ApplicationListener
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.annotation.Id
import org.springframework.data.repository.CrudRepository

@Configuration
class BasicsConfigurations {

    @Bean
    fun basicsApplicationListener(repository: CustomerRepository) : ApplicationListener<ApplicationReadyEvent> {
        return ApplicationListener<ApplicationReadyEvent> {
            listOf("A", "B", "C")
                .map {
                    name -> repository.save(Customer(id = null, name = name))
                }.forEach(System.out::println)
        }
    }
}

interface CustomerRepository : CrudRepository<Customer, Integer>
data class Customer (@Id val id: Integer?, val name: String)
