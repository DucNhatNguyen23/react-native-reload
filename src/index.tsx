import ReloadApp from './NativeReloadApp';

export function reloadApp(): Promise<string> {
  return ReloadApp.reloadApp();
}
