class Song:
    total_lenght = 0

    def __init__(self, name = "sail", performer = "Awolnation", songwriter = "Aaron Bruno", genre = "alternative",
                 lenght = 4.19):
        self.name = name
        self.performer = performer
        self.songwriter = songwriter
        self.genre = genre
        self.lenght = lenght
        Song.total_lenght += lenght

    def to_string(self):
        print("Name: "+self.name+"; Performer: "+self.performer+"; Songwriter: "+self.songwriter+"; Genre: "+self.genre+"; Lenght: " + str(self.lenght))

    def print_sum(self):
        print("A song called " + self.name + " has lenght " + str(self.lenght))

    @staticmethod
    def print_static_sum():
        print("Total lenght of song is "+str(Song.total_lenght))


if __name__=='__main__':
    run = Song()
    warrior = Song("Warrion", "Alvita", "Ryan Meijer", "electro house")
    you = Song("You", "Galantis", "Britney Spears", "Progressive house", 3.40)

    run.to_string()
    warrior.to_string()
    you.to_string()

    run.print_sum()
    warrior.print_sum()
    you.print_sum()
    Song.print_static_sum()
