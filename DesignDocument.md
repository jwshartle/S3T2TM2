 
  

COVER PAGE

List your names as you would like them, and your ID, we can clean this up later and sort names alphabetically  

Joseph Donati - 2847  
Joseph Nehl - 0175  

**

## TEAM 2 - DESIGN DOCUMENT



  

#### Introduction

Our software aims to provide a simple, intuitive task management utility for agile development teams. Our program, for now named TM, will allow teams and individuals to plan, track  

While the overall project is a task manager to keep track of time, and task enter by a user, in the workspace being able to keep track of not only ones personal task, but the project as a whole, is important. This is why we are adding the functionality to create, login and maintain an account. In doing so you can manage and create your own tasks, provide feedback on other project member’s tasks, update how far along your project is, keep track of deadlines and managers can keep track of the overall progress of the production to make sure everything is heading along smoothly.  

#### Product Reviews
Here you discuss other product and how they achieve tasks that relate to your ideas.  

We examined 3 different login systems and profile outlays to draw ideas from. Although many were too in depth for the scale of this projects needed functions, they did help provide a fundamental look at what a basic profile would need and what should happen when users create accounts and log in to a system. The first one was an obvious choice, github.  

Gitthe github profile view is very bare bones, but for a program where all the users would belong to the same company, and won’t be used for any social media type functions, I feel like much more isn’t needed. The login page is relatively clean and functional. The second profile and login example I examined was Facebook.  

The facebook login similar to the github, but one feature that I really liked was the login with the username and password section along the top of the page and the create profile right below it showing all the needed fields. This would reduce the number of GUI pages needed during log in and makes it easy for the user to either log in or make a new profile. One thing I’ve noticed is that on many sites, they either hide the create new profile link or the login link. While only a minor inconvenience it has frustrated me before that I needed to click on extra stuff. The facebook main profile page was way too in depth for a project like this but the contact information page provides a good layout. The last login page I examined was Twitter.  

The login for twitter is functional, and that’s about it. There is nothing special about it, two fields to enter in information and a button to create account. No extra information or any clutter. A very clean login but again the user must find the small test to create account. When examining the profile outlay, I fell in love with the look. Not for using it as our profile outline, but using it for the outlay of our tasks. It is perfect, uncluttered and has fields for a lot of useful information. Then below a user could add comments to the task to keep track of what’s going on and communicate to the team.  

#### Project Overview

Here you bring together your introduction and lessons learned from the reviews. What are you doing the same, what is different?  

For the login section, we will most likely go with something simple like the twitter login screen or a combination between that and the account creation on the main page of github. Most likely, when a user enters the wrong password a small red error message will pop up stating if the username was not found or if the password doesn’t match the user name. The profile page will most likely draw a lot of its influence from twitters, its clean and can be arranged to fit the data we need the user to have quite easily. Something we won’t have is any type of friend function. This type of program is for team management, not for wasting time with social interactions. We most likely will have the user be able to leave comments on each task so that they can provide updates, ask for help, or be able to communicate with other team members on certain design changes or updates. There will most likely not be an instant messenger application, again for the same reason that it is beyond what the task app should do.  

#### Project Architecture

Your overview should lead naturally into your architecture. Here you have to do the best you can if you have limited experience. Decide based on your vision of what your project should be with the understanding that you may have to learn some specfiic technologies later. You do not have specify specific technnology now. If you are going to use an SQL database to store task data, then just say that and use that language on any diagrams.  

The information for this will be stored into a SQL database. Most likely we will need these fields to make sure that each user has the information for their account stored: (username; email; bio; password; name; user rights; phone number; department?; image? currentlogin; User attempts). The login screen will be the first thing that pops up when the user opens the program, from there they will either enter their username and password or will have the option to create an account.  

#### Requirements

Your discussion so far should be causing your to think about deliniating specifific requirements. While I don't want to state that you need some specific number, look at some of the example projects on Ivan Marsik's website to get a sense of scope. If you don't have between one and two dozen requirements, you probably have not done enough work.  

•	Users must be able to create a new account. (REQ1)  
•	First account created must automatically be dubbed an admin. (REQ2)  
•	Users cannot choose the same username as other users. (REQ3)  
•	Username must be at least 3 letters and no more than 16. (REQ4)  
•	Users cannot choose the same email as other users. (REQ5)  
•	Users must be able to log in to account and profile state changes to online. (REQ6)  
•	When user is logged in, no other person will be able to log into the same account. (REQ7)  
•	Site must lock out users for an hour after 3 incorrect password attempts. (REQ8)  
•	Site must lock out users for 1 day after 5 incorrect password attempts. (REQ9)  
•	Site must lock out users after 10 incorrect password attempts. (REQ10)  
•	Site admin must be able to unlock locked accounts. (REQ11)  
•	Users must be able to view profile once logged in. (REQ12)  
•	User must be able to change username and password when logged in to their account. (REQ13)  
•	User must be able to add other information to their profile page, such as contact information and bio. (REQ14)  
•	User must be able to check user list to view which users are online and offline. (REQ15)  
•	When looking at a user’s profile or the user list, admins must able to set a user as an admin. (REQ16)  
•	When looking at a user’s profile or the user list, admins must be able to delete accounts. (REQ17)  
•	User must be able to log off and the profile state changes to offline(REQ18)  


