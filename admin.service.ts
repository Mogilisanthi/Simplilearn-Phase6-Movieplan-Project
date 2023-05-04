import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Admin } from './admin';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  url:string="http://localhost:8083/api/admin/";

  //inject the DI
  constructor(private http:HttpClient) { }

  //get all Admin
  getAllAdmin():Observable<Admin[]>{
    return this.http.get<Admin[]>(this.url);
  }
 
  //get Admin by id
  getAdminById(ad_id:number):Observable<Admin>{
    return this.http.get<Admin>(this.url+ad_id);
  }
  //get Admin by email
  getAdminByEmail(ad_email:string):Observable<Admin>{
    return this.http.get<Admin>(this.url+ad_email);
  }
  //create record
  create(data:any ):Observable<any>{
    return this.http.post(this.url,data).pipe();
  }
  //deleteById
  deleteById(ad_id:number){
    let myid=ad_id;
    this.http.delete(this.url+myid).subscribe((data: any)=>{
      return this.getAllAdmin();
    });
  }

  //update Admin
  updateAdmin(cust:Admin,ad_id:number){
    return this.http.put(this.url+ad_id,cust);
  }
  
}
