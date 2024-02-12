import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreatePlayerComponent } from './create-player/create-player.component';
import { PlayerListComponent } from './player-list/player-list.component';

const routes: Routes = [
  {path: 'create-player', component:CreatePlayerComponent},
  {path: 'list-player', component:PlayerListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
