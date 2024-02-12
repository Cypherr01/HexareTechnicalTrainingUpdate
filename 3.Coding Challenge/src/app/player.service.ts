import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

// this class is used to connect with backend

@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  constructor(private http:HttpClient) { }
  createPlayer(player:any){
    // console.log(player);
    return this.http.post("http://localhost:8181/api/player/add",player);
    
  }
  getPlayerNames(){
    return this.http.get<string[]>("http://localhost:8181/api/player/names");
  }
}
