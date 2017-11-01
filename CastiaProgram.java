
/**
 * Program based on bringing out how much exp and money you can get based on your level for all jobs
 * 
 * @author Lily Phu
 * @version October 26th, 2017
 */
public class CastiaProgram
{
    //Variables from Constructor
    private int Level, Target, Needed, Money, Eff, Amount;
    private double EXP, MaxEXP, EXPLeft, EXPPer, MoneyPer, TotalMoney = 0, Time = 0;
    private String Choice;
    
    //Miner Variables
    private int Stone;
    
    //Lumberjack Variables
    private int Wood;
    
    //Digger Variables
    private int Blocks;
    
    //Farmer Variables
    private int Crops;
    
    //Hunter Variables
    private int Kills;
    
    //Blacksmith Variables
    private int Made;
    private char Salvage;
    private int ore, Chestplates;
    
    //Builder Variables
    private int Buildingblocks;
    
    //Cook Variables
    private int Food;
    
    //Alchemist Variables
    private int Potions;
    
    CastiaProgram(int Level, int Target, double EXP, int Eff)
    {
        this.Level = Level;
        this.Target = Target;
        this.EXP = EXP;
        this.Eff = Eff;
    }
    
    CastiaProgram(int Level, int Target, double EXP, String Choice)
    {
        this.Level = Level;
        this.Target = Target;
        this.EXP = EXP;
        this.Choice = Choice;
    }
    
    CastiaProgram(int Level, double EXP, int ore, char Salvage, String Choice)
    {
        this.Level = Level;
        this.EXP = EXP;
        this.ore = ore;
        this.Salvage = Salvage;
        this.Choice = Choice;
    }
    
    CastiaProgram(int Level, double EXP, int Amount, String Choice)
    {
        this.Level = Level;
        this.EXP = EXP;
        this.Amount = Amount;
        this.Choice = Choice;
    }
    
    public void calcMinerExp()
    {
        MaxEXP = 100 * Math.pow(1.15, Level - 1);
        EXPLeft = MaxEXP - EXP;
        EXPPer = 0.16 * Math.pow(1.04, Level - 1);
        MoneyPer = 0.18 * Math.pow(1.04, Level - 1);
    }
    
    public void calcBuilderExp()
    {
        if (Choice.equalsIgnoreCase("Stone"))
        {
            MaxEXP = 100 * Math.pow(1.15, Level - 1);
            EXPLeft = MaxEXP - EXP;
            EXPPer = 0.78 * Math.pow(1.04, Level - 1);
            MoneyPer = 0.89 * Math.pow(1.04, Level - 1);
        }
        else if (Choice.equalsIgnoreCase("Wood"))
        {
            MaxEXP = 100 * Math.pow(1.15, Level - 1);
            EXPLeft = MaxEXP - EXP;
            EXPPer = 0.67 * Math.pow(1.04, Level - 1);
            MoneyPer = 0.88 * Math.pow(1.04, Level - 1);
        }
        else if (Choice.equalsIgnoreCase("Glass"))
        {
            MaxEXP = 100 * Math.pow(1.15, Level - 1);
            EXPLeft = MaxEXP - EXP;
            EXPPer = 1.00 * Math.pow(1.04, Level - 1);
            MoneyPer = 1.15 * Math.pow(1.04, Level - 1);
        }
        else
        {
            System.out.println("****Cannot find specified Block****");
        }
    }
    
    public void calcLumberjackExp()
    {
        MaxEXP = 100 * Math.pow(1.15, Level - 1);
        EXPLeft = MaxEXP - EXP;
        EXPPer = 0.22 * Math.pow(1.04, Level - 1);
        MoneyPer = 0.44 * Math.pow(1.04, Level - 1);
    }
    
    public void calcDiggerExp()
    {
        MaxEXP = 100 * Math.pow(1.15, Level - 1);
        EXPLeft = MaxEXP - EXP;
        EXPPer = 0.26 * Math.pow(1.04, Level - 1);
        MoneyPer = 0.3 * Math.pow(1.04, Level - 1);
    }
    
