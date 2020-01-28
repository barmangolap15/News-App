# News-App using Firebase, API and retrofit

Where a news api is called and displayed the news.

## Dependency

First we need to add **Firebase** dependencies in `build.gradle` app and project files

In `builde.gradle` app

<img src="dna_assests/Screenshot (47).png">   <img src="dna_assests/Screenshot (49).png">

and In `build.gradle` project

<img src="dna_assests/Screenshot (48).png">

other dependencies are in `build.gradle` app

<img src="dna_assests/Screenshot (50).png">

## Firebase Sign In using Phone Number with country code and OTP

In `Firebase console`, first we need to create one project as per our requirement

<img src="dna_assests/Screenshot (57).png" width="400" height="300">

Give a name to your project, then click Continue

<img src="dna_assests/Screenshot (58).png" width="400" height="300">

then we need to add our app as per requirement

<img src="dna_assests/Screenshot (59).png" width="400" height="300">

then we need to add all requirements (package name, app name and SHA-1) as shown below,

<img src="dna_assests/Screenshot (60).png" width="400" height="300">  <img src="dna_assests/Screenshot (61).png" width="350" height="150">  <img src="dna_assests/Screenshot (62).png" width="400" height="350">

after then we need to add `google_json` file to the `app` folder as shown below

<img src="dna_assests/Screenshot (63).png" width="400" height="300">

then In `Authentication` we need to `Enabled` the `Phone` in `Sign-In-Method`

<img src="dna_assests/Screenshot (51).png" width="600" height="200">

When someone enter their number it directly uploaded to the `Users` section of `Authentication` like

<img src="dna_assests/Screenshot (52).png" width="600" height="200">


## Getting Started

For `Sign-In` we used phone number with country code. For country code we used `'com.github.joielechong:countrycodepicker:2.4.1'` dependency for select the country code

<img src="dna_assests/countrycode.png" width="600" height="200">

when we clicked to select our country code, a new screen comes out with country name

<img src="dna_assests/Screenshot_20200128_135336.jpg" width="200" height="400">

after entering the country code and phone number, it will directly go to the firebase which will verify the number with country code then a 6-digits OTP will send to the registered phone number. When we entered that OTP then server checked the OTP and verified it.

<img src="dna_assests/a.png" width="600" height="400">

It will also create a database in `Firebase Cloud Firestore` named `users`, where details of the users are stored.

<img src="dna_assests/b.png" width="600" height="200">  <img src="dna_assests/Screenshot (54).png" width="600" height="200">  <img src="dna_assests/Screenshot (55).png" width="200" height="400"> 

## Showing News using news api and retrofit

From `newsapi` org using `retrofit` we call the news to our app 

<img src="dna_assests/api.png">

then using `API_KEY` we load the `JSON` data in our recyclerview to display the news

<img src="dna_assests/api1.png" width="600" height="400">

# Screenshots

<img src="dna_assests/flash.jpg" width="200" height="400">  <img src="dna_assests/Screenshot_20200128_134450.jpg" width="200" height="400"> <img src="dna_assests/Screenshot_20200128_135341.jpg" width="200" height="400"> <img src="dna_assests/Screenshot_20200128_135336.jpg" width="200" height="400">

<img src="dna_assests/Screenshot (55).png" width="200" height="400"> <img src="dna_assests/Screenshot_20200128_134508.jpg" width="200" height="400">  <img src="dna_assests/Screenshot_20200128_134520.jpg" width="200" height="400"> <img src="dna_assests/Screenshot_20200128_134532.jpg" width="200" height="400">

<img src="dna_assests/Screenshot_20200128_134542.jpg" width="200" height="400"> <img src="dna_assests/Screenshot_20200128_134550.jpg" width="200" height="400"> <img src="dna_assests/Screenshot_20200128_134609.jpg" width="200" height="400">   <img src="dna_assests/Screenshot_20200128_134621.jpg" width="200" height="400">






