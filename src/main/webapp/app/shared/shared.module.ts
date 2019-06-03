import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { AnotherTestTwoSharedLibsModule, AnotherTestTwoSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [AnotherTestTwoSharedLibsModule, AnotherTestTwoSharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [AnotherTestTwoSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class AnotherTestTwoSharedModule {
  static forRoot() {
    return {
      ngModule: AnotherTestTwoSharedModule
    };
  }
}