    public void calcFarmerExp()
    {
        if (Choice.equalsIgnoreCase("Wheat"))
        {
            MaxEXP = 100 * Math.pow(1.15, Level - 1);
            EXPLeft = MaxEXP - EXP;
            EXPPer = 0.31 * Math.pow(1.04, Level - 1);
            MoneyPer = 0.18 * Math.pow(1.04, Level - 1);
        }
        else if (Choice.equalsIgnoreCase("Potato"))
        {
            MaxEXP = 100 * Math.pow(1.15, Level - 1);
            EXPLeft = MaxEXP - EXP;
            EXPPer = 0.49 * Math.pow(1.04, Level - 1);
            MoneyPer = 0.12 * Math.pow(1.04, Level - 1);
        }
        else if (Choice.equalsIgnoreCase("Carrot"))
        {
            MaxEXP = 100 * Math.pow(1.15, Level - 1);
            EXPLeft = MaxEXP - EXP;
            EXPPer = 0.25 * Math.pow(1.04, Level - 1);
            MoneyPer = 0.31 * Math.pow(1.04, Level - 1);
        }
        else if (Choice.equalsIgnoreCase("Cane"))
        {
            MaxEXP = 100 * Math.pow(1.15, Level - 1);
            EXPLeft = MaxEXP - EXP;
            EXPPer = 0.39 * Math.pow(1.04, Level - 1);
            MoneyPer = 0.45 * Math.pow(1.04, Level - 1);
        }
        else
        {
            System.out.println("****Cannot find specified Crop****");
        }
    }
    
    public void calcHunterExp()
    {
        if (Choice.equalsIgnoreCase("Boss"))
        {
            MaxEXP = 100 * Math.pow(1.15, Level - 1);
            EXPLeft = MaxEXP - EXP;
            EXPPer = 828.38 * Math.pow(1.04, Level - 1);
            MoneyPer = 950 * Math.pow(1.04, Level - 1);
        }
        else if (Choice.equalsIgnoreCase("Regular"))
        {
            MaxEXP = 100 * Math.pow(1.15, Level - 1);
            EXPLeft = MaxEXP - EXP;
            EXPPer = 10.90 * Math.pow(1.04, Level - 1);
            MoneyPer = 12.50 * Math.pow(1.04, Level - 1);
        }
        else if (Choice.equalsIgnoreCase("Pigmen"))
        {
            MaxEXP = 100 * Math.pow(1.15, Level - 1);
            EXPLeft = MaxEXP - EXP;
            EXPPer = 4.80 * Math.pow(1.04, Level - 1);
            MoneyPer = 5.50 * Math.pow(1.04, Level - 1);
        }
        else
        {
            System.out.println("****Cannot find specified Mob****");
        }
    }
    
    public void calcBlacksmithExp()
    {
        if (Choice.equalsIgnoreCase("Diamond"))
        {
            MaxEXP = 100 * Math.pow(1.15, Level - 1);
            EXPLeft = MaxEXP - EXP;
            EXPPer = 17.15 * Math.pow(1.04, Level - 1);
            MoneyPer = 24.00 * Math.pow(1.04, Level - 1);
        }
        else if (Choice.equalsIgnoreCase("Iron"))
        {
            MaxEXP = 100 * Math.pow(1.15, Level - 1);
            EXPLeft = MaxEXP - EXP;
            EXPPer = 4.29 * Math.pow(1.04, Level - 1);
            MoneyPer = 6.00 * Math.pow(1.04, Level - 1);
        }
        else if (Choice.equalsIgnoreCase("Gold"))
        {
            MaxEXP = 100 * Math.pow(1.15, Level - 1);
            EXPLeft = MaxEXP - EXP;
            EXPPer = 2.35 * Math.pow(1.04, Level - 1);
            MoneyPer = 2.50 * Math.pow(1.04, Level - 1);
        }
        else if (Choice.equalsIgnoreCase("Iron Ore"))
        {
            MaxEXP = 100 * Math.pow(1.15, Level - 1);
            EXPLeft = MaxEXP - EXP;
            EXPPer = 1.75 * Math.pow(1.04, Level - 1);
            MoneyPer = 1.25 * Math.pow(1.04, Level - 1);
        }
        else
        {
            System.out.println("****Cannot find specified Ore****");
        }
    }
    
