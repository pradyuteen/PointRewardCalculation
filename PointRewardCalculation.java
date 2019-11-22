public class PointRewardCalculation {
	
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		PointRewardCalculation pointRewards = new PointRewardCalculation();
		
		int rewardPoints = pointRewards.rewardCalculation(575);
		System.out.print(rewardPoints); 
	}
  
  public int rewardCalculation(int amount){
		int points = 0;
		int remainder = 0; 
		
		if(amount < 50) {
			points = 0;
		}
		else if (amount > 50 && amount < 100) {
			points = amount - 50;
		}
		else if (amount > 100) {
			points = amount - 100;
			
			if(amount%100 != 0 && amount%100 > 50) {
				remainder = amount%100;
				points = points + (remainder - 50);
			}
		}
		return points;
	}
}
