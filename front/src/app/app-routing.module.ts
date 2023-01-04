import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GroupComponent } from './group/group.component';
import { StudentComponent } from './student/student.component';
import { SubjectComponent } from './subject/subject.component';

const routes: Routes = [
  {path: 'etudiants', component: StudentComponent},
  {path: 'sujets', component: SubjectComponent},
  {path: 'groupes', component: GroupComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
