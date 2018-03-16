# Team 2 Design Document

## Introduction:
   Our software aims to provide a simple, intuitive task management utility for agile software development teams. Our program, for now named TM, will allow teams and individuals to plan projects, organize tasks and workloads, and track both team and individual progress.

## Product Reviews:
   Since each of our team members had a task to research, we each took it in turn to review a task to implement. The first function we looked at implementing was login systems. We examined 3 different login systems and profile outlays to draw ideas from. Although many were too in depth for the scale of this projects needed functions, they did help provide a fundamental look at what a basic profile would need and what should happen users create accounts and log in to a system. The first one was an obvious choice, github. 
   
   The layout and the features the shown in the 2nd picture are similar to the layout we were considering. Although it is very bare bones, for a program where all the users would belong to the same company and won’t be used for any social media type functions, we feel like much more isn’t needed. The login page is relatively clean and functional. The second profile and login example that was examined was Facebook.
	   
   The facebook login similar to the github, but one feature that we really liked was the login with the username and password section along the top of the page and the create profile right below it showing all the needed fields. This would reduce the number of GUI pages needed during log in and makes it easy for the user to either log in or make a new profile. One thing we’ve noticed is that on many sites, they either hide the create new profile link or the login link. While only a minor inconvenience it has frustrated me before that I needed to click on extra stuff. The facebook main profile page was way too in depth for a project like this but the contact information page provides a good layout. The last login page I examined was Twitter.
   
   The login for twitter is functional, and that’s about it. There is nothing special about it, two fields to enter in information and a button to create account. No extra information or any clutter. A very clean login but again the user must find the small test to create account. When examining the profile outlay, we fell in love with the look. Not for using it as our profile outline, but using it for the outlay of our tasks. It is perfect, uncluttered and has fields for a lot of useful information. Then below a user could add comments to the task to keep track of what’s going on and communicate to the team.
   
   The second task we looked into was implementing a chat box to be able to communicate quickly to other members of the team. Allowing the user to choose between a message board for everyone logged in, direct instant messaging, or even group instant message. This will provide users and easy and simple way to communicate through the team. Skype Business has an instant messenger that is really integrated with Outlook Calendar and extremely beneficial communicating to other members of the team. This gave me the idea of having a chat board within the task manager to help team members communicate quicker and more efficiently.
   
   We also wanted to add new features for tasks to edit the description, add a status, or assign a task to a user. To get some ideas, we looked at ProofHub and Trello. ProofHub is very communication focused. It allows users to define goals and share ideas while working on the task. They allow the ability to assign tasks, set start and due dates, and add descriptions. Managers and team members are treated as different users. Projects tasks can be divided up and assigned. Managers can look over progress. The program uses a board layout to display tasks. Within the boxes of the task, progress and task description are displayed.
   Trello is a task management app that gives a user a visual overview of what is being worked on and who is working on it. Projects are divided up into tasks which can then be edited with descriptions, labels, checklists, and even attachments. It allows users to work separately but still see the status of overall tasks of the project.
   
   To add to the visual flair, we also wanted to add a calendar to visually be able to show and create meetings and deadline dates for projects. In addition to keeping track of current tasks, a calendar also helps us to plan for future tasks and manage scheduling conflicts. Two of the best calendars We use are Google Calendar and Microsoft Outlook-Personal Information Manager.
   
   Google’s calendar is able to manage multiple tasks per day, block off times for tasks to make sure they don’t overlap or let the users know that the schedules conflict. It also has the ability to categorize certain calendars into what I call ‘lifestyles’ such as work, personal and holiday planning. These can also be color coded and hidden so the user can see what is most important to them at any given time.
   
   Microsoft Outlook also accomplishes a lot of the same thing since they are both scheduling calendars. Since Outlook has a stronger integration with Microsoft’s other features, it has the ability to unify the calendar, notes, tasks and contacts/users. Also, since there can be multiple users on the outlook calendar, the users can view each other’s schedules, manage and even subscribe to other people’s calendars. Another thing that Microsoft does differently is the ability to break main tasks down into subtasks.
   
   Reviewing other task management applications allowed us to see different approaches of how to display project pipelines, task layout, task assignment, as well as different approaches to project flow. Two different applications, Trello and Wrike, embodied the two types of software that seem to compose most of the project management market.

   The Trello app is a popular task manager used in many fields. It is user-focused and encourages communication at all levels. Trello uses a simple desktop layout, which they call a board, to display multiple projects and tasks. A Trello ‘card’ is an individual project item, which could be a checklist, hold an attached document, be a due date or meeting time, or hold any other project related notes or media. Each card is held in a project column, allowing it to be sorted many ways, including creation date, due date, card age, or by assigned users. Communication between users can occur on each card, allowing users to communicate about progress, ask for assistance from other users, or close out completed tasks. Trello succeeds in letting users see the whole scope of a project, while still diving deep into individual tasks. This view can be beneficial to project managers, but also encourages team awareness on all aspects of the project. By seeing constant changes and the progress of each piece-of-the-whole Trello users can better keep up in an agile development setting.

   Wrike is another project management app we reviewed. Wrike uses a familiar timeline style project layout seen in many mainstream project management packages, such as MS Project. The view of a project is very time oriented and focused on project progression and deadlines. Resource management and ‘dependency hierarchies’ are a key factor in Wrike, making it beneficial in large scale projects. By creating a rigid timeline and task succession structure Wrike works to ensure that everything is in place in time to keep a project moving forward. Wrike provides a good big-picture view of the project, which would be mostly beneficial to management and coordinators instead of individual users. This style of project management did not seem viable for an agile environment and provides more examples of what to avoid then embrace in TM.