    public void calcCookExp()
    {
        if (Choice.equalsIgnoreCase("Bread"))
        {
            MaxEXP = 100 * Math.pow(1.15, Level - 1);
            EXPLeft = MaxEXP - EXP;
            EXPPer = 0.75 * Math.pow(1.04, Level - 1);
            MoneyPer = 1.43 * Math.pow(1.04, Level - 1);
        }
        else if (Choice.equalsIgnoreCase("GoldenApples"))
        {
            MaxEXP = 100 * Math.pow(1.15, Level - 1);
            EXPLeft = MaxEXP - EXP;
            EXPPer = 4.71 * Math.pow(1.04, Level - 1);
            MoneyPer = 11.50 * Math.pow(1.04, Level - 1);
        }
        else if (Choice.equalsIgnoreCase("Potatoes"))
        {
            MaxEXP = 100 * Math.pow(1.15, Level - 1);
            EXPLeft = MaxEXP - EXP;
            EXPPer = 0.16 * Math.pow(1.04, Level - 1);
            MoneyPer = 0.27 * Math.pow(1.04, Level - 1);
        }
        else
        {
            System.out.println("****Cannot find specified Food Choice****");
        }
    }
    
    public void calcAlchemistExp()
    {
        if (Choice.equalsIgnoreCase("Netherwart"))
        {
            MaxEXP = 100 * Math.pow(1.15, Level - 1);
            EXPLeft = MaxEXP - EXP;
            EXPPer = 9.06 * Math.pow(1.04, Level - 1);
            MoneyPer = 10.40 * Math.pow(1.04, Level - 1);
        }
        else if (Choice.equalsIgnoreCase("Tier1"))
        {
            MaxEXP = 100 * Math.pow(1.15, Level - 1);
            EXPLeft = MaxEXP - EXP;
            EXPPer = 22.09 * Math.pow(1.04, Level - 1);
            MoneyPer = 25.34 * Math.pow(1.04, Level - 1);
        }
        else if (Choice.equalsIgnoreCase("Tier2"))
        {
            MaxEXP = 100 * Math.pow(1.15, Level - 1);
            EXPLeft = MaxEXP - EXP;
            EXPPer = 38.24 * Math.pow(1.04, Level - 1);
            MoneyPer = 43.86 * Math.pow(1.04, Level - 1);
        }
        else
        {
            System.out.println("****Cannot find specified Potion****");
        }
    }
    
    public void calcChestplates()
    {
        Chestplates = 0;
        
        if(Salvage == 'y' || Salvage == 'Y')
        {
            while(ore >= 8)
            {
                int Remainder = ore % 8;
                ore = ore - Remainder;
                
                Chestplates = Chestplates + (ore / 8);
                ore = ore / 2;
                ore = ore + Remainder;
            }
        }
        if(Salvage == 'n' || Salvage == 'N')
        {
            while(ore >= 8)
            {
                int Remainder = ore % 8;
                ore = ore - Remainder;
                
                Chestplates = Chestplates + (ore / 8);
                ore = ore / 8;
                ore = ore + Remainder;
            }
        }
    }
    
    public void calcMinerLevelup()
    {
        while (Level < Target)
        {
            Needed = (int)(EXPLeft / EXPPer) + 1;
            TotalMoney += Needed * MoneyPer;
            
            EXP = EXP + (Needed * EXPPer);
            EXP = EXP - MaxEXP;
            
            Level++;
            
            calcMinerExp();
            Stone = Stone + Needed;
        }
    }
    
    public void calcBuilderLevelup()
    {
        while (Level < Target)
        {
            Needed = (int)(EXPLeft / EXPPer) + 1;
            TotalMoney += Needed * MoneyPer;
            
            EXP = EXP + (Needed * EXPPer);
            EXP = EXP - MaxEXP;
            
            Level++;
            
            calcBuilderExp();
            Buildingblocks = Buildingblocks + Needed;
        }
    }
    
