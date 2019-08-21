import React, { Component } from 'react';
import { View, Text, Dimensions } from 'react-native';
import { Card, Button, Icon } from 'react-native-elements';

const SCREEN_WIDTH = Dimensions.get('window').width;

class FlipWordFront extends Component {
    render() {
        const { data } = this.props;
        return (
            <View
                style={styles.slideStyle}
            >
                <Card
                    title='EASY Front'
                    containerStyle={styles.cardStyle}
                >
                    <Text style={{ marginBottom: 10, textAlign: 'center', fontSize: 22 }}>
                        {data.sentence}
                    </Text>
                    

                    <Button
                        icon={<Icon name='code' color='#ffffff' />}
                        backgroundColor='#03A9F4'
                        buttonStyle={{borderRadius: 0, marginLeft: 0, marginRight: 0, marginBottom: 0}}
                        title='VIEW ANSWER'
                    />
                </Card>

                <View style={styles.counterStyle}>
                    <Text style={styles.counterTextStyle}>
                        1 / 123
                    </Text>
                </View>
            </View>
        );
    }
};

const styles = {
    slideStyle: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        width: SCREEN_WIDTH
    },
    cardStyle: {
        width: SCREEN_WIDTH - 40,
        marginLeft: 10,
        marginRight: 10,
        borderColor: '#af1fc1'
    },
    counterStyle: {
        width: 60,
        height: 60,
        borderRadius: 60 / 2,
        borderColor: 'green',
        borderWidth: 3,
        justifyContent: 'center',
        alignItems: 'center',
        marginTop: 10
    },
    counterTextStyle: {
        fontSize: 16
    }
};

export default FlipWordFront;
