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
Seminar name: Adventure Calls: The Benefits and Challenges of Study Abroad ,Seminar ID: 1 ,Instructor Name: Gunnar Lykins    ,session number: 1 ,Room #: 1 ,# of students:  ,16 ,Students: [email: pohla@countryday.net ,name: Alexandra Marie Pohl ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 16 Seminar 4: 9 Seminar 5: 6
, email: formana@countryday.net ,name: Annabel August Forman ,Seminar 1: 1 Seminar 2: 16 Seminar 3: 15 Seminar 4: 6 Seminar 5: 14
, email: kovachh@countryday.net ,name: Helen Kovach ,Seminar 1: 1 Seminar 2: 15 Seminar 3: 16 Seminar 4: 18 Seminar 5: 6
, email: alberth@countryday.net ,name: Herschel Morris Albert ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 6 Seminar 4: 3 Seminar 5: 14
, email: sullivanj@countryday.net ,name: Jack Michael Kestner Sullivan ,Seminar 1: 1 Seminar 2: 16 Seminar 3: 7 Seminar 4: 8 Seminar 5: 6
, email: rennerj@countryday.net ,name: Jacob Renner ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 16 Seminar 4: 3 Seminar 5: 6
, email: settersk@countryday.net ,name: Katelynn Renee Setters ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 6 Seminar 4: 3 Seminar 5: 11
, email: farrelll@countryday.net ,name: Lily Taylor Farrell ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 6 Seminar 4: 3 Seminar 5: 10
, email: hartenm@countryday.net ,name: Mary C. Harten ,Seminar 1: 1 Seminar 2: 15 Seminar 3: 2 Seminar 4: 18 Seminar 5: 10
, email: fatuzzos@countryday.net ,name: Stephen Holden Fatuzzo ,Seminar 1: 1 Seminar 2: 9 Seminar 3: 16 Seminar 4: 6 Seminar 5: 14
, email: yangy@countryday.net ,name: Yuxi Yang ,Seminar 1: 1 Seminar 2: 16 Seminar 3: 15 Seminar 4: 6 Seminar 5: 14
, email: lie@countryday.net ,name: Enyi Li ,Seminar 1: 1 Seminar 2: 16 Seminar 3: 6 Seminar 4: 3 Seminar 5: 10
, email: cercekg@countryday.net ,name: Gavin L. Cercek ,Seminar 1: 1 Seminar 2: 9 Seminar 3: 16 Seminar 4: 8 Seminar 5: 14
, email: hettingep@countryday.net ,name: Paige E. Hettinger ,Seminar 1: 1 Seminar 2: 9 Seminar 3: 2 Seminar 4: 6 Seminar 5: 10
, email: hamalla@countryday.net ,name: Alec Daniel Hamall ,Seminar 1: 1 Seminar 2: 9 Seminar 3: 6 Seminar 4: 3 Seminar 5: 10
, email: brants@countryday.net ,name: Samantha Rose Brant ,Seminar 1: 1 Seminar 2: 15 Seminar 3: 16 Seminar 4: 8 Seminar 5: 10
]

Seminar name: Be Your Own Boss: Entrepreneurship Opportunities in College and Beyond ,Seminar ID: 2 ,Instructor Name: Edwin Sam ,session number: 1 ,Room #: 2 ,# of students:  ,16 ,Students: [email: osborna@countryday.net ,name: Andrew Pendleton (Andy) Osborn ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 15 Seminar 4: 6 Seminar 5: 14
, email: buechlyt@countryday.net ,name: Anthony Jacob (Tony) Buechly ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 15 Seminar 4: 3 Seminar 5: 6
, email: rame@countryday.net ,name: Emily Marie Ram ,Seminar 1: 2 Seminar 2: 15 Seminar 3: 7 Seminar 4: 3 Seminar 5: 6
, email: bursef@countryday.net ,name: Francis Burse ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 7 Seminar 4: 3 Seminar 5: 6
, email: taylorhu@countryday.net ,name: Hunter Levi Taylor ,Seminar 1: 2 Seminar 2: 15 Seminar 3: 7 Seminar 4: 3 Seminar 5: 6
, email: midham@countryday.net ,name: Manav Dev Midha ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 6 Seminar 4: 3 Seminar 5: 10
, email: cordean@countryday.net ,name: Nicholas William (Nick) Cordea ,Seminar 1: 2 Seminar 2: 15 Seminar 3: 16 Seminar 4: 6 Seminar 5: 10
, email: thompsond@countryday.net ,name: Dylan Niles Thompson ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 7 Seminar 4: 3 Seminar 5: 10
, email: chandrakru@countryday.net ,name: Ruben Chandrakumar ,Seminar 1: 2 Seminar 2: 15 Seminar 3: 16 Seminar 4: 3 Seminar 5: 11
, email: ellerj@countryday.net ,name: Jeremy Eller ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 7 Seminar 4: 8 Seminar 5: 6
, email: paynej@countryday.net ,name: Joshua Jabez (Josh) Payne ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 16 Seminar 4: 8 Seminar 5: 14
, email: riemannn@countryday.net ,name: Nathaniel Christopher (Nathan) Riemann ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 15 Seminar 4: 8 Seminar 5: 6
, email: williamsb@countryday.net ,name: Bryon Michael Williamson ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 6 Seminar 4: 8 Seminar 5: 14
, email: kerschnee@countryday.net ,name: Eric William Kerschner ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 6 Seminar 4: 18 Seminar 5: 8
, email: jeffriese@countryday.net ,name: Ethan Mikal Jeffries ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 7 Seminar 4: 3 Seminar 5: 11
, email: taylors@countryday.net ,name: Samuel Taylor ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 15 Seminar 4: 8 Seminar 5: 14
]

Seminar name: Business Clubs: Campus Involvement and Professional Development ,Seminar ID: 15 ,Instructor Name: Blake Lykins ,session number: 1 ,Room #: 3 ,# of students:  ,16 ,Students: [email: maggarda@countryday.net ,name: Abigail Maye (Abby) Maggard ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 6
, email: webbc@countryday.net ,name: Chloe Renee Webb ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 6 Seminar 4: 9 Seminar 5: 11
, email: westonf@countryday.net ,name: Frank Weston ,Seminar 1: 15 Seminar 2: 16 Seminar 3: 6 Seminar 4: 18 Seminar 5: 8
, email: smithn@countryday.net ,name: Genevieve Claire (Nevie) Smith ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 2 Seminar 4: 6 Seminar 5: 8
, email: pfisterm@countryday.net ,name: Grace (Morgan) Pfister ,Seminar 1: 15 Seminar 2: 16 Seminar 3: 2 Seminar 4: 18 Seminar 5: 14
, email: hessh@countryday.net ,name: Hannah Rose Hess ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 6
, email: reiringj@countryday.net ,name: Jane (Janie) Reiring ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 6
, email: valenk@countryday.net ,name: Katherine Rhea Valen ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 8
, email: boazk@countryday.net ,name: Kayla M. Boaz ,Seminar 1: 15 Seminar 2: 2 Seminar 3: 6 Seminar 4: 18 Seminar 5: 10
, email: hoffmanl@countryday.net ,name: Lindsey Renee Hoffman ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 14
, email: wrightm@countryday.net ,name: Margaret Langdon (Maggie) Wright ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 8
, email: lutzm@countryday.net ,name: Mia E. Lutz ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 8
, email: briggsm@countryday.net ,name: Molly Molloy Briggs ,Seminar 1: 15 Seminar 2: 16 Seminar 3: 2 Seminar 4: 18 Seminar 5: 10
, email: yardleyo@countryday.net ,name: Olivia Audrey Yardley ,Seminar 1: 15 Seminar 2: 9 Seminar 3: 2 Seminar 4: 18 Seminar 5: 10
, email: bakers@countryday.net ,name: Sydney Renee Baker ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 6 Seminar 4: 8 Seminar 5: 14
, email: zalantsv@countryday.net ,name: Valen Irene Zalants ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 8
]

