import { NgModule } from '@angular/core';

import { AnotherTestTwoSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
  imports: [AnotherTestTwoSharedLibsModule],
  declarations: [JhiAlertComponent, JhiAlertErrorComponent],
  exports: [AnotherTestTwoSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class AnotherTestTwoSharedCommonModule {}
