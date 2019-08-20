import React, { Component } from 'react';
import { ScrollView, View, Text, Dimensions } from 'react-native';
import { Card, Icon, Button } from 'react-native-elements';

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
    { id: "14", list: "", easy: 5, medium: 70, hard: 9, notAdded: 30, sentence: 'This is a test sentence' }
  ];

class Slide extends Component {

    renderCard() {
        return reviseData.map((data, index) => {
            return (
                <View
                    key={index}
                    style={styles.slideStyle}
                >
                    <Card
                        title='EASY'
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
        });
    }

    render() {
        return (
            <ScrollView
                horizontal
                style={{ flex: 1 }}
                pagingEnabled
            >
                { this.renderCard() }
            </ScrollView>
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