Seminar name: College Decisions: Choosing a Historically Black College over a Predominately White Institution ,Seminar ID: 16 ,Instructor Name: Liah Apatira ,session number: 1 ,Room #: 4 ,# of students:  ,13 ,Students: [email: kellara@countryday.net ,name: Ava Kellar ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 3 Seminar 5: 11
, email: stewarts@countryday.net ,name: Sean Christopher Stewart ,Seminar 1: 16 Seminar 2: 9 Seminar 3: 2 Seminar 4: 8 Seminar 5: 14
, email: puckettt@countryday.net ,name: Trevor B. Puckett ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 7 Seminar 4: 18 Seminar 5: 8
, email: dickersog@countryday.net ,name: Garrett Janning Dickerson ,Seminar 1: 16 Seminar 2: 9 Seminar 3: 6 Seminar 4: 8 Seminar 5: 10
, email: gersonn@countryday.net ,name: Nathaniel Whitney (Nate) Gerson ,Seminar 1: 16 Seminar 2: 15 Seminar 3: 6 Seminar 4: 18 Seminar 5: 10
, email: snellst@countryday.net ,name: Sterling Elijah Snell ,Seminar 1: 16 Seminar 2: 9 Seminar 3: 15 Seminar 4: 6 Seminar 5: 8
, email: phillipsc@countryday.net ,name: Catherine M. Phillips ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 6 Seminar 5: 14
, email: kellert@countryday.net ,name: Victoria Louise (Tori) Keller ,Seminar 1: 16 Seminar 2: 15 Seminar 3: 6 Seminar 4: 18 Seminar 5: 8
, email:  ,name: Haotong Lu ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 18 Seminar 5: 8
, email:  ,name: Mia Masterson ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 8 Seminar 5: 11
, email:  ,name: Olivia Scheper ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 8 Seminar 5: 11
, email:  ,name: Colin Sam ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 8 Seminar 5: 11
, email:  ,name: Kylan Young ,Seminar 1: 16 Seminar 2: 15 Seminar 3: 2 Seminar 4: 8 Seminar 5: 11
]

Seminar name: Community Organizing and College: Participating in Your College?s Democracy  ,Seminar ID: 7 ,Instructor Name: Anna Beyette ,session number: 1 ,Room #: 5 ,# of students:  ,13 ,Students: [email: raminenia@countryday.net ,name: Aadhyasri Ramineni ,Seminar 1: 7 Seminar 2: 9 Seminar 3: 16 Seminar 4: 6 Seminar 5: 10
, email: gonzalese@countryday.net ,name: Emily Susan Gonzales ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 6 Seminar 4: 18 Seminar 5: 8
, email: fleischme@countryday.net ,name: Eric Robert Fleischmann ,Seminar 1: 7 Seminar 2: 9 Seminar 3: 16 Seminar 4: 18 Seminar 5: 6
, email: straleyg@countryday.net ,name: Grace Virginia Straley ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 16 Seminar 4: 6 Seminar 5: 8
, email: lylem@countryday.net ,name: Harrison (Miller) Lyle ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 2 Seminar 4: 6 Seminar 5: 8
, email: folanm@countryday.net ,name: Maxwell Richard Folan ,Seminar 1: 7 Seminar 2: 15 Seminar 3: 16 Seminar 4: 6 Seminar 5: 8
, email: hatcherm@countryday.net ,name: Moseley Quinn (Mose) Hatcher ,Seminar 1: 7 Seminar 2: 2 Seminar 3: 16 Seminar 4: 6 Seminar 5: 14
, email: mangur@countryday.net ,name: Radha Venkata Mangu ,Seminar 1: 7 Seminar 2: 2 Seminar 3: 16 Seminar 4: 18 Seminar 5: 6
, email: shihn@countryday.net ,name: Nellie Yushuan Shih ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 15 Seminar 4: 8 Seminar 5: 14
, email: jaccacis@countryday.net ,name: Samuel A. (Sam) Jaccaci ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 15 Seminar 4: 6 Seminar 5: 11
, email: goingsc@countryday.net ,name: William (Chase) Goings ,Seminar 1: 7 Seminar 2: 16 Seminar 3: 2 Seminar 4: 18 Seminar 5: 6
, email: nguyenn@countryday.net ,name: Nicholas Minh (Nick) Nguyen ,Seminar 1: 7 Seminar 2: 2 Seminar 3: 16 Seminar 4: 3 Seminar 5: 10
, email: mcneile@countryday.net ,name: Emma Rachael McNeil ,Seminar 1: 7 Seminar 2: 9 Seminar 3: 2 Seminar 4: 6 Seminar 5: 8
]



Seminar name: Adventure Calls: The Benefits and Challenges of Study Abroad ,Seminar ID: 1 ,Instructor Name: Gunnar Lykins    ,session number: 2 ,Room #: 1 ,# of students:  ,16 ,Students: [email: gonzalese@countryday.net ,name: Emily Susan Gonzales ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 6 Seminar 4: 18 Seminar 5: 8
, email: straleyg@countryday.net ,name: Grace Virginia Straley ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 16 Seminar 4: 6 Seminar 5: 8
, email: lylem@countryday.net ,name: Harrison (Miller) Lyle ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 2 Seminar 4: 6 Seminar 5: 8
, email: maggarda@countryday.net ,name: Abigail Maye (Abby) Maggard ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 6
, email: webbc@countryday.net ,name: Chloe Renee Webb ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 6 Seminar 4: 9 Seminar 5: 11
, email: smithn@countryday.net ,name: Genevieve Claire (Nevie) Smith ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 2 Seminar 4: 6 Seminar 5: 8
, email: hessh@countryday.net ,name: Hannah Rose Hess ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 6
, email: reiringj@countryday.net ,name: Jane (Janie) Reiring ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 6
, email: valenk@countryday.net ,name: Katherine Rhea Valen ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 8
, email: hoffmanl@countryday.net ,name: Lindsey Renee Hoffman ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 14
, email: wrightm@countryday.net ,name: Margaret Langdon (Maggie) Wright ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 8
, email: lutzm@countryday.net ,name: Mia E. Lutz ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 8
, email: bakers@countryday.net ,name: Sydney Renee Baker ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 6 Seminar 4: 8 Seminar 5: 14
, email: zalantsv@countryday.net ,name: Valen Irene Zalants ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 8
, email: shihn@countryday.net ,name: Nellie Yushuan Shih ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 15 Seminar 4: 8 Seminar 5: 14
, email: jaccacis@countryday.net ,name: Samuel A. (Sam) Jaccaci ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 15 Seminar 4: 6 Seminar 5: 11
]

