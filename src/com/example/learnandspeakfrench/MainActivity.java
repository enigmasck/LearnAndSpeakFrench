package com.example.learnandspeakfrench;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	//instantiate main menu buttons
	Button ibVocab = (Button)findViewById(R.id.ib_vocab);
	Button ibGrammar = (Button)findViewById(R.id.ib_grammar);
	Button ibVerbs = (Button)findViewById(R.id.ib_verbs);
	Button ibPhrases = (Button)findViewById(R.id.ib_phrases);
	Button ibConvo = (Button)findViewById(R.id.ib_convo);
	Button ibTests = (Button)findViewById(R.id.ib_tests);
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //add button listeners
    	ibVocab.setOnClickListener(this);
    	ibGrammar.setOnClickListener(this);
    	ibVerbs.setOnClickListener(this);
    	ibPhrases.setOnClickListener(this);
    	ibConvo.setOnClickListener(this);
    	ibTests.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void startVocabMenu(View v){
    	Intent vocabMenuIntent = new Intent(this, VocabActivity.class);
    	startActivity(vocabMenuIntent);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

	
	
    
}
