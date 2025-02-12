package com.hucs.behavioral.visitor;

interface SpaceShip {
    void accept(SpaceShipVisitor visitor);
}
