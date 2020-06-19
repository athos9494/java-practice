public class Main{
	//

	String [] face_val = {"A","2","3","4", "5”,\u201C6\u201D,\u201C7\u201C,\u201D8\u201C,\u201D9\u201C,\u201D10\u201C,\u201DJ\u201C,\u201DQ\u201C,\u201DK\u201C};
	String [] pattern_val = {"红桃","黑桃","梅花","方块"};
	public static void main(String[] args) {
		Card []cardArr = new Card[54];
		for (int index = 0;index <cardArr.length;index++)
		{

			for (int i = 0;p<pattern_val.length;p++)
			{
				for (int j= 0;f<face_val.length;f++)
				{
					Card card = new Card();
					card.setFace(face_val[f]);
					card.setPattern(pattern_val[p]);
					cardArr[index] = card;
				}
			}
		}
		Card bigJoker = new Card();
		bigJoker.setJoker("大王");

		Card smallJoker = new Card();
		smallJoker.setJoker("小王");

		cardArr[52] = bigJoker;
		cardArr[53] = smallJoker;
		//xipai

		for(int i = 0;i<cardArr.length;i++){
			int index = (int)(Math.random()*cardArr.length);
			Card temp = cardArr[index];
			cardArr[index] = card[i];
			card[i] = temp;
		}

		//fapai
		//创建三个对象保存牌组数据，只有对象才能保存数据
		Player lord = new Player();
		lord.setRole("地主");
		lord.setCards(new Card[20]);

		
		Player farmer1 = new Player();
		farmer1.setRole("农民");
		farmer1.setCards(new Card[17]);

		Player farmer2 = new Player();
		farmer2.setRole("农民");
		farmer2.setCards(new Card[17]);

		Player []playerArr = new Player[3];
		playerArr[0] = lord;
		playerArr[1] = farmer1;
		playerArr[2] = farmer2;

		//xianfa 51 zhang

		for (int i = 0;i < cardArr.length; i++)
		{
			for(int p = 0;p<playerArr.length;p++;i++)
			{
				Player player = playerArr[p];
				player.getCards[player.getLeft()] = cardArr[i];
				player.setLeft(++player.getLeft());

			}

		}

		System.out.pringln(Arrays.toString(playerArr[0].getCards()));
		System.out.pringln(Arrays.toString(playerArr[1].getCards()));
		System.out.pringln(Arrays.toString(playerArr[2].getCards()));




		//洗牌

		//发牌
	}
}