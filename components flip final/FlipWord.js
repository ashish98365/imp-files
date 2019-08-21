import React, { Component } from 'react';
import { View, Text, TouchableWithoutFeedback, Dimensions } from 'react-native';
import { Card, Button, Icon } from 'react-native-elements';
import CardFlip from 'react-native-card-flip';

import FlipWordFront from './FlipWordFront';
import FlipWordBack from './FlipWordBack';

const SCREEN_WIDTH = Dimensions.get('window').width;

class FlipWord extends Component {
    render() {
        const { data } = this.props;
        return (
            <View style={{ flex: 1 }}>
                <CardFlip style={{ flex: 1, width: SCREEN_WIDTH }} ref={(card) => { this.card = card; }}>
                    <TouchableWithoutFeedback onPress={() => this.card.flip()} >
                        <View style={{ height: 300, marginTop: 100 }}>
                            <FlipWordFront data={data} />
                        </View>
                    </TouchableWithoutFeedback>
                    <TouchableWithoutFeedback onPress={() => this.card.flip()} >
                    <View style={{ height: 300, marginTop: 100 }}>
                        <FlipWordBack data={data} />
                    </View>
                    </TouchableWithoutFeedback>
                </CardFlip>
            </View>
        );
    }
}

export default FlipWord;