    public void calcBuilder2Levelup()
    {
        while(Amount > 0)
        {
            Needed = (int)(EXPLeft / EXPPer) + 1;
            if(Needed <= Amount)
            {
                EXP = EXP + (Needed * EXPPer);
                EXP = EXP - MaxEXP;
                Level++;
                calcBuilderExp();
            }
            else
            {
                EXP = EXP + (ore * EXPPer);
                EXPLeft = MaxEXP - EXP;
                Amount = 0;
            }
        }
    }
    
    public void calcLumberjackLevelup()
    {
        while (Level < Target)
        {
            Needed = (int)(EXPLeft / EXPPer) + 1;
            TotalMoney += Needed * MoneyPer;
            
            EXP = EXP + (Needed * EXPPer);
            EXP = EXP - MaxEXP;
            
            Level++;
            
            calcLumberjackExp();
            Wood = Wood + Needed;
        }
    }
    
    public void calcDiggerLevelup()
    {
        while (Level < Target)
        {
            Needed = (int)(EXPLeft / EXPPer) + 1;
            TotalMoney += Needed * MoneyPer;
            
            EXP = EXP + (Needed * EXPPer);
            EXP = EXP - MaxEXP;
            
            Level++;
            
            calcDiggerExp();
            Blocks = Blocks + Needed;
        }
    }
    
    public void calcFarmerLevelup()
    {
        while (Level < Target)
        {
            Needed = (int)(EXPLeft / EXPPer) + 1;
            TotalMoney += Needed * MoneyPer;
            
            EXP = EXP + (Needed * EXPPer);
            EXP = EXP - MaxEXP;
            
            Level++;
            
            calcFarmerExp();
            Crops = Crops + Needed;
        }
    }
    
    public void calcHunterLevelup()
    {
        while (Level < Target)
        {
            Needed = (int)(EXPLeft / EXPPer) + 1;
            TotalMoney += Needed * MoneyPer;
            
            EXP = EXP + (Needed * EXPPer);
            EXP = EXP - MaxEXP;
            
            Level++;
            
            calcHunterExp();
            Kills = Kills + Needed;
        }
    }
    
    public void calcBlacksmithLevelup()
    {
        while (Level < Target)
        {
            Needed = (int)(EXPLeft / EXPPer) + 1;
            TotalMoney += Needed * MoneyPer;
            
            EXP = EXP + (Needed * EXPPer);
            EXP = EXP - MaxEXP;
            
            Level++;
            
            calcBlacksmithExp();
            Made = Made + Needed;
        }
    }
    
    public void calcBlacksmith2Levelup()
    {
        while(Chestplates > 0)
        {
            Needed = (int)(EXPLeft / EXPPer) + 1;
            if(Needed <= Chestplates)
            {
                EXP = EXP + (Needed * EXPPer);
                EXP = EXP - MaxEXP;
                Level++;
                calcBlacksmithExp();
                Chestplates = Chestplates - Needed;
            }
            else
            {
                EXP = EXP + (Chestplates * EXPPer);
                EXPLeft = MaxEXP - EXP;
                Chestplates = 0;
            }
        }
    }
    
    public void calcBlacksmith3Levelup()
    {
        while(ore > 0)
        {
            Needed = (int)(EXPLeft / EXPPer) + 1;
            if(Needed <= ore)
            {
                EXP = EXP + (Needed * EXPPer);
                EXP = EXP - MaxEXP;
                Level++;
                calcBlacksmithExp();
            }
            else
            {
                EXP = EXP + (ore * EXPPer);
                EXPLeft = MaxEXP - EXP;
                ore = 0;
            }
        }
    }
    
    public void calcCookLevelup()
    {
        while (Level < Target)
        {
            Needed = (int)(EXPLeft / EXPPer) + 1;
            TotalMoney += Needed * MoneyPer;
            
            EXP = EXP + (Needed * EXPPer);
            EXP = EXP - MaxEXP;
            
            Level++;
            
            calcCookExp();
            Food = Food + Needed;
        }
    }
    
