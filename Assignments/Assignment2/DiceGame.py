import random

def rollDice(diceSides):
    return random.randint(1, diceSides)

def playDiceGame():
    diceSides = 6
    isPlaying = True

    while isPlaying:
        userInput = input("Press Enter to roll the dice (or 'Q' to quit): ")
        if userInput.lower() == 'q':
            isPlaying = False
        else:
            diceOutcome = rollDice(diceSides)
            print(f"You got a {diceOutcome}")

if __name__ == "__main__":
    playDiceGame()