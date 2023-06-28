import { Component, OnInit } from '@angular/core';
import { ChildrenService } from '../children.service';

@Component({
  selector: 'parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  public name: string = "Bob";

  children!: string[];


  constructor(private service: ChildrenService) { 
    this.service = service;
  }

  ngOnInit() {
    this.service.getDummyData().subscribe(data => { 
      this.children = data;
    })
  }

  hasChildren() {
    return this.children.length; // 0 is falsy
  }


  // recordChild(childName: string) {
  //   console.log("recording child of name " + childName);
  //   this.children.push(childName);
  //   console.log("children is now " + this.children);
  // }

}