## Project Overview: 
   For the login section, we will most likely go with something simple like the twitter login screen or a combination between that and the account creation on the main page of github. Most likely, when a user enters the wrong password a small red error message will pop up stating if the username was not found or if the password doesn’t match the user name. The profile page will most likely draw a lot of its influence from twitters, its clean and can be arranged to fit the data we need the user to have quite easily. Something we won’t have is any type of friend function. This type of program is for team management, not for wasting time with social interactions. We most likely will have the user be able to leave comments on each task so that they can provide updates, ask for help, or be able to communicate with other team members on certain design changes or updates. There will most likely not be an instant messenger application, again for the same reason that it is beyond what the task app should do.

   The chat board will have a few options. The main page for the chat board will have a message board that is public for everyone logged in to see. A list of users will show on the right where you can tell who is logged in an not. You can also search for users. A user can click on a recipient and send a direct message to them or they can select multiple users and have a group chat. All conversations will be logged and saved.

Building on the current design of the project, we want to add the ability to edit a description. At this moment, users can append to the description of a task but cannot edit it. This allows the user to correct any typos or makes changes as the task changes. Upon reviewing other products, we will be adding the ability to add a status to the task. This gives the ability to users to see the progress made upon a task. We will also be implementing the idea of having managers assign users to a task. This allows managers to keep track of who is working on what and divide up work on a project. These are the new properties which we are adding to individual tasks.

   In line with the two popular calendar apps, we are doing essentially the same thing. That is keeping track of tasks. The calendar seems to be a natural extension of the work we’re already doing. We will be adding in all tasks into a database to make organization easier. What we have been doing is kind of like a calendar in reverse. We take a task and time it during/after it has been worked on. A calendar does this in the future so that we can plan accordingly for when a task/project should be finished and how long it should take rather than how long it does take. Visual additions would include color coding so we could separate work/personal/holiday calendars as well as color code priority. If a task has a set schedule such as homework due every Monday, we could set up a repeated task alert.

   The TM approach to project and task management aims to be the most beneficial in a small-team, small-project agile environment. Instead of displaying projects as a timeline, TM will implement a Group Board to display multiple projects. The view of each unique project will display all current and future tasks in a feed-style display. The main view will display all projects in their own column, with simple task elements displayed like a stack. Tasks in this view will display minor amounts of data. By selecting and expanding an individual task, TM users will be able to see everything that is a part of the completion of that task. They will be able to see all relevant task deadlines, who is in charge of the task, all users involved in the task, user’s time and total time already spent on task, as well as time allotted for task. Space will also be provided for comments on each task, allowing notes to be added, questions to be asked, or checklists to be created within a task.

