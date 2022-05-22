/**
 * https://leetcode.com/problems/arranging-coins/
n=

n=1 
        [1]//!stair
				
n=2
				[1]
				[1] //1 stair
n=3
				[1]
				[1][1]//2stair
		|
		|
		|

1+2+3+4 --------nth=n(n+1)/2stairs

Brut Force:- 
lets see if n=6
int i=1;
while (n>=i){ //6>1 yes! //5>2 yes! //3=3 yes!
    n=n-i;//6-1=5 // 5-2=3 // 3-3=0
    i++;//2 //3//4
}

return i-1;

    .
    ..
    ...

    =====================T&C=================
    time=O(N)
    space=O(1)


===============================Optimize Approch==========================

formula 1+2+3+4----------------------n=n(n+1)/2
if n=7 then we have 7*8/2=28 coins

n^2 +4/2 ==> ( n ^2/2 + n/2) <=x
 x is coin given

 if n=15
 start=1 end = 15
 mid=s+e/2=8
 is (8sqr/2+8/2) <=15 No!
  therefore end =mid-1

  NOw end=7 mid=4
  is (4sqr/2+2) <=15 yes!
  therefore start=mid+1
  start=5 and end =7 mid=6
  is (6sqr/2 +6/2)<=15 no!
  end=mid-1 //5
  end=5 and start=5 mid=5
  is (5sqr/2 +5/2)<= 15 yes!
  therefore start=mid+1 // start=6 end=5 loop break return end
 */




class Solution {
    public int arrangeCoins(int n) {
        // int i=1;
        // while(n>=i){
        //     n = n-i;
        //     i++;
        // }
        // return i-1;
        
        long start=0;
        long end = n;
        while(start<=end){
           long mid=start +(end-start)/2;
            if(mid*(mid+1)/2 == n){
                return (int)mid;
            }else if(mid*(mid+1)/2 > n){
                end = mid-1;
            }else{
                start= mid+1;
            }
        }
        return (int)end;
    }
}