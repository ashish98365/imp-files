import React, { Component } from 'react';
import { View, FlatList } from 'react-native';
import { Card, ListItem } from 'react-native-elements';

const reviseData = [
    { id: '1', list: '1', easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: '2', list: '2', easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: '3', list: '3', easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: '4', list: '4', easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: '5', list: '5', easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: '6', list: '6', easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: '7', list: '7', easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: '8', list: '8', easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: '9', list: '9', easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: '10', list: '10', easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: '11', list: '11', easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: '12', list: '12', easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: '13', list: '13', easy: 5, medium: 70, hard: 9, notAdded: 30 },
    { id: '14', list: '14', easy: 5, medium: 70, hard: 9, notAdded: 30 }
  ];

class CardList extends Component {
    keyExtractor = (item, index) => index.toString();

  renderItem = ({ item }) => {
    const { id, list, easy, medium, hard, notAdded } = item;

    return (
      <Card
        title={`Word List ${list}`}
      >
        <ListItem 
          title={'Easy'}
          subtitle={`(${easy} words)`}
          leftIcon={{ name: 'flight-takeoff' }}
        />
        <ListItem 
          title={'Medium'}
          subtitle={`(${medium} words)`}
          leftIcon={{ name: 'flight-takeoff' }}
        />
        <ListItem 
          title={'Hard'}
          subtitle={`(${hard} words)`}
          leftIcon={{ name: 'flight-takeoff' }}
        />
        <ListItem 
          title={'Not Added'}
          subtitle={`(${notAdded} words)`}
          leftIcon={{ name: 'flight-takeoff' }}
        />
      </Card>
    );
  };
    

  render() {
    return (
      <View style={{ flex: 1 }}>
        <FlatList 
          keyExtractor={this.keyExtractor}
          data={reviseData}
          renderItem={this.renderItem}
        />
      </View>
    );
  }
}

export default CardList;
