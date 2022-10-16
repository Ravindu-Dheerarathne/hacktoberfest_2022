import sys
def factorial(n):
	res = [None]*500
	res[0] = 1
	res_size = 1
	x = 2
	while x <= n:
		res_size = multiply(x, res, res_size)
		x = x + 1

	print("Factorial of given number is")
	i = res_size-1
	while i >= 0:
		sys.stdout.write(str(res[i]))
		sys.stdout.flush()
		i = i - 1
def multiply(x, res, res_size):
	carry = 0 # Initialize carry
	i = 0
	while i < res_size:
		prod = res[i] * x + carry
		res[i] = prod % 10 
		carry = prod//10 
		i = i + 1
	while (carry):
		res[res_size] = carry % 10
		carry = carry // 10
		res_size = res_size + 1

	return res_size

factorial(100)

# This code is contributed by Nishant Choudhary.
