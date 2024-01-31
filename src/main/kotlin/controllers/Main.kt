package controllers

import models.Lamp

fun main() {
    println("------------------LAMP 1------------------")
    val kitchenLamp : Lamp = Lamp("KitchenLamp")
    kitchenLamp.turnOn()
    kitchenLamp.changeColor()
    kitchenLamp.changeColor()
    kitchenLamp.changeColor()
    kitchenLamp.intensityUp()
    kitchenLamp.intensityUp()
    kitchenLamp.intensityUp()
    kitchenLamp.intensityUp()

    println("------------------LAMP 2------------------")
    val livingRoomLamp : Lamp = Lamp("LivingRoom")
    livingRoomLamp.turnOn()
    livingRoomLamp.changeColor()
    livingRoomLamp.changeColor()
    livingRoomLamp.intensityUp()
    livingRoomLamp.intensityUp()
    livingRoomLamp.intensityUp()
    livingRoomLamp.intensityUp()
    livingRoomLamp.turnOff()
    livingRoomLamp.changeColor()
    livingRoomLamp.turnOn()
    livingRoomLamp.changeColor()
    livingRoomLamp.intensityUp()
    livingRoomLamp.intensityUp()
    livingRoomLamp.intensityUp()
    livingRoomLamp.intensityUp()
}