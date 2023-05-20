package tests;

public class Mehmet {

    /*
    1) create .gitignore file
    # you have to create ".ignore" file before initialising gitHub by "git init" command
    # we have written all folder names that we don't want to upload to gitHub remote server to prevent conflicts

    /.idea/
    /target/
    /test-output/
    /xmlFiles/

    2) create packages pages, tests, utilities
    copy utilities classes from the project

    3) add dependencies testNG, selenium Java, webdrivermnanager , com.aventstack

    ** so we have the testNG framework

    let's create a copy of this project in gitHub

    1) create a new repostory in gitHub
        i) right top + button >>> new repostory
        ii) name of the project com.Team112GitHubProject19May
        iii) create

    2) set git in your project in terminal
    git init
    git add .
    git commit -m "firstCommit"       // you can write any message here instead of firstcommit

    git remote add origin https://github.com/MehmetMagden/com.Team112GitHubProject19May.git       // link should be taken from gitHub repostory
    git push      // if it is your first push, system will inform you what to write     //git push -u origin master


    ** so we have created our project
    ** let's create the team

    from gitHub in the project >>> settins >> collabarators >> add people
    we will add emails of the team
    everybody should accept the invitation from their emails

    everybody should download the project from the repository
    1) from the project main page we should click code green button
    2) copy the link
    3) in int >>>> file > new > project from version control
    4) past the link to URL text box  ( you can use ctrl + v)
        //if directory text box is red, just add something at the end, any number or letter

    // now we are in master branch but it is like a danger zone, we should leave this branch as soon as possible
    5) Everybody in team should create a branch for themselves
        git branch name         // ( name should be chosen by coder) I will use mehmet ( my name)

    6) when we try to create or switch branch we need to check it
    git branch

        -- there will be a star of left side of master branch. It means master is active branch right now
    7) to switch to our branch we need to enter
    git checkout mehmet    ( everybody should use their own branch names)
    8) check the branch
    git branch

        -- we are in our branch now, out of danger zone

    9) we can start writing our code

    **** until now we have completed creating the team and framework, from now on we will try to understand how to use git

     learning branch system
    10)  Everybody should create a class under tests package by using their own names
    11) the code we have written is in our local (own) computer, we have not uploaded anything to remote server. To send our code to
    // git hub

    git add .                           // if you want to send everything
    git commit -m "anyMessage"          //in message section we can write ourname date and a short explaining
    git push                            // at first push of your branch it may ask you to write something like this git push --set-upstream origin mehmet

    12) in github home page there should be a green button named compare and pull request after pushing your codes. If you can not see the button you can also
    visit pull requests page from github

    13) If there is no problem there should be  create a pull request button ( green)

    14) if still there is no prblem we will click  merge pull request (green)

    15) confirm merge

    merging is completed

    // everybody's codes are merged in github but nobody has this merged project in their computers.

    16) first we need to pull master branch to do that first we need to switch to master branch
    but we need to create a version for our code

    git add .
    git commit -m "anymessage"


    git checkout master
    git branch

    if you are sure that you have switched to master branch, we need to pull merged files from github

    git pull        // it will download everybody's codes from github to our master branch in our computer

    // but we are still in danger zone, master branch. We need to take everybody's codes to our own branch by merging

    17) swtich to own branch
    git checkout mehmet
    git branch

    18) if we are in our own branch we can merge master with our branch
    git merge master


    ***** to repead same process
    1) we wrote new code                                                                                ****** we should save our code
    2) to send our code to remote repository
    git add .
    git commit -m "namedateShort"

        // these steps will save your code
        // lets complete merging steps                                                                  ****** we should get updated files from master
    3) switch to master branch
    git checkout master
    git branch

    4) to get everybody's code
    git pull

    5)we are still in danger zone, we shold leave asap, we should switch to our own branch              ***** we should complete merging in our computer
    git checkout mehmet
    git branch

    6) we should merge our branch with master
    git merge master

    7) to send all merged and updated file to github  // you may to write git add . and git commit -m "anymessage"  //if system asks you to do so
    git push

    8) to create a pull request for team lead we should choose
    pull requests from project home page
    9) new pull request
    10) select the branch >> create pull request >> create pull request


    ***** If you changed something in master branch, to reset (dangerous)

    git stash --include-untracked

    git reset --hard

    git clean -fd

    git pull


































     */
}
