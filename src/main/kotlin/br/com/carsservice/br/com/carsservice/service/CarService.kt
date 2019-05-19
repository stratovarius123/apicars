package br.com.carsservice.br.com.carsservice.service

import br.com.carsservice.br.com.carsservice.model.Car
import org.springframework.stereotype.Service

@Service
class CarService{

    fun getCar(carId: Int): Car {

        val cars  = mapOf(
            1 to Car(1,"Maverik"),
            2 to Car(2,"Fusca"),
            3 to Car(3,"Brasilia")
       )

        return cars.getValue(carId)
    }



}