Seminar name: Be Your Own Boss: Entrepreneurship Opportunities in College and Beyond ,Seminar ID: 9 ,Instructor Name: Edwin Sam ,session number: 2 ,Room #: 2 ,# of students:  ,16 ,Students: [email: mcneile@countryday.net ,name: Emma Rachael McNeil ,Seminar 1: 7 Seminar 2: 9 Seminar 3: 2 Seminar 4: 6 Seminar 5: 8
, email: kerschnee@countryday.net ,name: Eric William Kerschner ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 6 Seminar 4: 18 Seminar 5: 8
, email: hettingep@countryday.net ,name: Paige E. Hettinger ,Seminar 1: 1 Seminar 2: 9 Seminar 3: 2 Seminar 4: 6 Seminar 5: 10
, email: stewarts@countryday.net ,name: Sean Christopher Stewart ,Seminar 1: 16 Seminar 2: 9 Seminar 3: 2 Seminar 4: 8 Seminar 5: 14
, email: snellst@countryday.net ,name: Sterling Elijah Snell ,Seminar 1: 16 Seminar 2: 9 Seminar 3: 15 Seminar 4: 6 Seminar 5: 8
, email: fatuzzos@countryday.net ,name: Stephen Holden Fatuzzo ,Seminar 1: 1 Seminar 2: 9 Seminar 3: 16 Seminar 4: 6 Seminar 5: 14
, email: osborna@countryday.net ,name: Andrew Pendleton (Andy) Osborn ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 15 Seminar 4: 6 Seminar 5: 14
, email: hamalla@countryday.net ,name: Alec Daniel Hamall ,Seminar 1: 1 Seminar 2: 9 Seminar 3: 6 Seminar 4: 3 Seminar 5: 10
, email: raminenia@countryday.net ,name: Aadhyasri Ramineni ,Seminar 1: 7 Seminar 2: 9 Seminar 3: 16 Seminar 4: 6 Seminar 5: 10
, email: fleischme@countryday.net ,name: Eric Robert Fleischmann ,Seminar 1: 7 Seminar 2: 9 Seminar 3: 16 Seminar 4: 18 Seminar 5: 6
, email: bursef@countryday.net ,name: Francis Burse ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 7 Seminar 4: 3 Seminar 5: 6
, email: dickersog@countryday.net ,name: Garrett Janning Dickerson ,Seminar 1: 16 Seminar 2: 9 Seminar 3: 6 Seminar 4: 8 Seminar 5: 10
, email: yardleyo@countryday.net ,name: Olivia Audrey Yardley ,Seminar 1: 15 Seminar 2: 9 Seminar 3: 2 Seminar 4: 18 Seminar 5: 10
, email: cercekg@countryday.net ,name: Gavin L. Cercek ,Seminar 1: 1 Seminar 2: 9 Seminar 3: 16 Seminar 4: 8 Seminar 5: 14
, email: thompsond@countryday.net ,name: Dylan Niles Thompson ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 7 Seminar 4: 3 Seminar 5: 10
, email: paynej@countryday.net ,name: Joshua Jabez (Josh) Payne ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 16 Seminar 4: 8 Seminar 5: 14
]

Seminar name: Business Clubs: Campus Involvement and Professional Development ,Seminar ID: 16 ,Instructor Name: Blake Lykins ,session number: 2 ,Room #: 3 ,# of students:  ,15 ,Students: [email: formana@countryday.net ,name: Annabel August Forman ,Seminar 1: 1 Seminar 2: 16 Seminar 3: 15 Seminar 4: 6 Seminar 5: 14
, email: sullivanj@countryday.net ,name: Jack Michael Kestner Sullivan ,Seminar 1: 1 Seminar 2: 16 Seminar 3: 7 Seminar 4: 8 Seminar 5: 6
, email: yangy@countryday.net ,name: Yuxi Yang ,Seminar 1: 1 Seminar 2: 16 Seminar 3: 15 Seminar 4: 6 Seminar 5: 14
, email: buechlyt@countryday.net ,name: Anthony Jacob (Tony) Buechly ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 15 Seminar 4: 3 Seminar 5: 6
, email: ellerj@countryday.net ,name: Jeremy Eller ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 7 Seminar 4: 8 Seminar 5: 6
, email: riemannn@countryday.net ,name: Nathaniel Christopher (Nathan) Riemann ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 15 Seminar 4: 8 Seminar 5: 6
, email: goingsc@countryday.net ,name: William (Chase) Goings ,Seminar 1: 7 Seminar 2: 16 Seminar 3: 2 Seminar 4: 18 Seminar 5: 6
, email: midham@countryday.net ,name: Manav Dev Midha ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 6 Seminar 4: 3 Seminar 5: 10
, email: williamsb@countryday.net ,name: Bryon Michael Williamson ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 6 Seminar 4: 8 Seminar 5: 14
, email: westonf@countryday.net ,name: Frank Weston ,Seminar 1: 15 Seminar 2: 16 Seminar 3: 6 Seminar 4: 18 Seminar 5: 8
, email: lie@countryday.net ,name: Enyi Li ,Seminar 1: 1 Seminar 2: 16 Seminar 3: 6 Seminar 4: 3 Seminar 5: 10
, email: jeffriese@countryday.net ,name: Ethan Mikal Jeffries ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 7 Seminar 4: 3 Seminar 5: 11
, email: pfisterm@countryday.net ,name: Grace (Morgan) Pfister ,Seminar 1: 15 Seminar 2: 16 Seminar 3: 2 Seminar 4: 18 Seminar 5: 14
, email: briggsm@countryday.net ,name: Molly Molloy Briggs ,Seminar 1: 15 Seminar 2: 16 Seminar 3: 2 Seminar 4: 18 Seminar 5: 10
, email: taylors@countryday.net ,name: Samuel Taylor ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 15 Seminar 4: 8 Seminar 5: 14
]

Seminar name: College Decisions: Choosing a Historically Black College over a Predominately White Institution ,Seminar ID: 2 ,Instructor Name: Liah Apatira ,session number: 2 ,Room #: 4 ,# of students:  ,16 ,Students: [email: pohla@countryday.net ,name: Alexandra Marie Pohl ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 16 Seminar 4: 9 Seminar 5: 6
, email: hatcherm@countryday.net ,name: Moseley Quinn (Mose) Hatcher ,Seminar 1: 7 Seminar 2: 2 Seminar 3: 16 Seminar 4: 6 Seminar 5: 14
, email: mangur@countryday.net ,name: Radha Venkata Mangu ,Seminar 1: 7 Seminar 2: 2 Seminar 3: 16 Seminar 4: 18 Seminar 5: 6
, email: rennerj@countryday.net ,name: Jacob Renner ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 16 Seminar 4: 3 Seminar 5: 6
, email: settersk@countryday.net ,name: Katelynn Renee Setters ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 6 Seminar 4: 3 Seminar 5: 11
, email: farrelll@countryday.net ,name: Lily Taylor Farrell ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 6 Seminar 4: 3 Seminar 5: 10
, email: kellara@countryday.net ,name: Ava Kellar ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 3 Seminar 5: 11
, email: alberth@countryday.net ,name: Herschel Morris Albert ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 6 Seminar 4: 3 Seminar 5: 14
, email: nguyenn@countryday.net ,name: Nicholas Minh (Nick) Nguyen ,Seminar 1: 7 Seminar 2: 2 Seminar 3: 16 Seminar 4: 3 Seminar 5: 10
, email: boazk@countryday.net ,name: Kayla M. Boaz ,Seminar 1: 15 Seminar 2: 2 Seminar 3: 6 Seminar 4: 18 Seminar 5: 10
, email: phillipsc@countryday.net ,name: Catherine M. Phillips ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 6 Seminar 5: 14
, email: puckettt@countryday.net ,name: Trevor B. Puckett ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 7 Seminar 4: 18 Seminar 5: 8
, email:  ,name: Haotong Lu ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 18 Seminar 5: 8
, email:  ,name: Mia Masterson ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 8 Seminar 5: 11
, email:  ,name: Olivia Scheper ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 8 Seminar 5: 11
, email:  ,name: Colin Sam ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 8 Seminar 5: 11
]

