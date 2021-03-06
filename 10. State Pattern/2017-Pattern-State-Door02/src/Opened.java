// 오히려 코딩해야하는 양은 늘어날 수 있음
public class Opened implements DoorState {
	private Door door;
    public Opened(Door door){
        this.door = door;
    }
	@Override
	public void open() {
		System.out.println("이미 열려 있음");
	}

	@Override
	public void close() {
		System.out.println("문이 닫힘");
		door.changeToClosedState();
	}

	@Override
	public void lock() {
		System.out.println("문이 열려 있어 잠글 수 없음");
	}

	@Override
	public void unlock() {
		System.out.println("문이 잠겨 있지 않음");
	}
}

//// DoorState가 abstract class일 때
//public class Opened extends DoorState {
//	private Door door;
//    public Opened(Door door){
//        this.door = door;
//    }
//	@Override
//	public void open() {
//		System.out.println("이미 열려 있음");
//	}
//
//	@Override
//	public void close() {
//		System.out.println("문이 닫힘");
//		door.changeToClosedState();
//	}
//
//	@Override
//	public void lock() {
//		System.out.println("문이 열려 있어 잠글 수 없음");
//	}
//
//	@Override
//	public void unlock() {
//		System.out.println("문이 잠겨 있지 않음");
//	}
//}