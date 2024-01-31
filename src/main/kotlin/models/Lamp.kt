package models

import utils.*

var idNum : Int = 0

class Lamp {
    // Attributes
    private var id : String = ""
    private var isOn : Boolean = false
    private var color : String = "white"
    private var intensity : Int = 1
    private val colorOptions : Array<String> = arrayOf("white","yellow","red","blue","green","cyan")
    private var colorIndex : Int = 0
    //private var idNum : Int = 0

    // Constructors -----------------------
    constructor(id:String){
        idNum++
        this.id = id + idNum
    }

    // Public Methods ---------------------
    fun turnOn(){
        if (this.isOn) println(YELLOW_BOLD_BRIGHT + "The lamp is already ON" + RESET)
        else{
            this.isOn = true
            this.color = "white"
            println(GREEN_BOLD_BRIGHT + "Lamp turned ON" + RESET)
        }
        println(this)
    }

    fun turnOff(){
        if (!this.isOn) println(YELLOW_BOLD_BRIGHT + "The lamp is already OFF" + RESET)
        else{
            this.isOn = false
            this.color = "black"
            this.colorIndex = 0
            this.intensity = 1
            println(GREEN_BOLD_BRIGHT + "Lamp turned OFF" + RESET)
        }
        println(this)
    }

    fun changeColor(){
        if (!this.isOn) println(YELLOW_BOLD_BRIGHT + "Lamp is turned OFF" + RESET)
        else{
            if (colorIndex == 5){
                colorIndex = -1
            }
            this.colorIndex++
            this.color = this.colorOptions[this.colorIndex]
            println(GREEN_BOLD_BRIGHT + "Color Changed" + RESET)

        }
        println(this)
    }

    fun intensityUp(){
        if (!this.isOn) println(YELLOW_BOLD_BRIGHT + "Lamp is turned OFF" + RESET)
        else{
            if (this.intensity == 5) println(YELLOW_BOLD_BRIGHT + "You've reached MAX Intensity!" + RESET)
            else {
                this.intensity++
                println(GREEN_BOLD_BRIGHT + " The Intensity Increased" + RESET)

            }
        }
        println(this)
    }

    fun intensityDown(){
        if (!this.isOn) println(YELLOW_BOLD_BRIGHT + "Lamp is turned OFF" + RESET)
        else{
            if (this.intensity == 1) println(YELLOW_BOLD_BRIGHT + "You've reached MIN Intensity!" + RESET)
            else {
                this.intensity--
                println(GREEN_BOLD_BRIGHT + " The Intensity Decreased" + RESET)
            }
        }
        println(this)
    }

    fun getId() : String {
        return this.id
    }

    fun setId(id:String) {
        this.id = id
    }

    fun getLampState(): String {
        return printLampState(this.isOn)
    }

    fun getActualColor() : String {
        return this.color
    }

    fun getActualIntensity() : Int {
        return this.intensity
    }

    fun getColorOptions() : Array<String> {
        return this.colorOptions
    }

    override fun toString(): String {
        return "Lamp: ${this.id}\n" +
                "The lamp is: ${printLampState(this.isOn)}\n" +
                "Actual color: ${printActualColor(this.color)}\n" +
                "Actual Intensity: ${this.intensity}\n"
    }
    // Private Methods -----------------------
    private fun printActualColor(color: String): String {
        return when (color){
            "white" -> "$BLACK_BOLD$WHITE_BACKGROUND WHITE $RESET"
            "red" -> "$BLACK_BOLD$RED_BACKGROUND RED $RESET"
            "blue" -> "$BLACK_BOLD$BLUE_BACKGROUND BLUE $RESET"
            "green" -> "$BLACK_BOLD$GREEN_BACKGROUND GREEN $RESET"
            "yellow" -> "$BLACK_BOLD$YELLOW_BACKGROUND YELLOW $RESET"
            "cyan" -> "$BLACK_BOLD$CYAN_BACKGROUND CYAN $RESET"
            else -> BLACK_BACKGROUND + "     " + RESET
        }
    }

    private fun printLampState(on: Boolean): String {
        return if (on) "On" else "Off"
    }
}