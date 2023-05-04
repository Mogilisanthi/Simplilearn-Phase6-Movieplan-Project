import { Injectable } from '@angular/core';
import { User } from './user';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  url:string="http://localhost:8083/api/user/";

  //inject the DI
  constructor(private http:HttpClient) { }

  //get all users
  getAllUser():Observable<User[]>{
    return this.http.get<User[]>(this.url);
  }
 
  //get user by id
  getUserById(id:number):Observable<User>{
    return this.http.get<User>(this.url+id);
  }
  //get user by email
  getUserByEmail(email:string):Observable<User>{
    return this.http.get<User>(this.url+email);
  }
  //create record
  create(data:any ):Observable<any>{
    return this.http.post(this.url,data).pipe();
  }
  //deleteById
  deleteById(id:number){
    let myid=id;
    this.http.delete(this.url+myid).subscribe((data: any)=>{
      return this.getAllUser();
    });
  }

  //update user
  updateUser(cust:User,id:number){
    return this.http.put(this.url+id,cust);
  }
  
}