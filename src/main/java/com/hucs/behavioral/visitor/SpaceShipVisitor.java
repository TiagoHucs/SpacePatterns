package com.hucs.behavioral.visitor;

public interface SpaceShipVisitor {
    void visit(ExplorationShip explorationShip);
    void visit(CargoShip cargoShip);
    void visit(PassengerShip passengerShip);
}
