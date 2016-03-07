## Tail recursion in Python. Tail call optimization is not implemented though!
def call_1000_times(count):
    if count == 1000:
        return True
    else:
        return call_1000_times(count + 1)
    
call_1000_times(10000)