
package serviceprovider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class eventstable {
    private int ID,SP_id;
    private String name,location;
public eventstable(int ID, String name, String location,int SP_id){
    super();
    this.ID = ID;
    this.name = name;
    this.location = location;
    this.SP_id = SP_id;
}
 public int getID(){
     return ID;
 }public void setID(int ID){
    this.ID = ID;
}public String getname(){
     return name;
 }public void setname(String name){
    this.name = name;
}public String getlocation(){
     return location;
 }public void setlocation(String location){
    this.location = location;
}public int getSP_id(){
     return SP_id;
 }public void setSP_id(int SP_id){
    this.SP_id = SP_id;
 }
    
   }