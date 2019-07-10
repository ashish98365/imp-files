import React, { Component } from 'react';
import { View, Text } from 'react-native';
import { Card, Button, Icon } from 'react-native-elements';

class FlipWordFront extends Component {
    render() {
        return (
            <View>
                <Card
                title='HELLO WORLD'
                image={{ uri: 'https://images-na.ssl-images-amazon.com/images/I/717DWgRftmL._SX522_.jpg' }}>
                    <Text style={{ marginBottom: 10 }}>
                    This is card front.
                    </Text>
                    <Button
                        icon={<Icon name='code' color='#ffffff' />}
                        backgroundColor='#03A9F4'
                        buttonStyle={{ borderRadius: 0, marginLeft: 0, marginRight: 0, marginBottom: 0 }}
                        title='VIEW NOW' 
                    />
                </Card>
            </View>
        );
    }
}

export default FlipWordFront;
