# Tower Defense Game

A classic tower defense game built in Java with Swing, featuring a custom level editor and multiple enemy types. Players can create their own levels, place towers, and defend against waves of enemies following pathfinding routes.

## Features

### Game Modes
- **Play Mode**: Experience tower defense gameplay with enemies following pathfinding routes
- **Edit Mode**: Create and customize your own levels with an intuitive level editor
- **Settings**: Configure game options and preferences
- **Main Menu**: Easy navigation between all game modes

### Core Gameplay
- **Enemy Types**: Four unique enemy types (Orc, Bat, Knight, Wolf) with different characteristics
- **Path-based Movement**: Enemies follow designated road paths from start to end points
- **Tile-based Level System**: 20x20 grid system with multiple tile types (Water, Grass, Road)
- **Custom Levels**: Save and load custom level designs
- **Animated Sprites**: Support for both static and animated tiles

### Level Editor
- **Tile Placement**: Paint tiles directly onto the grid
- **Path Points**: Set custom start and end points for enemy routes
- **Live Preview**: See selected tiles before placement
- **Sprite Rotation**: Rotate tiles using the 'R' key
- **Save/Load**: Persist custom levels to disk
- **Intuitive Toolbar**: Easy-to-use tile selection interface

## Technical Details

### Architecture
The game follows a clean MVC-inspired architecture with the following components:

- **Main Package**: Core game loop, rendering, and window management
- **Scenes Package**: Different game states (Menu, Playing, Editing, Settings)
- **Managers Package**: Entity management (Enemies, Towers, Tiles)
- **Objects Package**: Game objects (Towers, Tiles, Path Points)
- **UI Package**: User interface components (Buttons, Toolbars, Action Bars)
- **Inputs Package**: Mouse and keyboard event handling
- **Enemies Package**: Enemy entity definitions
- **Helper Package**: Utilities for image loading, level persistence, and constants

### Performance
- **120 FPS** rendering
- **60 UPS** (Updates Per Second) game logic
- Optimized tile-based rendering
- Efficient sprite atlas system

### Graphics
- Custom sprite atlas with all game graphics
- 32x32 pixel tile system
- Support for animated sprites
- Clean, pixel-art aesthetic

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 11 or higher
- Java Runtime Environment (JRE)

### Running the Game
```bash
# Compile the project
javac -d bin src/**/*.java

# Run the game
java -cp bin main.Game
```

### Project Structure
```
src/
├── UI/                    # User interface components
│   ├── ActionBar.java     # In-game action bar
│   ├── Bar.java           # Generic bar component
│   ├── MyButton.java      # Custom button implementation
│   └── Toolbar.java       # Level editor toolbar
├── enemies/               # Enemy definitions
│   ├── Bat.java
│   ├── Enemy.java         # Abstract enemy base class
│   ├── Knight.java
│   ├── Orc.java
│   └── Wolf.java
├── helper/                # Utility classes
│   ├── Constants.java     # Game constants and enums
│   ├── ImgFix.java        # Image manipulation utilities
│   ├── LoadSave.java      # Level save/load functionality
│   └── Util.java          # General utilities
├── inputs/                # Input handling
│   ├── KeyboardListener.java
│   └── MyMouseListener.java
├── main/                  # Core game files
│   ├── Game.java          # Main game class and loop
│   ├── GameScreen.java    # Game canvas
│   ├── GameStates.java    # Game state enum
│   └── Render.java        # Rendering manager
├── managers/              # Entity managers
│   ├── EnemyManager.java  # Enemy spawning and updates
│   ├── TileManager.java   # Tile type management
│   └── TowerManager.java  # Tower management
├── objects/               # Game objects
│   ├── PathPoint.java     # Enemy path waypoints
│   ├── Tile.java          # Tile definition
│   └── Tower.java         # Tower definition
├── scenes/                # Game scenes/states
│   ├── Editing.java       # Level editor scene
│   ├── GameScene.java     # Abstract scene base
│   ├── Menu.java          # Main menu
│   ├── Playing.java       # Gameplay scene
│   ├── SceneMethods.java  # Scene interface
│   └── Settings.java      # Settings menu
└── spriteatlas.png        # Game sprite sheet
```

## How to Play

### Main Menu
- **Play**: Start playing the current level
- **Edit**: Open the level editor
- **Settings**: Configure game settings
- **Quit**: Exit the game

### Playing Mode
1. Enemies spawn at the designated start point
2. They follow the road path to reach the end point
3. Use the action bar to place towers (feature in development)
4. Prevent enemies from reaching the end point

### Editing Mode
1. Select tiles from the toolbar at the bottom
2. Click on the grid to place tiles
3. Use the 'R' key to rotate certain tiles
4. Set start and end points for enemy paths (must be placed on road tiles)
5. Save your level when finished
6. Return to menu and play your custom level

## Controls

### Mouse Controls
- **Left Click**: Select tiles, place objects, interact with UI
- **Mouse Move**: Preview tile placement, hover effects
- **Mouse Drag**: Paint tiles continuously in edit mode

### Keyboard Controls
- **R**: Rotate selected sprite (in edit mode)

## Game Constants

### Tile Types
- **Water Tile** (0): Decorative, blocks enemy movement
- **Grass Tile** (1): Decorative, blocks enemy movement
- **Road Tile** (2): Pathable terrain for enemies

### Enemy Types
- **Orc** (0): Basic enemy type
- **Bat** (1): Flying enemy variant
- **Knight** (2): Armored enemy type
- **Wolf** (3): Beast enemy type

### Directions
- **Left** (0)
- **Up** (1)
- **Right** (2)
- **Down** (3)

## Known Issues & Future Enhancements

### Current Limitations
- Tower placement not yet implemented
- No wave system for enemy spawning
- Limited number of enemy types
- No sound effects or music
- Basic UI without themes

### Planned Features
- Tower placement and upgrade system
- Wave-based enemy spawning
- Resource management (gold/currency)
- Power-ups and special abilities
- Multiple level campaigns
- Difficulty settings
- Sound effects and background music
- High score tracking
- More enemy and tower varieties

## Performance Tips
- The game runs at 120 FPS by default
- Monitor console for FPS/UPS metrics
- Reduce sprite animations for lower-end systems
- Close unnecessary background applications

## Contributing
Feel free to fork this project and submit pull requests for:
- Bug fixes
- New features
- Performance improvements
- Documentation enhancements
- Additional levels or assets
