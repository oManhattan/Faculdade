import java.net.CookieManager;
import java.util.Date;

public class Solution {
    public static class User {
      
        protected static boolean isModerator = false;

        private String name;
        private boolean logged;
        private Date lastLogIn;

        public User(String name) {
            this.name = name;
        }
        
        public boolean isLoggedIn() {
            return logged;
        }
        
        public Date getLastLoggedInAt() {
            return lastLogIn;
        }

        public void logIn() {
            this.logged = true;

            Date aux = new Date();
            this.lastLogIn = aux;
        }

        public void logOut() {
            this.logged = false;
        }
        
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        
        public boolean canEdit(Comment comment) {
            return false;
        }
        public boolean canDelete(Comment comment) {
            return false;
        }
    }
  
    public static class Moderator extends User {
        

        public Moderator(String name) {
            super(name);
            super.isModerator = true;
        }

        @Override
        public boolean canEdit(Comment comment) {
            return false;
        }

        @Override
        public boolean canDelete(Comment comment) { 
            return true;
        }
    }
  
    public static class Admin extends Moderator {
        public Admin(String name) {
            super(name);
        }

        @Override
        public boolean canEdit(Comment comment) {
            return true;
        }
    }
    
    public static class Comment {

        Comment repliedTo;
        User author;
        String message;

        public Comment(User author, String message) {
            this.author = author;
            this.message = message;
        }
        
        public Comment(User author, String message, Comment repliedTo) {
            this.author = author;
            this.message = message;
            this.repliedTo = repliedTo;
        }
        
        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Date getCreatedAt() {
            Date date = new Date();
            return date;
        }
        public User getAuthor() {
            return author;
        }

        public Comment getRepliedTo() {
            return repliedTo;
        }
        
        @Override
        public String toString() {
            return String.format("Author: %s\nPosted: %s\nMessage: %s\nReplied to: %s", getAuthor(), getCreatedAt().toString(), getMessage(), getRepliedTo().getMessage());
        }
    }
}
