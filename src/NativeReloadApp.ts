import { TurboModuleRegistry, type TurboModule } from 'react-native';

export interface Spec extends TurboModule {
  reloadApp(): Promise<string>;
}

export default TurboModuleRegistry.getEnforcing<Spec>('ReloadApp');
