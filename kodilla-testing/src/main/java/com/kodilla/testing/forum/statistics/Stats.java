package com.kodilla.testing.forum.statistics;

public class Stats {

    int usersCount,postCount,commentsCount;
    double averagePostsPerUser,averageCommentsPerUser, averageCommentsPerPost;



    void calculateAdvStatistics(Statistics statistics){
        usersCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if(postCount>0 && usersCount>0){
            averagePostsPerUser = postCount/(double)usersCount;}
        else {
            averagePostsPerUser  = 0;}

        if(commentsCount>0 && usersCount>0){
            averageCommentsPerUser = commentsCount/(double)usersCount;}
        else {
            averageCommentsPerUser = 0;
        }

        if(postCount>0 && commentsCount>0){
            averageCommentsPerPost = commentsCount/(double)postCount ;}
        else {
            averageCommentsPerPost = 0;
        }
    }

    String showStatistics(){


        return "UsersCount: " + usersCount
                + "PostCount: " + postCount
                + "CommentsCount: " + commentsCount
                + "Average posts per user: " + averagePostsPerUser
                + "Average comments per user: " + averageCommentsPerUser
                + "Average comments per post: " + averageCommentsPerPost;
    }
}
