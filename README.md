# ChessRequiem 

## Overview

This project is a Java-based chess game that allows players to play chess with a graphical user interface. The game includes functionalities for moving pieces, highlighting valid moves, and capturing opponent pieces. The project uses Swing for the GUI and is designed to be easily extendable.

## Table of Contents
- [Features](/#features)
- [File Structure](/#File-Structure)
- [How to Use](/#How-To-Use)
- [Prerequisites](/#Prerequisites)
- [Clone the Repository](/#Clone-the-Repository)

## Features

- Play chess with a graphical user interface.
- Move pieces by dragging and dropping.
- Highlight valid moves for selected pieces.
- Capture opponent pieces.

## File Structure
  source file [src](/src.c) contains the packages which contain the program files implementing the game ui and logic.
  
  - [main](/src/main)

      - [Main.java](/src/main/Main.java) : File containing Main method
      
      - [Board.java](/src/main/Board.java) : Implements functionality representing board and pieces on it.

      - [Input.java](/src/main/Input.java) : Implements functionality validating input.

      - [Move.java](/src/main/Move.java) : Implements functionality which shows valid moves for selected piece
     
  - [piece](/src/piece)

     Contain Classes defining each unique piece on chessboard

      -[Bishop.java](/src/pieces/Bishop.java)
    
      -[King.java](/src/pieces/King.java)

      -[Knight.java](/src/pieces/Knight.java)

      -[Pawn.java](/src/pieces/Pawn.java)

      -[Piece.java](/src/pieces/Piece.java)

      -[Queen.java](/src/pieces/Queen.java)

      -[Rook.java](/src/pieces/Rook.java)
      
  - [res](/src/res)
       - [pieces.png](/src/res/pieces.png) : contains resource(sprite sheet) containg pieces
         
## How to Use
 Run the main.java file and play the game . Make sure all the packages and files are installed in correct place.
 
## Prerequisites

- Java Development Kit (JDK) 8 or later
- Maven (optional, if used for build management)

## **Clone the Repository**

   ```bash
   git clone git clone https://github.com/esannihith/ChessRequiem


