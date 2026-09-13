class Solution:
    def permute(self, nums):
        def gen(nums):
            n = len(nums)
            if n == 0 : yield []
            else:
                for i in range(n):
                    for cc in gen(nums[:i] + nums[i+1:]):
                        yield [nums[i]] + cc
        return list(gen(nums))