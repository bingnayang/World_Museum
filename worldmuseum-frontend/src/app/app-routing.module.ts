import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MuseumListComponent } from './museum-list/museum-list.component';

const routes: Routes = [
  {path: 'museums',component: MuseumListComponent},
  {path: '',redirectTo: 'museums', pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
