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





