import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MuseumListComponent } from './museum-list/museum-list.component';
import { HttpClientModule } from '@angular/common/http';
import { CreateMuseumComponent } from './create-museum/create-museum.component';
import { FormsModule } from '@angular/forms';
import { ViewDetailMuseumComponent } from './view-detail-museum/view-detail-museum.component';
import { SetHourComponent } from './set-hour/set-hour.component';
import { SetAdmissionRateComponent } from './set-admission-rate/set-admission-rate.component';
import { LoginComponent } from './login/login.component';
 
@NgModule({
  declarations: [
    AppComponent,
    MuseumListComponent,
    CreateMuseumComponent,
    ViewDetailMuseumComponent,
    SetHourComponent,
    SetAdmissionRateComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