## Project Architecture:
![Architecture](https://image.ibb.co/fmzj2x/Project_Architect_page_001.jpg)

## Requirements:
1) Users must be able to create a new account
2) First account created must automatically be dubbed an admin
3) Users cannot choose the same username as other users
4) Username must be at least 3 letters and no more than 16
5) Users cannot choose the same email as other users
6) Users must be able to log in to account and profile state changes to online
7) When user is logged in, no other person will be able to log into the same account
8) Site must lock out users for an hour after 3 incorrect password attempts
9) Site must lock out users for 1 day after 5 incorrect password attempts
10) Site must lock out users after 10 incorrect password attempts
11) Site admin must be able to unlock locked accounts
12) Users must be able to view profile once logged in
13) User must be able to change username and password when logged in to their account
14) User must be able to add other information to their profile page, such as contact information and bio
15) User must be able to check user list to view which users are online and offline
16) When looking at a user’s profile or the user list, admins must able to set a user as an admin
17) When looking at a user’s profile or the user list, admins must be able to delete accounts
18) User must be able to log off and the profile state changes to offline
19) The system will connect to the server
20) The system will keep a log of transactions
21) The system will track who is online
22) The system will get user list
23) Users will be able to edit the description of a task which has already been created
24) Managers are able to add/remove users to task
25) Users can add status to a task (one of three choices: not started, in progress, and finished)
26) The calendar should alert users when a task is nearing its deadline
27) Set tasks to be completed at a future date within a given time frame
28) Make sure that tasks can’t be set for the same time/alert the user that a task is being set for the same time
29) Search for previously entered tasks or future tasks that have been entered in the calendar
30) Separate tasks according to ‘lifestyle’ – work/personal/etc.
31) Keep a record of clearance level 
32) Update group boards of all involved users
33) Maintain table of tasks in project
34) Maintain table of project data
35) Maintain table of users in system
36) Maintain table of projects in system

## Use Cases: 

Actor | Goal | Use Case
----------|----------|------------
Admin/User | To log into the system so that changes to tasks are marked by a specific user | Log in (UC1)
Admin/User | To log out of the system so that a new user can enter their information | Log out (UC2)
Admin/User | To create a new account to access the program | Create account (UC3) 
Admin | To give admins extra power over normal users to edit, remove and change information | Admin Rights (UC4)
Admin/User | To edit the information of current user | Change Profile (UC5)
Admin/User | To access a list of all users and display their status | Access User List (UC6)
Admin/User | To change description of already established task | Edit Description (UC7)
Admin/User | To add status to task to show progress | Add status to task (UC8)
Admin | To have admin assign tasks to users so that user can see task and its properties | Add users to task (UC9)
Admin/User|To add or change the status of a task|Add status of task (UC10)
Admin|To add user to a task|Add user to task(UC11)
Admin/User|To add a task to a project|Add upcoming task (UC12)
Admin/User|Delete an entered task|Delete task (UC13)
Admin/User|Display all upcoming tasks that have not been deleted|Display Upcoming tasks (UC14)
Admin|To create a new project and assign the users who will participate|Create new project (UC15)
Admin/User|To add a new task to a project, assign a task lead, assign users to task|Create new task (UC16)
Admin|Clear a project from the Group Board of all involved users|Delete project (UC17)
Admin/User|Change restricted task values (due date, task name, remove user, etc.)|Edit task details (UC18)
Admin/User|Add a message to a task card|Add Note (UC19)
Admin/User|Include another user on a task card|Add user to task (UC20)
Admin/User|Change status of task to ‘completed’, move task to ‘completed’ bin|Mark task completed (UC21)


### Use Case 1: Log In

**_Related reqs:_** REQ6; REQ7; REQ8; REQ9; REQ10; REQ13; REQ15

**_Initiating actor:_** User; Admin

**_Goal:_** To log into the system so that changes to tasks are marked by a specific user

**_Participating actors:_** Database

**_Preconditions:_**

set of users and passwords in database is not empty

Username entered must exist

The user must not already be online

Password entered must match usernames password in database

**_Postconditions:_**

State of user set to online

**_Flow of events:_**

 User/Admin opens program and enters username and password

System opens new GUI page home screen

System changes state to online

### Use Case 2: Log Out

**_Related reqs:_** REQ8; REQ9; REQ10; REQ15; REQ18;

**_Initiating actor:_** User; Admin

**_Goal:_** To log out of the system so that a new user can enter their information

**_Participating actors:_** Database

**_Preconditions:_**

User is currently logged in

**_Postconditions:_**

State of user set to offline

**_Flow of events:_**

User/Admin clicks on the logout button

System opens new GUI page login

System changes state to offline

### Use Case 3: Create Account

**_Related reqs:_** REQ1; REQ2; REQ3; REQ4; REQ5