Seminar name: Community Organizing and College: Participating in Your College?s Democracy  ,Seminar ID: 15 ,Instructor Name: Anna Beyette ,session number: 2 ,Room #: 5 ,# of students:  ,11 ,Students: [email: kellert@countryday.net ,name: Victoria Louise (Tori) Keller ,Seminar 1: 16 Seminar 2: 15 Seminar 3: 6 Seminar 4: 18 Seminar 5: 8
, email: hartenm@countryday.net ,name: Mary C. Harten ,Seminar 1: 1 Seminar 2: 15 Seminar 3: 2 Seminar 4: 18 Seminar 5: 10
, email: rame@countryday.net ,name: Emily Marie Ram ,Seminar 1: 2 Seminar 2: 15 Seminar 3: 7 Seminar 4: 3 Seminar 5: 6
, email: cordean@countryday.net ,name: Nicholas William (Nick) Cordea ,Seminar 1: 2 Seminar 2: 15 Seminar 3: 16 Seminar 4: 6 Seminar 5: 10
, email: gersonn@countryday.net ,name: Nathaniel Whitney (Nate) Gerson ,Seminar 1: 16 Seminar 2: 15 Seminar 3: 6 Seminar 4: 18 Seminar 5: 10
, email: folanm@countryday.net ,name: Maxwell Richard Folan ,Seminar 1: 7 Seminar 2: 15 Seminar 3: 16 Seminar 4: 6 Seminar 5: 8
, email: kovachh@countryday.net ,name: Helen Kovach ,Seminar 1: 1 Seminar 2: 15 Seminar 3: 16 Seminar 4: 18 Seminar 5: 6
, email: taylorhu@countryday.net ,name: Hunter Levi Taylor ,Seminar 1: 2 Seminar 2: 15 Seminar 3: 7 Seminar 4: 3 Seminar 5: 6
, email: brants@countryday.net ,name: Samantha Rose Brant ,Seminar 1: 1 Seminar 2: 15 Seminar 3: 16 Seminar 4: 8 Seminar 5: 10
, email: chandrakru@countryday.net ,name: Ruben Chandrakumar ,Seminar 1: 2 Seminar 2: 15 Seminar 3: 16 Seminar 4: 3 Seminar 5: 11
, email:  ,name: Kylan Young ,Seminar 1: 16 Seminar 2: 15 Seminar 3: 2 Seminar 4: 8 Seminar 5: 11
]



Seminar name: Adventure Calls: The Benefits and Challenges of Study Abroad ,Seminar ID: 6 ,Instructor Name: Gunnar Lykins    ,session number: 3 ,Room #: 1 ,# of students:  ,16 ,Students: [email: hamalla@countryday.net ,name: Alec Daniel Hamall ,Seminar 1: 1 Seminar 2: 9 Seminar 3: 6 Seminar 4: 3 Seminar 5: 10
, email: dickersog@countryday.net ,name: Garrett Janning Dickerson ,Seminar 1: 16 Seminar 2: 9 Seminar 3: 6 Seminar 4: 8 Seminar 5: 10
, email: gersonn@countryday.net ,name: Nathaniel Whitney (Nate) Gerson ,Seminar 1: 16 Seminar 2: 15 Seminar 3: 6 Seminar 4: 18 Seminar 5: 10
, email: kellert@countryday.net ,name: Victoria Louise (Tori) Keller ,Seminar 1: 16 Seminar 2: 15 Seminar 3: 6 Seminar 4: 18 Seminar 5: 8
, email: midham@countryday.net ,name: Manav Dev Midha ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 6 Seminar 4: 3 Seminar 5: 10
, email: gonzalese@countryday.net ,name: Emily Susan Gonzales ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 6 Seminar 4: 18 Seminar 5: 8
, email: boazk@countryday.net ,name: Kayla M. Boaz ,Seminar 1: 15 Seminar 2: 2 Seminar 3: 6 Seminar 4: 18 Seminar 5: 10
, email: lie@countryday.net ,name: Enyi Li ,Seminar 1: 1 Seminar 2: 16 Seminar 3: 6 Seminar 4: 3 Seminar 5: 10
, email: bakers@countryday.net ,name: Sydney Renee Baker ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 6 Seminar 4: 8 Seminar 5: 14
, email: williamsb@countryday.net ,name: Bryon Michael Williamson ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 6 Seminar 4: 8 Seminar 5: 14
, email: kerschnee@countryday.net ,name: Eric William Kerschner ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 6 Seminar 4: 18 Seminar 5: 8
, email: webbc@countryday.net ,name: Chloe Renee Webb ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 6 Seminar 4: 9 Seminar 5: 11
, email: westonf@countryday.net ,name: Frank Weston ,Seminar 1: 15 Seminar 2: 16 Seminar 3: 6 Seminar 4: 18 Seminar 5: 8
, email: alberth@countryday.net ,name: Herschel Morris Albert ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 6 Seminar 4: 3 Seminar 5: 14
, email: settersk@countryday.net ,name: Katelynn Renee Setters ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 6 Seminar 4: 3 Seminar 5: 11
, email: farrelll@countryday.net ,name: Lily Taylor Farrell ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 6 Seminar 4: 3 Seminar 5: 10
]

Seminar name: Be Your Own Boss: Entrepreneurship Opportunities in College and Beyond ,Seminar ID: 7 ,Instructor Name: Edwin Sam ,session number: 3 ,Room #: 2 ,# of students:  ,16 ,Students: [email: taylorhu@countryday.net ,name: Hunter Levi Taylor ,Seminar 1: 2 Seminar 2: 15 Seminar 3: 7 Seminar 4: 3 Seminar 5: 6
, email: sullivanj@countryday.net ,name: Jack Michael Kestner Sullivan ,Seminar 1: 1 Seminar 2: 16 Seminar 3: 7 Seminar 4: 8 Seminar 5: 6
, email: thompsond@countryday.net ,name: Dylan Niles Thompson ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 7 Seminar 4: 3 Seminar 5: 10
, email: hessh@countryday.net ,name: Hannah Rose Hess ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 6
, email: reiringj@countryday.net ,name: Jane (Janie) Reiring ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 6
, email: valenk@countryday.net ,name: Katherine Rhea Valen ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 8
, email: wrightm@countryday.net ,name: Margaret Langdon (Maggie) Wright ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 8
, email: lutzm@countryday.net ,name: Mia E. Lutz ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 8
, email: zalantsv@countryday.net ,name: Valen Irene Zalants ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 8
, email: bursef@countryday.net ,name: Francis Burse ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 7 Seminar 4: 3 Seminar 5: 6
, email: ellerj@countryday.net ,name: Jeremy Eller ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 7 Seminar 4: 8 Seminar 5: 6
, email: jeffriese@countryday.net ,name: Ethan Mikal Jeffries ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 7 Seminar 4: 3 Seminar 5: 11
, email: maggarda@countryday.net ,name: Abigail Maye (Abby) Maggard ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 6
, email: hoffmanl@countryday.net ,name: Lindsey Renee Hoffman ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 14
, email: puckettt@countryday.net ,name: Trevor B. Puckett ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 7 Seminar 4: 18 Seminar 5: 8
, email: rame@countryday.net ,name: Emily Marie Ram ,Seminar 1: 2 Seminar 2: 15 Seminar 3: 7 Seminar 4: 3 Seminar 5: 6
]

