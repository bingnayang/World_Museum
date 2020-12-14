import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateMuseumComponent } from './create-museum/create-museum.component';
import { MuseumListComponent } from './museum-list/museum-list.component';
import { SetHourComponent } from './set-hour/set-hour.component';
import { ViewDetailMuseumComponent } from './view-detail-museum/view-detail-museum.component';
import { SetAdmissionRateComponent } from './set-admission-rate/set-admission-rate.component';
import { LoginComponent } from '../app/login/login.component';

const routes: Routes = [
  {path: 'museums',component: MuseumListComponent},
  {path: 'login',component: LoginComponent},
  {path: 'create-museum',component: CreateMuseumComponent},
  {path: 'view-detail-museum/:id',component: ViewDetailMuseumComponent},
  {path: 'set-hour/:id',component: SetHourComponent},
  {path: 'set-admission-rate/:id',component: SetAdmissionRateComponent},
  {path: '',redirectTo: 'museums', pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
