import { View, StyleSheet, Button } from 'react-native';
import { reloadApp } from 'react-native-reload-app';

export default function App() {
  return (
    <View style={styles.container}>
      <Button
        title="Reload App"
        onPress={() => {
          reloadApp()
            .then((message) => {
              console.log(message);
            })
            .catch((error) => {
              console.error(error);
            });
        }}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
