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

