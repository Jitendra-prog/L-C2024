import random

def isValidGuess(userInput):
    return userInput.isdigit() and 1 <= int(userInput) <= 100

def playNumberGuessingGame():
    targetNumber = random.randint(1, 100)
    isGameWon = False
    userGuess = input("Guess a number between 1 and 100: ")
    numberOfGuesses = 0
    while not isGameWon:
        if not isValidGuess(userGuess):
            userGuess = input("Invalid input. Please enter a number between 1 to 100: ")
            continue
        else:
            numberOfGuesses += 1
            userGuess = int(userGuess)

        if userGuess < targetNumber:
            userGuess = input("Too low. Guess again: ")
        elif userGuess > targetNumber:
            userGuess = input("Too High. Guess again: ")
        else:
            print("You guessed it in ",numberOfGuesses," guesses!")
            isGameWon = True


playNumberGuessingGame()