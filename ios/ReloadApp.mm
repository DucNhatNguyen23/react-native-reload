#import "ReloadApp.h"
#import <React/RCTBridge.h>
#import <React/RCTRootView.h>
#import <React/RCTReloadCommand.h>
#import <UIKit/UIKit.h>
@implementation ReloadApp
RCT_EXPORT_MODULE()

- (void)reloadApp:(RCTPromiseResolveBlock)resolve
           reject:(RCTPromiseRejectBlock)reject
{
  dispatch_async(dispatch_get_main_queue(), ^{
    @try {
      RCTTriggerReloadCommandListeners(@"Reload triggered");
      resolve(@"Reload triggered");
    } @catch (NSException *exception) {
      reject(@"RELOAD_FAILED", exception.reason, nil);
    }
  });
}

- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeReloadAppSpecJSI>(params);
}

@end
