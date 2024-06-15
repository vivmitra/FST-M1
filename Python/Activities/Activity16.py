class Car:
    "This is to define properties of a car"

    def __init__(self,man,mod,mak,tans,color):
        self.manufacturer = man
        self.model = mod
        self.make = mak
        self.transmission = tans
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " is moving")

    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped")

car_bmw = Car("BMW", "X1" , "2020", "Automatic", "Black")
car_dodge = Car("Dodge", "Challenger" , "2019", "Automatic", "Yellow")
car_maruti = Car("Maruti", "WagonR" , "2011", "Manual", "Grey")

car_bmw.accelerate()
car_bmw.stop()

car_dodge.accelerate()
car_dodge.stop()

car_maruti.accelerate()
car_maruti.stop()