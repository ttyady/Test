package com.example.sudoku;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;


public class Game extends Activity{
	private static final String TAG ="Sudoku";

	public static final String KEY_DIFFICULTY ="com.example.sudoku.difficulty";
	public static final int DIFFICULTY_EASY = 0;
	public static final int DIFFICULTY_MEDIUM = 1;
	public static final int DIFFICULTY_HARD = 2;

	private int puzzle[] = new int[9*9];

	private PuzzleView puzzleView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG,"onCreate");

		int diff = getIntent().getIntExtra(KEY_DIFFICULTY,DIFFICULTY_EASY);
		//calculateUsedTiles();

		puzzleView = new PuzzleView(this);
		setContentView(puzzleView);
		//puzzleView.rewuestFocus();
	}









	/*
	protected boolean setTileValid(int x,int y,int value){
		int tiles[] = getUsedTiles(x,y);
		if(value !=0){
			for(int tile:tiles){
				if(tile==value)
					return false;
			}
		}
		setTile(x,y,value);
		calculateUsedTiles();
		return true;
	}

	private final int used[][][] = new int [9][9][];

	protected int[] getUsedTiles(int x,int y){
		return used[x][y];
	}

	private void calculateUsedTiles(){
		for(int x=0; x<9; x++){
			for(int y=0; y<9; y++){
				used[x][y] = calculateUsedTiles(x,y);
				//Log.d(TAG,"used["+x+"]["+y+"}="
				//+toPuzzleString(used[x][y]));
			}
		}
	}

	private int[] calculateUsedTiles(int x,int y){
		int c[] = new int[9];
		//横
		for(int i=0; i<9; i++){
			if(i==y)
				continue;
			int t=getTile(x,i);
			if(t !=0)
				c[t-1] = t;
		}
		//縦
		for(int i=0; i<9; i++){
			if(i==x)
				continue;
			int t = getTile(i,y);
			if(t !=0)
				c[t-1] = t;
		}
		//ブロック
		int startx = (x/3)*3;
		int starty = (y/3)*3;
		for (int i=startx; i<startx+3; i++){
			for(int j=starty; j<starty+3; j++){
				if(i==x&&j==y)
					continue;
				int t = getTile(i,j);
				if(t !=0)
					c[t-1] = t;
			}
		}
		//圧縮
		int nused = 0;
		for(int t:c){
			if (t !=0)
				nused++;
		}
		int c1[] = new int[nused];
		nused = 0;
		for(int t:c){
			if(t !=0)
				c1[nused++] = t;
		}
		return c1;
	}
	*/
}
