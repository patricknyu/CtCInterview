#8_2

###Q:
Imagine you have a call center with three levels of employees: respondent, manager, and director. An incoming telephone call must be first allocated to a respondent who is free. If the respondent can't handle the call, he or she must escalate the call to a manager. If the manager is not free or not able to handle it, then the call should be escalated to a director. Design the classes and data structures for thisproblem. Implement a method dispatchCall() which assigns a call to the first available employee.

###A:
I want to create a class for employees.  Then we have a respondent class which extends employee, a manager class which extends respondent, and a director class which extends manager. 

Their solution was a way better than mine. They have a Call, Rank, and CallHandler class in addition to the one's I suggested.

The call and rank classes are pretty cool.  The rank class uses the enum feature.  The CallHandler is where most of the stuff runs.  It works well.

I'm going to recreate some of them since I liked their solution so much.
