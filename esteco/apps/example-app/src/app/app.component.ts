import { Component, inject } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { AsyncPipe } from '@angular/common';

@Component({
  imports: [RouterModule, AsyncPipe],
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss',
  standalone: true
})
export class AppComponent {
  title = 'example-app';

  httpClient: HttpClient = inject(HttpClient);

  greeting$: Observable<string> = this.httpClient.get('/api/hello', {responseType: 'text'});

}
