package ie.tudublin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	List<String> notes = new ArrayList<String>();

	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	public void loadScore()
	{
		String str[] = score.split(",");
		notes = Arrays.asList(str);
	}	

	public void printScores()
	{
		for(String n:notes)
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

		for(int i = 0; i < 5; i++)
		{
			float y = map(i, -5, 5, border, height - border);
			stroke(0);
			line(border, y, width, y);
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