#### Use Cases

Your requirments and previous sections should lead to your use cases. How will users use the system? What are the types of users? This sections should include detailed use cases as well as an accountability matrix that ties your requirements to your use cases.  

##### Actor	        Goal	                                                                                Use Case Name  
Admin/User	To log into the system so that changes to tasks are marked by a specific user	        Log in (UC1)  
Admin/User	To log out of the system so that a new user can enter their information	                Log out (UC2)  
Admin/User	To create a new account to access the program	                                        Create Account (UC3)  
Admin	        To give admins extra power over normal users to edit, remove and change information	Admin Rights(UC4)  
Admin/User	To edit the information of current user	                                                Change Profile (UC5)  
Admin/User	To access a list of all users and display their status	                                Access User List (UC6)  

##### Use Case 1: Log in  
Related reqs: REQ6; REQ7; REQ8; REQ9; REQ10; REQ13; REQ15  
Initiating actor: User; Admin  
Goal: To log into the system so that changes to tasks are marked by a specific user  
Participating actors: Database  
Preconditions:  
•	set of users and passwords in database is not empty  
•	Username entered must exist  
•	The user must not already be online  
•	Password entered must match usernames password in database  
Postconditions:  
•	State of user set to online  
Flow of events:  
•	User/Admin opens program and enters username and password  
•	System opens new GUI page home screen  
•	System changes state to online  

##### Use Case 2: Log out  
Related reqs: REQ8; REQ9; REQ10; REQ15; REQ18;  
Initiating actor: User; Admin  
Goal: To log out of the system so that a new user can enter their information  
Participating actors: Database  
Preconditions:  
•	User is currently logged in  
Postconditions:  
•	State of user set to offline  
Flow of events:  
•	User/Admin clicks on the logout button  
•	System opens new GUI page login  
•	System changes state to offline  

##### Use Case 3: Create Account
Related reqs: REQ1; REQ2; REQ3; REQ4; REQ5
Initiating actor: User; Admin
Goal: To create a new account to access the program
Participating actors: Database
Preconditions: 
•	New Username must not be the same as existing an username
•	New email must not be the same as an existing email
•	Password must be more than 3 characters
•	Passwords must match
Postconditions: 
•	New account is created with password/username and email attached to each other
•	If first account, automatically sets user to admin
Flow of events: 
•	User/Admin clicks on the Create Account button
•	System opens new GUI page create account
•	User/Admin enters username, email and password (twice)
•	System adds information to database
•	System opens new GUI page home screen

##### Use Case 4: Admin Rights  
Related reqs: REQ11; REQ16; REQ17  
Initiating actor: Admin  
Goal: To give admins extra power over normal users to edit, remove and change information  
Participating actors: Database  
Preconditions:  
•	Admin is currently logged in  
Postconditions:  
•	A users account is removed from or changed in the database  
Flow of events:  
•	Admin clicks on the delete/edit user button  
•	System asks for admin password  
•	Admin enters password  
•	System removes/changes data from user  

##### Use Case 5: Edit Profile  
Related reqs: REQ12; REQ13; REQ14  
Initiating actor: Admin/User  
Goal: To edit the information of current user  
Participating actors: Database  
Preconditions:  
•	User/Admin is logged in to the account they want to change  
Postconditions:  
•	A users information is changed in the database  
Flow of events:  
•	User/Admin clicks on the edit my profile button  
•	System shows a GUI with fields they can change (username, name, email, password, bio, picture?)  
•	User/admin changes the data they wish to change  
•	System updates database with new information  

##### Use Case 6: Access User List  
Related reqs: REQ6; REQ15; REQ18  
Initiating actor: Admin  
Goal: To view a list of Users and see their current state (offline/online)  
Participating actors: Database  
Preconditions:  
•	Admin/User is currently logged in  
Postconditions:  
•	Admin/User sees list of users/admins  
Flow of events:  
•	Admin/User clicks User list button  
•	System access database  
•	Displays new GUI with list of user and their status (online/offline)  


> Written with [StackEdit](https://stackedit.io/).
