package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	ArrayList<Note> notes = new ArrayList<Note>();

	private float leftBorder;
    private float border;

	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	public void loadScore()
	{
		
	}	

	public void printScores()
	{
		for(Note n:notes)
		{
			println(n);
		}
	}

	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void straveLines()
	{
		float border = 0.1f * width;

		for(int i = 1; i<= 5; i++)
		{
			float y = map(i, 1, 9, border * 2, height + 50 - border);
			stroke(0, 0, 0);
			line(border, y, width - border, y);
		}
	}

	public void setup() 
	{
		printScores();
	}

	public void draw()
	{
		background(255);
		straveLines();
		
	}

	void drawNotes()
	{
	}
}