Seminar name: Business Clubs: Campus Involvement and Professional Development ,Seminar ID: 16 ,Instructor Name: Blake Lykins ,session number: 3 ,Room #: 3 ,# of students:  ,16 ,Students: [email: pohla@countryday.net ,name: Alexandra Marie Pohl ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 16 Seminar 4: 9 Seminar 5: 6
, email: fatuzzos@countryday.net ,name: Stephen Holden Fatuzzo ,Seminar 1: 1 Seminar 2: 9 Seminar 3: 16 Seminar 4: 6 Seminar 5: 14
, email: raminenia@countryday.net ,name: Aadhyasri Ramineni ,Seminar 1: 7 Seminar 2: 9 Seminar 3: 16 Seminar 4: 6 Seminar 5: 10
, email: straleyg@countryday.net ,name: Grace Virginia Straley ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 16 Seminar 4: 6 Seminar 5: 8
, email: mangur@countryday.net ,name: Radha Venkata Mangu ,Seminar 1: 7 Seminar 2: 2 Seminar 3: 16 Seminar 4: 18 Seminar 5: 6
, email: kovachh@countryday.net ,name: Helen Kovach ,Seminar 1: 1 Seminar 2: 15 Seminar 3: 16 Seminar 4: 18 Seminar 5: 6
, email: rennerj@countryday.net ,name: Jacob Renner ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 16 Seminar 4: 3 Seminar 5: 6
, email: cordean@countryday.net ,name: Nicholas William (Nick) Cordea ,Seminar 1: 2 Seminar 2: 15 Seminar 3: 16 Seminar 4: 6 Seminar 5: 10
, email: brants@countryday.net ,name: Samantha Rose Brant ,Seminar 1: 1 Seminar 2: 15 Seminar 3: 16 Seminar 4: 8 Seminar 5: 10
, email: nguyenn@countryday.net ,name: Nicholas Minh (Nick) Nguyen ,Seminar 1: 7 Seminar 2: 2 Seminar 3: 16 Seminar 4: 3 Seminar 5: 10
, email: chandrakru@countryday.net ,name: Ruben Chandrakumar ,Seminar 1: 2 Seminar 2: 15 Seminar 3: 16 Seminar 4: 3 Seminar 5: 11
, email: fleischme@countryday.net ,name: Eric Robert Fleischmann ,Seminar 1: 7 Seminar 2: 9 Seminar 3: 16 Seminar 4: 18 Seminar 5: 6
, email: folanm@countryday.net ,name: Maxwell Richard Folan ,Seminar 1: 7 Seminar 2: 15 Seminar 3: 16 Seminar 4: 6 Seminar 5: 8
, email: hatcherm@countryday.net ,name: Moseley Quinn (Mose) Hatcher ,Seminar 1: 7 Seminar 2: 2 Seminar 3: 16 Seminar 4: 6 Seminar 5: 14
, email: cercekg@countryday.net ,name: Gavin L. Cercek ,Seminar 1: 1 Seminar 2: 9 Seminar 3: 16 Seminar 4: 8 Seminar 5: 14
, email: paynej@countryday.net ,name: Joshua Jabez (Josh) Payne ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 16 Seminar 4: 8 Seminar 5: 14
]

Seminar name: College Decisions: Choosing a Historically Black College over a Predominately White Institution ,Seminar ID: 2 ,Instructor Name: Liah Apatira ,session number: 3 ,Room #: 4 ,# of students:  ,11 ,Students: [email: lylem@countryday.net ,name: Harrison (Miller) Lyle ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 2 Seminar 4: 6 Seminar 5: 8
, email: smithn@countryday.net ,name: Genevieve Claire (Nevie) Smith ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 2 Seminar 4: 6 Seminar 5: 8
, email: hettingep@countryday.net ,name: Paige E. Hettinger ,Seminar 1: 1 Seminar 2: 9 Seminar 3: 2 Seminar 4: 6 Seminar 5: 10
, email: hartenm@countryday.net ,name: Mary C. Harten ,Seminar 1: 1 Seminar 2: 15 Seminar 3: 2 Seminar 4: 18 Seminar 5: 10
, email: mcneile@countryday.net ,name: Emma Rachael McNeil ,Seminar 1: 7 Seminar 2: 9 Seminar 3: 2 Seminar 4: 6 Seminar 5: 8
, email: goingsc@countryday.net ,name: William (Chase) Goings ,Seminar 1: 7 Seminar 2: 16 Seminar 3: 2 Seminar 4: 18 Seminar 5: 6
, email: yardleyo@countryday.net ,name: Olivia Audrey Yardley ,Seminar 1: 15 Seminar 2: 9 Seminar 3: 2 Seminar 4: 18 Seminar 5: 10
, email: stewarts@countryday.net ,name: Sean Christopher Stewart ,Seminar 1: 16 Seminar 2: 9 Seminar 3: 2 Seminar 4: 8 Seminar 5: 14
, email: pfisterm@countryday.net ,name: Grace (Morgan) Pfister ,Seminar 1: 15 Seminar 2: 16 Seminar 3: 2 Seminar 4: 18 Seminar 5: 14
, email: briggsm@countryday.net ,name: Molly Molloy Briggs ,Seminar 1: 15 Seminar 2: 16 Seminar 3: 2 Seminar 4: 18 Seminar 5: 10
, email:  ,name: Kylan Young ,Seminar 1: 16 Seminar 2: 15 Seminar 3: 2 Seminar 4: 8 Seminar 5: 11
]

Seminar name: Community Organizing and College: Participating in Your College?s Democracy  ,Seminar ID: 15 ,Instructor Name: Anna Beyette ,session number: 3 ,Room #: 5 ,# of students:  ,15 ,Students: [email: snellst@countryday.net ,name: Sterling Elijah Snell ,Seminar 1: 16 Seminar 2: 9 Seminar 3: 15 Seminar 4: 6 Seminar 5: 8
, email: formana@countryday.net ,name: Annabel August Forman ,Seminar 1: 1 Seminar 2: 16 Seminar 3: 15 Seminar 4: 6 Seminar 5: 14
, email: yangy@countryday.net ,name: Yuxi Yang ,Seminar 1: 1 Seminar 2: 16 Seminar 3: 15 Seminar 4: 6 Seminar 5: 14
, email: riemannn@countryday.net ,name: Nathaniel Christopher (Nathan) Riemann ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 15 Seminar 4: 8 Seminar 5: 6
, email: shihn@countryday.net ,name: Nellie Yushuan Shih ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 15 Seminar 4: 8 Seminar 5: 14
, email: jaccacis@countryday.net ,name: Samuel A. (Sam) Jaccaci ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 15 Seminar 4: 6 Seminar 5: 11
, email: osborna@countryday.net ,name: Andrew Pendleton (Andy) Osborn ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 15 Seminar 4: 6 Seminar 5: 14
, email: buechlyt@countryday.net ,name: Anthony Jacob (Tony) Buechly ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 15 Seminar 4: 3 Seminar 5: 6
, email: taylors@countryday.net ,name: Samuel Taylor ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 15 Seminar 4: 8 Seminar 5: 14
, email: phillipsc@countryday.net ,name: Catherine M. Phillips ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 6 Seminar 5: 14
, email: kellara@countryday.net ,name: Ava Kellar ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 3 Seminar 5: 11
, email:  ,name: Haotong Lu ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 18 Seminar 5: 8
, email:  ,name: Mia Masterson ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 8 Seminar 5: 11
, email:  ,name: Olivia Scheper ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 8 Seminar 5: 11
, email:  ,name: Colin Sam ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 8 Seminar 5: 11
]



Seminar name: Adventure Calls: The Benefits and Challenges of Study Abroad ,Seminar ID: 6 ,Instructor Name: Gunnar Lykins    ,session number: 4 ,Room #: 1 ,# of students:  ,16 ,Students: [email: raminenia@countryday.net ,name: Aadhyasri Ramineni ,Seminar 1: 7 Seminar 2: 9 Seminar 3: 16 Seminar 4: 6 Seminar 5: 10
, email: straleyg@countryday.net ,name: Grace Virginia Straley ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 16 Seminar 4: 6 Seminar 5: 8
, email: lylem@countryday.net ,name: Harrison (Miller) Lyle ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 2 Seminar 4: 6 Seminar 5: 8
, email: smithn@countryday.net ,name: Genevieve Claire (Nevie) Smith ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 2 Seminar 4: 6 Seminar 5: 8
, email: hettingep@countryday.net ,name: Paige E. Hettinger ,Seminar 1: 1 Seminar 2: 9 Seminar 3: 2 Seminar 4: 6 Seminar 5: 10
, email: formana@countryday.net ,name: Annabel August Forman ,Seminar 1: 1 Seminar 2: 16 Seminar 3: 15 Seminar 4: 6 Seminar 5: 14
, email: fatuzzos@countryday.net ,name: Stephen Holden Fatuzzo ,Seminar 1: 1 Seminar 2: 9 Seminar 3: 16 Seminar 4: 6 Seminar 5: 14
, email: yangy@countryday.net ,name: Yuxi Yang ,Seminar 1: 1 Seminar 2: 16 Seminar 3: 15 Seminar 4: 6 Seminar 5: 14
, email: osborna@countryday.net ,name: Andrew Pendleton (Andy) Osborn ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 15 Seminar 4: 6 Seminar 5: 14
, email: cordean@countryday.net ,name: Nicholas William (Nick) Cordea ,Seminar 1: 2 Seminar 2: 15 Seminar 3: 16 Seminar 4: 6 Seminar 5: 10
, email: folanm@countryday.net ,name: Maxwell Richard Folan ,Seminar 1: 7 Seminar 2: 15 Seminar 3: 16 Seminar 4: 6 Seminar 5: 8
, email: hatcherm@countryday.net ,name: Moseley Quinn (Mose) Hatcher ,Seminar 1: 7 Seminar 2: 2 Seminar 3: 16 Seminar 4: 6 Seminar 5: 14
, email: mcneile@countryday.net ,name: Emma Rachael McNeil ,Seminar 1: 7 Seminar 2: 9 Seminar 3: 2 Seminar 4: 6 Seminar 5: 8
, email: snellst@countryday.net ,name: Sterling Elijah Snell ,Seminar 1: 16 Seminar 2: 9 Seminar 3: 15 Seminar 4: 6 Seminar 5: 8
, email: jaccacis@countryday.net ,name: Samuel A. (Sam) Jaccaci ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 15 Seminar 4: 6 Seminar 5: 11
, email: phillipsc@countryday.net ,name: Catherine M. Phillips ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 6 Seminar 5: 14
]