**_Initiating actor:_** User; Admin

**_Goal:_** To create a new account to access the program

**_Participating actors:_** Database

**_Preconditions:_**

New Username must not be the same as existing an username

New email must not be the same as an existing email

Password must be more than 3 characters

Passwords must match

**_Postconditions:_**

New account is created with password/username and email attached to each other

If first account, automatically sets user to admin

**_Flow of events:_**

User/Admin clicks on the Create Account button

System opens new GUI page create account

User/Admin enters username, email and password (twice)

<System adds information to database

System opens new GUI page home screen

### Use Case 4: Admin Rights

**_Related reqs:_** REQ11; REQ16; REQ17

**_Initiating actor:_** Admin

**_Goal:_** To give admins extra power over normal users to edit, remove and change information

**_Participating actors:_** Database

**_Preconditions:_**

Admin is currently logged in

**_Postconditions:_**

A users account is removed from or changed in the database

**_Flow of events:_**

Admin clicks on the delete/edit user button

System asks for admin password

Admin enters password

System removes/changes data from user

### Use Case 5: Edit Profile


**_Related reqs:_** REQ12; REQ13; REQ14

**_Initiating actor:_** Admin/User

**_Goal:_** To edit the information of current user

**_Participating actors:_** Database

**_Preconditions:_**

User/Admin is logged in to the account they want to change

**_Postconditions:_**

A users information is changed in the database

**_Flow of events:_**

User/Admin clicks on the edit my profile button

System shows a GUI with fields they can change (username, name, email, password, bio, picture?)

User/admin changes the data they wish to change

System updates database with new information

### Use Case 6: Access User List

**_Related reqs:_** REQ6;  REQ15; REQ18

**_Initiating actor:_** Admin

**_Goal:_** To view a list of Users and see their current state (offline/online)

**_Participating actors:_** Database

**_Preconditions:_**

Admin/User is currently logged in

**_Postconditions:_**

Admin/User sees list of users/admins

**_Flow of events:_**

Admin/User clicks User list button

System access database

 Displays new GUI with list of user and their status (online/offline)

### Use Case 7: Send Message - Chatbox

**_Related reqs:_ REQ 19, REQ 20, REQ 21, REQ 22**

**_Initiating actor:_** Any online user

**_Goal:_** Send a message to another user.

**_Participating actors:_** Database and Users

**_Preconditions:_**

User is already logged in

Application indicates who is currently logged into the system

Application has valid connection to server

**_Postconditions:_**

The application saves the message being to log transactions

**_Flow of events:  (User sends to one or multiple users)_**

Application connects to database

User clicks chat box button

User selects user(s) to send message

User writes message and clicks send button

**_Flow of events alternative scenario: (User sends to team board)_**

Application connects to database

User clicks chat box button

User doesn’t select user to send too

User writes message and clicks send button

**_Flow of events error scenario:_**

Application can’t connect to database

Message to tell user chat box is down

### Use Case 8: Receive Message - Chatbox

**_Related reqs:_ REQ 19**

**_Initiating actor:_** Any online user

**_Goal:_** Receive a message from another user.

**_Participating actors:_** Database and Users

**_Preconditions:_**

User is already logged in

**_Postconditions:_**

Notification that indicates new message

**_Flow of events main Scenario (User is on different screen)_**

Application can’t connect to database

Notification pops up next to Chat box button indication new message has been received

User clicks button to go to Chat box

Notification goes away

**_Flow of events alternative Scenario (User is on Chatbox screen)_**

Application can’t connect to database

User in on the Chat box screen

New message shows on screen

### Use Case 9: Edit Description

**_Related reqs:_** REQ 6, REQ 19, REQ 22, REQ 23, REQ 33, REQ 36

**_Initiating actor:_** User; Admin

**_Goal:_** to edit an already established description of a task

**_Participating actors:_** user interface, database

**_Preconditions:_**

User has account

Task already created and has description

the menu displays available functions the user can do on the task

**_Postconditions:_**

menu displays edited description

**_Flow of events:_**

User/Admin opens program and enters username and password (include login use case)

 On board, user selects task

 On the menu of available functions for the tasks, the user selects “edit description”

Find description on table

On the menu of available functions for the tasks, the user selects edit

 output to user

 User makes changes to description

 write into table

display new description on task menu

### Use Case 10: Add Status of Task 

