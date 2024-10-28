package main.moo;

import com.github.ricksbrown.cowsay.plugin.CowExecutor;

/**
 * Some examples on how to use cowsay from Java.
 * @author Rick Brown
 */
public final class Moo {

	public static void main(String[] args) {
		CowExecutor cowExecutor = new CowExecutor();
		cowExecutor.setCowfile("tux");
		cowExecutor.setMessage("The cool kids don't love Ant anymore");
		String result = cowExecutor.execute();
		System.out.println(result);
	}
}