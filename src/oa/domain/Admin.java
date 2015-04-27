package oa.domain;

public class Admin {
   private int Admin_id;
   private String Admin_username;
   private String Admin_password;
   
   public String getAdmin_password() {
      return Admin_password;
   }
   
   public void setAdmin_password(String newAdmin_password) {
      Admin_password = newAdmin_password;
   }
   
   public String getAdmin_username() {
      return Admin_username;
   }
   
   public void setAdmin_username(String newAdmin_username) {
      Admin_username = newAdmin_username;
   }
   
   public int getAdmin_id() {
      return Admin_id;
   }
   public void setAdmin_id(int newAdmin_id) {
      Admin_id = newAdmin_id;
   }
}