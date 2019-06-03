import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'region',
        loadChildren: './region/region.module#AnotherTestTwoRegionModule'
      },
      {
        path: 'country',
        loadChildren: './country/country.module#AnotherTestTwoCountryModule'
      },
      {
        path: 'location',
        loadChildren: './location/location.module#AnotherTestTwoLocationModule'
      },
      {
        path: 'department',
        loadChildren: './department/department.module#AnotherTestTwoDepartmentModule'
      },
      {
        path: 'task',
        loadChildren: './task/task.module#AnotherTestTwoTaskModule'
      },
      {
        path: 'employee',
        loadChildren: './employee/employee.module#AnotherTestTwoEmployeeModule'
      },
      {
        path: 'job',
        loadChildren: './job/job.module#AnotherTestTwoJobModule'
      },
      {
        path: 'job-history',
        loadChildren: './job-history/job-history.module#AnotherTestTwoJobHistoryModule'
      },
      {
        path: 'employee',
        loadChildren: './employee/employee.module#AnotherTestTwoEmployeeModule'
      },
      {
        path: 'job',
        loadChildren: './job/job.module#AnotherTestTwoJobModule'
      },
      {
        path: 'department',
        loadChildren: './department/department.module#AnotherTestTwoDepartmentModule'
      }
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ])
  ],
  declarations: [],
  entryComponents: [],
  providers: [],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class AnotherTestTwoEntityModule {}
