package Clases;

import Vista.*;

public class Navegador {
    public Juego game;
    public Jugador player;
    public Tablero board;
    public Inicio gui;
    public GameBasic vista1;
    public MediumGame vista2;
    public HardGame vista3;

    public Navegador() {
        game = new Juego(this);
        player = new Jugador(this);
        board = new Tablero(this);
        gui = new Inicio(this);
        vista1 = new GameBasic(this);
        vista2 = new MediumGame(this);
        vista3 = new HardGame(this);
    }
    
}
