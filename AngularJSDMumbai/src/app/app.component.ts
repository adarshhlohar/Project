import { Component } from '@angular/core';
import { User } from './user';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'TemplateForm';
  userModel = new User("Adarsh","Lohar",9689818708,"adarsh@gmail.com","Adarsh@123");
}


