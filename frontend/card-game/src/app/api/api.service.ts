import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {NgForm} from '@angular/forms';
// import { PostCard } from '../model/postCard';


@Injectable({
  providedIn: 'root'
})
export class ApiService {

  apiBaseUrl = 'http://localhost:8080';

  httpOptions = {
    headers: new HttpHeaders({
      'Access-Control-Allow-Origin':'*',
      'Content-Type': 'application/json, Access-Control-Allow-Origin'
    }),
  }; 

  constructor(private http: HttpClient) { }


  //------------ METHOD GET -----------//
  getCard(): Observable<getApiCard> {
    return this.http.get<getApiCard>(this.apiBaseUrl+ '/api/v1/card');
  }


  //------------ METHOD POST -----------//
  addCard(data: NgForm): Observable<NgForm> {  
    console.warn(JSON.stringify(data.value));
    return this.http.post<NgForm>(this.apiBaseUrl + '/api/v1/add-card', data, this.httpOptions); 
  }



}


//------------ INTERFACES -----------//

export interface getApiCard {
  
  id: number;  
  name: String;  
  description: String;
  family: String;
  affinity: String;
  imgUrl: String;
  smallImgUrl: String;
  energy: number;
  hp: number;
  defense: number;
  attack: number;
  price: number;
  userId: number;

}