**_Related reqs:_** REQ 6, REQ 19, REQ 22, REQ 25, REQ 33, REQ 36

**_Initiating actor:_** User; Admin

**_Goal:_** To add or change the status of a task

**_Participating actors:_** user interface, database

**_Preconditions:_**
User has account

The menu displays available functions the user can do on the task

**_Postconditions:_**
Menu displays new status

**_Flow of events:_**
User/Admin opens program and enters username and password (include login use case)

On board, user selects task

On the menu of available functions for the tasks, the user selects “change status”

Find status on table

output to user

User selects new status from option of: not started, in progress, finished
write into table

Display new status on task menu

### Use Case 11: Add User to Task

**_Related reqs:_** REQ 6, REQ 19, REQ 22, REQ 24, REQ 33, REQ 34, REQ 35

**_Initiating actor:_** Admin

**_Goal:_** To add user to a task

**_Participating actors:_** user interface, database, user account

**_Preconditions:_**
User has account
The menu displays available functions the user can do on the task

User logged in as Admin

**_Postconditions:_**

Admin: Board displays tasks with assigned users

User: Board displays assigned task

**_Flow of events:_**
User/Admin opens program and enters username and password (include login use case)

On board, user selects task

On the menu of available functions for the tasks, the user selects “assign user”

From menu, manager selects user from list to assign to task

Write into table which holds task name and user assigned

Display team member name on task menu

### Use Case 12: Add Upcoming Tasks

**_Related reqs:_** REQ 6, REQ 12, REQ 25, REQ 26, REQ 27, REQ 28, REQ 30

**_Initiating actor:_** Admin/User

**_Goal:_** Edit tasks

**_Participating actors:_** user interface, database, user account

**_Preconditions:_**

User has account

The menu displays available functions the user can do on the task
User logged in

**_Postconditions:_**

Admin/User: Calendar displays added task

**_Flow of events:_**

User/Admin opens program and enters username and password (include login use case)

→ User/Admin selects date on which task should be added

→ User enters task

Write into table which holds task name and user assigned

← Display added task

### Use Case 13: Delete Tasks

**_Related reqs:_** REQ 6, REQ 23, REQ 28, REQ 29

**_Initiating actor:_** Admin/User

**_Goal:_** Delete an entered task

**_Participating actors:_** user interface, database, user account

**_Preconditions:_**

User has account
The menu displays available functions the user can do on the task

User logged in

**_Postconditions:_**

Admin/User: Task is deleted from the calendar through the database. Task doesn’t show up on calendar view and user is not alerted

**_Flow of events:_**
User/Admin opens program and enters username and password (include login use case)

→ User/Admin selects task to be deleted

Perform a delete function on the database for the selected task for the assigned user

← Display a ‘task deleted’ message to the user

### Use Case 14: Display Upcoming Tasks

**_Related reqs:_** REQ 6, REQ 26, REQ 27, REQ 29, REQ 30

**_Initiating actor:_** Admin/User

**_Goal:_** Display all upcoming tasks that have not been deleted

**_Participating actors:_** user interface, database, user account

**_Preconditions:_**

User has account

The menu displays available functions the user can do on the task

User logged in

**_Postconditions:_**

Admin/User: All relevant tasks are displayed on the calendar view

**_Flow of events:_**

User/Admin opens program and enters username and password (include login use case)

User/Admin selects function to be performed – Display all tasks

For an assigned user/admin, display all tasks assigned to that user

### Use Case 15: Create New Project 

**_Related reqs:_** REQ 31; REQ 32; REQ 35; REQ 36  

**_Initiating actor:_** Admin
  
**_Goal:_** To create a new project and assign the users who will participate  

**_Participating actors:_** Database  

**_Preconditions:_**
Project name must not already exist in database
 Usernames entered must exist

**_Postconditions:_**

-   Project must be added to Group Board of all participants
-   Project table must be created in database
-   Users should be notified of their involvement in new project

**_Flow of events:_**
Admin presses ‘Create Project’ button on home screen

System opens ‘New Project’ page in GUI

Admin enters new project information, clicks “Create Project”

Project tables created in database

System notifies users of new project

System displays project stack in Display Board view of GUI

### **Use Case #16: Create new task**

**_Related reqs:_** REQ 31; REQ 32; REQ 33; REQ 34  

**_Initiating actor:_** Admin/User  

