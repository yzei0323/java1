package day14.학생.최지태김보성;

public interface 최지태김보성_Mart {
	// 상품 추가하는 메서드
	void addItem(String name, int cnt, int price);

	// 상품 삭제하는 메서드
	void removeItem(String name, int cnt);

	// 상품 전체를 출력하는 메서드 (결제 방식을 받는다)
	void printItems(String pay);
}