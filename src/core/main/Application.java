/**
 * 
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Axel
 * @author Geoffrey
 */

public class Application {
	static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
	/**
	 * Function
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
		
		
		System.out.println("Ascii-Art by Axel and Geoffrey");
		Template template = new Template();
		/**
		 * Create template
		 */
		Template template1 = new Template(1,10,15);
		Template template2 = new Template(2,5,8);
		System.out.println("Choississez un template :");
		
		System.out.println(template1.toString());
		System.out.println(template2.toString());
	
		String choix_template = entree.nextLine();
		int id_template = Integer.parseInt(choix_template);
		if(id_template == 1) {
			template = template1;
		} else {
			template = template2;
		}
		
		//System.out.println("\nAlphabet :");
		//String Useralpha = entree.nextLine();
		template.setAlphabet(alphabet);
		
        System.out.println("Saisir un texte :");
        String EntreeUser = entree.nextLine().toUpperCase();
        
        ArrayList<String> ascii = new ArrayList<String>();
		for(int i = 0; i < template.getHeight(); i++) {
			ascii.add(entree.nextLine());
		}
		
		ascii.add(" #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###  ");
		ascii.add("# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #  ");
		ascii.add("### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##  ");
		ascii.add("# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #        ");
		ascii.add("# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ");
		
        ArrayList<Integer> indexes = new ArrayList<Integer>();
		for(char c : EntreeUser.toCharArray()) {
			if(c < 'A' || c > 'Z') indexes.add(26);
			else {
				for(char letter : template.getAlphabet().toCharArray()) {
					if(c == letter) {
						indexes.add(template.getAlphabet().indexOf(letter));
					}
				}
			}
		}
		
        for(int j = 0; j < template.getHeight(); j++) {
			for(int k = 0; k < indexes.size(); k++) {
				System.out.print(ascii.get(j).substring(indexes.get(k)*template.getWidth(), indexes.get(k)*template.getWidth() + template.getWidth()));
			}
			System.out.println();
		}
        entree.close();
	}
}
