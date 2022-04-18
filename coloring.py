def gcd(a):
  n = 0
  for i in a:
    while i:
      n, i = i, n % i
  return n

def solve(a):
  odd = a[1::2]
  even = a[::2]

  odd_gcd = gcd(odd)
  even_gcd = gcd(even)

  if odd_gcd and all(i % odd_gcd != 0 for i in even):
    return odd_gcd

  if even_gcd and all(i % even_gcd != 0 for i in odd):
    return even_gcd

  return 0

def main():
    t = int(input())
    arr = []
    for _ in range(t):
        n = int(input())
        arr.append(n)
        
    x = solve(arr)
    print('Output = {0}'.format(x))

main()


