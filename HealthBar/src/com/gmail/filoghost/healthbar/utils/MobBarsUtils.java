package com.gmail.filoghost.healthbar.utils;

import org.bukkit.configuration.file.FileConfiguration;

public class MobBarsUtils {

	//enforce non-instantiability with a private constructor
	private MobBarsUtils() {}
	
	/*
	 *  Used to retrieve the array that contains the health bars from the configs
	 */
	public static String[] getDefaultsBars(FileConfiguration config) {
		
		String[] barArray = new String[21];

		int mobBarStyle = config.getInt("mob-bars.display-style");
		
		if (mobBarStyle == 2)
		{
		      barArray[0] = "§c|§7|||||||||||||||||||"; 		barArray[1] = "§c|§7|||||||||||||||||||";
		      barArray[2] = "§c||§7||||||||||||||||||"; 		barArray[3] = "§c|||§7|||||||||||||||||";
		      barArray[4] = "§c||||§7||||||||||||||||"; 		barArray[5] = "§e|||||§7|||||||||||||||";
		      barArray[6] = "§e||||||§7||||||||||||||"; 		barArray[7] = "§e|||||||§7|||||||||||||";
		      barArray[8] = "§e||||||||§7||||||||||||"; 		barArray[9] = "§e|||||||||§7|||||||||||";
		      barArray[10] = "§e||||||||||§7||||||||||"; 		barArray[11] = "§a|||||||||||§7|||||||||";
		      barArray[12] = "§a||||||||||||§7||||||||"; 		barArray[13] = "§a|||||||||||||§7|||||||";
		      barArray[14] = "§a||||||||||||||§7||||||"; 		barArray[15] = "§a|||||||||||||||§7|||||";
		      barArray[16] = "§a||||||||||||||||§7||||"; 		barArray[17] = "§a|||||||||||||||||§7|||";
		      barArray[18] = "§a||||||||||||||||||§7||"; 		barArray[19] = "§a|||||||||||||||||||§7|";
		      barArray[20] = "§a||||||||||||||||||||";
		}
		else if (mobBarStyle == 3)
		{
		      barArray[0] = "§c❤§7❤❤❤❤❤❤❤❤❤"; 			barArray[1] = "§c❤§7❤❤❤❤❤❤❤❤❤";
		      barArray[2] = "§c❤§7❤❤❤❤❤❤❤❤❤"; 			barArray[3] = "§c❤❤§7❤❤❤❤❤❤❤❤";
		      barArray[4] = "§c❤❤§7❤❤❤❤❤❤❤❤"; 				barArray[5] = "§e❤❤❤§7❤❤❤❤❤❤❤";
		      barArray[6] = "§e❤❤❤§7❤❤❤❤❤❤❤"; 				barArray[7] = "§e❤❤❤❤§7❤❤❤❤❤❤";
		      barArray[8] = "§e❤❤❤❤§7❤❤❤❤❤❤"; 				barArray[9] = "§e❤❤❤❤❤§7❤❤❤❤❤";
		      barArray[10] = "§e❤❤❤❤❤§7❤❤❤❤❤"; 				barArray[11] = "§a❤❤❤❤❤❤§7❤❤❤❤";
		      barArray[12] = "§a❤❤❤❤❤❤§7❤❤❤❤"; 				barArray[13] = "§a❤❤❤❤❤❤❤§7❤❤❤";
		      barArray[14] = "§a❤❤❤❤❤❤❤§7❤❤❤"; 				barArray[15] = "§a❤❤❤❤❤❤❤❤§7❤❤";
		      barArray[16] = "§a❤❤❤❤❤❤❤❤§7❤❤"; 				barArray[17] = "§a❤❤❤❤❤❤❤❤❤§7❤";
		      barArray[18] = "§a❤❤❤❤❤❤❤❤❤§7❤";					barArray[19] = "§a❤❤❤❤❤❤❤❤❤❤";
		      barArray[20] = "§a❤❤❤❤❤❤❤❤❤❤";
		}
		else if (mobBarStyle == 4) 
		{
		      barArray[0] = "§a▌§8▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌"; 		barArray[1] = "§a▌§8▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌";
		      barArray[2] = "§a▌▌§8▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌"; 		barArray[3] = "§a▌▌▌§8▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌";
		      barArray[4] = "§a▌▌▌▌§8▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌"; 		barArray[5] = "§a▌▌▌▌▌§8▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌";
		      barArray[6] = "§a▌▌▌▌▌▌§8▌▌▌▌▌▌▌▌▌▌▌▌▌▌"; 		barArray[7] = "§a▌▌▌▌▌▌▌§8▌▌▌▌▌▌▌▌▌▌▌▌▌";
		      barArray[8] = "§a▌▌▌▌▌▌▌▌§8▌▌▌▌▌▌▌▌▌▌▌▌"; 		barArray[9] = "§a▌▌▌▌▌▌▌▌▌§8▌▌▌▌▌▌▌▌▌▌▌";
		      barArray[10] = "§a▌▌▌▌▌▌▌▌▌▌§8▌▌▌▌▌▌▌▌▌▌"; 		barArray[11] = "§a▌▌▌▌▌▌▌▌▌▌▌§8▌▌▌▌▌▌▌▌▌";
		      barArray[12] = "§a▌▌▌▌▌▌▌▌▌▌▌▌§8▌▌▌▌▌▌▌▌"; 		barArray[13] = "§a▌▌▌▌▌▌▌▌▌▌▌▌▌§8▌▌▌▌▌▌▌";
		      barArray[14] = "§a▌▌▌▌▌▌▌▌▌▌▌▌▌▌§8▌▌▌▌▌▌"; 		barArray[15] = "§a▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌§8▌▌▌▌▌";
		      barArray[16] = "§a▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌§8▌▌▌▌"; 		barArray[17] = "§a▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌§8▌▌▌";
		      barArray[18] = "§a▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌§8▌▌"; 		barArray[19] = "§a▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌§8▌";
		      barArray[20] = "§a▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌";
		}
		else if (mobBarStyle == 5) 
		{
		      barArray[0] = "§c█§0█████████"; 			barArray[1] = "§c█§0█████████";
		      barArray[2] = "§c█§0█████████"; 			barArray[3] = "§c██§0████████";
		      barArray[4] = "§c██§0████████"; 			barArray[5] = "§e███§0███████";
		      barArray[6] = "§e███§0███████"; 			barArray[7] = "§e████§0██████";
		      barArray[8] = "§e████§0██████"; 			barArray[9] = "§e█████§0█████";
		      barArray[10] = "§e█████§0█████"; 			barArray[11] = "§a██████§0████";
		      barArray[12] = "§a██████§0████"; 			barArray[13] = "§a███████§0███";
		      barArray[14] = "§a███████§0███";			barArray[15] = "§a████████§0██";
		      barArray[16] = "§a████████§0██"; 			barArray[17] = "§a█████████§0█";
		      barArray[18] = "§a█████████§0█"; 			barArray[19] = "§a██████████";
		      barArray[20] = "§a██████████";
		}
		else
		{
		//default (1 or anything else)
		      barArray[0] = "§c▌                   "; 		barArray[1] = "§c▌                   ";
		      barArray[2] = "§c█                  "; 		barArray[3] = "§c█▌                 ";
		      barArray[4] = "§c██                "; 		barArray[5] = "§e██▌               ";
		      barArray[6] = "§e███              "; 			barArray[7] = "§e███▌             ";
		      barArray[8] = "§e████            "; 			barArray[9] = "§e████▌           ";
		      barArray[10] = "§e█████          "; 			barArray[11] = "§a█████▌         ";
		      barArray[12] = "§a██████        "; 			barArray[13] = "§a██████▌       ";
		      barArray[14] = "§a███████      "; 			barArray[15] = "§a███████▌     ";
		      barArray[16] = "§a████████    "; 				barArray[17] = "§a████████▌   ";
		      barArray[18] = "§a█████████  "; 				barArray[19] = "§a█████████▌ ";
		      barArray[20] = "§a██████████";
		}
		
		return barArray;
	}
	
	
	/*
	 * Load the bars from a custom file
	 */
	public static String[] getCustomBars(FileConfiguration config) {
		if (config.getBoolean("101-index-array", false)) {
            String[] barArray = new String[101];
            String format = config.getString("101-format");
            int color_2_percent = config.getInt("use-2-color-when-bigger-than-percent", 75);
            String color_2 = config.getString("2-color", "&2");
            int color_a_percent = config.getInt("use-a-color-when-bigger-than-percent", 55);
            String color_a = config.getString("a-color", "&a");
            int color_e_percent = config.getInt("use-e-color-when-bigger-than-percent", 25);
            String color_e = config.getString("e-color", "&e");
            int color_c_percent = config.getInt("use-c-color-when-bigger-than-percent", 0);
            String color_c = config.getString("c-color", "&c");
            String color_f = config.getString("use-f-color-when-bigger-than-0-percent", "&f");
            for (int i = 0; i < barArray.length; i++) {
                String singleString = format;
                String percent = "";
                if (i > color_2_percent) {
                    percent = color_2 + i;
                } else if (i > color_a_percent) {
                    percent = color_a + i;
                } else if (i > color_e_percent) {
                    percent = color_e + i;
                } else if (i > color_c_percent) {
                    percent = color_c + i;
                } else {
                    percent = color_f + i;
                }
                singleString = singleString.replace("{percent}", percent);
                singleString = Utils.replaceSymbols(singleString);
                barArray[i] = singleString;
            }
            return barArray;
        } else {

            String[] barArray = new String[21];

            barArray[0] = "";

            for (int i=1; i<21; i++) {

                barArray[i] = "";

                try {

                    String cname = config.getString(i*5 + "-percent-bar");

                    if (cname == null) cname = "";

                    barArray[i] = Utils.replaceSymbols(cname);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            return barArray;
        }
	}
}
