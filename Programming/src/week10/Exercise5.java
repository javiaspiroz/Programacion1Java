package week10;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));
		
		//Set the name of the album
		
		System.out.println("Enter the name of the album");
		Album newAlbum = new Album();
		newAlbum.set_albumTittle(sc.next());
		
		
		
		System.out.println("Enter the amount of the songs");
		int nSongs = sc.nextInt();
		Song [] songList = new Song[nSongs]; //Create an array of songs
		
		for(int i=0; i<songList.length; i++){ //Fill each field of the array (Name, Duration, and Author)
			
			songList[i] = new Song(); //Create a song (Position i of the list)
			
			System.out.println("Enter the name of the song number "+i);
			songList[i].set_tittle(sc.next());
			System.out.println("Enter the duration of the song");
			songList[i].set_duration(sc.nextInt());
			System.out.println("Enter the name of the song's author");
			Person author = new Person(); //Create a new person (Author) and fill its fields
			author.set_personName(sc.next());
			System.out.println("Enter the author's birthday year");
			author.set_birthYear(sc.nextInt());
			songList[i].set_author(author); //Assign the person "author" as the author of the song
			
		}
		newAlbum.set_songs(songList); //Assign the array of songs to the songs of the album
		
		
		
		System.out.println("Enter the album's releasing year"); //Assign the releasing year of the album
		newAlbum.set_releasingYear(sc.nextInt());
		System.out.println("Enter the album's price"); //Assign the price of the Album
		newAlbum.set_price(sc.nextDouble());
		
		
		
		Band band = new Band(); //Create a new Band and fill its fields
		System.out.println("Enter the name of the band");
		band.set_bandName(sc.next());
		System.out.println("Enter the band's creation year");
		band.set_creationYear(sc.nextInt());
		System.out.println("Enter the number of band's members");
		
		
		int nMembers = sc.nextInt();
		Person[] membersList = new Person[nMembers]; //Create an array of persons (Members of the band)
		for(int i=0; i<membersList.length; i++){ //Fill the fields of the array
			
			membersList[i]= new Person(); //Create a new person (Position i of the List)
			
			System.out.println("Enter the name of the band's member");
			membersList[i].set_personName(sc.next());
			System.out.println("Enter the member's birthday year");
			membersList[i].set_birthYear(sc.nextInt());
			
		}
		band.set_members(membersList); //Assign the array of persons to the band's members
		newAlbum.set_band(band); //Assign the band to the album
		
		sc.close();
		
		System.out.println("Album: "+newAlbum.get_albumTittle()+" ("+newAlbum.get_releasingYear()+") "+newAlbum.get_price()+"$");
		System.out.println("By: "+newAlbum.get_band().get_bandName()+" ("+newAlbum.get_band().get_creationYear()+") ");
		for(int i=0; i<membersList.length; i++){
			System.out.println("\t"+membersList[i].get_personName()+ " ("+membersList[i].get_birthYear()+")");
		}
		System.out.println("Songs: ");
		for(int i = 0; i<songList.length; i++){
			System.out.println("\t"+songList[i].get_tittle()+" ("+songList[i].get_duration()+" seconds)");
		}

	}

}
