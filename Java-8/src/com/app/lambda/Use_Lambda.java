package com.app.lambda;

import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Use_Lambda {

	public static void main(String[] args) {

		Label label = new Label();
        
		Button button = new Button("Send");
		         
		button.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        label.setText("Sent");
		    }
		});
	}

}
