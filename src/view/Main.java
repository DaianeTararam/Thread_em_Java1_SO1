//@author Daiane Tararam

package view;

import controller.ThreadId;

public class Main {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			ThreadId thread = new ThreadId();
			thread.start();
		}		
	}
}
