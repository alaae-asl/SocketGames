package org.asl.socketserver.games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.asl.socketserver.MenuInfo;
import org.asl.socketserver.Servable;

@MenuInfo(authors = {
"Kent Collins" }, version = "Winter, 2018", title = "BombsAway", description = "WW2 Bomber Jet")


public class BombsAway implements Servable {


	@Override
	public void serve(BufferedReader input, PrintWriter out) throws IOException {
		// TODO Auto-generated method stub
		
		int missions=0;
		int fate = 0;
		int enemyWeps = 0;
		int percentHit = 0;
		int target = 0;
		out.println("YOU ARE A PILOT IN A WW2 BOMBER");
		
		out.println("What side -- Italy(1), Allies(2), Japan(3), Germany(4)");
		int side = Integer.parseInt(input.readLine());
		
		while(side<1 || side >4){
			out.println("Try again");
			out.println("What side -- Italy(1), Allies(2), Japan(3), Germany(4)");
			 side = Integer.parseInt(input.readLine());
			if(side>=1 && side <=4){
				break;
			}
		}

		if(side==1){
			out.println("Input your target -- Albania(1), Greece(2), North Africa(3)");
			target = Integer.parseInt(input.readLine());
			while(target<1 || target>3){
				out.println("Try again");
				out.println("Input your target -- Albania(1), Greece(2), North Africa(3)");
				target = Integer.parseInt(input.readLine());
				if(target>=1 && target <=3){
					break;
				}

			}
			if(target == 1) {

				out.println("Shoud be easy, you're flying a nazi made plane.");
				out.println("How many missions have you flown?");
				missions = Integer.parseInt(input.readLine());
				while(missions > 160){
					System.out.println("Missions, not miles.");
					System.out.println("Now then.....");
					System.out.println("How many missions have you flown?");
					if(missions <160){
						break;
					}
				}
				if(missions <= 25) {
					out.println("Straight out of training eh?");
					if(missions < 160 * Math.random()){
						out.println("Missed target by " + 2+30* Math.random() + " miles");	
						out.println("Now you're really in for it!!");
						out.println("Does the enemy have guns(1), missiles(2), or both(3)");
						 enemyWeps = Integer.parseInt(input.readLine());
						while(enemyWeps<1 || enemyWeps >3){
							out.println("Try again");
							out.println("Does the enemy have guns(1), missiles(2), or both(3)");
							enemyWeps = Integer.parseInt(input.readLine());	
						}
						if(enemyWeps == 1){
							out.println("What is the percent hit rate of the gunners?(10-50)");
							percentHit = Integer.parseInt(input.readLine());
							if(percentHit<10) {
								out.println("You lie, but you'll pay");
								out.println("********BOOM********");
								out.println("Dearly beloved, we are gather here today to pay our last tribute.....");
							}
							if(percentHit > 100 * Math.random()){
								out.println("********BOOM********");
									out.println("Dearly beloved, we are gather here today to pay our last tribute.....");
								}else{
									out.println("You made it through tremendous flak!!!!!! you win.");
								}

								
						}else if(enemyWeps > 1){
							fate = 35;
								if((fate + percentHit) > 100 * Math.random()){
									out.println("********BOOM********");
									out.println("Dearly beloved, we are gather here today to pay our last tribute.....");
								}else{
									out.println("You made it through tremendous flak!!!!!! you win.");
								}

						}
					}else {
						out.println("Direct hit, " + 100*Math.random() + " killed.");
						out.println("You win!!!");
					}} else if(missions >25 && missions < 100) {
						out.println("Thats pushing the odds");
						if(missions <160*Math.random()){
							out.println("Missed target by " + 2+30* Math.random() + " miles");
							out.println("Now you're really in for it!!");
							out.println("Does the enemy have guns(1), missiles(2), or both(3)");
							enemyWeps = Integer.parseInt(input.readLine());
							out.println("What is the percent hit rate of the gunners?(10-50)");
							percentHit = Integer.parseInt(input.readLine());
							if(enemyWeps > 1){
								fate = 35;
								if((fate + percentHit) > 100 * Math.random()){
									out.println("********BOOM********");
									out.println("Dearly beloved, we are gather here today to pay our last tribute.....");
								}else{
									out.println("You made it through tremendous flak!!!!!! you win.");
								}
							} else {
								if(percentHit  > 100 * Math.random()){
									out.println("********BOOM********");
									out.println("Dearly beloved, we are gather here today to pay our last tribute.....");
								}else{
									out.println("You made it through tremendous flak!!!!!! you win.");
								}	
							}

						} else {
							out.println("Direct hit, " + 100*Math.random() + " killed.");
							out.println("You win!!! ");
						}
					} else if(missions >= 100 && missions < 160){
						if(missions <160*Math.random()){
							out.println("Missed target by " + 2+30* Math.random() + " miles");
							out.println("Now you're really in for it!!");
							out.println("Does the enemy have guns(1), missiles(2), or both(3)");
							enemyWeps = Integer.parseInt(input.readLine());
							out.println("What is the percent hit rate of the gunners?(10-50)");
							percentHit = Integer.parseInt(input.readLine());
							if(enemyWeps > 1){
								fate = 35;
								if((fate + percentHit) > 100 * Math.random()){
									out.println("********BOOM********");
									out.println("Dearly beloved, we are gather here today to pay our last tribute.....");
								}else{
									out.println("You made it through tremendous flak!!!!!! you win.");
								}
							} else {
								if(percentHit  > 100 * Math.random()){
									out.println("********BOOM********");
									out.println("Dearly beloved, we are gather here today to pay our last tribute.....");
								}else{
									out.println("You made it through tremendous flak!!!!!! you win.");

								}
							}
						} else {
							out.println("Direct hit, " + 100*Math.random() + " killed.");
										out.println("You win!!! ");
						}
					}
				}
			
		}
	}
}
