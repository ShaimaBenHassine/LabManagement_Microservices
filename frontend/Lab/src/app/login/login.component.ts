import { Component, NgZone, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../services/AuthService';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(
    private authService: AuthService,
    private router: Router,
    private ngZone: NgZone,
    ) { }

  ngOnInit(): void {
  }

 tryGoogleLogin(): void {
    this.authService.doGoogleLogin()
      .then(() => this.successRedirect())
      .catch(error => console.log(error))
      .finally(() => {
      });
  }

  successRedirect(): void {
    // noinspection JSIgnoredPromiseFromCall
    //ngzone.run trajaani lel application ki mchit l serveur d'auth pour que je puisse exécuter les path de mon application
    this.ngZone.run(() => this.router.navigate(['/members']));
  }
}
