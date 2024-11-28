# Dice-Rolling-Simulator (for RPG)


## Description
This project is a dice-rolling simulator tailored for role-playing games (RPGs). Users can simulate rolling a 10-sided dice, with options to:
- Roll the dice up to 10 times per session, the user chooses how many times they wish to roll the dice
- Return meanings for the highest and lowest rolled values based on predefined rules: 
  - 10 -> Critical Success
  - 9 -> Success
  - 8 | 7 | 6 -> Partial Success
  - 5 | 4 | 3 -> Failure
  - 1 | 2 -> critical Failure

## Features
- Roll a 10-sided dice (1-10 values).
- Simulate up to 10 rolls per session.
- Interpret the highest and lowest rolls with custom meanings for your RPG.

---

## To-Do List
- [x] Create the base simulator for a 6-sided dice.
- [ ] Implement a 10-sided dice simulation.
- [ ] Allow the user to choose the number of rolls (up to 10).
- [ ] Store the highest and lowest values for each session.
- [ ] Define and implement meanings for dice values:
    - [ ] Map meanings for value rolled (Key: dice number : Value: "meaning of Value")
- [ ] Display results including:
    - Total rolls
    - Highest and lowest values of the session
    - Associated meanings
- [ ] Add error handling for invalid input.
- [ ] Write unit tests to ensure accuracy of dice rolls and logic.
- [ ] Enhance the user interface for better readability (ASCII art for the dice rolls).
- [ ] Update the README with instructions and examples.

---

## Example Output

```java
public String displayDice(int rolledNumber) {
    switch (rolledNumber) {
        case 1:
            return " _________ \n/         \\\n|    1    |\n\\_________/";
        case 2:
            return " _________ \n/         \\\n|    2    |\n\\_________/";
        case 3: 
            return " _________ \n/         \\\n|    3    |\n\\_________/";
        case 4:
            return " _________ \n/         \\\n|    4    |\n\\_________/";
        case 5:
            return " _________ \n/         \\\n|    5    |\n\\_________/";
        case 6:
            return " _________ \n/         \\\n|    6    |\n\\_________/";
        case 7:
            return " _________ \n/         \\\n|    7    |\n\\_________/";
        case 8:
            return " _________ \n/         \\\n|    8    |\n\\_________/";
        case 9:
            return " _________ \n/         \\\n|    9    |\n\\_________/";
        case 10:
            return " _________ \n/         \\\n|   10    |\n\\_________/";
        default:
            return "Invalid dice roll.";
    }
}


