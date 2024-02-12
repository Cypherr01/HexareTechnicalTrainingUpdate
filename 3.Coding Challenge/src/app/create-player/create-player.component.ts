import { Component } from '@angular/core';
import { PlayerService } from '../player.service';

@Component({
  selector: 'app-create-player',
  templateUrl: './create-player.component.html',
  styleUrls: ['./create-player.component.css']
})
export class CreatePlayerComponent {
  constructor(private playerService:PlayerService){}
  onSubmit(data: any){
    // console.log(data.form.value)
    this.playerService.createPlayer(data.form.value).subscribe((response)=>{console.log(response)})

  }
}
