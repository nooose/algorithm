class Person:
    def __init__(self, id, name):
        self.id = id
        self.name = name
    def __eq__(self, id):
        if(self.id == id):
            return True
        else:
            return False
    def info(self):
        print("아이디:{0}\t이름:{1}\t".format(self.id,self.name), end="")

class Student(Person):
    def __init__(self, id, name, major):
        super().__init__(id, name)
        self.major=major
    def info(self):
        super().info()
        print("전공:{0}".format(self.major))



c = Student(202001, "홍길동", "클라우드AI보안")
a = Person(17019103, '박지수')
b = Person(17019104, '성준혁')
print(a.info())
print(b.info())
print(c.info())