Seminar name: Be Your Own Boss: Entrepreneurship Opportunities in College and Beyond ,Seminar ID: 3 ,Instructor Name: Edwin Sam ,session number: 4 ,Room #: 2 ,# of students:  ,16 ,Students: [email: thompsond@countryday.net ,name: Dylan Niles Thompson ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 7 Seminar 4: 3 Seminar 5: 10
, email: nguyenn@countryday.net ,name: Nicholas Minh (Nick) Nguyen ,Seminar 1: 7 Seminar 2: 2 Seminar 3: 16 Seminar 4: 3 Seminar 5: 10
, email: lie@countryday.net ,name: Enyi Li ,Seminar 1: 1 Seminar 2: 16 Seminar 3: 6 Seminar 4: 3 Seminar 5: 10
, email: rennerj@countryday.net ,name: Jacob Renner ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 16 Seminar 4: 3 Seminar 5: 6
, email: settersk@countryday.net ,name: Katelynn Renee Setters ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 6 Seminar 4: 3 Seminar 5: 11
, email: farrelll@countryday.net ,name: Lily Taylor Farrell ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 6 Seminar 4: 3 Seminar 5: 10
, email: bursef@countryday.net ,name: Francis Burse ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 7 Seminar 4: 3 Seminar 5: 6
, email: jeffriese@countryday.net ,name: Ethan Mikal Jeffries ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 7 Seminar 4: 3 Seminar 5: 11
, email: alberth@countryday.net ,name: Herschel Morris Albert ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 6 Seminar 4: 3 Seminar 5: 14
, email: rame@countryday.net ,name: Emily Marie Ram ,Seminar 1: 2 Seminar 2: 15 Seminar 3: 7 Seminar 4: 3 Seminar 5: 6
, email: taylorhu@countryday.net ,name: Hunter Levi Taylor ,Seminar 1: 2 Seminar 2: 15 Seminar 3: 7 Seminar 4: 3 Seminar 5: 6
, email: buechlyt@countryday.net ,name: Anthony Jacob (Tony) Buechly ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 15 Seminar 4: 3 Seminar 5: 6
, email: chandrakru@countryday.net ,name: Ruben Chandrakumar ,Seminar 1: 2 Seminar 2: 15 Seminar 3: 16 Seminar 4: 3 Seminar 5: 11
, email: kellara@countryday.net ,name: Ava Kellar ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 3 Seminar 5: 11
, email: midham@countryday.net ,name: Manav Dev Midha ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 6 Seminar 4: 3 Seminar 5: 10
, email: hamalla@countryday.net ,name: Alec Daniel Hamall ,Seminar 1: 1 Seminar 2: 9 Seminar 3: 6 Seminar 4: 3 Seminar 5: 10
]

Seminar name: Business Clubs: Campus Involvement and Professional Development ,Seminar ID: 18 ,Instructor Name: Blake Lykins ,session number: 4 ,Room #: 3 ,# of students:  ,16 ,Students: [email: puckettt@countryday.net ,name: Trevor B. Puckett ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 7 Seminar 4: 18 Seminar 5: 8
, email: kovachh@countryday.net ,name: Helen Kovach ,Seminar 1: 1 Seminar 2: 15 Seminar 3: 16 Seminar 4: 18 Seminar 5: 6
, email: kerschnee@countryday.net ,name: Eric William Kerschner ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 6 Seminar 4: 18 Seminar 5: 8
, email: boazk@countryday.net ,name: Kayla M. Boaz ,Seminar 1: 15 Seminar 2: 2 Seminar 3: 6 Seminar 4: 18 Seminar 5: 10
, email: hartenm@countryday.net ,name: Mary C. Harten ,Seminar 1: 1 Seminar 2: 15 Seminar 3: 2 Seminar 4: 18 Seminar 5: 10
, email: fleischme@countryday.net ,name: Eric Robert Fleischmann ,Seminar 1: 7 Seminar 2: 9 Seminar 3: 16 Seminar 4: 18 Seminar 5: 6
, email: briggsm@countryday.net ,name: Molly Molloy Briggs ,Seminar 1: 15 Seminar 2: 16 Seminar 3: 2 Seminar 4: 18 Seminar 5: 10
, email: mangur@countryday.net ,name: Radha Venkata Mangu ,Seminar 1: 7 Seminar 2: 2 Seminar 3: 16 Seminar 4: 18 Seminar 5: 6
, email: gersonn@countryday.net ,name: Nathaniel Whitney (Nate) Gerson ,Seminar 1: 16 Seminar 2: 15 Seminar 3: 6 Seminar 4: 18 Seminar 5: 10
, email: gonzalese@countryday.net ,name: Emily Susan Gonzales ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 6 Seminar 4: 18 Seminar 5: 8
, email: goingsc@countryday.net ,name: William (Chase) Goings ,Seminar 1: 7 Seminar 2: 16 Seminar 3: 2 Seminar 4: 18 Seminar 5: 6
, email: westonf@countryday.net ,name: Frank Weston ,Seminar 1: 15 Seminar 2: 16 Seminar 3: 6 Seminar 4: 18 Seminar 5: 8
, email: pfisterm@countryday.net ,name: Grace (Morgan) Pfister ,Seminar 1: 15 Seminar 2: 16 Seminar 3: 2 Seminar 4: 18 Seminar 5: 14
, email: yardleyo@countryday.net ,name: Olivia Audrey Yardley ,Seminar 1: 15 Seminar 2: 9 Seminar 3: 2 Seminar 4: 18 Seminar 5: 10
, email: kellert@countryday.net ,name: Victoria Louise (Tori) Keller ,Seminar 1: 16 Seminar 2: 15 Seminar 3: 6 Seminar 4: 18 Seminar 5: 8
, email:  ,name: Haotong Lu ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 18 Seminar 5: 8
]

