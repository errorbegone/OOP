class Solution:
    def __init__(self, val = 0):
        self.var = val
    def set(self, val):
        self.var = val
    def inc(self):
        try:
            self.var += 1
        except TypeError:
            print("Please reset to an appropriate integer val...")
            return
        return self.val

obj1 = Solution()

obj1.var = "1" # breaking encapsualtion
print(obj1.inc())
print(type(obj1))