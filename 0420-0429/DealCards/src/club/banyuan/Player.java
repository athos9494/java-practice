package DealCards.src.club.banyuan;

class Player{
	private String role;//角色，两种角色
//发牌
	private Card[] cards;

	private int left;//标识手里有多少张牌
	// get set method;
	public String getRole(){
		return role;
	}
	public void setRole(String role){
		this.role = role;
	}
	public String getCards(){
		return cards;
	}
	public void setCards(Card[] cards){
		this.cards = cards;
	}
	public String getLeft(){
		return left;
	}
	public void setLeft(int left){
		this.left = left;
	}
}