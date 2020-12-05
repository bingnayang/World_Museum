import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MuseumListComponent } from './museum-list/museum-list.component';
import { HttpClientModule } from '@angular/common/http';
import { CreateMuseumComponent } from './create-museum/create-museum.component';
 
@NgModule({
  declarations: [
    AppComponent,
    MuseumListComponent,
    CreateMuseumComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
