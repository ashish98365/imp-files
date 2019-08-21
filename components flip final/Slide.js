import React, { Component } from 'react';
import { ScrollView, View, Text, Dimensions, FlatList } from 'react-native';
import { Card, Icon, Button } from 'react-native-elements';

import FlipWord from './FlipWord';

const SCREEN_WIDTH = Dimensions.get('window').width;

const reviseData = [
    { id: "1", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'Authority' },
    { id: "2", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "3", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "4", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "5", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "6", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "7", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "8", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "9", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "10", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "11", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "12", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "13", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "14", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "15", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "16", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "17", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "18", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "19", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "20", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "21", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "22", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "23", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "24", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "25", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "26", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "27", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "28", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "29", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "30", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "31", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "32", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "33", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "34", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "35", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "36", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "37", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "38", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "39", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "40", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "41", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "42", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "43", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "44", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "45", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "46", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "47", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "48", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "49", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "50", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "51", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "52", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "53", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "54", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "55", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "56", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "57", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "58", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "59", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "60", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "61", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
    { id: "62", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' },
  ];

class Slide extends Component {

    renderCard = (data, index) => {
        return (
            <FlipWord data={data} />
        );
    }

    render() {
        return (
            <FlatList
                horizontal
                pagingEnabled
                showsHorizontalScrollIndicator={false}
                legacyImplementation={false}
                data={reviseData}
                renderItem={this.renderCard}
                keyExtractor={data => data.id}
                style={{ flex: 1 }}
            />
        );
    }
}

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

export default Slide;
