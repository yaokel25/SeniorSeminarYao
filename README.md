# SeniorSeminarYao
senior seminar optimization

student class
• name-string name1, string name2
• email-string email
• top choices-int choice1, int choice 2, …
• schedule-int seminar1, int seminar2 (0 or -1 if not scheduled)

seminar class:
• seminar ID-int seminarID
• schedule-int session1run, int session2run (0 or -1 if not scheduled)
• string instructor 
• int classroomNum1, int classroomNum2
• int numStudents (16 max)

classroom class:
• int classroomNum
• int seminar1ID, int seminar2ID, … 


make a list for people that still need to go to first session (make copy of arrayList of students)
loop through everyone choices and get the 5 most most requested seminars (array of int seminarID)
for most requested seminar:
while seminar is not full (seminar arrayList):
for(every’s first choice):
if(their choice is that seminar):
register that person for the seminar for session 1 
add seminar ID to that person’s list (add to student arryaList)
remove person from first session list (remove from copy of arrayList of students)
remove seminar from person’s preference list (remove from arrayList of students)

repeat for top 5 choices for every student (as long as seminar is not full) 

repeat other 4 most requested seminar:
for any seminar not full and student not assigned, randomly assigned them 
(# of time run for those sessions) ++

repeat that for 5 sessions and if (# of times run) > remove seminar from list of available seminars 

1/18:
thought about data storage (array vs ArrayList, etc)-added the data types in the explaination above
cleaned up data file (SrSeminar.csv)
finished the fil.io and tested it in the tester file 
loaded student data into arrayList of students 

1/22:
made methods getRank(), get5(), and withRank()
getRank()-tallying all student choices and putting data into array 
get5()-get top 5 choices by doing bubble sort 5 times
with Rank()-register people for seminar based on choices only

1/24:
changed individual variables in student to arrayList (choices, seminars)
started method to make schedule based off student choices and put extra students in random seminars
added an arrayList of students to seminar objects
made a 2d array of seminars called schedule which has all the seminars scheduled and the session they were scheduled in
scanned in seminar names, instructors, and IDs seperately

1/26:
finished building program (all methods)-built assignSchedule, and makeSchedule
need to debug logic in scheduling methods class Schedule
built tester class to run all schedule methods 

1/30:
tried debugging Schedule.assignSession-replaced int j with session on lines 155 and 172
figured out something is wrong with Schedule.makeSchedule-initialization of schedule[][] is changing ArrayList seminarList (line 124)
tried making a copy of seminarList and setting it equal to the copy but didn't work (would need to make a new copy of ArrayList seminarList for every session)
added people who didn't choose or didn't get their choice to least popular sessions first (didn't work-some people could not be scheduled for every session because they had done all available seminars in that session before)

2/01:
continued debugging:
couldn't figure out why ArrayList of seminars (seminarList) is being changed by calls to a different, 2-d array of Seminars (schedule)-initialized schedule different by setting it equal to a new Seminar object instead
did not have a feature to prevent students from doing a seminar twice, added that to 2nd part of assignSession
added people who didn't choose or didn't get their choice to the most popular choice first (worked but probably bad for optimization)

2/03:
added java docs and comments 

Master roster:
Seminar name: Adventure Calls: The Benefits and Challenges of Study Abroad ,Seminar ID: 1 ,Instructor Name: Gunnar Lykins    ,session number: 1 ,Room #: 1 ,# of students:  ,16 ,

Seminar name: Be Your Own Boss: Entrepreneurship Opportunities in College and Beyond ,Seminar ID: 2 ,Instructor Name: Edwin Sam ,session number: 1 ,Room #: 2 ,# of students:  ,16 ,

Seminar name: The Road Less Traveled: Finding the Right Path for You ,Seminar ID: 15 ,Instructor Name: Ishan Ghildyal ,session number: 1 ,Room #: 3 ,# of students:  ,16 ,

Seminar name: Thriving in a Highly Competitive College Environment ,Seminar ID: 16 ,Instructor Name: Mia Fatuzzo ,session number: 1 ,Room #: 4 ,# of students:  ,13 ,

Seminar name: Conquering the Concrete Jungle ,Seminar ID: 7 ,Instructor Name: Madeleine Morales ,session number: 1 ,Room #: 5 ,# of students:  ,13 ,



Seminar name: Adventure Calls: The Benefits and Challenges of Study Abroad ,Seminar ID: 1 ,Instructor Name: Gunnar Lykins    ,session number: 2 ,Room #: 1 ,# of students:  ,16 ,

Seminar name: Emergency Medical Technician: Working in the Back of an Ambulance ,Seminar ID: 9 ,Instructor Name: Grace Pettengill ,session number: 2 ,Room #: 2 ,# of students:  ,16 ,

Seminar name: Thriving in a Highly Competitive College Environment ,Seminar ID: 16 ,Instructor Name: Mia Fatuzzo ,session number: 2 ,Room #: 3 ,# of students:  ,15 ,

Seminar name: Be Your Own Boss: Entrepreneurship Opportunities in College and Beyond ,Seminar ID: 2 ,Instructor Name: Edwin Sam ,session number: 2 ,Room #: 4 ,# of students:  ,16 ,

Seminar name: The Road Less Traveled: Finding the Right Path for You ,Seminar ID: 15 ,Instructor Name: Ishan Ghildyal ,session number: 2 ,Room #: 5 ,# of students:  ,11 ,



Seminar name: Community Service and Volunteering: Making an Impact as a College Student ,Seminar ID: 6 ,Instructor Name: Nathan Grant ,session number: 3 ,Room #: 1 ,# of students:  ,16 ,

Seminar name: Conquering the Concrete Jungle ,Seminar ID: 7 ,Instructor Name: Madeleine Morales ,session number: 3 ,Room #: 2 ,# of students:  ,16 ,

Seminar name: Business Clubs: Campus Involvement and Professional Development ,Seminar ID: 3 ,Instructor Name: Blake Lykins ,session number: 3 ,Room #: 3 ,# of students:  ,16 ,

Seminar name: What Is Research When It's Not a Resume Builder? ,Seminar ID: 18 ,Instructor Name: Elizabeth Johnson ,session number: 3 ,Room #: 4 ,# of students:  ,16 ,

Seminar name: Co-Ops and Engineering Internships: Gaining Professional Experience ,Seminar ID: 8 ,Instructor Name: Gunnar Lykins ,session number: 3 ,Room #: 5 ,# of students:  ,10 ,



Seminar name: Emergency Medical Technician: Working in the Back of an Ambulance ,Seminar ID: 9 ,Instructor Name: Grace Pettengill ,session number: 4 ,Room #: 1 ,# of students:  ,16 ,

Seminar name: The Ins and Outs of Engineering Internships ,Seminar ID: 14 ,Instructor Name: Elizabeth Grace ,session number: 4 ,Room #: 2 ,# of students:  ,16 ,

Seminar name: Greek Life: From Animal House to Developing Tomorrow's Leaders ,Seminar ID: 10 ,Instructor Name: Blake Lykins ,session number: 4 ,Room #: 3 ,# of students:  ,16 ,

Seminar name: Making an Impact: Being a Leader in Student Government ,Seminar ID: 11 ,Instructor Name: Roshan Chandrakumar ,session number: 4 ,Room #: 4 ,# of students:  ,16 ,

Seminar name: So You Want to Play with Swords: Performance Martial Arts and Club Leadership  ,Seminar ID: 13 ,Instructor Name: Claire Beyette ,session number: 4 ,Room #: 5 ,# of students:  ,10 ,



Seminar name: Community Service and Volunteering: Making an Impact as a College Student ,Seminar ID: 6 ,Instructor Name: Nathan Grant ,session number: 5 ,Room #: 1 ,# of students:  ,16 ,

Seminar name: To Read or Not To Read? Interning in Publishing ,Seminar ID: 17 ,Instructor Name: Claire Beyette ,session number: 5 ,Room #: 2 ,# of students:  ,16 ,

Seminar name: What Is Research When It's Not a Resume Builder? ,Seminar ID: 18 ,Instructor Name: Elizabeth Johnson ,session number: 5 ,Room #: 3 ,# of students:  ,16 ,

Seminar name: Community Organizing and College: Participating in Your College?s Democracy  ,Seminar ID: 5 ,Instructor Name: Anna Beyette ,session number: 5 ,Room #: 4 ,# of students:  ,16 ,

Seminar name: Making an Impact: Being a Leader in Student Government ,Seminar ID: 11 ,Instructor Name: Roshan Chandrakumar ,session number: 5 ,Room #: 5 ,# of students:  ,6 ,
