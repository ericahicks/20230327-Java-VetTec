import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Example1Component } from './example1/example1.component';
import { Example2Component } from './example2/example2.component';
import { Example3Component } from './example3/example3.component';
import { Example4Component } from './example4.component';

const routes: Routes = [{path: "", component: Example1Component }, // default
// {path: "example/id", component: Example1Component }]; // can't use :id to choose a component only what data to load from your ts file
{path: "example/1", component: Example1Component },// can't use :id to choose a component only what data to load from your ts file
{path: "example/2", component: Example2Component }, // can't use :id to choose a component only what data to load from your ts file
{path: "example/3", component: Example3Component }, // can't use :id to choose a component only what data to load from your ts file
{path: "example/4", component: Example4Component }]; // can't use :id to choose a component only what data to load from your ts file

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
