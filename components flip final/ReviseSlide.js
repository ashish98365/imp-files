import React, { Component } from 'react';
import { View, Dimensions } from 'react-native';
import SideSwipe from 'react-native-sideswipe';

import FlipWord from './FlipWord';

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

class ReviseSlide extends Component {

    state = { currentIndex: 0 }

    render() {
        const { width } = Dimensions.get('window');
        const contentOffset = (width - FlipWord.WIDTH) / 2;

        return (
            <SideSwipe
                index={this.state.currentIndex}
                itemWidth={FlipWord.WIDTH}
                style={{ width }}
                data={reviseData}
                contentOffset={contentOffset}
                onIndexChange={index =>
                this.setState(() => ({ currentIndex: index }))
                }
                renderItem={({ itemIndex }) => (
                <FlipWord
                    list={itemIndex}
                />
                )}
            />
        );
    }
}

export default ReviseSlide;
