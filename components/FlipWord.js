import React, { Component } from 'react';
import { View, Text, TouchableWithoutFeedback } from 'react-native';
import { Card, Button, Icon } from 'react-native-elements';
import CardFlip from 'react-native-card-flip';

import FlipWordFront from './FlipWordFront';
import FlipWordBack from './FlipWordBack';

const reviseData = [
    { id: "1", list: "1", easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: "2", list: "2", easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: "3", list: "3", easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: "4", list: "4", easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: "5", list: "5", easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: "6", list: "6", easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: "7", list: "7", easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: "8", list: "8", easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: "9", list: "9", easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: "10", list: "10", easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: "11", list: "11", easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: "12", list: "12", easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: "13", list: "13", easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: "14", list: "14", easy: 5, medium: 70, hard: 9, notAdded: 30 }
  ];

class FlipWord extends Component {
    render() {
        return (
            <View style={{ flex: 1 }}>
                <CardFlip style={{ flex: 1 }} ref={(card) => { this.card = card; }}>
                    <TouchableWithoutFeedback onPress={() => this.card.flip()} >
                        <View style={{ height: 300, marginTop: 100 }}>
                            <FlipWordFront />
                        </View>
                    </TouchableWithoutFeedback>
                    <TouchableWithoutFeedback onPress={() => this.card.flip()} >
                    <View style={{ height: 300, marginTop: 100 }}>
                        <FlipWordBack />
                    </View>
                    </TouchableWithoutFeedback>
                </CardFlip>
            </View>
        );
    }
}

export default FlipWord;
