# _ means protected and __ means that its a private element
import csv

class Item:
    def __init__(self, name, price, quantity):
        self._name = name
        self.__price = price
        self.quantity = quantity 
        
    @property
    # Encapsulation: this makes the data basical read only and can't be changed after initializtaion
    def name(self):
        return self._name

    @property
    def price(self):
        return self.__price