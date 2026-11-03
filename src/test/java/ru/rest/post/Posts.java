package ru.rest.post;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;

public class Posts {

    private Long postId;
    private  String title;
    private String body;
    private Long userId;

    public Posts(Long postId, String title, String body, Long userId){
        this.postId = postId;
        this.title = title;
        this.body = body;
        this.userId = userId;
    }

   public Posts(){

   }

   @Override
   public  String toString(){
       return "Posts{" +
       "postId=" + postId +
               "title= " + title +
               "body= " + body +
               "userId" + userId +
               "}";
   }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPostId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public Long getUserId() {
        return userId;
    }

}
