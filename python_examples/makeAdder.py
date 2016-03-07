## CreatingCreating a function that increments from a given (closed-over) starting value, using a closure
def makeAdder(x):
    def inc(y):
        return x+y
    return inc

inc5  = makeAdder(5)
inc10 = makeAdder(10)

print(inc5 (2)) # 7
print(inc10(2)) # 12