    public void calcCook2Levelup()
    {
        while(Amount > 0)
        {
            Needed = (int)(EXPLeft / EXPPer) + 1;
            if(Needed <= Amount)
            {
                EXP = EXP + (Needed * EXPPer);
                EXP = EXP - MaxEXP;
                Level++;
                calcCookExp();
            }
            else
            {
                EXP = EXP + (ore * EXPPer);
                EXPLeft = MaxEXP - EXP;
                Amount = 0;
            }
        }
    }
    
    public void calcAlchemistLevelup()
    {
        while (Level < Target)
        {
            Needed = (int)(EXPLeft / EXPPer) + 1;
            TotalMoney += Needed * MoneyPer;
            
            EXP = EXP + (Needed * EXPPer);
            EXP = EXP - MaxEXP;
            
            Level++;
            
            calcAlchemistExp();
            Potions = Potions + Needed;
        }
    }
    
    public void calcAlchemist2Levelup()
    {
        while(Amount > 0)
        {
            Needed = (int)(EXPLeft / EXPPer) + 1;
            if(Needed <= Amount)
            {
                EXP = EXP + (Needed * EXPPer);
                EXP = EXP - MaxEXP;
                Level++;
                calcAlchemistExp();
            }
            else
            {
                EXP = EXP + (ore * EXPPer);
                EXPLeft = MaxEXP - EXP;
                Amount = 0;
            }
        }
    }
    
    public void calcMinerTime()
    {
        double MiningDamage = 8 + Math.pow(Eff, 2);
        if (Eff > 0)
        {
            MiningDamage++;
        }
        double Stonehealth = 45;
        Time = 0;
        while(Stonehealth > 0)
        {
            Time++;
            Stonehealth = Stonehealth - MiningDamage;
        }
        Time = Time * 0.05;
        if (Time == 0.05)
        {
            Time = 0.1;
        }
        Time = Time * Stone;
    }
    
    public void calcLumberjackTime()
    {
        double WoodcuttingDamage = 8 + Math.pow(Eff, 2);
        if (Eff > 0)
        {
            WoodcuttingDamage++;
        }
        double Woodhealth = 60;
        Time = 0;
        while(Woodhealth > 0)
        {
            Time++;
            Woodhealth = Woodhealth - WoodcuttingDamage;
        }
        Time = Time * 0.05;
        if (Time == 0.05)
        {
            Time = 0.1;
        }
        Time = Time * Wood;
    }
    
    public void calcDiggerTime()
    {
        double DiggerDamage = 8 + Math.pow(Eff, 2);
        if (Eff > 0)
        {
            DiggerDamage++;
        }
        double Blockhealth = 15;
        Time = 0;
        while(Blockhealth > 0)
        {
            Time++;
            Blockhealth = Blockhealth - DiggerDamage;
        }
        Time = Time * 0.05;
        if (Time == 0.05)
        {
            Time = 0.1;
        }
        Time = Time * Blocks;
    }
    
    public void calcFarmerTime()
    {
        Time = 0.1 * Crops;
    }
    
    public int getStone()
    {
        return Stone;
    }
    
    public int getBuild()
    {
        return Buildingblocks;
    }
    
    public int getWood()
    {
        return Wood;
    }
    
    public int getBlocks()
    {
        return Blocks;
    }
    
    public int getCrops()
    {
        return Crops;
    }
    
    public int getKills()
    {
        return Kills;
    }
    
    public int getMade()
    {
        return Made;
    }
    
    public int getChestplates()
    {
        return Chestplates;
    }
    
    public int getFood()
    {
        return Food;
    }
    
    public int getPotions()
    {
        return Potions;
    }
    
    public double getMoney()
    {
        return TotalMoney;
    }
    
    public double getTime()
    {
        return Time;
    }
    
    public double getEXP()
    {
        return EXP;
    }
    
    public int getLevel()
    {
        return Level;
    }
}
