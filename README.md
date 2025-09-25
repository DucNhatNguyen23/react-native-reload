# react-native-reload-app

A lightweight React Native TurboModule that enables programmatic app reloading.  
Useful for refreshing the UI or applying updates while preserving the JavaScript bundle state.

## Installation

### Using npm
```bash
npm install react-native-reload-app
```

### Using yarn
```bash
yarn add react-native-reload-app
```

> **Note**: For React Native >= 0.72, this library leverages TurboModules (JSI) and is compatible with both iOS and Android.

## Usage

```javascript
import { reloadApp } from 'react-native-reload-app';

// Reload the app programmatically
async function handleReload() {
  try {
    const result = await reloadApp();
    console.log('Reload successful:', result);
  } catch (error) {
    console.error('Reload failed:', error);
  }
}
```

## Features
- Reload the app's JavaScript bundle on demand.
- Compatible with both iOS and Android platforms.
- Preserves user session and state (e.g., does not clear AsyncStorage or Redux by default).
- Simple API: `reloadApp()` returns a Promise for easy integration.

## Contributing
We welcome contributions! Please follow these guidelines:
- **Development Workflow**: Fork the repository, make changes, and submit a pull request.
- **Sending a Pull Request**: Ensure your code follows the project's coding standards and includes tests.
- **Code of Conduct**: Be respectful and inclusive in all interactions.

## Author
Duc Nhat Nguyen  
GitHub: [DucNhatNguyen23](https://github.com/DucNhatNguyen23)

## Repository
[https://github.com/DucNhatNguyen23/react-native-reload](https://github.com/DucNhatNguyen23/react-native-reload)

## License
MIT

---

*Created with [create-react-native-library](https://github.com/callstack/react-native-builder-bob)*