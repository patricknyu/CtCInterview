#6_6

##Q:
There are 100 closed lockers in a hallway. A man begins by opening all 100 lockers. Next, he closes every second locker. Then, on his third pass, he toggles every third locker (closes it if it is open or opens it if it is closed). This process continues for 100passes, such that on each pass i, the man toggles every ith locker. After his 100th pass in the hallway, in which he toggles only locker #100, how many lockers are open?

##A:
So we realize that a door j is toggled for every factor of itself and j and 1.  So doors that will be left open when there an odd number of changes on the locker.  We realize that odd changes will happen when when j is a perfect square since each other number 1-100 will have matches.  For example 24 will have (1,24),(2,12),(3,8),(4,6).  When we have a perfect square since that means that there will be one pair with a repeated number.  For example 36 will have a double at the (6,6) pair.  Now we just ask how many perfect square are there under 100.  There are 10.  They occur at 1*1, 2*2, ... , 10*10.
