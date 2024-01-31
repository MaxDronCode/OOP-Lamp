# PROJECT: LuminLabs  🏮
## Overview 👀
This is an educational project whose purpose is to practice and become familiar with object-oriented programming (OOP).
## Project Description ✍🏼
This application creates a Lamp object, which has certain attributes, a single constructor, and many unique methods which the program executes as a form of testing.

<img src="img/utilities.png" alt="Overview" width="600"/>

<img src="img/utilities.png" alt="Overview" width="600"/>

The application is organized into 3 packages. Controllers, where the [main](/src/main/kotlin/controllers/Main.kt) executable file is located, the orchestra director that runs the program. Models, where we place the data models, in this case, the [lamp](/src/main/kotlin/models/Lamp.kt). And Utils, where we will have auxiliary dependencies, a [utilities](/src/main/kotlin/utils/utilities.kt) file, and a [static class](/src/main/kotlin/utils/consoleColors.kt) that facilitates colored screen printing.

## Details 🪡
- The Lamp class has a global variable idNum that is used to track how many lamps have been created, as it is a number that gets added to the end of the id when we instantiate a Lamp object.
- There is only one constructor, which requires only one parameter, the ID (the name we will give to the lamp). The other properties are initialized with default values.
- To change the color, a property with a fixed value is used, which is an array of colors, and another property that is the index, which we vary and use to access the array and assign the color.
- The method turnOff() resets all the attributes.
- There are two private methods from which the override toString method benefits, helping with screen printing.

> [!NOTE]
> This Project has been built with Gradle and Amazon Coretto 19


