Seminar name: College Decisions: Choosing a Historically Black College over a Predominately White Institution ,Seminar ID: 8 ,Instructor Name: Liah Apatira ,session number: 4 ,Room #: 4 ,# of students:  ,16 ,Students: [email: williamsb@countryday.net ,name: Bryon Michael Williamson ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 6 Seminar 4: 8 Seminar 5: 14
, email: cercekg@countryday.net ,name: Gavin L. Cercek ,Seminar 1: 1 Seminar 2: 9 Seminar 3: 16 Seminar 4: 8 Seminar 5: 14
, email: ellerj@countryday.net ,name: Jeremy Eller ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 7 Seminar 4: 8 Seminar 5: 6
, email: paynej@countryday.net ,name: Joshua Jabez (Josh) Payne ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 16 Seminar 4: 8 Seminar 5: 14
, email: riemannn@countryday.net ,name: Nathaniel Christopher (Nathan) Riemann ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 15 Seminar 4: 8 Seminar 5: 6
, email: shihn@countryday.net ,name: Nellie Yushuan Shih ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 15 Seminar 4: 8 Seminar 5: 14
, email: brants@countryday.net ,name: Samantha Rose Brant ,Seminar 1: 1 Seminar 2: 15 Seminar 3: 16 Seminar 4: 8 Seminar 5: 10
, email: taylors@countryday.net ,name: Samuel Taylor ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 15 Seminar 4: 8 Seminar 5: 14
, email: dickersog@countryday.net ,name: Garrett Janning Dickerson ,Seminar 1: 16 Seminar 2: 9 Seminar 3: 6 Seminar 4: 8 Seminar 5: 10
, email: bakers@countryday.net ,name: Sydney Renee Baker ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 6 Seminar 4: 8 Seminar 5: 14
, email: sullivanj@countryday.net ,name: Jack Michael Kestner Sullivan ,Seminar 1: 1 Seminar 2: 16 Seminar 3: 7 Seminar 4: 8 Seminar 5: 6
, email: stewarts@countryday.net ,name: Sean Christopher Stewart ,Seminar 1: 16 Seminar 2: 9 Seminar 3: 2 Seminar 4: 8 Seminar 5: 14
, email:  ,name: Mia Masterson ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 8 Seminar 5: 11
, email:  ,name: Olivia Scheper ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 8 Seminar 5: 11
, email:  ,name: Colin Sam ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 8 Seminar 5: 11
, email:  ,name: Kylan Young ,Seminar 1: 16 Seminar 2: 15 Seminar 3: 2 Seminar 4: 8 Seminar 5: 11
]

Seminar name: Community Organizing and College: Participating in Your College?s Democracy  ,Seminar ID: 9 ,Instructor Name: Anna Beyette ,session number: 4 ,Room #: 5 ,# of students:  ,10 ,Students: [email: maggarda@countryday.net ,name: Abigail Maye (Abby) Maggard ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 6
, email: webbc@countryday.net ,name: Chloe Renee Webb ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 6 Seminar 4: 9 Seminar 5: 11
, email: hoffmanl@countryday.net ,name: Lindsey Renee Hoffman ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 14
, email: hessh@countryday.net ,name: Hannah Rose Hess ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 6
, email: reiringj@countryday.net ,name: Jane (Janie) Reiring ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 6
, email: valenk@countryday.net ,name: Katherine Rhea Valen ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 8
, email: wrightm@countryday.net ,name: Margaret Langdon (Maggie) Wright ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 8
, email: lutzm@countryday.net ,name: Mia E. Lutz ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 8
, email: zalantsv@countryday.net ,name: Valen Irene Zalants ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 8
, email: pohla@countryday.net ,name: Alexandra Marie Pohl ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 16 Seminar 4: 9 Seminar 5: 6
]



Seminar name: Adventure Calls: The Benefits and Challenges of Study Abroad ,Seminar ID: 6 ,Instructor Name: Gunnar Lykins    ,session number: 5 ,Room #: 1 ,# of students:  ,16 ,Students: [email: kovachh@countryday.net ,name: Helen Kovach ,Seminar 1: 1 Seminar 2: 15 Seminar 3: 16 Seminar 4: 18 Seminar 5: 6
, email: sullivanj@countryday.net ,name: Jack Michael Kestner Sullivan ,Seminar 1: 1 Seminar 2: 16 Seminar 3: 7 Seminar 4: 8 Seminar 5: 6
, email: pohla@countryday.net ,name: Alexandra Marie Pohl ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 16 Seminar 4: 9 Seminar 5: 6
, email: rennerj@countryday.net ,name: Jacob Renner ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 16 Seminar 4: 3 Seminar 5: 6
, email: buechlyt@countryday.net ,name: Anthony Jacob (Tony) Buechly ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 15 Seminar 4: 3 Seminar 5: 6
, email: rame@countryday.net ,name: Emily Marie Ram ,Seminar 1: 2 Seminar 2: 15 Seminar 3: 7 Seminar 4: 3 Seminar 5: 6
, email: bursef@countryday.net ,name: Francis Burse ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 7 Seminar 4: 3 Seminar 5: 6
, email: taylorhu@countryday.net ,name: Hunter Levi Taylor ,Seminar 1: 2 Seminar 2: 15 Seminar 3: 7 Seminar 4: 3 Seminar 5: 6
, email: fleischme@countryday.net ,name: Eric Robert Fleischmann ,Seminar 1: 7 Seminar 2: 9 Seminar 3: 16 Seminar 4: 18 Seminar 5: 6
, email: mangur@countryday.net ,name: Radha Venkata Mangu ,Seminar 1: 7 Seminar 2: 2 Seminar 3: 16 Seminar 4: 18 Seminar 5: 6
, email: ellerj@countryday.net ,name: Jeremy Eller ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 7 Seminar 4: 8 Seminar 5: 6
, email: riemannn@countryday.net ,name: Nathaniel Christopher (Nathan) Riemann ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 15 Seminar 4: 8 Seminar 5: 6
, email: goingsc@countryday.net ,name: William (Chase) Goings ,Seminar 1: 7 Seminar 2: 16 Seminar 3: 2 Seminar 4: 18 Seminar 5: 6
, email: maggarda@countryday.net ,name: Abigail Maye (Abby) Maggard ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 6
, email: hessh@countryday.net ,name: Hannah Rose Hess ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 6
, email: reiringj@countryday.net ,name: Jane (Janie) Reiring ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 6
]

Seminar name: Be Your Own Boss: Entrepreneurship Opportunities in College and Beyond ,Seminar ID: 14 ,Instructor Name: Edwin Sam ,session number: 5 ,Room #: 2 ,# of students:  ,16 ,Students: [email: williamsb@countryday.net ,name: Bryon Michael Williamson ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 6 Seminar 4: 8 Seminar 5: 14
, email: taylors@countryday.net ,name: Samuel Taylor ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 15 Seminar 4: 8 Seminar 5: 14
, email: phillipsc@countryday.net ,name: Catherine M. Phillips ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 6 Seminar 5: 14
, email: pfisterm@countryday.net ,name: Grace (Morgan) Pfister ,Seminar 1: 15 Seminar 2: 16 Seminar 3: 2 Seminar 4: 18 Seminar 5: 14
, email: cercekg@countryday.net ,name: Gavin L. Cercek ,Seminar 1: 1 Seminar 2: 9 Seminar 3: 16 Seminar 4: 8 Seminar 5: 14
, email: stewarts@countryday.net ,name: Sean Christopher Stewart ,Seminar 1: 16 Seminar 2: 9 Seminar 3: 2 Seminar 4: 8 Seminar 5: 14
, email: paynej@countryday.net ,name: Joshua Jabez (Josh) Payne ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 16 Seminar 4: 8 Seminar 5: 14
, email: hatcherm@countryday.net ,name: Moseley Quinn (Mose) Hatcher ,Seminar 1: 7 Seminar 2: 2 Seminar 3: 16 Seminar 4: 6 Seminar 5: 14
, email: shihn@countryday.net ,name: Nellie Yushuan Shih ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 15 Seminar 4: 8 Seminar 5: 14
, email: hoffmanl@countryday.net ,name: Lindsey Renee Hoffman ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 14
, email: bakers@countryday.net ,name: Sydney Renee Baker ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 6 Seminar 4: 8 Seminar 5: 14
, email: formana@countryday.net ,name: Annabel August Forman ,Seminar 1: 1 Seminar 2: 16 Seminar 3: 15 Seminar 4: 6 Seminar 5: 14
, email: alberth@countryday.net ,name: Herschel Morris Albert ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 6 Seminar 4: 3 Seminar 5: 14
, email: fatuzzos@countryday.net ,name: Stephen Holden Fatuzzo ,Seminar 1: 1 Seminar 2: 9 Seminar 3: 16 Seminar 4: 6 Seminar 5: 14
, email: yangy@countryday.net ,name: Yuxi Yang ,Seminar 1: 1 Seminar 2: 16 Seminar 3: 15 Seminar 4: 6 Seminar 5: 14
, email: osborna@countryday.net ,name: Andrew Pendleton (Andy) Osborn ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 15 Seminar 4: 6 Seminar 5: 14
]

