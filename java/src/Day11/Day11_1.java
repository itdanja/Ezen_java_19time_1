package Day11;

class A{}	// �θ�Ŭ���� 
class B extends A{} // A�� B���� ���
class C extends A{} // A�� C���� ���

class D extends B{} // B�� D���� ��� 
class E extends C{} // C�� E���� ���

public class Day11_1 {
	public static void main(String[] args) {
		
		// p.332 ������
			// Ŭ������ �⺻�ڷ��� ó�� Ŭ������ȯ�� ����
			// ������� ���������� �پ��� ��ü�� �̿��ؼ� �پ��� ������
			// ��� : �θ�Ŭ���� ---> �ڽ�Ŭ����    extends
			// �ڽ� ---> �θ� ��ȯ
		
		// p.335 �ڵ� Ÿ�� ��ȯ
		
		B b = new B(); // A���� ��ӹ��� B ��ü 
		C c = new C(); // A���� ��ӹ��� C ��ü
		D d = new D(); // B���� ��ӹ��� D ��ü 
		E e = new E(); // C���� ��ӹ��� E ��ü
		
		A a1 = b; // �ڵ�Ÿ�� ��ȯ B->A ��ȯ
		A a2 = c; // C->A��ȯ
		A a3 = d; // D->A��ȯ
		A a4 = e; // E->A��ȯ
		
		B b1 = d; // D->B��ȯ
		C c1 = e; // E->C��ȯ 
		
		// B b3 = e; // x �θ� �ƴϱ⶧���� �Ұ��� 
		// C c2 = d; // x �θ� �ƴϱ⶧���� �Ұ��� 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
