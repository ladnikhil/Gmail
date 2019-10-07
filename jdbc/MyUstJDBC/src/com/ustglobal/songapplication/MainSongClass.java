package com.ustglobal.songapplication;

import java.util.Scanner;

public class MainSongClass {

	public static void main(String[] args) {

		SongInterfaceImplementation so = new SongInterfaceImplementation();

		Scanner sc = new Scanner(System.in);

		System.out.println("to play the song  press 1");
		System.out.println("to search song press 2");
		System.out.println("to show all song names press 3");
		System.out.println("to perform operations on songs press 4");

		System.out.println("===welcome to music application========");
		System.out.println("enter ur choise");
		int i = sc.nextInt();
		String s = sc.nextLine();

		if (i == 1) {

			System.out.println("to play all the songs press A");
			System.out.println("to play all random songs press B");
			System.out.println("to play a particular song press C");

			System.out.println("enter ur choise");

			String choise = sc.nextLine();

			switch (choise) {
			case "A":
				so.playSongs();
				break;
			case "B":
				so.PlayAllRandomSong();
				break;
			case "C":
				so.playSpecificSong();
				break;
			}

		} else if (i == 2) {
			so.searchsong();
		} else if (i == 3) {
			so.showallSongs();
		} else {

			System.out.println("to insert music in music player press A");
			System.out.println("to edit music in music player press B");
			System.out.println("to delete music in music player press C");

			System.out.println("enter ur choise");

			String choise = sc.nextLine();

			switch (choise) {
			case "A":
				so.Operations();
				break;
			case "B":
				so.edit();
				break;
			case "C":
				so.delete();
				break;
			}

		}

	}

}
