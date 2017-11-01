
/**
 * Program based on bringing out how much exp and money you can get based on your level for all jobs
 * 
 * @author Lily Phu 
 * @version October 26th, 2017
 */
import java.util.Scanner;
import java.math.*;

public class CastiaProgramTester
{
    public static void main(String [] args)
    {
        //Variables
        int Level, Target, Eff;
        double EXP, TotalMoney, Time;
        
        boolean Keeprunning = true;
        boolean IsJob = false;
        String Job = "";
        char Continue = 'a';
        Scanner scan = new Scanner(System.in);
        
        //User Input
        System.out.println("Type 'Q' to quit");
        while(Keeprunning)
        {
            System.out.println("For the options, type \"Help\"");
            System.out.print("Please enter a command or job name: ");
            Job = scan.next();
            while(Job.equalsIgnoreCase("Lumberjack"))
            {
                IsJob = true;
                System.out.print("Do you want to pick Lumberjack? (Y/N) ");
                Continue = scan.next().charAt(0);
                if((Continue == 'y') || (Continue == 'Y'))
                {
                    System.out.print("Please enter your level: ");
                    Level = scan.nextInt();
                    System.out.print("Please enter the target level you wish to have: ");
                    Target = scan.nextInt();
                    System.out.print("Please enter the amount of exp you have right now: ");
                    EXP = scan.nextDouble();
                    System.out.print("Enter the efficiency of your axe: ");
                    Eff = scan.nextInt();
                    
                    CastiaProgram Lumberjack = new CastiaProgram(Level, Target, EXP, Eff);
                    Lumberjack.calcLumberjackExp();
                    Lumberjack.calcLumberjackLevelup();
                    int Wood = Lumberjack.getWood();
                    TotalMoney = Lumberjack.getMoney();
                    Lumberjack.calcLumberjackTime();
                    Time = Lumberjack.getTime();
                    
                    System.out.println();
                    System.out.println("To get to level " + Target + ", you need to break " + Wood + " wood.");
                    if (TotalMoney > 1000000)
                    {
                        TotalMoney = TotalMoney/1000000;
                        System.out.println("You will gain approximately $" + TotalMoney + "M from this");
                    }
                    else if(TotalMoney > 1000)
                    {
                        TotalMoney = TotalMoney/1000;
                        System.out.println("You will gain approximately $" + TotalMoney + "K from this");
                    }
                    else
                    {
                        System.out.println("You will gain approximately $" + TotalMoney + " from this");
                    }
                    System.out.println("According to your axe, this will take approximately " + Time + " seconds of continuous woodcutting");
                    System.out.println("This does not account for the MMO skill");
                    System.out.println();
                }
                else if((Continue == 'n') || (Continue == 'N'))
                {
                    Job = "Temp";
                }
                else
                {
                    System.out.println("That's not a valid answer");
                    System.out.println();
                }
            }
            while(Job.equalsIgnoreCase("Miner"))
            {
                IsJob = true;
                System.out.print("Do you want to pick Miner? (Y/N) ");
                Continue = scan.next().charAt(0);
                if((Continue == 'y') || (Continue == 'Y'))
                {
                    System.out.print("Please enter your level: ");
                    Level = scan.nextInt();
                    System.out.print("Please enter the target level you wish to have: ");
                    Target = scan.nextInt();
                    System.out.print("Please enter the amount of exp you have right now: ");
                    EXP = scan.nextDouble();
                    System.out.print("Enter the efficiency of your pickaxe: ");
                    Eff = scan.nextInt();
                    
                    CastiaProgram Miner = new CastiaProgram(Level, Target, EXP, Eff);
                    Miner.calcMinerExp();
                    Miner.calcMinerLevelup();
                    int Stone = Miner.getStone();
                    TotalMoney = Miner.getMoney();
                    Miner.calcMinerTime();
                    Time = Miner.getTime();
                    
                    System.out.println();
                    System.out.println("To get to level " + Target + ", you need to break " + Stone + " stone.");
                    if (TotalMoney > 1000000)
                    {
                        TotalMoney = TotalMoney/1000000;
                        System.out.println("You will gain approximately $" + TotalMoney + "M from this");
                    }
                    else if(TotalMoney > 1000)
                    {
                        TotalMoney = TotalMoney/1000;
                        System.out.println("You will gain approximately $" + TotalMoney + "K from this");
                    }
                    else
                    {
                        System.out.println("You will gain approximately $" + TotalMoney + " from this");
                    }
                    System.out.println("According to your pickaxe, this will take approximately " + Time + " seconds of continuous mining");
                    System.out.println("This does not account for mining ores but only stone");
                    System.out.println();
                }
                else if((Continue == 'n') || (Continue == 'N'))
                {
                    Job = "Temp";
                }
                else
                {
                    System.out.println("That's not a valid answer");
                    System.out.println();
                }
            }
            while(Job.equalsIgnoreCase("Builder"))
            {
                IsJob = true;
                System.out.print("Do you want to pick Builder? (Y/N) ");
                Continue = scan.next().charAt(0);
                if((Continue == 'y') || (Continue == 'Y'))
                {
                    System.out.println("Do you want to reach a target level or see how far you can make it with your materials you have?");
                    System.out.print("Type 1 for target and 2 for materials: ");
                    int Choice = scan.nextInt();
                    if(Choice == 1)
                    {
                        System.out.print("Please enter your level: ");
                        Level = scan.nextInt();
                        System.out.print("Please enter the target level you wish to have: ");
                        Target = scan.nextInt();
                        System.out.print("Please enter the amount of exp you have right now: ");
                        EXP = scan.nextDouble();
                        System.out.println("Please enter which material you are focusing on");
                        System.out.print("Stone, Wood, or Glass: ");
                        String Block = scan.next();
                        
                        CastiaProgram Builder = new CastiaProgram(Level, Target, EXP, Block);
                        Builder.calcBuilderExp();
                        Builder.calcBuilderLevelup();
                        int Build = Builder.getBuild();
                        TotalMoney = Builder.getMoney();
                        
                        System.out.println();
                        if(Block.equalsIgnoreCase("Stone"))
                        {
                            System.out.println("To get to level " + Target + ", you need to build " + Build + " stone.");
                        }
                        if(Block.equalsIgnoreCase("Wood"))
                        {
                            System.out.println("To get to level " + Target + ", you need to build " + Build + " wooden planks.");
                        }
                        if(Block.equalsIgnoreCase("Glass"))
                        {
                            System.out.println("To get to level " + Target + ", you need to build " + Build + " glass.");
                        }
                        if (TotalMoney > 1000000)
                        {
                            TotalMoney = TotalMoney/1000000;
                            System.out.println("You will gain approximately $" + TotalMoney + "M from this");
                        }
                        else if(TotalMoney > 1000)
                        {
                            TotalMoney = TotalMoney/1000;
                            System.out.println("You will gain approximately $" + TotalMoney + "K from this");
                        }
                        else
                        {
                            System.out.println("You will gain approximately $" + TotalMoney + " from this");
                        }
                        System.out.println();
                    }
                    else if(Choice == 2)
                    {
                        int stone = 0;
                        int wood = 0;
                        int glass = 0;
                        boolean list = true;
                        System.out.print("Please enter your level: ");
                        Level = scan.nextInt();
                        System.out.print("Please enter the amount of exp you have right now: ");
                        EXP = scan.nextDouble();
                        
                        System.out.println("Q to stop adding to the list");
                        System.out.println("Options: Stone, Wood, Glass");
                        System.out.println("Do not include spaces");
                        System.out.println("Type \"help\" to view this list again");
                        System.out.println("Type \"list\" to view how much you have right now");
                        System.out.println("The list is additive");
                        while(list)
                        {
                            System.out.println("What would you like to add?");
                            String Ore = scan.next();
                            if (Ore.equalsIgnoreCase("Help"))
                            {
                                System.out.println("Options: Stone, Wood, Glass");
                            }
                            else if (Ore.equalsIgnoreCase("Stone"))
                            {
                                System.out.println("How many do you want to add? ");
                                stone += scan.nextInt();
                            }
                            else if (Ore.equalsIgnoreCase("Wood"))
                            {
                                System.out.println("How many do you want to add? ");
                                wood += scan.nextInt();
                            }
                            else if (Ore.equalsIgnoreCase("Glass"))
                            {
                                System.out.println("How many do you want to add? ");
                                glass += scan.nextInt();
                            }
                            else if (Ore.equalsIgnoreCase("Q"))
                            {
                                list = false;
                            }
                            else if (Ore.equalsIgnoreCase("List"))
                            {
                                System.out.println("You have " + stone + " stone");
                                System.out.println("You have " + wood + " wooden planks");
                                System.out.println("You have " + glass + " glass blocks");
                            }
                            else
                            {
                                System.out.println("That is not a valid option");
                            }
                            System.out.println();
                        }
                        CastiaProgram Stone = new CastiaProgram(Level, EXP, stone, "Stone");
                        
                        Stone.calcBuilderExp();
                        Stone.calcBuilder2Levelup();
                        Level = Stone.getLevel();
                        EXP = Stone.getEXP();
                        
                        CastiaProgram Wood = new CastiaProgram(Level, EXP, wood, "Wood");
                        
                        Wood.calcBuilderExp();
                        Wood.calcBuilder2Levelup();
                        Level = Wood.getLevel();
                        EXP = Wood.getEXP();
                        
                        CastiaProgram Glass = new CastiaProgram(Level, EXP, glass, "Glass");
                        
                        Glass.calcBuilderExp();
                        Glass.calcBuilder2Levelup();
                        Level = Glass.getLevel();
                        EXP = Glass.getEXP();
                        
                        System.out.println();
                        System.out.println("Job Stats:");
                        System.out.println("Level: " + Level);
                        System.out.println("EXP: " + EXP + " / " + (100 * Math.pow(1.15, Level - 1)));
                    }
                    else
                    {
                        System.out.println("That's not an appropriate choice");
                    }
                }
                else if((Continue == 'n') || (Continue == 'N'))
                {
                    Job = "Temp";
                }
                else
                {
                    System.out.println("That's not a valid answer");
                }
                System.out.println();
            }
            while(Job.equalsIgnoreCase("Digger"))
            {
                IsJob = true;
                System.out.print("Do you want to pick Digger? (Y/N) ");
                Continue = scan.next().charAt(0);
                if((Continue == 'y') || (Continue == 'Y'))
                {
                    System.out.print("Please enter your level: ");
                    Level = scan.nextInt();
                    System.out.print("Please enter the target level you wish to have: ");
                    Target = scan.nextInt();
                    System.out.print("Please enter the amount of exp you have right now: ");
                    EXP = scan.nextDouble();
                    System.out.print("Enter the efficiency of your shovel: ");
                    Eff = scan.nextInt();
                    
                    CastiaProgram Digger = new CastiaProgram(Level, Target, EXP, Eff);
                    Digger.calcDiggerExp();
                    Digger.calcDiggerLevelup();
                    int Blocks = Digger.getBlocks();
                    TotalMoney = Digger.getMoney();
                    Digger.calcDiggerTime();
                    Time = Digger.getTime();
                    
                    System.out.println();
                    System.out.println("To get to level " + Target + ", you need to break " + Blocks + " blocks.");
                    if (TotalMoney > 1000000)
                    {
                        TotalMoney = TotalMoney/1000000;
                        System.out.println("You will gain approximately $" + TotalMoney + "M from this");
                    }
                    else if(TotalMoney > 1000)
                    {
                        TotalMoney = TotalMoney/1000;
                        System.out.println("You will gain approximately $" + TotalMoney + "K from this");
                    }
                    else
                    {
                        System.out.println("You will gain approximately $" + TotalMoney + " from this");
                    }
                    System.out.println("According to your axe, this will take approximately " + Time + " seconds of continuous digging");
                    System.out.println("This is assuming you break blocks at hardness 0.5");
                    System.out.println("Examples include Dirt and Sand");
                    System.out.println();
                }
                else if((Continue == 'n') || (Continue == 'N'))
                {
                    Job = "Temp";
                }
                else
                {
                    System.out.println("That's not a valid answer");
                    System.out.println();
                }
            }
            while(Job.equalsIgnoreCase("Farmer"))
            {
                IsJob = true;
                System.out.print("Do you want to pick Farmer? (Y/N) ");
                Continue = scan.next().charAt(0);
                if((Continue == 'y') || (Continue == 'Y'))
                {
                    System.out.print("Please enter your level: ");
                    Level = scan.nextInt();
                    System.out.print("Please enter the target level you wish to have: ");
                    Target = scan.nextInt();
                    System.out.print("Please enter the amount of exp you have right now: ");
                    EXP = scan.nextDouble();
                    System.out.println("Please enter which crop you are focusing on");
                    System.out.print("Wheat, Potato, Carrot, or Cane: ");
                    String Crop = scan.next();
                    
                    CastiaProgram Farmer = new CastiaProgram(Level, Target, EXP, Crop);
                    Farmer.calcFarmerExp();
                    Farmer.calcFarmerLevelup();
                    int Crops = Farmer.getCrops();
                    TotalMoney = Farmer.getMoney();
                    Farmer.calcFarmerTime();
                    Time = Farmer.getTime();
                    
                    System.out.println();
                    System.out.println("To get to level " + Target + ", you need to harvest " + Crops + " crops.");
                    if (TotalMoney > 1000000)
                    {
                        TotalMoney = TotalMoney/1000000;
                        System.out.println("You will gain approximately $" + TotalMoney + "M from this");
                    }
                    else if(TotalMoney > 1000)
                    {
                        TotalMoney = TotalMoney/1000;
                        System.out.println("You will gain approximately $" + TotalMoney + "K from this");
                    }
                    else
                    {
                        System.out.println("You will gain approximately $" + TotalMoney + " from this");
                    }
                    System.out.println("This will take approximately " + Time + " seconds of continuous farming");
                    System.out.println("This assumes you harvest 10 per second");
                    System.out.println();
                }
                else if((Continue == 'n') || (Continue == 'N'))
                {
                    Job = "Temp";
                }
                else
                {
                    System.out.println("That's not a valid answer");
                    System.out.println();
                }
            }
            while(Job.equalsIgnoreCase("Hunter"))
            {
                IsJob = true;
                System.out.print("Do you want to pick Hunter? (Y/N) ");
                Continue = scan.next().charAt(0);
                if((Continue == 'y') || (Continue == 'Y'))
                {
                    System.out.print("Please enter your level: ");
                    Level = scan.nextInt();
                    System.out.print("Please enter the target level you wish to have: ");
                    Target = scan.nextInt();
                    System.out.print("Please enter the amount of exp you have right now: ");
                    EXP = scan.nextDouble();
                    System.out.println("Please enter which mob you are focusing on");
                    System.out.print("Boss, Regular, Pigmen: ");
                    String Choice = scan.next();
                    
                    CastiaProgram Hunter = new CastiaProgram(Level, Target, EXP, Choice);
                    Hunter.calcHunterExp();
                    Hunter.calcHunterLevelup();
                    int Kills = Hunter.getKills();
                    TotalMoney = Hunter.getMoney();
                    
                    System.out.println();
                    System.out.println("To get to level " + Target + ", you need to kill " + Kills + " mobs.");
                    if (TotalMoney > 1000000)
                    {
                        TotalMoney = TotalMoney/1000000;
                        System.out.println("You will gain approximately $" + TotalMoney + "M from this");
                    }
                    else if(TotalMoney > 1000)
                    {
                        TotalMoney = TotalMoney/1000;
                        System.out.println("You will gain approximately $" + TotalMoney + "K from this");
                    }
                    else
                    {
                        System.out.println("You will gain approximately $" + TotalMoney + " from this");
                    }
                    if (Choice.equalsIgnoreCase("Boss"))
                    {
                        System.out.println("You need " + (Kills * 4) + " end crystals to spawn that many ender dragons");
                        System.out.println("You need " + (Kills * 3) + " wither skeleton heads to spawn that many withers");
                    }
                    System.out.println("Time is independent since we cannot calculate how much you kill per second due to spawn rates");
                    System.out.println();
                }
                else if((Continue == 'n') || (Continue == 'N'))
                {
                    Job = "Temp";
                }
                else
                {
                    System.out.println("That's not a valid answer");
                    System.out.println();
                }
            }
            while(Job.equalsIgnoreCase("Blacksmith"))
            {
                IsJob = true;
                System.out.print("Do you want to pick Blacksmith? (Y/N) ");
                Continue = scan.next().charAt(0);
                if((Continue == 'y') || (Continue == 'Y'))
                {
                    System.out.println("Do you want to reach a target level or see how far you can make it with your materials you have?");
                    System.out.print("Type 1 for target and 2 for materials: ");
                    int Choice = scan.nextInt();
                    if(Choice == 1)
                    {
                        System.out.print("Please enter your level: ");
                        Level = scan.nextInt();
                        System.out.print("Please enter the target level you wish to have: ");
                        Target = scan.nextInt();
                        System.out.print("Please enter the amount of exp you have right now: ");
                        EXP = scan.nextDouble();
                        System.out.println("Please enter which material you are focusing on");
                        System.out.print("Diamond, Iron, or Gold: ");
                        String Ore = scan.next();
                        
                        CastiaProgram Blacksmith = new CastiaProgram(Level, Target, EXP, Ore);
                        Blacksmith.calcBlacksmithExp();
                        Blacksmith.calcBlacksmithLevelup();
                        int Made = Blacksmith.getMade();
                        TotalMoney = Blacksmith.getMoney();
                        
                        System.out.println();
                        if(Ore.equalsIgnoreCase("Diamond"))
                        {
                            System.out.println("To get to level " + Target + ", you need to make " + Made + " diamond chestplates.");
                        }
                        if(Ore.equalsIgnoreCase("Iron"))
                        {
                            System.out.println("To get to level " + Target + ", you need to make " + Made + " iron chestplates.");
                        }
                        if(Ore.equalsIgnoreCase("Gold"))
                        {
                            System.out.println("To get to level " + Target + ", you need to smelt " + Made + " gold ore.");
                        }
                        if (TotalMoney > 1000000)
                        {
                            TotalMoney = TotalMoney/1000000;
                            System.out.println("You will gain approximately $" + TotalMoney + "M from this");
                        }
                        else if(TotalMoney > 1000)
                        {
                            TotalMoney = TotalMoney/1000;
                            System.out.println("You will gain approximately $" + TotalMoney + "K from this");
                        }
                        else
                        {
                            System.out.println("You will gain approximately $" + TotalMoney + " from this");
                        }
                        System.out.println();
                    }
                    else if(Choice == 2)
                    {
                        int diamonds = 0;
                        int ironore = 0;
                        int iron = 0;
                        int goldore = 0;
                        boolean list = true;
                        System.out.print("Please enter your level: ");
                        Level = scan.nextInt();
                        System.out.print("Please enter the amount of exp you have right now: ");
                        EXP = scan.nextDouble();
                        System.out.print("Do you have max salvage level? (Y/N): ");
                        char Salvage = scan.next().charAt(0);
                        
                        System.out.println();
                        System.out.println("Q to stop adding to the list");
                        System.out.println("Options: DiamondsBlocks, Diamonds, IronBlocks, Iron, IronOre, GoldOre");
                        System.out.println("Do not include spaces");
                        System.out.println("Type \"help\" to view this list again");
                        System.out.println("Type \"list\" to view how much you have right now");
                        System.out.println("The list is additive");
                        while(list)
                        {
                            System.out.println("What would you like to add?");
                            String Ore = scan.next();
                            if (Ore.equalsIgnoreCase("Help"))
                            {
                                System.out.println("Options: DiamondsBlocks, Diamonds, IronBlocks, Iron, IronOre, GoldOre");
                            }
                            else if (Ore.equalsIgnoreCase("Diamonds"))
                            {
                                System.out.println("How many do you want to add? ");
                                diamonds += scan.nextInt();
                            }
                            else if (Ore.equalsIgnoreCase("DiamondBlocks"))
                            {
                                System.out.println("How many do you want to add? ");
                                diamonds += 9 * scan.nextInt();
                            }
                            else if (Ore.equalsIgnoreCase("Iron"))
                            {
                                System.out.println("How many do you want to add? ");
                                iron += scan.nextInt();
                            }
                            else if (Ore.equalsIgnoreCase("IronBlocks"))
                            {
                                System.out.println("How many do you want to add? ");
                                iron += 9 * scan.nextInt();
                            }
                            else if (Ore.equalsIgnoreCase("IronOre"))
                            {
                                System.out.println("How many do you want to add? ");
                                ironore += scan.nextInt();
                            }
                            else if (Ore.equalsIgnoreCase("GoldOre") || Ore.equalsIgnoreCase("Gold"))
                            {
                                System.out.println("How many do you want to add? ");
                                goldore += scan.nextInt();
                            }
                            else if (Ore.equalsIgnoreCase("Q"))
                            {
                                list = false;
                            }
                            else if (Ore.equalsIgnoreCase("List"))
                            {
                                System.out.println("You have " + diamonds + " diamonds");
                                System.out.println("You have " + iron + " iron ingots");
                                System.out.println("You have " + ironore + " iron ore");
                                System.out.println("You have " + goldore + " gold ore");
                            }
                            else
                            {
                                System.out.println("That is not a valid option");
                            }
                            System.out.println();
                        }
                        CastiaProgram Diamonds = new CastiaProgram(Level, EXP, diamonds, Salvage, "Diamond");
                        
                        Diamonds.calcBlacksmithExp();
                        Diamonds.calcChestplates();
                        int Chestplates = Diamonds.getChestplates();
                        System.out.println();
                        System.out.println("You made " + Chestplates + " diamond chestplates");
                        Diamonds.calcBlacksmith2Levelup();
                        Level = Diamonds.getLevel();
                        EXP = Diamonds.getEXP();
                        
                        CastiaProgram Ironore = new CastiaProgram(Level, EXP, ironore, Salvage, "Iron Ore");
                        
                        iron += ironore;
                        Ironore.calcBlacksmithExp();
                        Ironore.calcBlacksmith3Levelup();
                        Level = Ironore.getLevel();
                        EXP = Ironore.getEXP();
                        
                        CastiaProgram Goldore = new CastiaProgram(Level, EXP, goldore, Salvage, "Gold");
                        
                        Goldore.calcBlacksmithExp();    
                        Goldore.calcBlacksmith3Levelup();
                        Level = Goldore.getLevel();
                        EXP = Goldore.getEXP();
                        
                        CastiaProgram Iron = new CastiaProgram(Level, EXP, iron, Salvage, "Iron");
                        
                        Iron.calcBlacksmithExp();
                        Iron.calcChestplates();
                        Chestplates = Iron.getChestplates();
                        System.out.println("You made " + Chestplates + " iron chestplates");
                        Iron.calcBlacksmith2Levelup();
                        Level = Iron.getLevel();
                        EXP = Iron.getEXP();
                        
                        System.out.println();
                        System.out.println("Job Stats:");
                        System.out.println("Level: " + Level);
                        System.out.println("EXP: " + EXP + " / " + (100 * Math.pow(1.15, Level - 1)));
                        System.out.println("This is assuming you get 1 iron ingot per ore");
                    }
                    else
                    {
                        System.out.println("That's not an appropriate choice");
                    }
                }
                else if((Continue == 'n') || (Continue == 'N'))
                {
                    Job = "Temp";
                }
                else
                {
                    System.out.println("That's not a valid answer");
                }
                System.out.println();
            }
            while(Job.equalsIgnoreCase("Cook"))
            {
                IsJob = true;
                System.out.print("Do you want to pick Cook? (Y/N) ");
                Continue = scan.next().charAt(0);
                if((Continue == 'y') || (Continue == 'Y'))
                {
                    System.out.println("Do you want to reach a target level or see how far you can make it with your materials you have?");
                    System.out.print("Type 1 for target and 2 for materials: ");
                    int Choice = scan.nextInt();
                    if(Choice == 1)
                    {
                        System.out.print("Please enter your level: ");
                        Level = scan.nextInt();
                        System.out.print("Please enter the target level you wish to have: ");
                        Target = scan.nextInt();
                        System.out.print("Please enter the amount of exp you have right now: ");
                        EXP = scan.nextDouble();
                        System.out.println("Please enter which food you are focusing on");
                        System.out.println("Potatoes give the same as steak and pork");
                        System.out.print("Bread, GoldenApples, or Potatoes: ");
                        String Foodchoice = scan.next();
                        
                        CastiaProgram Cook = new CastiaProgram(Level, Target, EXP, Foodchoice);
                        Cook.calcCookExp();
                        Cook.calcCookLevelup();
                        int Food = Cook.getFood();
                        TotalMoney = Cook.getMoney();
                        
                        System.out.println();
                        if(Foodchoice.equalsIgnoreCase("Bread"))
                        {
                            System.out.println("To get to level " + Target + ", you need to make " + Food + " Bread.");
                            System.out.println("You will need " + Food * 3 + " Wheat.");
                            System.out.println("This means you will need " + (Food * 3)/9.0 + " Haybales.");
                        }
                        if(Foodchoice.equalsIgnoreCase("GoldenApples"))
                        {
                            System.out.println("To get to level " + Target + ", you need to make " + Food + " Golden Apples.");
                            System.out.println("You will need " + Food * 9 + " golden ingots and " + Food + " Apples.");
                        }
                        if(Foodchoice.equalsIgnoreCase("Potatoes"))
                        {
                            System.out.println("To get to level " + Target + ", you need to cook " + Food + " Potatoes.");
                        }
                        if (TotalMoney > 1000000)
                        {
                            TotalMoney = TotalMoney/1000000;
                            System.out.println("You will gain approximately $" + TotalMoney + "M from this");
                        }
                        else if(TotalMoney > 1000)
                        {
                            TotalMoney = TotalMoney/1000;
                            System.out.println("You will gain approximately $" + TotalMoney + "K from this");
                        }
                        else
                        {
                            System.out.println("You will gain approximately $" + TotalMoney + " from this");
                        }
                        System.out.println();
                    }
                    else if(Choice == 2)
                    {
                        int wheat = 0;
                        int gingots = 0;
                        int apples = 0;
                        int potatoes = 0;
                        int gapples = 0;
                        int bread = 0;
                        
                        int calctemp = 0;
                        double calctemp2 = 0;
                        
                        boolean list = true;
                        System.out.print("Please enter your level: ");
                        Level = scan.nextInt();
                        System.out.print("Please enter the amount of exp you have right now: ");
                        EXP = scan.nextDouble();
                        
                        System.out.println();
                        System.out.println("Q to stop adding to the list");
                        System.out.println("Options: Wheat, GoldenIngots, Apples, Potatoes");
                        System.out.println("Do not include spaces");
                        System.out.println("Type \"help\" to view this list again");
                        System.out.println("Type \"list\" to view how much you have right now");
                        System.out.println("The list is additive");
                        while(list)
                        {
                            System.out.println("What would you like to add?");
                            String Foodaddition = scan.next();
                            if (Foodaddition.equalsIgnoreCase("Help"))
                            {
                                System.out.println("Options: Wheat, GoldenIngots, Apples, Potatoes");
                            }
                            else if (Foodaddition.equalsIgnoreCase("Wheat"))
                            {
                                System.out.println("How many do you want to add? ");
                                wheat += scan.nextInt();
                            }
                            else if (Foodaddition.equalsIgnoreCase("GoldenIngots"))
                            {
                                System.out.println("How many do you want to add? ");
                                gingots += scan.nextInt();
                            }
                            else if (Foodaddition.equalsIgnoreCase("Apples"))
                            {
                                System.out.println("How many do you want to add? ");
                                apples += scan.nextInt();
                            }
                            else if (Foodaddition.equalsIgnoreCase("Potatoes"))
                            {
                                System.out.println("How many do you want to add? ");
                                potatoes += scan.nextInt();
                            }
                            else if (Foodaddition.equalsIgnoreCase("Q"))
                            {
                                list = false;
                            }
                            else if (Foodaddition.equalsIgnoreCase("List"))
                            {
                                System.out.println("You have " + wheat + " wheat");
                                System.out.println("You have " + gingots + " golden ingots");
                                System.out.println("You have " + apples + " apples");
                                System.out.println("You have " + potatoes + " potatoes");
                            }
                            else
                            {
                                System.out.println("That is not a valid option");
                            }
                            
                            calctemp = apples;
                            calctemp2 = gingots/9.0;
                            if(calctemp2 >= calctemp)
                            {
                                gapples = calctemp;
                            }
                            else
                            {
                                while(calctemp > calctemp2)
                                {
                                    calctemp--;
                                }
                                gapples = calctemp;
                            }
                            
                            bread = (int)(wheat/3.0);
                            System.out.println();
                        }
                        CastiaProgram Bread = new CastiaProgram(Level, EXP, bread, "Bread");
                        
                        Bread.calcCookExp();
                        Bread.calcCook2Levelup();
                        Level = Bread.getLevel();
                        EXP = Bread.getEXP();
                        
                        System.out.println("You made " + bread + " Bread");
                        
                        CastiaProgram GA = new CastiaProgram(Level, EXP, gapples, "GoldenApples");
                        
                        GA.calcCookExp();
                        GA.calcCook2Levelup();
                        Level = GA.getLevel();
                        EXP = GA.getEXP();
                        System.out.println("You made " + gapples + " Golden Apples");
                        System.out.println("This leaves you with " + (apples - gapples) + " apples and " + (int)(((gingots/9.0) - gapples) * 9) + " golden ingots");
                        
                        CastiaProgram Potato = new CastiaProgram(Level, EXP, potatoes, "Potatoes");
                        
                        Potato.calcCookExp();
                        Potato.calcCook2Levelup();
                        Level = Potato.getLevel();
                        EXP = Potato.getEXP();
                        System.out.println("You cooked " + potatoes + " Potatoes");
                        
                        System.out.println();
                        System.out.println("Job Stats:");
                        System.out.println("Level: " + Level);
                        System.out.println("EXP: " + EXP + " / " + (100 * Math.pow(1.15, Level - 1)));
                    }
                    else
                    {
                        System.out.println("That's not an appropriate choice");
                    }
                }
                else if((Continue == 'n') || (Continue == 'N'))
                {
                    Job = "Temp";
                }
                else
                {
                    System.out.println("That's not a valid answer");
                }
                System.out.println();
            }
            while(Job.equalsIgnoreCase("Alchemist"))
            {
                IsJob = true;
                System.out.print("Do you want to pick Alchemist? (Y/N) ");
                Continue = scan.next().charAt(0);
                if((Continue == 'y') || (Continue == 'Y'))
                {
                    System.out.println("Do you want to reach a target level or see how far you can make it with your materials you have?");
                    System.out.print("Type 1 for target and 2 for materials: ");
                    int Choice = scan.nextInt();
                    if(Choice == 1)
                    {
                        System.out.print("Please enter your level: ");
                        Level = scan.nextInt();
                        System.out.print("Please enter the target level you wish to have: ");
                        Target = scan.nextInt();
                        System.out.print("Please enter the amount of exp you have right now: ");
                        EXP = scan.nextDouble();
                        System.out.println("Please enter which potions you are focusing on");
                        System.out.print("Netherwart, Tier1, or Tier2: ");
                        String Potionchoice = scan.next();
                        
                        CastiaProgram Alchemist = new CastiaProgram(Level, Target, EXP, Potionchoice);
                        Alchemist.calcAlchemistExp();
                        Alchemist.calcAlchemistLevelup();
                        int Potions = Alchemist.getPotions();
                        TotalMoney = Alchemist.getMoney();
                        
                        System.out.println();
                        if(Potionchoice.equalsIgnoreCase("Netherwart"))
                        {
                            System.out.println("To get to level " + Target + ", you need to make " + Potions + " netherwart potions.");
                        }
                        if(Potionchoice.equalsIgnoreCase("Tier1"))
                        {
                            System.out.println("To get to level " + Target + ", you need to make " + Potions + " tier1 potions.");
                        }
                        if(Potionchoice.equalsIgnoreCase("Tier2"))
                        {
                            System.out.println("To get to level " + Target + ", you need to make " + Potions + " tier2 potions.");
                        }
                        if (TotalMoney > 1000000)
                        {
                            TotalMoney = TotalMoney/1000000;
                            System.out.println("You will gain approximately $" + TotalMoney + "M from this");
                        }
                        else if(TotalMoney > 1000)
                        {
                            TotalMoney = TotalMoney/1000;
                            System.out.println("You will gain approximately $" + TotalMoney + "K from this");
                        }
                        else
                        {
                            System.out.println("You will gain approximately $" + TotalMoney + " from this");
                        }
                        System.out.println("This is assuming:");
                        System.out.println("Netherwart potions only contain netherwart");
                        System.out.println("Tier1 potions contain netherwart and a tier1 ingredient");
                        System.out.println("Tier2 potions contain netherwart, tier1 ingredient, and a tier2 ingredient");
                        System.out.println();
                    }
                    else if(Choice == 2)
                    {
                        int netherwart = 0;
                        int tier1 = 0;
                        int tier2 = 0;
                        int netherwartpot = 0;
                        int tier1pot = 0;
                        int tier2pot = 0;
                        int bottles = 0;
                        
                        int calctemp = 0;
                        int calctemp2 = 0;
                        int calctemp3 = 0;
                        int calctemp4 = 0;
                        
                        boolean list = true;
                        System.out.print("Please enter your level: ");
                        Level = scan.nextInt();
                        System.out.print("Please enter the amount of exp you have right now: ");
                        EXP = scan.nextDouble();
                        
                        System.out.println();
                        System.out.println("Q to stop adding to the list");
                        System.out.println("Options: Netherwart, Tier1, Tier2, Bottles");
                        System.out.println("Do not include spaces");
                        System.out.println("Type \"help\" to view this list again");
                        System.out.println("Type \"list\" to view how much you have right now");
                        System.out.println("The list is additive");
                        while(list)
                        {
                            System.out.println("What would you like to add?");
                            String Potionaddition = scan.next();
                            if (Potionaddition.equalsIgnoreCase("Help"))
                            {
                                System.out.println("Options: Netherwart, Tier1, Tier2, Bottles");
                            }
                            else if (Potionaddition.equalsIgnoreCase("Netherwart"))
                            {
                                System.out.println("How many do you want to add? ");
                                netherwart += scan.nextInt();
                            }
                            else if (Potionaddition.equalsIgnoreCase("Tier1"))
                            {
                                System.out.println("How many do you want to add? ");
                                tier1 += scan.nextInt();
                            }
                            else if (Potionaddition.equalsIgnoreCase("Tier2"))
                            {
                                System.out.println("How many do you want to add? ");
                                tier2 += scan.nextInt();
                            }
                            else if (Potionaddition.equalsIgnoreCase("Bottles"))
                            {
                                System.out.println("How many do you want to add? ");
                                bottles += scan.nextInt();
                            }
                            else if (Potionaddition.equalsIgnoreCase("Q"))
                            {
                                list = false;
                            }
                            else if (Potionaddition.equalsIgnoreCase("List"))
                            {
                                System.out.println("You have " + netherwart + " netherwart");
                                System.out.println("You have " + tier1 + " tier1 ingredients");
                                System.out.println("You have " + tier2 + " tier2 ingredients");
                                System.out.println("You have " + bottles + " bottles");
                            }
                            else
                            {
                                System.out.println("That is not a valid option");
                            }
                            
                            tier2pot = 0;
                            tier1pot = 0;
                            netherwartpot = 0;
                            
                            calctemp = netherwart;
                            calctemp2 = tier1;
                            calctemp3 = tier2;
                            calctemp4 = bottles;
                            while((calctemp3 > 0) && (calctemp2 > 0) && (calctemp > 0) && (calctemp4 > 0))
                            {
                                calctemp3--;
                                calctemp2--;
                                calctemp--;
                                calctemp4--;
                                tier2pot++;
                            }
                            while((calctemp2 > 0) && (calctemp > 0) && (calctemp4 > 0))
                            {
                                calctemp2--;
                                calctemp--;
                                calctemp4--;
                                tier1pot++;
                            }
                            while((calctemp > 0) && (calctemp4 > 0))
                            {
                                calctemp--;
                                calctemp4--;
                                netherwartpot++;
                            }
                            System.out.println();
                        }
                        CastiaProgram Netherwart = new CastiaProgram(Level, EXP, netherwartpot, "Netherwart");
                        
                        Netherwart.calcAlchemistExp();
                        Netherwart.calcAlchemist2Levelup();
                        Level = Netherwart.getLevel();
                        EXP = Netherwart.getEXP();
                        System.out.println("You have made " + netherwartpot + " netherwart potions");
                        
                        CastiaProgram Tier1potion = new CastiaProgram(Level, EXP, tier1pot, "Tier1");
                        
                        Tier1potion.calcAlchemistExp();
                        Tier1potion.calcAlchemist2Levelup();
                        Level = Tier1potion.getLevel();
                        EXP = Tier1potion.getEXP();
                        System.out.println("You have made " + tier1pot + " tier 1 potions");
                        
                        CastiaProgram Tier2potion = new CastiaProgram(Level, EXP, tier2pot, "Tier2");
                        
                        Tier2potion.calcAlchemistExp();
                        Tier2potion.calcAlchemist2Levelup();
                        Level = Tier2potion.getLevel();
                        EXP = Tier2potion.getEXP();
                        System.out.println("You have made " + tier2pot + " tier 2 potions");
                        
                        System.out.println();
                        System.out.println("Job Stats:");
                        System.out.println("Level: " + Level);
                        System.out.println("EXP: " + EXP + " / " + (100 * Math.pow(1.15, Level - 1)));
                        System.out.println("This is assuming:");
                        System.out.println("Netherwart potions only contain netherwart");
                        System.out.println("Tier1 potions contain netherwart and a tier1 ingredient");
                        System.out.println("Tier2 potions contain netherwart, tier1 ingredient, and a tier2 ingredient");
                    }
                    else
                    {
                        System.out.println("That's not an appropriate choice");
                    }
                }
                else if((Continue == 'n') || (Continue == 'N'))
                {
                    Job = "Temp";
                }
                else
                {
                    System.out.println("That's not a valid answer");
                }
                System.out.println();
            }
            while(Job.equalsIgnoreCase("Q"))
            {
                IsJob = true;
                Keeprunning = false;
                break;
            }
            while(Job.equalsIgnoreCase("Help"))
            {
                IsJob = true;
                System.out.println();
                System.out.println("Current jobs:");
                System.out.println("Lumberjack, Miner, Builder, Digger, Farmer, Hunter, Blacksmith, Cook, and Alchemist");
                System.out.println("Type 'Q' to quit");
                break;
            }
            while(Job.equalsIgnoreCase("Temp"))
            {
                IsJob = true;
                break;
            }
            if (IsJob == false)
            {
                System.out.println("That is not a job");
            }
            IsJob = false;
            System.out.println();
        }
    }
}
