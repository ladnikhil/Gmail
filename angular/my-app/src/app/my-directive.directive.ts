import { Directive, ElementRef, HostListener, HostBinding } from '@angular/core';
import { Alert } from 'selenium-webdriver';

@Directive({
  selector: '[appMyDirective]'
})
export class MyDirectiveDirective {

  constructor(private elementRef: ElementRef) { 
    elementRef.nativeElement.style.background = 'pink';
    elementRef.nativeElement.style.color = 'white';
    elementRef.nativeElement.style.padding = "60px";
     
  }

@HostListener('mouseenter')
mouseEnter(){
  // alert("mouse enter");
  // this.background = "skyblue";                            // for hostbinding
  this.elementRef.nativeElement.style.background = 'red';
  this.elementRef.nativeElement.style.color = 'white';
  this.elementRef.nativeElement.style.fontSize = '40px';
}

@HostListener('mouseleave')
mouseLeave(){
  // alert("mouse leave");
  this.elementRef.nativeElement.style.background = 'green';
  this.elementRef.nativeElement.style.color = 'red';
  this.elementRef.nativeElement.style.fontSize = '20px';
}

@HostBinding('style.background')  background: string;



}
