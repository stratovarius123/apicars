package br.com.carsservice.br.com.carsservice.controller

import br.com.carsservice.br.com.carsservice.model.Car
import br.com.carsservice.br.com.carsservice.service.CarService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable

@RestController
class CarsController(private val carService: CarService){

    @GetMapping(value = ["/findCarDetails/{carId}"])
    fun getCarDetails(@PathVariable carId: Int): ResponseEntity<Car> {
        return ResponseEntity.ok(carService.getCar(carId))
    }

}