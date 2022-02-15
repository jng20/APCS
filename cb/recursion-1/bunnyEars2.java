/*
Jacob Ng + Jeffery Tang
APCS
HW64 -- Revisitation
2022-02-14
time spent: .6 hr
*/

// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
//
//
// bunnyEars2(0) → 0
// bunnyEars2(1) → 2
// bunnyEars2(2) → 5

public int bunnyEars2(int bunnies) {
  if (bunnies == 0) {
    return 0;
  }
  if (bunnies%2 == 1){
      return (2 + bunnyEars2(bunnies -1));
  }else{
      return (3 + bunnyEars2(bunnies - 1));
  }
}
