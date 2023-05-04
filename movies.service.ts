import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Movies } from './movies';

@Injectable({
  providedIn: 'root'
})
export class MoviesService {

  
  url:string="http://localhost:8083/api/movies/";
  constructor(private http:HttpClient) { }
    //get all medicines
    medicineid:any;
    userlogin:any;
  getAllMovies():Observable<Movies[]>{
    return this.http.get<Movies[]>(this.url);
  }
  //get Medicine by id
  getMoviesById(id:number):Observable<Movies>{
    return this.http.get<Movies>(this.url+id);
  }
  //get Medicine by name
  // getMedicineByName(name:string):Observable<MedicineClass>{
  //   return this.http.get<MedicineClass>(this.url+"name"+name);
  // }
  public getMoviesByName(name:any){
    return this.http.get(this.url+"name"+name);
  }
  //create record
  create(data:any ):Observable<any>{
    return this.http.post(this.url,data).pipe();
  }
  //deleteById
  deleteById(id:number){
    let myid=id;
    this.http.delete(this.url+myid).subscribe((data: any)=>{
      return this.getAllMovies;
    });
  }

  //update medicine
  updateMovie(cust:Movies,id:number){
    return this.http.put(this.url+id,cust);
  }
  
}