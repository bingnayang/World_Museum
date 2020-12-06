import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateMuseumComponent } from './create-museum/create-museum.component';
import { MuseumListComponent } from './museum-list/museum-list.component';
import { ViewDetailMuseumComponent } from './view-detail-museum/view-detail-museum.component';

const routes: Routes = [
  {path: 'museums',component: MuseumListComponent},
  {path: 'create-museum',component: CreateMuseumComponent},
  {path: 'view-detail-museum/:id',component: ViewDetailMuseumComponent},
  {path: '',redirectTo: 'museums', pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
