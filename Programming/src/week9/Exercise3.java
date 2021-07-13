package week9;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));
		Album album=new Album(0);
		System.out.println("Enter the name of the album.");
		album.albumName=sc.next();
		System.out.println("Enter the realease year of the album.");
		album.albumYear=sc.nextInt();
		System.out.println("Enter the price of the album.");
		album.price=sc.nextFloat();
		System.out.println("Enter the number of songs in the album.");
		int songs=sc.nextInt();
		Song [] song=new Song [songs];
		System.out.println("Enter the name of the band or singer.");
		Band band=new Band();
		band.bandName=sc.next();
		System.out.println("Enter the year when the band was created or the singer began to sing.");
		band.bandYear=sc.nextInt();
		System.out.println("Enter the number of members of the band. (If is a singer write 1)");
		int members=sc.nextInt();
		Members [] member=new Members[members];
		for (int ii=0; ii<members; ii++){
			System.out.println("Enter the name of the member "+(ii+1)+".");
			String memberName=sc.next();
			System.out.println("Enter the year of birth of member"+(ii+1)+".");
			int memberYear=sc.nextInt();
			member[ii]=new Members (memberName, memberYear);
		}
		Author [] author=new Author[songs];
		for (int ii=0; ii<songs; ii++){
			System.out.println("Enter the name of the song "+(ii+1)+".");
			String songName=sc.next();
			System.out.println("Enter the duration of the song "+(ii+1)+" in seconds, please.");
			int duration=sc.nextInt();
			System.out.println("Enter the name of the author of the song "+(ii+1)+" (the person who wrote it).");
			String authorName=sc.next();
			System.out.println("Enter the year of birth of the author of the song"+(ii+1)+" .");
			int authorYear=sc.nextInt();
			song[ii]=new Song(songName, duration);
			author[ii]=new Author (authorName, authorYear);
		}
		//We print the data the user had added.
		System.out.println("Album: "+album.albumName+" ("+album.albumYear+") "+"Price: "+album.price+"€");
		System.out.println("By: "+band.bandName+" ("+band.bandYear+")");
		for(int ii=0; ii<members; ii++){
			System.out.println(member[ii].memberName+" ("+member[ii].memberYear+")");
		}
		System.out.println("Songs:");
		for(int ii=0; ii<songs; ii++){
			System.out.println((ii+1)+". "+song[ii].songName+" ("+song[ii].duration+" seconds), written by "+author[ii].authorName+" ("+author[ii].authorYear+")");
		}
		sc.close();
	}
}