Seminar name: Business Clubs: Campus Involvement and Professional Development ,Seminar ID: 10 ,Instructor Name: Blake Lykins ,session number: 5 ,Room #: 3 ,# of students:  ,16 ,Students: [email: nguyenn@countryday.net ,name: Nicholas Minh (Nick) Nguyen ,Seminar 1: 7 Seminar 2: 2 Seminar 3: 16 Seminar 4: 3 Seminar 5: 10
, email: brants@countryday.net ,name: Samantha Rose Brant ,Seminar 1: 1 Seminar 2: 15 Seminar 3: 16 Seminar 4: 8 Seminar 5: 10
, email: briggsm@countryday.net ,name: Molly Molloy Briggs ,Seminar 1: 15 Seminar 2: 16 Seminar 3: 2 Seminar 4: 18 Seminar 5: 10
, email: yardleyo@countryday.net ,name: Olivia Audrey Yardley ,Seminar 1: 15 Seminar 2: 9 Seminar 3: 2 Seminar 4: 18 Seminar 5: 10
, email: hartenm@countryday.net ,name: Mary C. Harten ,Seminar 1: 1 Seminar 2: 15 Seminar 3: 2 Seminar 4: 18 Seminar 5: 10
, email: lie@countryday.net ,name: Enyi Li ,Seminar 1: 1 Seminar 2: 16 Seminar 3: 6 Seminar 4: 3 Seminar 5: 10
, email: hettingep@countryday.net ,name: Paige E. Hettinger ,Seminar 1: 1 Seminar 2: 9 Seminar 3: 2 Seminar 4: 6 Seminar 5: 10
, email: farrelll@countryday.net ,name: Lily Taylor Farrell ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 6 Seminar 4: 3 Seminar 5: 10
, email: thompsond@countryday.net ,name: Dylan Niles Thompson ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 7 Seminar 4: 3 Seminar 5: 10
, email: boazk@countryday.net ,name: Kayla M. Boaz ,Seminar 1: 15 Seminar 2: 2 Seminar 3: 6 Seminar 4: 18 Seminar 5: 10
, email: midham@countryday.net ,name: Manav Dev Midha ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 6 Seminar 4: 3 Seminar 5: 10
, email: cordean@countryday.net ,name: Nicholas William (Nick) Cordea ,Seminar 1: 2 Seminar 2: 15 Seminar 3: 16 Seminar 4: 6 Seminar 5: 10
, email: hamalla@countryday.net ,name: Alec Daniel Hamall ,Seminar 1: 1 Seminar 2: 9 Seminar 3: 6 Seminar 4: 3 Seminar 5: 10
, email: dickersog@countryday.net ,name: Garrett Janning Dickerson ,Seminar 1: 16 Seminar 2: 9 Seminar 3: 6 Seminar 4: 8 Seminar 5: 10
, email: gersonn@countryday.net ,name: Nathaniel Whitney (Nate) Gerson ,Seminar 1: 16 Seminar 2: 15 Seminar 3: 6 Seminar 4: 18 Seminar 5: 10
, email: raminenia@countryday.net ,name: Aadhyasri Ramineni ,Seminar 1: 7 Seminar 2: 9 Seminar 3: 16 Seminar 4: 6 Seminar 5: 10
]

Seminar name: College Decisions: Choosing a Historically Black College over a Predominately White Institution ,Seminar ID: 8 ,Instructor Name: Liah Apatira ,session number: 5 ,Room #: 4 ,# of students:  ,16 ,Students: [email: puckettt@countryday.net ,name: Trevor B. Puckett ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 7 Seminar 4: 18 Seminar 5: 8
, email: gonzalese@countryday.net ,name: Emily Susan Gonzales ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 6 Seminar 4: 18 Seminar 5: 8
, email: straleyg@countryday.net ,name: Grace Virginia Straley ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 16 Seminar 4: 6 Seminar 5: 8
, email: lylem@countryday.net ,name: Harrison (Miller) Lyle ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 2 Seminar 4: 6 Seminar 5: 8
, email: folanm@countryday.net ,name: Maxwell Richard Folan ,Seminar 1: 7 Seminar 2: 15 Seminar 3: 16 Seminar 4: 6 Seminar 5: 8
, email: mcneile@countryday.net ,name: Emma Rachael McNeil ,Seminar 1: 7 Seminar 2: 9 Seminar 3: 2 Seminar 4: 6 Seminar 5: 8
, email: kerschnee@countryday.net ,name: Eric William Kerschner ,Seminar 1: 2 Seminar 2: 9 Seminar 3: 6 Seminar 4: 18 Seminar 5: 8
, email: snellst@countryday.net ,name: Sterling Elijah Snell ,Seminar 1: 16 Seminar 2: 9 Seminar 3: 15 Seminar 4: 6 Seminar 5: 8
, email: westonf@countryday.net ,name: Frank Weston ,Seminar 1: 15 Seminar 2: 16 Seminar 3: 6 Seminar 4: 18 Seminar 5: 8
, email: smithn@countryday.net ,name: Genevieve Claire (Nevie) Smith ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 2 Seminar 4: 6 Seminar 5: 8
, email: valenk@countryday.net ,name: Katherine Rhea Valen ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 8
, email: wrightm@countryday.net ,name: Margaret Langdon (Maggie) Wright ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 8
, email: lutzm@countryday.net ,name: Mia E. Lutz ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 8
, email: zalantsv@countryday.net ,name: Valen Irene Zalants ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 7 Seminar 4: 9 Seminar 5: 8
, email: kellert@countryday.net ,name: Victoria Louise (Tori) Keller ,Seminar 1: 16 Seminar 2: 15 Seminar 3: 6 Seminar 4: 18 Seminar 5: 8
, email:  ,name: Haotong Lu ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 18 Seminar 5: 8
]

Seminar name: Community Organizing and College: Participating in Your College?s Democracy  ,Seminar ID: 11 ,Instructor Name: Anna Beyette ,session number: 5 ,Room #: 5 ,# of students:  ,10 ,Students: [email: jeffriese@countryday.net ,name: Ethan Mikal Jeffries ,Seminar 1: 2 Seminar 2: 16 Seminar 3: 7 Seminar 4: 3 Seminar 5: 11
, email: jaccacis@countryday.net ,name: Samuel A. (Sam) Jaccaci ,Seminar 1: 7 Seminar 2: 1 Seminar 3: 15 Seminar 4: 6 Seminar 5: 11
, email: kellara@countryday.net ,name: Ava Kellar ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 3 Seminar 5: 11
, email: chandrakru@countryday.net ,name: Ruben Chandrakumar ,Seminar 1: 2 Seminar 2: 15 Seminar 3: 16 Seminar 4: 3 Seminar 5: 11
, email: webbc@countryday.net ,name: Chloe Renee Webb ,Seminar 1: 15 Seminar 2: 1 Seminar 3: 6 Seminar 4: 9 Seminar 5: 11
, email: settersk@countryday.net ,name: Katelynn Renee Setters ,Seminar 1: 1 Seminar 2: 2 Seminar 3: 6 Seminar 4: 3 Seminar 5: 11
, email:  ,name: Mia Masterson ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 8 Seminar 5: 11
, email:  ,name: Olivia Scheper ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 8 Seminar 5: 11
, email:  ,name: Colin Sam ,Seminar 1: 16 Seminar 2: 2 Seminar 3: 15 Seminar 4: 8 Seminar 5: 11
, email:  ,name: Kylan Young ,Seminar 1: 16 Seminar 2: 15 Seminar 3: 2 Seminar 4: 8 Seminar 5: 11
]