**_Goal:_** To add a new task to a project, assign a task lead, assign users to task  

**_Participating actors:_** Database  

**_Preconditions:_**

-   Project name must already exist in database
-   Assigned usernames must exist in database
-   Deadline must not be in the past
-   Task name must not already exist

**_Postconditions:_**

-   Task must be added to project on Group Board of all participants
-   Task table must be created in database
-   Users should be notified of their involvement of new task

**_Flow of events:_**

Admin/user presses ‘Create Task’ button on project stack

System opens ‘New Task’ page in GUI

 Admin/user enters new task information, clicks “Create Task”

Task table created in database

System notifies involved users of new task

System displays task in project stack of Display Board view of GUI

### **Use Case #17: Delete a project**

**_Related reqs:_** REQ 31; REQ 32; REQ 36  

**_Initiating actor:_** Admin  

**_Goal:_** Clear a project from the Group Board of all involved users  

**_Participating actors:_** Database  

**_Preconditions:_**

-   Project name must already exist in database

**_Postconditions:_**

-   Project should be removed from Group Board of all participants
-   Project table should stored in backup in case of deletion

**_Flow of events:_**
 Admin presses ‘Delete Project’ button on project stack

System opens ‘Delete Project’ warning message in GUI

Admin clicks “Confirm Delete”

Project tables moved to backup section of database

 System removes project stack from Display Board view of GUI

### **Use Case #18: Edit task details**

**_Related reqs:_** REQ 31; REQ 32; REQ 33;  

**_Initiating actor:_** Admin / User (only user who created task)  

**_Goal:_** Change restricted task values (due date, task name, remove user, etc.)  

**_Participating actors:_** Database 
 
**_Preconditions:_**

-   Task name must already exist in database
-   User must be admin, or original task creator

**_Postconditions:_**

-   Task table values should be updated in database
-   Task information should be updated on Group Board of all participating users

**_Flow of events:_**
Admin/User presses ‘Edit’ button on task card

System opens ‘Edit task’ page in GUI

Admin/User changes data entries, clicks “Save changes”

Task tables updated in database

System notifies users of task update

### **Use Case #19: Add note to task**

**_Related reqs:_** REQ 32; REQ 33  

**_Initiating actor:_** All users  

**_Goal:_** Add a message to a task card 
 
**_Participating actors:_** Database  

**_Preconditions:_**

-   Task name must already exist in database
-   User must be assigned to project containing task

**_Postconditions:_**

-   Task table should be updated in database

**_Flow of events:_**

-   ® User presses ‘Add Note’ button on task card
-   ¬ System opens ‘New Note’ page in GUI
-   ® User enters new task note, clicks “Add Note”
-   ¬ Task tables updated in database
-   ¬ System notifies users assigned to task of new note

### **Use Case #20: Add user to task**

**_Related reqs:_** REQ 32; REQ 33; REQ 34; REQ 35  

**_Initiating actor:_** All users  

**_Goal:_** Include another user on a task card  

**_Participating actors:_** Database  

**_Preconditions:_**

-   Task name must already exist in database
-   Added user must be assigned to project containing task

**_Postconditions:_**

-   Task table should be updated in database
-   New user should be notified that they were added to a task

**_Flow of events:_**

-   ® User presses ‘Add User’ button on task card
-   ¬ System opens ‘Add user’ page in GUI
-   ® User selects other users to be added
-   ¬ Task tables updated in database
-   ¬ System notifies users of new task assignment
-   ¬ System displays new users on task card in Group Board view of GUI

### **Use Case #21: Mark task completed**

**_Related reqs:_** REQ 31; REQ 32; REQ 33; REQ 34

**_Initiating actor:_** Admin / User (only user who created task)  

**_Goal:_** Change status of task to ‘completed’, move task to ‘completed’ bin  

**_Participating actors:_** Database  

**_Preconditions:_**

-   Task name must already exist in database
-   User must be admin, or original task creator

**_Postconditions:_**

-   Task table values should be updated in database
-   Project table values should be updated in database
-   Group Board of all participating users should be updated

**_Flow of events:_**

- Admin/User presses ‘Close Task’ on task card
- System opens ‘Close Task’ warning message in GUI window
- Admin/User confirms
- Ask tables updated in database
- Project tables updated in database
- Closed task moved to ‘Completed Task’ bin in project stack
- System displays updated project stack in Group Board view of GUI
