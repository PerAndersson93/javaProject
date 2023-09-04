import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.less']
})
export class AppComponent {
  title = 'app';
  coolNumber: number = 1; //non-fancy way of initilizaion
  isFomo: boolean = true;

  constructor() { //fancy way of initilizaion
    this.title = "yolo"
  }




}
