import random
randon = random.randint(1,3)


if randon == 1:
    computer = 'rock'
elif randon == 2:
    computer = 'paper'
elif randon == 3:
    computer = 'scissors'

def rpsgame(computer,you):
    if computer == you:
        return None
    elif computer == 'rock':
        if you == 'paper':
            return True
        elif you == 'scissors':
            return False
    elif computer == 'paper':
        if you == 'scissors':
            return True
        elif you == 'rock':
            return False
    elif computer == 'scissors':
        if you == 'paper':
            return False
        elif you == 'rock':
            return True
    
    
print("computer's turn: rock, paper, scissors ?")

you = input('your turn: rock, paper, scissors\n')

a = rpsgame(computer, you)

if a == None:
    print("unfortunately this game resulted in a tie")
elif a == True:                      
    print("congratulations, you won the game")
elif a == False:
    print("you lost, But don't worry try again and you will surely win ")

    